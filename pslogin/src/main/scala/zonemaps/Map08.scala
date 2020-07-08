package net.psforever.pslogin.zonemaps

import net.psforever.objects.GlobalDefinitions._
import net.psforever.objects.serverobject.doors.Door
import net.psforever.objects.serverobject.generator.Generator
import net.psforever.objects.serverobject.implantmech.ImplantTerminalMech
import net.psforever.objects.serverobject.locks.IFFLock
import net.psforever.objects.serverobject.mblocker.Locker
import net.psforever.objects.serverobject.pad.VehicleSpawnPad
import net.psforever.objects.serverobject.painbox.Painbox
import net.psforever.objects.serverobject.resourcesilo.ResourceSilo
import net.psforever.objects.serverobject.structures.{Building, FoundationBuilder, StructureType, WarpGate}
import net.psforever.objects.serverobject.terminals.{CaptureTerminal, ProximityTerminal, Terminal}
import net.psforever.objects.serverobject.tube.SpawnTube
import net.psforever.objects.serverobject.turret.FacilityTurret
import net.psforever.objects.zones.ZoneMap
import net.psforever.types.Vector3

object Map08 { // Oshur Prime
  val ZoneMap = new ZoneMap("map08") {
    Checksum = 0L

    Building10()

    def Building10(): Unit = { // Name: Mithra Type: amp_station GUID: 1, MapID: 10
      LocalBuilding(
        "Mithra",
        1,
        10,
        FoundationBuilder(
          Building.Structure(
            StructureType.Facility,
            Vector3(2556f, 4528f, 43.54625f),
            Vector3(0f, 0f, 179f),
            amp_station
          )
        )
      )
      LocalObject(
        158,
        CaptureTerminal.Constructor(Vector3(2559.335f, 4527.939f, 55.05425f), capture_terminal),
        owning_building_guid = 1
      )
      LocalObject(128, Door.Constructor(Vector3(2555.667f, 4521.2f, 56.44825f)), owning_building_guid = 1)
      LocalObject(129, Door.Constructor(Vector3(2555.908f, 4534.808f, 56.44825f)), owning_building_guid = 1)
      LocalObject(247, Door.Constructor(Vector3(2496.583f, 4573.545f, 45.29725f)), owning_building_guid = 1)
      LocalObject(248, Door.Constructor(Vector3(2496.9f, 4591.734f, 53.26125f)), owning_building_guid = 1)
      LocalObject(249, Door.Constructor(Vector3(2521.78f, 4612.828f, 45.29725f)), owning_building_guid = 1)
      LocalObject(251, Door.Constructor(Vector3(2539.969f, 4612.511f, 53.26125f)), owning_building_guid = 1)
      LocalObject(252, Door.Constructor(Vector3(2550.716f, 4497.512f, 55.27325f)), owning_building_guid = 1)
      LocalObject(253, Door.Constructor(Vector3(2551.804f, 4558.653f, 55.27325f)), owning_building_guid = 1)
      LocalObject(254, Door.Constructor(Vector3(2555.38f, 4492.504f, 50.26725f)), owning_building_guid = 1)
      LocalObject(255, Door.Constructor(Vector3(2556.62f, 4563.495f, 50.26725f)), owning_building_guid = 1)
      LocalObject(256, Door.Constructor(Vector3(2559.7f, 4435.735f, 53.26125f)), owning_building_guid = 1)
      LocalObject(257, Door.Constructor(Vector3(2559.776f, 4497.354f, 55.27325f)), owning_building_guid = 1)
      LocalObject(258, Door.Constructor(Vector3(2560.864f, 4558.496f, 55.27325f)), owning_building_guid = 1)
      LocalObject(259, Door.Constructor(Vector3(2577.89f, 4435.418f, 45.29725f)), owning_building_guid = 1)
      LocalObject(260, Door.Constructor(Vector3(2622.851f, 4462.922f, 53.26025f)), owning_building_guid = 1)
      LocalObject(261, Door.Constructor(Vector3(2623.169f, 4481.113f, 45.29725f)), owning_building_guid = 1)
      LocalObject(262, Door.Constructor(Vector3(2624.618f, 4564.115f, 53.26025f)), owning_building_guid = 1)
      LocalObject(263, Door.Constructor(Vector3(2624.935f, 4582.305f, 45.29725f)), owning_building_guid = 1)
      LocalObject(264, Door.Constructor(Vector3(2630.592f, 4446.686f, 45.26725f)), owning_building_guid = 1)
      LocalObject(486, Door.Constructor(Vector3(2535.933f, 4524.35f, 45.26725f)), owning_building_guid = 1)
      LocalObject(487, Door.Constructor(Vector3(2536.073f, 4532.349f, 45.26725f)), owning_building_guid = 1)
      LocalObject(488, Door.Constructor(Vector3(2555.324f, 4501.439f, 55.26725f)), owning_building_guid = 1)
      LocalObject(489, Door.Constructor(Vector3(2555.581f, 4504.003f, 50.26725f)), owning_building_guid = 1)
      LocalObject(490, Door.Constructor(Vector3(2555.93f, 4524f, 37.76725f)), owning_building_guid = 1)
      LocalObject(491, Door.Constructor(Vector3(2556.209f, 4539.998f, 30.26725f)), owning_building_guid = 1)
      LocalObject(492, Door.Constructor(Vector3(2556.252f, 4554.569f, 55.26725f)), owning_building_guid = 1)
      LocalObject(493, Door.Constructor(Vector3(2556.419f, 4551.997f, 50.26725f)), owning_building_guid = 1)
      LocalObject(494, Door.Constructor(Vector3(2559.72f, 4511.933f, 30.26725f)), owning_building_guid = 1)
      LocalObject(495, Door.Constructor(Vector3(2563.51f, 4499.865f, 45.26725f)), owning_building_guid = 1)
      LocalObject(496, Door.Constructor(Vector3(2563.65f, 4507.863f, 37.76725f)), owning_building_guid = 1)
      LocalObject(497, Door.Constructor(Vector3(2564.488f, 4555.856f, 45.26725f)), owning_building_guid = 1)
      LocalObject(498, Door.Constructor(Vector3(2567.579f, 4503.794f, 45.26725f)), owning_building_guid = 1)
      LocalObject(499, Door.Constructor(Vector3(2567.859f, 4519.792f, 37.76725f)), owning_building_guid = 1)
      LocalObject(500, Door.Constructor(Vector3(2568.277f, 4543.788f, 30.26725f)), owning_building_guid = 1)
      LocalObject(501, Door.Constructor(Vector3(2568.277f, 4543.788f, 37.76725f)), owning_building_guid = 1)
      LocalObject(502, Door.Constructor(Vector3(2568.417f, 4551.787f, 45.26725f)), owning_building_guid = 1)
      LocalObject(503, Door.Constructor(Vector3(2583.577f, 4503.515f, 37.76725f)), owning_building_guid = 1)
      LocalObject(504, Door.Constructor(Vector3(2588.205f, 4539.439f, 30.26725f)), owning_building_guid = 1)
      LocalObject(505, Door.Constructor(Vector3(2599.993f, 4527.232f, 30.26725f)), owning_building_guid = 1)
      LocalObject(506, Door.Constructor(Vector3(2604.062f, 4531.162f, 30.26725f)), owning_building_guid = 1)
      LocalObject(507, Door.Constructor(Vector3(2627.5f, 4498.748f, 37.76725f)), owning_building_guid = 1)
      LocalObject(661, Door.Constructor(Vector3(2526.83f, 4528.483f, 46.02625f)), owning_building_guid = 1)
      LocalObject(2013, Door.Constructor(Vector3(2575.249f, 4523.348f, 38.10025f)), owning_building_guid = 1)
      LocalObject(2014, Door.Constructor(Vector3(2575.376f, 4530.636f, 38.10025f)), owning_building_guid = 1)
      LocalObject(2015, Door.Constructor(Vector3(2575.503f, 4537.928f, 38.10025f)), owning_building_guid = 1)
      LocalObject(
        697,
        IFFLock.Constructor(Vector3(2524.036f, 4525.492f, 45.22625f), Vector3(0, 0, 271)),
        owning_building_guid = 1,
        door_guid = 661
      )
      LocalObject(
        720,
        IFFLock.Constructor(Vector3(2549.889f, 4495.469f, 55.20725f), Vector3(0, 0, 271)),
        owning_building_guid = 1,
        door_guid = 252
      )
      LocalObject(
        721,
        IFFLock.Constructor(Vector3(2550.956f, 4556.601f, 55.20725f), Vector3(0, 0, 271)),
        owning_building_guid = 1,
        door_guid = 253
      )
      LocalObject(
        722,
        IFFLock.Constructor(Vector3(2554.592f, 4564.33f, 50.20825f), Vector3(0, 0, 1)),
        owning_building_guid = 1,
        door_guid = 255
      )
      LocalObject(
        723,
        IFFLock.Constructor(Vector3(2557.177f, 4541.554f, 30.08225f), Vector3(0, 0, 91)),
        owning_building_guid = 1,
        door_guid = 491
      )
      LocalObject(
        724,
        IFFLock.Constructor(Vector3(2557.41f, 4491.649f, 50.20825f), Vector3(0, 0, 181)),
        owning_building_guid = 1,
        door_guid = 254
      )
      LocalObject(
        725,
        IFFLock.Constructor(Vector3(2560.645f, 4499.375f, 55.20725f), Vector3(0, 0, 91)),
        owning_building_guid = 1,
        door_guid = 257
      )
      LocalObject(
        726,
        IFFLock.Constructor(Vector3(2561.712f, 4560.502f, 55.20725f), Vector3(0, 0, 91)),
        owning_building_guid = 1,
        door_guid = 258
      )
      LocalObject(
        727,
        IFFLock.Constructor(Vector3(2566.72f, 4544.625f, 37.58225f), Vector3(0, 0, 1)),
        owning_building_guid = 1,
        door_guid = 501
      )
      LocalObject(
        728,
        IFFLock.Constructor(Vector3(2569.414f, 4518.824f, 37.58225f), Vector3(0, 0, 181)),
        owning_building_guid = 1,
        door_guid = 499
      )
      LocalObject(
        729,
        IFFLock.Constructor(Vector3(2603.225f, 4529.604f, 30.08225f), Vector3(0, 0, 271)),
        owning_building_guid = 1,
        door_guid = 506
      )
      LocalObject(
        730,
        IFFLock.Constructor(Vector3(2632.622f, 4445.824f, 45.20625f), Vector3(0, 0, 181)),
        owning_building_guid = 1,
        door_guid = 264
      )
      LocalObject(908, Locker.Constructor(Vector3(2541.167f, 4522.093f, 28.74625f)), owning_building_guid = 1)
      LocalObject(909, Locker.Constructor(Vector3(2542.503f, 4522.07f, 28.74625f)), owning_building_guid = 1)
      LocalObject(910, Locker.Constructor(Vector3(2543.839f, 4522.046f, 28.74625f)), owning_building_guid = 1)
      LocalObject(911, Locker.Constructor(Vector3(2545.163f, 4522.023f, 28.74625f)), owning_building_guid = 1)
      LocalObject(912, Locker.Constructor(Vector3(2549.702f, 4521.944f, 28.74625f)), owning_building_guid = 1)
      LocalObject(913, Locker.Constructor(Vector3(2551.039f, 4521.92f, 28.74625f)), owning_building_guid = 1)
      LocalObject(914, Locker.Constructor(Vector3(2552.375f, 4521.897f, 28.74625f)), owning_building_guid = 1)
      LocalObject(915, Locker.Constructor(Vector3(2553.699f, 4521.874f, 28.74625f)), owning_building_guid = 1)
      LocalObject(916, Locker.Constructor(Vector3(2561.218f, 4541.77f, 36.50725f)), owning_building_guid = 1)
      LocalObject(917, Locker.Constructor(Vector3(2562.367f, 4541.75f, 36.50725f)), owning_building_guid = 1)
      LocalObject(918, Locker.Constructor(Vector3(2563.514f, 4541.73f, 36.50725f)), owning_building_guid = 1)
      LocalObject(919, Locker.Constructor(Vector3(2564.677f, 4541.709f, 36.50725f)), owning_building_guid = 1)
      LocalObject(
        1344,
        Terminal.Constructor(Vector3(2555.61f, 4505.526f, 45.07525f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        1345,
        Terminal.Constructor(Vector3(2556.394f, 4550.474f, 45.07525f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        1346,
        Terminal.Constructor(Vector3(2561.364f, 4528.979f, 37.83625f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        1347,
        Terminal.Constructor(Vector3(2561.43f, 4532.767f, 37.83625f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        1348,
        Terminal.Constructor(Vector3(2561.495f, 4536.498f, 37.83625f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        1349,
        Terminal.Constructor(Vector3(2578.464f, 4527.612f, 45.07525f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        1952,
        Terminal.Constructor(Vector3(2561.582f, 4532.403f, 50.27425f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        1953,
        Terminal.Constructor(Vector3(2574.995f, 4525.845f, 38.38025f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        1954,
        Terminal.Constructor(Vector3(2575.125f, 4533.132f, 38.38025f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        1955,
        Terminal.Constructor(Vector3(2575.249f, 4540.423f, 38.38025f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        1956,
        Terminal.Constructor(Vector3(2579.669f, 4512.175f, 30.30325f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        1957,
        Terminal.Constructor(Vector3(2603.247f, 4487.76f, 37.80325f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        2132,
        Terminal.Constructor(Vector3(2602.478f, 4444.703f, 45.64825f), vehicle_terminal_combined),
        owning_building_guid = 1
      )
      LocalObject(
        1310,
        VehicleSpawnPad.Constructor(Vector3(2602.626f, 4458.341f, 41.49125f), mb_pad_creation, Vector3(0, 0, 1)),
        owning_building_guid = 1,
        terminal_guid = 2132
      )
      LocalObject(1847, ResourceSilo.Constructor(Vector3(2504.855f, 4614.401f, 50.78125f)), owning_building_guid = 1)
      LocalObject(
        1860,
        SpawnTube.Constructor(Vector3(2575.707f, 4524.394f, 36.24625f), Vector3(0, 0, 181)),
        owning_building_guid = 1
      )
      LocalObject(
        1861,
        SpawnTube.Constructor(Vector3(2575.834f, 4531.68f, 36.24625f), Vector3(0, 0, 181)),
        owning_building_guid = 1
      )
      LocalObject(
        1862,
        SpawnTube.Constructor(Vector3(2575.961f, 4538.97f, 36.24625f), Vector3(0, 0, 181)),
        owning_building_guid = 1
      )
      LocalObject(
        1324,
        ProximityTerminal.Constructor(Vector3(2547.459f, 4522.528f, 28.74625f), medical_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        1325,
        ProximityTerminal.Constructor(Vector3(2578.045f, 4527.621f, 48.74625f), medical_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        1516,
        ProximityTerminal.Constructor(Vector3(2506.979f, 4548.692f, 52.05125f), pad_landing_frame),
        owning_building_guid = 1
      )
      LocalObject(
        1517,
        Terminal.Constructor(Vector3(2506.979f, 4548.692f, 52.05125f), air_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        1519,
        ProximityTerminal.Constructor(Vector3(2528.405f, 4471.061f, 54.21225f), pad_landing_frame),
        owning_building_guid = 1
      )
      LocalObject(
        1520,
        Terminal.Constructor(Vector3(2528.405f, 4471.061f, 54.21225f), air_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        1522,
        ProximityTerminal.Constructor(Vector3(2548.986f, 4601.628f, 52.07425f), pad_landing_frame),
        owning_building_guid = 1
      )
      LocalObject(
        1523,
        Terminal.Constructor(Vector3(2548.986f, 4601.628f, 52.07425f), air_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        1525,
        ProximityTerminal.Constructor(Vector3(2612.894f, 4507.233f, 52.05125f), pad_landing_frame),
        owning_building_guid = 1
      )
      LocalObject(
        1526,
        Terminal.Constructor(Vector3(2612.894f, 4507.233f, 52.05125f), air_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        1782,
        ProximityTerminal.Constructor(Vector3(2493.678f, 4528.694f, 42.94625f), repair_silo),
        owning_building_guid = 1
      )
      LocalObject(
        1783,
        Terminal.Constructor(Vector3(2493.678f, 4528.694f, 42.94625f), ground_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        1786,
        ProximityTerminal.Constructor(Vector3(2626.082f, 4526.573f, 42.94625f), repair_silo),
        owning_building_guid = 1
      )
      LocalObject(
        1787,
        Terminal.Constructor(Vector3(2626.082f, 4526.573f, 42.94625f), ground_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        1232,
        FacilityTurret.Constructor(Vector3(2480.226f, 4487.869f, 52.25425f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(1232, 5000)
      LocalObject(
        1233,
        FacilityTurret.Constructor(Vector3(2481.338f, 4424.458f, 52.25425f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(1233, 5001)
      LocalObject(
        1234,
        FacilityTurret.Constructor(Vector3(2484.866f, 4626.104f, 52.25425f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(1234, 5002)
      LocalObject(
        1235,
        FacilityTurret.Constructor(Vector3(2578.734f, 4626.684f, 52.25425f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(1235, 5003)
      LocalObject(
        1236,
        FacilityTurret.Constructor(Vector3(2634.782f, 4421.77f, 52.25425f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(1236, 5004)
      LocalObject(
        1237,
        FacilityTurret.Constructor(Vector3(2638.273f, 4623.417f, 52.25425f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(1237, 5005)
      LocalObject(1658, Painbox.Constructor(Vector3(2615.96f, 4533.837f, 33.61725f), painbox), owning_building_guid = 1)
      LocalObject(
        1667,
        Painbox.Constructor(Vector3(2568.418f, 4529.197f, 41.19465f), painbox_continuous),
        owning_building_guid = 1
      )
      LocalObject(
        1676,
        Painbox.Constructor(Vector3(2601.881f, 4531.956f, 30.20525f), painbox_door_radius),
        owning_building_guid = 1
      )
      LocalObject(
        1687,
        Painbox.Constructor(Vector3(2554.464f, 4524.069f, 39.42485f), painbox_door_radius_continuous),
        owning_building_guid = 1
      )
      LocalObject(
        1688,
        Painbox.Constructor(Vector3(2567.762f, 4518.509f, 37.51075f), painbox_door_radius_continuous),
        owning_building_guid = 1
      )
      LocalObject(
        1689,
        Painbox.Constructor(Vector3(2568.295f, 4544.852f, 37.44625f), painbox_door_radius_continuous),
        owning_building_guid = 1
      )
      LocalObject(220, Generator.Constructor(Vector3(2619.615f, 4530.915f, 27.45225f)), owning_building_guid = 1)
      LocalObject(
        211,
        Terminal.Constructor(Vector3(2611.424f, 4531.011f, 28.74625f), gen_control),
        owning_building_guid = 1
      )
    }

    Building36()

    def Building36(): Unit = { // Name: bunker_gauntlet Type: bunker_gauntlet GUID: 4, MapID: 36
      LocalBuilding(
        "bunker_gauntlet",
        4,
        36,
        FoundationBuilder(
          Building.Structure(
            StructureType.Bunker,
            Vector3(2512f, 4400f, 43.54625f),
            Vector3(0f, 0f, 180f),
            bunker_gauntlet
          )
        )
      )
      LocalObject(246, Door.Constructor(Vector3(2487.077f, 4401.901f, 45.06725f)), owning_building_guid = 4)
      LocalObject(250, Door.Constructor(Vector3(2536.898f, 4401.912f, 45.06725f)), owning_building_guid = 4)
    }

    Building35()

    def Building35(): Unit = { // Name: bunker_gauntlet Type: bunker_gauntlet GUID: 5, MapID: 35
      LocalBuilding(
        "bunker_gauntlet",
        5,
        35,
        FoundationBuilder(
          Building.Structure(
            StructureType.Bunker,
            Vector3(3690f, 2828f, 47.2434f),
            Vector3(0f, 0f, 270f),
            bunker_gauntlet
          )
        )
      )
      LocalObject(324, Door.Constructor(Vector3(3688.099f, 2803.077f, 48.7644f)), owning_building_guid = 5)
      LocalObject(325, Door.Constructor(Vector3(3688.088f, 2852.898f, 48.7644f)), owning_building_guid = 5)
    }

    Building37()

    def Building37(): Unit = { // Name: bunker_gauntlet Type: bunker_gauntlet GUID: 6, MapID: 37
      LocalBuilding(
        "bunker_gauntlet",
        6,
        37,
        FoundationBuilder(
          Building.Structure(
            StructureType.Bunker,
            Vector3(3920f, 4790f, 48.64008f),
            Vector3(0f, 0f, 360f),
            bunker_gauntlet
          )
        )
      )
      LocalObject(339, Door.Constructor(Vector3(3895.102f, 4788.088f, 50.16108f)), owning_building_guid = 6)
      LocalObject(349, Door.Constructor(Vector3(3944.923f, 4788.099f, 50.16108f)), owning_building_guid = 6)
    }

    Building38()

    def Building38(): Unit = { // Name: bunker_gauntlet Type: bunker_gauntlet GUID: 7, MapID: 38
      LocalBuilding(
        "bunker_gauntlet",
        7,
        38,
        FoundationBuilder(
          Building.Structure(
            StructureType.Bunker,
            Vector3(5646f, 3830f, 50.48064f),
            Vector3(0f, 0f, 225f),
            bunker_gauntlet
          )
        )
      )
      LocalObject(449, Door.Constructor(Vector3(5627.033f, 3813.721f, 52.00164f)), owning_building_guid = 7)
      LocalObject(450, Door.Constructor(Vector3(5662.253f, 3848.958f, 52.00164f)), owning_building_guid = 7)
    }

    Building31()

    def Building31(): Unit = { // Name: bunker_lg Type: bunker_lg GUID: 8, MapID: 31
      LocalBuilding(
        "bunker_lg",
        8,
        31,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(2634f, 4650f, 43.54879f), Vector3(0f, 0f, 225f), bunker_lg)
        )
      )
      LocalObject(265, Door.Constructor(Vector3(2633.965f, 4646.349f, 45.06979f)), owning_building_guid = 8)
    }

    Building30()

    def Building30(): Unit = { // Name: bunker_lg Type: bunker_lg GUID: 9, MapID: 30
      LocalBuilding(
        "bunker_lg",
        9,
        30,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(4150f, 2192f, 50.98085f), Vector3(0f, 0f, 90f), bunker_lg)
        )
      )
      LocalObject(367, Door.Constructor(Vector3(4147.443f, 2194.606f, 52.50185f)), owning_building_guid = 9)
    }

    Building32()

    def Building32(): Unit = { // Name: bunker_lg Type: bunker_lg GUID: 10, MapID: 32
      LocalBuilding(
        "bunker_lg",
        10,
        32,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(4828f, 4020f, 60.46708f), Vector3(0f, 0f, 270f), bunker_lg)
        )
      )
      LocalObject(408, Door.Constructor(Vector3(4830.557f, 4017.394f, 61.98808f)), owning_building_guid = 10)
    }

    Building28()

    def Building28(): Unit = { // Name: bunker_sm Type: bunker_sm GUID: 11, MapID: 28
      LocalBuilding(
        "bunker_sm",
        11,
        28,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(2466f, 3306f, 32.02363f), Vector3(0f, 0f, 180f), bunker_sm)
        )
      )
      LocalObject(245, Door.Constructor(Vector3(2464.775f, 3306.055f, 33.54463f)), owning_building_guid = 11)
    }

    Building34()

    def Building34(): Unit = { // Name: bunker_sm Type: bunker_sm GUID: 12, MapID: 34
      LocalBuilding(
        "bunker_sm",
        12,
        34,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(3274f, 4058f, 29.62605f), Vector3(0f, 0f, 135f), bunker_sm)
        )
      )
      LocalObject(295, Door.Constructor(Vector3(3273.173f, 4058.905f, 31.14705f)), owning_building_guid = 12)
    }

    Building29()

    def Building29(): Unit = { // Name: bunker_sm Type: bunker_sm GUID: 13, MapID: 29
      LocalBuilding(
        "bunker_sm",
        13,
        29,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(3436f, 3066f, 49.3685f), Vector3(0f, 0f, 270f), bunker_sm)
        )
      )
      LocalObject(296, Door.Constructor(Vector3(3435.945f, 3064.775f, 50.8895f)), owning_building_guid = 13)
    }

    Building46()

    def Building46(): Unit = { // Name: Hvar_Tower Type: bunker_sm GUID: 14, MapID: 46
      LocalBuilding(
        "Hvar_Tower",
        14,
        46,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(3882f, 4388f, 37.29616f), Vector3(0f, 0f, 90f), bunker_sm)
        )
      )
      LocalObject(336, Door.Constructor(Vector3(3882.055f, 4389.225f, 38.81716f)), owning_building_guid = 14)
    }

    Building33()

    def Building33(): Unit = { // Name: bunker_sm Type: bunker_sm GUID: 15, MapID: 33
      LocalBuilding(
        "bunker_sm",
        15,
        33,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(4920f, 5414f, 53.96307f), Vector3(0f, 0f, 135f), bunker_sm)
        )
      )
      LocalObject(413, Door.Constructor(Vector3(4919.173f, 5414.905f, 55.48407f)), owning_building_guid = 15)
    }

    Building7()

    def Building7(): Unit = { // Name: Hvar Type: comm_station GUID: 16, MapID: 7
      LocalBuilding(
        "Hvar",
        16,
        7,
        FoundationBuilder(
          Building.Structure(
            StructureType.Facility,
            Vector3(3908f, 4688f, 48.62961f),
            Vector3(0f, 0f, 179f),
            comm_station
          )
        )
      )
      LocalObject(
        161,
        CaptureTerminal.Constructor(Vector3(3862.579f, 4612.047f, 31.32961f), capture_terminal),
        owning_building_guid = 16
      )
      LocalObject(332, Door.Constructor(Vector3(3847.677f, 4681.552f, 50.38061f)), owning_building_guid = 16)
      LocalObject(333, Door.Constructor(Vector3(3847.995f, 4699.742f, 58.34461f)), owning_building_guid = 16)
      LocalObject(334, Door.Constructor(Vector3(3874.678f, 4612.57f, 50.35061f)), owning_building_guid = 16)
      LocalObject(337, Door.Constructor(Vector3(3888.125f, 4620.359f, 58.34361f)), owning_building_guid = 16)
      LocalObject(341, Door.Constructor(Vector3(3899.652f, 4668.143f, 55.35061f)), owning_building_guid = 16)
      LocalObject(343, Door.Constructor(Vector3(3906.314f, 4620.042f, 50.38061f)), owning_building_guid = 16)
      LocalObject(345, Door.Constructor(Vector3(3912.504f, 4695.333f, 62.78961f)), owning_building_guid = 16)
      LocalObject(346, Door.Constructor(Vector3(3927.992f, 4687.356f, 55.35061f)), owning_building_guid = 16)
      LocalObject(347, Door.Constructor(Vector3(3928.15f, 4696.418f, 55.35061f)), owning_building_guid = 16)
      LocalObject(348, Door.Constructor(Vector3(3933.68f, 4755.365f, 50.38061f)), owning_building_guid = 16)
      LocalObject(350, Door.Constructor(Vector3(3951.87f, 4755.047f, 58.34461f)), owning_building_guid = 16)
      LocalObject(351, Door.Constructor(Vector3(3968.237f, 4712.259f, 58.34461f)), owning_building_guid = 16)
      LocalObject(352, Door.Constructor(Vector3(3968.554f, 4730.45f, 50.38061f)), owning_building_guid = 16)
      LocalObject(552, Door.Constructor(Vector3(3851.101f, 4636.985f, 32.85061f)), owning_building_guid = 16)
      LocalObject(553, Door.Constructor(Vector3(3851.52f, 4660.981f, 40.35061f)), owning_building_guid = 16)
      LocalObject(554, Door.Constructor(Vector3(3851.799f, 4676.979f, 32.85061f)), owning_building_guid = 16)
      LocalObject(555, Door.Constructor(Vector3(3858.821f, 4620.848f, 32.85061f)), owning_building_guid = 16)
      LocalObject(556, Door.Constructor(Vector3(3863.448f, 4656.773f, 40.35061f)), owning_building_guid = 16)
      LocalObject(557, Door.Constructor(Vector3(3863.867f, 4680.769f, 40.35061f)), owning_building_guid = 16)
      LocalObject(558, Door.Constructor(Vector3(3866.819f, 4620.708f, 32.85061f)), owning_building_guid = 16)
      LocalObject(559, Door.Constructor(Vector3(3879.027f, 4632.497f, 32.85061f)), owning_building_guid = 16)
      LocalObject(560, Door.Constructor(Vector3(3879.585f, 4664.492f, 32.85061f)), owning_building_guid = 16)
      LocalObject(561, Door.Constructor(Vector3(3887.864f, 4680.35f, 45.35061f)), owning_building_guid = 16)
      LocalObject(562, Door.Constructor(Vector3(3895.862f, 4680.21f, 50.35061f)), owning_building_guid = 16)
      LocalObject(563, Door.Constructor(Vector3(3899.652f, 4668.143f, 45.35061f)), owning_building_guid = 16)
      LocalObject(564, Door.Constructor(Vector3(3899.792f, 4676.142f, 55.35061f)), owning_building_guid = 16)
      LocalObject(565, Door.Constructor(Vector3(3907.372f, 4652.005f, 42.85061f)), owning_building_guid = 16)
      LocalObject(566, Door.Constructor(Vector3(3907.93f, 4684f, 42.85061f)), owning_building_guid = 16)
      LocalObject(567, Door.Constructor(Vector3(3911.162f, 4639.938f, 42.85061f)), owning_building_guid = 16)
      LocalObject(568, Door.Constructor(Vector3(3911.301f, 4647.937f, 32.85061f)), owning_building_guid = 16)
      LocalObject(569, Door.Constructor(Vector3(3911.86f, 4679.932f, 32.85061f)), owning_building_guid = 16)
      LocalObject(571, Door.Constructor(Vector3(3923.788f, 4675.723f, 50.35061f)), owning_building_guid = 16)
      LocalObject(572, Door.Constructor(Vector3(3924.067f, 4691.72f, 55.35061f)), owning_building_guid = 16)
      LocalObject(573, Door.Constructor(Vector3(3927.578f, 4663.655f, 32.85061f)), owning_building_guid = 16)
      LocalObject(574, Door.Constructor(Vector3(3927.718f, 4671.653f, 42.85061f)), owning_building_guid = 16)
      LocalObject(575, Door.Constructor(Vector3(3935.158f, 4639.519f, 42.85061f)), owning_building_guid = 16)
      LocalObject(577, Door.Constructor(Vector3(3943.436f, 4655.376f, 42.85061f)), owning_building_guid = 16)
      LocalObject(664, Door.Constructor(Vector3(3890.367f, 4692.376f, 51.12261f)), owning_building_guid = 16)
      LocalObject(2036, Door.Constructor(Vector3(3870.838f, 4660.329f, 40.68361f)), owning_building_guid = 16)
      LocalObject(2037, Door.Constructor(Vector3(3870.966f, 4667.617f, 40.68361f)), owning_building_guid = 16)
      LocalObject(2038, Door.Constructor(Vector3(3871.093f, 4674.909f, 40.68361f)), owning_building_guid = 16)
      LocalObject(
        700,
        IFFLock.Constructor(Vector3(3887.565f, 4689.227f, 50.28161f), Vector3(0, 0, 271)),
        owning_building_guid = 16,
        door_guid = 664
      )
      LocalObject(
        785,
        IFFLock.Constructor(Vector3(3852.766f, 4678.535f, 32.66561f), Vector3(0, 0, 91)),
        owning_building_guid = 16,
        door_guid = 554
      )
      LocalObject(
        786,
        IFFLock.Constructor(Vector3(3857.98f, 4619.291f, 32.66561f), Vector3(0, 0, 271)),
        owning_building_guid = 16,
        door_guid = 555
      )
      LocalObject(
        787,
        IFFLock.Constructor(Vector3(3862.31f, 4681.606f, 40.16561f), Vector3(0, 0, 1)),
        owning_building_guid = 16,
        door_guid = 557
      )
      LocalObject(
        788,
        IFFLock.Constructor(Vector3(3865.006f, 4655.936f, 40.16561f), Vector3(0, 0, 181)),
        owning_building_guid = 16,
        door_guid = 556
      )
      LocalObject(
        789,
        IFFLock.Constructor(Vector3(3867.66f, 4622.266f, 32.66561f), Vector3(0, 0, 91)),
        owning_building_guid = 16,
        door_guid = 558
      )
      LocalObject(
        790,
        IFFLock.Constructor(Vector3(3873.865f, 4610.551f, 50.27961f), Vector3(0, 0, 271)),
        owning_building_guid = 16,
        door_guid = 334
      )
      LocalObject(
        792,
        IFFLock.Constructor(Vector3(3900.501f, 4670.173f, 55.29061f), Vector3(0, 0, 91)),
        owning_building_guid = 16,
        door_guid = 341
      )
      LocalObject(
        793,
        IFFLock.Constructor(Vector3(3913.348f, 4697.397f, 62.71061f), Vector3(0, 0, 91)),
        owning_building_guid = 16,
        door_guid = 345
      )
      LocalObject(
        794,
        IFFLock.Constructor(Vector3(3926.023f, 4664.622f, 32.66561f), Vector3(0, 0, 1)),
        owning_building_guid = 16,
        door_guid = 573
      )
      LocalObject(
        795,
        IFFLock.Constructor(Vector3(3926.117f, 4697.265f, 55.29061f), Vector3(0, 0, 1)),
        owning_building_guid = 16,
        door_guid = 347
      )
      LocalObject(
        796,
        IFFLock.Constructor(Vector3(3930.02f, 4686.51f, 55.29061f), Vector3(0, 0, 181)),
        owning_building_guid = 16,
        door_guid = 346
      )
      LocalObject(1009, Locker.Constructor(Vector3(3836.756f, 4659.074f, 31.32961f)), owning_building_guid = 16)
      LocalObject(1010, Locker.Constructor(Vector3(3838.093f, 4659.051f, 31.32961f)), owning_building_guid = 16)
      LocalObject(1011, Locker.Constructor(Vector3(3839.429f, 4659.027f, 31.32961f)), owning_building_guid = 16)
      LocalObject(1012, Locker.Constructor(Vector3(3840.753f, 4659.004f, 31.32961f)), owning_building_guid = 16)
      LocalObject(1013, Locker.Constructor(Vector3(3845.292f, 4658.925f, 31.32961f)), owning_building_guid = 16)
      LocalObject(1014, Locker.Constructor(Vector3(3846.629f, 4658.902f, 31.32961f)), owning_building_guid = 16)
      LocalObject(1015, Locker.Constructor(Vector3(3847.965f, 4658.878f, 31.32961f)), owning_building_guid = 16)
      LocalObject(1016, Locker.Constructor(Vector3(3849.288f, 4658.855f, 31.32961f)), owning_building_guid = 16)
      LocalObject(1017, Locker.Constructor(Vector3(3856.808f, 4678.751f, 39.09061f)), owning_building_guid = 16)
      LocalObject(1018, Locker.Constructor(Vector3(3857.957f, 4678.731f, 39.09061f)), owning_building_guid = 16)
      LocalObject(1019, Locker.Constructor(Vector3(3859.104f, 4678.711f, 39.09061f)), owning_building_guid = 16)
      LocalObject(1020, Locker.Constructor(Vector3(3860.267f, 4678.69f, 39.09061f)), owning_building_guid = 16)
      LocalObject(
        1383,
        Terminal.Constructor(Vector3(3856.954f, 4665.959f, 40.41961f), order_terminal),
        owning_building_guid = 16
      )
      LocalObject(
        1384,
        Terminal.Constructor(Vector3(3857.02f, 4669.748f, 40.41961f), order_terminal),
        owning_building_guid = 16
      )
      LocalObject(
        1385,
        Terminal.Constructor(Vector3(3857.085f, 4673.479f, 40.41961f), order_terminal),
        owning_building_guid = 16
      )
      LocalObject(
        1386,
        Terminal.Constructor(Vector3(3905.759f, 4693.215f, 62.58461f), order_terminal),
        owning_building_guid = 16
      )
      LocalObject(
        1387,
        Terminal.Constructor(Vector3(3905.836f, 4697.609f, 62.58461f), order_terminal),
        owning_building_guid = 16
      )
      LocalObject(
        1388,
        Terminal.Constructor(Vector3(3908.055f, 4695.453f, 62.58461f), order_terminal),
        owning_building_guid = 16
      )
      LocalObject(
        1389,
        Terminal.Constructor(Vector3(3918.022f, 4710.921f, 55.18961f), order_terminal),
        owning_building_guid = 16
      )
      LocalObject(
        1974,
        Terminal.Constructor(Vector3(3870.585f, 4662.826f, 40.96361f), spawn_terminal),
        owning_building_guid = 16
      )
      LocalObject(
        1975,
        Terminal.Constructor(Vector3(3870.715f, 4670.113f, 40.96361f), spawn_terminal),
        owning_building_guid = 16
      )
      LocalObject(
        1976,
        Terminal.Constructor(Vector3(3870.838f, 4677.404f, 40.96361f), spawn_terminal),
        owning_building_guid = 16
      )
      LocalObject(
        1977,
        Terminal.Constructor(Vector3(3907.894f, 4648.054f, 42.88661f), spawn_terminal),
        owning_building_guid = 16
      )
      LocalObject(
        1978,
        Terminal.Constructor(Vector3(3909.909f, 4712.001f, 55.44661f), spawn_terminal),
        owning_building_guid = 16
      )
      LocalObject(
        1979,
        Terminal.Constructor(Vector3(3923.905f, 4679.13f, 32.88661f), spawn_terminal),
        owning_building_guid = 16
      )
      LocalObject(
        2135,
        Terminal.Constructor(Vector3(3854.594f, 4634.15f, 51.51661f), vehicle_terminal_combined),
        owning_building_guid = 16
      )
      LocalObject(
        1313,
        VehicleSpawnPad.Constructor(Vector3(3868.22f, 4634.066f, 47.35861f), mb_pad_creation, Vector3(0, 0, 91)),
        owning_building_guid = 16,
        terminal_guid = 2135
      )
      LocalObject(1850, ResourceSilo.Constructor(Vector3(3964.967f, 4756.108f, 55.84661f)), owning_building_guid = 16)
      LocalObject(
        1883,
        SpawnTube.Constructor(Vector3(3871.297f, 4661.375f, 38.82961f), Vector3(0, 0, 181)),
        owning_building_guid = 16
      )
      LocalObject(
        1884,
        SpawnTube.Constructor(Vector3(3871.424f, 4668.662f, 38.82961f), Vector3(0, 0, 181)),
        owning_building_guid = 16
      )
      LocalObject(
        1885,
        SpawnTube.Constructor(Vector3(3871.551f, 4675.951f, 38.82961f), Vector3(0, 0, 181)),
        owning_building_guid = 16
      )
      LocalObject(
        1329,
        ProximityTerminal.Constructor(Vector3(3843.049f, 4659.509f, 31.32961f), medical_terminal),
        owning_building_guid = 16
      )
      LocalObject(
        1330,
        ProximityTerminal.Constructor(Vector3(3907.642f, 4716.988f, 48.82961f), medical_terminal),
        owning_building_guid = 16
      )
      LocalObject(
        1555,
        ProximityTerminal.Constructor(Vector3(3925.88f, 4632.495f, 57.07061f), pad_landing_frame),
        owning_building_guid = 16
      )
      LocalObject(
        1556,
        Terminal.Constructor(Vector3(3925.88f, 4632.495f, 57.07061f), air_rearm_terminal),
        owning_building_guid = 16
      )
      LocalObject(
        1806,
        ProximityTerminal.Constructor(Vector3(3846.793f, 4713.402f, 48.37961f), repair_silo),
        owning_building_guid = 16
      )
      LocalObject(
        1807,
        Terminal.Constructor(Vector3(3846.793f, 4713.402f, 48.37961f), ground_rearm_terminal),
        owning_building_guid = 16
      )
      LocalObject(
        1818,
        ProximityTerminal.Constructor(Vector3(3968.675f, 4663.758f, 48.37961f), repair_silo),
        owning_building_guid = 16
      )
      LocalObject(
        1819,
        Terminal.Constructor(Vector3(3968.675f, 4663.758f, 48.37961f), ground_rearm_terminal),
        owning_building_guid = 16
      )
      LocalObject(
        1261,
        FacilityTurret.Constructor(Vector3(3833.766f, 4608.849f, 57.33761f), manned_turret),
        owning_building_guid = 16
      )
      TurretToWeapon(1261, 5006)
      LocalObject(
        1262,
        FacilityTurret.Constructor(Vector3(3834.673f, 4727.785f, 57.33761f), manned_turret),
        owning_building_guid = 16
      )
      TurretToWeapon(1262, 5007)
      LocalObject(
        1264,
        FacilityTurret.Constructor(Vector3(3878.564f, 4770.138f, 57.33761f), manned_turret),
        owning_building_guid = 16
      )
      TurretToWeapon(1264, 5008)
      LocalObject(
        1265,
        FacilityTurret.Constructor(Vector3(3937.02f, 4605.731f, 57.33761f), manned_turret),
        owning_building_guid = 16
      )
      TurretToWeapon(1265, 5009)
      LocalObject(
        1268,
        FacilityTurret.Constructor(Vector3(3980.89f, 4648.07f, 57.33761f), manned_turret),
        owning_building_guid = 16
      )
      TurretToWeapon(1268, 5010)
      LocalObject(
        1269,
        FacilityTurret.Constructor(Vector3(3981.839f, 4767.158f, 57.33761f), manned_turret),
        owning_building_guid = 16
      )
      TurretToWeapon(1269, 5011)
      LocalObject(
        1661,
        Painbox.Constructor(Vector3(3927.229f, 4651.569f, 36.23161f), painbox),
        owning_building_guid = 16
      )
      LocalObject(
        1670,
        Painbox.Constructor(Vector3(3861.335f, 4662.641f, 43.27441f), painbox_continuous),
        owning_building_guid = 16
      )
      LocalObject(
        1679,
        Painbox.Constructor(Vector3(3927.393f, 4666.585f, 34.08831f), painbox_door_radius),
        owning_building_guid = 16
      )
      LocalObject(
        1696,
        Painbox.Constructor(Vector3(3849.668f, 4661.187f, 41.65561f), painbox_door_radius_continuous),
        owning_building_guid = 16
      )
      LocalObject(
        1697,
        Painbox.Constructor(Vector3(3862.614f, 4655.367f, 40.43731f), painbox_door_radius_continuous),
        owning_building_guid = 16
      )
      LocalObject(
        1698,
        Painbox.Constructor(Vector3(3863.987f, 4682.691f, 40.65561f), painbox_door_radius_continuous),
        owning_building_guid = 16
      )
      LocalObject(223, Generator.Constructor(Vector3(3927.332f, 4648.102f, 30.03561f)), owning_building_guid = 16)
      LocalObject(
        214,
        Terminal.Constructor(Vector3(3927.427f, 4656.293f, 31.32961f), gen_control),
        owning_building_guid = 16
      )
    }

    Building5()

    def Building5(): Unit = { // Name: Atar Type: comm_station_dsp GUID: 19, MapID: 5
      LocalBuilding(
        "Atar",
        19,
        5,
        FoundationBuilder(
          Building.Structure(
            StructureType.Facility,
            Vector3(3550f, 2798f, 47.04011f),
            Vector3(0f, 0f, 360f),
            comm_station_dsp
          )
        )
      )
      LocalObject(
        160,
        CaptureTerminal.Constructor(Vector3(3626.089f, 2778.734f, 29.64011f), capture_terminal),
        owning_building_guid = 19
      )
      LocalObject(204, Door.Constructor(Vector3(3618.339f, 2868.464f, 50.41811f)), owning_building_guid = 19)
      LocalObject(297, Door.Constructor(Vector3(3490.196f, 2754.501f, 48.69111f)), owning_building_guid = 19)
      LocalObject(298, Door.Constructor(Vector3(3490.196f, 2772.693f, 56.65511f)), owning_building_guid = 19)
      LocalObject(299, Door.Constructor(Vector3(3507.307f, 2730.197f, 56.65511f)), owning_building_guid = 19)
      LocalObject(300, Door.Constructor(Vector3(3525.499f, 2730.197f, 48.69111f)), owning_building_guid = 19)
      LocalObject(301, Door.Constructor(Vector3(3530f, 2789.231f, 53.66111f)), owning_building_guid = 19)
      LocalObject(302, Door.Constructor(Vector3(3530f, 2798.295f, 53.66111f)), owning_building_guid = 19)
      LocalObject(307, Door.Constructor(Vector3(3542.763f, 2917.958f, 48.69111f)), owning_building_guid = 19)
      LocalObject(308, Door.Constructor(Vector3(3545.625f, 2790.59f, 61.10011f)), owning_building_guid = 19)
      LocalObject(309, Door.Constructor(Vector3(3555.627f, 2930.823f, 56.65411f)), owning_building_guid = 19)
      LocalObject(310, Door.Constructor(Vector3(3558f, 2818f, 53.66111f)), owning_building_guid = 19)
      LocalObject(315, Door.Constructor(Vector3(3597.721f, 2962.353f, 48.69111f)), owning_building_guid = 19)
      LocalObject(316, Door.Constructor(Vector3(3603.952f, 2902.355f, 53.65711f)), owning_building_guid = 19)
      LocalObject(317, Door.Constructor(Vector3(3605.927f, 2872.35f, 48.66311f)), owning_building_guid = 19)
      LocalObject(318, Door.Constructor(Vector3(3615.914f, 2962.353f, 56.65411f)), owning_building_guid = 19)
      LocalObject(319, Door.Constructor(Vector3(3629.929f, 2785.406f, 56.65511f)), owning_building_guid = 19)
      LocalObject(320, Door.Constructor(Vector3(3642.793f, 2798.27f, 48.69111f)), owning_building_guid = 19)
      LocalObject(321, Door.Constructor(Vector3(3656.977f, 2861.008f, 56.65411f)), owning_building_guid = 19)
      LocalObject(322, Door.Constructor(Vector3(3656.977f, 2879.2f, 48.69111f)), owning_building_guid = 19)
      LocalObject(323, Door.Constructor(Vector3(3666f, 2878f, 48.66111f)), owning_building_guid = 19)
      LocalObject(531, Door.Constructor(Vector3(3534f, 2794f, 53.66111f)), owning_building_guid = 19)
      LocalObject(532, Door.Constructor(Vector3(3534f, 2810f, 48.66111f)), owning_building_guid = 19)
      LocalObject(533, Door.Constructor(Vector3(3558f, 2810f, 53.66111f)), owning_building_guid = 19)
      LocalObject(534, Door.Constructor(Vector3(3558f, 2818f, 43.66111f)), owning_building_guid = 19)
      LocalObject(535, Door.Constructor(Vector3(3562f, 2806f, 48.66111f)), owning_building_guid = 19)
      LocalObject(536, Door.Constructor(Vector3(3570f, 2806f, 43.66111f)), owning_building_guid = 19)
      LocalObject(537, Door.Constructor(Vector3(3574f, 2842f, 38.66111f)), owning_building_guid = 19)
      LocalObject(538, Door.Constructor(Vector3(3578f, 2830f, 31.16111f)), owning_building_guid = 19)
      LocalObject(539, Door.Constructor(Vector3(3590f, 2794f, 31.16111f)), owning_building_guid = 19)
      LocalObject(540, Door.Constructor(Vector3(3590f, 2858f, 31.16111f)), owning_building_guid = 19)
      LocalObject(541, Door.Constructor(Vector3(3594f, 2790f, 38.66111f)), owning_building_guid = 19)
      LocalObject(542, Door.Constructor(Vector3(3594f, 2806f, 38.66111f)), owning_building_guid = 19)
      LocalObject(543, Door.Constructor(Vector3(3594f, 2830f, 38.66111f)), owning_building_guid = 19)
      LocalObject(544, Door.Constructor(Vector3(3606f, 2810f, 31.16111f)), owning_building_guid = 19)
      LocalObject(545, Door.Constructor(Vector3(3606f, 2826f, 38.66111f)), owning_building_guid = 19)
      LocalObject(546, Door.Constructor(Vector3(3609.921f, 2892.351f, 53.66311f)), owning_building_guid = 19)
      LocalObject(547, Door.Constructor(Vector3(3622f, 2770f, 31.16111f)), owning_building_guid = 19)
      LocalObject(548, Door.Constructor(Vector3(3630f, 2770f, 31.16111f)), owning_building_guid = 19)
      LocalObject(549, Door.Constructor(Vector3(3634f, 2782f, 31.16111f)), owning_building_guid = 19)
      LocalObject(550, Door.Constructor(Vector3(3638f, 2802f, 38.66111f)), owning_building_guid = 19)
      LocalObject(551, Door.Constructor(Vector3(3638f, 2834f, 38.66111f)), owning_building_guid = 19)
      LocalObject(663, Door.Constructor(Vector3(3567.707f, 2793.922f, 49.43211f)), owning_building_guid = 19)
      LocalObject(2031, Door.Constructor(Vector3(3586.673f, 2811.733f, 38.99411f)), owning_building_guid = 19)
      LocalObject(2032, Door.Constructor(Vector3(3586.673f, 2819.026f, 38.99411f)), owning_building_guid = 19)
      LocalObject(2033, Door.Constructor(Vector3(3586.673f, 2826.315f, 38.99411f)), owning_building_guid = 19)
      LocalObject(
        699,
        IFFLock.Constructor(Vector3(3570.454f, 2797.09f, 48.60811f), Vector3(0, 0, 90)),
        owning_building_guid = 19,
        door_guid = 663
      )
      LocalObject(
        757,
        IFFLock.Constructor(Vector3(3527.959f, 2799.104f, 53.60811f), Vector3(0, 0, 0)),
        owning_building_guid = 19,
        door_guid = 302
      )
      LocalObject(
        760,
        IFFLock.Constructor(Vector3(3532.04f, 2788.42f, 53.60811f), Vector3(0, 0, 180)),
        owning_building_guid = 19,
        door_guid = 301
      )
      LocalObject(
        763,
        IFFLock.Constructor(Vector3(3544.817f, 2788.514f, 61.10811f), Vector3(0, 0, 270)),
        owning_building_guid = 19,
        door_guid = 308
      )
      LocalObject(
        764,
        IFFLock.Constructor(Vector3(3557.193f, 2815.962f, 53.60811f), Vector3(0, 0, 270)),
        owning_building_guid = 19,
        door_guid = 310
      )
      LocalObject(
        769,
        IFFLock.Constructor(Vector3(3590.94f, 2859.572f, 30.97611f), Vector3(0, 0, 90)),
        owning_building_guid = 19,
        door_guid = 540
      )
      LocalObject(
        770,
        IFFLock.Constructor(Vector3(3592.428f, 2830.94f, 38.47611f), Vector3(0, 0, 0)),
        owning_building_guid = 19,
        door_guid = 543
      )
      LocalObject(
        771,
        IFFLock.Constructor(Vector3(3595.572f, 2805.19f, 38.47611f), Vector3(0, 0, 180)),
        owning_building_guid = 19,
        door_guid = 542
      )
      LocalObject(
        772,
        IFFLock.Constructor(Vector3(3601.907f, 2903.163f, 53.58711f), Vector3(0, 0, 0)),
        owning_building_guid = 19,
        door_guid = 316
      )
      LocalObject(
        773,
        IFFLock.Constructor(Vector3(3605.06f, 2808.428f, 30.97611f), Vector3(0, 0, 270)),
        owning_building_guid = 19,
        door_guid = 544
      )
      LocalObject(
        774,
        IFFLock.Constructor(Vector3(3605.124f, 2870.312f, 48.65211f), Vector3(0, 0, 270)),
        owning_building_guid = 19,
        door_guid = 317
      )
      LocalObject(
        775,
        IFFLock.Constructor(Vector3(3621.06f, 2768.428f, 30.97611f), Vector3(0, 0, 270)),
        owning_building_guid = 19,
        door_guid = 547
      )
      LocalObject(
        777,
        IFFLock.Constructor(Vector3(3630.813f, 2771.572f, 30.97611f), Vector3(0, 0, 90)),
        owning_building_guid = 19,
        door_guid = 548
      )
      LocalObject(
        778,
        IFFLock.Constructor(Vector3(3663.953f, 2878.808f, 48.55111f), Vector3(0, 0, 0)),
        owning_building_guid = 19,
        door_guid = 323
      )
      LocalObject(989, Locker.Constructor(Vector3(3597.563f, 2808.141f, 37.40111f)), owning_building_guid = 19)
      LocalObject(990, Locker.Constructor(Vector3(3598.727f, 2808.141f, 37.40111f)), owning_building_guid = 19)
      LocalObject(991, Locker.Constructor(Vector3(3599.874f, 2808.141f, 37.40111f)), owning_building_guid = 19)
      LocalObject(992, Locker.Constructor(Vector3(3601.023f, 2808.141f, 37.40111f)), owning_building_guid = 19)
      LocalObject(993, Locker.Constructor(Vector3(3608.194f, 2828.165f, 29.64011f)), owning_building_guid = 19)
      LocalObject(994, Locker.Constructor(Vector3(3609.518f, 2828.165f, 29.64011f)), owning_building_guid = 19)
      LocalObject(995, Locker.Constructor(Vector3(3610.854f, 2828.165f, 29.64011f)), owning_building_guid = 19)
      LocalObject(996, Locker.Constructor(Vector3(3612.191f, 2828.165f, 29.64011f)), owning_building_guid = 19)
      LocalObject(997, Locker.Constructor(Vector3(3616.731f, 2828.165f, 29.64011f)), owning_building_guid = 19)
      LocalObject(998, Locker.Constructor(Vector3(3618.055f, 2828.165f, 29.64011f)), owning_building_guid = 19)
      LocalObject(999, Locker.Constructor(Vector3(3619.391f, 2828.165f, 29.64011f)), owning_building_guid = 19)
      LocalObject(1000, Locker.Constructor(Vector3(3620.728f, 2828.165f, 29.64011f)), owning_building_guid = 19)
      LocalObject(
        206,
        Terminal.Constructor(Vector3(3609.879f, 2900.918f, 52.74411f), dropship_vehicle_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        205,
        VehicleSpawnPad.Constructor(Vector3(3618.328f, 2922.856f, 47.06811f), dropship_pad_doors, Vector3(0, 0, 90)),
        owning_building_guid = 19,
        terminal_guid = 206
      )
      LocalObject(
        1366,
        Terminal.Constructor(Vector3(3540.378f, 2774.897f, 53.50011f), order_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        1370,
        Terminal.Constructor(Vector3(3550.075f, 2790.547f, 60.89511f), order_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        1371,
        Terminal.Constructor(Vector3(3552.331f, 2788.43f, 60.89511f), order_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        1372,
        Terminal.Constructor(Vector3(3552.332f, 2792.825f, 60.89511f), order_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        1373,
        Terminal.Constructor(Vector3(3554.592f, 2790.59f, 60.89511f), order_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        1377,
        Terminal.Constructor(Vector3(3600.654f, 2813.408f, 38.73011f), order_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        1378,
        Terminal.Constructor(Vector3(3600.654f, 2817.139f, 38.73011f), order_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        1379,
        Terminal.Constructor(Vector3(3600.654f, 2820.928f, 38.73011f), order_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        1965,
        Terminal.Constructor(Vector3(3548.509f, 2773.959f, 53.75711f), spawn_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        1966,
        Terminal.Constructor(Vector3(3586.971f, 2809.243f, 39.27411f), spawn_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        1967,
        Terminal.Constructor(Vector3(3586.967f, 2816.535f, 39.27411f), spawn_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        1968,
        Terminal.Constructor(Vector3(3586.97f, 2823.823f, 39.27411f), spawn_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        1969,
        Terminal.Constructor(Vector3(3605.103f, 2892.906f, 53.68811f), spawn_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        1970,
        Terminal.Constructor(Vector3(3614.058f, 2797.409f, 31.16811f), spawn_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        1971,
        Terminal.Constructor(Vector3(3621.409f, 2853.942f, 31.16811f), spawn_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        1972,
        Terminal.Constructor(Vector3(3630.058f, 2805.409f, 38.69711f), spawn_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        1973,
        Terminal.Constructor(Vector3(3630.058f, 2845.409f, 38.69711f), spawn_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        2134,
        Terminal.Constructor(Vector3(3567.698f, 2906.044f, 49.82711f), ground_vehicle_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        1312,
        VehicleSpawnPad.Constructor(Vector3(3567.786f, 2892.411f, 45.66911f), mb_pad_creation, Vector3(0, 0, 180)),
        owning_building_guid = 19,
        terminal_guid = 2134
      )
      LocalObject(1849, ResourceSilo.Constructor(Vector3(3648.212f, 2963.642f, 54.15711f)), owning_building_guid = 19)
      LocalObject(
        1878,
        SpawnTube.Constructor(Vector3(3586.233f, 2810.683f, 37.14011f), Vector3(0, 0, 0)),
        owning_building_guid = 19
      )
      LocalObject(
        1879,
        SpawnTube.Constructor(Vector3(3586.233f, 2817.974f, 37.14011f), Vector3(0, 0, 0)),
        owning_building_guid = 19
      )
      LocalObject(
        1880,
        SpawnTube.Constructor(Vector3(3586.233f, 2825.262f, 37.14011f), Vector3(0, 0, 0)),
        owning_building_guid = 19
      )
      LocalObject(
        1327,
        ProximityTerminal.Constructor(Vector3(3550.863f, 2769.013f, 47.14011f), medical_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        1328,
        ProximityTerminal.Constructor(Vector3(3614.444f, 2827.62f, 29.64011f), medical_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        1540,
        ProximityTerminal.Constructor(Vector3(3531.153f, 2891.398f, 55.45011f), pad_landing_frame),
        owning_building_guid = 19
      )
      LocalObject(
        1541,
        Terminal.Constructor(Vector3(3531.153f, 2891.398f, 55.45011f), air_rearm_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        1543,
        ProximityTerminal.Constructor(Vector3(3547.514f, 2845.467f, 52.73411f), pad_landing_frame),
        owning_building_guid = 19
      )
      LocalObject(
        1544,
        Terminal.Constructor(Vector3(3547.514f, 2845.467f, 52.73411f), air_rearm_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        1546,
        ProximityTerminal.Constructor(Vector3(3599.804f, 2809.901f, 59.91611f), pad_landing_frame),
        owning_building_guid = 19
      )
      LocalObject(
        1547,
        Terminal.Constructor(Vector3(3599.804f, 2809.901f, 59.91611f), air_rearm_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        1549,
        ProximityTerminal.Constructor(Vector3(3635.071f, 2826.159f, 55.46311f), pad_landing_frame),
        owning_building_guid = 19
      )
      LocalObject(
        1550,
        Terminal.Constructor(Vector3(3635.071f, 2826.159f, 55.46311f), air_rearm_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        1798,
        ProximityTerminal.Constructor(Vector3(3488.642f, 2836.24f, 46.79011f), repair_silo),
        owning_building_guid = 19
      )
      LocalObject(
        1799,
        Terminal.Constructor(Vector3(3488.642f, 2836.24f, 46.79011f), ground_rearm_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        1802,
        ProximityTerminal.Constructor(Vector3(3658.57f, 2839.152f, 46.79011f), repair_silo),
        owning_building_guid = 19
      )
      LocalObject(
        1803,
        Terminal.Constructor(Vector3(3658.57f, 2839.152f, 46.79011f), ground_rearm_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        1249,
        FacilityTurret.Constructor(Vector3(3476.401f, 2871.113f, 55.64811f), manned_turret),
        owning_building_guid = 19
      )
      TurretToWeapon(1249, 5012)
      LocalObject(
        1250,
        FacilityTurret.Constructor(Vector3(3477.554f, 2717.565f, 55.64811f), manned_turret),
        owning_building_guid = 19
      )
      TurretToWeapon(1250, 5013)
      LocalObject(
        1252,
        FacilityTurret.Constructor(Vector3(3521.445f, 2917.667f, 55.64811f), manned_turret),
        owning_building_guid = 19
      )
      TurretToWeapon(1252, 5014)
      LocalObject(
        1255,
        FacilityTurret.Constructor(Vector3(3580.428f, 2716.396f, 55.64811f), manned_turret),
        owning_building_guid = 19
      )
      TurretToWeapon(1255, 5015)
      LocalObject(
        1256,
        FacilityTurret.Constructor(Vector3(3581.449f, 2976.154f, 55.64811f), manned_turret),
        owning_building_guid = 19
      )
      TurretToWeapon(1256, 5016)
      LocalObject(
        1258,
        FacilityTurret.Constructor(Vector3(3622.537f, 2757.011f, 55.64811f), manned_turret),
        owning_building_guid = 19
      )
      TurretToWeapon(1258, 5017)
      LocalObject(
        1259,
        FacilityTurret.Constructor(Vector3(3669.619f, 2974.985f, 55.64811f), manned_turret),
        owning_building_guid = 19
      )
      TurretToWeapon(1259, 5018)
      LocalObject(
        1260,
        FacilityTurret.Constructor(Vector3(3670.773f, 2806.733f, 55.64811f), manned_turret),
        owning_building_guid = 19
      )
      TurretToWeapon(1260, 5019)
      LocalObject(
        1660,
        Painbox.Constructor(Vector3(3578.428f, 2858.057f, 33.53441f), painbox),
        owning_building_guid = 19
      )
      LocalObject(
        1669,
        Painbox.Constructor(Vector3(3595.857f, 2818.408f, 41.16761f), painbox_continuous),
        owning_building_guid = 19
      )
      LocalObject(
        1678,
        Painbox.Constructor(Vector3(3592.203f, 2856.915f, 32.77231f), painbox_door_radius),
        owning_building_guid = 19
      )
      LocalObject(
        1693,
        Painbox.Constructor(Vector3(3593.087f, 2803.386f, 39.56931f), painbox_door_radius_continuous),
        owning_building_guid = 19
      )
      LocalObject(
        1694,
        Painbox.Constructor(Vector3(3593.895f, 2832.081f, 40.04011f), painbox_door_radius_continuous),
        owning_building_guid = 19
      )
      LocalObject(
        1695,
        Painbox.Constructor(Vector3(3608.317f, 2825.888f, 40.47041f), painbox_door_radius_continuous),
        owning_building_guid = 19
      )
      LocalObject(222, Generator.Constructor(Vector3(3574.445f, 2857.975f, 28.34611f)), owning_building_guid = 19)
      LocalObject(
        213,
        Terminal.Constructor(Vector3(3582.637f, 2858.022f, 29.64011f), gen_control),
        owning_building_guid = 19
      )
    }

    Building11()

    def Building11(): Unit = { // Name: Rashnu Type: cryo_facility GUID: 22, MapID: 11
      LocalBuilding(
        "Rashnu",
        22,
        11,
        FoundationBuilder(
          Building.Structure(
            StructureType.Facility,
            Vector3(3050f, 3898f, 59.5276f),
            Vector3(0f, 0f, 360f),
            cryo_facility
          )
        )
      )
      LocalObject(
        159,
        CaptureTerminal.Constructor(Vector3(3021.911f, 3957.266f, 49.5276f), capture_terminal),
        owning_building_guid = 22
      )
      LocalObject(280, Door.Constructor(Vector3(2991.023f, 3902.5f, 61.07859f)), owning_building_guid = 22)
      LocalObject(281, Door.Constructor(Vector3(2991.023f, 3920.693f, 69.04259f)), owning_building_guid = 22)
      LocalObject(282, Door.Constructor(Vector3(3007.674f, 3965.803f, 61.07859f)), owning_building_guid = 22)
      LocalObject(283, Door.Constructor(Vector3(3025.867f, 3965.803f, 69.04259f)), owning_building_guid = 22)
      LocalObject(284, Door.Constructor(Vector3(3034f, 3918f, 71.0486f)), owning_building_guid = 22)
      LocalObject(285, Door.Constructor(Vector3(3054f, 3901.137f, 71.0486f)), owning_building_guid = 22)
      LocalObject(286, Door.Constructor(Vector3(3055.307f, 3815.073f, 69.04259f)), owning_building_guid = 22)
      LocalObject(287, Door.Constructor(Vector3(3073.5f, 3815.073f, 61.07859f)), owning_building_guid = 22)
      LocalObject(288, Door.Constructor(Vector3(3082f, 3806f, 61.0486f)), owning_building_guid = 22)
      LocalObject(289, Door.Constructor(Vector3(3100.927f, 3847.307f, 69.04259f)), owning_building_guid = 22)
      LocalObject(290, Door.Constructor(Vector3(3100.927f, 3865.5f, 61.07859f)), owning_building_guid = 22)
      LocalObject(508, Door.Constructor(Vector3(3002f, 3886f, 51.0486f)), owning_building_guid = 22)
      LocalObject(509, Door.Constructor(Vector3(3010f, 3838f, 53.5486f)), owning_building_guid = 22)
      LocalObject(510, Door.Constructor(Vector3(3014f, 3898f, 51.0486f)), owning_building_guid = 22)
      LocalObject(511, Door.Constructor(Vector3(3014f, 3938f, 51.0486f)), owning_building_guid = 22)
      LocalObject(512, Door.Constructor(Vector3(3018f, 3918f, 51.0486f)), owning_building_guid = 22)
      LocalObject(513, Door.Constructor(Vector3(3018f, 3966f, 51.0486f)), owning_building_guid = 22)
      LocalObject(514, Door.Constructor(Vector3(3026f, 3966f, 51.0486f)), owning_building_guid = 22)
      LocalObject(515, Door.Constructor(Vector3(3030f, 3842f, 53.5486f)), owning_building_guid = 22)
      LocalObject(516, Door.Constructor(Vector3(3030f, 3866f, 51.0486f)), owning_building_guid = 22)
      LocalObject(517, Door.Constructor(Vector3(3034f, 3918f, 51.0486f)), owning_building_guid = 22)
      LocalObject(518, Door.Constructor(Vector3(3034f, 3918f, 61.0486f)), owning_building_guid = 22)
      LocalObject(519, Door.Constructor(Vector3(3034f, 3966f, 51.0486f)), owning_building_guid = 22)
      LocalObject(520, Door.Constructor(Vector3(3038f, 3810f, 53.5486f)), owning_building_guid = 22)
      LocalObject(521, Door.Constructor(Vector3(3038f, 3898f, 51.0486f)), owning_building_guid = 22)
      LocalObject(522, Door.Constructor(Vector3(3038f, 3938f, 51.0486f)), owning_building_guid = 22)
      LocalObject(523, Door.Constructor(Vector3(3050f, 3870f, 51.0486f)), owning_building_guid = 22)
      LocalObject(524, Door.Constructor(Vector3(3050f, 3894f, 51.0486f)), owning_building_guid = 22)
      LocalObject(525, Door.Constructor(Vector3(3050f, 3950f, 51.0486f)), owning_building_guid = 22)
      LocalObject(526, Door.Constructor(Vector3(3054f, 3890f, 71.0486f)), owning_building_guid = 22)
      LocalObject(527, Door.Constructor(Vector3(3062f, 3898f, 51.0486f)), owning_building_guid = 22)
      LocalObject(528, Door.Constructor(Vector3(3062f, 3922f, 51.0486f)), owning_building_guid = 22)
      LocalObject(529, Door.Constructor(Vector3(3074f, 3902f, 43.5486f)), owning_building_guid = 22)
      LocalObject(530, Door.Constructor(Vector3(3074f, 3918f, 51.0486f)), owning_building_guid = 22)
      LocalObject(662, Door.Constructor(Vector3(3053.992f, 3923.083f, 61.8106f)), owning_building_guid = 22)
      LocalObject(669, Door.Constructor(Vector3(3046f, 3906f, 61.0466f)), owning_building_guid = 22)
      LocalObject(670, Door.Constructor(Vector3(3062f, 3898f, 61.0486f)), owning_building_guid = 22)
      LocalObject(2022, Door.Constructor(Vector3(3054.673f, 3903.733f, 51.3816f)), owning_building_guid = 22)
      LocalObject(2023, Door.Constructor(Vector3(3054.673f, 3911.026f, 51.3816f)), owning_building_guid = 22)
      LocalObject(2024, Door.Constructor(Vector3(3054.673f, 3918.315f, 51.3816f)), owning_building_guid = 22)
      LocalObject(
        698,
        IFFLock.Constructor(Vector3(3050.77f, 3925.822f, 61.00959f), Vector3(0, 0, 0)),
        owning_building_guid = 22,
        door_guid = 662
      )
      LocalObject(
        745,
        IFFLock.Constructor(Vector3(3017.06f, 3964.428f, 50.86359f), Vector3(0, 0, 270)),
        owning_building_guid = 22,
        door_guid = 513
      )
      LocalObject(
        746,
        IFFLock.Constructor(Vector3(3026.813f, 3967.572f, 50.86359f), Vector3(0, 0, 90)),
        owning_building_guid = 22,
        door_guid = 514
      )
      LocalObject(
        747,
        IFFLock.Constructor(Vector3(3034.814f, 3920.043f, 70.9796f), Vector3(0, 0, 90)),
        owning_building_guid = 22,
        door_guid = 284
      )
      LocalObject(
        748,
        IFFLock.Constructor(Vector3(3051.954f, 3901.958f, 70.9796f), Vector3(0, 0, 0)),
        owning_building_guid = 22,
        door_guid = 285
      )
      LocalObject(
        749,
        IFFLock.Constructor(Vector3(3060.428f, 3922.81f, 50.86359f), Vector3(0, 0, 0)),
        owning_building_guid = 22,
        door_guid = 528
      )
      LocalObject(
        750,
        IFFLock.Constructor(Vector3(3063.572f, 3897.19f, 50.86359f), Vector3(0, 0, 180)),
        owning_building_guid = 22,
        door_guid = 527
      )
      LocalObject(
        751,
        IFFLock.Constructor(Vector3(3073.19f, 3900.428f, 43.36359f), Vector3(0, 0, 270)),
        owning_building_guid = 22,
        door_guid = 529
      )
      LocalObject(
        752,
        IFFLock.Constructor(Vector3(3082.814f, 3808.042f, 60.9796f), Vector3(0, 0, 90)),
        owning_building_guid = 22,
        door_guid = 288
      )
      LocalObject(944, Locker.Constructor(Vector3(3065.563f, 3900.141f, 49.7886f)), owning_building_guid = 22)
      LocalObject(945, Locker.Constructor(Vector3(3066.727f, 3900.141f, 49.7886f)), owning_building_guid = 22)
      LocalObject(946, Locker.Constructor(Vector3(3067.874f, 3900.141f, 49.7886f)), owning_building_guid = 22)
      LocalObject(947, Locker.Constructor(Vector3(3069.023f, 3900.141f, 49.7886f)), owning_building_guid = 22)
      LocalObject(948, Locker.Constructor(Vector3(3069.997f, 3947.496f, 49.52259f)), owning_building_guid = 22)
      LocalObject(949, Locker.Constructor(Vector3(3069.997f, 3948.752f, 49.52259f)), owning_building_guid = 22)
      LocalObject(950, Locker.Constructor(Vector3(3069.997f, 3950.013f, 49.52259f)), owning_building_guid = 22)
      LocalObject(951, Locker.Constructor(Vector3(3069.997f, 3951.275f, 49.52259f)), owning_building_guid = 22)
      LocalObject(952, Locker.Constructor(Vector3(3069.997f, 3952.527f, 49.52259f)), owning_building_guid = 22)
      LocalObject(953, Locker.Constructor(Vector3(3082.817f, 3900.36f, 49.4356f)), owning_building_guid = 22)
      LocalObject(954, Locker.Constructor(Vector3(3082.814f, 3920.361f, 49.4356f)), owning_building_guid = 22)
      LocalObject(955, Locker.Constructor(Vector3(3083.873f, 3900.36f, 49.4356f)), owning_building_guid = 22)
      LocalObject(956, Locker.Constructor(Vector3(3083.868f, 3920.361f, 49.4356f)), owning_building_guid = 22)
      LocalObject(957, Locker.Constructor(Vector3(3084.928f, 3900.36f, 49.4356f)), owning_building_guid = 22)
      LocalObject(958, Locker.Constructor(Vector3(3084.929f, 3920.361f, 49.4356f)), owning_building_guid = 22)
      LocalObject(959, Locker.Constructor(Vector3(3085.983f, 3900.36f, 49.4356f)), owning_building_guid = 22)
      LocalObject(960, Locker.Constructor(Vector3(3085.984f, 3920.361f, 49.4356f)), owning_building_guid = 22)
      LocalObject(961, Locker.Constructor(Vector3(3087.043f, 3900.36f, 49.4356f)), owning_building_guid = 22)
      LocalObject(962, Locker.Constructor(Vector3(3087.039f, 3920.361f, 49.4356f)), owning_building_guid = 22)
      LocalObject(963, Locker.Constructor(Vector3(3088.098f, 3900.36f, 49.4356f)), owning_building_guid = 22)
      LocalObject(964, Locker.Constructor(Vector3(3088.095f, 3920.361f, 49.4356f)), owning_building_guid = 22)
      LocalObject(1191, Locker.Constructor(Vector3(3068.26f, 3885.787f, 59.5276f)), owning_building_guid = 22)
      LocalObject(1192, Locker.Constructor(Vector3(3068.26f, 3886.821f, 59.5276f)), owning_building_guid = 22)
      LocalObject(1193, Locker.Constructor(Vector3(3068.26f, 3889.338f, 59.2986f)), owning_building_guid = 22)
      LocalObject(1194, Locker.Constructor(Vector3(3068.26f, 3890.372f, 59.2986f)), owning_building_guid = 22)
      LocalObject(1195, Locker.Constructor(Vector3(3068.26f, 3891.426f, 59.2986f)), owning_building_guid = 22)
      LocalObject(1196, Locker.Constructor(Vector3(3068.26f, 3892.46f, 59.2986f)), owning_building_guid = 22)
      LocalObject(1197, Locker.Constructor(Vector3(3068.26f, 3894.982f, 59.5276f)), owning_building_guid = 22)
      LocalObject(1198, Locker.Constructor(Vector3(3068.26f, 3896.016f, 59.5276f)), owning_building_guid = 22)
      LocalObject(
        166,
        Terminal.Constructor(Vector3(3052.276f, 3946.25f, 49.51759f), cert_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        167,
        Terminal.Constructor(Vector3(3052.276f, 3953.575f, 49.51759f), cert_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        168,
        Terminal.Constructor(Vector3(3053.724f, 3944.802f, 49.51759f), cert_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        169,
        Terminal.Constructor(Vector3(3053.724f, 3955.023f, 49.51759f), cert_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        170,
        Terminal.Constructor(Vector3(3066.424f, 3944.802f, 49.51759f), cert_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        171,
        Terminal.Constructor(Vector3(3066.424f, 3955.023f, 49.51759f), cert_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        172,
        Terminal.Constructor(Vector3(3067.872f, 3946.25f, 49.51759f), cert_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        173,
        Terminal.Constructor(Vector3(3067.872f, 3953.575f, 49.51759f), cert_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        1359,
        Terminal.Constructor(Vector3(3039.972f, 3907.526f, 60.82259f), order_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        1360,
        Terminal.Constructor(Vector3(3068.654f, 3905.408f, 51.1176f), order_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        1361,
        Terminal.Constructor(Vector3(3068.654f, 3909.139f, 51.1176f), order_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        1362,
        Terminal.Constructor(Vector3(3068.654f, 3912.928f, 51.1176f), order_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        1958,
        Terminal.Constructor(Vector3(3010f, 3897.407f, 51.14059f), spawn_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        1959,
        Terminal.Constructor(Vector3(3033.91f, 3841.41f, 53.64059f), spawn_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        1960,
        Terminal.Constructor(Vector3(3049.407f, 3962f, 51.14059f), spawn_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        1961,
        Terminal.Constructor(Vector3(3051.905f, 3884.359f, 61.10659f), spawn_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        1962,
        Terminal.Constructor(Vector3(3054.971f, 3901.243f, 51.66159f), spawn_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        1963,
        Terminal.Constructor(Vector3(3054.967f, 3908.535f, 51.66159f), spawn_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        1964,
        Terminal.Constructor(Vector3(3054.97f, 3915.823f, 51.66159f), spawn_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        2133,
        Terminal.Constructor(Vector3(3087.628f, 3834.814f, 61.8326f), vehicle_terminal_combined),
        owning_building_guid = 22
      )
      LocalObject(
        1311,
        VehicleSpawnPad.Constructor(Vector3(3073.989f, 3834.724f, 57.67459f), mb_pad_creation, Vector3(0, 0, -90)),
        owning_building_guid = 22,
        terminal_guid = 2133
      )
      LocalObject(1848, ResourceSilo.Constructor(Vector3(2989.733f, 3948.852f, 66.54459f)), owning_building_guid = 22)
      LocalObject(
        1869,
        SpawnTube.Constructor(Vector3(3054.233f, 3902.683f, 49.5276f), Vector3(0, 0, 0)),
        owning_building_guid = 22
      )
      LocalObject(
        1870,
        SpawnTube.Constructor(Vector3(3054.233f, 3909.974f, 49.5276f), Vector3(0, 0, 0)),
        owning_building_guid = 22
      )
      LocalObject(
        1871,
        SpawnTube.Constructor(Vector3(3054.233f, 3917.262f, 49.5276f), Vector3(0, 0, 0)),
        owning_building_guid = 22
      )
      LocalObject(
        119,
        ProximityTerminal.Constructor(Vector3(3051.983f, 3890.892f, 59.3376f), adv_med_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        1326,
        ProximityTerminal.Constructor(Vector3(3077.642f, 3901.952f, 49.5276f), medical_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        1528,
        ProximityTerminal.Constructor(Vector3(3031.883f, 3836.061f, 69.82059f), pad_landing_frame),
        owning_building_guid = 22
      )
      LocalObject(
        1529,
        Terminal.Constructor(Vector3(3031.883f, 3836.061f, 69.82059f), air_rearm_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        1531,
        ProximityTerminal.Constructor(Vector3(3035.101f, 3951.651f, 67.8696f), pad_landing_frame),
        owning_building_guid = 22
      )
      LocalObject(
        1532,
        Terminal.Constructor(Vector3(3035.101f, 3951.651f, 67.8696f), air_rearm_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        1534,
        ProximityTerminal.Constructor(Vector3(3048.198f, 3828.777f, 67.87959f), pad_landing_frame),
        owning_building_guid = 22
      )
      LocalObject(
        1535,
        Terminal.Constructor(Vector3(3048.198f, 3828.777f, 67.87959f), air_rearm_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        1537,
        ProximityTerminal.Constructor(Vector3(3051.323f, 3943.253f, 69.8596f), pad_landing_frame),
        owning_building_guid = 22
      )
      LocalObject(
        1538,
        Terminal.Constructor(Vector3(3051.323f, 3943.253f, 69.8596f), air_rearm_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        1790,
        ProximityTerminal.Constructor(Vector3(3014.525f, 3813.154f, 59.2776f), repair_silo),
        owning_building_guid = 22
      )
      LocalObject(
        1791,
        Terminal.Constructor(Vector3(3014.525f, 3813.154f, 59.2776f), ground_rearm_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        1794,
        ProximityTerminal.Constructor(Vector3(3102.53f, 3913.861f, 59.2776f), repair_silo),
        owning_building_guid = 22
      )
      LocalObject(
        1795,
        Terminal.Constructor(Vector3(3102.53f, 3913.861f, 59.2776f), ground_rearm_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        1241,
        FacilityTurret.Constructor(Vector3(2978.392f, 3978.472f, 67.9296f), manned_turret),
        owning_building_guid = 22
      )
      TurretToWeapon(1241, 5020)
      LocalObject(
        1242,
        FacilityTurret.Constructor(Vector3(2978.4f, 3801.379f, 67.9296f), manned_turret),
        owning_building_guid = 22
      )
      TurretToWeapon(1242, 5021)
      LocalObject(
        1244,
        FacilityTurret.Constructor(Vector3(3071.665f, 3979.605f, 67.9296f), manned_turret),
        owning_building_guid = 22
      )
      TurretToWeapon(1244, 5022)
      LocalObject(
        1245,
        FacilityTurret.Constructor(Vector3(3113.626f, 3801.371f, 67.9296f), manned_turret),
        owning_building_guid = 22
      )
      TurretToWeapon(1245, 5023)
      LocalObject(
        1246,
        FacilityTurret.Constructor(Vector3(3114.813f, 3936.496f, 67.9296f), manned_turret),
        owning_building_guid = 22
      )
      TurretToWeapon(1246, 5024)
      LocalObject(
        681,
        ImplantTerminalMech.Constructor(Vector3(3060.066f, 3942.368f, 49.0046f)),
        owning_building_guid = 22
      )
      LocalObject(
        675,
        Terminal.Constructor(Vector3(3060.066f, 3942.386f, 49.0046f), implant_terminal_interface),
        owning_building_guid = 22
      )
      TerminalToInterface(681, 675)
      LocalObject(
        682,
        ImplantTerminalMech.Constructor(Vector3(3060.054f, 3957.724f, 49.0046f)),
        owning_building_guid = 22
      )
      LocalObject(
        676,
        Terminal.Constructor(Vector3(3060.054f, 3957.706f, 49.0046f), implant_terminal_interface),
        owning_building_guid = 22
      )
      TerminalToInterface(682, 676)
      LocalObject(
        1659,
        Painbox.Constructor(Vector3(3055.594f, 3878.334f, 73.5564f), painbox),
        owning_building_guid = 22
      )
      LocalObject(
        1668,
        Painbox.Constructor(Vector3(3064.753f, 3905.712f, 53.5975f), painbox_continuous),
        owning_building_guid = 22
      )
      LocalObject(
        1677,
        Painbox.Constructor(Vector3(3054.182f, 3892.798f, 73.7615f), painbox_door_radius),
        owning_building_guid = 22
      )
      LocalObject(
        1690,
        Painbox.Constructor(Vector3(3060.54f, 3895.793f, 51.8835f), painbox_door_radius_continuous),
        owning_building_guid = 22
      )
      LocalObject(
        1691,
        Painbox.Constructor(Vector3(3062.515f, 3923.831f, 51.24179f), painbox_door_radius_continuous),
        owning_building_guid = 22
      )
      LocalObject(
        1692,
        Painbox.Constructor(Vector3(3077.882f, 3917.05f, 53.0685f), painbox_door_radius_continuous),
        owning_building_guid = 22
      )
      LocalObject(221, Generator.Constructor(Vector3(3054.025f, 3874.445f, 68.2336f)), owning_building_guid = 22)
      LocalObject(
        212,
        Terminal.Constructor(Vector3(3053.978f, 3882.637f, 69.5276f), gen_control),
        owning_building_guid = 22
      )
    }

    Building13()

    def Building13(): Unit = { // Name: Zal Type: cryo_facility GUID: 25, MapID: 13
      LocalBuilding(
        "Zal",
        25,
        13,
        FoundationBuilder(
          Building.Structure(
            StructureType.Facility,
            Vector3(3970f, 2242f, 61.23898f),
            Vector3(0f, 0f, 227f),
            cryo_facility
          )
        )
      )
      LocalObject(
        162,
        CaptureTerminal.Constructor(Vector3(4032.501f, 2222.124f, 51.23898f), capture_terminal),
        owning_building_guid = 25
      )
      LocalObject(335, Door.Constructor(Vector3(3880.892f, 2281.341f, 62.75998f)), owning_building_guid = 25)
      LocalObject(338, Door.Constructor(Vector3(3893.324f, 2281.369f, 62.78997f)), owning_building_guid = 25)
      LocalObject(340, Door.Constructor(Vector3(3898.193f, 2239.327f, 70.75397f)), owning_building_guid = 25)
      LocalObject(342, Door.Constructor(Vector3(3905.732f, 2294.675f, 70.75397f)), owning_building_guid = 25)
      LocalObject(344, Door.Constructor(Vector3(3911.499f, 2226.919f, 62.78997f)), owning_building_guid = 25)
      LocalObject(353, Door.Constructor(Vector3(3969.566f, 2236.935f, 72.75998f)), owning_building_guid = 25)
      LocalObject(354, Door.Constructor(Vector3(3995.539f, 2240.062f, 72.75998f)), owning_building_guid = 25)
      LocalObject(355, Door.Constructor(Vector3(4013.513f, 2282.064f, 62.78997f)), owning_building_guid = 25)
      LocalObject(356, Door.Constructor(Vector3(4026.819f, 2269.656f, 70.75397f)), owning_building_guid = 25)
      LocalObject(357, Door.Constructor(Vector3(4036.047f, 2213.408f, 70.75397f)), owning_building_guid = 25)
      LocalObject(358, Door.Constructor(Vector3(4048.454f, 2226.714f, 62.78997f)), owning_building_guid = 25)
      LocalObject(570, Door.Constructor(Vector3(3913.825f, 2310.792f, 55.25998f)), owning_building_guid = 25)
      LocalObject(576, Door.Constructor(Vector3(3942.684f, 2294.819f, 55.25998f)), owning_building_guid = 25)
      LocalObject(578, Door.Constructor(Vector3(3949.522f, 2261.096f, 52.75998f)), owning_building_guid = 25)
      LocalObject(579, Door.Constructor(Vector3(3953.399f, 2312.174f, 55.25998f)), owning_building_guid = 25)
      LocalObject(580, Door.Constructor(Vector3(3956.557f, 2221.719f, 45.25998f)), owning_building_guid = 25)
      LocalObject(581, Door.Constructor(Vector3(3960.237f, 2278.451f, 52.75998f)), owning_building_guid = 25)
      LocalObject(582, Door.Constructor(Vector3(3961.421f, 2244.531f, 72.75998f)), owning_building_guid = 25)
      LocalObject(583, Door.Constructor(Vector3(3961.816f, 2233.224f, 52.75998f)), owning_building_guid = 25)
      LocalObject(584, Door.Constructor(Vector3(3967.075f, 2244.728f, 52.75998f)), owning_building_guid = 25)
      LocalObject(585, Door.Constructor(Vector3(3968.259f, 2210.808f, 52.75998f)), owning_building_guid = 25)
      LocalObject(586, Door.Constructor(Vector3(3978.184f, 2250.776f, 52.75998f)), owning_building_guid = 25)
      LocalObject(587, Door.Constructor(Vector3(3979.368f, 2216.856f, 52.75998f)), owning_building_guid = 25)
      LocalObject(588, Door.Constructor(Vector3(3993.96f, 2285.289f, 52.75998f)), owning_building_guid = 25)
      LocalObject(589, Door.Constructor(Vector3(3994.552f, 2268.329f, 52.75998f)), owning_building_guid = 25)
      LocalObject(590, Door.Constructor(Vector3(3995.539f, 2240.062f, 52.75998f)), owning_building_guid = 25)
      LocalObject(591, Door.Constructor(Vector3(3995.539f, 2240.062f, 62.75998f)), owning_building_guid = 25)
      LocalObject(592, Door.Constructor(Vector3(4006.451f, 2251.763f, 52.75998f)), owning_building_guid = 25)
      LocalObject(593, Door.Constructor(Vector3(4007.438f, 2223.496f, 52.75998f)), owning_building_guid = 25)
      LocalObject(594, Door.Constructor(Vector3(4008.03f, 2206.536f, 52.75998f)), owning_building_guid = 25)
      LocalObject(595, Door.Constructor(Vector3(4023.806f, 2241.049f, 52.75998f)), owning_building_guid = 25)
      LocalObject(596, Door.Constructor(Vector3(4030.644f, 2207.326f, 52.75998f)), owning_building_guid = 25)
      LocalObject(597, Door.Constructor(Vector3(4036.1f, 2213.177f, 52.75998f)), owning_building_guid = 25)
      LocalObject(598, Door.Constructor(Vector3(4041.556f, 2219.027f, 52.75998f)), owning_building_guid = 25)
      LocalObject(665, Door.Constructor(Vector3(3985.622f, 2221.974f, 63.52198f)), owning_building_guid = 25)
      LocalObject(671, Door.Constructor(Vector3(3961.816f, 2233.224f, 62.75998f)), owning_building_guid = 25)
      LocalObject(672, Door.Constructor(Vector3(3978.579f, 2239.469f, 62.75798f)), owning_building_guid = 25)
      LocalObject(2039, Door.Constructor(Vector3(3971.006f, 2234.673f, 53.09298f)), owning_building_guid = 25)
      LocalObject(2040, Door.Constructor(Vector3(3976.34f, 2229.699f, 53.09298f)), owning_building_guid = 25)
      LocalObject(2041, Door.Constructor(Vector3(3981.67f, 2224.728f, 53.09298f)), owning_building_guid = 25)
      LocalObject(
        701,
        IFFLock.Constructor(Vector3(3989.823f, 2222.462f, 62.72097f), Vector3(0, 0, 133)),
        owning_building_guid = 25,
        door_guid = 665
      )
      LocalObject(
        791,
        IFFLock.Constructor(Vector3(3881.83f, 2279.353f, 62.69098f), Vector3(0, 0, 223)),
        owning_building_guid = 25,
        door_guid = 335
      )
      LocalObject(
        797,
        IFFLock.Constructor(Vector3(3955.96f, 2223.384f, 45.07497f), Vector3(0, 0, 43)),
        owning_building_guid = 25,
        door_guid = 580
      )
      LocalObject(
        798,
        IFFLock.Constructor(Vector3(3960.152f, 2232.626f, 52.57497f), Vector3(0, 0, 313)),
        owning_building_guid = 25,
        door_guid = 583
      )
      LocalObject(
        799,
        IFFLock.Constructor(Vector3(3971.562f, 2237.872f, 72.69098f), Vector3(0, 0, 133)),
        owning_building_guid = 25,
        door_guid = 353
      )
      LocalObject(
        800,
        IFFLock.Constructor(Vector3(3981.033f, 2217.453f, 52.57497f), Vector3(0, 0, 133)),
        owning_building_guid = 25,
        door_guid = 587
      )
      LocalObject(
        801,
        IFFLock.Constructor(Vector3(3996.478f, 2238.073f, 72.69098f), Vector3(0, 0, 223)),
        owning_building_guid = 25,
        door_guid = 354
      )
      LocalObject(
        802,
        IFFLock.Constructor(Vector3(4036.695f, 2211.51f, 52.57497f), Vector3(0, 0, 223)),
        owning_building_guid = 25,
        door_guid = 597
      )
      LocalObject(
        803,
        IFFLock.Constructor(Vector3(4041.047f, 2220.787f, 52.57497f), Vector3(0, 0, 43)),
        owning_building_guid = 25,
        door_guid = 598
      )
      LocalObject(1021, Locker.Constructor(Vector3(3945.743f, 2212.527f, 51.14698f)), owning_building_guid = 25)
      LocalObject(1022, Locker.Constructor(Vector3(3946.463f, 2213.299f, 51.14698f)), owning_building_guid = 25)
      LocalObject(1023, Locker.Constructor(Vector3(3947.186f, 2214.074f, 51.14698f)), owning_building_guid = 25)
      LocalObject(1024, Locker.Constructor(Vector3(3947.905f, 2214.846f, 51.14698f)), owning_building_guid = 25)
      LocalObject(1025, Locker.Constructor(Vector3(3948.625f, 2215.617f, 51.14698f)), owning_building_guid = 25)
      LocalObject(1026, Locker.Constructor(Vector3(3949.345f, 2216.39f, 51.14698f)), owning_building_guid = 25)
      LocalObject(1027, Locker.Constructor(Vector3(3958.592f, 2226.627f, 51.49998f)), owning_building_guid = 25)
      LocalObject(1028, Locker.Constructor(Vector3(3959.376f, 2227.468f, 51.49998f)), owning_building_guid = 25)
      LocalObject(1029, Locker.Constructor(Vector3(3960.158f, 2228.306f, 51.49998f)), owning_building_guid = 25)
      LocalObject(1030, Locker.Constructor(Vector3(3960.373f, 2198.889f, 51.14698f)), owning_building_guid = 25)
      LocalObject(1031, Locker.Constructor(Vector3(3960.952f, 2229.158f, 51.49998f)), owning_building_guid = 25)
      LocalObject(1032, Locker.Constructor(Vector3(3961.093f, 2199.661f, 51.14698f)), owning_building_guid = 25)
      LocalObject(1033, Locker.Constructor(Vector3(3961.813f, 2200.433f, 51.14698f)), owning_building_guid = 25)
      LocalObject(1034, Locker.Constructor(Vector3(3962.532f, 2201.204f, 51.14698f)), owning_building_guid = 25)
      LocalObject(1035, Locker.Constructor(Vector3(3963.256f, 2201.98f, 51.14698f)), owning_building_guid = 25)
      LocalObject(1036, Locker.Constructor(Vector3(3963.975f, 2202.751f, 51.14698f)), owning_building_guid = 25)
      LocalObject(1037, Locker.Constructor(Vector3(3992.561f, 2193.619f, 51.23397f)), owning_building_guid = 25)
      LocalObject(1038, Locker.Constructor(Vector3(3993.48f, 2192.762f, 51.23397f)), owning_building_guid = 25)
      LocalObject(1039, Locker.Constructor(Vector3(3994.402f, 2191.902f, 51.23397f)), owning_building_guid = 25)
      LocalObject(1040, Locker.Constructor(Vector3(3995.325f, 2191.042f, 51.23397f)), owning_building_guid = 25)
      LocalObject(1041, Locker.Constructor(Vector3(3996.241f, 2190.188f, 51.23397f)), owning_building_guid = 25)
      LocalObject(1199, Locker.Constructor(Vector3(3948.615f, 2236.975f, 61.23898f)), owning_building_guid = 25)
      LocalObject(1200, Locker.Constructor(Vector3(3949.371f, 2236.27f, 61.23898f)), owning_building_guid = 25)
      LocalObject(1201, Locker.Constructor(Vector3(3951.212f, 2234.553f, 61.00998f)), owning_building_guid = 25)
      LocalObject(1202, Locker.Constructor(Vector3(3951.968f, 2233.848f, 61.00998f)), owning_building_guid = 25)
      LocalObject(1203, Locker.Constructor(Vector3(3952.739f, 2233.129f, 61.00998f)), owning_building_guid = 25)
      LocalObject(1204, Locker.Constructor(Vector3(3953.495f, 2232.424f, 61.00998f)), owning_building_guid = 25)
      LocalObject(1205, Locker.Constructor(Vector3(3955.34f, 2230.704f, 61.23898f)), owning_building_guid = 25)
      LocalObject(1206, Locker.Constructor(Vector3(3956.096f, 2229.999f, 61.23898f)), owning_building_guid = 25)
      LocalObject(
        174,
        Terminal.Constructor(Vector3(3993.099f, 2196.023f, 51.22897f), cert_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        175,
        Terminal.Constructor(Vector3(3993.028f, 2198.069f, 51.22897f), cert_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        176,
        Terminal.Constructor(Vector3(3998.456f, 2191.027f, 51.22897f), cert_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        177,
        Terminal.Constructor(Vector3(4000.503f, 2191.099f, 51.22897f), cert_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        178,
        Terminal.Constructor(Vector3(4001.689f, 2207.358f, 51.22897f), cert_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        179,
        Terminal.Constructor(Vector3(4003.736f, 2207.429f, 51.22897f), cert_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        180,
        Terminal.Constructor(Vector3(4009.093f, 2202.433f, 51.22897f), cert_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        181,
        Terminal.Constructor(Vector3(4009.164f, 2200.387f, 51.22897f), cert_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        1390,
        Terminal.Constructor(Vector3(3962.696f, 2223.305f, 52.82898f), order_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        1391,
        Terminal.Constructor(Vector3(3965.425f, 2220.76f, 52.82898f), order_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        1392,
        Terminal.Constructor(Vector3(3968.196f, 2218.177f, 52.82898f), order_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        1393,
        Terminal.Constructor(Vector3(3983.806f, 2242.837f, 62.53397f), order_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        1980,
        Terminal.Constructor(Vector3(3939.586f, 2292.362f, 55.35197f), spawn_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        1981,
        Terminal.Constructor(Vector3(3958.724f, 2249.91f, 62.81797f), spawn_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        1982,
        Terminal.Constructor(Vector3(3968.981f, 2236.153f, 53.37297f), spawn_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        1983,
        Terminal.Constructor(Vector3(3974.317f, 2231.183f, 53.37297f), spawn_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        1984,
        Terminal.Constructor(Vector3(3979.646f, 2226.21f, 53.37297f), spawn_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        1985,
        Terminal.Constructor(Vector3(3996.846f, 2271.659f, 52.85197f), spawn_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        1986,
        Terminal.Constructor(Vector3(4017.211f, 2198.786f, 52.85197f), spawn_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        2136,
        Terminal.Constructor(Vector3(3898.126f, 2257.573f, 63.54398f), vehicle_terminal_combined),
        owning_building_guid = 25
      )
      LocalObject(
        1314,
        VehicleSpawnPad.Constructor(Vector3(3907.362f, 2267.61f, 59.38597f), mb_pad_creation, Vector3(0, 0, 43)),
        owning_building_guid = 25,
        terminal_guid = 2136
      )
      LocalObject(1851, ResourceSilo.Constructor(Vector3(4048.293f, 2251.396f, 68.25597f)), owning_building_guid = 25)
      LocalObject(
        1886,
        SpawnTube.Constructor(Vector3(3970.538f, 2235.71f, 51.23898f), Vector3(0, 0, 133)),
        owning_building_guid = 25
      )
      LocalObject(
        1887,
        SpawnTube.Constructor(Vector3(3975.87f, 2230.738f, 51.23898f), Vector3(0, 0, 133)),
        owning_building_guid = 25
      )
      LocalObject(
        1888,
        SpawnTube.Constructor(Vector3(3981.2f, 2225.768f, 51.23898f), Vector3(0, 0, 133)),
        owning_building_guid = 25
      )
      LocalObject(
        120,
        ProximityTerminal.Constructor(Vector3(3963.449f, 2245.397f, 61.04898f), adv_med_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        1331,
        ProximityTerminal.Constructor(Vector3(3954.039f, 2219.089f, 51.23898f), medical_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        1552,
        ProximityTerminal.Constructor(Vector3(3920.603f, 2290.528f, 69.59097f), pad_landing_frame),
        owning_building_guid = 25
      )
      LocalObject(
        1553,
        Terminal.Constructor(Vector3(3920.603f, 2290.528f, 69.59097f), air_rearm_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        1558,
        ProximityTerminal.Constructor(Vector3(3937.056f, 2297.492f, 71.53197f), pad_landing_frame),
        owning_building_guid = 25
      )
      LocalObject(
        1559,
        Terminal.Constructor(Vector3(3937.056f, 2297.492f, 71.53197f), air_rearm_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        1561,
        ProximityTerminal.Constructor(Vector3(4002.194f, 2210.17f, 71.57098f), pad_landing_frame),
        owning_building_guid = 25
      )
      LocalObject(
        1562,
        Terminal.Constructor(Vector3(4002.194f, 2210.17f, 71.57098f), air_rearm_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        1564,
        ProximityTerminal.Constructor(Vector3(4019.399f, 2216.307f, 69.58098f), pad_landing_frame),
        owning_building_guid = 25
      )
      LocalObject(
        1565,
        Terminal.Constructor(Vector3(4019.399f, 2216.307f, 69.58098f), air_rearm_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        1810,
        ProximityTerminal.Constructor(Vector3(3932.142f, 2325.81f, 60.98898f), repair_silo),
        owning_building_guid = 25
      )
      LocalObject(
        1811,
        Terminal.Constructor(Vector3(3932.142f, 2325.81f, 60.98898f), ground_rearm_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        1814,
        ProximityTerminal.Constructor(Vector3(3945.775f, 2192.765f, 60.98898f), repair_silo),
        owning_building_guid = 25
      )
      LocalObject(
        1815,
        Terminal.Constructor(Vector3(3945.775f, 2192.765f, 60.98898f), ground_rearm_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        1263,
        FacilityTurret.Constructor(Vector3(3855.937f, 2261.368f, 69.64098f), manned_turret),
        owning_building_guid = 25
      )
      TurretToWeapon(1263, 5025)
      LocalObject(
        1266,
        FacilityTurret.Constructor(Vector3(3948.167f, 2360.26f, 69.64098f), manned_turret),
        owning_building_guid = 25
      )
      TurretToWeapon(1266, 5026)
      LocalObject(
        1267,
        FacilityTurret.Constructor(Vector3(3953.952f, 2168.344f, 69.64098f), manned_turret),
        owning_building_guid = 25
      )
      TurretToWeapon(1267, 5027)
      LocalObject(
        1270,
        FacilityTurret.Constructor(Vector3(4014.907f, 2170.501f, 69.64098f), manned_turret),
        owning_building_guid = 25
      )
      TurretToWeapon(1270, 5028)
      LocalObject(
        1272,
        FacilityTurret.Constructor(Vector3(4077.69f, 2239.489f, 69.64098f), manned_turret),
        owning_building_guid = 25
      )
      TurretToWeapon(1272, 5029)
      LocalObject(
        683,
        ImplantTerminalMech.Constructor(Vector3(3995.584f, 2204.379f, 50.71598f)),
        owning_building_guid = 25
      )
      LocalObject(
        677,
        Terminal.Constructor(Vector3(3995.597f, 2204.367f, 50.71598f), implant_terminal_interface),
        owning_building_guid = 25
      )
      TerminalToInterface(683, 677)
      LocalObject(
        684,
        ImplantTerminalMech.Constructor(Vector3(4006.823f, 2193.915f, 50.71598f)),
        owning_building_guid = 25
      )
      LocalObject(
        678,
        Terminal.Constructor(Vector3(4006.809f, 2193.927f, 50.71598f), implant_terminal_interface),
        owning_building_guid = 25
      )
      TerminalToInterface(684, 678)
      LocalObject(
        1662,
        Painbox.Constructor(Vector3(3951.802f, 2251.322f, 75.26778f), painbox),
        owning_building_guid = 25
      )
      LocalObject(
        1671,
        Painbox.Constructor(Vector3(3965.579f, 2225.951f, 55.30888f), painbox_continuous),
        owning_building_guid = 25
      )
      LocalObject(
        1680,
        Painbox.Constructor(Vector3(3963.343f, 2242.489f, 75.47288f), painbox_door_radius),
        owning_building_guid = 25
      )
      LocalObject(
        1699,
        Painbox.Constructor(Vector3(3961.198f, 2235.797f, 53.59488f), painbox_door_radius_continuous),
        owning_building_guid = 25
      )
      LocalObject(
        1700,
        Painbox.Constructor(Vector3(3964.917f, 2208.616f, 54.77988f), painbox_door_radius_continuous),
        owning_building_guid = 25
      )
      LocalObject(
        1701,
        Painbox.Constructor(Vector3(3980.356f, 2215.23f, 52.95317f), painbox_door_radius_continuous),
        owning_building_guid = 25
      )
      LocalObject(224, Generator.Constructor(Vector3(3950.028f, 2255.121f, 69.94498f)), owning_building_guid = 25)
      LocalObject(
        215,
        Terminal.Constructor(Vector3(3956.051f, 2249.568f, 71.23898f), gen_control),
        owning_building_guid = 25
      )
    }

    Building12()

    def Building12(): Unit = { // Name: Yazata Type: cryo_facility GUID: 28, MapID: 12
      LocalBuilding(
        "Yazata",
        28,
        12,
        FoundationBuilder(
          Building.Structure(
            StructureType.Facility,
            Vector3(4680f, 3934f, 61.7468f),
            Vector3(0f, 0f, 90f),
            cryo_facility
          )
        )
      )
      LocalObject(
        163,
        CaptureTerminal.Constructor(Vector3(4620.734f, 3905.911f, 51.7468f), capture_terminal),
        owning_building_guid = 28
      )
      LocalObject(380, Door.Constructor(Vector3(4612.197f, 3891.674f, 63.2978f)), owning_building_guid = 28)
      LocalObject(381, Door.Constructor(Vector3(4612.197f, 3909.867f, 71.2618f)), owning_building_guid = 28)
      LocalObject(386, Door.Constructor(Vector3(4657.307f, 3875.023f, 71.2618f)), owning_building_guid = 28)
      LocalObject(387, Door.Constructor(Vector3(4660f, 3918f, 73.26781f)), owning_building_guid = 28)
      LocalObject(388, Door.Constructor(Vector3(4675.5f, 3875.023f, 63.2978f)), owning_building_guid = 28)
      LocalObject(389, Door.Constructor(Vector3(4676.863f, 3938f, 73.26781f)), owning_building_guid = 28)
      LocalObject(394, Door.Constructor(Vector3(4712.5f, 3984.927f, 63.2978f)), owning_building_guid = 28)
      LocalObject(397, Door.Constructor(Vector3(4730.693f, 3984.927f, 71.2618f)), owning_building_guid = 28)
      LocalObject(401, Door.Constructor(Vector3(4762.927f, 3939.307f, 71.2618f)), owning_building_guid = 28)
      LocalObject(402, Door.Constructor(Vector3(4762.927f, 3957.5f, 63.2978f)), owning_building_guid = 28)
      LocalObject(404, Door.Constructor(Vector3(4772f, 3966f, 63.2678f)), owning_building_guid = 28)
      LocalObject(599, Door.Constructor(Vector3(4612f, 3902f, 53.2678f)), owning_building_guid = 28)
      LocalObject(600, Door.Constructor(Vector3(4612f, 3910f, 53.2678f)), owning_building_guid = 28)
      LocalObject(601, Door.Constructor(Vector3(4612f, 3918f, 53.2678f)), owning_building_guid = 28)
      LocalObject(602, Door.Constructor(Vector3(4628f, 3934f, 53.2678f)), owning_building_guid = 28)
      LocalObject(603, Door.Constructor(Vector3(4640f, 3898f, 53.2678f)), owning_building_guid = 28)
      LocalObject(604, Door.Constructor(Vector3(4640f, 3922f, 53.2678f)), owning_building_guid = 28)
      LocalObject(605, Door.Constructor(Vector3(4656f, 3946f, 53.2678f)), owning_building_guid = 28)
      LocalObject(606, Door.Constructor(Vector3(4660f, 3902f, 53.2678f)), owning_building_guid = 28)
      LocalObject(607, Door.Constructor(Vector3(4660f, 3918f, 53.2678f)), owning_building_guid = 28)
      LocalObject(608, Door.Constructor(Vector3(4660f, 3918f, 63.2678f)), owning_building_guid = 28)
      LocalObject(609, Door.Constructor(Vector3(4660f, 3958f, 53.2678f)), owning_building_guid = 28)
      LocalObject(610, Door.Constructor(Vector3(4676f, 3958f, 45.7678f)), owning_building_guid = 28)
      LocalObject(611, Door.Constructor(Vector3(4680f, 3898f, 53.2678f)), owning_building_guid = 28)
      LocalObject(612, Door.Constructor(Vector3(4680f, 3922f, 53.2678f)), owning_building_guid = 28)
      LocalObject(613, Door.Constructor(Vector3(4680f, 3946f, 53.2678f)), owning_building_guid = 28)
      LocalObject(614, Door.Constructor(Vector3(4684f, 3934f, 53.2678f)), owning_building_guid = 28)
      LocalObject(615, Door.Constructor(Vector3(4688f, 3938f, 73.26781f)), owning_building_guid = 28)
      LocalObject(616, Door.Constructor(Vector3(4692f, 3886f, 53.2678f)), owning_building_guid = 28)
      LocalObject(619, Door.Constructor(Vector3(4708f, 3934f, 53.2678f)), owning_building_guid = 28)
      LocalObject(623, Door.Constructor(Vector3(4712f, 3914f, 53.2678f)), owning_building_guid = 28)
      LocalObject(631, Door.Constructor(Vector3(4736f, 3914f, 55.7678f)), owning_building_guid = 28)
      LocalObject(634, Door.Constructor(Vector3(4740f, 3894f, 55.7678f)), owning_building_guid = 28)
      LocalObject(638, Door.Constructor(Vector3(4768f, 3922f, 55.7678f)), owning_building_guid = 28)
      LocalObject(666, Door.Constructor(Vector3(4654.917f, 3937.992f, 64.0298f)), owning_building_guid = 28)
      LocalObject(673, Door.Constructor(Vector3(4672f, 3930f, 63.2658f)), owning_building_guid = 28)
      LocalObject(674, Door.Constructor(Vector3(4680f, 3946f, 63.2678f)), owning_building_guid = 28)
      LocalObject(2052, Door.Constructor(Vector3(4659.685f, 3938.673f, 53.6008f)), owning_building_guid = 28)
      LocalObject(2053, Door.Constructor(Vector3(4666.974f, 3938.673f, 53.6008f)), owning_building_guid = 28)
      LocalObject(2054, Door.Constructor(Vector3(4674.267f, 3938.673f, 53.6008f)), owning_building_guid = 28)
      LocalObject(
        702,
        IFFLock.Constructor(Vector3(4652.178f, 3934.77f, 63.2288f), Vector3(0, 0, 270)),
        owning_building_guid = 28,
        door_guid = 666
      )
      LocalObject(
        824,
        IFFLock.Constructor(Vector3(4610.428f, 3910.813f, 53.0828f), Vector3(0, 0, 0)),
        owning_building_guid = 28,
        door_guid = 600
      )
      LocalObject(
        825,
        IFFLock.Constructor(Vector3(4613.572f, 3901.06f, 53.0828f), Vector3(0, 0, 180)),
        owning_building_guid = 28,
        door_guid = 599
      )
      LocalObject(
        830,
        IFFLock.Constructor(Vector3(4655.19f, 3944.428f, 53.0828f), Vector3(0, 0, 270)),
        owning_building_guid = 28,
        door_guid = 605
      )
      LocalObject(
        831,
        IFFLock.Constructor(Vector3(4657.957f, 3918.814f, 73.19881f), Vector3(0, 0, 0)),
        owning_building_guid = 28,
        door_guid = 387
      )
      LocalObject(
        832,
        IFFLock.Constructor(Vector3(4676.042f, 3935.954f, 73.19881f), Vector3(0, 0, 270)),
        owning_building_guid = 28,
        door_guid = 389
      )
      LocalObject(
        833,
        IFFLock.Constructor(Vector3(4677.572f, 3957.19f, 45.5828f), Vector3(0, 0, 180)),
        owning_building_guid = 28,
        door_guid = 610
      )
      LocalObject(
        834,
        IFFLock.Constructor(Vector3(4680.81f, 3947.572f, 53.0828f), Vector3(0, 0, 90)),
        owning_building_guid = 28,
        door_guid = 613
      )
      LocalObject(
        843,
        IFFLock.Constructor(Vector3(4769.958f, 3966.814f, 63.1988f), Vector3(0, 0, 0)),
        owning_building_guid = 28,
        door_guid = 404
      )
      LocalObject(1074, Locker.Constructor(Vector3(4625.473f, 3953.997f, 51.7418f)), owning_building_guid = 28)
      LocalObject(1075, Locker.Constructor(Vector3(4626.725f, 3953.997f, 51.7418f)), owning_building_guid = 28)
      LocalObject(1076, Locker.Constructor(Vector3(4627.987f, 3953.997f, 51.7418f)), owning_building_guid = 28)
      LocalObject(1077, Locker.Constructor(Vector3(4629.248f, 3953.997f, 51.7418f)), owning_building_guid = 28)
      LocalObject(1078, Locker.Constructor(Vector3(4630.504f, 3953.997f, 51.7418f)), owning_building_guid = 28)
      LocalObject(1083, Locker.Constructor(Vector3(4657.639f, 3966.814f, 51.6548f)), owning_building_guid = 28)
      LocalObject(1084, Locker.Constructor(Vector3(4657.639f, 3967.868f, 51.6548f)), owning_building_guid = 28)
      LocalObject(1085, Locker.Constructor(Vector3(4657.639f, 3968.929f, 51.6548f)), owning_building_guid = 28)
      LocalObject(1086, Locker.Constructor(Vector3(4657.639f, 3969.984f, 51.6548f)), owning_building_guid = 28)
      LocalObject(1087, Locker.Constructor(Vector3(4657.639f, 3971.039f, 51.6548f)), owning_building_guid = 28)
      LocalObject(1088, Locker.Constructor(Vector3(4657.639f, 3972.095f, 51.6548f)), owning_building_guid = 28)
      LocalObject(1093, Locker.Constructor(Vector3(4677.64f, 3966.817f, 51.6548f)), owning_building_guid = 28)
      LocalObject(1094, Locker.Constructor(Vector3(4677.64f, 3967.873f, 51.6548f)), owning_building_guid = 28)
      LocalObject(1095, Locker.Constructor(Vector3(4677.64f, 3968.928f, 51.6548f)), owning_building_guid = 28)
      LocalObject(1096, Locker.Constructor(Vector3(4677.64f, 3969.983f, 51.6548f)), owning_building_guid = 28)
      LocalObject(1097, Locker.Constructor(Vector3(4677.64f, 3971.043f, 51.6548f)), owning_building_guid = 28)
      LocalObject(1098, Locker.Constructor(Vector3(4677.64f, 3972.098f, 51.6548f)), owning_building_guid = 28)
      LocalObject(1099, Locker.Constructor(Vector3(4677.859f, 3949.563f, 52.0078f)), owning_building_guid = 28)
      LocalObject(1100, Locker.Constructor(Vector3(4677.859f, 3950.727f, 52.0078f)), owning_building_guid = 28)
      LocalObject(1101, Locker.Constructor(Vector3(4677.859f, 3951.874f, 52.0078f)), owning_building_guid = 28)
      LocalObject(1102, Locker.Constructor(Vector3(4677.859f, 3953.023f, 52.0078f)), owning_building_guid = 28)
      LocalObject(1207, Locker.Constructor(Vector3(4681.984f, 3952.26f, 61.7468f)), owning_building_guid = 28)
      LocalObject(1208, Locker.Constructor(Vector3(4683.018f, 3952.26f, 61.7468f)), owning_building_guid = 28)
      LocalObject(1209, Locker.Constructor(Vector3(4685.54f, 3952.26f, 61.5178f)), owning_building_guid = 28)
      LocalObject(1210, Locker.Constructor(Vector3(4686.574f, 3952.26f, 61.5178f)), owning_building_guid = 28)
      LocalObject(1211, Locker.Constructor(Vector3(4687.628f, 3952.26f, 61.5178f)), owning_building_guid = 28)
      LocalObject(1212, Locker.Constructor(Vector3(4688.662f, 3952.26f, 61.5178f)), owning_building_guid = 28)
      LocalObject(1213, Locker.Constructor(Vector3(4691.179f, 3952.26f, 61.7468f)), owning_building_guid = 28)
      LocalObject(1214, Locker.Constructor(Vector3(4692.213f, 3952.26f, 61.7468f)), owning_building_guid = 28)
      LocalObject(
        182,
        Terminal.Constructor(Vector3(4622.977f, 3937.724f, 51.7368f), cert_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        183,
        Terminal.Constructor(Vector3(4622.977f, 3950.424f, 51.7368f), cert_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        184,
        Terminal.Constructor(Vector3(4624.425f, 3936.276f, 51.7368f), cert_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        185,
        Terminal.Constructor(Vector3(4624.425f, 3951.872f, 51.7368f), cert_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        186,
        Terminal.Constructor(Vector3(4631.75f, 3936.276f, 51.7368f), cert_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        187,
        Terminal.Constructor(Vector3(4631.75f, 3951.872f, 51.7368f), cert_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        188,
        Terminal.Constructor(Vector3(4633.198f, 3937.724f, 51.7368f), cert_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        189,
        Terminal.Constructor(Vector3(4633.198f, 3950.424f, 51.7368f), cert_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1409,
        Terminal.Constructor(Vector3(4665.072f, 3952.654f, 53.3368f), order_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1410,
        Terminal.Constructor(Vector3(4668.861f, 3952.654f, 53.3368f), order_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1411,
        Terminal.Constructor(Vector3(4670.474f, 3923.972f, 63.0418f), order_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1412,
        Terminal.Constructor(Vector3(4672.592f, 3952.654f, 53.3368f), order_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1987,
        Terminal.Constructor(Vector3(4616f, 3933.407f, 53.3598f), spawn_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1988,
        Terminal.Constructor(Vector3(4662.177f, 3938.97f, 53.8808f), spawn_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1989,
        Terminal.Constructor(Vector3(4669.465f, 3938.967f, 53.8808f), spawn_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1990,
        Terminal.Constructor(Vector3(4676.757f, 3938.971f, 53.8808f), spawn_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1991,
        Terminal.Constructor(Vector3(4680.593f, 3894f, 53.3598f), spawn_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1992,
        Terminal.Constructor(Vector3(4693.641f, 3935.905f, 63.3258f), spawn_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1999,
        Terminal.Constructor(Vector3(4736.59f, 3917.91f, 55.8598f), spawn_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        2137,
        Terminal.Constructor(Vector3(4743.186f, 3971.628f, 64.0518f), vehicle_terminal_combined),
        owning_building_guid = 28
      )
      LocalObject(
        1316,
        VehicleSpawnPad.Constructor(Vector3(4743.276f, 3957.989f, 59.8938f), mb_pad_creation, Vector3(0, 0, 180)),
        owning_building_guid = 28,
        terminal_guid = 2137
      )
      LocalObject(1852, ResourceSilo.Constructor(Vector3(4629.148f, 3873.733f, 68.7638f)), owning_building_guid = 28)
      LocalObject(
        1899,
        SpawnTube.Constructor(Vector3(4660.738f, 3938.233f, 51.7468f), Vector3(0, 0, 270)),
        owning_building_guid = 28
      )
      LocalObject(
        1900,
        SpawnTube.Constructor(Vector3(4668.026f, 3938.233f, 51.7468f), Vector3(0, 0, 270)),
        owning_building_guid = 28
      )
      LocalObject(
        1901,
        SpawnTube.Constructor(Vector3(4675.317f, 3938.233f, 51.7468f), Vector3(0, 0, 270)),
        owning_building_guid = 28
      )
      LocalObject(
        121,
        ProximityTerminal.Constructor(Vector3(4687.108f, 3935.983f, 61.5568f), adv_med_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1332,
        ProximityTerminal.Constructor(Vector3(4676.048f, 3961.642f, 51.7468f), medical_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1567,
        ProximityTerminal.Constructor(Vector3(4626.349f, 3919.101f, 70.08881f), pad_landing_frame),
        owning_building_guid = 28
      )
      LocalObject(
        1568,
        Terminal.Constructor(Vector3(4626.349f, 3919.101f, 70.08881f), air_rearm_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1570,
        ProximityTerminal.Constructor(Vector3(4634.747f, 3935.323f, 72.0788f), pad_landing_frame),
        owning_building_guid = 28
      )
      LocalObject(
        1571,
        Terminal.Constructor(Vector3(4634.747f, 3935.323f, 72.0788f), air_rearm_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1585,
        ProximityTerminal.Constructor(Vector3(4741.939f, 3915.883f, 72.0398f), pad_landing_frame),
        owning_building_guid = 28
      )
      LocalObject(
        1586,
        Terminal.Constructor(Vector3(4741.939f, 3915.883f, 72.0398f), air_rearm_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1588,
        ProximityTerminal.Constructor(Vector3(4749.223f, 3932.198f, 70.0988f), pad_landing_frame),
        owning_building_guid = 28
      )
      LocalObject(
        1589,
        Terminal.Constructor(Vector3(4749.223f, 3932.198f, 70.0988f), air_rearm_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1826,
        ProximityTerminal.Constructor(Vector3(4664.139f, 3986.53f, 61.4968f), repair_silo),
        owning_building_guid = 28
      )
      LocalObject(
        1827,
        Terminal.Constructor(Vector3(4664.139f, 3986.53f, 61.4968f), ground_rearm_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1830,
        ProximityTerminal.Constructor(Vector3(4764.846f, 3898.525f, 61.4968f), repair_silo),
        owning_building_guid = 28
      )
      LocalObject(
        1831,
        Terminal.Constructor(Vector3(4764.846f, 3898.525f, 61.4968f), ground_rearm_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1276,
        FacilityTurret.Constructor(Vector3(4598.395f, 3955.665f, 70.1488f), manned_turret),
        owning_building_guid = 28
      )
      TurretToWeapon(1276, 5030)
      LocalObject(
        1277,
        FacilityTurret.Constructor(Vector3(4599.528f, 3862.392f, 70.1488f), manned_turret),
        owning_building_guid = 28
      )
      TurretToWeapon(1277, 5031)
      LocalObject(
        1280,
        FacilityTurret.Constructor(Vector3(4641.504f, 3998.813f, 70.1488f), manned_turret),
        owning_building_guid = 28
      )
      TurretToWeapon(1280, 5032)
      LocalObject(
        1285,
        FacilityTurret.Constructor(Vector3(4776.621f, 3862.4f, 70.1488f), manned_turret),
        owning_building_guid = 28
      )
      TurretToWeapon(1285, 5033)
      LocalObject(
        1286,
        FacilityTurret.Constructor(Vector3(4776.629f, 3997.626f, 70.1488f), manned_turret),
        owning_building_guid = 28
      )
      TurretToWeapon(1286, 5034)
      LocalObject(
        685,
        ImplantTerminalMech.Constructor(Vector3(4620.276f, 3944.054f, 51.2238f)),
        owning_building_guid = 28
      )
      LocalObject(
        679,
        Terminal.Constructor(Vector3(4620.294f, 3944.054f, 51.2238f), implant_terminal_interface),
        owning_building_guid = 28
      )
      TerminalToInterface(685, 679)
      LocalObject(
        686,
        ImplantTerminalMech.Constructor(Vector3(4635.632f, 3944.066f, 51.2238f)),
        owning_building_guid = 28
      )
      LocalObject(
        680,
        Terminal.Constructor(Vector3(4635.614f, 3944.066f, 51.2238f), implant_terminal_interface),
        owning_building_guid = 28
      )
      TerminalToInterface(686, 680)
      LocalObject(
        1663,
        Painbox.Constructor(Vector3(4699.666f, 3939.594f, 75.7756f), painbox),
        owning_building_guid = 28
      )
      LocalObject(
        1672,
        Painbox.Constructor(Vector3(4672.288f, 3948.753f, 55.8167f), painbox_continuous),
        owning_building_guid = 28
      )
      LocalObject(
        1681,
        Painbox.Constructor(Vector3(4685.202f, 3938.182f, 75.98071f), painbox_door_radius),
        owning_building_guid = 28
      )
      LocalObject(
        1702,
        Painbox.Constructor(Vector3(4654.169f, 3946.515f, 53.461f), painbox_door_radius_continuous),
        owning_building_guid = 28
      )
      LocalObject(
        1703,
        Painbox.Constructor(Vector3(4660.95f, 3961.882f, 55.2877f), painbox_door_radius_continuous),
        owning_building_guid = 28
      )
      LocalObject(
        1704,
        Painbox.Constructor(Vector3(4682.207f, 3944.54f, 54.1027f), painbox_door_radius_continuous),
        owning_building_guid = 28
      )
      LocalObject(225, Generator.Constructor(Vector3(4703.555f, 3938.025f, 70.4528f)), owning_building_guid = 28)
      LocalObject(
        216,
        Terminal.Constructor(Vector3(4695.363f, 3937.978f, 71.7468f), gen_control),
        owning_building_guid = 28
      )
    }

    Building24811()

    def Building24811(): Unit = { // Name: GW_Oshur_N Type: hst GUID: 32, MapID: 24811
      LocalBuilding(
        "GW_Oshur_N",
        32,
        24811,
        FoundationBuilder(WarpGate.Structure(Vector3(4033.39f, 5379.88f, 46.13f), hst))
      )
    }

    Building24815()

    def Building24815(): Unit = { // Name: GW_Oshur_S Type: hst GUID: 33, MapID: 24815
      LocalBuilding(
        "GW_Oshur_S",
        33,
        24815,
        FoundationBuilder(WarpGate.Structure(Vector3(6068.59f, 3165.49f, 31.65f), hst))
      )
    }

    Building9()

    def Building9(): Unit = { // Name: Jamshid Type: tech_plant GUID: 34, MapID: 9
      LocalBuilding(
        "Jamshid",
        34,
        9,
        FoundationBuilder(
          Building.Structure(StructureType.Facility, Vector3(2274f, 3448f, 52.4434f), Vector3(0f, 0f, 360f), tech_plant)
        )
      )
      LocalObject(
        157,
        CaptureTerminal.Constructor(Vector3(2278.734f, 3403.911f, 67.5434f), capture_terminal),
        owning_building_guid = 34
      )
      LocalObject(228, Door.Constructor(Vector3(2202.54f, 3377.929f, 53.9854f)), owning_building_guid = 34)
      LocalObject(229, Door.Constructor(Vector3(2202.54f, 3396.121f, 61.9484f)), owning_building_guid = 34)
      LocalObject(230, Door.Constructor(Vector3(2202.54f, 3451.673f, 53.9854f)), owning_building_guid = 34)
      LocalObject(231, Door.Constructor(Vector3(2202.54f, 3469.865f, 61.9484f)), owning_building_guid = 34)
      LocalObject(232, Door.Constructor(Vector3(2234f, 3348f, 54.0644f)), owning_building_guid = 34)
      LocalObject(233, Door.Constructor(Vector3(2260.412f, 3356.802f, 62.0574f)), owning_building_guid = 34)
      LocalObject(234, Door.Constructor(Vector3(2278.605f, 3356.802f, 54.0944f)), owning_building_guid = 34)
      LocalObject(235, Door.Constructor(Vector3(2284.597f, 3424.575f, 69.0644f)), owning_building_guid = 34)
      LocalObject(236, Door.Constructor(Vector3(2291.444f, 3408.574f, 69.0644f)), owning_building_guid = 34)
      LocalObject(237, Door.Constructor(Vector3(2298.559f, 3479.266f, 53.9854f)), owning_building_guid = 34)
      LocalObject(238, Door.Constructor(Vector3(2316.752f, 3479.266f, 61.9484f)), owning_building_guid = 34)
      LocalObject(243, Door.Constructor(Vector3(2353.02f, 3432.914f, 61.9484f)), owning_building_guid = 34)
      LocalObject(244, Door.Constructor(Vector3(2353.02f, 3451.107f, 53.9854f)), owning_building_guid = 34)
      LocalObject(461, Door.Constructor(Vector3(2226f, 3488.002f, 56.1804f)), owning_building_guid = 34)
      LocalObject(464, Door.Constructor(Vector3(2226f, 3432f, 36.1804f)), owning_building_guid = 34)
      LocalObject(467, Door.Constructor(Vector3(2210f, 3380f, 46.5644f)), owning_building_guid = 34)
      LocalObject(468, Door.Constructor(Vector3(2210f, 3404f, 44.0644f)), owning_building_guid = 34)
      LocalObject(469, Door.Constructor(Vector3(2242f, 3404f, 44.0644f)), owning_building_guid = 34)
      LocalObject(470, Door.Constructor(Vector3(2242f, 3428f, 44.0644f)), owning_building_guid = 34)
      LocalObject(471, Door.Constructor(Vector3(2258f, 3356f, 46.5644f)), owning_building_guid = 34)
      LocalObject(472, Door.Constructor(Vector3(2258f, 3396f, 46.5644f)), owning_building_guid = 34)
      LocalObject(473, Door.Constructor(Vector3(2270f, 3408f, 49.0644f)), owning_building_guid = 34)
      LocalObject(474, Door.Constructor(Vector3(2270f, 3408f, 69.0644f)), owning_building_guid = 34)
      LocalObject(475, Door.Constructor(Vector3(2270f, 3424f, 49.0644f)), owning_building_guid = 34)
      LocalObject(476, Door.Constructor(Vector3(2274f, 3372f, 46.5644f)), owning_building_guid = 34)
      LocalObject(477, Door.Constructor(Vector3(2274f, 3412f, 39.0644f)), owning_building_guid = 34)
      LocalObject(478, Door.Constructor(Vector3(2274f, 3416f, 59.0644f)), owning_building_guid = 34)
      LocalObject(479, Door.Constructor(Vector3(2274f, 3420f, 69.0644f)), owning_building_guid = 34)
      LocalObject(480, Door.Constructor(Vector3(2294f, 3400f, 39.0644f)), owning_building_guid = 34)
      LocalObject(481, Door.Constructor(Vector3(2294f, 3400f, 46.5644f)), owning_building_guid = 34)
      LocalObject(482, Door.Constructor(Vector3(2294f, 3424f, 46.5644f)), owning_building_guid = 34)
      LocalObject(483, Door.Constructor(Vector3(2302f, 3432f, 39.0644f)), owning_building_guid = 34)
      LocalObject(484, Door.Constructor(Vector3(2306f, 3404f, 39.0644f)), owning_building_guid = 34)
      LocalObject(485, Door.Constructor(Vector3(2306f, 3420f, 46.5644f)), owning_building_guid = 34)
      LocalObject(660, Door.Constructor(Vector3(2314.213f, 3402.341f, 54.8234f)), owning_building_guid = 34)
      LocalObject(2008, Door.Constructor(Vector3(2286.673f, 3405.733f, 46.8974f)), owning_building_guid = 34)
      LocalObject(2009, Door.Constructor(Vector3(2286.673f, 3413.026f, 46.8974f)), owning_building_guid = 34)
      LocalObject(2010, Door.Constructor(Vector3(2286.673f, 3420.315f, 46.8974f)), owning_building_guid = 34)
      LocalObject(
        696,
        IFFLock.Constructor(Vector3(2317.357f, 3399.603f, 54.0234f), Vector3(0, 0, 180)),
        owning_building_guid = 34,
        door_guid = 660
      )
      LocalObject(
        705,
        IFFLock.Constructor(Vector3(2231.256f, 3490.353f, 54.1314f), Vector3(0, 0, 360)),
        owning_building_guid = 34,
        door_guid = 461
      )
      LocalObject(
        708,
        IFFLock.Constructor(Vector3(2233.186f, 3345.954f, 53.9954f), Vector3(0, 0, 270)),
        owning_building_guid = 34,
        door_guid = 232
      )
      LocalObject(
        709,
        IFFLock.Constructor(Vector3(2268.428f, 3408.94f, 68.87939f), Vector3(0, 0, 0)),
        owning_building_guid = 34,
        door_guid = 474
      )
      LocalObject(
        710,
        IFFLock.Constructor(Vector3(2282.554f, 3425.383f, 68.9894f), Vector3(0, 0, 0)),
        owning_building_guid = 34,
        door_guid = 235
      )
      LocalObject(
        711,
        IFFLock.Constructor(Vector3(2292.428f, 3424.81f, 46.3794f), Vector3(0, 0, 0)),
        owning_building_guid = 34,
        door_guid = 482
      )
      LocalObject(
        712,
        IFFLock.Constructor(Vector3(2293.496f, 3407.775f, 68.9894f), Vector3(0, 0, 180)),
        owning_building_guid = 34,
        door_guid = 236
      )
      LocalObject(
        713,
        IFFLock.Constructor(Vector3(2295.572f, 3399.19f, 46.3794f), Vector3(0, 0, 180)),
        owning_building_guid = 34,
        door_guid = 481
      )
      LocalObject(
        714,
        IFFLock.Constructor(Vector3(2303.572f, 3431.057f, 38.8794f), Vector3(0, 0, 180)),
        owning_building_guid = 34,
        door_guid = 483
      )
      LocalObject(
        715,
        IFFLock.Constructor(Vector3(2305.06f, 3402.428f, 38.8794f), Vector3(0, 0, 270)),
        owning_building_guid = 34,
        door_guid = 484
      )
      LocalObject(888, Locker.Constructor(Vector3(2297.563f, 3402.141f, 45.3044f)), owning_building_guid = 34)
      LocalObject(889, Locker.Constructor(Vector3(2298.727f, 3402.141f, 45.3044f)), owning_building_guid = 34)
      LocalObject(890, Locker.Constructor(Vector3(2299.874f, 3402.141f, 45.3044f)), owning_building_guid = 34)
      LocalObject(891, Locker.Constructor(Vector3(2301.023f, 3402.141f, 45.3044f)), owning_building_guid = 34)
      LocalObject(892, Locker.Constructor(Vector3(2308.194f, 3422.165f, 37.5434f)), owning_building_guid = 34)
      LocalObject(893, Locker.Constructor(Vector3(2309.518f, 3422.165f, 37.5434f)), owning_building_guid = 34)
      LocalObject(894, Locker.Constructor(Vector3(2310.854f, 3422.165f, 37.5434f)), owning_building_guid = 34)
      LocalObject(895, Locker.Constructor(Vector3(2312.191f, 3422.165f, 37.5434f)), owning_building_guid = 34)
      LocalObject(896, Locker.Constructor(Vector3(2316.731f, 3422.165f, 37.5434f)), owning_building_guid = 34)
      LocalObject(897, Locker.Constructor(Vector3(2318.055f, 3422.165f, 37.5434f)), owning_building_guid = 34)
      LocalObject(898, Locker.Constructor(Vector3(2319.391f, 3422.165f, 37.5434f)), owning_building_guid = 34)
      LocalObject(899, Locker.Constructor(Vector3(2320.728f, 3422.165f, 37.5434f)), owning_building_guid = 34)
      LocalObject(
        122,
        Terminal.Constructor(Vector3(2278.673f, 3423.141f, 68.1464f), air_vehicle_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1308,
        VehicleSpawnPad.Constructor(Vector3(2274.07f, 3443.835f, 65.0214f), mb_pad_creation, Vector3(0, 0, 0)),
        owning_building_guid = 34,
        terminal_guid = 122
      )
      LocalObject(
        123,
        Terminal.Constructor(Vector3(2290.605f, 3423.141f, 68.1464f), air_vehicle_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1309,
        VehicleSpawnPad.Constructor(Vector3(2295.088f, 3443.835f, 65.0214f), mb_pad_creation, Vector3(0, 0, 0)),
        owning_building_guid = 34,
        terminal_guid = 123
      )
      LocalObject(
        1337,
        Terminal.Constructor(Vector3(2277.058f, 3421.486f, 58.8734f), order_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1338,
        Terminal.Constructor(Vector3(2300.654f, 3407.408f, 46.6334f), order_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1339,
        Terminal.Constructor(Vector3(2300.654f, 3411.139f, 46.6334f), order_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1340,
        Terminal.Constructor(Vector3(2300.654f, 3414.928f, 46.6334f), order_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1945,
        Terminal.Constructor(Vector3(2249.942f, 3352.591f, 46.6004f), spawn_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1946,
        Terminal.Constructor(Vector3(2281.942f, 3400.591f, 39.1004f), spawn_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1947,
        Terminal.Constructor(Vector3(2286.971f, 3403.243f, 47.1774f), spawn_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1948,
        Terminal.Constructor(Vector3(2286.967f, 3410.535f, 47.1774f), spawn_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1949,
        Terminal.Constructor(Vector3(2286.97f, 3417.823f, 47.1774f), spawn_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1950,
        Terminal.Constructor(Vector3(2288.532f, 3451.215f, 64.4664f), spawn_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1951,
        Terminal.Constructor(Vector3(2311.242f, 3427.639f, 59.1254f), spawn_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        2131,
        Terminal.Constructor(Vector3(2225.996f, 3407.423f, 38.2574f), ground_vehicle_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1307,
        VehicleSpawnPad.Constructor(Vector3(2225.945f, 3418.339f, 29.9804f), mb_pad_creation, Vector3(0, 0, 0)),
        owning_building_guid = 34,
        terminal_guid = 2131
      )
      LocalObject(1846, ResourceSilo.Constructor(Vector3(2335.752f, 3480.555f, 59.4514f)), owning_building_guid = 34)
      LocalObject(
        1855,
        SpawnTube.Constructor(Vector3(2286.233f, 3404.683f, 45.0434f), Vector3(0, 0, 0)),
        owning_building_guid = 34
      )
      LocalObject(
        1856,
        SpawnTube.Constructor(Vector3(2286.233f, 3411.974f, 45.0434f), Vector3(0, 0, 0)),
        owning_building_guid = 34
      )
      LocalObject(
        1857,
        SpawnTube.Constructor(Vector3(2286.233f, 3419.262f, 45.0434f), Vector3(0, 0, 0)),
        owning_building_guid = 34
      )
      LocalObject(
        1322,
        ProximityTerminal.Constructor(Vector3(2277.059f, 3410.901f, 57.5404f), medical_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1323,
        ProximityTerminal.Constructor(Vector3(2314.444f, 3421.62f, 37.5434f), medical_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1498,
        ProximityTerminal.Constructor(Vector3(2212.704f, 3423.661f, 60.6384f), pad_landing_frame),
        owning_building_guid = 34
      )
      LocalObject(
        1499,
        Terminal.Constructor(Vector3(2212.704f, 3423.661f, 60.6384f), air_rearm_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1501,
        ProximityTerminal.Constructor(Vector3(2232.98f, 3439.833f, 62.9934f), pad_landing_frame),
        owning_building_guid = 34
      )
      LocalObject(
        1502,
        Terminal.Constructor(Vector3(2232.98f, 3439.833f, 62.9934f), air_rearm_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1504,
        ProximityTerminal.Constructor(Vector3(2283.379f, 3383.474f, 67.8904f), pad_landing_frame),
        owning_building_guid = 34
      )
      LocalObject(
        1505,
        Terminal.Constructor(Vector3(2283.379f, 3383.474f, 67.8904f), air_rearm_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1507,
        ProximityTerminal.Constructor(Vector3(2299.534f, 3366.628f, 60.6514f), pad_landing_frame),
        owning_building_guid = 34
      )
      LocalObject(
        1508,
        Terminal.Constructor(Vector3(2299.534f, 3366.628f, 60.6514f), air_rearm_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1510,
        ProximityTerminal.Constructor(Vector3(2335.987f, 3405.855f, 63.0954f), pad_landing_frame),
        owning_building_guid = 34
      )
      LocalObject(
        1511,
        Terminal.Constructor(Vector3(2335.987f, 3405.855f, 63.0954f), air_rearm_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1513,
        ProximityTerminal.Constructor(Vector3(2342.28f, 3422.102f, 60.6514f), pad_landing_frame),
        owning_building_guid = 34
      )
      LocalObject(
        1514,
        Terminal.Constructor(Vector3(2342.28f, 3422.102f, 60.6514f), air_rearm_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1774,
        ProximityTerminal.Constructor(Vector3(2274.309f, 3489.637f, 52.1719f), repair_silo),
        owning_building_guid = 34
      )
      LocalObject(
        1775,
        Terminal.Constructor(Vector3(2274.309f, 3489.637f, 52.1719f), ground_rearm_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1778,
        ProximityTerminal.Constructor(Vector3(2332.637f, 3355.208f, 52.1934f), repair_silo),
        owning_building_guid = 34
      )
      LocalObject(
        1779,
        Terminal.Constructor(Vector3(2332.637f, 3355.208f, 52.1934f), ground_rearm_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1224,
        FacilityTurret.Constructor(Vector3(2189.906f, 3546.855f, 60.9424f), manned_turret),
        owning_building_guid = 34
      )
      TurretToWeapon(1224, 5035)
      LocalObject(
        1225,
        FacilityTurret.Constructor(Vector3(2195.413f, 3348.665f, 60.9424f), manned_turret),
        owning_building_guid = 34
      )
      TurretToWeapon(1225, 5036)
      LocalObject(
        1226,
        FacilityTurret.Constructor(Vector3(2279.601f, 3546.855f, 60.9424f), manned_turret),
        owning_building_guid = 34
      )
      TurretToWeapon(1226, 5037)
      LocalObject(
        1229,
        FacilityTurret.Constructor(Vector3(2360.154f, 3348.657f, 60.9424f), manned_turret),
        owning_building_guid = 34
      )
      TurretToWeapon(1229, 5038)
      LocalObject(
        1230,
        FacilityTurret.Constructor(Vector3(2360.154f, 3486.398f, 60.9424f), manned_turret),
        owning_building_guid = 34
      )
      TurretToWeapon(1230, 5039)
      LocalObject(
        1231,
        FacilityTurret.Constructor(Vector3(2367.881f, 3413.423f, 60.9424f), manned_turret),
        owning_building_guid = 34
      )
      TurretToWeapon(1231, 5040)
      LocalObject(
        1657,
        Painbox.Constructor(Vector3(2299.737f, 3444.206f, 41.0167f), painbox),
        owning_building_guid = 34
      )
      LocalObject(
        1666,
        Painbox.Constructor(Vector3(2294.832f, 3411.212f, 49.3133f), painbox_continuous),
        owning_building_guid = 34
      )
      LocalObject(
        1675,
        Painbox.Constructor(Vector3(2301.7f, 3429.471f, 40.7028f), painbox_door_radius),
        owning_building_guid = 34
      )
      LocalObject(
        1684,
        Painbox.Constructor(Vector3(2293.035f, 3398.278f, 47.1713f), painbox_door_radius_continuous),
        owning_building_guid = 34
      )
      LocalObject(
        1685,
        Painbox.Constructor(Vector3(2293.861f, 3425.769f, 47.7196f), painbox_door_radius_continuous),
        owning_building_guid = 34
      )
      LocalObject(
        1686,
        Painbox.Constructor(Vector3(2309.641f, 3418.57f, 48.6257f), painbox_door_radius_continuous),
        owning_building_guid = 34
      )
      LocalObject(219, Generator.Constructor(Vector3(2301.975f, 3447.555f, 36.2494f)), owning_building_guid = 34)
      LocalObject(
        210,
        Terminal.Constructor(Vector3(2302.022f, 3439.363f, 37.5434f), gen_control),
        owning_building_guid = 34
      )
    }

    Building6()

    def Building6(): Unit = { // Name: Dahaka Type: tech_plant GUID: 37, MapID: 6
      LocalBuilding(
        "Dahaka",
        37,
        6,
        FoundationBuilder(
          Building.Structure(
            StructureType.Facility,
            Vector3(4758f, 5388f, 53.64695f),
            Vector3(0f, 0f, 222f),
            tech_plant
          )
        )
      )
      LocalObject(
        164,
        CaptureTerminal.Constructor(Vector3(4724.98f, 5417.597f, 68.74695f), capture_terminal),
        owning_building_guid = 37
      )
      LocalObject(390, Door.Constructor(Vector3(4689.182f, 5346.336f, 63.15195f)), owning_building_guid = 37)
      LocalObject(391, Door.Constructor(Vector3(4693.555f, 5452.692f, 55.29795f)), owning_building_guid = 37)
      LocalObject(392, Door.Constructor(Vector3(4701.355f, 5332.816f, 55.18895f)), owning_building_guid = 37)
      LocalObject(393, Door.Constructor(Vector3(4707.075f, 5464.865f, 63.26095f)), owning_building_guid = 37)
      LocalObject(395, Door.Constructor(Vector3(4718.655f, 5405.627f, 70.26795f)), owning_building_guid = 37)
      LocalObject(396, Door.Constructor(Vector3(4720.812f, 5489.08f, 55.26795f)), owning_building_guid = 37)
      LocalObject(398, Door.Constructor(Vector3(4734.451f, 5398.317f, 70.26795f)), owning_building_guid = 37)
      LocalObject(399, Door.Constructor(Vector3(4747.15f, 5336.158f, 63.15195f)), owning_building_guid = 37)
      LocalObject(400, Door.Constructor(Vector3(4760.67f, 5348.332f, 55.18895f)), owning_building_guid = 37)
      LocalObject(403, Door.Constructor(Vector3(4764.218f, 5487.889f, 55.18895f)), owning_building_guid = 37)
      LocalObject(405, Door.Constructor(Vector3(4776.391f, 5474.37f, 63.15195f)), owning_building_guid = 37)
      LocalObject(406, Door.Constructor(Vector3(4813.563f, 5433.086f, 55.18895f)), owning_building_guid = 37)
      LocalObject(407, Door.Constructor(Vector3(4825.736f, 5419.567f, 63.15195f)), owning_building_guid = 37)
      LocalObject(462, Door.Constructor(Vector3(4820.438f, 5390.391f, 57.38395f)), owning_building_guid = 37)
      LocalObject(465, Door.Constructor(Vector3(4782.965f, 5432.009f, 37.38395f)), owning_building_guid = 37)
      LocalObject(617, Door.Constructor(Vector3(4704.778f, 5399.286f, 40.26795f)), owning_building_guid = 37)
      LocalObject(618, Door.Constructor(Vector3(4707.146f, 5444.479f, 47.76795f)), owning_building_guid = 37)
      LocalObject(620, Door.Constructor(Vector3(4708.33f, 5467.075f, 47.76795f)), owning_building_guid = 37)
      LocalObject(621, Door.Constructor(Vector3(4711.019f, 5410.289f, 40.26795f)), owning_building_guid = 37)
      LocalObject(622, Door.Constructor(Vector3(4711.019f, 5410.289f, 47.76795f)), owning_building_guid = 37)
      LocalObject(624, Door.Constructor(Vector3(4715.484f, 5387.396f, 47.76795f)), owning_building_guid = 37)
      LocalObject(625, Door.Constructor(Vector3(4726.486f, 5381.155f, 40.26795f)), owning_building_guid = 37)
      LocalObject(626, Door.Constructor(Vector3(4727.078f, 5392.453f, 47.76795f)), owning_building_guid = 37)
      LocalObject(627, Door.Constructor(Vector3(4733.911f, 5414.753f, 40.26795f)), owning_building_guid = 37)
      LocalObject(628, Door.Constructor(Vector3(4734.208f, 5420.402f, 50.26795f)), owning_building_guid = 37)
      LocalObject(629, Door.Constructor(Vector3(4734.208f, 5420.402f, 70.26795f)), owning_building_guid = 37)
      LocalObject(630, Door.Constructor(Vector3(4735.096f, 5437.35f, 47.76795f)), owning_building_guid = 37)
      LocalObject(632, Door.Constructor(Vector3(4736.588f, 5411.781f, 60.26795f)), owning_building_guid = 37)
      LocalObject(633, Door.Constructor(Vector3(4739.264f, 5408.808f, 70.26795f)), owning_building_guid = 37)
      LocalObject(635, Door.Constructor(Vector3(4744.914f, 5408.512f, 50.26795f)), owning_building_guid = 37)
      LocalObject(636, Door.Constructor(Vector3(4752.339f, 5442.11f, 45.26795f)), owning_building_guid = 37)
      LocalObject(637, Door.Constructor(Vector3(4760.061f, 5481.358f, 47.76795f)), owning_building_guid = 37)
      LocalObject(639, Door.Constructor(Vector3(4768.398f, 5424.275f, 45.26795f)), owning_building_guid = 37)
      LocalObject(640, Door.Constructor(Vector3(4776.12f, 5463.523f, 45.26795f)), owning_building_guid = 37)
      LocalObject(667, Door.Constructor(Vector3(4697.564f, 5395.023f, 56.02695f)), owning_building_guid = 37)
      LocalObject(2055, Door.Constructor(Vector3(4720.3f, 5410.931f, 48.10095f)), owning_building_guid = 37)
      LocalObject(2056, Door.Constructor(Vector3(4725.18f, 5405.511f, 48.10095f)), owning_building_guid = 37)
      LocalObject(2057, Door.Constructor(Vector3(4730.057f, 5400.094f, 48.10095f)), owning_building_guid = 37)
      LocalObject(
        703,
        IFFLock.Constructor(Vector3(4693.396f, 5394.955f, 55.22695f), Vector3(0, 0, 318)),
        owning_building_guid = 37,
        door_guid = 667
      )
      LocalObject(
        706,
        IFFLock.Constructor(Vector3(4818.104f, 5385.127f, 55.33495f), Vector3(0, 0, 138)),
        owning_building_guid = 37,
        door_guid = 462
      )
      LocalObject(
        835,
        IFFLock.Constructor(Vector3(4704.424f, 5401.083f, 40.08295f), Vector3(0, 0, 48)),
        owning_building_guid = 37,
        door_guid = 617
      )
      LocalObject(
        836,
        IFFLock.Constructor(Vector3(4709.309f, 5409.838f, 47.58295f), Vector3(0, 0, 318)),
        owning_building_guid = 37,
        door_guid = 622
      )
      LocalObject(
        837,
        IFFLock.Constructor(Vector3(4716.596f, 5404.848f, 70.19295f), Vector3(0, 0, 318)),
        owning_building_guid = 37,
        door_guid = 395
      )
      LocalObject(
        838,
        IFFLock.Constructor(Vector3(4720.049f, 5491.145f, 55.19895f), Vector3(0, 0, 48)),
        owning_building_guid = 37,
        door_guid = 396
      )
      LocalObject(
        839,
        IFFLock.Constructor(Vector3(4724.687f, 5380.804f, 40.08295f), Vector3(0, 0, 318)),
        owning_building_guid = 37,
        door_guid = 625
      )
      LocalObject(
        840,
        IFFLock.Constructor(Vector3(4728.788f, 5392.903f, 47.58295f), Vector3(0, 0, 138)),
        owning_building_guid = 37,
        door_guid = 626
      )
      LocalObject(
        841,
        IFFLock.Constructor(Vector3(4736.004f, 5420.756f, 70.08295f), Vector3(0, 0, 138)),
        owning_building_guid = 37,
        door_guid = 629
      )
      LocalObject(
        842,
        IFFLock.Constructor(Vector3(4736.509f, 5399.084f, 70.19295f), Vector3(0, 0, 138)),
        owning_building_guid = 37,
        door_guid = 398
      )
      LocalObject(1103, Locker.Constructor(Vector3(4705.987f, 5375.932f, 38.74695f)), owning_building_guid = 37)
      LocalObject(1104, Locker.Constructor(Vector3(4706.981f, 5376.827f, 38.74695f)), owning_building_guid = 37)
      LocalObject(1105, Locker.Constructor(Vector3(4707.232f, 5403.998f, 46.50795f)), owning_building_guid = 37)
      LocalObject(1106, Locker.Constructor(Vector3(4707.974f, 5377.721f, 38.74695f)), owning_building_guid = 37)
      LocalObject(1107, Locker.Constructor(Vector3(4708.086f, 5404.767f, 46.50795f)), owning_building_guid = 37)
      LocalObject(1108, Locker.Constructor(Vector3(4708.958f, 5378.606f, 38.74695f)), owning_building_guid = 37)
      LocalObject(1109, Locker.Constructor(Vector3(4708.938f, 5405.534f, 46.50795f)), owning_building_guid = 37)
      LocalObject(1110, Locker.Constructor(Vector3(4709.804f, 5406.313f, 46.50795f)), owning_building_guid = 37)
      LocalObject(1111, Locker.Constructor(Vector3(4712.332f, 5381.645f, 38.74695f)), owning_building_guid = 37)
      LocalObject(1112, Locker.Constructor(Vector3(4713.325f, 5382.539f, 38.74695f)), owning_building_guid = 37)
      LocalObject(1113, Locker.Constructor(Vector3(4714.318f, 5383.433f, 38.74695f)), owning_building_guid = 37)
      LocalObject(1114, Locker.Constructor(Vector3(4715.302f, 5384.319f, 38.74695f)), owning_building_guid = 37)
      LocalObject(
        124,
        Terminal.Constructor(Vector3(4729.026f, 5395.363f, 69.34995f), air_vehicle_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1315,
        VehicleSpawnPad.Constructor(Vector3(4739.542f, 5376.984f, 66.22495f), mb_pad_creation, Vector3(0, 0, 138)),
        owning_building_guid = 37,
        terminal_guid = 124
      )
      LocalObject(
        125,
        Terminal.Constructor(Vector3(4737.894f, 5403.347f, 69.34995f), air_vehicle_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1317,
        VehicleSpawnPad.Constructor(Vector3(4755.161f, 5391.048f, 66.22495f), mb_pad_creation, Vector3(0, 0, 138)),
        owning_building_guid = 37,
        terminal_guid = 125
      )
      LocalObject(
        1413,
        Terminal.Constructor(Vector3(4711.031f, 5400.331f, 47.83695f), order_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1414,
        Terminal.Constructor(Vector3(4713.527f, 5397.558f, 47.83695f), order_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1415,
        Terminal.Constructor(Vector3(4716.062f, 5394.742f, 47.83695f), order_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1416,
        Terminal.Constructor(Vector3(4737.986f, 5405.658f, 60.07695f), order_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1993,
        Terminal.Constructor(Vector3(4712.038f, 5475f, 47.80395f), spawn_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1994,
        Terminal.Constructor(Vector3(4716.7f, 5378.211f, 60.32895f), spawn_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1995,
        Terminal.Constructor(Vector3(4718.413f, 5412.582f, 48.38095f), spawn_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1996,
        Terminal.Constructor(Vector3(4720.375f, 5417.917f, 40.30395f), spawn_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1997,
        Terminal.Constructor(Vector3(4723.294f, 5407.166f, 48.38095f), spawn_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1998,
        Terminal.Constructor(Vector3(4728.169f, 5401.747f, 48.38095f), spawn_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        2000,
        Terminal.Constructor(Vector3(4749.352f, 5375.887f, 65.66995f), spawn_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        2138,
        Terminal.Constructor(Vector3(4766.522f, 5450.275f, 39.46095f), ground_vehicle_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1318,
        VehicleSpawnPad.Constructor(Vector3(4773.865f, 5442.197f, 31.18395f), mb_pad_creation, Vector3(0, 0, 138)),
        owning_building_guid = 37,
        terminal_guid = 2138
      )
      LocalObject(1853, ResourceSilo.Constructor(Vector3(4733.893f, 5322.487f, 60.65495f)), owning_building_guid = 37)
      LocalObject(
        1902,
        SpawnTube.Constructor(Vector3(4719.924f, 5412.005f, 46.24695f), Vector3(0, 0, 138)),
        owning_building_guid = 37
      )
      LocalObject(
        1903,
        SpawnTube.Constructor(Vector3(4724.803f, 5406.587f, 46.24695f), Vector3(0, 0, 138)),
        owning_building_guid = 37
      )
      LocalObject(
        1904,
        SpawnTube.Constructor(Vector3(4729.68f, 5401.171f, 46.24695f), Vector3(0, 0, 138)),
        owning_building_guid = 37
      )
      LocalObject(
        1333,
        ProximityTerminal.Constructor(Vector3(4710.292f, 5380.542f, 38.74695f), medical_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1334,
        ProximityTerminal.Constructor(Vector3(4730.903f, 5413.523f, 58.74395f), medical_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1573,
        ProximityTerminal.Constructor(Vector3(4683.734f, 5377.842f, 64.29895f), pad_landing_frame),
        owning_building_guid = 37
      )
      LocalObject(
        1574,
        Terminal.Constructor(Vector3(4683.734f, 5377.842f, 64.29895f), air_rearm_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1576,
        ProximityTerminal.Constructor(Vector3(4684.576f, 5431.386f, 61.85495f), pad_landing_frame),
        owning_building_guid = 37
      )
      LocalObject(
        1577,
        Terminal.Constructor(Vector3(4684.576f, 5431.386f, 61.85495f), air_rearm_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1579,
        ProximityTerminal.Constructor(Vector3(4689.929f, 5361.558f, 61.85495f), pad_landing_frame),
        owning_building_guid = 37
      )
      LocalObject(
        1580,
        Terminal.Constructor(Vector3(4689.929f, 5361.558f, 61.85495f), air_rearm_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1582,
        ProximityTerminal.Constructor(Vector3(4707.854f, 5429.676f, 69.09395f), pad_landing_frame),
        owning_building_guid = 37
      )
      LocalObject(
        1583,
        Terminal.Constructor(Vector3(4707.854f, 5429.676f, 69.09395f), air_rearm_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1591,
        ProximityTerminal.Constructor(Vector3(4783.019f, 5421.517f, 64.19695f), pad_landing_frame),
        owning_building_guid = 37
      )
      LocalObject(
        1592,
        Terminal.Constructor(Vector3(4783.019f, 5421.517f, 64.19695f), air_rearm_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1594,
        ProximityTerminal.Constructor(Vector3(4787.266f, 5447.103f, 61.84195f), pad_landing_frame),
        owning_building_guid = 37
      )
      LocalObject(
        1595,
        Terminal.Constructor(Vector3(4787.266f, 5447.103f, 61.84195f), air_rearm_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1822,
        ProximityTerminal.Constructor(Vector3(4652.334f, 5417.723f, 53.39695f), repair_silo),
        owning_building_guid = 37
      )
      LocalObject(
        1823,
        Terminal.Constructor(Vector3(4652.334f, 5417.723f, 53.39695f), ground_rearm_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1834,
        ProximityTerminal.Constructor(Vector3(4785.631f, 5356.852f, 53.37545f), repair_silo),
        owning_building_guid = 37
      )
      LocalObject(
        1835,
        Terminal.Constructor(Vector3(4785.631f, 5356.852f, 53.37545f), ground_rearm_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1279,
        FacilityTurret.Constructor(Vector3(4627.501f, 5404.178f, 62.14595f), manned_turret),
        owning_building_guid = 37
      )
      TurretToWeapon(1279, 5041)
      LocalObject(
        1282,
        FacilityTurret.Constructor(Vector3(4665.096f, 5350.877f, 62.14595f), manned_turret),
        owning_building_guid = 37
      )
      TurretToWeapon(1282, 5042)
      LocalObject(
        1283,
        FacilityTurret.Constructor(Vector3(4719.668f, 5301.816f, 62.14595f), manned_turret),
        owning_building_guid = 37
      )
      TurretToWeapon(1283, 5043)
      LocalObject(
        1284,
        FacilityTurret.Constructor(Vector3(4749.934f, 5514.405f, 62.14595f), manned_turret),
        owning_building_guid = 37
      )
      TurretToWeapon(1284, 5044)
      LocalObject(
        1287,
        FacilityTurret.Constructor(Vector3(4819.984f, 5310.789f, 62.14595f), manned_turret),
        owning_building_guid = 37
      )
      TurretToWeapon(1287, 5045)
      LocalObject(
        1289,
        FacilityTurret.Constructor(Vector3(4886.641f, 5370.806f, 62.14595f), manned_turret),
        owning_building_guid = 37
      )
      TurretToWeapon(1289, 5046)
      LocalObject(
        1664,
        Painbox.Constructor(Vector3(4736.335f, 5373.598f, 42.22025f), painbox),
        owning_building_guid = 37
      )
      LocalObject(
        1673,
        Painbox.Constructor(Vector3(4717.903f, 5401.399f, 50.51685f), painbox_continuous),
        owning_building_guid = 37
      )
      LocalObject(
        1682,
        Painbox.Constructor(Vector3(4725.017f, 5383.235f, 41.90635f), painbox_door_radius),
        owning_building_guid = 37
      )
      LocalObject(
        1705,
        Painbox.Constructor(Vector3(4710.584f, 5412.213f, 48.37485f), painbox_door_radius_continuous),
        owning_building_guid = 37
      )
      LocalObject(
        1706,
        Painbox.Constructor(Vector3(4711.821f, 5386.022f, 49.82925f), painbox_door_radius_continuous),
        owning_building_guid = 37
      )
      LocalObject(
        1707,
        Painbox.Constructor(Vector3(4728.365f, 5391.231f, 48.92315f), painbox_door_radius_continuous),
        owning_building_guid = 37
      )
      LocalObject(226, Generator.Constructor(Vector3(4736.913f, 5369.612f, 37.45295f)), owning_building_guid = 37)
      LocalObject(
        217,
        Terminal.Constructor(Vector3(4731.396f, 5375.668f, 38.74695f), gen_control),
        owning_building_guid = 37
      )
    }

    Building8()

    def Building8(): Unit = { // Name: Izha Type: tech_plant GUID: 40, MapID: 8
      LocalBuilding(
        "Izha",
        40,
        8,
        FoundationBuilder(
          Building.Structure(StructureType.Facility, Vector3(5518f, 3878f, 50.5227f), Vector3(0f, 0f, 230f), tech_plant)
        )
      )
      LocalObject(
        165,
        CaptureTerminal.Constructor(Vector3(5481.183f, 3902.713f, 65.6227f), capture_terminal),
        owning_building_guid = 40
      )
      LocalObject(430, Door.Constructor(Vector3(5445.178f, 3933.093f, 52.1737f)), owning_building_guid = 40)
      LocalObject(431, Door.Constructor(Vector3(5455.65f, 3827.164f, 60.0277f)), owning_building_guid = 40)
      LocalObject(432, Door.Constructor(Vector3(5456.873f, 3947.03f, 60.1367f)), owning_building_guid = 40)
      LocalObject(433, Door.Constructor(Vector3(5467.107f, 3972.921f, 52.1437f)), owning_building_guid = 40)
      LocalObject(434, Door.Constructor(Vector3(5469.587f, 3815.47f, 52.0647f)), owning_building_guid = 40)
      LocalObject(435, Door.Constructor(Vector3(5476.585f, 3889.98f, 67.1437f)), owning_building_guid = 40)
      LocalObject(436, Door.Constructor(Vector3(5493.244f, 3884.939f, 67.1437f)), owning_building_guid = 40)
      LocalObject(437, Door.Constructor(Vector3(5510.256f, 3977.782f, 52.0647f)), owning_building_guid = 40)
      LocalObject(438, Door.Constructor(Vector3(5514.471f, 3825.153f, 60.0277f)), owning_building_guid = 40)
      LocalObject(439, Door.Constructor(Vector3(5524.192f, 3966.089f, 60.0277f)), owning_building_guid = 40)
      LocalObject(440, Door.Constructor(Vector3(5526.165f, 3839.089f, 52.0647f)), owning_building_guid = 40)
      LocalObject(447, Door.Constructor(Vector3(5566.747f, 3930.381f, 52.0647f)), owning_building_guid = 40)
      LocalObject(448, Door.Constructor(Vector3(5580.683f, 3918.687f, 60.0277f)), owning_building_guid = 40)
      LocalObject(463, Door.Constructor(Vector3(5579.497f, 3889.057f, 54.2597f)), owning_building_guid = 40)
      LocalObject(466, Door.Constructor(Vector3(5536.597f, 3925.055f, 34.2597f)), owning_building_guid = 40)
      LocalObject(641, Door.Constructor(Vector3(5457.809f, 3949.393f, 44.6437f)), owning_building_guid = 40)
      LocalObject(642, Door.Constructor(Vector3(5459.781f, 3926.852f, 44.6437f)), owning_building_guid = 40)
      LocalObject(643, Door.Constructor(Vector3(5463.725f, 3881.769f, 37.1437f)), owning_building_guid = 40)
      LocalObject(644, Door.Constructor(Vector3(5468.374f, 3893.533f, 37.1437f)), owning_building_guid = 40)
      LocalObject(645, Door.Constructor(Vector3(5468.374f, 3893.533f, 44.6437f)), owning_building_guid = 40)
      LocalObject(646, Door.Constructor(Vector3(5475.981f, 3871.485f, 44.6437f)), owning_building_guid = 40)
      LocalObject(647, Door.Constructor(Vector3(5486.759f, 3878.106f, 44.6437f)), owning_building_guid = 40)
      LocalObject(648, Door.Constructor(Vector3(5487.745f, 3866.835f, 37.1437f)), owning_building_guid = 40)
      LocalObject(649, Door.Constructor(Vector3(5488.45f, 3923.682f, 44.6437f)), owning_building_guid = 40)
      LocalObject(650, Door.Constructor(Vector3(5489.929f, 3906.776f, 47.1437f)), owning_building_guid = 40)
      LocalObject(651, Door.Constructor(Vector3(5489.929f, 3906.776f, 67.1437f)), owning_building_guid = 40)
      LocalObject(652, Door.Constructor(Vector3(5490.422f, 3901.14f, 37.1437f)), owning_building_guid = 40)
      LocalObject(653, Door.Constructor(Vector3(5493.487f, 3898.569f, 57.1437f)), owning_building_guid = 40)
      LocalObject(654, Door.Constructor(Vector3(5496.551f, 3895.998f, 67.1437f)), owning_building_guid = 40)
      LocalObject(655, Door.Constructor(Vector3(5502.186f, 3896.491f, 47.1437f)), owning_building_guid = 40)
      LocalObject(656, Door.Constructor(Vector3(5504.863f, 3930.796f, 42.1437f)), owning_building_guid = 40)
      LocalObject(657, Door.Constructor(Vector3(5507.047f, 3970.736f, 44.6437f)), owning_building_guid = 40)
      LocalObject(658, Door.Constructor(Vector3(5523.249f, 3915.369f, 42.1437f)), owning_building_guid = 40)
      LocalObject(659, Door.Constructor(Vector3(5525.433f, 3955.31f, 42.1437f)), owning_building_guid = 40)
      LocalObject(668, Door.Constructor(Vector3(5457.175f, 3876.544f, 52.9027f)), owning_building_guid = 40)
      LocalObject(2068, Door.Constructor(Vector3(5477.476f, 3895.461f, 44.9767f)), owning_building_guid = 40)
      LocalObject(2069, Door.Constructor(Vector3(5483.062f, 3890.773f, 44.9767f)), owning_building_guid = 40)
      LocalObject(2070, Door.Constructor(Vector3(5488.646f, 3886.087f, 44.9767f)), owning_building_guid = 40)
      LocalObject(
        704,
        IFFLock.Constructor(Vector3(5453.057f, 3875.896f, 52.1027f), Vector3(0, 0, 310)),
        owning_building_guid = 40,
        door_guid = 668
      )
      LocalObject(
        707,
        IFFLock.Constructor(Vector3(5577.919f, 3883.52f, 52.2107f), Vector3(0, 0, 130)),
        owning_building_guid = 40,
        door_guid = 463
      )
      LocalObject(
        864,
        IFFLock.Constructor(Vector3(5463.125f, 3883.5f, 36.9587f), Vector3(0, 0, 40)),
        owning_building_guid = 40,
        door_guid = 643
      )
      LocalObject(
        865,
        IFFLock.Constructor(Vector3(5466.063f, 3974.859f, 52.0747f), Vector3(0, 0, 40)),
        owning_building_guid = 40,
        door_guid = 433
      )
      LocalObject(
        866,
        IFFLock.Constructor(Vector3(5466.743f, 3892.849f, 44.4587f), Vector3(0, 0, 310)),
        owning_building_guid = 40,
        door_guid = 645
      )
      LocalObject(
        867,
        IFFLock.Constructor(Vector3(5474.654f, 3888.921f, 67.0687f), Vector3(0, 0, 310)),
        owning_building_guid = 40,
        door_guid = 435
      )
      LocalObject(
        868,
        IFFLock.Constructor(Vector3(5486.012f, 3866.237f, 36.9587f), Vector3(0, 0, 310)),
        owning_building_guid = 40,
        door_guid = 648
      )
      LocalObject(
        869,
        IFFLock.Constructor(Vector3(5488.39f, 3878.79f, 44.4587f), Vector3(0, 0, 130)),
        owning_building_guid = 40,
        door_guid = 647
      )
      LocalObject(
        870,
        IFFLock.Constructor(Vector3(5491.66f, 3907.376f, 66.95869f), Vector3(0, 0, 130)),
        owning_building_guid = 40,
        door_guid = 651
      )
      LocalObject(
        871,
        IFFLock.Constructor(Vector3(5495.176f, 3885.985f, 67.0687f), Vector3(0, 0, 130)),
        owning_building_guid = 40,
        door_guid = 436
      )
      LocalObject(1155, Locker.Constructor(Vector3(5465.5f, 3886.777f, 43.3837f)), owning_building_guid = 40)
      LocalObject(1156, Locker.Constructor(Vector3(5466.238f, 3887.657f, 43.3837f)), owning_building_guid = 40)
      LocalObject(1157, Locker.Constructor(Vector3(5466.976f, 3888.536f, 43.3837f)), owning_building_guid = 40)
      LocalObject(1158, Locker.Constructor(Vector3(5467.724f, 3889.427f, 43.3837f)), owning_building_guid = 40)
      LocalObject(1159, Locker.Constructor(Vector3(5468.173f, 3858.811f, 35.6227f)), owning_building_guid = 40)
      LocalObject(1160, Locker.Constructor(Vector3(5469.032f, 3859.835f, 35.6227f)), owning_building_guid = 40)
      LocalObject(1161, Locker.Constructor(Vector3(5469.891f, 3860.858f, 35.6227f)), owning_building_guid = 40)
      LocalObject(1162, Locker.Constructor(Vector3(5470.742f, 3861.873f, 35.6227f)), owning_building_guid = 40)
      LocalObject(1163, Locker.Constructor(Vector3(5473.661f, 3865.35f, 35.6227f)), owning_building_guid = 40)
      LocalObject(1164, Locker.Constructor(Vector3(5474.52f, 3866.375f, 35.6227f)), owning_building_guid = 40)
      LocalObject(1165, Locker.Constructor(Vector3(5475.379f, 3867.398f, 35.6227f)), owning_building_guid = 40)
      LocalObject(1166, Locker.Constructor(Vector3(5476.23f, 3868.412f, 35.6227f)), owning_building_guid = 40)
      LocalObject(
        126,
        Terminal.Constructor(Vector3(5488.283f, 3881.259f, 66.2257f), air_vehicle_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        1319,
        VehicleSpawnPad.Constructor(Vector3(5501.254f, 3864.523f, 63.1007f), mb_pad_creation, Vector3(0, 0, 130)),
        owning_building_guid = 40,
        terminal_guid = 126
      )
      LocalObject(
        127,
        Terminal.Constructor(Vector3(5495.953f, 3890.399f, 66.2257f), air_vehicle_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        1320,
        VehicleSpawnPad.Constructor(Vector3(5514.765f, 3880.624f, 63.1007f), mb_pad_creation, Vector3(0, 0, 130)),
        owning_building_guid = 40,
        terminal_guid = 127
      )
      LocalObject(
        1432,
        Terminal.Constructor(Vector3(5469.772f, 3883.674f, 44.7127f), order_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        1433,
        Terminal.Constructor(Vector3(5472.63f, 3881.276f, 44.7127f), order_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        1434,
        Terminal.Constructor(Vector3(5475.533f, 3878.84f, 44.7127f), order_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        1435,
        Terminal.Constructor(Vector3(5495.724f, 3892.7f, 56.9527f), order_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        2001,
        Terminal.Constructor(Vector3(5460.376f, 3957.757f, 44.6797f), spawn_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        2002,
        Terminal.Constructor(Vector3(5475.376f, 3896.833f, 45.2567f), spawn_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        2003,
        Terminal.Constructor(Vector3(5476.578f, 3902.39f, 37.1797f), spawn_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        2004,
        Terminal.Constructor(Vector3(5478.464f, 3862.559f, 57.2047f), spawn_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        2005,
        Terminal.Constructor(Vector3(5480.965f, 3892.149f, 45.2567f), spawn_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        2006,
        Terminal.Constructor(Vector3(5486.546f, 3887.462f, 45.2567f), spawn_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        2007,
        Terminal.Constructor(Vector3(5511.122f, 3864.801f, 62.5457f), spawn_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        2139,
        Terminal.Constructor(Vector3(5517.772f, 3940.855f, 36.3367f), ground_vehicle_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        1321,
        VehicleSpawnPad.Constructor(Vector3(5526.167f, 3933.878f, 28.0597f), mb_pad_creation, Vector3(0, 0, 130)),
        owning_building_guid = 40,
        terminal_guid = 2139
      )
      LocalObject(1854, ResourceSilo.Constructor(Vector3(5503.245f, 3809.769f, 57.5307f)), owning_building_guid = 40)
      LocalObject(
        1915,
        SpawnTube.Constructor(Vector3(5476.954f, 3896.473f, 43.1227f), Vector3(0, 0, 130)),
        owning_building_guid = 40
      )
      LocalObject(
        1916,
        SpawnTube.Constructor(Vector3(5482.539f, 3891.786f, 43.1227f), Vector3(0, 0, 130)),
        owning_building_guid = 40
      )
      LocalObject(
        1917,
        SpawnTube.Constructor(Vector3(5488.122f, 3887.101f, 43.1227f), Vector3(0, 0, 130)),
        owning_building_guid = 40
      )
      LocalObject(
        1335,
        ProximityTerminal.Constructor(Vector3(5471.795f, 3863.975f, 35.6227f), medical_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        1336,
        ProximityTerminal.Constructor(Vector3(5487.614f, 3899.503f, 55.6197f), medical_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        1597,
        ProximityTerminal.Constructor(Vector3(5439.252f, 3910.745f, 58.7307f), pad_landing_frame),
        owning_building_guid = 40
      )
      LocalObject(
        1598,
        Terminal.Constructor(Vector3(5439.252f, 3910.745f, 58.7307f), air_rearm_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        1600,
        ProximityTerminal.Constructor(Vector3(5445.871f, 3857.605f, 61.1747f), pad_landing_frame),
        owning_building_guid = 40
      )
      LocalObject(
        1601,
        Terminal.Constructor(Vector3(5445.871f, 3857.605f, 61.1747f), air_rearm_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        1603,
        ProximityTerminal.Constructor(Vector3(5454.271f, 3842.341f, 58.7307f), pad_landing_frame),
        owning_building_guid = 40
      )
      LocalObject(
        1604,
        Terminal.Constructor(Vector3(5454.271f, 3842.341f, 58.7307f), air_rearm_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        1606,
        ProximityTerminal.Constructor(Vector3(5462.542f, 3912.292f, 65.9697f), pad_landing_frame),
        owning_building_guid = 40
      )
      LocalObject(
        1607,
        Terminal.Constructor(Vector3(5462.542f, 3912.292f, 65.9697f), air_rearm_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        1609,
        ProximityTerminal.Constructor(Vector3(5538.111f, 3914.673f, 61.0727f), pad_landing_frame),
        owning_building_guid = 40
      )
      LocalObject(
        1610,
        Terminal.Constructor(Vector3(5538.111f, 3914.673f, 61.0727f), air_rearm_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        1612,
        ProximityTerminal.Constructor(Vector3(5538.755f, 3940.6f, 58.7177f), pad_landing_frame),
        owning_building_guid = 40
      )
      LocalObject(
        1613,
        Terminal.Constructor(Vector3(5538.755f, 3940.6f, 58.7177f), air_rearm_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        1838,
        ProximityTerminal.Constructor(Vector3(5409.226f, 3892.728f, 50.2727f), repair_silo),
        owning_building_guid = 40
      )
      LocalObject(
        1839,
        Terminal.Constructor(Vector3(5409.226f, 3892.728f, 50.2727f), ground_rearm_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        1842,
        ProximityTerminal.Constructor(Vector3(5549.697f, 3851f, 50.2512f), repair_silo),
        owning_building_guid = 40
      )
      LocalObject(
        1843,
        Terminal.Constructor(Vector3(5549.697f, 3851f, 50.2512f), ground_rearm_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        1299,
        FacilityTurret.Constructor(Vector3(5386.52f, 3875.859f, 59.0217f), manned_turret),
        owning_building_guid = 40
      )
      TurretToWeapon(1299, 5047)
      LocalObject(
        1300,
        FacilityTurret.Constructor(Vector3(5431.167f, 3828.309f, 59.0217f), manned_turret),
        owning_building_guid = 40
      )
      TurretToWeapon(1300, 5048)
      LocalObject(
        1301,
        FacilityTurret.Constructor(Vector3(5492.036f, 3787.321f, 59.0217f), manned_turret),
        owning_building_guid = 40
      )
      TurretToWeapon(1301, 5049)
      LocalObject(
        1302,
        FacilityTurret.Constructor(Vector3(5492.42f, 4002.052f, 59.0217f), manned_turret),
        owning_building_guid = 40
      )
      TurretToWeapon(1302, 5050)
      LocalObject(
        1303,
        FacilityTurret.Constructor(Vector3(5590.127f, 3810.167f, 59.0217f), manned_turret),
        owning_building_guid = 40
      )
      TurretToWeapon(1303, 5051)
      LocalObject(
        1304,
        FacilityTurret.Constructor(Vector3(5647.782f, 3878.877f, 59.0217f), manned_turret),
        owning_building_guid = 40
      )
      TurretToWeapon(1304, 5052)
      LocalObject(1665, Painbox.Constructor(Vector3(5498.55f, 3860.723f, 39.096f), painbox), owning_building_guid = 40)
      LocalObject(
        1674,
        Painbox.Constructor(Vector3(5476.428f, 3885.688f, 47.3926f), painbox_continuous),
        owning_building_guid = 40
      )
      LocalObject(
        1683,
        Painbox.Constructor(Vector3(5486.001f, 3868.691f, 38.7821f), painbox_door_radius),
        owning_building_guid = 40
      )
      LocalObject(
        1708,
        Painbox.Constructor(Vector3(5467.676f, 3895.379f, 45.2506f), painbox_door_radius_continuous),
        owning_building_guid = 40
      )
      LocalObject(
        1709,
        Painbox.Constructor(Vector3(5472.545f, 3869.615f, 46.705f), painbox_door_radius_continuous),
        owning_building_guid = 40
      )
      LocalObject(
        1710,
        Painbox.Constructor(Vector3(5488.204f, 3877.076f, 45.7989f), painbox_door_radius_continuous),
        owning_building_guid = 40
      )
      LocalObject(227, Generator.Constructor(Vector3(5499.677f, 3856.856f, 34.3287f)), owning_building_guid = 40)
      LocalObject(
        218,
        Terminal.Constructor(Vector3(5493.372f, 3862.086f, 35.6227f), gen_control),
        owning_building_guid = 40
      )
    }

    Building16()

    def Building16(): Unit = { // Name: N_Jamshid_Tower Type: tower_a GUID: 43, MapID: 16
      LocalBuilding(
        "N_Jamshid_Tower",
        43,
        16,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(2312f, 3692f, 40.78366f), Vector3(0f, 0f, 360f), tower_a)
        )
      )
      LocalObject(
        1924,
        CaptureTerminal.Constructor(Vector3(2328.587f, 3691.897f, 50.78267f), secondary_capture),
        owning_building_guid = 43
      )
      LocalObject(239, Door.Constructor(Vector3(2324f, 3684f, 42.30466f)), owning_building_guid = 43)
      LocalObject(240, Door.Constructor(Vector3(2324f, 3684f, 62.30367f)), owning_building_guid = 43)
      LocalObject(241, Door.Constructor(Vector3(2324f, 3700f, 42.30466f)), owning_building_guid = 43)
      LocalObject(242, Door.Constructor(Vector3(2324f, 3700f, 62.30367f)), owning_building_guid = 43)
      LocalObject(2011, Door.Constructor(Vector3(2323.146f, 3680.794f, 32.11967f)), owning_building_guid = 43)
      LocalObject(2012, Door.Constructor(Vector3(2323.146f, 3697.204f, 32.11967f)), owning_building_guid = 43)
      LocalObject(
        716,
        IFFLock.Constructor(Vector3(2321.957f, 3700.811f, 42.24466f), Vector3(0, 0, 0)),
        owning_building_guid = 43,
        door_guid = 241
      )
      LocalObject(
        717,
        IFFLock.Constructor(Vector3(2321.957f, 3700.811f, 62.24467f), Vector3(0, 0, 0)),
        owning_building_guid = 43,
        door_guid = 242
      )
      LocalObject(
        718,
        IFFLock.Constructor(Vector3(2326.047f, 3683.189f, 42.24466f), Vector3(0, 0, 180)),
        owning_building_guid = 43,
        door_guid = 239
      )
      LocalObject(
        719,
        IFFLock.Constructor(Vector3(2326.047f, 3683.189f, 62.24467f), Vector3(0, 0, 180)),
        owning_building_guid = 43,
        door_guid = 240
      )
      LocalObject(900, Locker.Constructor(Vector3(2327.716f, 3676.963f, 30.77766f)), owning_building_guid = 43)
      LocalObject(901, Locker.Constructor(Vector3(2327.751f, 3698.835f, 30.77766f)), owning_building_guid = 43)
      LocalObject(902, Locker.Constructor(Vector3(2329.053f, 3676.963f, 30.77766f)), owning_building_guid = 43)
      LocalObject(903, Locker.Constructor(Vector3(2329.088f, 3698.835f, 30.77766f)), owning_building_guid = 43)
      LocalObject(904, Locker.Constructor(Vector3(2331.741f, 3676.963f, 30.77766f)), owning_building_guid = 43)
      LocalObject(905, Locker.Constructor(Vector3(2331.741f, 3698.835f, 30.77766f)), owning_building_guid = 43)
      LocalObject(906, Locker.Constructor(Vector3(2333.143f, 3676.963f, 30.77766f)), owning_building_guid = 43)
      LocalObject(907, Locker.Constructor(Vector3(2333.143f, 3698.835f, 30.77766f)), owning_building_guid = 43)
      LocalObject(
        1341,
        Terminal.Constructor(Vector3(2333.445f, 3682.129f, 32.11567f), order_terminal),
        owning_building_guid = 43
      )
      LocalObject(
        1342,
        Terminal.Constructor(Vector3(2333.445f, 3687.853f, 32.11567f), order_terminal),
        owning_building_guid = 43
      )
      LocalObject(
        1343,
        Terminal.Constructor(Vector3(2333.445f, 3693.234f, 32.11567f), order_terminal),
        owning_building_guid = 43
      )
      LocalObject(
        1858,
        SpawnTube.Constructor(Vector3(2322.706f, 3679.742f, 30.26567f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 43
      )
      LocalObject(
        1859,
        SpawnTube.Constructor(Vector3(2322.706f, 3696.152f, 30.26567f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 43
      )
      LocalObject(
        1227,
        FacilityTurret.Constructor(Vector3(2299.32f, 3679.295f, 59.72566f), manned_turret),
        owning_building_guid = 43
      )
      TurretToWeapon(1227, 5053)
      LocalObject(
        1228,
        FacilityTurret.Constructor(Vector3(2334.647f, 3704.707f, 59.72566f), manned_turret),
        owning_building_guid = 43
      )
      TurretToWeapon(1228, 5054)
      LocalObject(
        1711,
        Painbox.Constructor(Vector3(2317.235f, 3685.803f, 32.28276f), painbox_radius_continuous),
        owning_building_guid = 43
      )
      LocalObject(
        1712,
        Painbox.Constructor(Vector3(2328.889f, 3694.086f, 30.88367f), painbox_radius_continuous),
        owning_building_guid = 43
      )
      LocalObject(
        1713,
        Painbox.Constructor(Vector3(2328.975f, 3682.223f, 30.88367f), painbox_radius_continuous),
        owning_building_guid = 43
      )
    }

    Building40()

    def Building40(): Unit = { // Name: Rashnu_Tower Type: tower_a GUID: 44, MapID: 40
      LocalBuilding(
        "Rashnu_Tower",
        44,
        40,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(3244f, 3758f, 49.76207f), Vector3(0f, 0f, 360f), tower_a)
        )
      )
      LocalObject(
        1928,
        CaptureTerminal.Constructor(Vector3(3260.587f, 3757.897f, 59.76107f), secondary_capture),
        owning_building_guid = 44
      )
      LocalObject(291, Door.Constructor(Vector3(3256f, 3750f, 51.28307f)), owning_building_guid = 44)
      LocalObject(292, Door.Constructor(Vector3(3256f, 3750f, 71.28207f)), owning_building_guid = 44)
      LocalObject(293, Door.Constructor(Vector3(3256f, 3766f, 51.28307f)), owning_building_guid = 44)
      LocalObject(294, Door.Constructor(Vector3(3256f, 3766f, 71.28207f)), owning_building_guid = 44)
      LocalObject(2025, Door.Constructor(Vector3(3255.146f, 3746.794f, 41.09807f)), owning_building_guid = 44)
      LocalObject(2026, Door.Constructor(Vector3(3255.146f, 3763.204f, 41.09807f)), owning_building_guid = 44)
      LocalObject(
        753,
        IFFLock.Constructor(Vector3(3253.957f, 3766.811f, 51.22306f), Vector3(0, 0, 0)),
        owning_building_guid = 44,
        door_guid = 293
      )
      LocalObject(
        754,
        IFFLock.Constructor(Vector3(3253.957f, 3766.811f, 71.22307f), Vector3(0, 0, 0)),
        owning_building_guid = 44,
        door_guid = 294
      )
      LocalObject(
        755,
        IFFLock.Constructor(Vector3(3258.047f, 3749.189f, 51.22306f), Vector3(0, 0, 180)),
        owning_building_guid = 44,
        door_guid = 291
      )
      LocalObject(
        756,
        IFFLock.Constructor(Vector3(3258.047f, 3749.189f, 71.22307f), Vector3(0, 0, 180)),
        owning_building_guid = 44,
        door_guid = 292
      )
      LocalObject(965, Locker.Constructor(Vector3(3259.716f, 3742.963f, 39.75607f)), owning_building_guid = 44)
      LocalObject(966, Locker.Constructor(Vector3(3259.751f, 3764.835f, 39.75607f)), owning_building_guid = 44)
      LocalObject(967, Locker.Constructor(Vector3(3261.053f, 3742.963f, 39.75607f)), owning_building_guid = 44)
      LocalObject(968, Locker.Constructor(Vector3(3261.088f, 3764.835f, 39.75607f)), owning_building_guid = 44)
      LocalObject(969, Locker.Constructor(Vector3(3263.741f, 3742.963f, 39.75607f)), owning_building_guid = 44)
      LocalObject(970, Locker.Constructor(Vector3(3263.741f, 3764.835f, 39.75607f)), owning_building_guid = 44)
      LocalObject(971, Locker.Constructor(Vector3(3265.143f, 3742.963f, 39.75607f)), owning_building_guid = 44)
      LocalObject(972, Locker.Constructor(Vector3(3265.143f, 3764.835f, 39.75607f)), owning_building_guid = 44)
      LocalObject(
        1363,
        Terminal.Constructor(Vector3(3265.445f, 3748.129f, 41.09407f), order_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        1364,
        Terminal.Constructor(Vector3(3265.445f, 3753.853f, 41.09407f), order_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        1365,
        Terminal.Constructor(Vector3(3265.445f, 3759.234f, 41.09407f), order_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        1872,
        SpawnTube.Constructor(Vector3(3254.706f, 3745.742f, 39.24406f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 44
      )
      LocalObject(
        1873,
        SpawnTube.Constructor(Vector3(3254.706f, 3762.152f, 39.24406f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 44
      )
      LocalObject(
        1247,
        FacilityTurret.Constructor(Vector3(3231.32f, 3745.295f, 68.70406f), manned_turret),
        owning_building_guid = 44
      )
      TurretToWeapon(1247, 5055)
      LocalObject(
        1248,
        FacilityTurret.Constructor(Vector3(3266.647f, 3770.707f, 68.70406f), manned_turret),
        owning_building_guid = 44
      )
      TurretToWeapon(1248, 5056)
      LocalObject(
        1723,
        Painbox.Constructor(Vector3(3249.235f, 3751.803f, 41.26117f), painbox_radius_continuous),
        owning_building_guid = 44
      )
      LocalObject(
        1724,
        Painbox.Constructor(Vector3(3260.889f, 3760.086f, 39.86207f), painbox_radius_continuous),
        owning_building_guid = 44
      )
      LocalObject(
        1725,
        Painbox.Constructor(Vector3(3260.975f, 3748.223f, 39.86207f), painbox_radius_continuous),
        owning_building_guid = 44
      )
    }

    Building14()

    def Building14(): Unit = { // Name: S_Forseral_Warpgate_Tower Type: tower_a GUID: 45, MapID: 14
      LocalBuilding(
        "S_Forseral_Warpgate_Tower",
        45,
        14,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(3520f, 5578f, 53.28131f), Vector3(0f, 0f, 360f), tower_a)
        )
      )
      LocalObject(
        1929,
        CaptureTerminal.Constructor(Vector3(3536.587f, 5577.897f, 63.28031f), secondary_capture),
        owning_building_guid = 45
      )
      LocalObject(303, Door.Constructor(Vector3(3532f, 5570f, 54.80231f)), owning_building_guid = 45)
      LocalObject(304, Door.Constructor(Vector3(3532f, 5570f, 74.80132f)), owning_building_guid = 45)
      LocalObject(305, Door.Constructor(Vector3(3532f, 5586f, 54.80231f)), owning_building_guid = 45)
      LocalObject(306, Door.Constructor(Vector3(3532f, 5586f, 74.80132f)), owning_building_guid = 45)
      LocalObject(2027, Door.Constructor(Vector3(3531.146f, 5566.794f, 44.61731f)), owning_building_guid = 45)
      LocalObject(2028, Door.Constructor(Vector3(3531.146f, 5583.204f, 44.61731f)), owning_building_guid = 45)
      LocalObject(
        758,
        IFFLock.Constructor(Vector3(3529.957f, 5586.811f, 54.74231f), Vector3(0, 0, 0)),
        owning_building_guid = 45,
        door_guid = 305
      )
      LocalObject(
        759,
        IFFLock.Constructor(Vector3(3529.957f, 5586.811f, 74.74231f), Vector3(0, 0, 0)),
        owning_building_guid = 45,
        door_guid = 306
      )
      LocalObject(
        761,
        IFFLock.Constructor(Vector3(3534.047f, 5569.189f, 54.74231f), Vector3(0, 0, 180)),
        owning_building_guid = 45,
        door_guid = 303
      )
      LocalObject(
        762,
        IFFLock.Constructor(Vector3(3534.047f, 5569.189f, 74.74231f), Vector3(0, 0, 180)),
        owning_building_guid = 45,
        door_guid = 304
      )
      LocalObject(973, Locker.Constructor(Vector3(3535.716f, 5562.963f, 43.27531f)), owning_building_guid = 45)
      LocalObject(974, Locker.Constructor(Vector3(3535.751f, 5584.835f, 43.27531f)), owning_building_guid = 45)
      LocalObject(975, Locker.Constructor(Vector3(3537.053f, 5562.963f, 43.27531f)), owning_building_guid = 45)
      LocalObject(976, Locker.Constructor(Vector3(3537.088f, 5584.835f, 43.27531f)), owning_building_guid = 45)
      LocalObject(977, Locker.Constructor(Vector3(3539.741f, 5562.963f, 43.27531f)), owning_building_guid = 45)
      LocalObject(978, Locker.Constructor(Vector3(3539.741f, 5584.835f, 43.27531f)), owning_building_guid = 45)
      LocalObject(979, Locker.Constructor(Vector3(3541.143f, 5562.963f, 43.27531f)), owning_building_guid = 45)
      LocalObject(980, Locker.Constructor(Vector3(3541.143f, 5584.835f, 43.27531f)), owning_building_guid = 45)
      LocalObject(
        1367,
        Terminal.Constructor(Vector3(3541.445f, 5568.129f, 44.61331f), order_terminal),
        owning_building_guid = 45
      )
      LocalObject(
        1368,
        Terminal.Constructor(Vector3(3541.445f, 5573.853f, 44.61331f), order_terminal),
        owning_building_guid = 45
      )
      LocalObject(
        1369,
        Terminal.Constructor(Vector3(3541.445f, 5579.234f, 44.61331f), order_terminal),
        owning_building_guid = 45
      )
      LocalObject(
        1874,
        SpawnTube.Constructor(Vector3(3530.706f, 5565.742f, 42.76331f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 45
      )
      LocalObject(
        1875,
        SpawnTube.Constructor(Vector3(3530.706f, 5582.152f, 42.76331f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 45
      )
      LocalObject(
        1251,
        FacilityTurret.Constructor(Vector3(3507.32f, 5565.295f, 72.22331f), manned_turret),
        owning_building_guid = 45
      )
      TurretToWeapon(1251, 5057)
      LocalObject(
        1253,
        FacilityTurret.Constructor(Vector3(3542.647f, 5590.707f, 72.22331f), manned_turret),
        owning_building_guid = 45
      )
      TurretToWeapon(1253, 5058)
      LocalObject(
        1726,
        Painbox.Constructor(Vector3(3525.235f, 5571.803f, 44.78041f), painbox_radius_continuous),
        owning_building_guid = 45
      )
      LocalObject(
        1727,
        Painbox.Constructor(Vector3(3536.889f, 5580.086f, 43.38131f), painbox_radius_continuous),
        owning_building_guid = 45
      )
      LocalObject(
        1728,
        Painbox.Constructor(Vector3(3536.975f, 5568.223f, 43.38131f), painbox_radius_continuous),
        owning_building_guid = 45
      )
    }

    Building21()

    def Building21(): Unit = { // Name: W_Yazata_Tower Type: tower_a GUID: 46, MapID: 21
      LocalBuilding(
        "W_Yazata_Tower",
        46,
        21,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(4074f, 3888f, 36.98511f), Vector3(0f, 0f, 360f), tower_a)
        )
      )
      LocalObject(
        1932,
        CaptureTerminal.Constructor(Vector3(4090.587f, 3887.897f, 46.98411f), secondary_capture),
        owning_building_guid = 46
      )
      LocalObject(359, Door.Constructor(Vector3(4086f, 3880f, 38.50611f)), owning_building_guid = 46)
      LocalObject(360, Door.Constructor(Vector3(4086f, 3880f, 58.50511f)), owning_building_guid = 46)
      LocalObject(361, Door.Constructor(Vector3(4086f, 3896f, 38.50611f)), owning_building_guid = 46)
      LocalObject(362, Door.Constructor(Vector3(4086f, 3896f, 58.50511f)), owning_building_guid = 46)
      LocalObject(2042, Door.Constructor(Vector3(4085.146f, 3876.794f, 28.32111f)), owning_building_guid = 46)
      LocalObject(2043, Door.Constructor(Vector3(4085.146f, 3893.204f, 28.32111f)), owning_building_guid = 46)
      LocalObject(
        804,
        IFFLock.Constructor(Vector3(4083.957f, 3896.811f, 38.44611f), Vector3(0, 0, 0)),
        owning_building_guid = 46,
        door_guid = 361
      )
      LocalObject(
        805,
        IFFLock.Constructor(Vector3(4083.957f, 3896.811f, 58.44611f), Vector3(0, 0, 0)),
        owning_building_guid = 46,
        door_guid = 362
      )
      LocalObject(
        806,
        IFFLock.Constructor(Vector3(4088.047f, 3879.189f, 38.44611f), Vector3(0, 0, 180)),
        owning_building_guid = 46,
        door_guid = 359
      )
      LocalObject(
        807,
        IFFLock.Constructor(Vector3(4088.047f, 3879.189f, 58.44611f), Vector3(0, 0, 180)),
        owning_building_guid = 46,
        door_guid = 360
      )
      LocalObject(1042, Locker.Constructor(Vector3(4089.716f, 3872.963f, 26.97911f)), owning_building_guid = 46)
      LocalObject(1043, Locker.Constructor(Vector3(4089.751f, 3894.835f, 26.97911f)), owning_building_guid = 46)
      LocalObject(1044, Locker.Constructor(Vector3(4091.053f, 3872.963f, 26.97911f)), owning_building_guid = 46)
      LocalObject(1045, Locker.Constructor(Vector3(4091.088f, 3894.835f, 26.97911f)), owning_building_guid = 46)
      LocalObject(1046, Locker.Constructor(Vector3(4093.741f, 3872.963f, 26.97911f)), owning_building_guid = 46)
      LocalObject(1047, Locker.Constructor(Vector3(4093.741f, 3894.835f, 26.97911f)), owning_building_guid = 46)
      LocalObject(1048, Locker.Constructor(Vector3(4095.143f, 3872.963f, 26.97911f)), owning_building_guid = 46)
      LocalObject(1049, Locker.Constructor(Vector3(4095.143f, 3894.835f, 26.97911f)), owning_building_guid = 46)
      LocalObject(
        1394,
        Terminal.Constructor(Vector3(4095.445f, 3878.129f, 28.31711f), order_terminal),
        owning_building_guid = 46
      )
      LocalObject(
        1395,
        Terminal.Constructor(Vector3(4095.445f, 3883.853f, 28.31711f), order_terminal),
        owning_building_guid = 46
      )
      LocalObject(
        1396,
        Terminal.Constructor(Vector3(4095.445f, 3889.234f, 28.31711f), order_terminal),
        owning_building_guid = 46
      )
      LocalObject(
        1889,
        SpawnTube.Constructor(Vector3(4084.706f, 3875.742f, 26.46711f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 46
      )
      LocalObject(
        1890,
        SpawnTube.Constructor(Vector3(4084.706f, 3892.152f, 26.46711f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 46
      )
      LocalObject(
        1271,
        FacilityTurret.Constructor(Vector3(4061.32f, 3875.295f, 55.92711f), manned_turret),
        owning_building_guid = 46
      )
      TurretToWeapon(1271, 5059)
      LocalObject(
        1273,
        FacilityTurret.Constructor(Vector3(4096.647f, 3900.707f, 55.92711f), manned_turret),
        owning_building_guid = 46
      )
      TurretToWeapon(1273, 5060)
      LocalObject(
        1735,
        Painbox.Constructor(Vector3(4079.235f, 3881.803f, 28.48421f), painbox_radius_continuous),
        owning_building_guid = 46
      )
      LocalObject(
        1736,
        Painbox.Constructor(Vector3(4090.889f, 3890.086f, 27.08511f), painbox_radius_continuous),
        owning_building_guid = 46
      )
      LocalObject(
        1737,
        Painbox.Constructor(Vector3(4090.975f, 3878.223f, 27.08511f), painbox_radius_continuous),
        owning_building_guid = 46
      )
    }

    Building42()

    def Building42(): Unit = { // Name: Zal_Tower Type: tower_a GUID: 47, MapID: 42
      LocalBuilding(
        "Zal_Tower",
        47,
        42,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(4132f, 2062f, 44.47557f), Vector3(0f, 0f, 360f), tower_a)
        )
      )
      LocalObject(
        1933,
        CaptureTerminal.Constructor(Vector3(4148.587f, 2061.897f, 54.47458f), secondary_capture),
        owning_building_guid = 47
      )
      LocalObject(363, Door.Constructor(Vector3(4144f, 2054f, 45.99657f)), owning_building_guid = 47)
      LocalObject(364, Door.Constructor(Vector3(4144f, 2054f, 65.99557f)), owning_building_guid = 47)
      LocalObject(365, Door.Constructor(Vector3(4144f, 2070f, 45.99657f)), owning_building_guid = 47)
      LocalObject(366, Door.Constructor(Vector3(4144f, 2070f, 65.99557f)), owning_building_guid = 47)
      LocalObject(2044, Door.Constructor(Vector3(4143.146f, 2050.794f, 35.81158f)), owning_building_guid = 47)
      LocalObject(2045, Door.Constructor(Vector3(4143.146f, 2067.204f, 35.81158f)), owning_building_guid = 47)
      LocalObject(
        808,
        IFFLock.Constructor(Vector3(4141.957f, 2070.811f, 45.93657f), Vector3(0, 0, 0)),
        owning_building_guid = 47,
        door_guid = 365
      )
      LocalObject(
        809,
        IFFLock.Constructor(Vector3(4141.957f, 2070.811f, 65.93658f), Vector3(0, 0, 0)),
        owning_building_guid = 47,
        door_guid = 366
      )
      LocalObject(
        810,
        IFFLock.Constructor(Vector3(4146.047f, 2053.189f, 45.93657f), Vector3(0, 0, 180)),
        owning_building_guid = 47,
        door_guid = 363
      )
      LocalObject(
        811,
        IFFLock.Constructor(Vector3(4146.047f, 2053.189f, 65.93658f), Vector3(0, 0, 180)),
        owning_building_guid = 47,
        door_guid = 364
      )
      LocalObject(1050, Locker.Constructor(Vector3(4147.716f, 2046.963f, 34.46957f)), owning_building_guid = 47)
      LocalObject(1051, Locker.Constructor(Vector3(4147.751f, 2068.835f, 34.46957f)), owning_building_guid = 47)
      LocalObject(1052, Locker.Constructor(Vector3(4149.053f, 2046.963f, 34.46957f)), owning_building_guid = 47)
      LocalObject(1053, Locker.Constructor(Vector3(4149.088f, 2068.835f, 34.46957f)), owning_building_guid = 47)
      LocalObject(1054, Locker.Constructor(Vector3(4151.741f, 2046.963f, 34.46957f)), owning_building_guid = 47)
      LocalObject(1055, Locker.Constructor(Vector3(4151.741f, 2068.835f, 34.46957f)), owning_building_guid = 47)
      LocalObject(1056, Locker.Constructor(Vector3(4153.143f, 2046.963f, 34.46957f)), owning_building_guid = 47)
      LocalObject(1057, Locker.Constructor(Vector3(4153.143f, 2068.835f, 34.46957f)), owning_building_guid = 47)
      LocalObject(
        1397,
        Terminal.Constructor(Vector3(4153.445f, 2052.129f, 35.80758f), order_terminal),
        owning_building_guid = 47
      )
      LocalObject(
        1398,
        Terminal.Constructor(Vector3(4153.445f, 2057.853f, 35.80758f), order_terminal),
        owning_building_guid = 47
      )
      LocalObject(
        1399,
        Terminal.Constructor(Vector3(4153.445f, 2063.234f, 35.80758f), order_terminal),
        owning_building_guid = 47
      )
      LocalObject(
        1891,
        SpawnTube.Constructor(Vector3(4142.706f, 2049.742f, 33.95757f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 47
      )
      LocalObject(
        1892,
        SpawnTube.Constructor(Vector3(4142.706f, 2066.152f, 33.95757f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 47
      )
      LocalObject(
        1274,
        FacilityTurret.Constructor(Vector3(4119.32f, 2049.295f, 63.41757f), manned_turret),
        owning_building_guid = 47
      )
      TurretToWeapon(1274, 5061)
      LocalObject(
        1275,
        FacilityTurret.Constructor(Vector3(4154.647f, 2074.707f, 63.41757f), manned_turret),
        owning_building_guid = 47
      )
      TurretToWeapon(1275, 5062)
      LocalObject(
        1738,
        Painbox.Constructor(Vector3(4137.235f, 2055.803f, 35.97467f), painbox_radius_continuous),
        owning_building_guid = 47
      )
      LocalObject(
        1739,
        Painbox.Constructor(Vector3(4148.889f, 2064.086f, 34.57558f), painbox_radius_continuous),
        owning_building_guid = 47
      )
      LocalObject(
        1740,
        Painbox.Constructor(Vector3(4148.975f, 2052.223f, 34.57558f), painbox_radius_continuous),
        owning_building_guid = 47
      )
    }

    Building27()

    def Building27(): Unit = { // Name: SW_Esamir_Warpgate_Tower Type: tower_a GUID: 48, MapID: 27
      LocalBuilding(
        "SW_Esamir_Warpgate_Tower",
        48,
        27,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(5040f, 2300f, 57.00369f), Vector3(0f, 0f, 360f), tower_a)
        )
      )
      LocalObject(
        1938,
        CaptureTerminal.Constructor(Vector3(5056.587f, 2299.897f, 67.00269f), secondary_capture),
        owning_building_guid = 48
      )
      LocalObject(414, Door.Constructor(Vector3(5052f, 2292f, 58.52469f)), owning_building_guid = 48)
      LocalObject(415, Door.Constructor(Vector3(5052f, 2292f, 78.5237f)), owning_building_guid = 48)
      LocalObject(416, Door.Constructor(Vector3(5052f, 2308f, 58.52469f)), owning_building_guid = 48)
      LocalObject(417, Door.Constructor(Vector3(5052f, 2308f, 78.5237f)), owning_building_guid = 48)
      LocalObject(2060, Door.Constructor(Vector3(5051.146f, 2288.794f, 48.33969f)), owning_building_guid = 48)
      LocalObject(2061, Door.Constructor(Vector3(5051.146f, 2305.204f, 48.33969f)), owning_building_guid = 48)
      LocalObject(
        848,
        IFFLock.Constructor(Vector3(5049.957f, 2308.811f, 58.46469f), Vector3(0, 0, 0)),
        owning_building_guid = 48,
        door_guid = 416
      )
      LocalObject(
        849,
        IFFLock.Constructor(Vector3(5049.957f, 2308.811f, 78.46469f), Vector3(0, 0, 0)),
        owning_building_guid = 48,
        door_guid = 417
      )
      LocalObject(
        850,
        IFFLock.Constructor(Vector3(5054.047f, 2291.189f, 58.46469f), Vector3(0, 0, 180)),
        owning_building_guid = 48,
        door_guid = 414
      )
      LocalObject(
        851,
        IFFLock.Constructor(Vector3(5054.047f, 2291.189f, 78.46469f), Vector3(0, 0, 180)),
        owning_building_guid = 48,
        door_guid = 415
      )
      LocalObject(1123, Locker.Constructor(Vector3(5055.716f, 2284.963f, 46.99769f)), owning_building_guid = 48)
      LocalObject(1124, Locker.Constructor(Vector3(5055.751f, 2306.835f, 46.99769f)), owning_building_guid = 48)
      LocalObject(1125, Locker.Constructor(Vector3(5057.053f, 2284.963f, 46.99769f)), owning_building_guid = 48)
      LocalObject(1126, Locker.Constructor(Vector3(5057.088f, 2306.835f, 46.99769f)), owning_building_guid = 48)
      LocalObject(1127, Locker.Constructor(Vector3(5059.741f, 2284.963f, 46.99769f)), owning_building_guid = 48)
      LocalObject(1128, Locker.Constructor(Vector3(5059.741f, 2306.835f, 46.99769f)), owning_building_guid = 48)
      LocalObject(1129, Locker.Constructor(Vector3(5061.143f, 2284.963f, 46.99769f)), owning_building_guid = 48)
      LocalObject(1130, Locker.Constructor(Vector3(5061.143f, 2306.835f, 46.99769f)), owning_building_guid = 48)
      LocalObject(
        1420,
        Terminal.Constructor(Vector3(5061.445f, 2290.129f, 48.33569f), order_terminal),
        owning_building_guid = 48
      )
      LocalObject(
        1421,
        Terminal.Constructor(Vector3(5061.445f, 2295.853f, 48.33569f), order_terminal),
        owning_building_guid = 48
      )
      LocalObject(
        1422,
        Terminal.Constructor(Vector3(5061.445f, 2301.234f, 48.33569f), order_terminal),
        owning_building_guid = 48
      )
      LocalObject(
        1907,
        SpawnTube.Constructor(Vector3(5050.706f, 2287.742f, 46.48569f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 48
      )
      LocalObject(
        1908,
        SpawnTube.Constructor(Vector3(5050.706f, 2304.152f, 46.48569f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 48
      )
      LocalObject(
        1291,
        FacilityTurret.Constructor(Vector3(5027.32f, 2287.295f, 75.94569f), manned_turret),
        owning_building_guid = 48
      )
      TurretToWeapon(1291, 5063)
      LocalObject(
        1292,
        FacilityTurret.Constructor(Vector3(5062.647f, 2312.707f, 75.94569f), manned_turret),
        owning_building_guid = 48
      )
      TurretToWeapon(1292, 5064)
      LocalObject(
        1753,
        Painbox.Constructor(Vector3(5045.235f, 2293.803f, 48.50279f), painbox_radius_continuous),
        owning_building_guid = 48
      )
      LocalObject(
        1754,
        Painbox.Constructor(Vector3(5056.889f, 2302.086f, 47.10369f), painbox_radius_continuous),
        owning_building_guid = 48
      )
      LocalObject(
        1755,
        Painbox.Constructor(Vector3(5056.975f, 2290.223f, 47.10369f), painbox_radius_continuous),
        owning_building_guid = 48
      )
    }

    Building22()

    def Building22(): Unit = { // Name: S_Hossin_Warpgate_Tower Type: tower_a GUID: 49, MapID: 22
      LocalBuilding(
        "S_Hossin_Warpgate_Tower",
        49,
        22,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(5080f, 4766f, 75.09348f), Vector3(0f, 0f, 360f), tower_a)
        )
      )
      LocalObject(
        1939,
        CaptureTerminal.Constructor(Vector3(5096.587f, 4765.897f, 85.09248f), secondary_capture),
        owning_building_guid = 49
      )
      LocalObject(418, Door.Constructor(Vector3(5092f, 4758f, 76.61448f)), owning_building_guid = 49)
      LocalObject(419, Door.Constructor(Vector3(5092f, 4758f, 96.61348f)), owning_building_guid = 49)
      LocalObject(420, Door.Constructor(Vector3(5092f, 4774f, 76.61448f)), owning_building_guid = 49)
      LocalObject(421, Door.Constructor(Vector3(5092f, 4774f, 96.61348f)), owning_building_guid = 49)
      LocalObject(2062, Door.Constructor(Vector3(5091.146f, 4754.794f, 66.42947f)), owning_building_guid = 49)
      LocalObject(2063, Door.Constructor(Vector3(5091.146f, 4771.204f, 66.42947f)), owning_building_guid = 49)
      LocalObject(
        852,
        IFFLock.Constructor(Vector3(5089.957f, 4774.811f, 76.55447f), Vector3(0, 0, 0)),
        owning_building_guid = 49,
        door_guid = 420
      )
      LocalObject(
        853,
        IFFLock.Constructor(Vector3(5089.957f, 4774.811f, 96.55447f), Vector3(0, 0, 0)),
        owning_building_guid = 49,
        door_guid = 421
      )
      LocalObject(
        854,
        IFFLock.Constructor(Vector3(5094.047f, 4757.189f, 76.55447f), Vector3(0, 0, 180)),
        owning_building_guid = 49,
        door_guid = 418
      )
      LocalObject(
        855,
        IFFLock.Constructor(Vector3(5094.047f, 4757.189f, 96.55447f), Vector3(0, 0, 180)),
        owning_building_guid = 49,
        door_guid = 419
      )
      LocalObject(1131, Locker.Constructor(Vector3(5095.716f, 4750.963f, 65.08748f)), owning_building_guid = 49)
      LocalObject(1132, Locker.Constructor(Vector3(5095.751f, 4772.835f, 65.08748f)), owning_building_guid = 49)
      LocalObject(1133, Locker.Constructor(Vector3(5097.053f, 4750.963f, 65.08748f)), owning_building_guid = 49)
      LocalObject(1134, Locker.Constructor(Vector3(5097.088f, 4772.835f, 65.08748f)), owning_building_guid = 49)
      LocalObject(1135, Locker.Constructor(Vector3(5099.741f, 4750.963f, 65.08748f)), owning_building_guid = 49)
      LocalObject(1136, Locker.Constructor(Vector3(5099.741f, 4772.835f, 65.08748f)), owning_building_guid = 49)
      LocalObject(1137, Locker.Constructor(Vector3(5101.143f, 4750.963f, 65.08748f)), owning_building_guid = 49)
      LocalObject(1138, Locker.Constructor(Vector3(5101.143f, 4772.835f, 65.08748f)), owning_building_guid = 49)
      LocalObject(
        1423,
        Terminal.Constructor(Vector3(5101.445f, 4756.129f, 66.42548f), order_terminal),
        owning_building_guid = 49
      )
      LocalObject(
        1424,
        Terminal.Constructor(Vector3(5101.445f, 4761.853f, 66.42548f), order_terminal),
        owning_building_guid = 49
      )
      LocalObject(
        1425,
        Terminal.Constructor(Vector3(5101.445f, 4767.234f, 66.42548f), order_terminal),
        owning_building_guid = 49
      )
      LocalObject(
        1909,
        SpawnTube.Constructor(Vector3(5090.706f, 4753.742f, 64.57548f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 49
      )
      LocalObject(
        1910,
        SpawnTube.Constructor(Vector3(5090.706f, 4770.152f, 64.57548f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 49
      )
      LocalObject(
        1293,
        FacilityTurret.Constructor(Vector3(5067.32f, 4753.295f, 94.03548f), manned_turret),
        owning_building_guid = 49
      )
      TurretToWeapon(1293, 5065)
      LocalObject(
        1294,
        FacilityTurret.Constructor(Vector3(5102.647f, 4778.707f, 94.03548f), manned_turret),
        owning_building_guid = 49
      )
      TurretToWeapon(1294, 5066)
      LocalObject(
        1756,
        Painbox.Constructor(Vector3(5085.235f, 4759.803f, 66.59258f), painbox_radius_continuous),
        owning_building_guid = 49
      )
      LocalObject(
        1757,
        Painbox.Constructor(Vector3(5096.889f, 4768.086f, 65.19347f), painbox_radius_continuous),
        owning_building_guid = 49
      )
      LocalObject(
        1758,
        Painbox.Constructor(Vector3(5096.975f, 4756.223f, 65.19347f), painbox_radius_continuous),
        owning_building_guid = 49
      )
    }

    Building44()

    def Building44(): Unit = { // Name: Izha_Tower Type: tower_a GUID: 50, MapID: 44
      LocalBuilding(
        "Izha_Tower",
        50,
        44,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(5240f, 3934f, 49.1933f), Vector3(0f, 0f, 360f), tower_a)
        )
      )
      LocalObject(
        1940,
        CaptureTerminal.Constructor(Vector3(5256.587f, 3933.897f, 59.1923f), secondary_capture),
        owning_building_guid = 50
      )
      LocalObject(422, Door.Constructor(Vector3(5252f, 3926f, 50.7143f)), owning_building_guid = 50)
      LocalObject(423, Door.Constructor(Vector3(5252f, 3926f, 70.7133f)), owning_building_guid = 50)
      LocalObject(424, Door.Constructor(Vector3(5252f, 3942f, 50.7143f)), owning_building_guid = 50)
      LocalObject(425, Door.Constructor(Vector3(5252f, 3942f, 70.7133f)), owning_building_guid = 50)
      LocalObject(2064, Door.Constructor(Vector3(5251.146f, 3922.794f, 40.5293f)), owning_building_guid = 50)
      LocalObject(2065, Door.Constructor(Vector3(5251.146f, 3939.204f, 40.5293f)), owning_building_guid = 50)
      LocalObject(
        856,
        IFFLock.Constructor(Vector3(5249.957f, 3942.811f, 50.6543f), Vector3(0, 0, 0)),
        owning_building_guid = 50,
        door_guid = 424
      )
      LocalObject(
        857,
        IFFLock.Constructor(Vector3(5249.957f, 3942.811f, 70.6543f), Vector3(0, 0, 0)),
        owning_building_guid = 50,
        door_guid = 425
      )
      LocalObject(
        858,
        IFFLock.Constructor(Vector3(5254.047f, 3925.189f, 50.6543f), Vector3(0, 0, 180)),
        owning_building_guid = 50,
        door_guid = 422
      )
      LocalObject(
        859,
        IFFLock.Constructor(Vector3(5254.047f, 3925.189f, 70.6543f), Vector3(0, 0, 180)),
        owning_building_guid = 50,
        door_guid = 423
      )
      LocalObject(1139, Locker.Constructor(Vector3(5255.716f, 3918.963f, 39.1873f)), owning_building_guid = 50)
      LocalObject(1140, Locker.Constructor(Vector3(5255.751f, 3940.835f, 39.1873f)), owning_building_guid = 50)
      LocalObject(1141, Locker.Constructor(Vector3(5257.053f, 3918.963f, 39.1873f)), owning_building_guid = 50)
      LocalObject(1142, Locker.Constructor(Vector3(5257.088f, 3940.835f, 39.1873f)), owning_building_guid = 50)
      LocalObject(1143, Locker.Constructor(Vector3(5259.741f, 3918.963f, 39.1873f)), owning_building_guid = 50)
      LocalObject(1144, Locker.Constructor(Vector3(5259.741f, 3940.835f, 39.1873f)), owning_building_guid = 50)
      LocalObject(1145, Locker.Constructor(Vector3(5261.143f, 3918.963f, 39.1873f)), owning_building_guid = 50)
      LocalObject(1146, Locker.Constructor(Vector3(5261.143f, 3940.835f, 39.1873f)), owning_building_guid = 50)
      LocalObject(
        1426,
        Terminal.Constructor(Vector3(5261.445f, 3924.129f, 40.5253f), order_terminal),
        owning_building_guid = 50
      )
      LocalObject(
        1427,
        Terminal.Constructor(Vector3(5261.445f, 3929.853f, 40.5253f), order_terminal),
        owning_building_guid = 50
      )
      LocalObject(
        1428,
        Terminal.Constructor(Vector3(5261.445f, 3935.234f, 40.5253f), order_terminal),
        owning_building_guid = 50
      )
      LocalObject(
        1911,
        SpawnTube.Constructor(Vector3(5250.706f, 3921.742f, 38.6753f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 50
      )
      LocalObject(
        1912,
        SpawnTube.Constructor(Vector3(5250.706f, 3938.152f, 38.6753f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 50
      )
      LocalObject(
        1295,
        FacilityTurret.Constructor(Vector3(5227.32f, 3921.295f, 68.1353f), manned_turret),
        owning_building_guid = 50
      )
      TurretToWeapon(1295, 5067)
      LocalObject(
        1296,
        FacilityTurret.Constructor(Vector3(5262.647f, 3946.707f, 68.1353f), manned_turret),
        owning_building_guid = 50
      )
      TurretToWeapon(1296, 5068)
      LocalObject(
        1759,
        Painbox.Constructor(Vector3(5245.235f, 3927.803f, 40.6924f), painbox_radius_continuous),
        owning_building_guid = 50
      )
      LocalObject(
        1760,
        Painbox.Constructor(Vector3(5256.889f, 3936.086f, 39.2933f), painbox_radius_continuous),
        owning_building_guid = 50
      )
      LocalObject(
        1761,
        Painbox.Constructor(Vector3(5256.975f, 3924.223f, 39.2933f), painbox_radius_continuous),
        owning_building_guid = 50
      )
    }

    Building18()

    def Building18(): Unit = { // Name: NE_Amerish_Warpgate_Tower Type: tower_b GUID: 51, MapID: 18
      LocalBuilding(
        "NE_Amerish_Warpgate_Tower",
        51,
        18,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(2888f, 2148f, 37.99061f), Vector3(0f, 0f, 360f), tower_b)
        )
      )
      LocalObject(
        1926,
        CaptureTerminal.Constructor(Vector3(2904.587f, 2147.897f, 57.98961f), secondary_capture),
        owning_building_guid = 51
      )
      LocalObject(270, Door.Constructor(Vector3(2900f, 2140f, 39.51061f)), owning_building_guid = 51)
      LocalObject(271, Door.Constructor(Vector3(2900f, 2140f, 49.51061f)), owning_building_guid = 51)
      LocalObject(272, Door.Constructor(Vector3(2900f, 2140f, 69.51061f)), owning_building_guid = 51)
      LocalObject(273, Door.Constructor(Vector3(2900f, 2156f, 39.51061f)), owning_building_guid = 51)
      LocalObject(274, Door.Constructor(Vector3(2900f, 2156f, 49.51061f)), owning_building_guid = 51)
      LocalObject(275, Door.Constructor(Vector3(2900f, 2156f, 69.51061f)), owning_building_guid = 51)
      LocalObject(2018, Door.Constructor(Vector3(2899.147f, 2136.794f, 29.32661f)), owning_building_guid = 51)
      LocalObject(2019, Door.Constructor(Vector3(2899.147f, 2153.204f, 29.32661f)), owning_building_guid = 51)
      LocalObject(
        735,
        IFFLock.Constructor(Vector3(2897.957f, 2156.811f, 39.45161f), Vector3(0, 0, 0)),
        owning_building_guid = 51,
        door_guid = 273
      )
      LocalObject(
        736,
        IFFLock.Constructor(Vector3(2897.957f, 2156.811f, 49.45161f), Vector3(0, 0, 0)),
        owning_building_guid = 51,
        door_guid = 274
      )
      LocalObject(
        737,
        IFFLock.Constructor(Vector3(2897.957f, 2156.811f, 69.45161f), Vector3(0, 0, 0)),
        owning_building_guid = 51,
        door_guid = 275
      )
      LocalObject(
        738,
        IFFLock.Constructor(Vector3(2902.047f, 2139.189f, 39.45161f), Vector3(0, 0, 180)),
        owning_building_guid = 51,
        door_guid = 270
      )
      LocalObject(
        739,
        IFFLock.Constructor(Vector3(2902.047f, 2139.189f, 49.45161f), Vector3(0, 0, 180)),
        owning_building_guid = 51,
        door_guid = 271
      )
      LocalObject(
        740,
        IFFLock.Constructor(Vector3(2902.047f, 2139.189f, 69.45161f), Vector3(0, 0, 180)),
        owning_building_guid = 51,
        door_guid = 272
      )
      LocalObject(928, Locker.Constructor(Vector3(2903.716f, 2132.963f, 27.98461f)), owning_building_guid = 51)
      LocalObject(929, Locker.Constructor(Vector3(2903.751f, 2154.835f, 27.98461f)), owning_building_guid = 51)
      LocalObject(930, Locker.Constructor(Vector3(2905.053f, 2132.963f, 27.98461f)), owning_building_guid = 51)
      LocalObject(931, Locker.Constructor(Vector3(2905.088f, 2154.835f, 27.98461f)), owning_building_guid = 51)
      LocalObject(932, Locker.Constructor(Vector3(2907.741f, 2132.963f, 27.98461f)), owning_building_guid = 51)
      LocalObject(933, Locker.Constructor(Vector3(2907.741f, 2154.835f, 27.98461f)), owning_building_guid = 51)
      LocalObject(934, Locker.Constructor(Vector3(2909.143f, 2132.963f, 27.98461f)), owning_building_guid = 51)
      LocalObject(935, Locker.Constructor(Vector3(2909.143f, 2154.835f, 27.98461f)), owning_building_guid = 51)
      LocalObject(
        1353,
        Terminal.Constructor(Vector3(2909.446f, 2138.129f, 29.32261f), order_terminal),
        owning_building_guid = 51
      )
      LocalObject(
        1354,
        Terminal.Constructor(Vector3(2909.446f, 2143.853f, 29.32261f), order_terminal),
        owning_building_guid = 51
      )
      LocalObject(
        1355,
        Terminal.Constructor(Vector3(2909.446f, 2149.234f, 29.32261f), order_terminal),
        owning_building_guid = 51
      )
      LocalObject(
        1865,
        SpawnTube.Constructor(Vector3(2898.706f, 2135.742f, 27.47261f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 51
      )
      LocalObject(
        1866,
        SpawnTube.Constructor(Vector3(2898.706f, 2152.152f, 27.47261f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 51
      )
      LocalObject(
        1717,
        Painbox.Constructor(Vector3(2893.493f, 2140.849f, 29.28001f), painbox_radius_continuous),
        owning_building_guid = 51
      )
      LocalObject(
        1718,
        Painbox.Constructor(Vector3(2905.127f, 2138.078f, 28.09061f), painbox_radius_continuous),
        owning_building_guid = 51
      )
      LocalObject(
        1719,
        Painbox.Constructor(Vector3(2905.259f, 2150.107f, 28.09061f), painbox_radius_continuous),
        owning_building_guid = 51
      )
    }

    Building15()

    def Building15(): Unit = { // Name: W_Hvar_Tower Type: tower_b GUID: 52, MapID: 15
      LocalBuilding(
        "W_Hvar_Tower",
        52,
        15,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(3700f, 4456f, 53.26608f), Vector3(0f, 0f, 360f), tower_b)
        )
      )
      LocalObject(
        1931,
        CaptureTerminal.Constructor(Vector3(3716.587f, 4455.897f, 73.26508f), secondary_capture),
        owning_building_guid = 52
      )
      LocalObject(326, Door.Constructor(Vector3(3712f, 4448f, 54.78608f)), owning_building_guid = 52)
      LocalObject(327, Door.Constructor(Vector3(3712f, 4448f, 64.78608f)), owning_building_guid = 52)
      LocalObject(328, Door.Constructor(Vector3(3712f, 4448f, 84.78608f)), owning_building_guid = 52)
      LocalObject(329, Door.Constructor(Vector3(3712f, 4464f, 54.78608f)), owning_building_guid = 52)
      LocalObject(330, Door.Constructor(Vector3(3712f, 4464f, 64.78608f)), owning_building_guid = 52)
      LocalObject(331, Door.Constructor(Vector3(3712f, 4464f, 84.78608f)), owning_building_guid = 52)
      LocalObject(2034, Door.Constructor(Vector3(3711.147f, 4444.794f, 44.60208f)), owning_building_guid = 52)
      LocalObject(2035, Door.Constructor(Vector3(3711.147f, 4461.204f, 44.60208f)), owning_building_guid = 52)
      LocalObject(
        779,
        IFFLock.Constructor(Vector3(3709.957f, 4464.811f, 54.72708f), Vector3(0, 0, 0)),
        owning_building_guid = 52,
        door_guid = 329
      )
      LocalObject(
        780,
        IFFLock.Constructor(Vector3(3709.957f, 4464.811f, 64.72708f), Vector3(0, 0, 0)),
        owning_building_guid = 52,
        door_guid = 330
      )
      LocalObject(
        781,
        IFFLock.Constructor(Vector3(3709.957f, 4464.811f, 84.72708f), Vector3(0, 0, 0)),
        owning_building_guid = 52,
        door_guid = 331
      )
      LocalObject(
        782,
        IFFLock.Constructor(Vector3(3714.047f, 4447.189f, 54.72708f), Vector3(0, 0, 180)),
        owning_building_guid = 52,
        door_guid = 326
      )
      LocalObject(
        783,
        IFFLock.Constructor(Vector3(3714.047f, 4447.189f, 64.72708f), Vector3(0, 0, 180)),
        owning_building_guid = 52,
        door_guid = 327
      )
      LocalObject(
        784,
        IFFLock.Constructor(Vector3(3714.047f, 4447.189f, 84.72708f), Vector3(0, 0, 180)),
        owning_building_guid = 52,
        door_guid = 328
      )
      LocalObject(1001, Locker.Constructor(Vector3(3715.716f, 4440.963f, 43.26008f)), owning_building_guid = 52)
      LocalObject(1002, Locker.Constructor(Vector3(3715.751f, 4462.835f, 43.26008f)), owning_building_guid = 52)
      LocalObject(1003, Locker.Constructor(Vector3(3717.053f, 4440.963f, 43.26008f)), owning_building_guid = 52)
      LocalObject(1004, Locker.Constructor(Vector3(3717.088f, 4462.835f, 43.26008f)), owning_building_guid = 52)
      LocalObject(1005, Locker.Constructor(Vector3(3719.741f, 4440.963f, 43.26008f)), owning_building_guid = 52)
      LocalObject(1006, Locker.Constructor(Vector3(3719.741f, 4462.835f, 43.26008f)), owning_building_guid = 52)
      LocalObject(1007, Locker.Constructor(Vector3(3721.143f, 4440.963f, 43.26008f)), owning_building_guid = 52)
      LocalObject(1008, Locker.Constructor(Vector3(3721.143f, 4462.835f, 43.26008f)), owning_building_guid = 52)
      LocalObject(
        1380,
        Terminal.Constructor(Vector3(3721.446f, 4446.129f, 44.59808f), order_terminal),
        owning_building_guid = 52
      )
      LocalObject(
        1381,
        Terminal.Constructor(Vector3(3721.446f, 4451.853f, 44.59808f), order_terminal),
        owning_building_guid = 52
      )
      LocalObject(
        1382,
        Terminal.Constructor(Vector3(3721.446f, 4457.234f, 44.59808f), order_terminal),
        owning_building_guid = 52
      )
      LocalObject(
        1881,
        SpawnTube.Constructor(Vector3(3710.706f, 4443.742f, 42.74808f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 52
      )
      LocalObject(
        1882,
        SpawnTube.Constructor(Vector3(3710.706f, 4460.152f, 42.74808f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 52
      )
      LocalObject(
        1732,
        Painbox.Constructor(Vector3(3705.493f, 4448.849f, 44.55548f), painbox_radius_continuous),
        owning_building_guid = 52
      )
      LocalObject(
        1733,
        Painbox.Constructor(Vector3(3717.127f, 4446.078f, 43.36608f), painbox_radius_continuous),
        owning_building_guid = 52
      )
      LocalObject(
        1734,
        Painbox.Constructor(Vector3(3717.259f, 4458.107f, 43.36608f), painbox_radius_continuous),
        owning_building_guid = 52
      )
    }

    Building23()

    def Building23(): Unit = { // Name: NE_Zal_Tower Type: tower_b GUID: 53, MapID: 23
      LocalBuilding(
        "NE_Zal_Tower",
        53,
        23,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(4290f, 2990f, 42.18527f), Vector3(0f, 0f, 360f), tower_b)
        )
      )
      LocalObject(
        1934,
        CaptureTerminal.Constructor(Vector3(4306.587f, 2989.897f, 62.18427f), secondary_capture),
        owning_building_guid = 53
      )
      LocalObject(368, Door.Constructor(Vector3(4302f, 2982f, 43.70527f)), owning_building_guid = 53)
      LocalObject(369, Door.Constructor(Vector3(4302f, 2982f, 53.70527f)), owning_building_guid = 53)
      LocalObject(370, Door.Constructor(Vector3(4302f, 2982f, 73.70528f)), owning_building_guid = 53)
      LocalObject(371, Door.Constructor(Vector3(4302f, 2998f, 43.70527f)), owning_building_guid = 53)
      LocalObject(372, Door.Constructor(Vector3(4302f, 2998f, 53.70527f)), owning_building_guid = 53)
      LocalObject(373, Door.Constructor(Vector3(4302f, 2998f, 73.70528f)), owning_building_guid = 53)
      LocalObject(2046, Door.Constructor(Vector3(4301.147f, 2978.794f, 33.52127f)), owning_building_guid = 53)
      LocalObject(2047, Door.Constructor(Vector3(4301.147f, 2995.204f, 33.52127f)), owning_building_guid = 53)
      LocalObject(
        812,
        IFFLock.Constructor(Vector3(4299.957f, 2998.811f, 43.64627f), Vector3(0, 0, 0)),
        owning_building_guid = 53,
        door_guid = 371
      )
      LocalObject(
        813,
        IFFLock.Constructor(Vector3(4299.957f, 2998.811f, 53.64627f), Vector3(0, 0, 0)),
        owning_building_guid = 53,
        door_guid = 372
      )
      LocalObject(
        814,
        IFFLock.Constructor(Vector3(4299.957f, 2998.811f, 73.64627f), Vector3(0, 0, 0)),
        owning_building_guid = 53,
        door_guid = 373
      )
      LocalObject(
        815,
        IFFLock.Constructor(Vector3(4304.047f, 2981.189f, 43.64627f), Vector3(0, 0, 180)),
        owning_building_guid = 53,
        door_guid = 368
      )
      LocalObject(
        816,
        IFFLock.Constructor(Vector3(4304.047f, 2981.189f, 53.64627f), Vector3(0, 0, 180)),
        owning_building_guid = 53,
        door_guid = 369
      )
      LocalObject(
        817,
        IFFLock.Constructor(Vector3(4304.047f, 2981.189f, 73.64627f), Vector3(0, 0, 180)),
        owning_building_guid = 53,
        door_guid = 370
      )
      LocalObject(1058, Locker.Constructor(Vector3(4305.716f, 2974.963f, 32.17927f)), owning_building_guid = 53)
      LocalObject(1059, Locker.Constructor(Vector3(4305.751f, 2996.835f, 32.17927f)), owning_building_guid = 53)
      LocalObject(1060, Locker.Constructor(Vector3(4307.053f, 2974.963f, 32.17927f)), owning_building_guid = 53)
      LocalObject(1061, Locker.Constructor(Vector3(4307.088f, 2996.835f, 32.17927f)), owning_building_guid = 53)
      LocalObject(1062, Locker.Constructor(Vector3(4309.741f, 2974.963f, 32.17927f)), owning_building_guid = 53)
      LocalObject(1063, Locker.Constructor(Vector3(4309.741f, 2996.835f, 32.17927f)), owning_building_guid = 53)
      LocalObject(1064, Locker.Constructor(Vector3(4311.143f, 2974.963f, 32.17927f)), owning_building_guid = 53)
      LocalObject(1065, Locker.Constructor(Vector3(4311.143f, 2996.835f, 32.17927f)), owning_building_guid = 53)
      LocalObject(
        1400,
        Terminal.Constructor(Vector3(4311.446f, 2980.129f, 33.51727f), order_terminal),
        owning_building_guid = 53
      )
      LocalObject(
        1401,
        Terminal.Constructor(Vector3(4311.446f, 2985.853f, 33.51727f), order_terminal),
        owning_building_guid = 53
      )
      LocalObject(
        1402,
        Terminal.Constructor(Vector3(4311.446f, 2991.234f, 33.51727f), order_terminal),
        owning_building_guid = 53
      )
      LocalObject(
        1893,
        SpawnTube.Constructor(Vector3(4300.706f, 2977.742f, 31.66727f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 53
      )
      LocalObject(
        1894,
        SpawnTube.Constructor(Vector3(4300.706f, 2994.152f, 31.66727f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 53
      )
      LocalObject(
        1741,
        Painbox.Constructor(Vector3(4295.493f, 2982.849f, 33.47467f), painbox_radius_continuous),
        owning_building_guid = 53
      )
      LocalObject(
        1742,
        Painbox.Constructor(Vector3(4307.127f, 2980.078f, 32.28527f), painbox_radius_continuous),
        owning_building_guid = 53
      )
      LocalObject(
        1743,
        Painbox.Constructor(Vector3(4307.259f, 2992.107f, 32.28527f), painbox_radius_continuous),
        owning_building_guid = 53
      )
    }

    Building20()

    def Building20(): Unit = { // Name: S_Dahaka_Tower Type: tower_b GUID: 54, MapID: 20
      LocalBuilding(
        "S_Dahaka_Tower",
        54,
        20,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(4514f, 4768f, 74.48821f), Vector3(0f, 0f, 360f), tower_b)
        )
      )
      LocalObject(
        1935,
        CaptureTerminal.Constructor(Vector3(4530.587f, 4767.897f, 94.48721f), secondary_capture),
        owning_building_guid = 54
      )
      LocalObject(374, Door.Constructor(Vector3(4526f, 4760f, 76.00821f)), owning_building_guid = 54)
      LocalObject(375, Door.Constructor(Vector3(4526f, 4760f, 86.00821f)), owning_building_guid = 54)
      LocalObject(376, Door.Constructor(Vector3(4526f, 4760f, 106.0082f)), owning_building_guid = 54)
      LocalObject(377, Door.Constructor(Vector3(4526f, 4776f, 76.00821f)), owning_building_guid = 54)
      LocalObject(378, Door.Constructor(Vector3(4526f, 4776f, 86.00821f)), owning_building_guid = 54)
      LocalObject(379, Door.Constructor(Vector3(4526f, 4776f, 106.0082f)), owning_building_guid = 54)
      LocalObject(2048, Door.Constructor(Vector3(4525.147f, 4756.794f, 65.82421f)), owning_building_guid = 54)
      LocalObject(2049, Door.Constructor(Vector3(4525.147f, 4773.204f, 65.82421f)), owning_building_guid = 54)
      LocalObject(
        818,
        IFFLock.Constructor(Vector3(4523.957f, 4776.811f, 75.94921f), Vector3(0, 0, 0)),
        owning_building_guid = 54,
        door_guid = 377
      )
      LocalObject(
        819,
        IFFLock.Constructor(Vector3(4523.957f, 4776.811f, 85.94921f), Vector3(0, 0, 0)),
        owning_building_guid = 54,
        door_guid = 378
      )
      LocalObject(
        820,
        IFFLock.Constructor(Vector3(4523.957f, 4776.811f, 105.9492f), Vector3(0, 0, 0)),
        owning_building_guid = 54,
        door_guid = 379
      )
      LocalObject(
        821,
        IFFLock.Constructor(Vector3(4528.047f, 4759.189f, 75.94921f), Vector3(0, 0, 180)),
        owning_building_guid = 54,
        door_guid = 374
      )
      LocalObject(
        822,
        IFFLock.Constructor(Vector3(4528.047f, 4759.189f, 85.94921f), Vector3(0, 0, 180)),
        owning_building_guid = 54,
        door_guid = 375
      )
      LocalObject(
        823,
        IFFLock.Constructor(Vector3(4528.047f, 4759.189f, 105.9492f), Vector3(0, 0, 180)),
        owning_building_guid = 54,
        door_guid = 376
      )
      LocalObject(1066, Locker.Constructor(Vector3(4529.716f, 4752.963f, 64.48222f)), owning_building_guid = 54)
      LocalObject(1067, Locker.Constructor(Vector3(4529.751f, 4774.835f, 64.48222f)), owning_building_guid = 54)
      LocalObject(1068, Locker.Constructor(Vector3(4531.053f, 4752.963f, 64.48222f)), owning_building_guid = 54)
      LocalObject(1069, Locker.Constructor(Vector3(4531.088f, 4774.835f, 64.48222f)), owning_building_guid = 54)
      LocalObject(1070, Locker.Constructor(Vector3(4533.741f, 4752.963f, 64.48222f)), owning_building_guid = 54)
      LocalObject(1071, Locker.Constructor(Vector3(4533.741f, 4774.835f, 64.48222f)), owning_building_guid = 54)
      LocalObject(1072, Locker.Constructor(Vector3(4535.143f, 4752.963f, 64.48222f)), owning_building_guid = 54)
      LocalObject(1073, Locker.Constructor(Vector3(4535.143f, 4774.835f, 64.48222f)), owning_building_guid = 54)
      LocalObject(
        1403,
        Terminal.Constructor(Vector3(4535.446f, 4758.129f, 65.82021f), order_terminal),
        owning_building_guid = 54
      )
      LocalObject(
        1404,
        Terminal.Constructor(Vector3(4535.446f, 4763.853f, 65.82021f), order_terminal),
        owning_building_guid = 54
      )
      LocalObject(
        1405,
        Terminal.Constructor(Vector3(4535.446f, 4769.234f, 65.82021f), order_terminal),
        owning_building_guid = 54
      )
      LocalObject(
        1895,
        SpawnTube.Constructor(Vector3(4524.706f, 4755.742f, 63.97021f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 54
      )
      LocalObject(
        1896,
        SpawnTube.Constructor(Vector3(4524.706f, 4772.152f, 63.97021f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 54
      )
      LocalObject(
        1744,
        Painbox.Constructor(Vector3(4519.493f, 4760.849f, 65.77761f), painbox_radius_continuous),
        owning_building_guid = 54
      )
      LocalObject(
        1745,
        Painbox.Constructor(Vector3(4531.127f, 4758.078f, 64.58821f), painbox_radius_continuous),
        owning_building_guid = 54
      )
      LocalObject(
        1746,
        Painbox.Constructor(Vector3(4531.259f, 4770.107f, 64.58821f), painbox_radius_continuous),
        owning_building_guid = 54
      )
    }

    Building45()

    def Building45(): Unit = { // Name: Hossin_Warpgate_Tower Type: tower_b GUID: 55, MapID: 45
      LocalBuilding(
        "Hossin_Warpgate_Tower",
        55,
        45,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(5520f, 5532f, 37.21363f), Vector3(0f, 0f, 360f), tower_b)
        )
      )
      LocalObject(
        1942,
        CaptureTerminal.Constructor(Vector3(5536.587f, 5531.897f, 57.21264f), secondary_capture),
        owning_building_guid = 55
      )
      LocalObject(441, Door.Constructor(Vector3(5532f, 5524f, 38.73363f)), owning_building_guid = 55)
      LocalObject(442, Door.Constructor(Vector3(5532f, 5524f, 48.73363f)), owning_building_guid = 55)
      LocalObject(443, Door.Constructor(Vector3(5532f, 5524f, 68.73363f)), owning_building_guid = 55)
      LocalObject(444, Door.Constructor(Vector3(5532f, 5540f, 38.73363f)), owning_building_guid = 55)
      LocalObject(445, Door.Constructor(Vector3(5532f, 5540f, 48.73363f)), owning_building_guid = 55)
      LocalObject(446, Door.Constructor(Vector3(5532f, 5540f, 68.73363f)), owning_building_guid = 55)
      LocalObject(2071, Door.Constructor(Vector3(5531.147f, 5520.794f, 28.54963f)), owning_building_guid = 55)
      LocalObject(2072, Door.Constructor(Vector3(5531.147f, 5537.204f, 28.54963f)), owning_building_guid = 55)
      LocalObject(
        872,
        IFFLock.Constructor(Vector3(5529.957f, 5540.811f, 38.67463f), Vector3(0, 0, 0)),
        owning_building_guid = 55,
        door_guid = 444
      )
      LocalObject(
        873,
        IFFLock.Constructor(Vector3(5529.957f, 5540.811f, 48.67464f), Vector3(0, 0, 0)),
        owning_building_guid = 55,
        door_guid = 445
      )
      LocalObject(
        874,
        IFFLock.Constructor(Vector3(5529.957f, 5540.811f, 68.67464f), Vector3(0, 0, 0)),
        owning_building_guid = 55,
        door_guid = 446
      )
      LocalObject(
        875,
        IFFLock.Constructor(Vector3(5534.047f, 5523.189f, 38.67463f), Vector3(0, 0, 180)),
        owning_building_guid = 55,
        door_guid = 441
      )
      LocalObject(
        876,
        IFFLock.Constructor(Vector3(5534.047f, 5523.189f, 48.67464f), Vector3(0, 0, 180)),
        owning_building_guid = 55,
        door_guid = 442
      )
      LocalObject(
        877,
        IFFLock.Constructor(Vector3(5534.047f, 5523.189f, 68.67464f), Vector3(0, 0, 180)),
        owning_building_guid = 55,
        door_guid = 443
      )
      LocalObject(1167, Locker.Constructor(Vector3(5535.716f, 5516.963f, 27.20763f)), owning_building_guid = 55)
      LocalObject(1168, Locker.Constructor(Vector3(5535.751f, 5538.835f, 27.20763f)), owning_building_guid = 55)
      LocalObject(1169, Locker.Constructor(Vector3(5537.053f, 5516.963f, 27.20763f)), owning_building_guid = 55)
      LocalObject(1170, Locker.Constructor(Vector3(5537.088f, 5538.835f, 27.20763f)), owning_building_guid = 55)
      LocalObject(1171, Locker.Constructor(Vector3(5539.741f, 5516.963f, 27.20763f)), owning_building_guid = 55)
      LocalObject(1172, Locker.Constructor(Vector3(5539.741f, 5538.835f, 27.20763f)), owning_building_guid = 55)
      LocalObject(1173, Locker.Constructor(Vector3(5541.143f, 5516.963f, 27.20763f)), owning_building_guid = 55)
      LocalObject(1174, Locker.Constructor(Vector3(5541.143f, 5538.835f, 27.20763f)), owning_building_guid = 55)
      LocalObject(
        1436,
        Terminal.Constructor(Vector3(5541.446f, 5522.129f, 28.54564f), order_terminal),
        owning_building_guid = 55
      )
      LocalObject(
        1437,
        Terminal.Constructor(Vector3(5541.446f, 5527.853f, 28.54564f), order_terminal),
        owning_building_guid = 55
      )
      LocalObject(
        1438,
        Terminal.Constructor(Vector3(5541.446f, 5533.234f, 28.54564f), order_terminal),
        owning_building_guid = 55
      )
      LocalObject(
        1918,
        SpawnTube.Constructor(Vector3(5530.706f, 5519.742f, 26.69563f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 55
      )
      LocalObject(
        1919,
        SpawnTube.Constructor(Vector3(5530.706f, 5536.152f, 26.69563f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 55
      )
      LocalObject(
        1765,
        Painbox.Constructor(Vector3(5525.493f, 5524.849f, 28.50303f), painbox_radius_continuous),
        owning_building_guid = 55
      )
      LocalObject(
        1766,
        Painbox.Constructor(Vector3(5537.127f, 5522.078f, 27.31363f), painbox_radius_continuous),
        owning_building_guid = 55
      )
      LocalObject(
        1767,
        Painbox.Constructor(Vector3(5537.259f, 5534.107f, 27.31363f), painbox_radius_continuous),
        owning_building_guid = 55
      )
    }

    Building26()

    def Building26(): Unit = { // Name: E_Esamir_Warpgate_Tower Type: tower_b GUID: 56, MapID: 26
      LocalBuilding(
        "E_Esamir_Warpgate_Tower",
        56,
        26,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(5844f, 2602f, 36.16751f), Vector3(0f, 0f, 360f), tower_b)
        )
      )
      LocalObject(
        1943,
        CaptureTerminal.Constructor(Vector3(5860.587f, 2601.897f, 56.16651f), secondary_capture),
        owning_building_guid = 56
      )
      LocalObject(451, Door.Constructor(Vector3(5856f, 2594f, 37.68751f)), owning_building_guid = 56)
      LocalObject(452, Door.Constructor(Vector3(5856f, 2594f, 47.68751f)), owning_building_guid = 56)
      LocalObject(453, Door.Constructor(Vector3(5856f, 2594f, 67.68752f)), owning_building_guid = 56)
      LocalObject(454, Door.Constructor(Vector3(5856f, 2610f, 37.68751f)), owning_building_guid = 56)
      LocalObject(455, Door.Constructor(Vector3(5856f, 2610f, 47.68751f)), owning_building_guid = 56)
      LocalObject(456, Door.Constructor(Vector3(5856f, 2610f, 67.68752f)), owning_building_guid = 56)
      LocalObject(2073, Door.Constructor(Vector3(5855.147f, 2590.794f, 27.50351f)), owning_building_guid = 56)
      LocalObject(2074, Door.Constructor(Vector3(5855.147f, 2607.204f, 27.50351f)), owning_building_guid = 56)
      LocalObject(
        878,
        IFFLock.Constructor(Vector3(5853.957f, 2610.811f, 37.62851f), Vector3(0, 0, 0)),
        owning_building_guid = 56,
        door_guid = 454
      )
      LocalObject(
        879,
        IFFLock.Constructor(Vector3(5853.957f, 2610.811f, 47.62851f), Vector3(0, 0, 0)),
        owning_building_guid = 56,
        door_guid = 455
      )
      LocalObject(
        880,
        IFFLock.Constructor(Vector3(5853.957f, 2610.811f, 67.62851f), Vector3(0, 0, 0)),
        owning_building_guid = 56,
        door_guid = 456
      )
      LocalObject(
        881,
        IFFLock.Constructor(Vector3(5858.047f, 2593.189f, 37.62851f), Vector3(0, 0, 180)),
        owning_building_guid = 56,
        door_guid = 451
      )
      LocalObject(
        882,
        IFFLock.Constructor(Vector3(5858.047f, 2593.189f, 47.62851f), Vector3(0, 0, 180)),
        owning_building_guid = 56,
        door_guid = 452
      )
      LocalObject(
        883,
        IFFLock.Constructor(Vector3(5858.047f, 2593.189f, 67.62851f), Vector3(0, 0, 180)),
        owning_building_guid = 56,
        door_guid = 453
      )
      LocalObject(1175, Locker.Constructor(Vector3(5859.716f, 2586.963f, 26.16151f)), owning_building_guid = 56)
      LocalObject(1176, Locker.Constructor(Vector3(5859.751f, 2608.835f, 26.16151f)), owning_building_guid = 56)
      LocalObject(1177, Locker.Constructor(Vector3(5861.053f, 2586.963f, 26.16151f)), owning_building_guid = 56)
      LocalObject(1178, Locker.Constructor(Vector3(5861.088f, 2608.835f, 26.16151f)), owning_building_guid = 56)
      LocalObject(1179, Locker.Constructor(Vector3(5863.741f, 2586.963f, 26.16151f)), owning_building_guid = 56)
      LocalObject(1180, Locker.Constructor(Vector3(5863.741f, 2608.835f, 26.16151f)), owning_building_guid = 56)
      LocalObject(1181, Locker.Constructor(Vector3(5865.143f, 2586.963f, 26.16151f)), owning_building_guid = 56)
      LocalObject(1182, Locker.Constructor(Vector3(5865.143f, 2608.835f, 26.16151f)), owning_building_guid = 56)
      LocalObject(
        1439,
        Terminal.Constructor(Vector3(5865.446f, 2592.129f, 27.49951f), order_terminal),
        owning_building_guid = 56
      )
      LocalObject(
        1440,
        Terminal.Constructor(Vector3(5865.446f, 2597.853f, 27.49951f), order_terminal),
        owning_building_guid = 56
      )
      LocalObject(
        1441,
        Terminal.Constructor(Vector3(5865.446f, 2603.234f, 27.49951f), order_terminal),
        owning_building_guid = 56
      )
      LocalObject(
        1920,
        SpawnTube.Constructor(Vector3(5854.706f, 2589.742f, 25.64951f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 56
      )
      LocalObject(
        1921,
        SpawnTube.Constructor(Vector3(5854.706f, 2606.152f, 25.64951f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 56
      )
      LocalObject(
        1768,
        Painbox.Constructor(Vector3(5849.493f, 2594.849f, 27.45691f), painbox_radius_continuous),
        owning_building_guid = 56
      )
      LocalObject(
        1769,
        Painbox.Constructor(Vector3(5861.127f, 2592.078f, 26.26751f), painbox_radius_continuous),
        owning_building_guid = 56
      )
      LocalObject(
        1770,
        Painbox.Constructor(Vector3(5861.259f, 2604.107f, 26.26751f), painbox_radius_continuous),
        owning_building_guid = 56
      )
    }

    Building39()

    def Building39(): Unit = { // Name: Mithra_Tower Type: tower_c GUID: 57, MapID: 39
      LocalBuilding(
        "Mithra_Tower",
        57,
        39,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(2830f, 4502f, 55.56146f), Vector3(0f, 0f, 360f), tower_c)
        )
      )
      LocalObject(
        1925,
        CaptureTerminal.Constructor(Vector3(2846.587f, 4501.897f, 65.56046f), secondary_capture),
        owning_building_guid = 57
      )
      LocalObject(266, Door.Constructor(Vector3(2842f, 4494f, 57.08246f)), owning_building_guid = 57)
      LocalObject(267, Door.Constructor(Vector3(2842f, 4494f, 77.08146f)), owning_building_guid = 57)
      LocalObject(268, Door.Constructor(Vector3(2842f, 4510f, 57.08246f)), owning_building_guid = 57)
      LocalObject(269, Door.Constructor(Vector3(2842f, 4510f, 77.08146f)), owning_building_guid = 57)
      LocalObject(2016, Door.Constructor(Vector3(2841.146f, 4490.794f, 46.89746f)), owning_building_guid = 57)
      LocalObject(2017, Door.Constructor(Vector3(2841.146f, 4507.204f, 46.89746f)), owning_building_guid = 57)
      LocalObject(
        731,
        IFFLock.Constructor(Vector3(2839.957f, 4510.811f, 57.02246f), Vector3(0, 0, 0)),
        owning_building_guid = 57,
        door_guid = 268
      )
      LocalObject(
        732,
        IFFLock.Constructor(Vector3(2839.957f, 4510.811f, 77.02246f), Vector3(0, 0, 0)),
        owning_building_guid = 57,
        door_guid = 269
      )
      LocalObject(
        733,
        IFFLock.Constructor(Vector3(2844.047f, 4493.189f, 57.02246f), Vector3(0, 0, 180)),
        owning_building_guid = 57,
        door_guid = 266
      )
      LocalObject(
        734,
        IFFLock.Constructor(Vector3(2844.047f, 4493.189f, 77.02246f), Vector3(0, 0, 180)),
        owning_building_guid = 57,
        door_guid = 267
      )
      LocalObject(920, Locker.Constructor(Vector3(2845.716f, 4486.963f, 45.55546f)), owning_building_guid = 57)
      LocalObject(921, Locker.Constructor(Vector3(2845.751f, 4508.835f, 45.55546f)), owning_building_guid = 57)
      LocalObject(922, Locker.Constructor(Vector3(2847.053f, 4486.963f, 45.55546f)), owning_building_guid = 57)
      LocalObject(923, Locker.Constructor(Vector3(2847.088f, 4508.835f, 45.55546f)), owning_building_guid = 57)
      LocalObject(924, Locker.Constructor(Vector3(2849.741f, 4486.963f, 45.55546f)), owning_building_guid = 57)
      LocalObject(925, Locker.Constructor(Vector3(2849.741f, 4508.835f, 45.55546f)), owning_building_guid = 57)
      LocalObject(926, Locker.Constructor(Vector3(2851.143f, 4486.963f, 45.55546f)), owning_building_guid = 57)
      LocalObject(927, Locker.Constructor(Vector3(2851.143f, 4508.835f, 45.55546f)), owning_building_guid = 57)
      LocalObject(
        1350,
        Terminal.Constructor(Vector3(2851.445f, 4492.129f, 46.89346f), order_terminal),
        owning_building_guid = 57
      )
      LocalObject(
        1351,
        Terminal.Constructor(Vector3(2851.445f, 4497.853f, 46.89346f), order_terminal),
        owning_building_guid = 57
      )
      LocalObject(
        1352,
        Terminal.Constructor(Vector3(2851.445f, 4503.234f, 46.89346f), order_terminal),
        owning_building_guid = 57
      )
      LocalObject(
        1863,
        SpawnTube.Constructor(Vector3(2840.706f, 4489.742f, 45.04346f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 57
      )
      LocalObject(
        1864,
        SpawnTube.Constructor(Vector3(2840.706f, 4506.152f, 45.04346f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 57
      )
      LocalObject(
        1615,
        ProximityTerminal.Constructor(Vector3(2828.907f, 4496.725f, 83.13145f), pad_landing_tower_frame),
        owning_building_guid = 57
      )
      LocalObject(
        1616,
        Terminal.Constructor(Vector3(2828.907f, 4496.725f, 83.13145f), air_rearm_terminal),
        owning_building_guid = 57
      )
      LocalObject(
        1618,
        ProximityTerminal.Constructor(Vector3(2828.907f, 4507.17f, 83.13145f), pad_landing_tower_frame),
        owning_building_guid = 57
      )
      LocalObject(
        1619,
        Terminal.Constructor(Vector3(2828.907f, 4507.17f, 83.13145f), air_rearm_terminal),
        owning_building_guid = 57
      )
      LocalObject(
        1238,
        FacilityTurret.Constructor(Vector3(2815.07f, 4487.045f, 74.50346f), manned_turret),
        owning_building_guid = 57
      )
      TurretToWeapon(1238, 5069)
      LocalObject(
        1239,
        FacilityTurret.Constructor(Vector3(2853.497f, 4516.957f, 74.50346f), manned_turret),
        owning_building_guid = 57
      )
      TurretToWeapon(1239, 5070)
      LocalObject(
        1714,
        Painbox.Constructor(Vector3(2834.454f, 4494.849f, 47.58096f), painbox_radius_continuous),
        owning_building_guid = 57
      )
      LocalObject(
        1715,
        Painbox.Constructor(Vector3(2846.923f, 4491.54f, 45.66146f), painbox_radius_continuous),
        owning_building_guid = 57
      )
      LocalObject(
        1716,
        Painbox.Constructor(Vector3(2847.113f, 4504.022f, 45.66146f), painbox_radius_continuous),
        owning_building_guid = 57
      )
    }

    Building17()

    def Building17(): Unit = { // Name: S_Rashnu_Tower Type: tower_c GUID: 58, MapID: 17
      LocalBuilding(
        "S_Rashnu_Tower",
        58,
        17,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(2972f, 2932f, 59.87292f), Vector3(0f, 0f, 360f), tower_c)
        )
      )
      LocalObject(
        1927,
        CaptureTerminal.Constructor(Vector3(2988.587f, 2931.897f, 69.87192f), secondary_capture),
        owning_building_guid = 58
      )
      LocalObject(276, Door.Constructor(Vector3(2984f, 2924f, 61.39392f)), owning_building_guid = 58)
      LocalObject(277, Door.Constructor(Vector3(2984f, 2924f, 81.39292f)), owning_building_guid = 58)
      LocalObject(278, Door.Constructor(Vector3(2984f, 2940f, 61.39392f)), owning_building_guid = 58)
      LocalObject(279, Door.Constructor(Vector3(2984f, 2940f, 81.39292f)), owning_building_guid = 58)
      LocalObject(2020, Door.Constructor(Vector3(2983.146f, 2920.794f, 51.20892f)), owning_building_guid = 58)
      LocalObject(2021, Door.Constructor(Vector3(2983.146f, 2937.204f, 51.20892f)), owning_building_guid = 58)
      LocalObject(
        741,
        IFFLock.Constructor(Vector3(2981.957f, 2940.811f, 61.33392f), Vector3(0, 0, 0)),
        owning_building_guid = 58,
        door_guid = 278
      )
      LocalObject(
        742,
        IFFLock.Constructor(Vector3(2981.957f, 2940.811f, 81.33392f), Vector3(0, 0, 0)),
        owning_building_guid = 58,
        door_guid = 279
      )
      LocalObject(
        743,
        IFFLock.Constructor(Vector3(2986.047f, 2923.189f, 61.33392f), Vector3(0, 0, 180)),
        owning_building_guid = 58,
        door_guid = 276
      )
      LocalObject(
        744,
        IFFLock.Constructor(Vector3(2986.047f, 2923.189f, 81.33392f), Vector3(0, 0, 180)),
        owning_building_guid = 58,
        door_guid = 277
      )
      LocalObject(936, Locker.Constructor(Vector3(2987.716f, 2916.963f, 49.86692f)), owning_building_guid = 58)
      LocalObject(937, Locker.Constructor(Vector3(2987.751f, 2938.835f, 49.86692f)), owning_building_guid = 58)
      LocalObject(938, Locker.Constructor(Vector3(2989.053f, 2916.963f, 49.86692f)), owning_building_guid = 58)
      LocalObject(939, Locker.Constructor(Vector3(2989.088f, 2938.835f, 49.86692f)), owning_building_guid = 58)
      LocalObject(940, Locker.Constructor(Vector3(2991.741f, 2916.963f, 49.86692f)), owning_building_guid = 58)
      LocalObject(941, Locker.Constructor(Vector3(2991.741f, 2938.835f, 49.86692f)), owning_building_guid = 58)
      LocalObject(942, Locker.Constructor(Vector3(2993.143f, 2916.963f, 49.86692f)), owning_building_guid = 58)
      LocalObject(943, Locker.Constructor(Vector3(2993.143f, 2938.835f, 49.86692f)), owning_building_guid = 58)
      LocalObject(
        1356,
        Terminal.Constructor(Vector3(2993.445f, 2922.129f, 51.20492f), order_terminal),
        owning_building_guid = 58
      )
      LocalObject(
        1357,
        Terminal.Constructor(Vector3(2993.445f, 2927.853f, 51.20492f), order_terminal),
        owning_building_guid = 58
      )
      LocalObject(
        1358,
        Terminal.Constructor(Vector3(2993.445f, 2933.234f, 51.20492f), order_terminal),
        owning_building_guid = 58
      )
      LocalObject(
        1867,
        SpawnTube.Constructor(Vector3(2982.706f, 2919.742f, 49.35492f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 58
      )
      LocalObject(
        1868,
        SpawnTube.Constructor(Vector3(2982.706f, 2936.152f, 49.35492f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 58
      )
      LocalObject(
        1621,
        ProximityTerminal.Constructor(Vector3(2970.907f, 2926.725f, 87.44292f), pad_landing_tower_frame),
        owning_building_guid = 58
      )
      LocalObject(
        1622,
        Terminal.Constructor(Vector3(2970.907f, 2926.725f, 87.44292f), air_rearm_terminal),
        owning_building_guid = 58
      )
      LocalObject(
        1624,
        ProximityTerminal.Constructor(Vector3(2970.907f, 2937.17f, 87.44292f), pad_landing_tower_frame),
        owning_building_guid = 58
      )
      LocalObject(
        1625,
        Terminal.Constructor(Vector3(2970.907f, 2937.17f, 87.44292f), air_rearm_terminal),
        owning_building_guid = 58
      )
      LocalObject(
        1240,
        FacilityTurret.Constructor(Vector3(2957.07f, 2917.045f, 78.81492f), manned_turret),
        owning_building_guid = 58
      )
      TurretToWeapon(1240, 5071)
      LocalObject(
        1243,
        FacilityTurret.Constructor(Vector3(2995.497f, 2946.957f, 78.81492f), manned_turret),
        owning_building_guid = 58
      )
      TurretToWeapon(1243, 5072)
      LocalObject(
        1720,
        Painbox.Constructor(Vector3(2976.454f, 2924.849f, 51.89242f), painbox_radius_continuous),
        owning_building_guid = 58
      )
      LocalObject(
        1721,
        Painbox.Constructor(Vector3(2988.923f, 2921.54f, 49.97292f), painbox_radius_continuous),
        owning_building_guid = 58
      )
      LocalObject(
        1722,
        Painbox.Constructor(Vector3(2989.113f, 2934.022f, 49.97292f), painbox_radius_continuous),
        owning_building_guid = 58
      )
    }

    Building41()

    def Building41(): Unit = { // Name: Atar_Tower Type: tower_c GUID: 59, MapID: 41
      LocalBuilding(
        "Atar_Tower",
        59,
        41,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(3562f, 3134f, 39.94067f), Vector3(0f, 0f, 360f), tower_c)
        )
      )
      LocalObject(
        1930,
        CaptureTerminal.Constructor(Vector3(3578.587f, 3133.897f, 49.93967f), secondary_capture),
        owning_building_guid = 59
      )
      LocalObject(311, Door.Constructor(Vector3(3574f, 3126f, 41.46167f)), owning_building_guid = 59)
      LocalObject(312, Door.Constructor(Vector3(3574f, 3126f, 61.46067f)), owning_building_guid = 59)
      LocalObject(313, Door.Constructor(Vector3(3574f, 3142f, 41.46167f)), owning_building_guid = 59)
      LocalObject(314, Door.Constructor(Vector3(3574f, 3142f, 61.46067f)), owning_building_guid = 59)
      LocalObject(2029, Door.Constructor(Vector3(3573.146f, 3122.794f, 31.27667f)), owning_building_guid = 59)
      LocalObject(2030, Door.Constructor(Vector3(3573.146f, 3139.204f, 31.27667f)), owning_building_guid = 59)
      LocalObject(
        765,
        IFFLock.Constructor(Vector3(3571.957f, 3142.811f, 41.40167f), Vector3(0, 0, 0)),
        owning_building_guid = 59,
        door_guid = 313
      )
      LocalObject(
        766,
        IFFLock.Constructor(Vector3(3571.957f, 3142.811f, 61.40167f), Vector3(0, 0, 0)),
        owning_building_guid = 59,
        door_guid = 314
      )
      LocalObject(
        767,
        IFFLock.Constructor(Vector3(3576.047f, 3125.189f, 41.40167f), Vector3(0, 0, 180)),
        owning_building_guid = 59,
        door_guid = 311
      )
      LocalObject(
        768,
        IFFLock.Constructor(Vector3(3576.047f, 3125.189f, 61.40167f), Vector3(0, 0, 180)),
        owning_building_guid = 59,
        door_guid = 312
      )
      LocalObject(981, Locker.Constructor(Vector3(3577.716f, 3118.963f, 29.93467f)), owning_building_guid = 59)
      LocalObject(982, Locker.Constructor(Vector3(3577.751f, 3140.835f, 29.93467f)), owning_building_guid = 59)
      LocalObject(983, Locker.Constructor(Vector3(3579.053f, 3118.963f, 29.93467f)), owning_building_guid = 59)
      LocalObject(984, Locker.Constructor(Vector3(3579.088f, 3140.835f, 29.93467f)), owning_building_guid = 59)
      LocalObject(985, Locker.Constructor(Vector3(3581.741f, 3118.963f, 29.93467f)), owning_building_guid = 59)
      LocalObject(986, Locker.Constructor(Vector3(3581.741f, 3140.835f, 29.93467f)), owning_building_guid = 59)
      LocalObject(987, Locker.Constructor(Vector3(3583.143f, 3118.963f, 29.93467f)), owning_building_guid = 59)
      LocalObject(988, Locker.Constructor(Vector3(3583.143f, 3140.835f, 29.93467f)), owning_building_guid = 59)
      LocalObject(
        1374,
        Terminal.Constructor(Vector3(3583.445f, 3124.129f, 31.27267f), order_terminal),
        owning_building_guid = 59
      )
      LocalObject(
        1375,
        Terminal.Constructor(Vector3(3583.445f, 3129.853f, 31.27267f), order_terminal),
        owning_building_guid = 59
      )
      LocalObject(
        1376,
        Terminal.Constructor(Vector3(3583.445f, 3135.234f, 31.27267f), order_terminal),
        owning_building_guid = 59
      )
      LocalObject(
        1876,
        SpawnTube.Constructor(Vector3(3572.706f, 3121.742f, 29.42267f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 59
      )
      LocalObject(
        1877,
        SpawnTube.Constructor(Vector3(3572.706f, 3138.152f, 29.42267f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 59
      )
      LocalObject(
        1627,
        ProximityTerminal.Constructor(Vector3(3560.907f, 3128.725f, 67.51067f), pad_landing_tower_frame),
        owning_building_guid = 59
      )
      LocalObject(
        1628,
        Terminal.Constructor(Vector3(3560.907f, 3128.725f, 67.51067f), air_rearm_terminal),
        owning_building_guid = 59
      )
      LocalObject(
        1630,
        ProximityTerminal.Constructor(Vector3(3560.907f, 3139.17f, 67.51067f), pad_landing_tower_frame),
        owning_building_guid = 59
      )
      LocalObject(
        1631,
        Terminal.Constructor(Vector3(3560.907f, 3139.17f, 67.51067f), air_rearm_terminal),
        owning_building_guid = 59
      )
      LocalObject(
        1254,
        FacilityTurret.Constructor(Vector3(3547.07f, 3119.045f, 58.88267f), manned_turret),
        owning_building_guid = 59
      )
      TurretToWeapon(1254, 5073)
      LocalObject(
        1257,
        FacilityTurret.Constructor(Vector3(3585.497f, 3148.957f, 58.88267f), manned_turret),
        owning_building_guid = 59
      )
      TurretToWeapon(1257, 5074)
      LocalObject(
        1729,
        Painbox.Constructor(Vector3(3566.454f, 3126.849f, 31.96017f), painbox_radius_continuous),
        owning_building_guid = 59
      )
      LocalObject(
        1730,
        Painbox.Constructor(Vector3(3578.923f, 3123.54f, 30.04067f), painbox_radius_continuous),
        owning_building_guid = 59
      )
      LocalObject(
        1731,
        Painbox.Constructor(Vector3(3579.113f, 3136.022f, 30.04067f), painbox_radius_continuous),
        owning_building_guid = 59
      )
    }

    Building43()

    def Building43(): Unit = { // Name: Yazata_Tower Type: tower_c GUID: 60, MapID: 43
      LocalBuilding(
        "Yazata_Tower",
        60,
        43,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(4640f, 3674f, 71.13654f), Vector3(0f, 0f, 360f), tower_c)
        )
      )
      LocalObject(
        1936,
        CaptureTerminal.Constructor(Vector3(4656.587f, 3673.897f, 81.13554f), secondary_capture),
        owning_building_guid = 60
      )
      LocalObject(382, Door.Constructor(Vector3(4652f, 3666f, 72.65755f)), owning_building_guid = 60)
      LocalObject(383, Door.Constructor(Vector3(4652f, 3666f, 92.65654f)), owning_building_guid = 60)
      LocalObject(384, Door.Constructor(Vector3(4652f, 3682f, 72.65755f)), owning_building_guid = 60)
      LocalObject(385, Door.Constructor(Vector3(4652f, 3682f, 92.65654f)), owning_building_guid = 60)
      LocalObject(2050, Door.Constructor(Vector3(4651.146f, 3662.794f, 62.47254f)), owning_building_guid = 60)
      LocalObject(2051, Door.Constructor(Vector3(4651.146f, 3679.204f, 62.47254f)), owning_building_guid = 60)
      LocalObject(
        826,
        IFFLock.Constructor(Vector3(4649.957f, 3682.811f, 72.59754f), Vector3(0, 0, 0)),
        owning_building_guid = 60,
        door_guid = 384
      )
      LocalObject(
        827,
        IFFLock.Constructor(Vector3(4649.957f, 3682.811f, 92.59754f), Vector3(0, 0, 0)),
        owning_building_guid = 60,
        door_guid = 385
      )
      LocalObject(
        828,
        IFFLock.Constructor(Vector3(4654.047f, 3665.189f, 72.59754f), Vector3(0, 0, 180)),
        owning_building_guid = 60,
        door_guid = 382
      )
      LocalObject(
        829,
        IFFLock.Constructor(Vector3(4654.047f, 3665.189f, 92.59754f), Vector3(0, 0, 180)),
        owning_building_guid = 60,
        door_guid = 383
      )
      LocalObject(1079, Locker.Constructor(Vector3(4655.716f, 3658.963f, 61.13054f)), owning_building_guid = 60)
      LocalObject(1080, Locker.Constructor(Vector3(4655.751f, 3680.835f, 61.13054f)), owning_building_guid = 60)
      LocalObject(1081, Locker.Constructor(Vector3(4657.053f, 3658.963f, 61.13054f)), owning_building_guid = 60)
      LocalObject(1082, Locker.Constructor(Vector3(4657.088f, 3680.835f, 61.13054f)), owning_building_guid = 60)
      LocalObject(1089, Locker.Constructor(Vector3(4659.741f, 3658.963f, 61.13054f)), owning_building_guid = 60)
      LocalObject(1090, Locker.Constructor(Vector3(4659.741f, 3680.835f, 61.13054f)), owning_building_guid = 60)
      LocalObject(1091, Locker.Constructor(Vector3(4661.143f, 3658.963f, 61.13054f)), owning_building_guid = 60)
      LocalObject(1092, Locker.Constructor(Vector3(4661.143f, 3680.835f, 61.13054f)), owning_building_guid = 60)
      LocalObject(
        1406,
        Terminal.Constructor(Vector3(4661.445f, 3664.129f, 62.46854f), order_terminal),
        owning_building_guid = 60
      )
      LocalObject(
        1407,
        Terminal.Constructor(Vector3(4661.445f, 3669.853f, 62.46854f), order_terminal),
        owning_building_guid = 60
      )
      LocalObject(
        1408,
        Terminal.Constructor(Vector3(4661.445f, 3675.234f, 62.46854f), order_terminal),
        owning_building_guid = 60
      )
      LocalObject(
        1897,
        SpawnTube.Constructor(Vector3(4650.706f, 3661.742f, 60.61855f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 60
      )
      LocalObject(
        1898,
        SpawnTube.Constructor(Vector3(4650.706f, 3678.152f, 60.61855f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 60
      )
      LocalObject(
        1633,
        ProximityTerminal.Constructor(Vector3(4638.907f, 3668.725f, 98.70654f), pad_landing_tower_frame),
        owning_building_guid = 60
      )
      LocalObject(
        1634,
        Terminal.Constructor(Vector3(4638.907f, 3668.725f, 98.70654f), air_rearm_terminal),
        owning_building_guid = 60
      )
      LocalObject(
        1636,
        ProximityTerminal.Constructor(Vector3(4638.907f, 3679.17f, 98.70654f), pad_landing_tower_frame),
        owning_building_guid = 60
      )
      LocalObject(
        1637,
        Terminal.Constructor(Vector3(4638.907f, 3679.17f, 98.70654f), air_rearm_terminal),
        owning_building_guid = 60
      )
      LocalObject(
        1278,
        FacilityTurret.Constructor(Vector3(4625.07f, 3659.045f, 90.07854f), manned_turret),
        owning_building_guid = 60
      )
      TurretToWeapon(1278, 5075)
      LocalObject(
        1281,
        FacilityTurret.Constructor(Vector3(4663.497f, 3688.957f, 90.07854f), manned_turret),
        owning_building_guid = 60
      )
      TurretToWeapon(1281, 5076)
      LocalObject(
        1747,
        Painbox.Constructor(Vector3(4644.454f, 3666.849f, 63.15604f), painbox_radius_continuous),
        owning_building_guid = 60
      )
      LocalObject(
        1748,
        Painbox.Constructor(Vector3(4656.923f, 3663.54f, 61.23654f), painbox_radius_continuous),
        owning_building_guid = 60
      )
      LocalObject(
        1749,
        Painbox.Constructor(Vector3(4657.113f, 3676.022f, 61.23654f), painbox_radius_continuous),
        owning_building_guid = 60
      )
    }

    Building19()

    def Building19(): Unit = { // Name: NE_Dahaka_Tower Type: tower_c GUID: 61, MapID: 19
      LocalBuilding(
        "NE_Dahaka_Tower",
        61,
        19,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(4882f, 5580f, 74.37141f), Vector3(0f, 0f, 360f), tower_c)
        )
      )
      LocalObject(
        1937,
        CaptureTerminal.Constructor(Vector3(4898.587f, 5579.897f, 84.37041f), secondary_capture),
        owning_building_guid = 61
      )
      LocalObject(409, Door.Constructor(Vector3(4894f, 5572f, 75.89241f)), owning_building_guid = 61)
      LocalObject(410, Door.Constructor(Vector3(4894f, 5572f, 95.8914f)), owning_building_guid = 61)
      LocalObject(411, Door.Constructor(Vector3(4894f, 5588f, 75.89241f)), owning_building_guid = 61)
      LocalObject(412, Door.Constructor(Vector3(4894f, 5588f, 95.8914f)), owning_building_guid = 61)
      LocalObject(2058, Door.Constructor(Vector3(4893.146f, 5568.794f, 65.70741f)), owning_building_guid = 61)
      LocalObject(2059, Door.Constructor(Vector3(4893.146f, 5585.204f, 65.70741f)), owning_building_guid = 61)
      LocalObject(
        844,
        IFFLock.Constructor(Vector3(4891.957f, 5588.811f, 75.83241f), Vector3(0, 0, 0)),
        owning_building_guid = 61,
        door_guid = 411
      )
      LocalObject(
        845,
        IFFLock.Constructor(Vector3(4891.957f, 5588.811f, 95.83241f), Vector3(0, 0, 0)),
        owning_building_guid = 61,
        door_guid = 412
      )
      LocalObject(
        846,
        IFFLock.Constructor(Vector3(4896.047f, 5571.189f, 75.83241f), Vector3(0, 0, 180)),
        owning_building_guid = 61,
        door_guid = 409
      )
      LocalObject(
        847,
        IFFLock.Constructor(Vector3(4896.047f, 5571.189f, 95.83241f), Vector3(0, 0, 180)),
        owning_building_guid = 61,
        door_guid = 410
      )
      LocalObject(1115, Locker.Constructor(Vector3(4897.716f, 5564.963f, 64.36541f)), owning_building_guid = 61)
      LocalObject(1116, Locker.Constructor(Vector3(4897.751f, 5586.835f, 64.36541f)), owning_building_guid = 61)
      LocalObject(1117, Locker.Constructor(Vector3(4899.053f, 5564.963f, 64.36541f)), owning_building_guid = 61)
      LocalObject(1118, Locker.Constructor(Vector3(4899.088f, 5586.835f, 64.36541f)), owning_building_guid = 61)
      LocalObject(1119, Locker.Constructor(Vector3(4901.741f, 5564.963f, 64.36541f)), owning_building_guid = 61)
      LocalObject(1120, Locker.Constructor(Vector3(4901.741f, 5586.835f, 64.36541f)), owning_building_guid = 61)
      LocalObject(1121, Locker.Constructor(Vector3(4903.143f, 5564.963f, 64.36541f)), owning_building_guid = 61)
      LocalObject(1122, Locker.Constructor(Vector3(4903.143f, 5586.835f, 64.36541f)), owning_building_guid = 61)
      LocalObject(
        1417,
        Terminal.Constructor(Vector3(4903.445f, 5570.129f, 65.70341f), order_terminal),
        owning_building_guid = 61
      )
      LocalObject(
        1418,
        Terminal.Constructor(Vector3(4903.445f, 5575.853f, 65.70341f), order_terminal),
        owning_building_guid = 61
      )
      LocalObject(
        1419,
        Terminal.Constructor(Vector3(4903.445f, 5581.234f, 65.70341f), order_terminal),
        owning_building_guid = 61
      )
      LocalObject(
        1905,
        SpawnTube.Constructor(Vector3(4892.706f, 5567.742f, 63.85341f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 61
      )
      LocalObject(
        1906,
        SpawnTube.Constructor(Vector3(4892.706f, 5584.152f, 63.85341f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 61
      )
      LocalObject(
        1639,
        ProximityTerminal.Constructor(Vector3(4880.907f, 5574.725f, 101.9414f), pad_landing_tower_frame),
        owning_building_guid = 61
      )
      LocalObject(
        1640,
        Terminal.Constructor(Vector3(4880.907f, 5574.725f, 101.9414f), air_rearm_terminal),
        owning_building_guid = 61
      )
      LocalObject(
        1642,
        ProximityTerminal.Constructor(Vector3(4880.907f, 5585.17f, 101.9414f), pad_landing_tower_frame),
        owning_building_guid = 61
      )
      LocalObject(
        1643,
        Terminal.Constructor(Vector3(4880.907f, 5585.17f, 101.9414f), air_rearm_terminal),
        owning_building_guid = 61
      )
      LocalObject(
        1288,
        FacilityTurret.Constructor(Vector3(4867.07f, 5565.045f, 93.31341f), manned_turret),
        owning_building_guid = 61
      )
      TurretToWeapon(1288, 5077)
      LocalObject(
        1290,
        FacilityTurret.Constructor(Vector3(4905.497f, 5594.957f, 93.31341f), manned_turret),
        owning_building_guid = 61
      )
      TurretToWeapon(1290, 5078)
      LocalObject(
        1750,
        Painbox.Constructor(Vector3(4886.454f, 5572.849f, 66.39091f), painbox_radius_continuous),
        owning_building_guid = 61
      )
      LocalObject(
        1751,
        Painbox.Constructor(Vector3(4898.923f, 5569.54f, 64.47141f), painbox_radius_continuous),
        owning_building_guid = 61
      )
      LocalObject(
        1752,
        Painbox.Constructor(Vector3(4899.113f, 5582.022f, 64.47141f), painbox_radius_continuous),
        owning_building_guid = 61
      )
    }

    Building25()

    def Building25(): Unit = { // Name: S_Izha_Tower Type: tower_c GUID: 62, MapID: 25
      LocalBuilding(
        "S_Izha_Tower",
        62,
        25,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(5296f, 3324f, 36.35033f), Vector3(0f, 0f, 360f), tower_c)
        )
      )
      LocalObject(
        1941,
        CaptureTerminal.Constructor(Vector3(5312.587f, 3323.897f, 46.34933f), secondary_capture),
        owning_building_guid = 62
      )
      LocalObject(426, Door.Constructor(Vector3(5308f, 3316f, 37.87133f)), owning_building_guid = 62)
      LocalObject(427, Door.Constructor(Vector3(5308f, 3316f, 57.87033f)), owning_building_guid = 62)
      LocalObject(428, Door.Constructor(Vector3(5308f, 3332f, 37.87133f)), owning_building_guid = 62)
      LocalObject(429, Door.Constructor(Vector3(5308f, 3332f, 57.87033f)), owning_building_guid = 62)
      LocalObject(2066, Door.Constructor(Vector3(5307.146f, 3312.794f, 27.68633f)), owning_building_guid = 62)
      LocalObject(2067, Door.Constructor(Vector3(5307.146f, 3329.204f, 27.68633f)), owning_building_guid = 62)
      LocalObject(
        860,
        IFFLock.Constructor(Vector3(5305.957f, 3332.811f, 37.81133f), Vector3(0, 0, 0)),
        owning_building_guid = 62,
        door_guid = 428
      )
      LocalObject(
        861,
        IFFLock.Constructor(Vector3(5305.957f, 3332.811f, 57.81133f), Vector3(0, 0, 0)),
        owning_building_guid = 62,
        door_guid = 429
      )
      LocalObject(
        862,
        IFFLock.Constructor(Vector3(5310.047f, 3315.189f, 37.81133f), Vector3(0, 0, 180)),
        owning_building_guid = 62,
        door_guid = 426
      )
      LocalObject(
        863,
        IFFLock.Constructor(Vector3(5310.047f, 3315.189f, 57.81133f), Vector3(0, 0, 180)),
        owning_building_guid = 62,
        door_guid = 427
      )
      LocalObject(1147, Locker.Constructor(Vector3(5311.716f, 3308.963f, 26.34433f)), owning_building_guid = 62)
      LocalObject(1148, Locker.Constructor(Vector3(5311.751f, 3330.835f, 26.34433f)), owning_building_guid = 62)
      LocalObject(1149, Locker.Constructor(Vector3(5313.053f, 3308.963f, 26.34433f)), owning_building_guid = 62)
      LocalObject(1150, Locker.Constructor(Vector3(5313.088f, 3330.835f, 26.34433f)), owning_building_guid = 62)
      LocalObject(1151, Locker.Constructor(Vector3(5315.741f, 3308.963f, 26.34433f)), owning_building_guid = 62)
      LocalObject(1152, Locker.Constructor(Vector3(5315.741f, 3330.835f, 26.34433f)), owning_building_guid = 62)
      LocalObject(1153, Locker.Constructor(Vector3(5317.143f, 3308.963f, 26.34433f)), owning_building_guid = 62)
      LocalObject(1154, Locker.Constructor(Vector3(5317.143f, 3330.835f, 26.34433f)), owning_building_guid = 62)
      LocalObject(
        1429,
        Terminal.Constructor(Vector3(5317.445f, 3314.129f, 27.68233f), order_terminal),
        owning_building_guid = 62
      )
      LocalObject(
        1430,
        Terminal.Constructor(Vector3(5317.445f, 3319.853f, 27.68233f), order_terminal),
        owning_building_guid = 62
      )
      LocalObject(
        1431,
        Terminal.Constructor(Vector3(5317.445f, 3325.234f, 27.68233f), order_terminal),
        owning_building_guid = 62
      )
      LocalObject(
        1913,
        SpawnTube.Constructor(Vector3(5306.706f, 3311.742f, 25.83233f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 62
      )
      LocalObject(
        1914,
        SpawnTube.Constructor(Vector3(5306.706f, 3328.152f, 25.83233f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 62
      )
      LocalObject(
        1645,
        ProximityTerminal.Constructor(Vector3(5294.907f, 3318.725f, 63.92033f), pad_landing_tower_frame),
        owning_building_guid = 62
      )
      LocalObject(
        1646,
        Terminal.Constructor(Vector3(5294.907f, 3318.725f, 63.92033f), air_rearm_terminal),
        owning_building_guid = 62
      )
      LocalObject(
        1648,
        ProximityTerminal.Constructor(Vector3(5294.907f, 3329.17f, 63.92033f), pad_landing_tower_frame),
        owning_building_guid = 62
      )
      LocalObject(
        1649,
        Terminal.Constructor(Vector3(5294.907f, 3329.17f, 63.92033f), air_rearm_terminal),
        owning_building_guid = 62
      )
      LocalObject(
        1297,
        FacilityTurret.Constructor(Vector3(5281.07f, 3309.045f, 55.29233f), manned_turret),
        owning_building_guid = 62
      )
      TurretToWeapon(1297, 5079)
      LocalObject(
        1298,
        FacilityTurret.Constructor(Vector3(5319.497f, 3338.957f, 55.29233f), manned_turret),
        owning_building_guid = 62
      )
      TurretToWeapon(1298, 5080)
      LocalObject(
        1762,
        Painbox.Constructor(Vector3(5300.454f, 3316.849f, 28.36983f), painbox_radius_continuous),
        owning_building_guid = 62
      )
      LocalObject(
        1763,
        Painbox.Constructor(Vector3(5312.923f, 3313.54f, 26.45033f), painbox_radius_continuous),
        owning_building_guid = 62
      )
      LocalObject(
        1764,
        Painbox.Constructor(Vector3(5313.113f, 3326.022f, 26.45033f), painbox_radius_continuous),
        owning_building_guid = 62
      )
    }

    Building24()

    def Building24(): Unit = { // Name: SE_Izha_Tower Type: tower_c GUID: 63, MapID: 24
      LocalBuilding(
        "SE_Izha_Tower",
        63,
        24,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(6248f, 3502f, 60.33504f), Vector3(0f, 0f, 360f), tower_c)
        )
      )
      LocalObject(
        1944,
        CaptureTerminal.Constructor(Vector3(6264.587f, 3501.897f, 70.33405f), secondary_capture),
        owning_building_guid = 63
      )
      LocalObject(457, Door.Constructor(Vector3(6260f, 3494f, 61.85604f)), owning_building_guid = 63)
      LocalObject(458, Door.Constructor(Vector3(6260f, 3494f, 81.85504f)), owning_building_guid = 63)
      LocalObject(459, Door.Constructor(Vector3(6260f, 3510f, 61.85604f)), owning_building_guid = 63)
      LocalObject(460, Door.Constructor(Vector3(6260f, 3510f, 81.85504f)), owning_building_guid = 63)
      LocalObject(2075, Door.Constructor(Vector3(6259.146f, 3490.794f, 51.67104f)), owning_building_guid = 63)
      LocalObject(2076, Door.Constructor(Vector3(6259.146f, 3507.204f, 51.67104f)), owning_building_guid = 63)
      LocalObject(
        884,
        IFFLock.Constructor(Vector3(6257.957f, 3510.811f, 61.79604f), Vector3(0, 0, 0)),
        owning_building_guid = 63,
        door_guid = 459
      )
      LocalObject(
        885,
        IFFLock.Constructor(Vector3(6257.957f, 3510.811f, 81.79604f), Vector3(0, 0, 0)),
        owning_building_guid = 63,
        door_guid = 460
      )
      LocalObject(
        886,
        IFFLock.Constructor(Vector3(6262.047f, 3493.189f, 61.79604f), Vector3(0, 0, 180)),
        owning_building_guid = 63,
        door_guid = 457
      )
      LocalObject(
        887,
        IFFLock.Constructor(Vector3(6262.047f, 3493.189f, 81.79604f), Vector3(0, 0, 180)),
        owning_building_guid = 63,
        door_guid = 458
      )
      LocalObject(1183, Locker.Constructor(Vector3(6263.716f, 3486.963f, 50.32904f)), owning_building_guid = 63)
      LocalObject(1184, Locker.Constructor(Vector3(6263.751f, 3508.835f, 50.32904f)), owning_building_guid = 63)
      LocalObject(1185, Locker.Constructor(Vector3(6265.053f, 3486.963f, 50.32904f)), owning_building_guid = 63)
      LocalObject(1186, Locker.Constructor(Vector3(6265.088f, 3508.835f, 50.32904f)), owning_building_guid = 63)
      LocalObject(1187, Locker.Constructor(Vector3(6267.741f, 3486.963f, 50.32904f)), owning_building_guid = 63)
      LocalObject(1188, Locker.Constructor(Vector3(6267.741f, 3508.835f, 50.32904f)), owning_building_guid = 63)
      LocalObject(1189, Locker.Constructor(Vector3(6269.143f, 3486.963f, 50.32904f)), owning_building_guid = 63)
      LocalObject(1190, Locker.Constructor(Vector3(6269.143f, 3508.835f, 50.32904f)), owning_building_guid = 63)
      LocalObject(
        1442,
        Terminal.Constructor(Vector3(6269.445f, 3492.129f, 51.66705f), order_terminal),
        owning_building_guid = 63
      )
      LocalObject(
        1443,
        Terminal.Constructor(Vector3(6269.445f, 3497.853f, 51.66705f), order_terminal),
        owning_building_guid = 63
      )
      LocalObject(
        1444,
        Terminal.Constructor(Vector3(6269.445f, 3503.234f, 51.66705f), order_terminal),
        owning_building_guid = 63
      )
      LocalObject(
        1922,
        SpawnTube.Constructor(Vector3(6258.706f, 3489.742f, 49.81705f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 63
      )
      LocalObject(
        1923,
        SpawnTube.Constructor(Vector3(6258.706f, 3506.152f, 49.81705f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 63
      )
      LocalObject(
        1651,
        ProximityTerminal.Constructor(Vector3(6246.907f, 3496.725f, 87.90504f), pad_landing_tower_frame),
        owning_building_guid = 63
      )
      LocalObject(
        1652,
        Terminal.Constructor(Vector3(6246.907f, 3496.725f, 87.90504f), air_rearm_terminal),
        owning_building_guid = 63
      )
      LocalObject(
        1654,
        ProximityTerminal.Constructor(Vector3(6246.907f, 3507.17f, 87.90504f), pad_landing_tower_frame),
        owning_building_guid = 63
      )
      LocalObject(
        1655,
        Terminal.Constructor(Vector3(6246.907f, 3507.17f, 87.90504f), air_rearm_terminal),
        owning_building_guid = 63
      )
      LocalObject(
        1305,
        FacilityTurret.Constructor(Vector3(6233.07f, 3487.045f, 79.27705f), manned_turret),
        owning_building_guid = 63
      )
      TurretToWeapon(1305, 5081)
      LocalObject(
        1306,
        FacilityTurret.Constructor(Vector3(6271.497f, 3516.957f, 79.27705f), manned_turret),
        owning_building_guid = 63
      )
      TurretToWeapon(1306, 5082)
      LocalObject(
        1771,
        Painbox.Constructor(Vector3(6252.454f, 3494.849f, 52.35455f), painbox_radius_continuous),
        owning_building_guid = 63
      )
      LocalObject(
        1772,
        Painbox.Constructor(Vector3(6264.923f, 3491.54f, 50.43504f), painbox_radius_continuous),
        owning_building_guid = 63
      )
      LocalObject(
        1773,
        Painbox.Constructor(Vector3(6265.113f, 3504.022f, 50.43504f), painbox_radius_continuous),
        owning_building_guid = 63
      )
    }

    Building3()

    def Building3(): Unit = { // Name: WG_Oshur_to_Amerish Type: warpgate GUID: 64, MapID: 3
      LocalBuilding(
        "WG_Oshur_to_Amerish",
        64,
        3,
        FoundationBuilder(WarpGate.Structure(Vector3(2676f, 1818f, 45.95843f)))
      )
    }

    Building2()

    def Building2(): Unit = { // Name: WG_Oshur_to_Forseral Type: warpgate GUID: 65, MapID: 2
      LocalBuilding(
        "WG_Oshur_to_Forseral",
        65,
        2,
        FoundationBuilder(WarpGate.Structure(Vector3(3294f, 5816f, 61.28976f)))
      )
    }

    Building4()

    def Building4(): Unit = { // Name: WG_Oshur_to_Esamir Type: warpgate GUID: 66, MapID: 4
      LocalBuilding(
        "WG_Oshur_to_Esamir",
        66,
        4,
        FoundationBuilder(WarpGate.Structure(Vector3(5236f, 2552f, 39.79848f)))
      )
    }

    Building1()

    def Building1(): Unit = { // Name: WG_Oshur_to_Hossin Type: warpgate GUID: 67, MapID: 1
      LocalBuilding(
        "WG_Oshur_to_Hossin",
        67,
        1,
        FoundationBuilder(WarpGate.Structure(Vector3(5554f, 5208f, 31.79511f)))
      )
    }

    def Lattice(): Unit = {
      LatticeLink("Mithra", "Jamshid")
      LatticeLink("Dahaka", "Mithra")
      LatticeLink("Hvar", "Rashnu")
      LatticeLink("Hvar", "Atar")
      LatticeLink("Hvar", "Yazata")
      LatticeLink("Hvar", "Izha")
      LatticeLink("Jamshid", "WG_Oshur_to_Amerish")
      LatticeLink("Mithra", "WG_Oshur_to_Forseral")
      LatticeLink("Dahaka", "WG_Oshur_to_Hossin")
      LatticeLink("Zal", "WG_Oshur_to_Esamir")
      LatticeLink("Dahaka", "GW_Oshur_N")
      LatticeLink("Jamshid", "Atar")
      LatticeLink("Izha", "GW_Oshur_S")
      LatticeLink("Atar", "Rashnu")
      LatticeLink("Rashnu", "Mithra")
      LatticeLink("Atar", "Zal")
      LatticeLink("Zal", "Yazata")
      LatticeLink("Yazata", "Atar")
      LatticeLink("Yazata", "Izha")
      LatticeLink("Izha", "Dahaka")
    }

    Lattice()

  }
}
