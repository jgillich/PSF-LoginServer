// Copyright (c) 2017 PSForever
import net.psforever.objects.LocalProjectile
import net.psforever.objects.ballistics.Projectile
import net.psforever.objects.zones.ZoneMap
import zonemaps._

import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

object Maps {
  import scala.concurrent.ExecutionContext.Implicits.global

  /*
  val map1f = Future { Map01.ZoneMap }
  val map2f = Future { Map02.ZoneMap }
  val map3f = Future { Map03.ZoneMap }
  val map4f = Future { Map04.ZoneMap }
  val map5f = Future { Map05.ZoneMap }
  val map6f = Future { Map06.ZoneMap }
  val map7f = Future { Map07.ZoneMap }
  val map8f = Future { Map08.ZoneMap }
  val map9f = Future { Map09.ZoneMap }
  val map10f = Future { Map10.ZoneMap }
  val map11f = Future { Map11.ZoneMap }
  val map12f = Future { Map12.ZoneMap }
  val map13f = Future { Map13.ZoneMap }
  val ugd01f = Future { Ugd01.ZoneMap }
  val ugd02f = Future { Ugd02.ZoneMap }
  val ugd03f = Future { Ugd03.ZoneMap }
  val ugd04f = Future { Ugd04.ZoneMap }
  val ugd05f = Future { Ugd05.ZoneMap }
  val ugd06f = Future { Ugd06.ZoneMap }
  val map96f = Future { Map96.ZoneMap }
  val map97f = Future { Map97.ZoneMap }
  val map98f = Future { Map98.ZoneMap }
  val map99f = Future { Map99.ZoneMap }
*/

  val map1 = Map01.ZoneMap //Await.result(map1f, 30 seconds)
  val map2 = Map02.ZoneMap //Await.result(map2f, 30 seconds)
  val map3 = Map03.ZoneMap //Await.result(map3f, 30 seconds)
  val map4 = Map04.ZoneMap //Await.result(map4f, 30 seconds)
  val map5 = Map05.ZoneMap //Await.result(map5f, 30 seconds)
  val map6 = Map06.ZoneMap //Await.result(map6f, 30 seconds)
  val map7 = Map07.ZoneMap //Await.result(map7f, 30 seconds)
  val map8 = Map08.ZoneMap //Await.result(map8f, 30 seconds)
  val map9 = Map09.ZoneMap //Await.result(map9f, 30 seconds)
  val map10 = Map10.ZoneMap //Await.result(map10f, 30 seconds)
  val map11 = Map11.ZoneMap //Await.result(map11f, 30 seconds)
  val map12 = Map12.ZoneMap //Await.result(map12f, 30 seconds)
  val map13 = Map13.ZoneMap //Await.result(map13f, 30 seconds)

  Projectiles(map1)
  Projectiles(map2)
  Projectiles(map3)
  Projectiles(map4)
  Projectiles(map5)
  Projectiles(map6)
  Projectiles(map7)
  Projectiles(map8)
  Projectiles(map9)
  Projectiles(map10)
  Projectiles(map11)
  Projectiles(map12)
  Projectiles(map13)

  val map14 = new ZoneMap("map14") {
    Projectiles(this)
  }

  val map15 = new ZoneMap("map15") {
    Projectiles(this)
  }

  val map16 = new ZoneMap("map16") {
    Projectiles(this)
  }

  val ugd01 = Ugd01.ZoneMap //Await.result(ugd01f, 30 seconds)
  val ugd02 = Ugd02.ZoneMap //Await.result(ugd02f, 30 seconds)
  val ugd03 = Ugd03.ZoneMap //Await.result(ugd03f, 30 seconds)
  val ugd04 = Ugd04.ZoneMap //Await.result(ugd04f, 30 seconds)
  val ugd05 = Ugd05.ZoneMap //Await.result(ugd05f, 30 seconds)
  val ugd06 = Ugd06.ZoneMap //Await.result(ugd06f, 30 seconds)

  Projectiles(ugd01)
  Projectiles(ugd02)
  Projectiles(ugd03)
  Projectiles(ugd04)
  Projectiles(ugd05)
  Projectiles(ugd06)

  val map96 = Map96.ZoneMap //Await.result(map96f, 30 seconds)
  val map97 = Map97.ZoneMap //Await.result(map97f, 30 seconds)
  val map98 = Map98.ZoneMap //Await.result(map98f, 30 seconds)
  val map99 = Map99.ZoneMap //Await.result(map99f, 30 seconds)

  Projectiles(map96)
  Projectiles(map97)
  Projectiles(map98)
  Projectiles(map99)

  def Projectiles(zmap: ZoneMap): Unit = {
    (Projectile.BaseUID until Projectile.RangeUID) foreach {
      zmap.LocalObject(_, LocalProjectile.Constructor)
    }
  }
}
