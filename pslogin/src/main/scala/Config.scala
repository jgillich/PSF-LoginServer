package net.psforever.pslogin

import java.nio.file.Paths

import com.typesafe.config.{Config => TypesafeConfig}

import scala.concurrent.duration._
import net.psforever.packet.game.ServerType
import pureconfig.{ConfigConvert, ConfigSource}
import pureconfig.ConfigConvert.{viaNonEmptyStringOpt}
import enumeratum.values.{IntEnum, IntEnumEntry}
import pureconfig.generic.auto._ // intellij: this is not unused

import scala.reflect.ClassTag

object Config {
  // prog.home is defined when we are running from SBT pack
  val directory: String = System.getProperty("prog.home") match {
    case null =>
      Paths.get("config").toAbsolutePath().toString()
    case home =>
      Paths.get(home, "config").toAbsolutePath().toString()
  }

  implicit def enumeratumIntConfigConvert[A <: IntEnumEntry](implicit
      enum: IntEnum[A],
      ct: ClassTag[A]
  ): ConfigConvert[A] =
    viaNonEmptyStringOpt[A](
      v =>
        enum.values.toList.collectFirst {
          case (e: ServerType) if e.name == v => e.asInstanceOf[A]
        },
      _.value.toString
    )

  private val source = {
    val configFile = Paths.get(directory, "application.conf").toFile()
    if (configFile.exists)
      ConfigSource.file(configFile).withFallback(ConfigSource.defaultApplication)
    else
      ConfigSource.defaultApplication
  }

  val result = source.load[AppConfig]

  // Raw config object - prefer app when possible
  lazy val config: TypesafeConfig = source.config().toOption.get

  // Typed config object
  lazy val app: AppConfig = result.toOption.get
}

case class AppConfig(
    bind: String,
    public: String,
    login: LoginConfig,
    world: WorldConfig,
    admin: AdminConfig,
    database: DatabaseConfig,
    antiCheat: AntiCheatConfig,
    network: NetworkConfig,
    developer: DeveloperConfig,
    kamon: KamonConfig
)

case class LoginConfig(
    port: Int,
    createMissingAccounts: Boolean
)

case class WorldConfig(
    port: Int,
    serverName: String,
    serverType: ServerType
)

case class AdminConfig(
    port: Int,
    bind: String
)

case class DatabaseConfig(
    host: String,
    port: Int,
    username: String,
    password: String,
    database: String,
    sslmode: String
) {
  def toJdbc = s"jdbc:postgresql://${host}:${port}/${database}"
}

case class AntiCheatConfig(
    hitPositionDiscrepancyThreshold: Int
)

case class NetworkConfig(
    session: SessionConfig
)

case class SessionConfig(
    inboundGraceTime: Duration,
    outboundGraceTime: Duration
)

case class DeveloperConfig(
    netSim: NetSimConfig
)

case class NetSimConfig(
    enable: Boolean,
    loss: Double,
    delay: Duration,
    reorderChance: Double,
    reorderTime: Duration
)

case class KamonConfig(
    enable: Boolean
)
