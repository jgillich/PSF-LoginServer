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
import net.psforever.objects.zones.{MapScale, ZoneMap}
import net.psforever.types.Vector3

object Map99 { // Extinction
  val ZoneMap = new ZoneMap("map99") {
    Scale = MapScale.Dim4096
    Checksum = 4113726460L

    Building7()

    def Building7(): Unit = { // Name: Blue_Base Type: amp_station GUID: 1, MapID: 7
      LocalBuilding(
        "Blue_Base",
        1,
        7,
        FoundationBuilder(
          Building.Structure(
            StructureType.Facility,
            Vector3(2844f, 2746f, 88.53952f),
            Vector3(0f, 0f, 36f),
            amp_station
          )
        )
      )
      LocalObject(
        59,
        CaptureTerminal.Constructor(Vector3(2841.299f, 2744.042f, 100.0475f), capture_terminal),
        owning_building_guid = 1
      )
      LocalObject(52, Door.Constructor(Vector3(2840.173f, 2751.631f, 101.4415f)), owning_building_guid = 1)
      LocalObject(53, Door.Constructor(Vector3(2848.17f, 2740.619f, 101.4415f)), owning_building_guid = 1)
      LocalObject(158, Door.Constructor(Vector3(2735.492f, 2766.05f, 90.26052f)), owning_building_guid = 1)
      LocalObject(159, Door.Constructor(Vector3(2751.445f, 2757.741f, 98.25352f)), owning_building_guid = 1)
      LocalObject(160, Door.Constructor(Vector3(2762.139f, 2743.023f, 90.29052f)), owning_building_guid = 1)
      LocalObject(161, Door.Constructor(Vector3(2770.801f, 2806.766f, 90.29052f)), owning_building_guid = 1)
      LocalObject(162, Door.Constructor(Vector3(2785.519f, 2817.459f, 98.25452f)), owning_building_guid = 1)
      LocalObject(163, Door.Constructor(Vector3(2810.934f, 2675.862f, 98.25352f)), owning_building_guid = 1)
      LocalObject(164, Door.Constructor(Vector3(2821.627f, 2661.144f, 90.29052f)), owning_building_guid = 1)
      LocalObject(165, Door.Constructor(Vector3(2822.542f, 2768.202f, 100.2665f)), owning_building_guid = 1)
      LocalObject(166, Door.Constructor(Vector3(2823.133f, 2774.721f, 95.26052f)), owning_building_guid = 1)
      LocalObject(167, Door.Constructor(Vector3(2829.872f, 2773.529f, 100.2665f)), owning_building_guid = 1)
      LocalObject(168, Door.Constructor(Vector3(2858.468f, 2718.718f, 100.2665f)), owning_building_guid = 1)
      LocalObject(169, Door.Constructor(Vector3(2864.866f, 2717.28f, 95.26052f)), owning_building_guid = 1)
      LocalObject(170, Door.Constructor(Vector3(2865.798f, 2724.044f, 100.2665f)), owning_building_guid = 1)
      LocalObject(175, Door.Constructor(Vector3(2907.662f, 2688.154f, 98.25452f)), owning_building_guid = 1)
      LocalObject(176, Door.Constructor(Vector3(2918.862f, 2745.384f, 90.29052f)), owning_building_guid = 1)
      LocalObject(177, Door.Constructor(Vector3(2922.38f, 2698.847f, 90.29052f)), owning_building_guid = 1)
      LocalObject(178, Door.Constructor(Vector3(2929.555f, 2730.667f, 98.25452f)), owning_building_guid = 1)
      LocalObject(226, Door.Constructor(Vector3(2769.293f, 2726.332f, 82.76052f)), owning_building_guid = 1)
      LocalObject(227, Door.Constructor(Vector3(2807.241f, 2748.958f, 82.76052f)), owning_building_guid = 1)
      LocalObject(228, Door.Constructor(Vector3(2807.518f, 2714.55f, 75.26052f)), owning_building_guid = 1)
      LocalObject(229, Door.Constructor(Vector3(2808.403f, 2720.137f, 75.26052f)), owning_building_guid = 1)
      LocalObject(230, Door.Constructor(Vector3(2820.185f, 2758.363f, 90.26052f)), owning_building_guid = 1)
      LocalObject(231, Door.Constructor(Vector3(2821.07f, 2763.95f, 90.26052f)), owning_building_guid = 1)
      LocalObject(232, Door.Constructor(Vector3(2825.165f, 2717.483f, 75.26052f)), owning_building_guid = 1)
      LocalObject(233, Door.Constructor(Vector3(2825.772f, 2757.478f, 82.76052f)), owning_building_guid = 1)
      LocalObject(234, Door.Constructor(Vector3(2828.555f, 2767.619f, 100.2605f)), owning_building_guid = 1)
      LocalObject(235, Door.Constructor(Vector3(2829.589f, 2745.419f, 82.76052f)), owning_building_guid = 1)
      LocalObject(236, Door.Constructor(Vector3(2829.893f, 2765.417f, 95.26052f)), owning_building_guid = 1)
      LocalObject(237, Door.Constructor(Vector3(2831.359f, 2756.593f, 75.26052f)), owning_building_guid = 1)
      LocalObject(238, Door.Constructor(Vector3(2841.649f, 2749.236f, 82.76052f)), owning_building_guid = 1)
      LocalObject(239, Door.Constructor(Vector3(2843.696f, 2726.002f, 75.26052f)), owning_building_guid = 1)
      LocalObject(240, Door.Constructor(Vector3(2843.696f, 2726.002f, 82.76052f)), owning_building_guid = 1)
      LocalObject(241, Door.Constructor(Vector3(2848.399f, 2719.53f, 90.26052f)), owning_building_guid = 1)
      LocalObject(242, Door.Constructor(Vector3(2851.053f, 2736.292f, 75.26052f)), owning_building_guid = 1)
      LocalObject(243, Door.Constructor(Vector3(2853.986f, 2718.645f, 90.26052f)), owning_building_guid = 1)
      LocalObject(244, Door.Constructor(Vector3(2857.829f, 2760.992f, 90.26052f)), owning_building_guid = 1)
      LocalObject(245, Door.Constructor(Vector3(2858.107f, 2726.583f, 95.26052f)), owning_building_guid = 1)
      LocalObject(246, Door.Constructor(Vector3(2859.788f, 2724.63f, 100.2605f)), owning_building_guid = 1)
      LocalObject(247, Door.Constructor(Vector3(2862.531f, 2754.52f, 90.26052f)), owning_building_guid = 1)
      LocalObject(250, Door.Constructor(Vector3(2867.587f, 2763.169f, 91.01952f)), owning_building_guid = 1)
      LocalObject(753, Door.Constructor(Vector3(2825.828f, 2738.131f, 83.09352f)), owning_building_guid = 1)
      LocalObject(754, Door.Constructor(Vector3(2830.112f, 2732.234f, 83.09352f)), owning_building_guid = 1)
      LocalObject(755, Door.Constructor(Vector3(2834.399f, 2726.334f, 83.09352f)), owning_building_guid = 1)
      LocalObject(
        262,
        IFFLock.Constructor(Vector3(2868.018f, 2767.24f, 90.21952f), Vector3(0, 0, 54)),
        owning_building_guid = 1,
        door_guid = 250
      )
      LocalObject(
        320,
        IFFLock.Constructor(Vector3(2733.353f, 2765.517f, 90.19952f), Vector3(0, 0, 324)),
        owning_building_guid = 1,
        door_guid = 158
      )
      LocalObject(
        321,
        IFFLock.Constructor(Vector3(2807.25f, 2716.298f, 75.07552f), Vector3(0, 0, 54)),
        owning_building_guid = 1,
        door_guid = 228
      )
      LocalObject(
        322,
        IFFLock.Constructor(Vector3(2820.998f, 2774.183f, 95.20152f), Vector3(0, 0, 324)),
        owning_building_guid = 1,
        door_guid = 166
      )
      LocalObject(
        323,
        IFFLock.Constructor(Vector3(2823.063f, 2766.066f, 100.2005f), Vector3(0, 0, 234)),
        owning_building_guid = 1,
        door_guid = 165
      )
      LocalObject(
        324,
        IFFLock.Constructor(Vector3(2827.765f, 2745.256f, 82.57552f), Vector3(0, 0, 324)),
        owning_building_guid = 1,
        door_guid = 235
      )
      LocalObject(
        325,
        IFFLock.Constructor(Vector3(2829.302f, 2775.658f, 100.2005f), Vector3(0, 0, 54)),
        owning_building_guid = 1,
        door_guid = 167
      )
      LocalObject(
        326,
        IFFLock.Constructor(Vector3(2845.444f, 2726.271f, 82.57552f), Vector3(0, 0, 144)),
        owning_building_guid = 1,
        door_guid = 240
      )
      LocalObject(
        327,
        IFFLock.Constructor(Vector3(2851.217f, 2734.468f, 75.07552f), Vector3(0, 0, 234)),
        owning_building_guid = 1,
        door_guid = 242
      )
      LocalObject(
        328,
        IFFLock.Constructor(Vector3(2858.999f, 2716.605f, 100.2005f), Vector3(0, 0, 234)),
        owning_building_guid = 1,
        door_guid = 168
      )
      LocalObject(
        329,
        IFFLock.Constructor(Vector3(2865.24f, 2726.194f, 100.2005f), Vector3(0, 0, 54)),
        owning_building_guid = 1,
        door_guid = 170
      )
      LocalObject(
        332,
        IFFLock.Constructor(Vector3(2866.989f, 2717.833f, 95.20152f), Vector3(0, 0, 144)),
        owning_building_guid = 1,
        door_guid = 169
      )
      LocalObject(432, Locker.Constructor(Vector3(2842.151f, 2752.277f, 73.73952f)), owning_building_guid = 1)
      LocalObject(433, Locker.Constructor(Vector3(2843.222f, 2753.055f, 73.73952f)), owning_building_guid = 1)
      LocalObject(434, Locker.Constructor(Vector3(2844.303f, 2753.841f, 73.73952f)), owning_building_guid = 1)
      LocalObject(435, Locker.Constructor(Vector3(2845.32f, 2729.829f, 81.50052f)), owning_building_guid = 1)
      LocalObject(436, Locker.Constructor(Vector3(2845.385f, 2754.626f, 73.73952f)), owning_building_guid = 1)
      LocalObject(437, Locker.Constructor(Vector3(2846.262f, 2730.513f, 81.50052f)), owning_building_guid = 1)
      LocalObject(438, Locker.Constructor(Vector3(2847.19f, 2731.187f, 81.50052f)), owning_building_guid = 1)
      LocalObject(439, Locker.Constructor(Vector3(2848.12f, 2731.862f, 81.50052f)), owning_building_guid = 1)
      LocalObject(440, Locker.Constructor(Vector3(2849.058f, 2757.295f, 73.73952f)), owning_building_guid = 1)
      LocalObject(441, Locker.Constructor(Vector3(2850.129f, 2758.073f, 73.73952f)), owning_building_guid = 1)
      LocalObject(442, Locker.Constructor(Vector3(2851.21f, 2758.859f, 73.73952f)), owning_building_guid = 1)
      LocalObject(443, Locker.Constructor(Vector3(2852.292f, 2759.645f, 73.73952f)), owning_building_guid = 1)
      LocalObject(
        535,
        Terminal.Constructor(Vector3(2825.826f, 2732.791f, 90.06852f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        536,
        Terminal.Constructor(Vector3(2830.787f, 2764.183f, 90.06852f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        537,
        Terminal.Constructor(Vector3(2840.305f, 2741.99f, 82.82952f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        538,
        Terminal.Constructor(Vector3(2842.532f, 2738.925f, 82.82952f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        539,
        Terminal.Constructor(Vector3(2844.725f, 2735.907f, 82.82952f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        540,
        Terminal.Constructor(Vector3(2857.21f, 2727.814f, 90.06852f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        725,
        Terminal.Constructor(Vector3(2782.05f, 2749.703f, 82.79652f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        726,
        Terminal.Constructor(Vector3(2815.573f, 2744.394f, 75.29652f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        727,
        Terminal.Constructor(Vector3(2827.533f, 2736.289f, 83.37352f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        728,
        Terminal.Constructor(Vector3(2831.814f, 2730.391f, 83.37352f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        729,
        Terminal.Constructor(Vector3(2836.104f, 2724.494f, 83.37352f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        730,
        Terminal.Constructor(Vector3(2842.192f, 2739.124f, 95.26752f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        778,
        Terminal.Constructor(Vector3(2756.751f, 2784.552f, 90.64152f), vehicle_terminal_combined),
        owning_building_guid = 1
      )
      LocalObject(
        494,
        VehicleSpawnPad.Constructor(Vector3(2764.84f, 2773.572f, 86.48452f), mb_pad_creation, Vector3(0, 0, 144)),
        owning_building_guid = 1,
        terminal_guid = 778
      )
      LocalObject(675, ResourceSilo.Constructor(Vector3(2936.843f, 2707.777f, 95.77452f)), owning_building_guid = 1)
      LocalObject(
        698,
        SpawnTube.Constructor(Vector3(2826.091f, 2737.02f, 81.23952f), Vector3(0, 0, 324)),
        owning_building_guid = 1
      )
      LocalObject(
        699,
        SpawnTube.Constructor(Vector3(2830.375f, 2731.124f, 81.23952f), Vector3(0, 0, 324)),
        owning_building_guid = 1
      )
      LocalObject(
        700,
        SpawnTube.Constructor(Vector3(2834.66f, 2725.226f, 81.23952f), Vector3(0, 0, 324)),
        owning_building_guid = 1
      )
      LocalObject(
        498,
        ProximityTerminal.Constructor(Vector3(2826.166f, 2733.036f, 93.73952f), medical_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        499,
        ProximityTerminal.Constructor(Vector3(2847.528f, 2755.51f, 73.73952f), medical_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        574,
        ProximityTerminal.Constructor(Vector3(2786.064f, 2728.346f, 97.04452f), pad_landing_frame),
        owning_building_guid = 1
      )
      LocalObject(
        575,
        Terminal.Constructor(Vector3(2786.064f, 2728.346f, 97.04452f), air_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        577,
        ProximityTerminal.Constructor(Vector3(2831.771f, 2808.081f, 99.20552f), pad_landing_frame),
        owning_building_guid = 1
      )
      LocalObject(
        578,
        Terminal.Constructor(Vector3(2831.771f, 2808.081f, 99.20552f), air_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        580,
        ProximityTerminal.Constructor(Vector3(2893.913f, 2691.419f, 97.06752f), pad_landing_frame),
        owning_building_guid = 1
      )
      LocalObject(
        581,
        Terminal.Constructor(Vector3(2893.913f, 2691.419f, 97.06752f), air_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        583,
        ProximityTerminal.Constructor(Vector3(2895.603f, 2758.977f, 97.04452f), pad_landing_frame),
        owning_building_guid = 1
      )
      LocalObject(
        584,
        Terminal.Constructor(Vector3(2895.603f, 2758.977f, 97.04452f), air_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        665,
        ProximityTerminal.Constructor(Vector3(2787.171f, 2704.963f, 87.93952f), repair_silo),
        owning_building_guid = 1
      )
      LocalObject(
        666,
        Terminal.Constructor(Vector3(2787.171f, 2704.963f, 87.93952f), ground_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        669,
        ProximityTerminal.Constructor(Vector3(2894.19f, 2782.952f, 87.93952f), repair_silo),
        owning_building_guid = 1
      )
      LocalObject(
        670,
        Terminal.Constructor(Vector3(2894.19f, 2782.952f, 87.93952f), ground_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        484,
        FacilityTurret.Constructor(Vector3(2717.151f, 2783.427f, 97.24752f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(484, 5000)
      LocalObject(
        485,
        FacilityTurret.Constructor(Vector3(2835.717f, 2620.284f, 97.24752f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(485, 5001)
      LocalObject(
        487,
        FacilityTurret.Constructor(Vector3(2841.315f, 2873.625f, 97.24752f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(487, 5002)
      LocalObject(
        489,
        FacilityTurret.Constructor(Vector3(2880.365f, 2823.652f, 97.24752f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(489, 5003)
      LocalObject(
        490,
        FacilityTurret.Constructor(Vector3(2885.234f, 2653.506f, 97.24752f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(490, 5004)
      LocalObject(
        491,
        FacilityTurret.Constructor(Vector3(2959.851f, 2710.46f, 97.24752f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(491, 5005)
      LocalObject(606, Painbox.Constructor(Vector3(2799.626f, 2705.253f, 78.61052f), painbox), owning_building_guid = 1)
      LocalObject(
        609,
        Painbox.Constructor(Vector3(2834.803f, 2737.571f, 86.18792f), painbox_continuous),
        owning_building_guid = 1
      )
      LocalObject(
        612,
        Painbox.Constructor(Vector3(2809.738f, 2715.229f, 75.19852f), painbox_door_radius),
        owning_building_guid = 1
      )
      LocalObject(
        619,
        Painbox.Constructor(Vector3(2828.895f, 2746.501f, 82.50402f), painbox_door_radius_continuous),
        owning_building_guid = 1
      )
      LocalObject(
        620,
        Painbox.Constructor(Vector3(2842.861f, 2750.064f, 84.41812f), painbox_door_radius_continuous),
        owning_building_guid = 1
      )
      LocalObject(
        621,
        Painbox.Constructor(Vector3(2844.322f, 2725.142f, 82.43952f), painbox_door_radius_continuous),
        owning_building_guid = 1
      )
      LocalObject(78, Generator.Constructor(Vector3(2794.949f, 2705.387f, 72.44552f)), owning_building_guid = 1)
      LocalObject(
        75,
        Terminal.Constructor(Vector3(2801.549f, 2710.24f, 73.73952f), gen_control),
        owning_building_guid = 1
      )
    }

    Building2()

    def Building2(): Unit = { // Name: bunker_gauntlet Type: bunker_gauntlet GUID: 4, MapID: 2
      LocalBuilding(
        "bunker_gauntlet",
        4,
        2,
        FoundationBuilder(
          Building.Structure(
            StructureType.Bunker,
            Vector3(1724f, 1710f, 84.34553f),
            Vector3(0f, 0f, 95f),
            bunker_gauntlet
          )
        )
      )
      LocalObject(114, Door.Constructor(Vector3(1723.722f, 1734.994f, 85.86653f)), owning_building_guid = 4)
      LocalObject(115, Door.Constructor(Vector3(1728.075f, 1685.363f, 85.86653f)), owning_building_guid = 4)
    }

    Building6()

    def Building6(): Unit = { // Name: bunker_gauntlet Type: bunker_gauntlet GUID: 5, MapID: 6
      LocalBuilding(
        "bunker_gauntlet",
        5,
        6,
        FoundationBuilder(
          Building.Structure(
            StructureType.Bunker,
            Vector3(1736f, 2188f, 84.34553f),
            Vector3(0f, 0f, 101f),
            bunker_gauntlet
          )
        )
      )
      LocalObject(116, Door.Constructor(Vector3(1733.111f, 2212.828f, 85.86653f)), owning_building_guid = 5)
      LocalObject(117, Door.Constructor(Vector3(1742.628f, 2163.924f, 85.86653f)), owning_building_guid = 5)
    }

    Building1()

    def Building1(): Unit = { // Name: bunker_gauntlet Type: bunker_gauntlet GUID: 6, MapID: 1
      LocalBuilding(
        "bunker_gauntlet",
        6,
        1,
        FoundationBuilder(
          Building.Structure(
            StructureType.Bunker,
            Vector3(1952f, 2450f, 84.34553f),
            Vector3(0f, 0f, 354f),
            bunker_gauntlet
          )
        )
      )
      LocalObject(122, Door.Constructor(Vector3(1927.039f, 2450.701f, 85.86653f)), owning_building_guid = 6)
      LocalObject(123, Door.Constructor(Vector3(1976.588f, 2445.504f, 85.86653f)), owning_building_guid = 6)
    }

    Building5()

    def Building5(): Unit = { // Name: bunker_gauntlet Type: bunker_gauntlet GUID: 7, MapID: 5
      LocalBuilding(
        "bunker_gauntlet",
        7,
        5,
        FoundationBuilder(
          Building.Structure(
            StructureType.Bunker,
            Vector3(2210f, 2376f, 84.31532f),
            Vector3(0f, 0f, 358f),
            bunker_gauntlet
          )
        )
      )
      LocalObject(132, Door.Constructor(Vector3(2185.05f, 2374.958f, 85.83632f)), owning_building_guid = 7)
      LocalObject(138, Door.Constructor(Vector3(2234.841f, 2373.23f, 85.83632f)), owning_building_guid = 7)
    }

    Building3()

    def Building3(): Unit = { // Name: bunker_gauntlet Type: bunker_gauntlet GUID: 8, MapID: 3
      LocalBuilding(
        "bunker_gauntlet",
        8,
        3,
        FoundationBuilder(
          Building.Structure(
            StructureType.Bunker,
            Vector3(2224f, 1666f, 84.68795f),
            Vector3(0f, 0f, 224f),
            bunker_gauntlet
          )
        )
      )
      LocalObject(133, Door.Constructor(Vector3(2204.751f, 1650.054f, 86.20895f)), owning_building_guid = 8)
      LocalObject(139, Door.Constructor(Vector3(2240.582f, 1684.671f, 86.20895f)), owning_building_guid = 8)
    }

    Building4()

    def Building4(): Unit = { // Name: bunker_gauntlet Type: bunker_gauntlet GUID: 9, MapID: 4
      LocalBuilding(
        "bunker_gauntlet",
        9,
        4,
        FoundationBuilder(
          Building.Structure(
            StructureType.Bunker,
            Vector3(2326f, 2054f, 85.05051f),
            Vector3(0f, 0f, 213f),
            bunker_gauntlet
          )
        )
      )
      LocalObject(140, Door.Constructor(Vector3(2304.062f, 2042.02f, 86.57151f)), owning_building_guid = 9)
      LocalObject(141, Door.Constructor(Vector3(2345.84f, 2069.164f, 86.57151f)), owning_building_guid = 9)
    }

    Building19()

    def Building19(): Unit = { // Name: bunker_lg Type: bunker_lg GUID: 10, MapID: 19
      LocalBuilding(
        "bunker_lg",
        10,
        19,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(2512f, 2678f, 90.57954f), Vector3(0f, 0f, 121f), bunker_lg)
        )
      )
      LocalObject(156, Door.Constructor(Vector3(2508.466f, 2678.917f, 92.10055f)), owning_building_guid = 10)
    }

    Building23()

    def Building23(): Unit = { // Name: bunker_sm Type: bunker_sm GUID: 11, MapID: 23
      LocalBuilding(
        "bunker_sm",
        11,
        23,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(1328f, 2002f, 82.80465f), Vector3(0f, 0f, 197f), bunker_sm)
        )
      )
      LocalObject(93, Door.Constructor(Vector3(1326.812f, 2001.694f, 84.32565f)), owning_building_guid = 11)
    }

    Building20()

    def Building20(): Unit = { // Name: bunker_sm Type: bunker_sm GUID: 12, MapID: 20
      LocalBuilding(
        "bunker_sm",
        12,
        20,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(2410f, 2706f, 85.88767f), Vector3(0f, 0f, 41f), bunker_sm)
        )
      )
      LocalObject(148, Door.Constructor(Vector3(2410.96f, 2706.762f, 87.40868f)), owning_building_guid = 12)
    }

    Building21()

    def Building21(): Unit = { // Name: bunker_sm Type: bunker_sm GUID: 13, MapID: 21
      LocalBuilding(
        "bunker_sm",
        13,
        21,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(2490f, 1330f, 90.34791f), Vector3(0f, 0f, 238f), bunker_sm)
        )
      )
      LocalObject(155, Door.Constructor(Vector3(2489.304f, 1328.99f, 91.86891f)), owning_building_guid = 13)
    }

    Building22()

    def Building22(): Unit = { // Name: bunker_sm Type: bunker_sm GUID: 14, MapID: 22
      LocalBuilding(
        "bunker_sm",
        14,
        22,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(2578f, 1328f, 90.41841f), Vector3(0f, 0f, 335f), bunker_sm)
        )
      )
      LocalObject(157, Door.Constructor(Vector3(2579.087f, 1327.432f, 91.93941f)), owning_building_guid = 14)
    }

    Building8()

    def Building8(): Unit = { // Name: Indigo_Base Type: comm_station GUID: 15, MapID: 8
      LocalBuilding(
        "Indigo_Base",
        15,
        8,
        FoundationBuilder(
          Building.Structure(
            StructureType.Facility,
            Vector3(1488f, 1232f, 88.53511f),
            Vector3(0f, 0f, 70f),
            comm_station
          )
        )
      )
      LocalObject(
        58,
        CaptureTerminal.Constructor(Vector3(1430.973f, 1299.675f, 71.23511f), capture_terminal),
        owning_building_guid = 15
      )
      LocalObject(95, Door.Constructor(Vector3(1424.293f, 1255.719f, 90.28611f)), owning_building_guid = 15)
      LocalObject(96, Door.Constructor(Vector3(1427.528f, 1288.064f, 90.25611f)), owning_building_guid = 15)
      LocalObject(97, Door.Constructor(Vector3(1430.516f, 1272.814f, 98.24911f)), owning_building_guid = 15)
      LocalObject(98, Door.Constructor(Vector3(1471.942f, 1246.358f, 95.25611f)), owning_building_guid = 15)
      LocalObject(99, Door.Constructor(Vector3(1480.882f, 1213.307f, 95.25611f)), owning_building_guid = 15)
      LocalObject(100, Door.Constructor(Vector3(1489.4f, 1210.207f, 95.25611f)), owning_building_guid = 15)
      LocalObject(101, Door.Constructor(Vector3(1491.327f, 1167.147f, 98.25011f)), owning_building_guid = 15)
      LocalObject(102, Door.Constructor(Vector3(1493.467f, 1225.354f, 102.6951f)), owning_building_guid = 15)
      LocalObject(106, Door.Constructor(Vector3(1501.542f, 1291.136f, 90.28611f)), owning_building_guid = 15)
      LocalObject(110, Door.Constructor(Vector3(1508.422f, 1160.925f, 90.28611f)), owning_building_guid = 15)
      LocalObject(111, Door.Constructor(Vector3(1518.638f, 1284.913f, 98.25011f)), owning_building_guid = 15)
      LocalObject(112, Door.Constructor(Vector3(1537.112f, 1168.692f, 98.25011f)), owning_building_guid = 15)
      LocalObject(113, Door.Constructor(Vector3(1543.334f, 1185.788f, 90.28611f)), owning_building_guid = 15)
      LocalObject(202, Door.Constructor(Vector3(1433.318f, 1222.106f, 82.75611f)), owning_building_guid = 15)
      LocalObject(203, Door.Constructor(Vector3(1437.782f, 1292.845f, 72.75611f)), owning_building_guid = 15)
      LocalObject(204, Door.Constructor(Vector3(1440.518f, 1300.363f, 72.75611f)), owning_building_guid = 15)
      LocalObject(205, Door.Constructor(Vector3(1441.527f, 1244.658f, 82.75611f)), owning_building_guid = 15)
      LocalObject(206, Door.Constructor(Vector3(1444.954f, 1277.464f, 72.75611f)), owning_building_guid = 15)
      LocalObject(207, Door.Constructor(Vector3(1445.617f, 1209.116f, 82.75611f)), owning_building_guid = 15)
      LocalObject(208, Door.Constructor(Vector3(1449.044f, 1241.922f, 72.75611f)), owning_building_guid = 15)
      LocalObject(209, Door.Constructor(Vector3(1454.171f, 1244.313f, 82.75611f)), owning_building_guid = 15)
      LocalObject(210, Door.Constructor(Vector3(1458.289f, 1302.408f, 72.75611f)), owning_building_guid = 15)
      LocalObject(211, Door.Constructor(Vector3(1458.607f, 1221.415f, 72.75611f)), owning_building_guid = 15)
      LocalObject(212, Door.Constructor(Vector3(1466.125f, 1218.678f, 82.75611f)), owning_building_guid = 15)
      LocalObject(213, Door.Constructor(Vector3(1471.251f, 1221.069f, 90.25611f)), owning_building_guid = 15)
      LocalObject(214, Door.Constructor(Vector3(1471.942f, 1246.358f, 85.25611f)), owning_building_guid = 15)
      LocalObject(215, Door.Constructor(Vector3(1472.979f, 1284.291f, 80.25611f)), owning_building_guid = 15)
      LocalObject(216, Door.Constructor(Vector3(1475.024f, 1266.52f, 72.75611f)), owning_building_guid = 15)
      LocalObject(217, Door.Constructor(Vector3(1479.114f, 1230.977f, 72.75611f)), owning_building_guid = 15)
      LocalObject(218, Door.Constructor(Vector3(1479.46f, 1243.622f, 95.25611f)), owning_building_guid = 15)
      LocalObject(219, Door.Constructor(Vector3(1480.842f, 1294.199f, 80.25611f)), owning_building_guid = 15)
      LocalObject(220, Door.Constructor(Vector3(1484.241f, 1233.368f, 82.75611f)), owning_building_guid = 15)
      LocalObject(221, Door.Constructor(Vector3(1484.587f, 1246.012f, 90.25611f)), owning_building_guid = 15)
      LocalObject(222, Door.Constructor(Vector3(1486.286f, 1215.597f, 95.25611f)), owning_building_guid = 15)
      LocalObject(223, Door.Constructor(Vector3(1487.323f, 1253.53f, 85.25611f)), owning_building_guid = 15)
      LocalObject(224, Door.Constructor(Vector3(1495.531f, 1276.083f, 80.25611f)), owning_building_guid = 15)
      LocalObject(225, Door.Constructor(Vector3(1495.877f, 1288.727f, 72.75611f)), owning_building_guid = 15)
      LocalObject(249, Door.Constructor(Vector3(1497.879f, 1247.248f, 91.02811f)), owning_building_guid = 15)
      LocalObject(736, Door.Constructor(Vector3(1473.936f, 1276.146f, 80.58911f)), owning_building_guid = 15)
      LocalObject(737, Door.Constructor(Vector3(1480.785f, 1273.653f, 80.58911f)), owning_building_guid = 15)
      LocalObject(738, Door.Constructor(Vector3(1487.638f, 1271.158f, 80.58911f)), owning_building_guid = 15)
      LocalObject(
        261,
        IFFLock.Constructor(Vector3(1495.813f, 1250.922f, 90.18711f), Vector3(0, 0, 20)),
        owning_building_guid = 15,
        door_guid = 249
      )
      LocalObject(
        275,
        IFFLock.Constructor(Vector3(1425.884f, 1289.49f, 90.18511f), Vector3(0, 0, 20)),
        owning_building_guid = 15,
        door_guid = 96
      )
      LocalObject(
        276,
        IFFLock.Constructor(Vector3(1438.981f, 1291.543f, 72.57111f), Vector3(0, 0, 200)),
        owning_building_guid = 15,
        door_guid = 203
      )
      LocalObject(
        277,
        IFFLock.Constructor(Vector3(1439.319f, 1301.664f, 72.57111f), Vector3(0, 0, 20)),
        owning_building_guid = 15,
        door_guid = 204
      )
      LocalObject(
        278,
        IFFLock.Constructor(Vector3(1460.028f, 1222.57f, 72.57111f), Vector3(0, 0, 110)),
        owning_building_guid = 15,
        door_guid = 211
      )
      LocalObject(
        279,
        IFFLock.Constructor(Vector3(1471.68f, 1283.091f, 80.07111f), Vector3(0, 0, 290)),
        owning_building_guid = 15,
        door_guid = 215
      )
      LocalObject(
        280,
        IFFLock.Constructor(Vector3(1473.586f, 1244.895f, 95.19611f), Vector3(0, 0, 200)),
        owning_building_guid = 15,
        door_guid = 98
      )
      LocalObject(
        281,
        IFFLock.Constructor(Vector3(1479.422f, 1211.664f, 95.19611f), Vector3(0, 0, 290)),
        owning_building_guid = 15,
        door_guid = 99
      )
      LocalObject(
        282,
        IFFLock.Constructor(Vector3(1490.862f, 1211.853f, 95.19611f), Vector3(0, 0, 110)),
        owning_building_guid = 15,
        door_guid = 100
      )
      LocalObject(
        283,
        IFFLock.Constructor(Vector3(1495.144f, 1223.884f, 102.6161f), Vector3(0, 0, 200)),
        owning_building_guid = 15,
        door_guid = 102
      )
      LocalObject(
        284,
        IFFLock.Constructor(Vector3(1496.83f, 1277.283f, 80.07111f), Vector3(0, 0, 110)),
        owning_building_guid = 15,
        door_guid = 224
      )
      LocalObject(
        285,
        IFFLock.Constructor(Vector3(1497.032f, 1287.306f, 72.57111f), Vector3(0, 0, 200)),
        owning_building_guid = 15,
        door_guid = 225
      )
      LocalObject(364, Locker.Constructor(Vector3(1479.558f, 1297.001f, 71.23511f)), owning_building_guid = 15)
      LocalObject(365, Locker.Constructor(Vector3(1480.01f, 1298.246f, 71.23511f)), owning_building_guid = 15)
      LocalObject(366, Locker.Constructor(Vector3(1480.468f, 1299.501f, 71.23511f)), owning_building_guid = 15)
      LocalObject(367, Locker.Constructor(Vector3(1480.925f, 1300.757f, 71.23511f)), owning_building_guid = 15)
      LocalObject(368, Locker.Constructor(Vector3(1482.478f, 1305.024f, 71.23511f)), owning_building_guid = 15)
      LocalObject(369, Locker.Constructor(Vector3(1482.93f, 1306.268f, 71.23511f)), owning_building_guid = 15)
      LocalObject(370, Locker.Constructor(Vector3(1483.387f, 1307.523f, 71.23511f)), owning_building_guid = 15)
      LocalObject(371, Locker.Constructor(Vector3(1483.845f, 1308.78f, 71.23511f)), owning_building_guid = 15)
      LocalObject(372, Locker.Constructor(Vector3(1494.738f, 1280.163f, 78.99611f)), owning_building_guid = 15)
      LocalObject(373, Locker.Constructor(Vector3(1495.136f, 1281.257f, 78.99611f)), owning_building_guid = 15)
      LocalObject(374, Locker.Constructor(Vector3(1495.529f, 1282.335f, 78.99611f)), owning_building_guid = 15)
      LocalObject(375, Locker.Constructor(Vector3(1495.922f, 1283.414f, 78.99611f)), owning_building_guid = 15)
      LocalObject(
        507,
        Terminal.Constructor(Vector3(1483.779f, 1287.441f, 80.32511f), order_terminal),
        owning_building_guid = 15
      )
      LocalObject(
        508,
        Terminal.Constructor(Vector3(1487.34f, 1286.145f, 80.32511f), order_terminal),
        owning_building_guid = 15
      )
      LocalObject(
        509,
        Terminal.Constructor(Vector3(1490.846f, 1284.869f, 80.32511f), order_terminal),
        owning_building_guid = 15
      )
      LocalObject(
        510,
        Terminal.Constructor(Vector3(1493.661f, 1232.421f, 102.4901f), order_terminal),
        owning_building_guid = 15
      )
      LocalObject(
        511,
        Terminal.Constructor(Vector3(1495.029f, 1229.521f, 102.4901f), order_terminal),
        owning_building_guid = 15
      )
      LocalObject(
        512,
        Terminal.Constructor(Vector3(1497.79f, 1230.917f, 102.4901f), order_terminal),
        owning_building_guid = 15
      )
      LocalObject(
        515,
        Terminal.Constructor(Vector3(1506.41f, 1215.061f, 95.09511f), order_terminal),
        owning_building_guid = 15
      )
      LocalObject(
        719,
        Terminal.Constructor(Vector3(1450.265f, 1245.106f, 82.79211f), spawn_terminal),
        owning_building_guid = 15
      )
      LocalObject(
        720,
        Terminal.Constructor(Vector3(1474.435f, 1219.85f, 72.79211f), spawn_terminal),
        owning_building_guid = 15
      )
      LocalObject(
        721,
        Terminal.Constructor(Vector3(1476.379f, 1275.572f, 80.86911f), spawn_terminal),
        owning_building_guid = 15
      )
      LocalObject(
        722,
        Terminal.Constructor(Vector3(1483.226f, 1273.077f, 80.86911f), spawn_terminal),
        owning_building_guid = 15
      )
      LocalObject(
        723,
        Terminal.Constructor(Vector3(1490.08f, 1270.587f, 80.86911f), spawn_terminal),
        owning_building_guid = 15
      )
      LocalObject(
        724,
        Terminal.Constructor(Vector3(1510.072f, 1222.381f, 95.35211f), spawn_terminal),
        owning_building_guid = 15
      )
      LocalObject(
        777,
        Terminal.Constructor(Vector3(1454.471f, 1300.028f, 91.42211f), vehicle_terminal_combined),
        owning_building_guid = 15
      )
      LocalObject(
        493,
        VehicleSpawnPad.Constructor(Vector3(1449.956f, 1287.172f, 87.26411f), mb_pad_creation, Vector3(0, 0, 200)),
        owning_building_guid = 15,
        terminal_guid = 777
      )
      LocalObject(674, ResourceSilo.Constructor(Vector3(1533.851f, 1155.963f, 95.75211f)), owning_building_guid = 15)
      LocalObject(
        681,
        SpawnTube.Constructor(Vector3(1474.775f, 1275.372f, 78.73511f), Vector3(0, 0, 290)),
        owning_building_guid = 15
      )
      LocalObject(
        682,
        SpawnTube.Constructor(Vector3(1481.623f, 1272.879f, 78.73511f), Vector3(0, 0, 290)),
        owning_building_guid = 15
      )
      LocalObject(
        683,
        SpawnTube.Constructor(Vector3(1488.474f, 1270.386f, 78.73511f), Vector3(0, 0, 290)),
        owning_building_guid = 15
      )
      LocalObject(
        496,
        ProximityTerminal.Constructor(Vector3(1482.208f, 1302.688f, 71.23511f), medical_terminal),
        owning_building_guid = 15
      )
      LocalObject(
        497,
        ProximityTerminal.Constructor(Vector3(1515.525f, 1222.901f, 88.73511f), medical_terminal),
        owning_building_guid = 15
      )
      LocalObject(
        571,
        ProximityTerminal.Constructor(Vector3(1429.697f, 1233.165f, 96.97611f), pad_landing_frame),
        owning_building_guid = 15
      )
      LocalObject(
        572,
        Terminal.Constructor(Vector3(1429.697f, 1233.165f, 96.97611f), air_rearm_terminal),
        owning_building_guid = 15
      )
      LocalObject(
        657,
        ProximityTerminal.Constructor(Vector3(1445.325f, 1182.524f, 88.28511f), repair_silo),
        owning_building_guid = 15
      )
      LocalObject(
        658,
        Terminal.Constructor(Vector3(1445.325f, 1182.524f, 88.28511f), ground_rearm_terminal),
        owning_building_guid = 15
      )
      LocalObject(
        661,
        ProximityTerminal.Constructor(Vector3(1531.945f, 1281.602f, 88.28511f), repair_silo),
        owning_building_guid = 15
      )
      LocalObject(
        662,
        Terminal.Constructor(Vector3(1531.945f, 1281.602f, 88.28511f), ground_rearm_terminal),
        owning_building_guid = 15
      )
      LocalObject(
        470,
        FacilityTurret.Constructor(Vector3(1400.765f, 1231.346f, 97.24311f), manned_turret),
        owning_building_guid = 15
      )
      TurretToWeapon(470, 5006)
      LocalObject(
        471,
        FacilityTurret.Constructor(Vector3(1426.515f, 1176.081f, 97.24311f), manned_turret),
        owning_building_guid = 15
      )
      TurretToWeapon(471, 5007)
      LocalObject(
        472,
        FacilityTurret.Constructor(Vector3(1437.329f, 1327.958f, 97.24311f), manned_turret),
        owning_building_guid = 15
      )
      TurretToWeapon(472, 5008)
      LocalObject(
        473,
        FacilityTurret.Constructor(Vector3(1538.806f, 1136.413f, 97.24311f), manned_turret),
        owning_building_guid = 15
      )
      TurretToWeapon(473, 5009)
      LocalObject(
        474,
        FacilityTurret.Constructor(Vector3(1549.49f, 1288.379f, 97.24311f), manned_turret),
        owning_building_guid = 15
      )
      TurretToWeapon(474, 5010)
      LocalObject(
        475,
        FacilityTurret.Constructor(Vector3(1575.247f, 1233.091f, 97.24311f), manned_turret),
        owning_building_guid = 15
      )
      TurretToWeapon(475, 5011)
      LocalObject(
        605,
        Painbox.Constructor(Vector3(1447.294f, 1225.679f, 76.13711f), painbox),
        owning_building_guid = 15
      )
      LocalObject(
        608,
        Painbox.Constructor(Vector3(1479.215f, 1284.379f, 83.17991f), painbox_continuous),
        owning_building_guid = 15
      )
      LocalObject(
        611,
        Painbox.Constructor(Vector3(1461.438f, 1220.636f, 73.99381f), painbox_door_radius),
        owning_building_guid = 15
      )
      LocalObject(
        616,
        Painbox.Constructor(Vector3(1471.921f, 1285.538f, 80.34281f), painbox_door_radius_continuous),
        owning_building_guid = 15
      )
      LocalObject(
        617,
        Painbox.Constructor(Vector3(1481.639f, 1295.883f, 81.56111f), painbox_door_radius_continuous),
        owning_building_guid = 15
      )
      LocalObject(
        618,
        Painbox.Constructor(Vector3(1497.31f, 1275.344f, 80.56111f), painbox_door_radius_continuous),
        owning_building_guid = 15
      )
      LocalObject(77, Generator.Constructor(Vector3(1443.981f, 1226.711f, 69.94111f)), owning_building_guid = 15)
      LocalObject(
        74,
        Terminal.Constructor(Vector3(1451.696f, 1223.954f, 71.23511f), gen_control),
        owning_building_guid = 15
      )
    }

    Building18()

    def Building18(): Unit = { // Name: Red_Base Type: cryo_facility GUID: 18, MapID: 18
      LocalBuilding(
        "Red_Base",
        18,
        18,
        FoundationBuilder(
          Building.Structure(
            StructureType.Facility,
            Vector3(1254f, 2502f, 87.99127f),
            Vector3(0f, 0f, 36f),
            cryo_facility
          )
        )
      )
      LocalObject(
        57,
        CaptureTerminal.Constructor(Vector3(1196.44f, 2533.437f, 77.99127f), capture_terminal),
        owning_building_guid = 18
      )
      LocalObject(83, Door.Constructor(Vector3(1179.904f, 2531.975f, 89.54227f)), owning_building_guid = 18)
      LocalObject(84, Door.Constructor(Vector3(1192.948f, 2485.693f, 97.50627f)), owning_building_guid = 18)
      LocalObject(85, Door.Constructor(Vector3(1194.622f, 2542.669f, 97.50627f)), owning_building_guid = 18)
      LocalObject(86, Door.Constructor(Vector3(1203.642f, 2470.975f, 89.54227f)), owning_building_guid = 18)
      LocalObject(87, Door.Constructor(Vector3(1229.3f, 2508.776f, 99.51227f)), owning_building_guid = 18)
      LocalObject(88, Door.Constructor(Vector3(1255.392f, 2506.889f, 99.51227f)), owning_building_guid = 18)
      LocalObject(89, Door.Constructor(Vector3(1307.037f, 2438.03f, 97.50627f)), owning_building_guid = 18)
      LocalObject(90, Door.Constructor(Vector3(1314.304f, 2505.641f, 89.54227f)), owning_building_guid = 18)
      LocalObject(91, Door.Constructor(Vector3(1321.755f, 2448.724f, 89.54227f)), owning_building_guid = 18)
      LocalObject(92, Door.Constructor(Vector3(1324.997f, 2490.923f, 97.50627f)), owning_building_guid = 18)
      LocalObject(94, Door.Constructor(Vector3(1333.965f, 2446.379f, 89.51228f)), owning_building_guid = 18)
      LocalObject(179, Door.Constructor(Vector3(1188.142f, 2538.204f, 79.51227f)), owning_building_guid = 18)
      LocalObject(180, Door.Constructor(Vector3(1194.614f, 2542.906f, 79.51227f)), owning_building_guid = 18)
      LocalObject(181, Door.Constructor(Vector3(1201.086f, 2547.609f, 79.51227f)), owning_building_guid = 18)
      LocalObject(182, Door.Constructor(Vector3(1201.364f, 2513.2f, 79.51227f)), owning_building_guid = 18)
      LocalObject(183, Door.Constructor(Vector3(1216.356f, 2499.371f, 79.51227f)), owning_building_guid = 18)
      LocalObject(184, Door.Constructor(Vector3(1220.78f, 2527.307f, 79.51227f)), owning_building_guid = 18)
      LocalObject(185, Door.Constructor(Vector3(1222.221f, 2464.078f, 79.51227f)), owning_building_guid = 18)
      LocalObject(186, Door.Constructor(Vector3(1223.435f, 2544.069f, 79.51227f)), owning_building_guid = 18)
      LocalObject(187, Door.Constructor(Vector3(1224.875f, 2480.84f, 79.51227f)), owning_building_guid = 18)
      LocalObject(188, Door.Constructor(Vector3(1229.3f, 2508.776f, 79.51227f)), owning_building_guid = 18)
      LocalObject(189, Door.Constructor(Vector3(1229.3f, 2508.776f, 89.51228f)), owning_building_guid = 18)
      LocalObject(190, Door.Constructor(Vector3(1244.292f, 2494.947f, 79.51227f)), owning_building_guid = 18)
      LocalObject(191, Door.Constructor(Vector3(1249.601f, 2528.47f, 79.51227f)), owning_building_guid = 18)
      LocalObject(192, Door.Constructor(Vector3(1256.351f, 2498.764f, 79.51227f)), owning_building_guid = 18)
      LocalObject(193, Door.Constructor(Vector3(1256.629f, 2464.356f, 79.51227f)), owning_building_guid = 18)
      LocalObject(194, Door.Constructor(Vector3(1256.906f, 2429.948f, 82.01227f)), owning_building_guid = 18)
      LocalObject(195, Door.Constructor(Vector3(1261.661f, 2532.287f, 79.51227f)), owning_building_guid = 18)
      LocalObject(196, Door.Constructor(Vector3(1261.938f, 2497.879f, 99.51227f)), owning_building_guid = 18)
      LocalObject(197, Door.Constructor(Vector3(1263.708f, 2509.053f, 79.51227f)), owning_building_guid = 18)
      LocalObject(198, Door.Constructor(Vector3(1270.458f, 2479.348f, 79.51227f)), owning_building_guid = 18)
      LocalObject(199, Door.Constructor(Vector3(1270.736f, 2444.939f, 82.01227f)), owning_building_guid = 18)
      LocalObject(200, Door.Constructor(Vector3(1271.065f, 2519.343f, 72.01227f)), owning_building_guid = 18)
      LocalObject(201, Door.Constructor(Vector3(1296.017f, 2423.753f, 82.01227f)), owning_building_guid = 18)
      LocalObject(248, Door.Constructor(Vector3(1242.486f, 2524.639f, 90.27427f)), owning_building_guid = 18)
      LocalObject(251, Door.Constructor(Vector3(1246.062f, 2506.121f, 89.51027f)), owning_building_guid = 18)
      LocalObject(252, Door.Constructor(Vector3(1263.708f, 2509.053f, 89.51228f)), owning_building_guid = 18)
      LocalObject(733, Door.Constructor(Vector3(1245.84f, 2521.182f, 79.84528f)), owning_building_guid = 18)
      LocalObject(734, Door.Constructor(Vector3(1250.124f, 2515.285f, 79.84528f)), owning_building_guid = 18)
      LocalObject(735, Door.Constructor(Vector3(1254.411f, 2509.385f, 79.84528f)), owning_building_guid = 18)
      LocalObject(
        260,
        IFFLock.Constructor(Vector3(1238.27f, 2524.961f, 89.47327f), Vector3(0, 0, 324)),
        owning_building_guid = 18,
        door_guid = 248
      )
      LocalObject(
        267,
        IFFLock.Constructor(Vector3(1188.306f, 2536.38f, 79.32727f), Vector3(0, 0, 234)),
        owning_building_guid = 18,
        door_guid = 179
      )
      LocalObject(
        268,
        IFFLock.Constructor(Vector3(1194.348f, 2544.656f, 79.32727f), Vector3(0, 0, 54)),
        owning_building_guid = 18,
        door_guid = 180
      )
      LocalObject(
        269,
        IFFLock.Constructor(Vector3(1228.758f, 2510.907f, 99.44327f), Vector3(0, 0, 54)),
        owning_building_guid = 18,
        door_guid = 87
      )
      LocalObject(
        270,
        IFFLock.Constructor(Vector3(1247.854f, 2528.201f, 79.32727f), Vector3(0, 0, 324)),
        owning_building_guid = 18,
        door_guid = 191
      )
      LocalObject(
        271,
        IFFLock.Constructor(Vector3(1253.254f, 2506.351f, 99.44327f), Vector3(0, 0, 324)),
        owning_building_guid = 18,
        door_guid = 88
      )
      LocalObject(
        272,
        IFFLock.Constructor(Vector3(1265.456f, 2509.322f, 79.32727f), Vector3(0, 0, 144)),
        owning_building_guid = 18,
        door_guid = 197
      )
      LocalObject(
        273,
        IFFLock.Constructor(Vector3(1271.334f, 2517.595f, 71.82727f), Vector3(0, 0, 234)),
        owning_building_guid = 18,
        door_guid = 200
      )
      LocalObject(
        274,
        IFFLock.Constructor(Vector3(1333.423f, 2448.51f, 89.44328f), Vector3(0, 0, 54)),
        owning_building_guid = 18,
        door_guid = 94
      )
      LocalObject(343, Locker.Constructor(Vector3(1238.128f, 2557.867f, 77.98627f)), owning_building_guid = 18)
      LocalObject(344, Locker.Constructor(Vector3(1238.864f, 2556.854f, 77.98627f)), owning_building_guid = 18)
      LocalObject(345, Locker.Constructor(Vector3(1239.605f, 2555.833f, 77.98627f)), owning_building_guid = 18)
      LocalObject(346, Locker.Constructor(Vector3(1240.347f, 2554.813f, 77.98627f)), owning_building_guid = 18)
      LocalObject(347, Locker.Constructor(Vector3(1241.085f, 2553.797f, 77.98627f)), owning_building_guid = 18)
      LocalObject(348, Locker.Constructor(Vector3(1265.332f, 2512.88f, 78.25227f)), owning_building_guid = 18)
      LocalObject(349, Locker.Constructor(Vector3(1266.274f, 2513.564f, 78.25227f)), owning_building_guid = 18)
      LocalObject(350, Locker.Constructor(Vector3(1267.202f, 2514.238f, 78.25227f)), owning_building_guid = 18)
      LocalObject(351, Locker.Constructor(Vector3(1267.404f, 2539.378f, 77.89927f)), owning_building_guid = 18)
      LocalObject(352, Locker.Constructor(Vector3(1268.131f, 2514.914f, 78.25227f)), owning_building_guid = 18)
      LocalObject(353, Locker.Constructor(Vector3(1268.256f, 2539.998f, 77.89927f)), owning_building_guid = 18)
      LocalObject(354, Locker.Constructor(Vector3(1269.115f, 2540.621f, 77.89927f)), owning_building_guid = 18)
      LocalObject(355, Locker.Constructor(Vector3(1269.968f, 2541.241f, 77.89927f)), owning_building_guid = 18)
      LocalObject(356, Locker.Constructor(Vector3(1270.822f, 2541.861f, 77.89927f)), owning_building_guid = 18)
      LocalObject(357, Locker.Constructor(Vector3(1271.676f, 2542.482f, 77.89927f)), owning_building_guid = 18)
      LocalObject(358, Locker.Constructor(Vector3(1279.162f, 2523.199f, 77.89927f)), owning_building_guid = 18)
      LocalObject(359, Locker.Constructor(Vector3(1280.017f, 2523.819f, 77.89927f)), owning_building_guid = 18)
      LocalObject(360, Locker.Constructor(Vector3(1280.87f, 2524.439f, 77.89927f)), owning_building_guid = 18)
      LocalObject(361, Locker.Constructor(Vector3(1281.724f, 2525.06f, 77.89927f)), owning_building_guid = 18)
      LocalObject(362, Locker.Constructor(Vector3(1282.581f, 2525.683f, 77.89927f)), owning_building_guid = 18)
      LocalObject(363, Locker.Constructor(Vector3(1283.435f, 2526.303f, 77.89927f)), owning_building_guid = 18)
      LocalObject(452, Locker.Constructor(Vector3(1269.939f, 2511.128f, 87.99127f)), owning_building_guid = 18)
      LocalObject(453, Locker.Constructor(Vector3(1270.547f, 2510.292f, 87.99127f)), owning_building_guid = 18)
      LocalObject(454, Locker.Constructor(Vector3(1272.029f, 2508.251f, 87.76228f)), owning_building_guid = 18)
      LocalObject(455, Locker.Constructor(Vector3(1272.637f, 2507.415f, 87.76228f)), owning_building_guid = 18)
      LocalObject(456, Locker.Constructor(Vector3(1273.256f, 2506.562f, 87.76228f)), owning_building_guid = 18)
      LocalObject(457, Locker.Constructor(Vector3(1273.864f, 2505.725f, 87.76228f)), owning_building_guid = 18)
      LocalObject(458, Locker.Constructor(Vector3(1275.344f, 2503.689f, 87.99127f)), owning_building_guid = 18)
      LocalObject(459, Locker.Constructor(Vector3(1275.951f, 2502.853f, 87.99127f)), owning_building_guid = 18)
      LocalObject(
        60,
        Terminal.Constructor(Vector3(1223.175f, 2548.299f, 77.98127f), cert_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        61,
        Terminal.Constructor(Vector3(1223.495f, 2550.322f, 77.98127f), cert_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        62,
        Terminal.Constructor(Vector3(1227.481f, 2542.373f, 77.98127f), cert_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        63,
        Terminal.Constructor(Vector3(1229.503f, 2542.052f, 77.98127f), cert_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        64,
        Terminal.Constructor(Vector3(1233.77f, 2557.786f, 77.98127f), cert_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        65,
        Terminal.Constructor(Vector3(1235.793f, 2557.466f, 77.98127f), cert_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        66,
        Terminal.Constructor(Vector3(1239.778f, 2549.517f, 77.98127f), cert_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        67,
        Terminal.Constructor(Vector3(1240.098f, 2551.54f, 77.98127f), cert_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        503,
        Terminal.Constructor(Vector3(1240.288f, 2503.812f, 89.28627f), order_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        504,
        Terminal.Constructor(Vector3(1260.317f, 2525.042f, 79.58127f), order_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        505,
        Terminal.Constructor(Vector3(1262.544f, 2521.976f, 79.58127f), order_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        506,
        Terminal.Constructor(Vector3(1264.737f, 2518.958f, 79.58127f), order_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        712,
        Terminal.Constructor(Vector3(1215.902f, 2553.429f, 79.60427f), spawn_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        713,
        Terminal.Constructor(Vector3(1221.988f, 2478.009f, 79.60427f), spawn_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        714,
        Terminal.Constructor(Vector3(1247.545f, 2519.34f, 80.12527f), spawn_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        715,
        Terminal.Constructor(Vector3(1251.826f, 2513.442f, 80.12527f), spawn_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        716,
        Terminal.Constructor(Vector3(1256.115f, 2507.545f, 80.12527f), spawn_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        717,
        Terminal.Constructor(Vector3(1263.559f, 2492.084f, 89.57027f), spawn_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        718,
        Terminal.Constructor(Vector3(1274.246f, 2446.76f, 82.10427f), spawn_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        776,
        Terminal.Constructor(Vector3(1321.582f, 2472.999f, 90.29627f), vehicle_terminal_combined),
        owning_building_guid = 18
      )
      LocalObject(
        492,
        VehicleSpawnPad.Constructor(Vector3(1310.6f, 2464.909f, 86.13828f), mb_pad_creation, Vector3(0, 0, 234)),
        owning_building_guid = 18,
        terminal_guid = 776
      )
      LocalObject(673, ResourceSilo.Constructor(Vector3(1175.353f, 2507.716f, 95.00827f)), owning_building_guid = 18)
      LocalObject(
        678,
        SpawnTube.Constructor(Vector3(1246.103f, 2520.071f, 77.99127f), Vector3(0, 0, 324)),
        owning_building_guid = 18
      )
      LocalObject(
        679,
        SpawnTube.Constructor(Vector3(1250.386f, 2514.175f, 77.99127f), Vector3(0, 0, 324)),
        owning_building_guid = 18
      )
      LocalObject(
        680,
        SpawnTube.Constructor(Vector3(1254.672f, 2508.277f, 77.99127f), Vector3(0, 0, 324)),
        owning_building_guid = 18
      )
      LocalObject(
        51,
        ProximityTerminal.Constructor(Vector3(1259.782f, 2497.415f, 87.80127f), adv_med_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        495,
        ProximityTerminal.Constructor(Vector3(1274.04f, 2521.445f, 77.99127f), medical_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        559,
        ProximityTerminal.Constructor(Vector3(1210.411f, 2536.647f, 96.33327f), pad_landing_frame),
        owning_building_guid = 18
      )
      LocalObject(
        560,
        Terminal.Constructor(Vector3(1210.411f, 2536.647f, 96.33327f), air_rearm_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        562,
        ProximityTerminal.Constructor(Vector3(1228.471f, 2539.388f, 98.32327f), pad_landing_frame),
        owning_building_guid = 18
      )
      LocalObject(
        563,
        Terminal.Constructor(Vector3(1228.471f, 2539.388f, 98.32327f), air_rearm_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        565,
        ProximityTerminal.Constructor(Vector3(1275.75f, 2441.241f, 98.28427f), pad_landing_frame),
        owning_building_guid = 18
      )
      LocalObject(
        566,
        Terminal.Constructor(Vector3(1275.75f, 2441.241f, 98.28427f), air_rearm_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        568,
        ProximityTerminal.Constructor(Vector3(1293.23f, 2444.938f, 96.34327f), pad_landing_frame),
        owning_building_guid = 18
      )
      LocalObject(
        569,
        Terminal.Constructor(Vector3(1293.23f, 2444.938f, 96.34327f), air_rearm_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        649,
        ProximityTerminal.Constructor(Vector3(1275.171f, 2412.506f, 87.74127f), repair_silo),
        owning_building_guid = 18
      )
      LocalObject(
        650,
        Terminal.Constructor(Vector3(1275.171f, 2412.506f, 87.74127f), ground_rearm_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        653,
        ProximityTerminal.Constructor(Vector3(1287.175f, 2545.708f, 87.74127f), repair_silo),
        owning_building_guid = 18
      )
      LocalObject(
        654,
        Terminal.Constructor(Vector3(1287.175f, 2545.708f, 87.74127f), ground_rearm_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        463,
        FacilityTurret.Constructor(Vector3(1148.768f, 2525.013f, 96.39327f), manned_turret),
        owning_building_guid = 18
      )
      TurretToWeapon(463, 5012)
      LocalObject(
        466,
        FacilityTurret.Constructor(Vector3(1223.561f, 2580.754f, 96.39327f), manned_turret),
        owning_building_guid = 18
      )
      TurretToWeapon(466, 5013)
      LocalObject(
        467,
        FacilityTurret.Constructor(Vector3(1252.867f, 2381.747f, 96.39327f), manned_turret),
        owning_building_guid = 18
      )
      TurretToWeapon(467, 5014)
      LocalObject(
        468,
        FacilityTurret.Constructor(Vector3(1283.807f, 2571.24f, 96.39327f), manned_turret),
        owning_building_guid = 18
      )
      TurretToWeapon(468, 5015)
      LocalObject(
        469,
        FacilityTurret.Constructor(Vector3(1362.272f, 2461.224f, 96.39327f), manned_turret),
        owning_building_guid = 18
      )
      TurretToWeapon(469, 5016)
      LocalObject(
        255,
        ImplantTerminalMech.Constructor(Vector3(1227.029f, 2556.227f, 77.46827f)),
        owning_building_guid = 18
      )
      LocalObject(
        253,
        Terminal.Constructor(Vector3(1227.04f, 2556.213f, 77.46827f), implant_terminal_interface),
        owning_building_guid = 18
      )
      TerminalToInterface(255, 253)
      LocalObject(
        256,
        ImplantTerminalMech.Constructor(Vector3(1236.065f, 2543.811f, 77.46827f)),
        owning_building_guid = 18
      )
      LocalObject(
        254,
        Terminal.Constructor(Vector3(1236.054f, 2543.826f, 77.46827f), implant_terminal_interface),
        owning_building_guid = 18
      )
      TerminalToInterface(256, 254)
      LocalObject(
        604,
        Painbox.Constructor(Vector3(1270.085f, 2489.377f, 102.0201f), painbox),
        owning_building_guid = 18
      )
      LocalObject(
        607,
        Painbox.Constructor(Vector3(1261.402f, 2516.91f, 82.06117f), painbox_continuous),
        owning_building_guid = 18
      )
      LocalObject(
        610,
        Painbox.Constructor(Vector3(1260.441f, 2500.25f, 102.2252f), painbox_door_radius),
        owning_building_guid = 18
      )
      LocalObject(
        613,
        Painbox.Constructor(Vector3(1248.942f, 2530.254f, 79.70547f), painbox_door_radius_continuous),
        owning_building_guid = 18
      )
      LocalObject(
        614,
        Painbox.Constructor(Vector3(1263.824f, 2506.41f, 80.34717f), painbox_door_radius_continuous),
        owning_building_guid = 18
      )
      LocalObject(
        615,
        Painbox.Constructor(Vector3(1265.359f, 2533.8f, 81.53217f), painbox_door_radius_continuous),
        owning_building_guid = 18
      )
      LocalObject(76, Generator.Constructor(Vector3(1271.102f, 2485.31f, 96.69727f)), owning_building_guid = 18)
      LocalObject(
        73,
        Terminal.Constructor(Vector3(1266.248f, 2491.909f, 97.99127f), gen_control),
        owning_building_guid = 18
      )
    }

    Building9()

    def Building9(): Unit = { // Name: Red_Gun_Tower Type: tower_a GUID: 21, MapID: 9
      LocalBuilding(
        "Red_Gun_Tower",
        21,
        9,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(1876f, 2092f, 89.83428f), Vector3(0f, 0f, 59f), tower_a)
        )
      )
      LocalObject(
        705,
        CaptureTerminal.Constructor(Vector3(1884.631f, 2106.165f, 99.83328f), secondary_capture),
        owning_building_guid = 21
      )
      LocalObject(118, Door.Constructor(Vector3(1875.323f, 2106.406f, 91.35529f)), owning_building_guid = 21)
      LocalObject(119, Door.Constructor(Vector3(1875.323f, 2106.406f, 111.3543f)), owning_building_guid = 21)
      LocalObject(120, Door.Constructor(Vector3(1889.038f, 2098.166f, 91.35529f)), owning_building_guid = 21)
      LocalObject(121, Door.Constructor(Vector3(1889.038f, 2098.166f, 111.3543f)), owning_building_guid = 21)
      LocalObject(741, Door.Constructor(Vector3(1877.28f, 2104.234f, 81.17028f)), owning_building_guid = 21)
      LocalObject(742, Door.Constructor(Vector3(1891.346f, 2095.782f, 81.17028f)), owning_building_guid = 21)
      LocalObject(
        292,
        IFFLock.Constructor(Vector3(1873.576f, 2105.073f, 91.29528f), Vector3(0, 0, 301)),
        owning_building_guid = 21,
        door_guid = 118
      )
      LocalObject(
        293,
        IFFLock.Constructor(Vector3(1873.576f, 2105.073f, 111.2953f), Vector3(0, 0, 301)),
        owning_building_guid = 21,
        door_guid = 119
      )
      LocalObject(
        294,
        IFFLock.Constructor(Vector3(1890.787f, 2099.503f, 91.29528f), Vector3(0, 0, 121)),
        owning_building_guid = 21,
        door_guid = 120
      )
      LocalObject(
        295,
        IFFLock.Constructor(Vector3(1890.787f, 2099.503f, 111.2953f), Vector3(0, 0, 121)),
        owning_building_guid = 21,
        door_guid = 121
      )
      LocalObject(384, Locker.Constructor(Vector3(1878.254f, 2109.021f, 79.82829f)), owning_building_guid = 21)
      LocalObject(385, Locker.Constructor(Vector3(1878.942f, 2110.167f, 79.82829f)), owning_building_guid = 21)
      LocalObject(386, Locker.Constructor(Vector3(1880.309f, 2112.442f, 79.82829f)), owning_building_guid = 21)
      LocalObject(387, Locker.Constructor(Vector3(1881.031f, 2113.644f, 79.82829f)), owning_building_guid = 21)
      LocalObject(388, Locker.Constructor(Vector3(1896.984f, 2097.727f, 79.82829f)), owning_building_guid = 21)
      LocalObject(389, Locker.Constructor(Vector3(1897.672f, 2098.873f, 79.82829f)), owning_building_guid = 21)
      LocalObject(390, Locker.Constructor(Vector3(1899.057f, 2101.177f, 79.82829f)), owning_building_guid = 21)
      LocalObject(391, Locker.Constructor(Vector3(1899.779f, 2102.378f, 79.82829f)), owning_building_guid = 21)
      LocalObject(
        517,
        Terminal.Constructor(Vector3(1885.987f, 2111.018f, 81.16628f), order_terminal),
        owning_building_guid = 21
      )
      LocalObject(
        518,
        Terminal.Constructor(Vector3(1890.6f, 2108.246f, 81.16628f), order_terminal),
        owning_building_guid = 21
      )
      LocalObject(
        519,
        Terminal.Constructor(Vector3(1895.506f, 2105.298f, 81.16628f), order_terminal),
        owning_building_guid = 21
      )
      LocalObject(
        686,
        SpawnTube.Constructor(Vector3(1877.955f, 2103.315f, 79.31628f), respawn_tube_tower, Vector3(0, 0, 301)),
        owning_building_guid = 21
      )
      LocalObject(
        687,
        SpawnTube.Constructor(Vector3(1892.021f, 2094.864f, 79.31628f), respawn_tube_tower, Vector3(0, 0, 301)),
        owning_building_guid = 21
      )
      LocalObject(
        476,
        FacilityTurret.Constructor(Vector3(1876.772f, 2117.957f, 108.7763f), manned_turret),
        owning_building_guid = 21
      )
      TurretToWeapon(476, 5017)
      LocalObject(
        477,
        FacilityTurret.Constructor(Vector3(1880.36f, 2074.587f, 108.7763f), manned_turret),
        owning_building_guid = 21
      )
      TurretToWeapon(477, 5018)
      LocalObject(
        628,
        Painbox.Constructor(Vector3(1882.91f, 2107.551f, 79.93428f), painbox_radius_continuous),
        owning_building_guid = 21
      )
      LocalObject(
        629,
        Painbox.Constructor(Vector3(1884.008f, 2093.295f, 81.33338f), painbox_radius_continuous),
        owning_building_guid = 21
      )
      LocalObject(
        630,
        Painbox.Constructor(Vector3(1893.124f, 2101.515f, 79.93428f), painbox_radius_continuous),
        owning_building_guid = 21
      )
    }

    Building12()

    def Building12(): Unit = { // Name: Indigo_Gun_Tower Type: tower_a GUID: 22, MapID: 12
      LocalBuilding(
        "Indigo_Gun_Tower",
        22,
        12,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(2062f, 1728f, 90.51912f), Vector3(0f, 0f, 360f), tower_a)
        )
      )
      LocalObject(
        707,
        CaptureTerminal.Constructor(Vector3(2078.587f, 1727.897f, 100.5181f), secondary_capture),
        owning_building_guid = 22
      )
      LocalObject(128, Door.Constructor(Vector3(2074f, 1720f, 92.04012f)), owning_building_guid = 22)
      LocalObject(129, Door.Constructor(Vector3(2074f, 1720f, 112.0391f)), owning_building_guid = 22)
      LocalObject(130, Door.Constructor(Vector3(2074f, 1736f, 92.04012f)), owning_building_guid = 22)
      LocalObject(131, Door.Constructor(Vector3(2074f, 1736f, 112.0391f)), owning_building_guid = 22)
      LocalObject(745, Door.Constructor(Vector3(2073.146f, 1716.794f, 81.85512f)), owning_building_guid = 22)
      LocalObject(746, Door.Constructor(Vector3(2073.146f, 1733.204f, 81.85512f)), owning_building_guid = 22)
      LocalObject(
        300,
        IFFLock.Constructor(Vector3(2071.957f, 1736.811f, 91.98012f), Vector3(0, 0, 0)),
        owning_building_guid = 22,
        door_guid = 130
      )
      LocalObject(
        301,
        IFFLock.Constructor(Vector3(2071.957f, 1736.811f, 111.9801f), Vector3(0, 0, 0)),
        owning_building_guid = 22,
        door_guid = 131
      )
      LocalObject(
        302,
        IFFLock.Constructor(Vector3(2076.047f, 1719.189f, 91.98012f), Vector3(0, 0, 180)),
        owning_building_guid = 22,
        door_guid = 128
      )
      LocalObject(
        303,
        IFFLock.Constructor(Vector3(2076.047f, 1719.189f, 111.9801f), Vector3(0, 0, 180)),
        owning_building_guid = 22,
        door_guid = 129
      )
      LocalObject(400, Locker.Constructor(Vector3(2077.716f, 1712.963f, 80.51312f)), owning_building_guid = 22)
      LocalObject(401, Locker.Constructor(Vector3(2077.751f, 1734.835f, 80.51312f)), owning_building_guid = 22)
      LocalObject(402, Locker.Constructor(Vector3(2079.053f, 1712.963f, 80.51312f)), owning_building_guid = 22)
      LocalObject(403, Locker.Constructor(Vector3(2079.088f, 1734.835f, 80.51312f)), owning_building_guid = 22)
      LocalObject(404, Locker.Constructor(Vector3(2081.741f, 1712.963f, 80.51312f)), owning_building_guid = 22)
      LocalObject(405, Locker.Constructor(Vector3(2081.741f, 1734.835f, 80.51312f)), owning_building_guid = 22)
      LocalObject(406, Locker.Constructor(Vector3(2083.143f, 1712.963f, 80.51312f)), owning_building_guid = 22)
      LocalObject(407, Locker.Constructor(Vector3(2083.143f, 1734.835f, 80.51312f)), owning_building_guid = 22)
      LocalObject(
        523,
        Terminal.Constructor(Vector3(2083.445f, 1718.129f, 81.85112f), order_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        524,
        Terminal.Constructor(Vector3(2083.445f, 1723.853f, 81.85112f), order_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        525,
        Terminal.Constructor(Vector3(2083.445f, 1729.234f, 81.85112f), order_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        690,
        SpawnTube.Constructor(Vector3(2072.706f, 1715.742f, 80.00112f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 22
      )
      LocalObject(
        691,
        SpawnTube.Constructor(Vector3(2072.706f, 1732.152f, 80.00112f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 22
      )
      LocalObject(
        480,
        FacilityTurret.Constructor(Vector3(2049.32f, 1715.295f, 109.4611f), manned_turret),
        owning_building_guid = 22
      )
      TurretToWeapon(480, 5019)
      LocalObject(
        481,
        FacilityTurret.Constructor(Vector3(2084.647f, 1740.707f, 109.4611f), manned_turret),
        owning_building_guid = 22
      )
      TurretToWeapon(481, 5020)
      LocalObject(
        634,
        Painbox.Constructor(Vector3(2067.235f, 1721.803f, 82.01822f), painbox_radius_continuous),
        owning_building_guid = 22
      )
      LocalObject(
        635,
        Painbox.Constructor(Vector3(2078.889f, 1730.086f, 80.61912f), painbox_radius_continuous),
        owning_building_guid = 22
      )
      LocalObject(
        636,
        Painbox.Constructor(Vector3(2078.975f, 1718.223f, 80.61912f), painbox_radius_continuous),
        owning_building_guid = 22
      )
    }

    Building13()

    def Building13(): Unit = { // Name: Blue_Gun_Tower Type: tower_a GUID: 23, MapID: 13
      LocalBuilding(
        "Blue_Gun_Tower",
        23,
        13,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(2214f, 2124f, 90.3177f), Vector3(0f, 0f, 305f), tower_a)
        )
      )
      LocalObject(
        708,
        CaptureTerminal.Constructor(Vector3(2223.43f, 2110.354f, 100.3167f), secondary_capture),
        owning_building_guid = 23
      )
      LocalObject(134, Door.Constructor(Vector3(2214.33f, 2109.582f, 91.8387f)), owning_building_guid = 23)
      LocalObject(135, Door.Constructor(Vector3(2214.33f, 2109.582f, 111.8377f)), owning_building_guid = 23)
      LocalObject(136, Door.Constructor(Vector3(2227.436f, 2118.759f, 91.8387f)), owning_building_guid = 23)
      LocalObject(137, Door.Constructor(Vector3(2227.436f, 2118.759f, 111.8377f)), owning_building_guid = 23)
      LocalObject(747, Door.Constructor(Vector3(2211.214f, 2108.442f, 81.65369f)), owning_building_guid = 23)
      LocalObject(748, Door.Constructor(Vector3(2224.656f, 2117.854f, 81.65369f)), owning_building_guid = 23)
      LocalObject(
        304,
        IFFLock.Constructor(Vector3(2214.839f, 2107.439f, 91.77869f), Vector3(0, 0, 235)),
        owning_building_guid = 23,
        door_guid = 134
      )
      LocalObject(
        305,
        IFFLock.Constructor(Vector3(2214.839f, 2107.439f, 111.7787f), Vector3(0, 0, 235)),
        owning_building_guid = 23,
        door_guid = 135
      )
      LocalObject(
        306,
        IFFLock.Constructor(Vector3(2226.929f, 2120.897f, 91.77869f), Vector3(0, 0, 55)),
        owning_building_guid = 23,
        door_guid = 136
      )
      LocalObject(
        307,
        IFFLock.Constructor(Vector3(2226.929f, 2120.897f, 111.7787f), Vector3(0, 0, 55)),
        owning_building_guid = 23,
        door_guid = 137
      )
      LocalObject(408, Locker.Constructor(Vector3(2210.697f, 2102.501f, 80.3117f)), owning_building_guid = 23)
      LocalObject(409, Locker.Constructor(Vector3(2211.464f, 2101.406f, 80.3117f)), owning_building_guid = 23)
      LocalObject(410, Locker.Constructor(Vector3(2213.005f, 2099.204f, 80.3117f)), owning_building_guid = 23)
      LocalObject(411, Locker.Constructor(Vector3(2213.81f, 2098.056f, 80.3117f)), owning_building_guid = 23)
      LocalObject(412, Locker.Constructor(Vector3(2228.633f, 2115.018f, 80.3117f)), owning_building_guid = 23)
      LocalObject(413, Locker.Constructor(Vector3(2229.4f, 2113.923f, 80.3117f)), owning_building_guid = 23)
      LocalObject(414, Locker.Constructor(Vector3(2230.922f, 2111.75f, 80.3117f)), owning_building_guid = 23)
      LocalObject(415, Locker.Constructor(Vector3(2231.726f, 2110.601f, 80.3117f)), owning_building_guid = 23)
      LocalObject(
        526,
        Terminal.Constructor(Vector3(2218.214f, 2100.771f, 81.6497f), order_terminal),
        owning_building_guid = 23
      )
      LocalObject(
        527,
        Terminal.Constructor(Vector3(2222.903f, 2104.055f, 81.6497f), order_terminal),
        owning_building_guid = 23
      )
      LocalObject(
        528,
        Terminal.Constructor(Vector3(2227.311f, 2107.141f, 81.6497f), order_terminal),
        owning_building_guid = 23
      )
      LocalObject(
        692,
        SpawnTube.Constructor(Vector3(2210.1f, 2108.199f, 79.7997f), respawn_tube_tower, Vector3(0, 0, 55)),
        owning_building_guid = 23
      )
      LocalObject(
        693,
        SpawnTube.Constructor(Vector3(2223.542f, 2117.612f, 79.7997f), respawn_tube_tower, Vector3(0, 0, 55)),
        owning_building_guid = 23
      )
      LocalObject(
        482,
        FacilityTurret.Constructor(Vector3(2196.32f, 2127.1f, 109.2597f), manned_turret),
        owning_building_guid = 23
      )
      TurretToWeapon(482, 5021)
      LocalObject(
        483,
        FacilityTurret.Constructor(Vector3(2237.399f, 2112.737f, 109.2597f), manned_turret),
        owning_building_guid = 23
      )
      TurretToWeapon(483, 5022)
      LocalObject(
        637,
        Painbox.Constructor(Vector3(2211.926f, 2116.157f, 81.8168f), painbox_radius_continuous),
        owning_building_guid = 23
      )
      LocalObject(
        638,
        Painbox.Constructor(Vector3(2215.727f, 2104.487f, 80.41769f), painbox_radius_continuous),
        owning_building_guid = 23
      )
      LocalObject(
        639,
        Painbox.Constructor(Vector3(2225.396f, 2111.362f, 80.41769f), painbox_radius_continuous),
        owning_building_guid = 23
      )
    }

    Building15()

    def Building15(): Unit = { // Name: Red_Watch_Tower Type: tower_b GUID: 24, MapID: 15
      LocalBuilding(
        "Red_Watch_Tower",
        24,
        15,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(1488f, 2084f, 90.30762f), Vector3(0f, 0f, 336f), tower_b)
        )
      )
      LocalObject(
        704,
        CaptureTerminal.Constructor(Vector3(1503.111f, 2077.159f, 110.3066f), secondary_capture),
        owning_building_guid = 24
      )
      LocalObject(103, Door.Constructor(Vector3(1495.709f, 2071.811f, 91.82762f)), owning_building_guid = 24)
      LocalObject(104, Door.Constructor(Vector3(1495.709f, 2071.811f, 101.8276f)), owning_building_guid = 24)
      LocalObject(105, Door.Constructor(Vector3(1495.709f, 2071.811f, 121.8276f)), owning_building_guid = 24)
      LocalObject(107, Door.Constructor(Vector3(1502.216f, 2086.427f, 91.82762f)), owning_building_guid = 24)
      LocalObject(108, Door.Constructor(Vector3(1502.216f, 2086.427f, 101.8276f)), owning_building_guid = 24)
      LocalObject(109, Door.Constructor(Vector3(1502.216f, 2086.427f, 121.8276f)), owning_building_guid = 24)
      LocalObject(739, Door.Constructor(Vector3(1493.625f, 2069.229f, 81.64362f)), owning_building_guid = 24)
      LocalObject(740, Door.Constructor(Vector3(1500.3f, 2084.22f, 81.64362f)), owning_building_guid = 24)
      LocalObject(
        286,
        IFFLock.Constructor(Vector3(1497.249f, 2070.237f, 91.76862f), Vector3(0, 0, 204)),
        owning_building_guid = 24,
        door_guid = 103
      )
      LocalObject(
        287,
        IFFLock.Constructor(Vector3(1497.249f, 2070.237f, 101.7686f), Vector3(0, 0, 204)),
        owning_building_guid = 24,
        door_guid = 104
      )
      LocalObject(
        288,
        IFFLock.Constructor(Vector3(1497.249f, 2070.237f, 121.7686f), Vector3(0, 0, 204)),
        owning_building_guid = 24,
        door_guid = 105
      )
      LocalObject(
        289,
        IFFLock.Constructor(Vector3(1500.68f, 2088f, 91.76862f), Vector3(0, 0, 24)),
        owning_building_guid = 24,
        door_guid = 107
      )
      LocalObject(
        290,
        IFFLock.Constructor(Vector3(1500.68f, 2088f, 101.7686f), Vector3(0, 0, 24)),
        owning_building_guid = 24,
        door_guid = 108
      )
      LocalObject(
        291,
        IFFLock.Constructor(Vector3(1500.68f, 2088f, 121.7686f), Vector3(0, 0, 24)),
        owning_building_guid = 24,
        door_guid = 109
      )
      LocalObject(376, Locker.Constructor(Vector3(1496.241f, 2063.871f, 80.30163f)), owning_building_guid = 24)
      LocalObject(377, Locker.Constructor(Vector3(1497.463f, 2063.327f, 80.30163f)), owning_building_guid = 24)
      LocalObject(378, Locker.Constructor(Vector3(1499.918f, 2062.234f, 80.30163f)), owning_building_guid = 24)
      LocalObject(379, Locker.Constructor(Vector3(1501.199f, 2061.663f, 80.30163f)), owning_building_guid = 24)
      LocalObject(380, Locker.Constructor(Vector3(1505.169f, 2083.837f, 80.30163f)), owning_building_guid = 24)
      LocalObject(381, Locker.Constructor(Vector3(1506.391f, 2083.294f, 80.30163f)), owning_building_guid = 24)
      LocalObject(382, Locker.Constructor(Vector3(1508.814f, 2082.215f, 80.30163f)), owning_building_guid = 24)
      LocalObject(383, Locker.Constructor(Vector3(1510.095f, 2081.645f, 80.30163f)), owning_building_guid = 24)
      LocalObject(
        513,
        Terminal.Constructor(Vector3(1503.577f, 2066.26f, 81.63963f), order_terminal),
        owning_building_guid = 24
      )
      LocalObject(
        514,
        Terminal.Constructor(Vector3(1505.905f, 2071.489f, 81.63963f), order_terminal),
        owning_building_guid = 24
      )
      LocalObject(
        516,
        Terminal.Constructor(Vector3(1508.094f, 2076.404f, 81.63963f), order_terminal),
        owning_building_guid = 24
      )
      LocalObject(
        684,
        SpawnTube.Constructor(Vector3(1492.795f, 2068.447f, 79.78963f), respawn_tube_tower, Vector3(0, 0, 24)),
        owning_building_guid = 24
      )
      LocalObject(
        685,
        SpawnTube.Constructor(Vector3(1499.469f, 2083.438f, 79.78963f), respawn_tube_tower, Vector3(0, 0, 24)),
        owning_building_guid = 24
      )
      LocalObject(
        625,
        Painbox.Constructor(Vector3(1490.109f, 2075.233f, 81.59702f), painbox_radius_continuous),
        owning_building_guid = 24
      )
      LocalObject(
        626,
        Painbox.Constructor(Vector3(1499.611f, 2067.969f, 80.40762f), painbox_radius_continuous),
        owning_building_guid = 24
      )
      LocalObject(
        627,
        Painbox.Constructor(Vector3(1504.624f, 2078.905f, 80.40762f), painbox_radius_continuous),
        owning_building_guid = 24
      )
    }

    Building17()

    def Building17(): Unit = { // Name: Blue_Watch_Tower Type: tower_b GUID: 25, MapID: 17
      LocalBuilding(
        "Blue_Watch_Tower",
        25,
        17,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(2366f, 2560f, 86.32954f), Vector3(0f, 0f, 360f), tower_b)
        )
      )
      LocalObject(
        709,
        CaptureTerminal.Constructor(Vector3(2382.587f, 2559.897f, 106.3285f), secondary_capture),
        owning_building_guid = 25
      )
      LocalObject(142, Door.Constructor(Vector3(2378f, 2552f, 87.84953f)), owning_building_guid = 25)
      LocalObject(143, Door.Constructor(Vector3(2378f, 2552f, 97.84953f)), owning_building_guid = 25)
      LocalObject(144, Door.Constructor(Vector3(2378f, 2552f, 117.8495f)), owning_building_guid = 25)
      LocalObject(145, Door.Constructor(Vector3(2378f, 2568f, 87.84953f)), owning_building_guid = 25)
      LocalObject(146, Door.Constructor(Vector3(2378f, 2568f, 97.84953f)), owning_building_guid = 25)
      LocalObject(147, Door.Constructor(Vector3(2378f, 2568f, 117.8495f)), owning_building_guid = 25)
      LocalObject(749, Door.Constructor(Vector3(2377.147f, 2548.794f, 77.66553f)), owning_building_guid = 25)
      LocalObject(750, Door.Constructor(Vector3(2377.147f, 2565.204f, 77.66553f)), owning_building_guid = 25)
      LocalObject(
        308,
        IFFLock.Constructor(Vector3(2375.957f, 2568.811f, 87.79053f), Vector3(0, 0, 0)),
        owning_building_guid = 25,
        door_guid = 145
      )
      LocalObject(
        309,
        IFFLock.Constructor(Vector3(2375.957f, 2568.811f, 97.79053f), Vector3(0, 0, 0)),
        owning_building_guid = 25,
        door_guid = 146
      )
      LocalObject(
        310,
        IFFLock.Constructor(Vector3(2375.957f, 2568.811f, 117.7905f), Vector3(0, 0, 0)),
        owning_building_guid = 25,
        door_guid = 147
      )
      LocalObject(
        311,
        IFFLock.Constructor(Vector3(2380.047f, 2551.189f, 87.79053f), Vector3(0, 0, 180)),
        owning_building_guid = 25,
        door_guid = 142
      )
      LocalObject(
        312,
        IFFLock.Constructor(Vector3(2380.047f, 2551.189f, 97.79053f), Vector3(0, 0, 180)),
        owning_building_guid = 25,
        door_guid = 143
      )
      LocalObject(
        313,
        IFFLock.Constructor(Vector3(2380.047f, 2551.189f, 117.7905f), Vector3(0, 0, 180)),
        owning_building_guid = 25,
        door_guid = 144
      )
      LocalObject(416, Locker.Constructor(Vector3(2381.716f, 2544.963f, 76.32354f)), owning_building_guid = 25)
      LocalObject(417, Locker.Constructor(Vector3(2381.751f, 2566.835f, 76.32354f)), owning_building_guid = 25)
      LocalObject(418, Locker.Constructor(Vector3(2383.053f, 2544.963f, 76.32354f)), owning_building_guid = 25)
      LocalObject(419, Locker.Constructor(Vector3(2383.088f, 2566.835f, 76.32354f)), owning_building_guid = 25)
      LocalObject(420, Locker.Constructor(Vector3(2385.741f, 2544.963f, 76.32354f)), owning_building_guid = 25)
      LocalObject(421, Locker.Constructor(Vector3(2385.741f, 2566.835f, 76.32354f)), owning_building_guid = 25)
      LocalObject(422, Locker.Constructor(Vector3(2387.143f, 2544.963f, 76.32354f)), owning_building_guid = 25)
      LocalObject(423, Locker.Constructor(Vector3(2387.143f, 2566.835f, 76.32354f)), owning_building_guid = 25)
      LocalObject(
        529,
        Terminal.Constructor(Vector3(2387.446f, 2550.129f, 77.66154f), order_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        530,
        Terminal.Constructor(Vector3(2387.446f, 2555.853f, 77.66154f), order_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        531,
        Terminal.Constructor(Vector3(2387.446f, 2561.234f, 77.66154f), order_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        694,
        SpawnTube.Constructor(Vector3(2376.706f, 2547.742f, 75.81154f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 25
      )
      LocalObject(
        695,
        SpawnTube.Constructor(Vector3(2376.706f, 2564.152f, 75.81154f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 25
      )
      LocalObject(
        640,
        Painbox.Constructor(Vector3(2371.493f, 2552.849f, 77.61893f), painbox_radius_continuous),
        owning_building_guid = 25
      )
      LocalObject(
        641,
        Painbox.Constructor(Vector3(2383.127f, 2550.078f, 76.42953f), painbox_radius_continuous),
        owning_building_guid = 25
      )
      LocalObject(
        642,
        Painbox.Constructor(Vector3(2383.259f, 2562.107f, 76.42953f), painbox_radius_continuous),
        owning_building_guid = 25
      )
    }

    Building16()

    def Building16(): Unit = { // Name: Indigo_Watch_Tower Type: tower_b GUID: 26, MapID: 16
      LocalBuilding(
        "Indigo_Watch_Tower",
        26,
        16,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(2450f, 1678f, 82.88522f), Vector3(0f, 0f, 360f), tower_b)
        )
      )
      LocalObject(
        710,
        CaptureTerminal.Constructor(Vector3(2466.587f, 1677.897f, 102.8842f), secondary_capture),
        owning_building_guid = 26
      )
      LocalObject(149, Door.Constructor(Vector3(2462f, 1670f, 84.40522f)), owning_building_guid = 26)
      LocalObject(150, Door.Constructor(Vector3(2462f, 1670f, 94.40523f)), owning_building_guid = 26)
      LocalObject(151, Door.Constructor(Vector3(2462f, 1670f, 114.4052f)), owning_building_guid = 26)
      LocalObject(152, Door.Constructor(Vector3(2462f, 1686f, 84.40522f)), owning_building_guid = 26)
      LocalObject(153, Door.Constructor(Vector3(2462f, 1686f, 94.40523f)), owning_building_guid = 26)
      LocalObject(154, Door.Constructor(Vector3(2462f, 1686f, 114.4052f)), owning_building_guid = 26)
      LocalObject(751, Door.Constructor(Vector3(2461.147f, 1666.794f, 74.22122f)), owning_building_guid = 26)
      LocalObject(752, Door.Constructor(Vector3(2461.147f, 1683.204f, 74.22122f)), owning_building_guid = 26)
      LocalObject(
        314,
        IFFLock.Constructor(Vector3(2459.957f, 1686.811f, 84.34622f), Vector3(0, 0, 0)),
        owning_building_guid = 26,
        door_guid = 152
      )
      LocalObject(
        315,
        IFFLock.Constructor(Vector3(2459.957f, 1686.811f, 94.34622f), Vector3(0, 0, 0)),
        owning_building_guid = 26,
        door_guid = 153
      )
      LocalObject(
        316,
        IFFLock.Constructor(Vector3(2459.957f, 1686.811f, 114.3462f), Vector3(0, 0, 0)),
        owning_building_guid = 26,
        door_guid = 154
      )
      LocalObject(
        317,
        IFFLock.Constructor(Vector3(2464.047f, 1669.189f, 84.34622f), Vector3(0, 0, 180)),
        owning_building_guid = 26,
        door_guid = 149
      )
      LocalObject(
        318,
        IFFLock.Constructor(Vector3(2464.047f, 1669.189f, 94.34622f), Vector3(0, 0, 180)),
        owning_building_guid = 26,
        door_guid = 150
      )
      LocalObject(
        319,
        IFFLock.Constructor(Vector3(2464.047f, 1669.189f, 114.3462f), Vector3(0, 0, 180)),
        owning_building_guid = 26,
        door_guid = 151
      )
      LocalObject(424, Locker.Constructor(Vector3(2465.716f, 1662.963f, 72.87923f)), owning_building_guid = 26)
      LocalObject(425, Locker.Constructor(Vector3(2465.751f, 1684.835f, 72.87923f)), owning_building_guid = 26)
      LocalObject(426, Locker.Constructor(Vector3(2467.053f, 1662.963f, 72.87923f)), owning_building_guid = 26)
      LocalObject(427, Locker.Constructor(Vector3(2467.088f, 1684.835f, 72.87923f)), owning_building_guid = 26)
      LocalObject(428, Locker.Constructor(Vector3(2469.741f, 1662.963f, 72.87923f)), owning_building_guid = 26)
      LocalObject(429, Locker.Constructor(Vector3(2469.741f, 1684.835f, 72.87923f)), owning_building_guid = 26)
      LocalObject(430, Locker.Constructor(Vector3(2471.143f, 1662.963f, 72.87923f)), owning_building_guid = 26)
      LocalObject(431, Locker.Constructor(Vector3(2471.143f, 1684.835f, 72.87923f)), owning_building_guid = 26)
      LocalObject(
        532,
        Terminal.Constructor(Vector3(2471.446f, 1668.129f, 74.21722f), order_terminal),
        owning_building_guid = 26
      )
      LocalObject(
        533,
        Terminal.Constructor(Vector3(2471.446f, 1673.853f, 74.21722f), order_terminal),
        owning_building_guid = 26
      )
      LocalObject(
        534,
        Terminal.Constructor(Vector3(2471.446f, 1679.234f, 74.21722f), order_terminal),
        owning_building_guid = 26
      )
      LocalObject(
        696,
        SpawnTube.Constructor(Vector3(2460.706f, 1665.742f, 72.36723f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 26
      )
      LocalObject(
        697,
        SpawnTube.Constructor(Vector3(2460.706f, 1682.152f, 72.36723f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 26
      )
      LocalObject(
        643,
        Painbox.Constructor(Vector3(2455.493f, 1670.849f, 74.17462f), painbox_radius_continuous),
        owning_building_guid = 26
      )
      LocalObject(
        644,
        Painbox.Constructor(Vector3(2467.127f, 1668.078f, 72.98522f), painbox_radius_continuous),
        owning_building_guid = 26
      )
      LocalObject(
        645,
        Painbox.Constructor(Vector3(2467.259f, 1680.107f, 72.98522f), painbox_radius_continuous),
        owning_building_guid = 26
      )
    }

    Building10()

    def Building10(): Unit = { // Name: Red_Air_Tower Type: tower_c GUID: 27, MapID: 10
      LocalBuilding(
        "Red_Air_Tower",
        27,
        10,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(1166f, 1754f, 55.62273f), Vector3(0f, 0f, 270f), tower_c)
        )
      )
      LocalObject(
        703,
        CaptureTerminal.Constructor(Vector3(1165.897f, 1737.413f, 65.62173f), secondary_capture),
        owning_building_guid = 27
      )
      LocalObject(79, Door.Constructor(Vector3(1158f, 1742f, 57.14373f)), owning_building_guid = 27)
      LocalObject(80, Door.Constructor(Vector3(1158f, 1742f, 77.14273f)), owning_building_guid = 27)
      LocalObject(81, Door.Constructor(Vector3(1174f, 1742f, 57.14373f)), owning_building_guid = 27)
      LocalObject(82, Door.Constructor(Vector3(1174f, 1742f, 77.14273f)), owning_building_guid = 27)
      LocalObject(731, Door.Constructor(Vector3(1154.794f, 1742.854f, 46.95873f)), owning_building_guid = 27)
      LocalObject(732, Door.Constructor(Vector3(1171.204f, 1742.854f, 46.95873f)), owning_building_guid = 27)
      LocalObject(
        263,
        IFFLock.Constructor(Vector3(1157.189f, 1739.953f, 57.08373f), Vector3(0, 0, 270)),
        owning_building_guid = 27,
        door_guid = 79
      )
      LocalObject(
        264,
        IFFLock.Constructor(Vector3(1157.189f, 1739.953f, 77.08373f), Vector3(0, 0, 270)),
        owning_building_guid = 27,
        door_guid = 80
      )
      LocalObject(
        265,
        IFFLock.Constructor(Vector3(1174.811f, 1744.043f, 57.08373f), Vector3(0, 0, 90)),
        owning_building_guid = 27,
        door_guid = 81
      )
      LocalObject(
        266,
        IFFLock.Constructor(Vector3(1174.811f, 1744.043f, 77.08373f), Vector3(0, 0, 90)),
        owning_building_guid = 27,
        door_guid = 82
      )
      LocalObject(335, Locker.Constructor(Vector3(1150.963f, 1732.857f, 45.61673f)), owning_building_guid = 27)
      LocalObject(336, Locker.Constructor(Vector3(1150.963f, 1734.259f, 45.61673f)), owning_building_guid = 27)
      LocalObject(337, Locker.Constructor(Vector3(1150.963f, 1736.947f, 45.61673f)), owning_building_guid = 27)
      LocalObject(338, Locker.Constructor(Vector3(1150.963f, 1738.284f, 45.61673f)), owning_building_guid = 27)
      LocalObject(339, Locker.Constructor(Vector3(1172.835f, 1732.857f, 45.61673f)), owning_building_guid = 27)
      LocalObject(340, Locker.Constructor(Vector3(1172.835f, 1734.259f, 45.61673f)), owning_building_guid = 27)
      LocalObject(341, Locker.Constructor(Vector3(1172.835f, 1736.912f, 45.61673f)), owning_building_guid = 27)
      LocalObject(342, Locker.Constructor(Vector3(1172.835f, 1738.249f, 45.61673f)), owning_building_guid = 27)
      LocalObject(
        500,
        Terminal.Constructor(Vector3(1156.129f, 1732.555f, 46.95473f), order_terminal),
        owning_building_guid = 27
      )
      LocalObject(
        501,
        Terminal.Constructor(Vector3(1161.853f, 1732.555f, 46.95473f), order_terminal),
        owning_building_guid = 27
      )
      LocalObject(
        502,
        Terminal.Constructor(Vector3(1167.234f, 1732.555f, 46.95473f), order_terminal),
        owning_building_guid = 27
      )
      LocalObject(
        676,
        SpawnTube.Constructor(Vector3(1153.742f, 1743.294f, 45.10473f), respawn_tube_tower, Vector3(0, 0, 90)),
        owning_building_guid = 27
      )
      LocalObject(
        677,
        SpawnTube.Constructor(Vector3(1170.152f, 1743.294f, 45.10473f), respawn_tube_tower, Vector3(0, 0, 90)),
        owning_building_guid = 27
      )
      LocalObject(
        586,
        ProximityTerminal.Constructor(Vector3(1160.725f, 1755.093f, 83.19273f), pad_landing_tower_frame),
        owning_building_guid = 27
      )
      LocalObject(
        587,
        Terminal.Constructor(Vector3(1160.725f, 1755.093f, 83.19273f), air_rearm_terminal),
        owning_building_guid = 27
      )
      LocalObject(
        589,
        ProximityTerminal.Constructor(Vector3(1171.17f, 1755.093f, 83.19273f), pad_landing_tower_frame),
        owning_building_guid = 27
      )
      LocalObject(
        590,
        Terminal.Constructor(Vector3(1171.17f, 1755.093f, 83.19273f), air_rearm_terminal),
        owning_building_guid = 27
      )
      LocalObject(
        464,
        FacilityTurret.Constructor(Vector3(1151.045f, 1768.93f, 74.56473f), manned_turret),
        owning_building_guid = 27
      )
      TurretToWeapon(464, 5023)
      LocalObject(
        465,
        FacilityTurret.Constructor(Vector3(1180.957f, 1730.503f, 74.56473f), manned_turret),
        owning_building_guid = 27
      )
      TurretToWeapon(465, 5024)
      LocalObject(
        622,
        Painbox.Constructor(Vector3(1155.54f, 1737.077f, 45.72273f), painbox_radius_continuous),
        owning_building_guid = 27
      )
      LocalObject(
        623,
        Painbox.Constructor(Vector3(1158.849f, 1749.546f, 47.64223f), painbox_radius_continuous),
        owning_building_guid = 27
      )
      LocalObject(
        624,
        Painbox.Constructor(Vector3(1168.022f, 1736.887f, 45.72273f), painbox_radius_continuous),
        owning_building_guid = 27
      )
    }

    Building14()

    def Building14(): Unit = { // Name: Blue_Air_Tower Type: tower_c GUID: 28, MapID: 14
      LocalBuilding(
        "Blue_Air_Tower",
        28,
        14,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(2024f, 2914f, 64.3846f), Vector3(0f, 0f, 208f), tower_c)
        )
      )
      LocalObject(
        706,
        CaptureTerminal.Constructor(Vector3(2009.306f, 2906.304f, 74.3836f), secondary_capture),
        owning_building_guid = 28
      )
      LocalObject(124, Door.Constructor(Vector3(2009.649f, 2915.43f, 65.9056f)), owning_building_guid = 28)
      LocalObject(125, Door.Constructor(Vector3(2009.649f, 2915.43f, 85.9046f)), owning_building_guid = 28)
      LocalObject(126, Door.Constructor(Vector3(2017.16f, 2901.303f, 65.9056f)), owning_building_guid = 28)
      LocalObject(127, Door.Constructor(Vector3(2017.16f, 2901.303f, 85.9046f)), owning_building_guid = 28)
      LocalObject(743, Door.Constructor(Vector3(2008.898f, 2918.662f, 55.7206f)), owning_building_guid = 28)
      LocalObject(744, Door.Constructor(Vector3(2016.602f, 2904.172f, 55.7206f)), owning_building_guid = 28)
      LocalObject(
        296,
        IFFLock.Constructor(Vector3(2007.461f, 2915.185f, 65.8456f), Vector3(0, 0, 332)),
        owning_building_guid = 28,
        door_guid = 124
      )
      LocalObject(
        297,
        IFFLock.Constructor(Vector3(2007.461f, 2915.185f, 85.8456f), Vector3(0, 0, 332)),
        owning_building_guid = 28,
        door_guid = 125
      )
      LocalObject(
        298,
        IFFLock.Constructor(Vector3(2019.345f, 2901.546f, 65.8456f), Vector3(0, 0, 152)),
        owning_building_guid = 28,
        door_guid = 126
      )
      LocalObject(
        299,
        IFFLock.Constructor(Vector3(2019.345f, 2901.546f, 85.8456f), Vector3(0, 0, 152)),
        owning_building_guid = 28,
        door_guid = 127
      )
      LocalObject(392, Locker.Constructor(Vector3(1998.272f, 2917.351f, 54.3786f)), owning_building_guid = 28)
      LocalObject(393, Locker.Constructor(Vector3(1999.51f, 2918.009f, 54.3786f)), owning_building_guid = 28)
      LocalObject(394, Locker.Constructor(Vector3(2001.884f, 2919.271f, 54.3786f)), owning_building_guid = 28)
      LocalObject(395, Locker.Constructor(Vector3(2003.064f, 2919.899f, 54.3786f)), owning_building_guid = 28)
      LocalObject(396, Locker.Constructor(Vector3(2008.541f, 2898.039f, 54.3786f)), owning_building_guid = 28)
      LocalObject(397, Locker.Constructor(Vector3(2009.779f, 2898.697f, 54.3786f)), owning_building_guid = 28)
      LocalObject(398, Locker.Constructor(Vector3(2012.121f, 2899.943f, 54.3786f)), owning_building_guid = 28)
      LocalObject(399, Locker.Constructor(Vector3(2013.302f, 2900.57f, 54.3786f)), owning_building_guid = 28)
      LocalObject(
        520,
        Terminal.Constructor(Vector3(2000.431f, 2912.648f, 55.7166f), order_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        521,
        Terminal.Constructor(Vector3(2003.118f, 2907.594f, 55.7166f), order_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        522,
        Terminal.Constructor(Vector3(2005.645f, 2902.843f, 55.7166f), order_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        688,
        SpawnTube.Constructor(Vector3(2008.792f, 2919.797f, 53.8666f), respawn_tube_tower, Vector3(0, 0, 152)),
        owning_building_guid = 28
      )
      LocalObject(
        689,
        SpawnTube.Constructor(Vector3(2016.496f, 2905.308f, 53.8666f), respawn_tube_tower, Vector3(0, 0, 152)),
        owning_building_guid = 28
      )
      LocalObject(
        592,
        ProximityTerminal.Constructor(Vector3(2022.489f, 2919.171f, 91.9546f), pad_landing_tower_frame),
        owning_building_guid = 28
      )
      LocalObject(
        593,
        Terminal.Constructor(Vector3(2022.489f, 2919.171f, 91.9546f), air_rearm_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        595,
        ProximityTerminal.Constructor(Vector3(2027.392f, 2909.948f, 91.9546f), pad_landing_tower_frame),
        owning_building_guid = 28
      )
      LocalObject(
        596,
        Terminal.Constructor(Vector3(2027.392f, 2909.948f, 91.9546f), air_rearm_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        478,
        FacilityTurret.Constructor(Vector3(2010.275f, 2889.763f, 83.3266f), manned_turret),
        owning_building_guid = 28
      )
      TurretToWeapon(478, 5025)
      LocalObject(
        479,
        FacilityTurret.Constructor(Vector3(2030.161f, 2934.214f, 83.3266f), manned_turret),
        owning_building_guid = 28
      )
      TurretToWeapon(479, 5026)
      LocalObject(
        631,
        Painbox.Constructor(Vector3(2004.147f, 2915.291f, 54.4846f), painbox_radius_continuous),
        owning_building_guid = 28
      )
      LocalObject(
        632,
        Painbox.Constructor(Vector3(2009.84f, 2904.181f, 54.4846f), painbox_radius_continuous),
        owning_building_guid = 28
      )
      LocalObject(
        633,
        Painbox.Constructor(Vector3(2016.71f, 2918.223f, 56.4041f), painbox_radius_continuous),
        owning_building_guid = 28
      )
    }

    Building11()

    def Building11(): Unit = { // Name: Indigo_Air_Tower Type: tower_c GUID: 29, MapID: 11
      LocalBuilding(
        "Indigo_Air_Tower",
        29,
        11,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(2856f, 1380f, 67.77856f), Vector3(0f, 0f, 360f), tower_c)
        )
      )
      LocalObject(
        711,
        CaptureTerminal.Constructor(Vector3(2872.587f, 1379.897f, 77.77756f), secondary_capture),
        owning_building_guid = 29
      )
      LocalObject(171, Door.Constructor(Vector3(2868f, 1372f, 69.29956f)), owning_building_guid = 29)
      LocalObject(172, Door.Constructor(Vector3(2868f, 1372f, 89.29855f)), owning_building_guid = 29)
      LocalObject(173, Door.Constructor(Vector3(2868f, 1388f, 69.29956f)), owning_building_guid = 29)
      LocalObject(174, Door.Constructor(Vector3(2868f, 1388f, 89.29855f)), owning_building_guid = 29)
      LocalObject(756, Door.Constructor(Vector3(2867.146f, 1368.794f, 59.11456f)), owning_building_guid = 29)
      LocalObject(757, Door.Constructor(Vector3(2867.146f, 1385.204f, 59.11456f)), owning_building_guid = 29)
      LocalObject(
        330,
        IFFLock.Constructor(Vector3(2865.957f, 1388.811f, 69.23956f), Vector3(0, 0, 0)),
        owning_building_guid = 29,
        door_guid = 173
      )
      LocalObject(
        331,
        IFFLock.Constructor(Vector3(2865.957f, 1388.811f, 89.23956f), Vector3(0, 0, 0)),
        owning_building_guid = 29,
        door_guid = 174
      )
      LocalObject(
        333,
        IFFLock.Constructor(Vector3(2870.047f, 1371.189f, 69.23956f), Vector3(0, 0, 180)),
        owning_building_guid = 29,
        door_guid = 171
      )
      LocalObject(
        334,
        IFFLock.Constructor(Vector3(2870.047f, 1371.189f, 89.23956f), Vector3(0, 0, 180)),
        owning_building_guid = 29,
        door_guid = 172
      )
      LocalObject(444, Locker.Constructor(Vector3(2871.716f, 1364.963f, 57.77256f)), owning_building_guid = 29)
      LocalObject(445, Locker.Constructor(Vector3(2871.751f, 1386.835f, 57.77256f)), owning_building_guid = 29)
      LocalObject(446, Locker.Constructor(Vector3(2873.053f, 1364.963f, 57.77256f)), owning_building_guid = 29)
      LocalObject(447, Locker.Constructor(Vector3(2873.088f, 1386.835f, 57.77256f)), owning_building_guid = 29)
      LocalObject(448, Locker.Constructor(Vector3(2875.741f, 1364.963f, 57.77256f)), owning_building_guid = 29)
      LocalObject(449, Locker.Constructor(Vector3(2875.741f, 1386.835f, 57.77256f)), owning_building_guid = 29)
      LocalObject(450, Locker.Constructor(Vector3(2877.143f, 1364.963f, 57.77256f)), owning_building_guid = 29)
      LocalObject(451, Locker.Constructor(Vector3(2877.143f, 1386.835f, 57.77256f)), owning_building_guid = 29)
      LocalObject(
        541,
        Terminal.Constructor(Vector3(2877.445f, 1370.129f, 59.11056f), order_terminal),
        owning_building_guid = 29
      )
      LocalObject(
        542,
        Terminal.Constructor(Vector3(2877.445f, 1375.853f, 59.11056f), order_terminal),
        owning_building_guid = 29
      )
      LocalObject(
        543,
        Terminal.Constructor(Vector3(2877.445f, 1381.234f, 59.11056f), order_terminal),
        owning_building_guid = 29
      )
      LocalObject(
        701,
        SpawnTube.Constructor(Vector3(2866.706f, 1367.742f, 57.26056f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 29
      )
      LocalObject(
        702,
        SpawnTube.Constructor(Vector3(2866.706f, 1384.152f, 57.26056f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 29
      )
      LocalObject(
        598,
        ProximityTerminal.Constructor(Vector3(2854.907f, 1374.725f, 95.34856f), pad_landing_tower_frame),
        owning_building_guid = 29
      )
      LocalObject(
        599,
        Terminal.Constructor(Vector3(2854.907f, 1374.725f, 95.34856f), air_rearm_terminal),
        owning_building_guid = 29
      )
      LocalObject(
        601,
        ProximityTerminal.Constructor(Vector3(2854.907f, 1385.17f, 95.34856f), pad_landing_tower_frame),
        owning_building_guid = 29
      )
      LocalObject(
        602,
        Terminal.Constructor(Vector3(2854.907f, 1385.17f, 95.34856f), air_rearm_terminal),
        owning_building_guid = 29
      )
      LocalObject(
        486,
        FacilityTurret.Constructor(Vector3(2841.07f, 1365.045f, 86.72056f), manned_turret),
        owning_building_guid = 29
      )
      TurretToWeapon(486, 5027)
      LocalObject(
        488,
        FacilityTurret.Constructor(Vector3(2879.497f, 1394.957f, 86.72056f), manned_turret),
        owning_building_guid = 29
      )
      TurretToWeapon(488, 5028)
      LocalObject(
        646,
        Painbox.Constructor(Vector3(2860.454f, 1372.849f, 59.79806f), painbox_radius_continuous),
        owning_building_guid = 29
      )
      LocalObject(
        647,
        Painbox.Constructor(Vector3(2872.923f, 1369.54f, 57.87856f), painbox_radius_continuous),
        owning_building_guid = 29
      )
      LocalObject(
        648,
        Painbox.Constructor(Vector3(2873.113f, 1382.022f, 57.87856f), painbox_radius_continuous),
        owning_building_guid = 29
      )
    }

    Building10461()

    def Building10461(): Unit = { // Name: Map99_Gate_One Type: warpgate_small GUID: 30, MapID: 10461
      LocalBuilding(
        "Map99_Gate_One",
        30,
        10461,
        FoundationBuilder(WarpGate.Structure(Vector3(1198.85f, 2094.78f, 66.32f)))
      )
    }

    Building10462()

    def Building10462(): Unit = { // Name: Map99_Gate_Two Type: warpgate_small GUID: 31, MapID: 10462
      LocalBuilding(
        "Map99_Gate_Two",
        31,
        10462,
        FoundationBuilder(WarpGate.Structure(Vector3(2491.85f, 2848.95f, 62.31f)))
      )
    }

    Building10464()

    def Building10464(): Unit = { // Name: Map99_Gate_Three Type: warpgate_small GUID: 32, MapID: 10464
      LocalBuilding(
        "Map99_Gate_Three",
        32,
        10464,
        FoundationBuilder(WarpGate.Structure(Vector3(2547.98f, 1237.04f, 89.09f)))
      )
    }

    def Lattice(): Unit = {
      LatticeLink("Red_Base", "Blue_Base")
      LatticeLink("Blue_Base", "Indigo_Base")
      LatticeLink("Indigo_Base", "Red_Base")
      LatticeLink("Red_Base", "Map99_Gate_One")
      LatticeLink("Blue_Base", "Map99_Gate_Two")
      LatticeLink("Indigo_Base", "Map99_Gate_Three")
    }

    Lattice()

  }
}
