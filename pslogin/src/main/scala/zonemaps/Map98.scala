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

object Map98 { // Ascension
  val ZoneMap = new ZoneMap("map98") {
    Scale = MapScale.Dim4096
    Checksum = 3654267088L

    Building39()

    def Building39(): Unit = { // Name: Base_Charlie Type: amp_station GUID: 1, MapID: 39
      LocalBuilding(
        "Base_Charlie",
        1,
        39,
        FoundationBuilder(
          Building.Structure(
            StructureType.Facility,
            Vector3(2650f, 2280f, 90.6473f),
            Vector3(0f, 0f, 353f),
            amp_station
          )
        )
      )
      LocalObject(
        78,
        CaptureTerminal.Constructor(Vector3(2646.689f, 2280.41f, 102.1553f), capture_terminal),
        owning_building_guid = 1
      )
      LocalObject(71, Door.Constructor(Vector3(2649.38f, 2273.22f, 103.5493f)), owning_building_guid = 1)
      LocalObject(72, Door.Constructor(Vector3(2651.042f, 2286.728f, 103.5493f)), owning_building_guid = 1)
      LocalObject(188, Door.Constructor(Vector3(2575.766f, 2233.198f, 92.3983f)), owning_building_guid = 1)
      LocalObject(189, Door.Constructor(Vector3(2577.983f, 2251.255f, 100.3613f)), owning_building_guid = 1)
      LocalObject(190, Door.Constructor(Vector3(2584.316f, 2368.666f, 92.3683f)), owning_building_guid = 1)
      LocalObject(191, Door.Constructor(Vector3(2588.1f, 2333.652f, 92.3983f)), owning_building_guid = 1)
      LocalObject(192, Door.Constructor(Vector3(2590.317f, 2351.709f, 100.3613f)), owning_building_guid = 1)
      LocalObject(196, Door.Constructor(Vector3(2637.908f, 2374.363f, 92.3983f)), owning_building_guid = 1)
      LocalObject(197, Door.Constructor(Vector3(2641.975f, 2250.18f, 102.3743f)), owning_building_guid = 1)
      LocalObject(198, Door.Constructor(Vector3(2645.674f, 2244.765f, 97.3683f)), owning_building_guid = 1)
      LocalObject(199, Door.Constructor(Vector3(2649.448f, 2310.872f, 102.3743f)), owning_building_guid = 1)
      LocalObject(200, Door.Constructor(Vector3(2650.969f, 2249.076f, 102.3743f)), owning_building_guid = 1)
      LocalObject(201, Door.Constructor(Vector3(2654.327f, 2315.236f, 97.3683f)), owning_building_guid = 1)
      LocalObject(202, Door.Constructor(Vector3(2655.964f, 2372.146f, 100.3623f)), owning_building_guid = 1)
      LocalObject(203, Door.Constructor(Vector3(2657.109f, 2194.277f, 100.3623f)), owning_building_guid = 1)
      LocalObject(204, Door.Constructor(Vector3(2658.442f, 2309.769f, 102.3743f)), owning_building_guid = 1)
      LocalObject(205, Door.Constructor(Vector3(2675.165f, 2192.06f, 92.3983f)), owning_building_guid = 1)
      LocalObject(206, Door.Constructor(Vector3(2702.114f, 2210.438f, 100.3623f)), owning_building_guid = 1)
      LocalObject(207, Door.Constructor(Vector3(2704.331f, 2228.494f, 92.3983f)), owning_building_guid = 1)
      LocalObject(267, Door.Constructor(Vector3(2581.949f, 2316.566f, 84.8683f)), owning_building_guid = 1)
      LocalObject(268, Door.Constructor(Vector3(2601.87f, 2281.879f, 77.3683f)), owning_building_guid = 1)
      LocalObject(269, Door.Constructor(Vector3(2606.328f, 2285.362f, 77.3683f)), owning_building_guid = 1)
      LocalObject(270, Door.Constructor(Vector3(2616.776f, 2271.989f, 77.3683f)), owning_building_guid = 1)
      LocalObject(271, Door.Constructor(Vector3(2625.134f, 2307.233f, 84.8683f)), owning_building_guid = 1)
      LocalObject(272, Door.Constructor(Vector3(2635.165f, 2257.641f, 92.3683f)), owning_building_guid = 1)
      LocalObject(273, Door.Constructor(Vector3(2636.14f, 2265.582f, 77.3683f)), owning_building_guid = 1)
      LocalObject(274, Door.Constructor(Vector3(2636.14f, 2265.582f, 84.8683f)), owning_building_guid = 1)
      LocalObject(275, Door.Constructor(Vector3(2638.647f, 2253.184f, 92.3683f)), owning_building_guid = 1)
      LocalObject(276, Door.Constructor(Vector3(2639.064f, 2289.403f, 84.8683f)), owning_building_guid = 1)
      LocalObject(277, Door.Constructor(Vector3(2641.014f, 2305.284f, 92.3683f)), owning_building_guid = 1)
      LocalObject(278, Door.Constructor(Vector3(2644.497f, 2300.826f, 84.8683f)), owning_building_guid = 1)
      LocalObject(279, Door.Constructor(Vector3(2645.472f, 2308.766f, 92.3683f)), owning_building_guid = 1)
      LocalObject(280, Door.Constructor(Vector3(2646.972f, 2253.603f, 102.3683f)), owning_building_guid = 1)
      LocalObject(281, Door.Constructor(Vector3(2647.075f, 2256.179f, 97.3683f)), owning_building_guid = 1)
      LocalObject(282, Door.Constructor(Vector3(2647.98f, 2296.368f, 77.3683f)), owning_building_guid = 1)
      LocalObject(283, Door.Constructor(Vector3(2648.538f, 2268.089f, 77.3683f)), owning_building_guid = 1)
      LocalObject(284, Door.Constructor(Vector3(2650.487f, 2283.97f, 84.8683f)), owning_building_guid = 1)
      LocalObject(285, Door.Constructor(Vector3(2652.925f, 2303.821f, 97.3683f)), owning_building_guid = 1)
      LocalObject(286, Door.Constructor(Vector3(2653.448f, 2306.345f, 102.3683f)), owning_building_guid = 1)
      LocalObject(287, Door.Constructor(Vector3(2669.363f, 2273.592f, 92.3683f)), owning_building_guid = 1)
      LocalObject(288, Door.Constructor(Vector3(2670.338f, 2281.533f, 92.3683f)), owning_building_guid = 1)
      LocalObject(291, Door.Constructor(Vector3(2678.96f, 2276.47f, 93.1273f)), owning_building_guid = 1)
      LocalObject(891, Door.Constructor(Vector3(2629.566f, 2272.165f, 85.2013f)), owning_building_guid = 1)
      LocalObject(892, Door.Constructor(Vector3(2630.455f, 2279.404f, 85.2013f)), owning_building_guid = 1)
      LocalObject(893, Door.Constructor(Vector3(2631.343f, 2286.638f, 85.2013f)), owning_building_guid = 1)
      LocalObject(
        303,
        IFFLock.Constructor(Vector3(2682.051f, 2279.154f, 92.3273f), Vector3(0, 0, 97)),
        owning_building_guid = 1,
        door_guid = 291
      )
      LocalObject(
        367,
        IFFLock.Constructor(Vector3(2582.388f, 2369.735f, 92.3073f), Vector3(0, 0, 7)),
        owning_building_guid = 1,
        door_guid = 190
      )
      LocalObject(
        368,
        IFFLock.Constructor(Vector3(2602.866f, 2283.341f, 77.1833f), Vector3(0, 0, 97)),
        owning_building_guid = 1,
        door_guid = 268
      )
      LocalObject(
        369,
        IFFLock.Constructor(Vector3(2637.601f, 2264.586f, 84.6833f), Vector3(0, 0, 187)),
        owning_building_guid = 1,
        door_guid = 274
      )
      LocalObject(
        370,
        IFFLock.Constructor(Vector3(2637.619f, 2290.528f, 84.6833f), Vector3(0, 0, 7)),
        owning_building_guid = 1,
        door_guid = 276
      )
      LocalObject(
        371,
        IFFLock.Constructor(Vector3(2640.922f, 2248.273f, 102.3083f), Vector3(0, 0, 277)),
        owning_building_guid = 1,
        door_guid = 197
      )
      LocalObject(
        372,
        IFFLock.Constructor(Vector3(2647.413f, 2266.644f, 77.1833f), Vector3(0, 0, 277)),
        owning_building_guid = 1,
        door_guid = 283
      )
      LocalObject(
        373,
        IFFLock.Constructor(Vector3(2647.603f, 2243.722f, 97.3093f), Vector3(0, 0, 187)),
        owning_building_guid = 1,
        door_guid = 198
      )
      LocalObject(
        374,
        IFFLock.Constructor(Vector3(2648.373f, 2308.954f, 102.3083f), Vector3(0, 0, 277)),
        owning_building_guid = 1,
        door_guid = 199
      )
      LocalObject(
        375,
        IFFLock.Constructor(Vector3(2652.026f, 2251.029f, 102.3083f), Vector3(0, 0, 97)),
        owning_building_guid = 1,
        door_guid = 200
      )
      LocalObject(
        376,
        IFFLock.Constructor(Vector3(2652.398f, 2316.299f, 97.3093f), Vector3(0, 0, 7)),
        owning_building_guid = 1,
        door_guid = 201
      )
      LocalObject(
        377,
        IFFLock.Constructor(Vector3(2659.478f, 2311.714f, 102.3083f), Vector3(0, 0, 97)),
        owning_building_guid = 1,
        door_guid = 204
      )
      LocalObject(501, Locker.Constructor(Vector3(2639.937f, 2267.272f, 83.6083f)), owning_building_guid = 1)
      LocalObject(502, Locker.Constructor(Vector3(2641.092f, 2267.131f, 83.6083f)), owning_building_guid = 1)
      LocalObject(503, Locker.Constructor(Vector3(2642.231f, 2266.991f, 83.6083f)), owning_building_guid = 1)
      LocalObject(504, Locker.Constructor(Vector3(2643.371f, 2266.851f, 83.6083f)), owning_building_guid = 1)
      LocalObject(505, Locker.Constructor(Vector3(2652.929f, 2285.852f, 75.8473f)), owning_building_guid = 1)
      LocalObject(506, Locker.Constructor(Vector3(2654.243f, 2285.69f, 75.8473f)), owning_building_guid = 1)
      LocalObject(507, Locker.Constructor(Vector3(2655.569f, 2285.527f, 75.8473f)), owning_building_guid = 1)
      LocalObject(508, Locker.Constructor(Vector3(2656.896f, 2285.365f, 75.8473f)), owning_building_guid = 1)
      LocalObject(509, Locker.Constructor(Vector3(2661.402f, 2284.811f, 75.8473f)), owning_building_guid = 1)
      LocalObject(510, Locker.Constructor(Vector3(2662.716f, 2284.65f, 75.8473f)), owning_building_guid = 1)
      LocalObject(511, Locker.Constructor(Vector3(2664.042f, 2284.487f, 75.8473f)), owning_building_guid = 1)
      LocalObject(512, Locker.Constructor(Vector3(2665.37f, 2284.324f, 75.8473f)), owning_building_guid = 1)
      LocalObject(
        624,
        Terminal.Constructor(Vector3(2627.7f, 2282.734f, 92.1763f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        625,
        Terminal.Constructor(Vector3(2643.647f, 2272.124f, 84.9373f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        626,
        Terminal.Constructor(Vector3(2644.102f, 2275.827f, 84.9373f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        627,
        Terminal.Constructor(Vector3(2644.563f, 2279.587f, 84.9373f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        628,
        Terminal.Constructor(Vector3(2647.259f, 2257.691f, 92.1763f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        629,
        Terminal.Constructor(Vector3(2652.737f, 2302.31f, 92.1763f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        859,
        Terminal.Constructor(Vector3(2607.218f, 2324.958f, 84.9043f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        860,
        Terminal.Constructor(Vector3(2628.114f, 2298.212f, 77.4043f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        861,
        Terminal.Constructor(Vector3(2629.558f, 2269.657f, 85.4813f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        862,
        Terminal.Constructor(Vector3(2630.443f, 2276.895f, 85.4813f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        863,
        Terminal.Constructor(Vector3(2631.334f, 2284.128f, 85.4813f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        864,
        Terminal.Constructor(Vector3(2643.989f, 2276.204f, 97.3753f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        918,
        Terminal.Constructor(Vector3(2612.483f, 2367.699f, 92.7493f), vehicle_terminal_combined),
        owning_building_guid = 1
      )
      LocalObject(
        577,
        VehicleSpawnPad.Constructor(Vector3(2610.91f, 2354.151f, 88.5923f), mb_pad_creation, Vector3(0, 0, 187)),
        owning_building_guid = 1,
        terminal_guid = 918
      )
      LocalObject(800, ResourceSilo.Constructor(Vector3(2691.833f, 2188.727f, 97.8823f)), owning_building_guid = 1)
      LocalObject(
        827,
        SpawnTube.Constructor(Vector3(2629.001f, 2271.176f, 83.3473f), Vector3(0, 0, 7)),
        owning_building_guid = 1
      )
      LocalObject(
        828,
        SpawnTube.Constructor(Vector3(2629.89f, 2278.413f, 83.3473f), Vector3(0, 0, 7)),
        owning_building_guid = 1
      )
      LocalObject(
        829,
        SpawnTube.Constructor(Vector3(2630.778f, 2285.647f, 83.3473f), Vector3(0, 0, 7)),
        owning_building_guid = 1
      )
      LocalObject(
        581,
        ProximityTerminal.Constructor(Vector3(2628.116f, 2282.681f, 95.8473f), medical_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        582,
        ProximityTerminal.Constructor(Vector3(2659.066f, 2284.549f, 75.8473f), medical_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        672,
        ProximityTerminal.Constructor(Vector3(2595.588f, 2306.601f, 99.1523f), pad_landing_frame),
        owning_building_guid = 1
      )
      LocalObject(
        673,
        Terminal.Constructor(Vector3(2595.588f, 2306.601f, 99.1523f), air_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        675,
        ProximityTerminal.Constructor(Vector3(2649.279f, 2206.042f, 99.1753f), pad_landing_frame),
        owning_building_guid = 1
      )
      LocalObject(
        676,
        Terminal.Constructor(Vector3(2649.279f, 2206.042f, 99.1753f), air_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        678,
        ProximityTerminal.Constructor(Vector3(2683.396f, 2333.743f, 101.3133f), pad_landing_frame),
        owning_building_guid = 1
      )
      LocalObject(
        679,
        Terminal.Constructor(Vector3(2683.396f, 2333.743f, 101.3133f), air_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        681,
        ProximityTerminal.Constructor(Vector3(2696.59f, 2254.297f, 99.1523f), pad_landing_frame),
        owning_building_guid = 1
      )
      LocalObject(
        682,
        Terminal.Constructor(Vector3(2696.59f, 2254.297f, 99.1523f), air_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        790,
        ProximityTerminal.Constructor(Vector3(2580.451f, 2288.745f, 90.0473f), repair_silo),
        owning_building_guid = 1
      )
      LocalObject(
        791,
        Terminal.Constructor(Vector3(2580.451f, 2288.745f, 90.0473f), ground_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        794,
        ProximityTerminal.Constructor(Vector3(2711.908f, 2272.795f, 90.0473f), repair_silo),
        owning_building_guid = 1
      )
      LocalObject(
        795,
        Terminal.Constructor(Vector3(2711.908f, 2272.795f, 90.0473f), ground_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        567,
        FacilityTurret.Constructor(Vector3(2558.204f, 2193.706f, 99.3553f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(567, 5000)
      LocalObject(
        568,
        FacilityTurret.Constructor(Vector3(2582.754f, 2393.883f, 99.3553f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(568, 5001)
      LocalObject(
        569,
        FacilityTurret.Constructor(Vector3(2617.075f, 2184.233f, 99.3553f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(569, 5002)
      LocalObject(
        570,
        FacilityTurret.Constructor(Vector3(2710.489f, 2174.998f, 99.3553f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(570, 5003)
      LocalObject(
        571,
        FacilityTurret.Constructor(Vector3(2729.554f, 2311.99f, 99.3553f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(571, 5004)
      LocalObject(
        572,
        FacilityTurret.Constructor(Vector3(2735.076f, 2375.17f, 99.3553f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(572, 5005)
      LocalObject(722, Painbox.Constructor(Vector3(2589.758f, 2280.462f, 80.7183f), painbox), owning_building_guid = 1)
      LocalObject(
        725,
        Painbox.Constructor(Vector3(2637.525f, 2280.108f, 88.2957f), painbox_continuous),
        owning_building_guid = 1
      )
      LocalObject(
        728,
        Painbox.Constructor(Vector3(2603.957f, 2280.862f, 77.3063f), painbox_door_radius),
        owning_building_guid = 1
      )
      LocalObject(
        735,
        Painbox.Constructor(Vector3(2636.01f, 2264.526f, 84.5473f), painbox_door_radius_continuous),
        owning_building_guid = 1
      )
      LocalObject(
        736,
        Painbox.Constructor(Vector3(2639.294f, 2290.668f, 84.6118f), painbox_door_radius_continuous),
        owning_building_guid = 1
      )
      LocalObject(
        737,
        Painbox.Constructor(Vector3(2651.938f, 2283.749f, 86.5259f), painbox_door_radius_continuous),
        owning_building_guid = 1
      )
      LocalObject(97, Generator.Constructor(Vector3(2586.428f, 2283.75f, 74.5533f)), owning_building_guid = 1)
      LocalObject(
        94,
        Terminal.Constructor(Vector3(2594.565f, 2282.799f, 75.8473f), gen_control),
        owning_building_guid = 1
      )
    }

    Building17()

    def Building17(): Unit = { // Name: bunker_gauntlet Type: bunker_gauntlet GUID: 4, MapID: 17
      LocalBuilding(
        "bunker_gauntlet",
        4,
        17,
        FoundationBuilder(
          Building.Structure(
            StructureType.Bunker,
            Vector3(1222f, 1420f, 12.08533f),
            Vector3(0f, 0f, 238f),
            bunker_gauntlet
          )
        )
      )
      LocalObject(98, Door.Constructor(Vector3(1207.181f, 1399.871f, 13.60633f)), owning_building_guid = 4)
      LocalObject(100, Door.Constructor(Vector3(1233.573f, 1442.128f, 13.60633f)), owning_building_guid = 4)
    }

    Building15()

    def Building15(): Unit = { // Name: bunker_gauntlet Type: bunker_gauntlet GUID: 5, MapID: 15
      LocalBuilding(
        "bunker_gauntlet",
        5,
        15,
        FoundationBuilder(
          Building.Structure(
            StructureType.Bunker,
            Vector3(2542f, 2700f, 12.08045f),
            Vector3(0f, 0f, 146f),
            bunker_gauntlet
          )
        )
      )
      LocalObject(184, Door.Constructor(Vector3(2522.401f, 2715.513f, 13.60145f)), owning_building_guid = 5)
      LocalObject(186, Door.Constructor(Vector3(2563.71f, 2687.662f, 13.60145f)), owning_building_guid = 5)
    }

    Building16()

    def Building16(): Unit = { // Name: bunker_gauntlet Type: bunker_gauntlet GUID: 6, MapID: 16
      LocalBuilding(
        "bunker_gauntlet",
        6,
        16,
        FoundationBuilder(
          Building.Structure(
            StructureType.Bunker,
            Vector3(2612f, 1350f, 11.46977f),
            Vector3(0f, 0f, 323f),
            bunker_gauntlet
          )
        )
      )
      LocalObject(193, Door.Constructor(Vector3(2590.965f, 1363.457f, 12.99077f)), owning_building_guid = 6)
      LocalObject(195, Door.Constructor(Vector3(2630.76f, 1333.483f, 12.99077f)), owning_building_guid = 6)
    }

    Building22()

    def Building22(): Unit = { // Name: bunker_lg Type: bunker_lg GUID: 7, MapID: 22
      LocalBuilding(
        "bunker_lg",
        7,
        22,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(1570f, 2502f, 90.64242f), Vector3(0f, 0f, 263f), bunker_lg)
        )
      )
      LocalObject(120, Door.Constructor(Vector3(1572.22f, 2499.102f, 92.16342f)), owning_building_guid = 7)
    }

    Building32()

    def Building32(): Unit = { // Name: bunker_lg Type: bunker_lg GUID: 8, MapID: 32
      LocalBuilding(
        "bunker_lg",
        8,
        32,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(1674f, 1810f, 90.64486f), Vector3(0f, 0f, 263f), bunker_lg)
        )
      )
      LocalObject(125, Door.Constructor(Vector3(1676.22f, 1807.102f, 92.16586f)), owning_building_guid = 8)
    }

    Building33()

    def Building33(): Unit = { // Name: bunker_lg Type: bunker_lg GUID: 9, MapID: 33
      LocalBuilding(
        "bunker_lg",
        9,
        33,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(1728f, 1820f, 90.6473f), Vector3(0f, 0f, 182f), bunker_lg)
        )
      )
      LocalObject(129, Door.Constructor(Vector3(1725.485f, 1817.354f, 92.1683f)), owning_building_guid = 9)
    }

    Building30()

    def Building30(): Unit = { // Name: bunker_lg Type: bunker_lg GUID: 10, MapID: 30
      LocalBuilding(
        "bunker_lg",
        10,
        30,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(1766f, 2594f, 90.64272f), Vector3(0f, 0f, 324f), bunker_lg)
        )
      )
      LocalObject(134, Door.Constructor(Vector3(1769.611f, 2594.537f, 92.16373f)), owning_building_guid = 10)
    }

    Building31()

    def Building31(): Unit = { // Name: bunker_lg Type: bunker_lg GUID: 11, MapID: 31
      LocalBuilding(
        "bunker_lg",
        11,
        31,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(1810f, 2570f, 90.64516f), Vector3(0f, 0f, 74f), bunker_lg)
        )
      )
      LocalObject(137, Door.Constructor(Vector3(1808.26f, 2573.21f, 92.16617f)), owning_building_guid = 11)
    }

    Building18()

    def Building18(): Unit = { // Name: bunker_lg Type: bunker_lg GUID: 12, MapID: 18
      LocalBuilding(
        "bunker_lg",
        12,
        18,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(2180f, 1398f, 30.41109f), Vector3(0f, 0f, 193f), bunker_lg)
        )
      )
      LocalObject(167, Door.Constructor(Vector3(2178.036f, 1394.922f, 31.93209f)), owning_building_guid = 12)
    }

    Building34()

    def Building34(): Unit = { // Name: bunker_lg Type: bunker_lg GUID: 13, MapID: 34
      LocalBuilding(
        "bunker_lg",
        13,
        34,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(2566f, 2174f, 90.6473f), Vector3(0f, 0f, 0f), bunker_lg)
        )
      )
      LocalObject(187, Door.Constructor(Vector3(2568.606f, 2176.557f, 92.1683f)), owning_building_guid = 13)
    }

    Building35()

    def Building35(): Unit = { // Name: bunker_lg Type: bunker_lg GUID: 14, MapID: 35
      LocalBuilding(
        "bunker_lg",
        14,
        35,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(2610f, 2164f, 90.6473f), Vector3(0f, 0f, 42f), bunker_lg)
        )
      )
      LocalObject(194, Door.Constructor(Vector3(2610.226f, 2167.644f, 92.1683f)), owning_building_guid = 14)
    }

    Building20()

    def Building20(): Unit = { // Name: bunker_lg Type: bunker_lg GUID: 15, MapID: 20
      LocalBuilding(
        "bunker_lg",
        15,
        20,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(2784f, 1826f, 54.0495f), Vector3(0f, 0f, 157f), bunker_lg)
        )
      )
      LocalObject(208, Door.Constructor(Vector3(2780.602f, 1824.665f, 55.5705f)), owning_building_guid = 15)
    }

    Building36()

    def Building36(): Unit = { // Name: bunker_sm Type: bunker_sm GUID: 16, MapID: 36
      LocalBuilding(
        "bunker_sm",
        16,
        36,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(1220f, 1754f, 71.60863f), Vector3(0f, 0f, 162f), bunker_sm)
        )
      )
      LocalObject(99, Door.Constructor(Vector3(1218.852f, 1754.431f, 73.12963f)), owning_building_guid = 16)
    }

    Building19()

    def Building19(): Unit = { // Name: bunker_sm Type: bunker_sm GUID: 17, MapID: 19
      LocalBuilding(
        "bunker_sm",
        17,
        19,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(1290f, 2306f, 55.9801f), Vector3(0f, 0f, 89f), bunker_sm)
        )
      )
      LocalObject(105, Door.Constructor(Vector3(1290.076f, 2307.224f, 57.5011f)), owning_building_guid = 17)
    }

    Building23()

    def Building23(): Unit = { // Name: bunker_sm Type: bunker_sm GUID: 18, MapID: 23
      LocalBuilding(
        "bunker_sm",
        18,
        23,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(1616f, 1468f, 52.67128f), Vector3(0f, 0f, 158f), bunker_sm)
        )
      )
      LocalObject(121, Door.Constructor(Vector3(1614.885f, 1468.51f, 54.19228f)), owning_building_guid = 18)
    }

    Building37()

    def Building37(): Unit = { // Name: bunker_sm Type: bunker_sm GUID: 19, MapID: 37
      LocalBuilding(
        "bunker_sm",
        19,
        37,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(1626f, 2798f, 74.2613f), Vector3(0f, 0f, 20f), bunker_sm)
        )
      )
      LocalObject(122, Door.Constructor(Vector3(1627.17f, 2798.367f, 75.7823f)), owning_building_guid = 19)
    }

    Building27()

    def Building27(): Unit = { // Name: bunker_sm Type: bunker_sm GUID: 20, MapID: 27
      LocalBuilding(
        "bunker_sm",
        20,
        27,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(1878f, 2080f, 110.9449f), Vector3(0f, 0f, 340f), bunker_sm)
        )
      )
      LocalObject(148, Door.Constructor(Vector3(1879.132f, 2079.529f, 112.4659f)), owning_building_guid = 20)
    }

    Building26()

    def Building26(): Unit = { // Name: bunker_sm Type: bunker_sm GUID: 21, MapID: 26
      LocalBuilding(
        "bunker_sm",
        21,
        26,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(1908f, 2020f, 110.9848f), Vector3(0f, 0f, 134f), bunker_sm)
        )
      )
      LocalObject(155, Door.Constructor(Vector3(1907.189f, 2020.919f, 112.5058f)), owning_building_guid = 21)
    }

    Building24()

    def Building24(): Unit = { // Name: bunker_sm Type: bunker_sm GUID: 22, MapID: 24
      LocalBuilding(
        "bunker_sm",
        22,
        24,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(2002f, 2332f, 114.5708f), Vector3(0f, 0f, 348f), bunker_sm)
        )
      )
      LocalObject(157, Door.Constructor(Vector3(2003.187f, 2331.691f, 116.0918f)), owning_building_guid = 22)
    }

    Building25()

    def Building25(): Unit = { // Name: bunker_sm Type: bunker_sm GUID: 23, MapID: 25
      LocalBuilding(
        "bunker_sm",
        23,
        25,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(2062f, 2362f, 114.0855f), Vector3(0f, 0f, 289f), bunker_sm)
        )
      )
      LocalObject(162, Door.Constructor(Vector3(2062.347f, 2360.824f, 115.6065f)), owning_building_guid = 23)
    }

    Building29()

    def Building29(): Unit = { // Name: bunker_sm Type: bunker_sm GUID: 24, MapID: 29
      LocalBuilding(
        "bunker_sm",
        24,
        29,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(2250f, 2170f, 110.7895f), Vector3(0f, 0f, 239f), bunker_sm)
        )
      )
      LocalObject(170, Door.Constructor(Vector3(2249.322f, 2168.978f, 112.3105f)), owning_building_guid = 24)
    }

    Building28()

    def Building28(): Unit = { // Name: bunker_sm Type: bunker_sm GUID: 25, MapID: 28
      LocalBuilding(
        "bunker_sm",
        25,
        28,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(2252f, 2092f, 110.7993f), Vector3(0f, 0f, 92f), bunker_sm)
        )
      )
      LocalObject(171, Door.Constructor(Vector3(2252.012f, 2093.226f, 112.3203f)), owning_building_guid = 25)
    }

    Building38()

    def Building38(): Unit = { // Name: bunker_sm Type: bunker_sm GUID: 26, MapID: 38
      LocalBuilding(
        "bunker_sm",
        26,
        38,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(2530f, 1478f, 79.27488f), Vector3(0f, 0f, 282f), bunker_sm)
        )
      )
      LocalObject(185, Door.Constructor(Vector3(2530.201f, 1476.79f, 80.79588f)), owning_building_guid = 26)
    }

    Building21()

    def Building21(): Unit = { // Name: bunker_sm Type: bunker_sm GUID: 27, MapID: 21
      LocalBuilding(
        "bunker_sm",
        27,
        21,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(2918f, 1934f, 50.3531f), Vector3(0f, 0f, 274f), bunker_sm)
        )
      )
      LocalObject(219, Door.Constructor(Vector3(2918.031f, 1932.774f, 51.8741f)), owning_building_guid = 27)
    }

    Building7()

    def Building7(): Unit = { // Name: Base_Alpha Type: comm_station GUID: 28, MapID: 7
      LocalBuilding(
        "Base_Alpha",
        28,
        7,
        FoundationBuilder(
          Building.Structure(
            StructureType.Facility,
            Vector3(1834f, 2664f, 90.6473f),
            Vector3(0f, 0f, 107f),
            comm_station
          )
        )
      )
      LocalObject(
        77,
        CaptureTerminal.Constructor(Vector3(1747.729f, 2683.728f, 73.34731f), capture_terminal),
        owning_building_guid = 28
      )
      LocalObject(131, Door.Constructor(Vector3(1751.965f, 2672.381f, 92.3683f)), owning_building_guid = 28)
      LocalObject(132, Door.Constructor(Vector3(1763.528f, 2662.001f, 100.3613f)), owning_building_guid = 28)
      LocalObject(133, Door.Constructor(Vector3(1768.847f, 2644.604f, 92.3983f)), owning_building_guid = 28)
      LocalObject(139, Door.Constructor(Vector3(1809.227f, 2719.378f, 92.3983f)), owning_building_guid = 28)
      LocalObject(140, Door.Constructor(Vector3(1812.535f, 2665.803f, 97.3683f)), owning_building_guid = 28)
      LocalObject(142, Door.Constructor(Vector3(1826.625f, 2724.697f, 100.3623f)), owning_building_guid = 28)
      LocalObject(144, Door.Constructor(Vector3(1839.565f, 2644.788f, 97.3683f)), owning_building_guid = 28)
      LocalObject(145, Door.Constructor(Vector3(1842.365f, 2661.983f, 104.8073f)), owning_building_guid = 28)
      LocalObject(146, Door.Constructor(Vector3(1848.233f, 2647.438f, 97.3683f)), owning_building_guid = 28)
      LocalObject(147, Door.Constructor(Vector3(1875.686f, 2614.208f, 100.3623f)), owning_building_guid = 28)
      LocalObject(151, Door.Constructor(Vector3(1893.084f, 2619.527f, 92.3983f)), owning_building_guid = 28)
      LocalObject(154, Door.Constructor(Vector3(1906.003f, 2660.394f, 92.3983f)), owning_building_guid = 28)
      LocalObject(156, Door.Constructor(Vector3(1911.323f, 2642.996f, 100.3623f)), owning_building_guid = 28)
      LocalObject(239, Door.Constructor(Vector3(1754.938f, 2690.021f, 74.8683f)), owning_building_guid = 28)
      LocalObject(240, Door.Constructor(Vector3(1757.276f, 2682.371f, 74.8683f)), owning_building_guid = 28)
      LocalObject(243, Door.Constructor(Vector3(1767.899f, 2702.35f, 74.8683f)), owning_building_guid = 28)
      LocalObject(245, Door.Constructor(Vector3(1772.26f, 2674.404f, 74.8683f)), owning_building_guid = 28)
      LocalObject(246, Door.Constructor(Vector3(1789.267f, 2646.141f, 84.8683f)), owning_building_guid = 28)
      LocalObject(247, Door.Constructor(Vector3(1790.534f, 2696.722f, 82.3683f)), owning_building_guid = 28)
      LocalObject(248, Door.Constructor(Vector3(1790.851f, 2709.367f, 82.3683f)), owning_building_guid = 28)
      LocalObject(249, Door.Constructor(Vector3(1796.284f, 2623.189f, 84.8683f)), owning_building_guid = 28)
      LocalObject(250, Door.Constructor(Vector3(1796.917f, 2648.48f, 74.8683f)), owning_building_guid = 28)
      LocalObject(251, Door.Constructor(Vector3(1799.573f, 2653.475f, 84.8683f)), owning_building_guid = 28)
      LocalObject(252, Door.Constructor(Vector3(1802.862f, 2683.76f, 74.8683f)), owning_building_guid = 28)
      LocalObject(254, Door.Constructor(Vector3(1806.152f, 2714.044f, 74.8683f)), owning_building_guid = 28)
      LocalObject(255, Door.Constructor(Vector3(1812.535f, 2665.803f, 87.3683f)), owning_building_guid = 28)
      LocalObject(256, Door.Constructor(Vector3(1813.485f, 2703.738f, 82.3683f)), owning_building_guid = 28)
      LocalObject(257, Door.Constructor(Vector3(1813.924f, 2620.217f, 84.8683f)), owning_building_guid = 28)
      LocalObject(258, Door.Constructor(Vector3(1816.896f, 2637.857f, 74.8683f)), owning_building_guid = 28)
      LocalObject(259, Door.Constructor(Vector3(1820.185f, 2668.142f, 97.3683f)), owning_building_guid = 28)
      LocalObject(260, Door.Constructor(Vector3(1820.502f, 2680.787f, 87.3683f)), owning_building_guid = 28)
      LocalObject(261, Door.Constructor(Vector3(1822.841f, 2673.137f, 92.3683f)), owning_building_guid = 28)
      LocalObject(262, Door.Constructor(Vector3(1824.547f, 2640.196f, 84.8683f)), owning_building_guid = 28)
      LocalObject(263, Door.Constructor(Vector3(1827.202f, 2645.191f, 92.3683f)), owning_building_guid = 28)
      LocalObject(264, Door.Constructor(Vector3(1827.519f, 2657.836f, 74.8683f)), owning_building_guid = 28)
      LocalObject(265, Door.Constructor(Vector3(1830.175f, 2662.831f, 84.8683f)), owning_building_guid = 28)
      LocalObject(266, Door.Constructor(Vector3(1842.503f, 2649.869f, 97.3683f)), owning_building_guid = 28)
      LocalObject(290, Door.Constructor(Vector3(1832.713f, 2682.123f, 93.1403f)), owning_building_guid = 28)
      LocalObject(876, Door.Constructor(Vector3(1796.2f, 2690.792f, 82.7013f)), owning_building_guid = 28)
      LocalObject(877, Door.Constructor(Vector3(1803.171f, 2692.923f, 82.7013f)), owning_building_guid = 28)
      LocalObject(878, Door.Constructor(Vector3(1810.145f, 2695.055f, 82.7013f)), owning_building_guid = 28)
      LocalObject(
        302,
        IFFLock.Constructor(Vector3(1828.852f, 2683.814f, 92.2993f), Vector3(0, 0, 343)),
        owning_building_guid = 28,
        door_guid = 290
      )
      LocalObject(
        329,
        IFFLock.Constructor(Vector3(1749.793f, 2672.531f, 92.2973f), Vector3(0, 0, 343)),
        owning_building_guid = 28,
        door_guid = 131
      )
      LocalObject(
        330,
        IFFLock.Constructor(Vector3(1753.196f, 2690.339f, 74.6833f), Vector3(0, 0, 343)),
        owning_building_guid = 28,
        door_guid = 239
      )
      LocalObject(
        331,
        IFFLock.Constructor(Vector3(1759.017f, 2682.053f, 74.6833f), Vector3(0, 0, 163)),
        owning_building_guid = 28,
        door_guid = 240
      )
      LocalObject(
        332,
        IFFLock.Constructor(Vector3(1790.219f, 2694.981f, 82.1833f), Vector3(0, 0, 253)),
        owning_building_guid = 28,
        door_guid = 247
      )
      LocalObject(
        333,
        IFFLock.Constructor(Vector3(1807.93f, 2713.605f, 74.6833f), Vector3(0, 0, 163)),
        owning_building_guid = 28,
        door_guid = 254
      )
      LocalObject(
        334,
        IFFLock.Constructor(Vector3(1813.8f, 2705.479f, 82.1833f), Vector3(0, 0, 73)),
        owning_building_guid = 28,
        door_guid = 256
      )
      LocalObject(
        335,
        IFFLock.Constructor(Vector3(1814.728f, 2665.624f, 97.3083f), Vector3(0, 0, 163)),
        owning_building_guid = 28,
        door_guid = 140
      )
      LocalObject(
        336,
        IFFLock.Constructor(Vector3(1817.335f, 2639.635f, 74.6833f), Vector3(0, 0, 73)),
        owning_building_guid = 28,
        door_guid = 258
      )
      LocalObject(
        338,
        IFFLock.Constructor(Vector3(1839.388f, 2642.597f, 97.3083f), Vector3(0, 0, 253)),
        owning_building_guid = 28,
        door_guid = 144
      )
      LocalObject(
        339,
        IFFLock.Constructor(Vector3(1844.59f, 2661.818f, 104.7283f), Vector3(0, 0, 163)),
        owning_building_guid = 28,
        door_guid = 145
      )
      LocalObject(
        340,
        IFFLock.Constructor(Vector3(1848.41f, 2649.632f, 97.3083f), Vector3(0, 0, 73)),
        owning_building_guid = 28,
        door_guid = 146
      )
      LocalObject(441, Locker.Constructor(Vector3(1784.474f, 2722.818f, 73.34731f)), owning_building_guid = 28)
      LocalObject(442, Locker.Constructor(Vector3(1784.865f, 2721.54f, 73.34731f)), owning_building_guid = 28)
      LocalObject(443, Locker.Constructor(Vector3(1785.256f, 2720.262f, 73.34731f)), owning_building_guid = 28)
      LocalObject(444, Locker.Constructor(Vector3(1785.643f, 2718.996f, 73.34731f)), owning_building_guid = 28)
      LocalObject(445, Locker.Constructor(Vector3(1786.97f, 2714.654f, 73.34731f)), owning_building_guid = 28)
      LocalObject(446, Locker.Constructor(Vector3(1787.361f, 2713.375f, 73.34731f)), owning_building_guid = 28)
      LocalObject(447, Locker.Constructor(Vector3(1787.752f, 2712.098f, 73.34731f)), owning_building_guid = 28)
      LocalObject(448, Locker.Constructor(Vector3(1788.139f, 2710.832f, 73.34731f)), owning_building_guid = 28)
      LocalObject(449, Locker.Constructor(Vector3(1809.385f, 2709.829f, 81.1083f)), owning_building_guid = 28)
      LocalObject(450, Locker.Constructor(Vector3(1809.72f, 2708.73f, 81.1083f)), owning_building_guid = 28)
      LocalObject(451, Locker.Constructor(Vector3(1810.056f, 2707.633f, 81.1083f)), owning_building_guid = 28)
      LocalObject(452, Locker.Constructor(Vector3(1810.396f, 2706.52f, 81.1083f)), owning_building_guid = 28)
      LocalObject(
        599,
        Terminal.Constructor(Vector3(1797.264f, 2705.737f, 82.4373f), order_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        600,
        Terminal.Constructor(Vector3(1800.887f, 2706.845f, 82.4373f), order_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        601,
        Terminal.Constructor(Vector3(1804.455f, 2707.936f, 82.4373f), order_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        602,
        Terminal.Constructor(Vector3(1838.267f, 2667.743f, 104.6023f), order_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        603,
        Terminal.Constructor(Vector3(1841.105f, 2666.251f, 104.6023f), order_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        604,
        Terminal.Constructor(Vector3(1842.47f, 2669.027f, 104.6023f), order_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        605,
        Terminal.Constructor(Vector3(1858.897f, 2661.551f, 97.2073f), order_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        853,
        Terminal.Constructor(Vector3(1795.976f, 2651.757f, 84.9043f), spawn_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        854,
        Terminal.Constructor(Vector3(1798.496f, 2691.805f, 82.9813f), spawn_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        855,
        Terminal.Constructor(Vector3(1805.467f, 2693.933f, 82.9813f), spawn_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        856,
        Terminal.Constructor(Vector3(1812.439f, 2696.068f, 82.9813f), spawn_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        857,
        Terminal.Constructor(Vector3(1830.479f, 2646.133f, 74.9043f), spawn_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        858,
        Terminal.Constructor(Vector3(1857.417f, 2669.601f, 97.4643f), spawn_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        916,
        Terminal.Constructor(Vector3(1766.282f, 2698.151f, 93.5343f), vehicle_terminal_combined),
        owning_building_guid = 28
      )
      LocalObject(
        575,
        VehicleSpawnPad.Constructor(Vector3(1770.413f, 2685.167f, 89.3763f), mb_pad_creation, Vector3(0, 0, 163)),
        owning_building_guid = 28,
        terminal_guid = 916
      )
      LocalObject(799, ResourceSilo.Constructor(Vector3(1916.379f, 2630.867f, 97.8643f)), owning_building_guid = 28)
      LocalObject(
        812,
        SpawnTube.Constructor(Vector3(1797.336f, 2690.679f, 80.8473f), Vector3(0, 0, 253)),
        owning_building_guid = 28
      )
      LocalObject(
        813,
        SpawnTube.Constructor(Vector3(1804.305f, 2692.81f, 80.8473f), Vector3(0, 0, 253)),
        owning_building_guid = 28
      )
      LocalObject(
        814,
        SpawnTube.Constructor(Vector3(1811.278f, 2694.942f, 80.8473f), Vector3(0, 0, 253)),
        owning_building_guid = 28
      )
      LocalObject(
        579,
        ProximityTerminal.Constructor(Vector3(1786.833f, 2716.968f, 73.34731f), medical_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        580,
        ProximityTerminal.Constructor(Vector3(1861.458f, 2673.298f, 90.8473f), medical_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        666,
        ProximityTerminal.Constructor(Vector3(1786.736f, 2629.843f, 99.0883f), pad_landing_frame),
        owning_building_guid = 28
      )
      LocalObject(
        667,
        Terminal.Constructor(Vector3(1786.736f, 2629.843f, 99.0883f), air_rearm_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        782,
        ProximityTerminal.Constructor(Vector3(1829.694f, 2598.804f, 90.3973f), repair_silo),
        owning_building_guid = 28
      )
      LocalObject(
        783,
        Terminal.Constructor(Vector3(1829.694f, 2598.804f, 90.3973f), ground_rearm_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        786,
        ProximityTerminal.Constructor(Vector3(1839.245f, 2730.061f, 90.3973f), repair_silo),
        owning_building_guid = 28
      )
      LocalObject(
        787,
        Terminal.Constructor(Vector3(1839.245f, 2730.061f, 90.3973f), ground_rearm_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        548,
        FacilityTurret.Constructor(Vector3(1735.783f, 2710.141f, 99.3553f), manned_turret),
        owning_building_guid = 28
      )
      TurretToWeapon(548, 5006)
      LocalObject(
        550,
        FacilityTurret.Constructor(Vector3(1764.725f, 2610.978f, 99.3553f), manned_turret),
        owning_building_guid = 28
      )
      TurretToWeapon(550, 5007)
      LocalObject(
        552,
        FacilityTurret.Constructor(Vector3(1818.548f, 2582.338f, 99.3553f), manned_turret),
        owning_building_guid = 28
      )
      TurretToWeapon(552, 5008)
      LocalObject(
        553,
        FacilityTurret.Constructor(Vector3(1849.178f, 2746.032f, 99.3553f), manned_turret),
        owning_building_guid = 28
      )
      TurretToWeapon(553, 5009)
      LocalObject(
        556,
        FacilityTurret.Constructor(Vector3(1903.022f, 2717.377f, 99.3553f), manned_turret),
        owning_building_guid = 28
      )
      TurretToWeapon(556, 5010)
      LocalObject(
        558,
        FacilityTurret.Constructor(Vector3(1932.102f, 2618.236f, 99.3553f), manned_turret),
        owning_building_guid = 28
      )
      TurretToWeapon(558, 5011)
      LocalObject(721, Painbox.Constructor(Vector3(1805.295f, 2634.455f, 78.2493f), painbox), owning_building_guid = 28)
      LocalObject(
        724,
        Painbox.Constructor(Vector3(1795.462f, 2700.544f, 85.2921f), painbox_continuous),
        owning_building_guid = 28
      )
      LocalObject(
        727,
        Painbox.Constructor(Vector3(1819.626f, 2638.939f, 76.106f), painbox_door_radius),
        owning_building_guid = 28
      )
      LocalObject(
        732,
        Painbox.Constructor(Vector3(1788.939f, 2697.081f, 82.455f), painbox_door_radius_continuous),
        owning_building_guid = 28
      )
      LocalObject(
        733,
        Painbox.Constructor(Vector3(1790.474f, 2711.191f, 83.6733f), painbox_door_radius_continuous),
        owning_building_guid = 28
      )
      LocalObject(
        734,
        Painbox.Constructor(Vector3(1815.351f, 2704.219f, 82.6733f), painbox_door_radius_continuous),
        owning_building_guid = 28
      )
      LocalObject(96, Generator.Constructor(Vector3(1802.028f, 2633.285f, 72.0533f)), owning_building_guid = 28)
      LocalObject(
        93,
        Terminal.Constructor(Vector3(1809.848f, 2635.725f, 73.34731f), gen_control),
        owning_building_guid = 28
      )
    }

    Building8()

    def Building8(): Unit = { // Name: Base_Bravo Type: cryo_facility GUID: 31, MapID: 8
      LocalBuilding(
        "Base_Bravo",
        31,
        8,
        FoundationBuilder(
          Building.Structure(
            StructureType.Facility,
            Vector3(1736f, 1730f, 90.6473f),
            Vector3(0f, 0f, 57f),
            cryo_facility
          )
        )
      )
      LocalObject(
        76,
        CaptureTerminal.Constructor(Vector3(1670.997f, 1738.721f, 80.6473f), capture_terminal),
        owning_building_guid = 31
      )
      LocalObject(123, Door.Constructor(Vector3(1656.083f, 1731.431f, 92.1983f)), owning_building_guid = 31)
      LocalObject(124, Door.Constructor(Vector3(1665.992f, 1746.688f, 100.1623f)), owning_building_guid = 31)
      LocalObject(126, Door.Constructor(Vector3(1684.847f, 1692.897f, 100.1623f)), owning_building_guid = 31)
      LocalObject(127, Door.Constructor(Vector3(1700.105f, 1682.989f, 92.1983f)), owning_building_guid = 31)
      LocalObject(128, Door.Constructor(Vector3(1710.512f, 1727.474f, 102.1683f)), owning_building_guid = 31)
      LocalObject(130, Door.Constructor(Vector3(1735.548f, 1735.063f, 102.1683f)), owning_building_guid = 31)
      LocalObject(135, Door.Constructor(Vector3(1790.994f, 1755.01f, 92.1983f)), owning_building_guid = 31)
      LocalObject(136, Door.Constructor(Vector3(1806.252f, 1745.102f, 100.1623f)), owning_building_guid = 31)
      LocalObject(138, Door.Constructor(Vector3(1808.439f, 1689.286f, 100.1623f)), owning_building_guid = 31)
      LocalObject(141, Door.Constructor(Vector3(1818.347f, 1704.543f, 92.1983f)), owning_building_guid = 31)
      LocalObject(143, Door.Constructor(Vector3(1830.586f, 1706.731f, 92.1683f)), owning_building_guid = 31)
      LocalObject(220, Door.Constructor(Vector3(1661.542f, 1740.198f, 82.1683f)), owning_building_guid = 31)
      LocalObject(221, Door.Constructor(Vector3(1665.899f, 1746.907f, 82.1683f)), owning_building_guid = 31)
      LocalObject(222, Door.Constructor(Vector3(1670.256f, 1753.617f, 82.1683f)), owning_building_guid = 31)
      LocalObject(223, Door.Constructor(Vector3(1682.846f, 1721.594f, 82.1683f)), owning_building_guid = 31)
      LocalObject(224, Door.Constructor(Vector3(1692.389f, 1758.321f, 82.1683f)), owning_building_guid = 31)
      LocalObject(225, Door.Constructor(Vector3(1695.917f, 1741.721f, 82.1683f)), owning_building_guid = 31)
      LocalObject(226, Door.Constructor(Vector3(1701.798f, 1714.055f, 82.1683f)), owning_building_guid = 31)
      LocalObject(227, Door.Constructor(Vector3(1710.512f, 1727.474f, 82.1683f)), owning_building_guid = 31)
      LocalObject(228, Door.Constructor(Vector3(1710.512f, 1727.474f, 92.1683f)), owning_building_guid = 31)
      LocalObject(229, Door.Constructor(Vector3(1716.393f, 1699.808f, 82.1683f)), owning_building_guid = 31)
      LocalObject(230, Door.Constructor(Vector3(1719.921f, 1683.208f, 82.1683f)), owning_building_guid = 31)
      LocalObject(231, Door.Constructor(Vector3(1722.408f, 1753.135f, 82.1683f)), owning_building_guid = 31)
      LocalObject(232, Door.Constructor(Vector3(1729.464f, 1719.936f, 82.1683f)), owning_building_guid = 31)
      LocalObject(233, Door.Constructor(Vector3(1732.298f, 1761.021f, 82.1683f)), owning_building_guid = 31)
      LocalObject(234, Door.Constructor(Vector3(1739.355f, 1727.822f, 82.1683f)), owning_building_guid = 31)
      LocalObject(235, Door.Constructor(Vector3(1742.536f, 1740.064f, 82.1683f)), owning_building_guid = 31)
      LocalObject(236, Door.Constructor(Vector3(1744.888f, 1728.998f, 102.1683f)), owning_building_guid = 31)
      LocalObject(237, Door.Constructor(Vector3(1745.717f, 1752.307f, 74.6683f)), owning_building_guid = 31)
      LocalObject(238, Door.Constructor(Vector3(1751.945f, 1695.798f, 82.1683f)), owning_building_guid = 31)
      LocalObject(241, Door.Constructor(Vector3(1759.483f, 1714.75f, 82.1683f)), owning_building_guid = 31)
      LocalObject(242, Door.Constructor(Vector3(1764.535f, 1663.775f, 84.6683f)), owning_building_guid = 31)
      LocalObject(244, Door.Constructor(Vector3(1772.073f, 1682.727f, 84.6683f)), owning_building_guid = 31)
      LocalObject(253, Door.Constructor(Vector3(1803.267f, 1672.008f, 84.6683f)), owning_building_guid = 31)
      LocalObject(289, Door.Constructor(Vector3(1717.138f, 1747.009f, 92.9303f)), owning_building_guid = 31)
      LocalObject(292, Door.Constructor(Vector3(1727.112f, 1731.002f, 92.1663f)), owning_building_guid = 31)
      LocalObject(293, Door.Constructor(Vector3(1742.536f, 1740.064f, 92.1683f)), owning_building_guid = 31)
      LocalObject(873, Door.Constructor(Vector3(1721.508f, 1744.983f, 82.5013f)), owning_building_guid = 31)
      LocalObject(874, Door.Constructor(Vector3(1727.621f, 1741.014f, 82.5013f)), owning_building_guid = 31)
      LocalObject(875, Door.Constructor(Vector3(1733.737f, 1737.042f, 82.5013f)), owning_building_guid = 31)
      LocalObject(
        301,
        IFFLock.Constructor(Vector3(1713.086f, 1745.799f, 92.1293f), Vector3(0, 0, 303)),
        owning_building_guid = 31,
        door_guid = 289
      )
      LocalObject(
        322,
        IFFLock.Constructor(Vector3(1662.348f, 1738.553f, 81.9833f), Vector3(0, 0, 213)),
        owning_building_guid = 31,
        door_guid = 220
      )
      LocalObject(
        323,
        IFFLock.Constructor(Vector3(1665.023f, 1748.445f, 81.9833f), Vector3(0, 0, 33)),
        owning_building_guid = 31,
        door_guid = 221
      )
      LocalObject(
        324,
        IFFLock.Constructor(Vector3(1709.242f, 1729.269f, 102.0993f), Vector3(0, 0, 33)),
        owning_building_guid = 31,
        door_guid = 128
      )
      LocalObject(
        325,
        IFFLock.Constructor(Vector3(1720.872f, 1752.258f, 81.9833f), Vector3(0, 0, 303)),
        owning_building_guid = 31,
        door_guid = 231
      )
      LocalObject(
        326,
        IFFLock.Constructor(Vector3(1733.745f, 1733.794f, 102.0993f), Vector3(0, 0, 303)),
        owning_building_guid = 31,
        door_guid = 130
      )
      LocalObject(
        327,
        IFFLock.Constructor(Vector3(1744.071f, 1740.941f, 81.9833f), Vector3(0, 0, 123)),
        owning_building_guid = 31,
        door_guid = 235
      )
      LocalObject(
        328,
        IFFLock.Constructor(Vector3(1746.594f, 1750.771f, 74.4833f), Vector3(0, 0, 213)),
        owning_building_guid = 31,
        door_guid = 237
      )
      LocalObject(
        337,
        IFFLock.Constructor(Vector3(1829.317f, 1708.526f, 92.0993f), Vector3(0, 0, 33)),
        owning_building_guid = 31,
        door_guid = 143
      )
      LocalObject(420, Locker.Constructor(Vector3(1701.161f, 1776.469f, 80.6423f)), owning_building_guid = 31)
      LocalObject(421, Locker.Constructor(Vector3(1702.211f, 1775.787f, 80.6423f)), owning_building_guid = 31)
      LocalObject(422, Locker.Constructor(Vector3(1703.269f, 1775.099f, 80.6423f)), owning_building_guid = 31)
      LocalObject(423, Locker.Constructor(Vector3(1704.327f, 1774.412f, 80.6423f)), owning_building_guid = 31)
      LocalObject(424, Locker.Constructor(Vector3(1705.38f, 1773.728f, 80.6423f)), owning_building_guid = 31)
      LocalObject(425, Locker.Constructor(Vector3(1735.118f, 1769.699f, 80.5553f)), owning_building_guid = 31)
      LocalObject(426, Locker.Constructor(Vector3(1735.692f, 1770.583f, 80.5553f)), owning_building_guid = 31)
      LocalObject(427, Locker.Constructor(Vector3(1736.27f, 1771.473f, 80.5553f)), owning_building_guid = 31)
      LocalObject(428, Locker.Constructor(Vector3(1736.845f, 1772.357f, 80.5553f)), owning_building_guid = 31)
      LocalObject(429, Locker.Constructor(Vector3(1737.419f, 1773.242f, 80.5553f)), owning_building_guid = 31)
      LocalObject(430, Locker.Constructor(Vector3(1737.995f, 1774.128f, 80.5553f)), owning_building_guid = 31)
      LocalObject(431, Locker.Constructor(Vector3(1742.681f, 1744.218f, 80.9083f)), owning_building_guid = 31)
      LocalObject(432, Locker.Constructor(Vector3(1743.315f, 1745.195f, 80.9083f)), owning_building_guid = 31)
      LocalObject(433, Locker.Constructor(Vector3(1743.939f, 1746.156f, 80.9083f)), owning_building_guid = 31)
      LocalObject(434, Locker.Constructor(Vector3(1744.565f, 1747.12f, 80.9083f)), owning_building_guid = 31)
      LocalObject(435, Locker.Constructor(Vector3(1751.894f, 1758.808f, 80.5553f)), owning_building_guid = 31)
      LocalObject(436, Locker.Constructor(Vector3(1752.469f, 1759.694f, 80.5553f)), owning_building_guid = 31)
      LocalObject(437, Locker.Constructor(Vector3(1753.044f, 1760.578f, 80.5553f)), owning_building_guid = 31)
      LocalObject(438, Locker.Constructor(Vector3(1753.618f, 1761.463f, 80.5553f)), owning_building_guid = 31)
      LocalObject(439, Locker.Constructor(Vector3(1754.196f, 1762.352f, 80.5553f)), owning_building_guid = 31)
      LocalObject(440, Locker.Constructor(Vector3(1754.77f, 1763.237f, 80.5553f)), owning_building_guid = 31)
      LocalObject(529, Locker.Constructor(Vector3(1747.609f, 1744.234f, 90.6473f)), owning_building_guid = 31)
      LocalObject(530, Locker.Constructor(Vector3(1748.476f, 1743.67f, 90.6473f)), owning_building_guid = 31)
      LocalObject(531, Locker.Constructor(Vector3(1750.591f, 1742.297f, 90.4183f)), owning_building_guid = 31)
      LocalObject(532, Locker.Constructor(Vector3(1751.458f, 1741.734f, 90.4183f)), owning_building_guid = 31)
      LocalObject(533, Locker.Constructor(Vector3(1752.343f, 1741.16f, 90.4183f)), owning_building_guid = 31)
      LocalObject(534, Locker.Constructor(Vector3(1753.21f, 1740.596f, 90.4183f)), owning_building_guid = 31)
      LocalObject(535, Locker.Constructor(Vector3(1755.321f, 1739.226f, 90.6473f)), owning_building_guid = 31)
      LocalObject(536, Locker.Constructor(Vector3(1756.188f, 1738.662f, 90.6473f)), owning_building_guid = 31)
      LocalObject(
        79,
        Terminal.Constructor(Vector3(1690.205f, 1764.18f, 80.6373f), cert_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        80,
        Terminal.Constructor(Vector3(1690.63f, 1762.177f, 80.6373f), cert_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        81,
        Terminal.Constructor(Vector3(1696.774f, 1758.188f, 80.6373f), cert_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        82,
        Terminal.Constructor(Vector3(1697.122f, 1774.831f, 80.6373f), cert_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        83,
        Terminal.Constructor(Vector3(1698.777f, 1758.613f, 80.6373f), cert_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        84,
        Terminal.Constructor(Vector3(1699.125f, 1775.257f, 80.6373f), cert_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        85,
        Terminal.Constructor(Vector3(1705.268f, 1771.268f, 80.6373f), cert_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        86,
        Terminal.Constructor(Vector3(1705.694f, 1769.265f, 80.6373f), cert_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        595,
        Terminal.Constructor(Vector3(1722.549f, 1726.778f, 91.9423f), order_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        596,
        Terminal.Constructor(Vector3(1733.64f, 1753.775f, 82.2373f), order_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        597,
        Terminal.Constructor(Vector3(1736.818f, 1751.711f, 82.2373f), order_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        598,
        Terminal.Constructor(Vector3(1739.947f, 1749.679f, 82.2373f), order_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        846,
        Terminal.Constructor(Vector3(1682.002f, 1764.36f, 82.2603f), spawn_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        847,
        Terminal.Constructor(Vector3(1714.712f, 1696.13f, 82.2603f), spawn_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        848,
        Terminal.Constructor(Vector3(1723.759f, 1743.875f, 82.7813f), spawn_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        849,
        Terminal.Constructor(Vector3(1729.87f, 1739.903f, 82.7813f), spawn_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        850,
        Terminal.Constructor(Vector3(1735.988f, 1735.935f, 82.7813f), spawn_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        851,
        Terminal.Constructor(Vector3(1748.478f, 1724.168f, 92.2263f), spawn_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        852,
        Terminal.Constructor(Vector3(1774.697f, 1685.685f, 84.7603f), spawn_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        917,
        Terminal.Constructor(Vector3(1809.486f, 1727.144f, 92.9523f), vehicle_terminal_combined),
        owning_building_guid = 31
      )
      LocalObject(
        576,
        VehicleSpawnPad.Constructor(Vector3(1802.133f, 1715.656f, 88.7943f), mb_pad_creation, Vector3(0, 0, 213)),
        owning_building_guid = 31,
        terminal_guid = 917
      )
      LocalObject(798, ResourceSilo.Constructor(Vector3(1660.528f, 1707.152f, 97.6643f)), owning_building_guid = 31)
      LocalObject(
        809,
        SpawnTube.Constructor(Vector3(1722.151f, 1744.041f, 80.6473f), Vector3(0, 0, 303)),
        owning_building_guid = 31
      )
      LocalObject(
        810,
        SpawnTube.Constructor(Vector3(1728.263f, 1740.072f, 80.6473f), Vector3(0, 0, 303)),
        owning_building_guid = 31
      )
      LocalObject(
        811,
        SpawnTube.Constructor(Vector3(1734.378f, 1736.101f, 80.6473f), Vector3(0, 0, 303)),
        owning_building_guid = 31
      )
      LocalObject(
        70,
        ProximityTerminal.Constructor(Vector3(1743.041f, 1727.792f, 90.4573f), adv_med_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        578,
        ProximityTerminal.Constructor(Vector3(1747.74f, 1755.335f, 80.6473f), medical_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        657,
        ProximityTerminal.Constructor(Vector3(1682.89f, 1746.725f, 98.9893f), pad_landing_frame),
        owning_building_guid = 31
      )
      LocalObject(
        658,
        Terminal.Constructor(Vector3(1682.89f, 1746.725f, 98.9893f), air_rearm_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        660,
        ProximityTerminal.Constructor(Vector3(1698.768f, 1755.756f, 100.9793f), pad_landing_frame),
        owning_building_guid = 31
      )
      LocalObject(
        661,
        Terminal.Constructor(Vector3(1698.768f, 1755.756f, 100.9793f), air_rearm_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        663,
        ProximityTerminal.Constructor(Vector3(1778.079f, 1681.071f, 100.9403f), pad_landing_frame),
        owning_building_guid = 31
      )
      LocalObject(
        664,
        Terminal.Constructor(Vector3(1778.079f, 1681.071f, 100.9403f), air_rearm_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        669,
        ProximityTerminal.Constructor(Vector3(1793.074f, 1690.787f, 98.9993f), pad_landing_frame),
        owning_building_guid = 31
      )
      LocalObject(
        670,
        Terminal.Constructor(Vector3(1793.074f, 1690.787f, 98.9993f), air_rearm_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        774,
        ProximityTerminal.Constructor(Vector3(1751.308f, 1782.694f, 90.3973f), repair_silo),
        owning_building_guid = 31
      )
      LocalObject(
        775,
        Terminal.Constructor(Vector3(1751.308f, 1782.694f, 90.3973f), ground_rearm_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        778,
        ProximityTerminal.Constructor(Vector3(1787.837f, 1654.037f, 90.3973f), repair_silo),
        owning_building_guid = 31
      )
      LocalObject(
        779,
        Terminal.Constructor(Vector3(1787.837f, 1654.037f, 90.3973f), ground_rearm_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        546,
        FacilityTurret.Constructor(Vector3(1629.51f, 1713.773f, 99.0493f), manned_turret),
        owning_building_guid = 31
      )
      TurretToWeapon(546, 5012)
      LocalObject(
        547,
        FacilityTurret.Constructor(Vector3(1679.36f, 1792.615f, 99.0493f), manned_turret),
        owning_building_guid = 31
      )
      TurretToWeapon(547, 5013)
      LocalObject(
        549,
        FacilityTurret.Constructor(Vector3(1739.014f, 1805.323f, 99.0493f), manned_turret),
        owning_building_guid = 31
      )
      TurretToWeapon(549, 5014)
      LocalObject(
        551,
        FacilityTurret.Constructor(Vector3(1778.037f, 1617.328f, 99.0493f), manned_turret),
        owning_building_guid = 31
      )
      TurretToWeapon(551, 5015)
      LocalObject(
        554,
        FacilityTurret.Constructor(Vector3(1851.693f, 1730.733f, 99.0493f), manned_turret),
        owning_building_guid = 31
      )
      TurretToWeapon(554, 5016)
      LocalObject(
        296,
        ImplantTerminalMech.Constructor(Vector3(1691.387f, 1770.96f, 80.1243f)),
        owning_building_guid = 31
      )
      LocalObject(
        294,
        Terminal.Constructor(Vector3(1691.402f, 1770.95f, 80.1243f), implant_terminal_interface),
        owning_building_guid = 31
      )
      TerminalToInterface(296, 294)
      LocalObject(
        297,
        ImplantTerminalMech.Constructor(Vector3(1704.272f, 1762.607f, 80.1243f)),
        owning_building_guid = 31
      )
      LocalObject(
        295,
        Terminal.Constructor(Vector3(1704.257f, 1762.616f, 80.1243f), implant_terminal_interface),
        owning_building_guid = 31
      )
      TerminalToInterface(297, 295)
      LocalObject(720, Painbox.Constructor(Vector3(1755.54f, 1723.98f, 104.6761f), painbox), owning_building_guid = 31)
      LocalObject(
        723,
        Painbox.Constructor(Vector3(1737.567f, 1746.573f, 84.7172f), painbox_continuous),
        owning_building_guid = 31
      )
      LocalObject(
        726,
        Painbox.Constructor(Vector3(1742.641f, 1730.674f, 104.8812f), painbox_door_radius),
        owning_building_guid = 31
      )
      LocalObject(
        729,
        Painbox.Constructor(Vector3(1721.153f, 1754.565f, 82.3615f), painbox_door_radius_continuous),
        owning_building_guid = 31
      )
      LocalObject(
        730,
        Painbox.Constructor(Vector3(1735.208f, 1763.759f, 84.1882f), painbox_door_radius_continuous),
        owning_building_guid = 31
      )
      LocalObject(
        731,
        Painbox.Constructor(Vector3(1743.591f, 1737.637f, 83.0032f), painbox_door_radius_continuous),
        owning_building_guid = 31
      )
      LocalObject(95, Generator.Constructor(Vector3(1757.947f, 1720.547f, 99.3533f)), owning_building_guid = 31)
      LocalObject(
        92,
        Terminal.Constructor(Vector3(1751.051f, 1724.969f, 100.6473f), gen_control),
        owning_building_guid = 31
      )
    }

    Building6()

    def Building6(): Unit = { // Name: Bravo_Middle Type: tower_a GUID: 34, MapID: 6
      LocalBuilding(
        "Bravo_Middle",
        34,
        6,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(1290f, 1584f, 70.50996f), Vector3(0f, 0f, 57f), tower_a)
        )
      )
      LocalObject(
        835,
        CaptureTerminal.Constructor(Vector3(1299.12f, 1597.855f, 80.50896f), secondary_capture),
        owning_building_guid = 34
      )
      LocalObject(103, Door.Constructor(Vector3(1289.826f, 1598.421f, 72.03097f)), owning_building_guid = 34)
      LocalObject(104, Door.Constructor(Vector3(1289.826f, 1598.421f, 92.02997f)), owning_building_guid = 34)
      LocalObject(108, Door.Constructor(Vector3(1303.245f, 1589.707f, 72.03097f)), owning_building_guid = 34)
      LocalObject(109, Door.Constructor(Vector3(1303.245f, 1589.707f, 92.02997f)), owning_building_guid = 34)
      LocalObject(866, Door.Constructor(Vector3(1291.706f, 1596.182f, 61.84596f)), owning_building_guid = 34)
      LocalObject(868, Door.Constructor(Vector3(1305.469f, 1587.245f, 61.84596f)), owning_building_guid = 34)
      LocalObject(
        306,
        IFFLock.Constructor(Vector3(1288.033f, 1597.149f, 71.97096f), Vector3(0, 0, 303)),
        owning_building_guid = 34,
        door_guid = 103
      )
      LocalObject(
        307,
        IFFLock.Constructor(Vector3(1288.033f, 1597.149f, 91.97096f), Vector3(0, 0, 303)),
        owning_building_guid = 34,
        door_guid = 104
      )
      LocalObject(
        310,
        IFFLock.Constructor(Vector3(1305.04f, 1590.982f, 71.97096f), Vector3(0, 0, 123)),
        owning_building_guid = 34,
        door_guid = 108
      )
      LocalObject(
        311,
        IFFLock.Constructor(Vector3(1305.04f, 1590.982f, 91.97096f), Vector3(0, 0, 123)),
        owning_building_guid = 34,
        door_guid = 109
      )
      LocalObject(390, Locker.Constructor(Vector3(1292.846f, 1600.932f, 60.50396f)), owning_building_guid = 34)
      LocalObject(391, Locker.Constructor(Vector3(1293.574f, 1602.054f, 60.50396f)), owning_building_guid = 34)
      LocalObject(394, Locker.Constructor(Vector3(1295.019f, 1604.279f, 60.50396f)), owning_building_guid = 34)
      LocalObject(395, Locker.Constructor(Vector3(1295.783f, 1605.455f, 60.50396f)), owning_building_guid = 34)
      LocalObject(397, Locker.Constructor(Vector3(1311.171f, 1588.991f, 60.50396f)), owning_building_guid = 34)
      LocalObject(399, Locker.Constructor(Vector3(1311.899f, 1590.112f, 60.50396f)), owning_building_guid = 34)
      LocalObject(401, Locker.Constructor(Vector3(1313.363f, 1592.366f, 60.50396f)), owning_building_guid = 34)
      LocalObject(403, Locker.Constructor(Vector3(1314.126f, 1593.542f, 60.50396f)), owning_building_guid = 34)
      LocalObject(
        584,
        Terminal.Constructor(Vector3(1300.645f, 1602.657f, 61.84196f), order_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        586,
        Terminal.Constructor(Vector3(1305.158f, 1599.727f, 61.84196f), order_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        588,
        Terminal.Constructor(Vector3(1309.958f, 1596.609f, 61.84196f), order_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        802,
        SpawnTube.Constructor(Vector3(1292.349f, 1595.24f, 59.99197f), respawn_tube_tower, Vector3(0, 0, 303)),
        owning_building_guid = 34
      )
      LocalObject(
        804,
        SpawnTube.Constructor(Vector3(1306.111f, 1586.303f, 59.99197f), respawn_tube_tower, Vector3(0, 0, 303)),
        owning_building_guid = 34
      )
      LocalObject(
        541,
        FacilityTurret.Constructor(Vector3(1291.677f, 1609.914f, 89.45197f), manned_turret),
        owning_building_guid = 34
      )
      TurretToWeapon(541, 5017)
      LocalObject(
        542,
        FacilityTurret.Constructor(Vector3(1293.749f, 1566.446f, 89.45197f), manned_turret),
        owning_building_guid = 34
      )
      TurretToWeapon(542, 5018)
      LocalObject(
        739,
        Painbox.Constructor(Vector3(1297.449f, 1599.301f, 60.60996f), painbox_radius_continuous),
        owning_building_guid = 34
      )
      LocalObject(
        740,
        Painbox.Constructor(Vector3(1298.048f, 1585.015f, 62.00906f), painbox_radius_continuous),
        owning_building_guid = 34
      )
      LocalObject(
        743,
        Painbox.Constructor(Vector3(1307.445f, 1592.911f, 60.60996f), painbox_radius_continuous),
        owning_building_guid = 34
      )
    }

    Building4()

    def Building4(): Unit = { // Name: Alpha_Middle Type: tower_a GUID: 35, MapID: 4
      LocalBuilding(
        "Alpha_Middle",
        35,
        4,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(1406f, 2676f, 73.84014f), Vector3(0f, 0f, 9f), tower_a)
        )
      )
      LocalObject(
        836,
        CaptureTerminal.Constructor(Vector3(1422.399f, 2678.493f, 83.83914f), secondary_capture),
        owning_building_guid = 35
      )
      LocalObject(113, Door.Constructor(Vector3(1416.601f, 2685.779f, 75.36115f)), owning_building_guid = 35)
      LocalObject(114, Door.Constructor(Vector3(1416.601f, 2685.779f, 95.36014f)), owning_building_guid = 35)
      LocalObject(115, Door.Constructor(Vector3(1419.104f, 2669.976f, 75.36115f)), owning_building_guid = 35)
      LocalObject(116, Door.Constructor(Vector3(1419.104f, 2669.976f, 95.36014f)), owning_building_guid = 35)
      LocalObject(870, Door.Constructor(Vector3(1416.195f, 2682.884f, 65.17614f)), owning_building_guid = 35)
      LocalObject(871, Door.Constructor(Vector3(1418.762f, 2666.676f, 65.17614f)), owning_building_guid = 35)
      LocalObject(
        315,
        IFFLock.Constructor(Vector3(1414.456f, 2686.26f, 75.30114f), Vector3(0, 0, 351)),
        owning_building_guid = 35,
        door_guid = 113
      )
      LocalObject(
        316,
        IFFLock.Constructor(Vector3(1414.456f, 2686.26f, 95.30114f), Vector3(0, 0, 351)),
        owning_building_guid = 35,
        door_guid = 114
      )
      LocalObject(
        317,
        IFFLock.Constructor(Vector3(1421.252f, 2669.495f, 75.30114f), Vector3(0, 0, 171)),
        owning_building_guid = 35,
        door_guid = 115
      )
      LocalObject(
        318,
        IFFLock.Constructor(Vector3(1421.252f, 2669.495f, 95.30114f), Vector3(0, 0, 171)),
        owning_building_guid = 35,
        door_guid = 116
      )
      LocalObject(406, Locker.Constructor(Vector3(1420.488f, 2685.215f, 63.83414f)), owning_building_guid = 35)
      LocalObject(407, Locker.Constructor(Vector3(1421.808f, 2685.424f, 63.83414f)), owning_building_guid = 35)
      LocalObject(410, Locker.Constructor(Vector3(1423.875f, 2663.607f, 63.83414f)), owning_building_guid = 35)
      LocalObject(411, Locker.Constructor(Vector3(1424.429f, 2685.839f, 63.83414f)), owning_building_guid = 35)
      LocalObject(412, Locker.Constructor(Vector3(1425.195f, 2663.816f, 63.83414f)), owning_building_guid = 35)
      LocalObject(413, Locker.Constructor(Vector3(1425.813f, 2686.058f, 63.83414f)), owning_building_guid = 35)
      LocalObject(414, Locker.Constructor(Vector3(1427.85f, 2664.236f, 63.83414f)), owning_building_guid = 35)
      LocalObject(416, Locker.Constructor(Vector3(1429.235f, 2664.456f, 63.83414f)), owning_building_guid = 35)
      LocalObject(
        590,
        Terminal.Constructor(Vector3(1426.988f, 2680.573f, 65.17214f), order_terminal),
        owning_building_guid = 35
      )
      LocalObject(
        591,
        Terminal.Constructor(Vector3(1427.83f, 2675.259f, 65.17214f), order_terminal),
        owning_building_guid = 35
      )
      LocalObject(
        592,
        Terminal.Constructor(Vector3(1428.725f, 2669.605f, 65.17214f), order_terminal),
        owning_building_guid = 35
      )
      LocalObject(
        806,
        SpawnTube.Constructor(Vector3(1415.925f, 2681.776f, 63.32214f), respawn_tube_tower, Vector3(0, 0, 351)),
        owning_building_guid = 35
      )
      LocalObject(
        807,
        SpawnTube.Constructor(Vector3(1418.492f, 2665.568f, 63.32214f), respawn_tube_tower, Vector3(0, 0, 351)),
        owning_building_guid = 35
      )
      LocalObject(
        544,
        FacilityTurret.Constructor(Vector3(1395.464f, 2661.468f, 92.78214f), manned_turret),
        owning_building_guid = 35
      )
      TurretToWeapon(544, 5019)
      LocalObject(
        545,
        FacilityTurret.Constructor(Vector3(1426.38f, 2692.093f, 92.78214f), manned_turret),
        owning_building_guid = 35
      )
      TurretToWeapon(545, 5020)
      LocalObject(
        744,
        Painbox.Constructor(Vector3(1412.14f, 2670.698f, 65.33924f), painbox_radius_continuous),
        owning_building_guid = 35
      )
      LocalObject(
        746,
        Painbox.Constructor(Vector3(1422.355f, 2680.703f, 63.94014f), painbox_radius_continuous),
        owning_building_guid = 35
      )
      LocalObject(
        748,
        Painbox.Constructor(Vector3(1424.296f, 2668.999f, 63.94014f), painbox_radius_continuous),
        owning_building_guid = 35
      )
    }

    Building1()

    def Building1(): Unit = { // Name: Charlie_Middle Type: tower_a GUID: 36, MapID: 1
      LocalBuilding(
        "Charlie_Middle",
        36,
        1,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(2494f, 1628f, 70.50996f), Vector3(0f, 0f, 275f), tower_a)
        )
      )
      LocalObject(
        843,
        CaptureTerminal.Constructor(Vector3(2495.343f, 1611.467f, 80.50896f), secondary_capture),
        owning_building_guid = 36
      )
      LocalObject(180, Door.Constructor(Vector3(2487.076f, 1615.348f, 72.03097f)), owning_building_guid = 36)
      LocalObject(181, Door.Constructor(Vector3(2487.076f, 1615.348f, 92.02997f)), owning_building_guid = 36)
      LocalObject(182, Door.Constructor(Vector3(2503.015f, 1616.743f, 72.03097f)), owning_building_guid = 36)
      LocalObject(183, Door.Constructor(Vector3(2503.015f, 1616.743f, 92.02997f)), owning_building_guid = 36)
      LocalObject(889, Door.Constructor(Vector3(2483.808f, 1615.92f, 61.84596f)), owning_building_guid = 36)
      LocalObject(890, Door.Constructor(Vector3(2500.156f, 1617.35f, 61.84596f)), owning_building_guid = 36)
      LocalObject(
        363,
        IFFLock.Constructor(Vector3(2486.447f, 1613.239f, 71.97096f), Vector3(0, 0, 265)),
        owning_building_guid = 36,
        door_guid = 180
      )
      LocalObject(
        364,
        IFFLock.Constructor(Vector3(2486.447f, 1613.239f, 91.97096f), Vector3(0, 0, 265)),
        owning_building_guid = 36,
        door_guid = 181
      )
      LocalObject(
        365,
        IFFLock.Constructor(Vector3(2503.645f, 1618.849f, 71.97096f), Vector3(0, 0, 85)),
        owning_building_guid = 36,
        door_guid = 182
      )
      LocalObject(
        366,
        IFFLock.Constructor(Vector3(2503.645f, 1618.849f, 91.97096f), Vector3(0, 0, 85)),
        owning_building_guid = 36,
        door_guid = 183
      )
      LocalObject(493, Locker.Constructor(Vector3(2480.39f, 1611.033f, 60.50396f)), owning_building_guid = 36)
      LocalObject(494, Locker.Constructor(Vector3(2480.506f, 1609.701f, 60.50396f)), owning_building_guid = 36)
      LocalObject(495, Locker.Constructor(Vector3(2480.741f, 1607.024f, 60.50396f)), owning_building_guid = 36)
      LocalObject(496, Locker.Constructor(Vector3(2480.863f, 1605.627f, 60.50396f)), owning_building_guid = 36)
      LocalObject(497, Locker.Constructor(Vector3(2502.182f, 1612.905f, 60.50396f)), owning_building_guid = 36)
      LocalObject(498, Locker.Constructor(Vector3(2502.298f, 1611.573f, 60.50396f)), owning_building_guid = 36)
      LocalObject(499, Locker.Constructor(Vector3(2502.53f, 1608.93f, 60.50396f)), owning_building_guid = 36)
      LocalObject(500, Locker.Constructor(Vector3(2502.652f, 1607.533f, 60.50396f)), owning_building_guid = 36)
      LocalObject(
        621,
        Terminal.Constructor(Vector3(2486.036f, 1605.776f, 61.84196f), order_terminal),
        owning_building_guid = 36
      )
      LocalObject(
        622,
        Terminal.Constructor(Vector3(2491.738f, 1606.275f, 61.84196f), order_terminal),
        owning_building_guid = 36
      )
      LocalObject(
        623,
        Terminal.Constructor(Vector3(2497.098f, 1606.744f, 61.84196f), order_terminal),
        owning_building_guid = 36
      )
      LocalObject(
        825,
        SpawnTube.Constructor(Vector3(2482.722f, 1616.266f, 59.99197f), respawn_tube_tower, Vector3(0, 0, 85)),
        owning_building_guid = 36
      )
      LocalObject(
        826,
        SpawnTube.Constructor(Vector3(2499.069f, 1617.697f, 59.99197f), respawn_tube_tower, Vector3(0, 0, 85)),
        owning_building_guid = 36
      )
      LocalObject(
        565,
        FacilityTurret.Constructor(Vector3(2480.238f, 1639.524f, 89.45197f), manned_turret),
        owning_building_guid = 36
      )
      TurretToWeapon(565, 5021)
      LocalObject(
        566,
        FacilityTurret.Constructor(Vector3(2508.632f, 1606.547f, 89.45197f), manned_turret),
        owning_building_guid = 36
      )
      TurretToWeapon(566, 5022)
      LocalObject(
        765,
        Painbox.Constructor(Vector3(2485.739f, 1610.237f, 60.60996f), painbox_radius_continuous),
        owning_building_guid = 36
      )
      LocalObject(
        766,
        Painbox.Constructor(Vector3(2488.283f, 1622.245f, 62.00906f), painbox_radius_continuous),
        owning_building_guid = 36
      )
      LocalObject(
        767,
        Painbox.Constructor(Vector3(2497.55f, 1611.357f, 60.60996f), painbox_radius_continuous),
        owning_building_guid = 36
      )
    }

    Building13()

    def Building13(): Unit = { // Name: Alpha_Gate_Tower Type: tower_b GUID: 37, MapID: 13
      LocalBuilding(
        "Alpha_Gate_Tower",
        37,
        13,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(1408f, 1176f, 12.08533f), Vector3(0f, 0f, 27f), tower_b)
        )
      )
      LocalObject(
        837,
        CaptureTerminal.Constructor(Vector3(1422.826f, 1183.439f, 32.08433f), secondary_capture),
        owning_building_guid = 37
      )
      LocalObject(110, Door.Constructor(Vector3(1415.06f, 1188.576f, 13.60533f)), owning_building_guid = 37)
      LocalObject(111, Door.Constructor(Vector3(1415.06f, 1188.576f, 23.60533f)), owning_building_guid = 37)
      LocalObject(112, Door.Constructor(Vector3(1415.06f, 1188.576f, 43.60533f)), owning_building_guid = 37)
      LocalObject(117, Door.Constructor(Vector3(1422.324f, 1174.32f, 13.60533f)), owning_building_guid = 37)
      LocalObject(118, Door.Constructor(Vector3(1422.324f, 1174.32f, 23.60533f)), owning_building_guid = 37)
      LocalObject(119, Door.Constructor(Vector3(1422.324f, 1174.32f, 43.60533f)), owning_building_guid = 37)
      LocalObject(869, Door.Constructor(Vector3(1415.569f, 1185.697f, 3.42133f)), owning_building_guid = 37)
      LocalObject(872, Door.Constructor(Vector3(1423.02f, 1171.076f, 3.42133f)), owning_building_guid = 37)
      LocalObject(
        312,
        IFFLock.Constructor(Vector3(1412.872f, 1188.371f, 13.54633f), Vector3(0, 0, 333)),
        owning_building_guid = 37,
        door_guid = 110
      )
      LocalObject(
        313,
        IFFLock.Constructor(Vector3(1412.872f, 1188.371f, 23.54633f), Vector3(0, 0, 333)),
        owning_building_guid = 37,
        door_guid = 111
      )
      LocalObject(
        314,
        IFFLock.Constructor(Vector3(1412.872f, 1188.371f, 43.54633f), Vector3(0, 0, 333)),
        owning_building_guid = 37,
        door_guid = 112
      )
      LocalObject(
        319,
        IFFLock.Constructor(Vector3(1424.516f, 1174.527f, 13.54633f), Vector3(0, 0, 153)),
        owning_building_guid = 37,
        door_guid = 117
      )
      LocalObject(
        320,
        IFFLock.Constructor(Vector3(1424.516f, 1174.527f, 23.54633f), Vector3(0, 0, 153)),
        owning_building_guid = 37,
        door_guid = 118
      )
      LocalObject(
        321,
        IFFLock.Constructor(Vector3(1424.516f, 1174.527f, 43.54633f), Vector3(0, 0, 153)),
        owning_building_guid = 37,
        door_guid = 119
      )
      LocalObject(404, Locker.Constructor(Vector3(1418.931f, 1189.241f, 2.07933f)), owning_building_guid = 37)
      LocalObject(405, Locker.Constructor(Vector3(1420.123f, 1189.848f, 2.07933f)), owning_building_guid = 37)
      LocalObject(408, Locker.Constructor(Vector3(1422.486f, 1191.052f, 2.07933f)), owning_building_guid = 37)
      LocalObject(409, Locker.Constructor(Vector3(1423.736f, 1191.689f, 2.07933f)), owning_building_guid = 37)
      LocalObject(415, Locker.Constructor(Vector3(1428.83f, 1169.737f, 2.07933f)), owning_building_guid = 37)
      LocalObject(417, Locker.Constructor(Vector3(1430.021f, 1170.344f, 2.07933f)), owning_building_guid = 37)
      LocalObject(418, Locker.Constructor(Vector3(1432.416f, 1171.564f, 2.07933f)), owning_building_guid = 37)
      LocalObject(419, Locker.Constructor(Vector3(1433.665f, 1172.201f, 2.07933f)), owning_building_guid = 37)
      LocalObject(
        589,
        Terminal.Constructor(Vector3(1426.548f, 1186.836f, 3.41733f), order_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        593,
        Terminal.Constructor(Vector3(1428.991f, 1182.041f, 3.41733f), order_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        594,
        Terminal.Constructor(Vector3(1431.59f, 1176.941f, 3.41733f), order_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        805,
        SpawnTube.Constructor(Vector3(1415.654f, 1184.56f, 1.56733f), respawn_tube_tower, Vector3(0, 0, 333)),
        owning_building_guid = 37
      )
      LocalObject(
        808,
        SpawnTube.Constructor(Vector3(1423.104f, 1169.938f, 1.56733f), respawn_tube_tower, Vector3(0, 0, 333)),
        owning_building_guid = 37
      )
      LocalObject(
        745,
        Painbox.Constructor(Vector3(1416.141f, 1172.122f, 3.37473f), painbox_radius_continuous),
        owning_building_guid = 37
      )
      LocalObject(
        747,
        Painbox.Constructor(Vector3(1422.422f, 1185.713f, 2.18533f), painbox_radius_continuous),
        owning_building_guid = 37
      )
      LocalObject(
        749,
        Painbox.Constructor(Vector3(1427.765f, 1174.935f, 2.18533f), painbox_radius_continuous),
        owning_building_guid = 37
      )
    }

    Building10()

    def Building10(): Unit = { // Name: Charlie_Gate_Tower Type: tower_b GUID: 38, MapID: 10
      LocalBuilding(
        "Charlie_Gate_Tower",
        38,
        10,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(2334f, 2784f, 12.08533f), Vector3(0f, 0f, 235f), tower_b)
        )
      )
      LocalObject(
        842,
        CaptureTerminal.Constructor(Vector3(2324.402f, 2770.472f, 32.08433f), secondary_capture),
        owning_building_guid = 38
      )
      LocalObject(174, Door.Constructor(Vector3(2320.564f, 2778.759f, 13.60533f)), owning_building_guid = 38)
      LocalObject(175, Door.Constructor(Vector3(2320.564f, 2778.759f, 23.60533f)), owning_building_guid = 38)
      LocalObject(176, Door.Constructor(Vector3(2320.564f, 2778.759f, 43.60533f)), owning_building_guid = 38)
      LocalObject(177, Door.Constructor(Vector3(2333.67f, 2769.582f, 13.60533f)), owning_building_guid = 38)
      LocalObject(178, Door.Constructor(Vector3(2333.67f, 2769.582f, 23.60533f)), owning_building_guid = 38)
      LocalObject(179, Door.Constructor(Vector3(2333.67f, 2769.582f, 43.60533f)), owning_building_guid = 38)
      LocalObject(887, Door.Constructor(Vector3(2318.427f, 2781.296f, 3.42133f)), owning_building_guid = 38)
      LocalObject(888, Door.Constructor(Vector3(2331.869f, 2771.884f, 3.42133f)), owning_building_guid = 38)
      LocalObject(
        357,
        IFFLock.Constructor(Vector3(2318.726f, 2777.547f, 13.54633f), Vector3(0, 0, 305)),
        owning_building_guid = 38,
        door_guid = 174
      )
      LocalObject(
        358,
        IFFLock.Constructor(Vector3(2318.726f, 2777.547f, 23.54633f), Vector3(0, 0, 305)),
        owning_building_guid = 38,
        door_guid = 175
      )
      LocalObject(
        359,
        IFFLock.Constructor(Vector3(2318.726f, 2777.547f, 43.54633f), Vector3(0, 0, 305)),
        owning_building_guid = 38,
        door_guid = 176
      )
      LocalObject(
        360,
        IFFLock.Constructor(Vector3(2335.506f, 2770.79f, 13.54633f), Vector3(0, 0, 125)),
        owning_building_guid = 38,
        door_guid = 177
      )
      LocalObject(
        361,
        IFFLock.Constructor(Vector3(2335.506f, 2770.79f, 23.54633f), Vector3(0, 0, 125)),
        owning_building_guid = 38,
        door_guid = 178
      )
      LocalObject(
        362,
        IFFLock.Constructor(Vector3(2335.506f, 2770.79f, 43.54633f), Vector3(0, 0, 125)),
        owning_building_guid = 38,
        door_guid = 179
      )
      LocalObject(485, Locker.Constructor(Vector3(2309.555f, 2775.306f, 2.07933f)), owning_building_guid = 38)
      LocalObject(486, Locker.Constructor(Vector3(2310.359f, 2776.454f, 2.07933f)), owning_building_guid = 38)
      LocalObject(487, Locker.Constructor(Vector3(2311.901f, 2778.656f, 2.07933f)), owning_building_guid = 38)
      LocalObject(488, Locker.Constructor(Vector3(2312.668f, 2779.751f, 2.07933f)), owning_building_guid = 38)
      LocalObject(489, Locker.Constructor(Vector3(2327.472f, 2762.76f, 2.07933f)), owning_building_guid = 38)
      LocalObject(490, Locker.Constructor(Vector3(2328.276f, 2763.909f, 2.07933f)), owning_building_guid = 38)
      LocalObject(491, Locker.Constructor(Vector3(2329.798f, 2766.082f, 2.07933f)), owning_building_guid = 38)
      LocalObject(492, Locker.Constructor(Vector3(2330.564f, 2767.177f, 2.07933f)), owning_building_guid = 38)
      LocalObject(
        618,
        Terminal.Constructor(Vector3(2313.613f, 2772.094f, 3.41733f), order_terminal),
        owning_building_guid = 38
      )
      LocalObject(
        619,
        Terminal.Constructor(Vector3(2318.302f, 2768.811f, 3.41733f), order_terminal),
        owning_building_guid = 38
      )
      LocalObject(
        620,
        Terminal.Constructor(Vector3(2322.71f, 2765.725f, 3.41733f), order_terminal),
        owning_building_guid = 38
      )
      LocalObject(
        823,
        SpawnTube.Constructor(Vector3(2317.818f, 2782.261f, 1.56733f), respawn_tube_tower, Vector3(0, 0, 125)),
        owning_building_guid = 38
      )
      LocalObject(
        824,
        SpawnTube.Constructor(Vector3(2331.26f, 2772.849f, 1.56733f), respawn_tube_tower, Vector3(0, 0, 125)),
        owning_building_guid = 38
      )
      LocalObject(
        762,
        Painbox.Constructor(Vector3(2316.049f, 2775.661f, 2.18533f), painbox_radius_continuous),
        owning_building_guid = 38
      )
      LocalObject(
        763,
        Painbox.Constructor(Vector3(2324.992f, 2783.602f, 3.37473f), painbox_radius_continuous),
        owning_building_guid = 38
      )
      LocalObject(
        764,
        Painbox.Constructor(Vector3(2325.826f, 2768.654f, 2.18533f), painbox_radius_continuous),
        owning_building_guid = 38
      )
    }

    Building11()

    def Building11(): Unit = { // Name: Bravo_Gate_Tower Type: tower_b GUID: 39, MapID: 11
      LocalBuilding(
        "Bravo_Gate_Tower",
        39,
        11,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(2870f, 1410f, 14.09711f), Vector3(0f, 0f, 125f), tower_b)
        )
      )
      LocalObject(
        845,
        CaptureTerminal.Constructor(Vector3(2860.57f, 1423.646f, 34.09611f), secondary_capture),
        owning_building_guid = 39
      )
      LocalObject(213, Door.Constructor(Vector3(2856.564f, 1415.241f, 15.61711f)), owning_building_guid = 39)
      LocalObject(214, Door.Constructor(Vector3(2856.564f, 1415.241f, 25.61711f)), owning_building_guid = 39)
      LocalObject(215, Door.Constructor(Vector3(2856.564f, 1415.241f, 45.61711f)), owning_building_guid = 39)
      LocalObject(216, Door.Constructor(Vector3(2869.67f, 1424.418f, 15.61711f)), owning_building_guid = 39)
      LocalObject(217, Door.Constructor(Vector3(2869.67f, 1424.418f, 25.61711f)), owning_building_guid = 39)
      LocalObject(218, Door.Constructor(Vector3(2869.67f, 1424.418f, 45.61711f)), owning_building_guid = 39)
      LocalObject(896, Door.Constructor(Vector3(2859.344f, 1416.146f, 5.43311f)), owning_building_guid = 39)
      LocalObject(897, Door.Constructor(Vector3(2872.786f, 1425.559f, 5.43311f)), owning_building_guid = 39)
      LocalObject(
        382,
        IFFLock.Constructor(Vector3(2857.071f, 1413.103f, 15.55811f), Vector3(0, 0, 235)),
        owning_building_guid = 39,
        door_guid = 213
      )
      LocalObject(
        383,
        IFFLock.Constructor(Vector3(2857.071f, 1413.103f, 25.55811f), Vector3(0, 0, 235)),
        owning_building_guid = 39,
        door_guid = 214
      )
      LocalObject(
        384,
        IFFLock.Constructor(Vector3(2857.071f, 1413.103f, 45.55811f), Vector3(0, 0, 235)),
        owning_building_guid = 39,
        door_guid = 215
      )
      LocalObject(
        385,
        IFFLock.Constructor(Vector3(2869.161f, 1426.56f, 15.55811f), Vector3(0, 0, 55)),
        owning_building_guid = 39,
        door_guid = 216
      )
      LocalObject(
        386,
        IFFLock.Constructor(Vector3(2869.161f, 1426.56f, 25.55811f), Vector3(0, 0, 55)),
        owning_building_guid = 39,
        door_guid = 217
      )
      LocalObject(
        387,
        IFFLock.Constructor(Vector3(2869.161f, 1426.56f, 45.55811f), Vector3(0, 0, 55)),
        owning_building_guid = 39,
        door_guid = 218
      )
      LocalObject(521, Locker.Constructor(Vector3(2852.274f, 1423.399f, 4.09111f)), owning_building_guid = 39)
      LocalObject(522, Locker.Constructor(Vector3(2853.078f, 1422.25f, 4.09111f)), owning_building_guid = 39)
      LocalObject(523, Locker.Constructor(Vector3(2854.6f, 1420.077f, 4.09111f)), owning_building_guid = 39)
      LocalObject(524, Locker.Constructor(Vector3(2855.367f, 1418.982f, 4.09111f)), owning_building_guid = 39)
      LocalObject(525, Locker.Constructor(Vector3(2870.19f, 1435.944f, 4.09111f)), owning_building_guid = 39)
      LocalObject(526, Locker.Constructor(Vector3(2870.995f, 1434.796f, 4.09111f)), owning_building_guid = 39)
      LocalObject(527, Locker.Constructor(Vector3(2872.536f, 1432.594f, 4.09111f)), owning_building_guid = 39)
      LocalObject(528, Locker.Constructor(Vector3(2873.303f, 1431.499f, 4.09111f)), owning_building_guid = 39)
      LocalObject(
        633,
        Terminal.Constructor(Vector3(2856.688f, 1426.86f, 5.42911f), order_terminal),
        owning_building_guid = 39
      )
      LocalObject(
        634,
        Terminal.Constructor(Vector3(2861.096f, 1429.946f, 5.42911f), order_terminal),
        owning_building_guid = 39
      )
      LocalObject(
        635,
        Terminal.Constructor(Vector3(2865.785f, 1433.229f, 5.42911f), order_terminal),
        owning_building_guid = 39
      )
      LocalObject(
        832,
        SpawnTube.Constructor(Vector3(2860.458f, 1416.388f, 3.57911f), respawn_tube_tower, Vector3(0, 0, 235)),
        owning_building_guid = 39
      )
      LocalObject(
        833,
        SpawnTube.Constructor(Vector3(2873.9f, 1425.801f, 3.57911f), respawn_tube_tower, Vector3(0, 0, 235)),
        owning_building_guid = 39
      )
      LocalObject(
        771,
        Painbox.Constructor(Vector3(2858.375f, 1422.93f, 4.19711f), painbox_radius_continuous),
        owning_building_guid = 39
      )
      LocalObject(
        772,
        Painbox.Constructor(Vector3(2868.304f, 1429.721f, 4.19711f), painbox_radius_continuous),
        owning_building_guid = 39
      )
      LocalObject(
        773,
        Painbox.Constructor(Vector3(2872.707f, 1418.601f, 5.38651f), painbox_radius_continuous),
        owning_building_guid = 39
      )
    }

    Building14()

    def Building14(): Unit = { // Name: Alpha_Bottom Type: tower_c GUID: 40, MapID: 14
      LocalBuilding(
        "Alpha_Bottom",
        40,
        14,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(1290f, 2082f, 34.21491f), Vector3(0f, 0f, 61f), tower_c)
        )
      )
      LocalObject(
        834,
        CaptureTerminal.Constructor(Vector3(1298.132f, 2096.458f, 44.21391f), secondary_capture),
        owning_building_guid = 40
      )
      LocalObject(101, Door.Constructor(Vector3(1288.821f, 2096.374f, 35.73591f)), owning_building_guid = 40)
      LocalObject(102, Door.Constructor(Vector3(1288.821f, 2096.374f, 55.73491f)), owning_building_guid = 40)
      LocalObject(106, Door.Constructor(Vector3(1302.815f, 2088.617f, 35.73591f)), owning_building_guid = 40)
      LocalObject(107, Door.Constructor(Vector3(1302.815f, 2088.617f, 55.73491f)), owning_building_guid = 40)
      LocalObject(865, Door.Constructor(Vector3(1290.852f, 2094.271f, 25.55091f)), owning_building_guid = 40)
      LocalObject(867, Door.Constructor(Vector3(1305.205f, 2086.316f, 25.55091f)), owning_building_guid = 40)
      LocalObject(
        304,
        IFFLock.Constructor(Vector3(1287.121f, 2094.98f, 35.67591f), Vector3(0, 0, 299)),
        owning_building_guid = 40,
        door_guid = 101
      )
      LocalObject(
        305,
        IFFLock.Constructor(Vector3(1287.121f, 2094.98f, 55.67591f), Vector3(0, 0, 299)),
        owning_building_guid = 40,
        door_guid = 102
      )
      LocalObject(
        308,
        IFFLock.Constructor(Vector3(1304.516f, 2090.014f, 35.67591f), Vector3(0, 0, 119)),
        owning_building_guid = 40,
        door_guid = 106
      )
      LocalObject(
        309,
        IFFLock.Constructor(Vector3(1304.516f, 2090.014f, 55.67591f), Vector3(0, 0, 119)),
        owning_building_guid = 40,
        door_guid = 107
      )
      LocalObject(388, Locker.Constructor(Vector3(1291.658f, 2099.09f, 24.20891f)), owning_building_guid = 40)
      LocalObject(389, Locker.Constructor(Vector3(1292.306f, 2100.259f, 24.20891f)), owning_building_guid = 40)
      LocalObject(392, Locker.Constructor(Vector3(1293.593f, 2102.58f, 24.20891f)), owning_building_guid = 40)
      LocalObject(393, Locker.Constructor(Vector3(1294.272f, 2103.806f, 24.20891f)), owning_building_guid = 40)
      LocalObject(396, Locker.Constructor(Vector3(1310.771f, 2088.456f, 24.20891f)), owning_building_guid = 40)
      LocalObject(398, Locker.Constructor(Vector3(1311.419f, 2089.625f, 24.20891f)), owning_building_guid = 40)
      LocalObject(400, Locker.Constructor(Vector3(1312.722f, 2091.976f, 24.20891f)), owning_building_guid = 40)
      LocalObject(402, Locker.Constructor(Vector3(1313.402f, 2093.202f, 24.20891f)), owning_building_guid = 40)
      LocalObject(
        583,
        Terminal.Constructor(Vector3(1299.318f, 2101.354f, 25.54691f), order_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        585,
        Terminal.Constructor(Vector3(1304.024f, 2098.746f, 25.54691f), order_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        587,
        Terminal.Constructor(Vector3(1309.03f, 2095.971f, 25.54691f), order_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        801,
        SpawnTube.Constructor(Vector3(1291.559f, 2093.376f, 23.69691f), respawn_tube_tower, Vector3(0, 0, 299)),
        owning_building_guid = 40
      )
      LocalObject(
        803,
        SpawnTube.Constructor(Vector3(1305.911f, 2085.421f, 23.69691f), respawn_tube_tower, Vector3(0, 0, 299)),
        owning_building_guid = 40
      )
      LocalObject(
        684,
        ProximityTerminal.Constructor(Vector3(1284.948f, 2083.551f, 61.78491f), pad_landing_tower_frame),
        owning_building_guid = 40
      )
      LocalObject(
        685,
        Terminal.Constructor(Vector3(1284.948f, 2083.551f, 61.78491f), air_rearm_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        687,
        ProximityTerminal.Constructor(Vector3(1294.084f, 2078.487f, 61.78491f), pad_landing_tower_frame),
        owning_building_guid = 40
      )
      LocalObject(
        688,
        Terminal.Constructor(Vector3(1294.084f, 2078.487f, 61.78491f), air_rearm_terminal),
        owning_building_guid = 40
      )
      LocalObject(
        540,
        FacilityTurret.Constructor(Vector3(1288.31f, 2109.802f, 53.15691f), manned_turret),
        owning_building_guid = 40
      )
      TurretToWeapon(540, 5023)
      LocalObject(
        543,
        FacilityTurret.Constructor(Vector3(1295.842f, 2061.692f, 53.15691f), manned_turret),
        owning_building_guid = 40
      )
      TurretToWeapon(543, 5024)
      LocalObject(
        738,
        Painbox.Constructor(Vector3(1296.528f, 2097.947f, 24.31491f), painbox_radius_continuous),
        owning_building_guid = 40
      )
      LocalObject(
        741,
        Painbox.Constructor(Vector3(1298.414f, 2082.429f, 26.23441f), painbox_radius_continuous),
        owning_building_guid = 40
      )
      LocalObject(
        742,
        Painbox.Constructor(Vector3(1307.353f, 2091.73f, 24.31491f), painbox_radius_continuous),
        owning_building_guid = 40
      )
    }

    Building5()

    def Building5(): Unit = { // Name: Bravo_Top Type: tower_c GUID: 41, MapID: 5
      LocalBuilding(
        "Bravo_Top",
        41,
        5,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(1894f, 2052f, 110.9848f), Vector3(0f, 0f, 274f), tower_c)
        )
      )
      LocalObject(
        838,
        CaptureTerminal.Constructor(Vector3(1895.054f, 2035.446f, 120.9838f), secondary_capture),
        owning_building_guid = 41
      )
      LocalObject(149, Door.Constructor(Vector3(1886.857f, 2039.471f, 112.5058f)), owning_building_guid = 41)
      LocalObject(150, Door.Constructor(Vector3(1886.857f, 2039.471f, 132.5048f)), owning_building_guid = 41)
      LocalObject(152, Door.Constructor(Vector3(1902.818f, 2040.587f, 112.5058f)), owning_building_guid = 41)
      LocalObject(153, Door.Constructor(Vector3(1902.818f, 2040.587f, 132.5048f)), owning_building_guid = 41)
      LocalObject(879, Door.Constructor(Vector3(1883.599f, 2040.099f, 102.3208f)), owning_building_guid = 41)
      LocalObject(880, Door.Constructor(Vector3(1899.969f, 2041.244f, 102.3208f)), owning_building_guid = 41)
      LocalObject(
        341,
        IFFLock.Constructor(Vector3(1886.19f, 2037.373f, 112.4458f), Vector3(0, 0, 266)),
        owning_building_guid = 41,
        door_guid = 149
      )
      LocalObject(
        342,
        IFFLock.Constructor(Vector3(1886.19f, 2037.373f, 132.4458f), Vector3(0, 0, 266)),
        owning_building_guid = 41,
        door_guid = 150
      )
      LocalObject(
        343,
        IFFLock.Constructor(Vector3(1903.484f, 2042.682f, 112.4458f), Vector3(0, 0, 86)),
        owning_building_guid = 41,
        door_guid = 152
      )
      LocalObject(
        344,
        IFFLock.Constructor(Vector3(1903.484f, 2042.682f, 132.4458f), Vector3(0, 0, 86)),
        owning_building_guid = 41,
        door_guid = 153
      )
      LocalObject(453, Locker.Constructor(Vector3(1880.096f, 2035.273f, 100.9788f)), owning_building_guid = 41)
      LocalObject(454, Locker.Constructor(Vector3(1880.189f, 2033.94f, 100.9788f)), owning_building_guid = 41)
      LocalObject(455, Locker.Constructor(Vector3(1880.377f, 2031.258f, 100.9788f)), owning_building_guid = 41)
      LocalObject(456, Locker.Constructor(Vector3(1880.474f, 2029.86f, 100.9788f)), owning_building_guid = 41)
      LocalObject(457, Locker.Constructor(Vector3(1901.917f, 2036.764f, 100.9788f)), owning_building_guid = 41)
      LocalObject(458, Locker.Constructor(Vector3(1902.01f, 2035.43f, 100.9788f)), owning_building_guid = 41)
      LocalObject(459, Locker.Constructor(Vector3(1902.195f, 2032.784f, 100.9788f)), owning_building_guid = 41)
      LocalObject(460, Locker.Constructor(Vector3(1902.293f, 2031.385f, 100.9788f)), owning_building_guid = 41)
      LocalObject(
        606,
        Terminal.Constructor(Vector3(1885.649f, 2029.919f, 102.3168f), order_terminal),
        owning_building_guid = 41
      )
      LocalObject(
        607,
        Terminal.Constructor(Vector3(1891.359f, 2030.318f, 102.3168f), order_terminal),
        owning_building_guid = 41
      )
      LocalObject(
        608,
        Terminal.Constructor(Vector3(1896.727f, 2030.693f, 102.3168f), order_terminal),
        owning_building_guid = 41
      )
      LocalObject(
        815,
        SpawnTube.Constructor(Vector3(1882.519f, 2040.465f, 100.4668f), respawn_tube_tower, Vector3(0, 0, 86)),
        owning_building_guid = 41
      )
      LocalObject(
        816,
        SpawnTube.Constructor(Vector3(1898.889f, 2041.61f, 100.4668f), respawn_tube_tower, Vector3(0, 0, 86)),
        owning_building_guid = 41
      )
      LocalObject(
        690,
        ProximityTerminal.Constructor(Vector3(1888.662f, 2052.722f, 138.5548f), pad_landing_tower_frame),
        owning_building_guid = 41
      )
      LocalObject(
        691,
        Terminal.Constructor(Vector3(1888.662f, 2052.722f, 138.5548f), air_rearm_terminal),
        owning_building_guid = 41
      )
      LocalObject(
        693,
        ProximityTerminal.Constructor(Vector3(1899.081f, 2053.451f, 138.5548f), pad_landing_tower_frame),
        owning_building_guid = 41
      )
      LocalObject(
        694,
        Terminal.Constructor(Vector3(1899.081f, 2053.451f, 138.5548f), air_rearm_terminal),
        owning_building_guid = 41
      )
      LocalObject(
        555,
        FacilityTurret.Constructor(Vector3(1878.04f, 2065.851f, 129.9268f), manned_turret),
        owning_building_guid = 41
      )
      TurretToWeapon(555, 5025)
      LocalObject(
        557,
        FacilityTurret.Constructor(Vector3(1910.56f, 2029.604f, 129.9268f), manned_turret),
        owning_building_guid = 41
      )
      TurretToWeapon(557, 5026)
      LocalObject(
        750,
        Painbox.Constructor(Vector3(1884.745f, 2034.389f, 101.0848f), painbox_radius_continuous),
        owning_building_guid = 41
      )
      LocalObject(
        751,
        Painbox.Constructor(Vector3(1887.177f, 2047.058f, 103.0043f), painbox_radius_continuous),
        owning_building_guid = 41
      )
      LocalObject(
        752,
        Painbox.Constructor(Vector3(1897.211f, 2035.07f, 101.0848f), painbox_radius_continuous),
        owning_building_guid = 41
      )
    }

    Building3()

    def Building3(): Unit = { // Name: Alpha_Top Type: tower_c GUID: 42, MapID: 3
      LocalBuilding(
        "Alpha_Top",
        42,
        3,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(2034f, 2332f, 114.5592f), Vector3(0f, 0f, 25f), tower_c)
        )
      )
      LocalObject(
        839,
        CaptureTerminal.Constructor(Vector3(2049.076f, 2338.917f, 124.5582f), secondary_capture),
        owning_building_guid = 42
      )
      LocalObject(158, Door.Constructor(Vector3(2041.495f, 2344.322f, 116.0802f)), owning_building_guid = 42)
      LocalObject(159, Door.Constructor(Vector3(2041.495f, 2344.322f, 136.0792f)), owning_building_guid = 42)
      LocalObject(160, Door.Constructor(Vector3(2048.257f, 2329.821f, 116.0802f)), owning_building_guid = 42)
      LocalObject(161, Door.Constructor(Vector3(2048.257f, 2329.821f, 136.0792f)), owning_building_guid = 42)
      LocalObject(881, Door.Constructor(Vector3(2041.902f, 2341.427f, 105.8952f)), owning_building_guid = 42)
      LocalObject(882, Door.Constructor(Vector3(2048.837f, 2326.554f, 105.8952f)), owning_building_guid = 42)
      LocalObject(
        345,
        IFFLock.Constructor(Vector3(2039.3f, 2344.193f, 116.0202f), Vector3(0, 0, 335)),
        owning_building_guid = 42,
        door_guid = 158
      )
      LocalObject(
        346,
        IFFLock.Constructor(Vector3(2039.3f, 2344.193f, 136.0202f), Vector3(0, 0, 335)),
        owning_building_guid = 42,
        door_guid = 159
      )
      LocalObject(
        347,
        IFFLock.Constructor(Vector3(2050.455f, 2329.951f, 116.0202f), Vector3(0, 0, 155)),
        owning_building_guid = 42,
        door_guid = 160
      )
      LocalObject(
        348,
        IFFLock.Constructor(Vector3(2050.455f, 2329.951f, 136.0202f), Vector3(0, 0, 155)),
        owning_building_guid = 42,
        door_guid = 161
      )
      LocalObject(461, Locker.Constructor(Vector3(2045.387f, 2344.851f, 104.5532f)), owning_building_guid = 42)
      LocalObject(462, Locker.Constructor(Vector3(2046.598f, 2345.416f, 104.5532f)), owning_building_guid = 42)
      LocalObject(463, Locker.Constructor(Vector3(2049.003f, 2346.538f, 104.5532f)), owning_building_guid = 42)
      LocalObject(464, Locker.Constructor(Vector3(2050.273f, 2347.13f, 104.5532f)), owning_building_guid = 42)
      LocalObject(465, Locker.Constructor(Vector3(2054.598f, 2325.014f, 104.5532f)), owning_building_guid = 42)
      LocalObject(466, Locker.Constructor(Vector3(2055.81f, 2325.579f, 104.5532f)), owning_building_guid = 42)
      LocalObject(467, Locker.Constructor(Vector3(2058.246f, 2326.715f, 104.5532f)), owning_building_guid = 42)
      LocalObject(468, Locker.Constructor(Vector3(2059.517f, 2327.307f, 104.5532f)), owning_building_guid = 42)
      LocalObject(
        609,
        Terminal.Constructor(Vector3(2052.914f, 2342.181f, 105.8912f), order_terminal),
        owning_building_guid = 42
      )
      LocalObject(
        610,
        Terminal.Constructor(Vector3(2055.188f, 2337.305f, 105.8912f), order_terminal),
        owning_building_guid = 42
      )
      LocalObject(
        611,
        Terminal.Constructor(Vector3(2057.607f, 2332.117f, 105.8912f), order_terminal),
        owning_building_guid = 42
      )
      LocalObject(
        817,
        SpawnTube.Constructor(Vector3(2041.948f, 2340.288f, 104.0412f), respawn_tube_tower, Vector3(0, 0, 335)),
        owning_building_guid = 42
      )
      LocalObject(
        818,
        SpawnTube.Constructor(Vector3(2048.883f, 2325.415f, 104.0412f), respawn_tube_tower, Vector3(0, 0, 335)),
        owning_building_guid = 42
      )
      LocalObject(
        696,
        ProximityTerminal.Constructor(Vector3(2030.824f, 2336.224f, 142.1292f), pad_landing_tower_frame),
        owning_building_guid = 42
      )
      LocalObject(
        697,
        Terminal.Constructor(Vector3(2030.824f, 2336.224f, 142.1292f), air_rearm_terminal),
        owning_building_guid = 42
      )
      LocalObject(
        699,
        ProximityTerminal.Constructor(Vector3(2035.239f, 2326.757f, 142.1292f), pad_landing_tower_frame),
        owning_building_guid = 42
      )
      LocalObject(
        700,
        Terminal.Constructor(Vector3(2035.239f, 2326.757f, 142.1292f), air_rearm_terminal),
        owning_building_guid = 42
      )
      LocalObject(
        559,
        FacilityTurret.Constructor(Vector3(2026.789f, 2312.136f, 133.5012f), manned_turret),
        owning_building_guid = 42
      )
      TurretToWeapon(559, 5027)
      LocalObject(
        560,
        FacilityTurret.Constructor(Vector3(2048.974f, 2355.486f, 133.5012f), manned_turret),
        owning_building_guid = 42
      )
      TurretToWeapon(560, 5028)
      LocalObject(
        753,
        Painbox.Constructor(Vector3(2041.059f, 2327.401f, 106.5787f), painbox_radius_continuous),
        owning_building_guid = 42
      )
      LocalObject(
        754,
        Painbox.Constructor(Vector3(2048.655f, 2341.065f, 104.6592f), painbox_radius_continuous),
        owning_building_guid = 42
      )
      LocalObject(
        755,
        Painbox.Constructor(Vector3(2053.758f, 2329.671f, 104.6592f), painbox_radius_continuous),
        owning_building_guid = 42
      )
    }

    Building12()

    def Building12(): Unit = { // Name: Bravo_Bottom Type: tower_c GUID: 43, MapID: 12
      LocalBuilding(
        "Bravo_Bottom",
        43,
        12,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(2122f, 1574f, 12.09021f), Vector3(0f, 0f, 187f), tower_c)
        )
      )
      LocalObject(
        840,
        CaptureTerminal.Constructor(Vector3(2105.524f, 1572.081f, 22.08921f), secondary_capture),
        owning_building_guid = 43
      )
      LocalObject(163, Door.Constructor(Vector3(2109.115f, 1580.478f, 13.61121f)), owning_building_guid = 43)
      LocalObject(164, Door.Constructor(Vector3(2109.115f, 1580.478f, 33.61021f)), owning_building_guid = 43)
      LocalObject(165, Door.Constructor(Vector3(2111.064f, 1564.597f, 13.61121f)), owning_building_guid = 43)
      LocalObject(166, Door.Constructor(Vector3(2111.064f, 1564.597f, 33.61021f)), owning_building_guid = 43)
      LocalObject(883, Door.Constructor(Vector3(2109.571f, 1583.764f, 3.426213f)), owning_building_guid = 43)
      LocalObject(884, Door.Constructor(Vector3(2111.571f, 1567.476f, 3.426213f)), owning_building_guid = 43)
      LocalObject(
        349,
        IFFLock.Constructor(Vector3(2106.984f, 1581.033f, 13.55121f), Vector3(0, 0, 353)),
        owning_building_guid = 43,
        door_guid = 163
      )
      LocalObject(
        350,
        IFFLock.Constructor(Vector3(2106.984f, 1581.033f, 33.55121f), Vector3(0, 0, 353)),
        owning_building_guid = 43,
        door_guid = 164
      )
      LocalObject(
        351,
        IFFLock.Constructor(Vector3(2113.191f, 1564.041f, 13.55121f), Vector3(0, 0, 173)),
        owning_building_guid = 43,
        door_guid = 165
      )
      LocalObject(
        352,
        IFFLock.Constructor(Vector3(2113.191f, 1564.041f, 33.55121f), Vector3(0, 0, 173)),
        owning_building_guid = 43,
        door_guid = 166
      )
      LocalObject(469, Locker.Constructor(Vector3(2099.182f, 1586.348f, 2.084213f)), owning_building_guid = 43)
      LocalObject(470, Locker.Constructor(Vector3(2100.574f, 1586.519f, 2.084213f)), owning_building_guid = 43)
      LocalObject(471, Locker.Constructor(Vector3(2101.848f, 1564.639f, 2.084213f)), owning_building_guid = 43)
      LocalObject(472, Locker.Constructor(Vector3(2103.239f, 1564.81f, 2.084213f)), owning_building_guid = 43)
      LocalObject(473, Locker.Constructor(Vector3(2103.242f, 1586.847f, 2.084213f)), owning_building_guid = 43)
      LocalObject(474, Locker.Constructor(Vector3(2104.569f, 1587.01f, 2.084213f)), owning_building_guid = 43)
      LocalObject(475, Locker.Constructor(Vector3(2105.872f, 1565.133f, 2.084213f)), owning_building_guid = 43)
      LocalObject(476, Locker.Constructor(Vector3(2107.199f, 1565.296f, 2.084213f)), owning_building_guid = 43)
      LocalObject(
        612,
        Terminal.Constructor(Vector3(2099.512f, 1581.184f, 3.422213f), order_terminal),
        owning_building_guid = 43
      )
      LocalObject(
        613,
        Terminal.Constructor(Vector3(2100.209f, 1575.503f, 3.422213f), order_terminal),
        owning_building_guid = 43
      )
      LocalObject(
        614,
        Terminal.Constructor(Vector3(2100.865f, 1570.162f, 3.422213f), order_terminal),
        owning_building_guid = 43
      )
      LocalObject(
        819,
        SpawnTube.Constructor(Vector3(2109.88f, 1584.862f, 1.572213f), respawn_tube_tower, Vector3(0, 0, 173)),
        owning_building_guid = 43
      )
      LocalObject(
        820,
        SpawnTube.Constructor(Vector3(2111.88f, 1568.574f, 1.572213f), respawn_tube_tower, Vector3(0, 0, 173)),
        owning_building_guid = 43
      )
      LocalObject(
        702,
        ProximityTerminal.Constructor(Vector3(2122.442f, 1579.369f, 39.66021f), pad_landing_tower_frame),
        owning_building_guid = 43
      )
      LocalObject(
        703,
        Terminal.Constructor(Vector3(2122.442f, 1579.369f, 39.66021f), air_rearm_terminal),
        owning_building_guid = 43
      )
      LocalObject(
        705,
        ProximityTerminal.Constructor(Vector3(2123.715f, 1569.002f, 39.66021f), pad_landing_tower_frame),
        owning_building_guid = 43
      )
      LocalObject(
        706,
        Terminal.Constructor(Vector3(2123.715f, 1569.002f, 39.66021f), air_rearm_terminal),
        owning_building_guid = 43
      )
      LocalObject(
        561,
        FacilityTurret.Constructor(Vector3(2100.501f, 1556.291f, 31.03221f), manned_turret),
        owning_building_guid = 43
      )
      TurretToWeapon(561, 5029)
      LocalObject(
        562,
        FacilityTurret.Constructor(Vector3(2134.996f, 1590.663f, 31.03221f), manned_turret),
        owning_building_guid = 43
      )
      TurretToWeapon(562, 5030)
      LocalObject(
        756,
        Painbox.Constructor(Vector3(2103.928f, 1582.32f, 2.190213f), painbox_radius_continuous),
        owning_building_guid = 43
      )
      LocalObject(
        757,
        Painbox.Constructor(Vector3(2105.261f, 1569.908f, 2.190213f), painbox_radius_continuous),
        owning_building_guid = 43
      )
      LocalObject(
        758,
        Painbox.Constructor(Vector3(2116.708f, 1580.555f, 4.109713f), painbox_radius_continuous),
        owning_building_guid = 43
      )
    }

    Building2()

    def Building2(): Unit = { // Name: Charlie_Top Type: tower_c GUID: 44, MapID: 2
      LocalBuilding(
        "Charlie_Top",
        44,
        2,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(2254f, 2136f, 110.7895f), Vector3(0f, 0f, 238f), tower_c)
        )
      )
      LocalObject(
        841,
        CaptureTerminal.Constructor(Vector3(2245.123f, 2121.988f, 120.7885f), secondary_capture),
        owning_building_guid = 44
      )
      LocalObject(168, Door.Constructor(Vector3(2240.856f, 2130.063f, 112.3105f)), owning_building_guid = 44)
      LocalObject(169, Door.Constructor(Vector3(2240.856f, 2130.063f, 132.3095f)), owning_building_guid = 44)
      LocalObject(172, Door.Constructor(Vector3(2254.425f, 2121.584f, 112.3105f)), owning_building_guid = 44)
      LocalObject(173, Door.Constructor(Vector3(2254.425f, 2121.584f, 132.3095f)), owning_building_guid = 44)
      LocalObject(885, Door.Constructor(Vector3(2238.59f, 2132.486f, 102.1255f)), owning_building_guid = 44)
      LocalObject(886, Door.Constructor(Vector3(2252.507f, 2123.79f, 102.1255f)), owning_building_guid = 44)
      LocalObject(
        353,
        IFFLock.Constructor(Vector3(2239.084f, 2128.757f, 112.2505f), Vector3(0, 0, 302)),
        owning_building_guid = 44,
        door_guid = 168
      )
      LocalObject(
        354,
        IFFLock.Constructor(Vector3(2239.084f, 2128.757f, 132.2505f), Vector3(0, 0, 302)),
        owning_building_guid = 44,
        door_guid = 169
      )
      LocalObject(
        355,
        IFFLock.Constructor(Vector3(2256.196f, 2122.887f, 112.2505f), Vector3(0, 0, 122)),
        owning_building_guid = 44,
        door_guid = 172
      )
      LocalObject(
        356,
        IFFLock.Constructor(Vector3(2256.196f, 2122.887f, 132.2505f), Vector3(0, 0, 122)),
        owning_building_guid = 44,
        door_guid = 173
      )
      LocalObject(477, Locker.Constructor(Vector3(2230.044f, 2126.038f, 100.7835f)), owning_building_guid = 44)
      LocalObject(478, Locker.Constructor(Vector3(2230.787f, 2127.227f, 100.7835f)), owning_building_guid = 44)
      LocalObject(479, Locker.Constructor(Vector3(2232.211f, 2129.507f, 100.7835f)), owning_building_guid = 44)
      LocalObject(480, Locker.Constructor(Vector3(2232.92f, 2130.641f, 100.7835f)), owning_building_guid = 44)
      LocalObject(481, Locker.Constructor(Vector3(2248.592f, 2114.448f, 100.7835f)), owning_building_guid = 44)
      LocalObject(482, Locker.Constructor(Vector3(2249.335f, 2115.637f, 100.7835f)), owning_building_guid = 44)
      LocalObject(483, Locker.Constructor(Vector3(2250.741f, 2117.887f, 100.7835f)), owning_building_guid = 44)
      LocalObject(484, Locker.Constructor(Vector3(2251.45f, 2119.021f, 100.7835f)), owning_building_guid = 44)
      LocalObject(
        615,
        Terminal.Constructor(Vector3(2234.265f, 2123.044f, 102.1215f), order_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        616,
        Terminal.Constructor(Vector3(2239.119f, 2120.011f, 102.1215f), order_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        617,
        Terminal.Constructor(Vector3(2243.682f, 2117.16f, 102.1215f), order_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        821,
        SpawnTube.Constructor(Vector3(2237.931f, 2133.417f, 100.2715f), respawn_tube_tower, Vector3(0, 0, 122)),
        owning_building_guid = 44
      )
      LocalObject(
        822,
        SpawnTube.Constructor(Vector3(2251.848f, 2124.721f, 100.2715f), respawn_tube_tower, Vector3(0, 0, 122)),
        owning_building_guid = 44
      )
      LocalObject(
        708,
        ProximityTerminal.Constructor(Vector3(2250.106f, 2139.722f, 138.3595f), pad_landing_tower_frame),
        owning_building_guid = 44
      )
      LocalObject(
        709,
        Terminal.Constructor(Vector3(2250.106f, 2139.722f, 138.3595f), air_rearm_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        711,
        ProximityTerminal.Constructor(Vector3(2258.964f, 2134.187f, 138.3595f), pad_landing_tower_frame),
        owning_building_guid = 44
      )
      LocalObject(
        712,
        Terminal.Constructor(Vector3(2258.964f, 2134.187f, 138.3595f), air_rearm_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        563,
        FacilityTurret.Constructor(Vector3(2249.229f, 2156.586f, 129.7315f), manned_turret),
        owning_building_guid = 44
      )
      TurretToWeapon(563, 5031)
      LocalObject(
        564,
        FacilityTurret.Constructor(Vector3(2254.233f, 2108.147f, 129.7315f), manned_turret),
        owning_building_guid = 44
      )
      TurretToWeapon(564, 5032)
      LocalObject(
        759,
        Painbox.Constructor(Vector3(2236.161f, 2127.192f, 100.8895f), painbox_radius_continuous),
        owning_building_guid = 44
      )
      LocalObject(
        760,
        Painbox.Constructor(Vector3(2245.575f, 2136.012f, 102.809f), painbox_radius_continuous),
        owning_building_guid = 44
      )
      LocalObject(
        761,
        Painbox.Constructor(Vector3(2246.646f, 2120.416f, 100.8895f), painbox_radius_continuous),
        owning_building_guid = 44
      )
    }

    Building9()

    def Building9(): Unit = { // Name: Charlie_Bottom Type: tower_c GUID: 45, MapID: 9
      LocalBuilding(
        "Charlie_Bottom",
        45,
        9,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(2806f, 2560f, 11.30894f), Vector3(0f, 0f, 171f), tower_c)
        )
      )
      LocalObject(
        844,
        CaptureTerminal.Constructor(Vector3(2789.633f, 2562.697f, 21.30794f), secondary_capture),
        owning_building_guid = 45
      )
      LocalObject(209, Door.Constructor(Vector3(2792.896f, 2553.976f, 12.82994f)), owning_building_guid = 45)
      LocalObject(210, Door.Constructor(Vector3(2792.896f, 2553.976f, 32.82894f)), owning_building_guid = 45)
      LocalObject(211, Door.Constructor(Vector3(2795.399f, 2569.779f, 12.82994f)), owning_building_guid = 45)
      LocalObject(212, Door.Constructor(Vector3(2795.399f, 2569.779f, 32.82894f)), owning_building_guid = 45)
      LocalObject(894, Door.Constructor(Vector3(2794.177f, 2556.604f, 2.644939f)), owning_building_guid = 45)
      LocalObject(895, Door.Constructor(Vector3(2796.744f, 2572.812f, 2.644939f)), owning_building_guid = 45)
      LocalObject(
        378,
        IFFLock.Constructor(Vector3(2793.504f, 2570.9f, 12.76994f), Vector3(0, 0, 9)),
        owning_building_guid = 45,
        door_guid = 211
      )
      LocalObject(
        379,
        IFFLock.Constructor(Vector3(2793.504f, 2570.9f, 32.76994f), Vector3(0, 0, 9)),
        owning_building_guid = 45,
        door_guid = 212
      )
      LocalObject(
        380,
        IFFLock.Constructor(Vector3(2794.787f, 2552.855f, 12.76994f), Vector3(0, 0, 189)),
        owning_building_guid = 45,
        door_guid = 209
      )
      LocalObject(
        381,
        IFFLock.Constructor(Vector3(2794.787f, 2552.855f, 32.76994f), Vector3(0, 0, 189)),
        owning_building_guid = 45,
        door_guid = 210
      )
      LocalObject(513, Locker.Constructor(Vector3(2784.048f, 2556.557f, 1.302939f)), owning_building_guid = 45)
      LocalObject(514, Locker.Constructor(Vector3(2785.433f, 2556.337f, 1.302939f)), owning_building_guid = 45)
      LocalObject(515, Locker.Constructor(Vector3(2787.47f, 2578.159f, 1.302939f)), owning_building_guid = 45)
      LocalObject(516, Locker.Constructor(Vector3(2788.053f, 2555.922f, 1.302939f)), owning_building_guid = 45)
      LocalObject(517, Locker.Constructor(Vector3(2788.854f, 2577.94f, 1.302939f)), owning_building_guid = 45)
      LocalObject(518, Locker.Constructor(Vector3(2789.374f, 2555.713f, 1.302939f)), owning_building_guid = 45)
      LocalObject(519, Locker.Constructor(Vector3(2791.509f, 2577.52f, 1.302939f)), owning_building_guid = 45)
      LocalObject(520, Locker.Constructor(Vector3(2792.83f, 2577.311f, 1.302939f)), owning_building_guid = 45)
      LocalObject(
        630,
        Terminal.Constructor(Vector3(2784.626f, 2562.136f, 2.640939f), order_terminal),
        owning_building_guid = 45
      )
      LocalObject(
        631,
        Terminal.Constructor(Vector3(2785.468f, 2567.451f, 2.640939f), order_terminal),
        owning_building_guid = 45
      )
      LocalObject(
        632,
        Terminal.Constructor(Vector3(2786.363f, 2573.104f, 2.640939f), order_terminal),
        owning_building_guid = 45
      )
      LocalObject(
        830,
        SpawnTube.Constructor(Vector3(2794.776f, 2557.574f, 0.7909393f), respawn_tube_tower, Vector3(0, 0, 189)),
        owning_building_guid = 45
      )
      LocalObject(
        831,
        SpawnTube.Constructor(Vector3(2797.343f, 2573.782f, 0.7909393f), respawn_tube_tower, Vector3(0, 0, 189)),
        owning_building_guid = 45
      )
      LocalObject(
        714,
        ProximityTerminal.Constructor(Vector3(2806.271f, 2554.723f, 38.87894f), pad_landing_tower_frame),
        owning_building_guid = 45
      )
      LocalObject(
        715,
        Terminal.Constructor(Vector3(2806.271f, 2554.723f, 38.87894f), air_rearm_terminal),
        owning_building_guid = 45
      )
      LocalObject(
        717,
        ProximityTerminal.Constructor(Vector3(2807.905f, 2565.039f, 38.87894f), pad_landing_tower_frame),
        owning_building_guid = 45
      )
      LocalObject(
        718,
        Terminal.Constructor(Vector3(2807.905f, 2565.039f, 38.87894f), air_rearm_terminal),
        owning_building_guid = 45
      )
      LocalObject(
        573,
        FacilityTurret.Constructor(Vector3(2780.453f, 2548.903f, 30.25094f), manned_turret),
        owning_building_guid = 45
      )
      TurretToWeapon(573, 5033)
      LocalObject(
        574,
        FacilityTurret.Constructor(Vector3(2823.086f, 2572.435f, 30.25094f), manned_turret),
        owning_building_guid = 45
      )
      TurretToWeapon(574, 5034)
      LocalObject(
        768,
        Painbox.Constructor(Vector3(2788.782f, 2560.68f, 1.408939f), painbox_radius_continuous),
        owning_building_guid = 45
      )
      LocalObject(
        769,
        Painbox.Constructor(Vector3(2790.922f, 2572.979f, 1.408939f), painbox_radius_continuous),
        owning_building_guid = 45
      )
      LocalObject(
        770,
        Painbox.Constructor(Vector3(2802.719f, 2567.76f, 3.328439f), painbox_radius_continuous),
        owning_building_guid = 45
      )
    }

    Building10000()

    def Building10000(): Unit = { // Name: Map98_Gate_One Type: warpgate_small GUID: 46, MapID: 10000
      LocalBuilding(
        "Map98_Gate_One",
        46,
        10000,
        FoundationBuilder(WarpGate.Structure(Vector3(1298.27f, 1352.5f, 12.09f)))
      )
    }

    Building10001()

    def Building10001(): Unit = { // Name: Map98_Gate_Three Type: warpgate_small GUID: 47, MapID: 10001
      LocalBuilding(
        "Map98_Gate_Three",
        47,
        10001,
        FoundationBuilder(WarpGate.Structure(Vector3(2481.78f, 2616.39f, 12.09f)))
      )
    }

    Building10002()

    def Building10002(): Unit = { // Name: Map98_Gate_Two Type: warpgate_small GUID: 48, MapID: 10002
      LocalBuilding(
        "Map98_Gate_Two",
        48,
        10002,
        FoundationBuilder(WarpGate.Structure(Vector3(2679.7f, 1434.86f, 12.09f)))
      )
    }

    def Lattice(): Unit = {
      LatticeLink("Base_Alpha", "Base_Bravo")
      LatticeLink("Base_Bravo", "Base_Charlie")
      LatticeLink("Base_Charlie", "Base_Alpha")
      LatticeLink("Base_Alpha", "Map98_Gate_One")
      LatticeLink("Base_Bravo", "Map98_Gate_Two")
      LatticeLink("Base_Charlie", "Map98_Gate_Three")
    }

    Lattice()

  }
}
