// Copyright (c) 2017 PSForever
package net.psforever.objects.serverobject.terminals.implant

import net.psforever.objects.serverobject.hackable.Hackable
import net.psforever.objects.serverobject.mount.{Mountable, Seat}
import net.psforever.objects.serverobject.structures.Amenity
import net.psforever.objects.serverobject.terminals.capture.CaptureTerminalAware
import net.psforever.packet.game.TriggeredSound
import net.psforever.types.Vector3

/**
  * A structure-owned server object that is the visible and `Mountable` component of an implant terminal.
  * For the most part, it merely implements the support data structures indicated by `Mountable`.
  * @param idef the `ObjectDefinition` that constructs this object and maintains some of its immutable fields
  */
class ImplantTerminalMech(private val idef: ImplantTerminalMechDefinition)
    extends Amenity
    with Mountable
    with Hackable
    with CaptureTerminalAware {
  seats = Map(0 -> new Seat(idef.Seats.head._2))

  HackSound = TriggeredSound.HackTerminal
  HackEffectDuration = Array(0, 30, 60, 90)
  HackDuration = Array(0, 10, 5, 3)

  def Definition: ImplantTerminalMechDefinition = idef
}

object ImplantTerminalMech {

  /**
    * Overloaded constructor.
    * @param idef the `ObjectDefinition` that constructs this object and maintains some of its immutable fields
    */
  def apply(idef: ImplantTerminalMechDefinition): ImplantTerminalMech = {
    new ImplantTerminalMech(idef)
  }

  import akka.actor.ActorContext

  /**
    * Instantiate an configure a `ImplantTerminalMech` object
    * @param pos the position of the entity
    * @param id the unique id that will be assigned to this entity
    * @param context a context to allow the object to properly set up `ActorSystem` functionality
    * @return the `ImplantTerminalMech` object
    */
  def Constructor(pos: Vector3)(id: Int, context: ActorContext): ImplantTerminalMech = {
    import akka.actor.Props
    import net.psforever.objects.GlobalDefinitions

    val obj = ImplantTerminalMech(GlobalDefinitions.implant_terminal_mech)
    obj.Position = pos
    obj.Actor = context.actorOf(
      Props(classOf[ImplantTerminalMechControl], obj),
      s"${GlobalDefinitions.implant_terminal_mech.Name}_$id"
    )
    obj
  }
  @deprecated("use implant terminal mechs that have position", "destroyAndRepair")
  def Constructor(id: Int, context: ActorContext): ImplantTerminalMech = {
    import akka.actor.Props
    import net.psforever.objects.GlobalDefinitions

    val obj = ImplantTerminalMech(GlobalDefinitions.implant_terminal_mech)
    obj.Actor = context.actorOf(
      Props(classOf[ImplantTerminalMechControl], obj),
      s"${GlobalDefinitions.implant_terminal_mech.Name}_$id"
    )
    obj
  }
}
