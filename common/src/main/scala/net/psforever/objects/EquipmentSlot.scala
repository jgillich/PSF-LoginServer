// Copyright (c) 2017 PSForever
package net.psforever.objects

import net.psforever.objects.equipment.{Equipment, EquipmentSize}

/**
  * A size-checked unit of storage (or mounting) for `Equipment`.
  * Unlike inventory space, anything placed in "slot" space is expected to be visible to the game world in some fashion.
  */
class EquipmentSlot {
  private var size : EquipmentSize.Value = EquipmentSize.Blocked
  private var tool : Option[Equipment] = None
  //TODO eventually move this object from storing the item directly to just storing its GUID?

  def Size : EquipmentSize.Value = size

  def Size_=(assignSize : EquipmentSize.Value) : EquipmentSize.Value = {
    if(tool.isEmpty) {
      size = assignSize
    }
    Size
  }

  def Equipment : Option[Equipment] = tool

  def Equipment_=(assignEquipment : Equipment) : Option[Equipment] = {
    Equipment = Some(assignEquipment)
  }

  def Equipment_=(assignEquipment : Option[Equipment]) : Option[Equipment] = {
    if(assignEquipment.isDefined) { //if new equipment is defined, don't put it in the slot if the slot is being used
      if(tool.isEmpty && EquipmentSize.isEqual(size, assignEquipment.get.Size)) {
        tool = assignEquipment
      }
    }
    else {
      tool = None
    }
    Equipment
  }
}

object EquipmentSlot {
  def apply() : EquipmentSlot = {
    new EquipmentSlot()
  }

  def apply(size : EquipmentSize.Value) : EquipmentSlot = {
    val slot = new EquipmentSlot()
    slot.Size = size
    slot
  }
}
