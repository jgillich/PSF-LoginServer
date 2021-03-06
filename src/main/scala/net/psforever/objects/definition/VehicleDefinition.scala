// Copyright (c) 2017 PSForever
package net.psforever.objects.definition

import net.psforever.objects.NtuContainerDefinition
import net.psforever.objects.definition.converter.VehicleConverter
import net.psforever.objects.inventory.InventoryTile
import net.psforever.objects.vehicles.{DestroyedVehicle, MountableWeaponsDefinition, UtilityType}
import net.psforever.objects.vital._
import net.psforever.objects.vital.damage.DamageCalculations
import net.psforever.objects.vital.resistance.ResistanceProfileMutators
import net.psforever.objects.vital.resolution.DamageResistanceModel
import net.psforever.types.Vector3

import scala.collection.mutable
import scala.concurrent.duration._

/**
  * An object definition system used to construct and retain the parameters of various vehicles.
  * @param objectId the object id that is associated with this sort of `Vehicle`
  */
class VehicleDefinition(objectId: Int)
    extends ObjectDefinition(objectId)
    with MountableWeaponsDefinition
    with VitalityDefinition
    with NtuContainerDefinition
    with ResistanceProfileMutators
    with DamageResistanceModel {
  /** vehicle shields offered through amp station facility benefits (generally: 20% of health + 1) */
  private var maxShields: Int = 0
  private val cargo: mutable.HashMap[Int, CargoDefinition] = mutable.HashMap[Int, CargoDefinition]()
  private var deployment: Boolean                                = false
  private val utilities: mutable.HashMap[Int, UtilityType.Value] = mutable.HashMap()
  private val utilityOffsets: mutable.HashMap[Int, Vector3]      = mutable.HashMap()
  private var deploymentTime_Deploy: Int                         = 0 //ms
  private var deploymentTime_Undeploy: Int                       = 0 //ms
  private var trunkSize: InventoryTile                           = InventoryTile.None
  private var trunkOffset: Int                                   = 0
  /* The position offset of the trunk, orientation as East = 0 */
  private var trunkLocation: Vector3                         = Vector3.Zero
  private var canCloak: Boolean                              = false
  private var canFly: Boolean                                = false
  /** whether the vehicle gains and/or maintains ownership based on access to the driver seat<br>
    * `Some(true)` - assign ownership upon the driver mount, maintains ownership after the driver dismounts<br>
    * `Some(false)` - assign ownership upon the driver mount, becomes unowned after the driver dismounts<br>
    * `None` - does not assign ownership<br>
    * Be cautious about using `None` as the client tends to equate the driver seat as the owner's seat for many vehicles
    * and breaking from the client's convention either requires additional fields or just doesn't work.
    */
  private var canBeOwned: Option[Boolean]                    = Some(true)
  private var serverVehicleOverrideSpeeds: (Int, Int)        = (0, 0)
  var undergoesDecay: Boolean                                = true
  private var deconTime: Option[FiniteDuration]              = None
  private var maxCapacitor: Int                              = 0
  private var destroyedModel: Option[DestroyedVehicle.Value] = None
  Name = "vehicle"
  Packet = VehicleDefinition.converter
  DamageUsing = DamageCalculations.AgainstVehicle
  ResistUsing = StandardVehicleResistance
  Model = VehicleResolutions.calculate
  RepairDistance = 10
  RepairRestoresAt = 1

  def MaxShields: Int = maxShields

  def MaxShields_=(shields: Int): Int = {
    maxShields = shields
    MaxShields
  }

  def Cargo: mutable.HashMap[Int, CargoDefinition] = cargo

  def CanBeOwned: Option[Boolean] = canBeOwned

  def CanBeOwned_=(ownable: Boolean): Option[Boolean] = CanBeOwned_=(Some(ownable))

  def CanBeOwned_=(ownable: Option[Boolean]): Option[Boolean] = {
    canBeOwned = ownable
    CanBeOwned
  }

  def CanCloak: Boolean = canCloak

  def CanCloak_=(cloakable: Boolean): Boolean = {
    canCloak = cloakable
    CanCloak
  }

  def CanFly: Boolean = canFly

  def CanFly_=(flying: Boolean): Boolean = {
    canFly = flying
    CanFly
  }

  def Deployment: Boolean = deployment

  def Deployment_=(deployable: Boolean): Boolean = {
    deployment = deployable
    Deployment
  }

  def Utilities: mutable.HashMap[Int, UtilityType.Value] = utilities

  def UtilityOffset: mutable.HashMap[Int, Vector3] = utilityOffsets

  def DeployTime: Int = deploymentTime_Deploy

  def DeployTime_=(dtime: Int): Int = {
    deploymentTime_Deploy = dtime
    DeployTime
  }

  def DeconstructionTime: Option[FiniteDuration] = deconTime

  def DeconstructionTime_=(time: FiniteDuration): Option[FiniteDuration] = {
    deconTime_=(Some(time))
    DeconstructionTime
  }

  def DeconstructionTime_=(time: Option[FiniteDuration]): Option[FiniteDuration] = {
    deconTime = time
    DeconstructionTime
  }

  def UndeployTime: Int = deploymentTime_Undeploy

  def UndeployTime_=(dtime: Int): Int = {
    deploymentTime_Undeploy = dtime
    UndeployTime
  }

  def TrunkSize: InventoryTile = trunkSize

  def TrunkSize_=(tile: InventoryTile): InventoryTile = {
    trunkSize = tile
    TrunkSize
  }

  def TrunkOffset: Int = trunkOffset

  def TrunkOffset_=(offset: Int): Int = {
    trunkOffset = offset
    TrunkOffset
  }

  def TrunkLocation: Vector3 = trunkLocation

  def TrunkLocation_=(location: Vector3): Vector3 = {
    trunkLocation = location
    TrunkLocation
  }

  def AutoPilotSpeeds: (Int, Int) = serverVehicleOverrideSpeeds

  def AutoPilotSpeeds_=(speeds: (Int, Int)): (Int, Int) = {
    serverVehicleOverrideSpeeds = speeds
    AutoPilotSpeeds
  }

  def AutoPilotSpeed1: Int = serverVehicleOverrideSpeeds._1

  def AutoPilotSpeed2: Int = serverVehicleOverrideSpeeds._2

  def MaxCapacitor : Int = maxCapacitor

  def MaxCapacitor_=(max: Int) : Int = {
    maxCapacitor = max
    MaxCapacitor
  }

  private var jackDuration        = Array(0, 0, 0, 0)
  def JackingDuration: Array[Int] = jackDuration
  def JackingDuration_=(arr: Array[Int]): Array[Int] = {
    jackDuration = arr
    arr
  }

  def DestroyedModel: Option[DestroyedVehicle.Value] = destroyedModel

  def DestroyedModel_=(model: Option[DestroyedVehicle.Value]): Option[DestroyedVehicle.Value] = {
    destroyedModel = model
    DestroyedModel
  }
}

object VehicleDefinition {
  private val converter = new VehicleConverter

  def apply(objectId: Int): VehicleDefinition = {
    new VehicleDefinition(objectId)
  }
}
