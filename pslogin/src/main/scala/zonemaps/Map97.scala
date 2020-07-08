package net.psforever.pslogin.zonemaps

import net.psforever.objects.GlobalDefinitions._
import net.psforever.objects.serverobject.doors.Door
import net.psforever.objects.serverobject.generator.Generator
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

object Map97 { // Desolation
  val ZoneMap = new ZoneMap("map97") {
    Scale = MapScale.Dim4096
    Checksum = 2810790213L

    Building11()

    def Building11(): Unit = { // Name: bunker_lg Type: bunker_lg GUID: 1, MapID: 11
      LocalBuilding(
        "bunker_lg",
        1,
        11,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(1998f, 2010f, 40.46144f), Vector3(0f, 0f, 262f), bunker_lg)
        )
      )
      LocalObject(94, Door.Constructor(Vector3(2000.169f, 2007.063f, 41.98244f)), owning_building_guid = 1)
    }

    Building12()

    def Building12(): Unit = { // Name: bunker_lg Type: bunker_lg GUID: 2, MapID: 12
      LocalBuilding(
        "bunker_lg",
        2,
        12,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(2108f, 2054f, 34.09833f), Vector3(0f, 0f, 169f), bunker_lg)
        )
      )
      LocalObject(101, Door.Constructor(Vector3(2104.954f, 2051.987f, 35.61933f)), owning_building_guid = 2)
    }

    Building13()

    def Building13(): Unit = { // Name: bunker_lg Type: bunker_lg GUID: 3, MapID: 13
      LocalBuilding(
        "bunker_lg",
        3,
        13,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(2114f, 1938f, 38.48689f), Vector3(0f, 0f, 63f), bunker_lg)
        )
      )
      LocalObject(102, Door.Constructor(Vector3(2112.905f, 1941.483f, 40.00789f)), owning_building_guid = 3)
    }

    Building1()

    def Building1(): Unit = { // Name: Red_Base_97 Type: tech_plant GUID: 4, MapID: 1
      LocalBuilding(
        "Red_Base_97",
        4,
        1,
        FoundationBuilder(
          Building.Structure(
            StructureType.Facility,
            Vector3(1538f, 2250f, 30.22248f),
            Vector3(0f, 0f, 235f),
            tech_plant
          )
        )
      )
      LocalObject(
        57,
        CaptureTerminal.Constructor(Vector3(1499.169f, 2271.411f, 45.32248f), capture_terminal),
        owning_building_guid = 4
      )
      LocalObject(71, Door.Constructor(Vector3(1460.654f, 2298.537f, 31.87348f)), owning_building_guid = 4)
      LocalObject(74, Door.Constructor(Vector3(1471.089f, 2313.44f, 39.83648f)), owning_building_guid = 4)
      LocalObject(75, Door.Constructor(Vector3(1479.028f, 2340.124f, 31.84348f)), owning_building_guid = 4)
      LocalObject(76, Door.Constructor(Vector3(1480.318f, 2193.924f, 39.72748f)), owning_building_guid = 4)
      LocalObject(77, Door.Constructor(Vector3(1495.221f, 2183.489f, 31.76448f)), owning_building_guid = 4)
      LocalObject(78, Door.Constructor(Vector3(1495.699f, 2258.325f, 46.84348f)), owning_building_guid = 4)
      LocalObject(79, Door.Constructor(Vector3(1512.733f, 2254.755f, 46.84348f)), owning_building_guid = 4)
      LocalObject(80, Door.Constructor(Vector3(1521.589f, 2348.728f, 31.76448f)), owning_building_guid = 4)
      LocalObject(81, Door.Constructor(Vector3(1536.491f, 2338.293f, 39.72748f)), owning_building_guid = 4)
      LocalObject(82, Door.Constructor(Vector3(1539.09f, 2197.046f, 39.72748f)), owning_building_guid = 4)
      LocalObject(83, Door.Constructor(Vector3(1549.525f, 2211.949f, 31.76448f)), owning_building_guid = 4)
      LocalObject(84, Door.Constructor(Vector3(1581.997f, 2306.43f, 31.76448f)), owning_building_guid = 4)
      LocalObject(85, Door.Constructor(Vector3(1596.899f, 2295.995f, 39.72748f)), owning_building_guid = 4)
      LocalObject(141, Door.Constructor(Vector3(1598.299f, 2266.375f, 33.95948f)), owning_building_guid = 4)
      LocalObject(144, Door.Constructor(Vector3(1552.425f, 2298.497f, 13.95948f)), owning_building_guid = 4)
      LocalObject(147, Door.Constructor(Vector3(1471.815f, 2315.875f, 24.34348f)), owning_building_guid = 4)
      LocalObject(148, Door.Constructor(Vector3(1475.744f, 2293.592f, 24.34348f)), owning_building_guid = 4)
      LocalObject(149, Door.Constructor(Vector3(1483.603f, 2249.024f, 16.84348f)), owning_building_guid = 4)
      LocalObject(150, Door.Constructor(Vector3(1487.209f, 2261.149f, 16.84348f)), owning_building_guid = 4)
      LocalObject(151, Door.Constructor(Vector3(1487.209f, 2261.149f, 24.34348f)), owning_building_guid = 4)
      LocalObject(152, Door.Constructor(Vector3(1496.709f, 2239.847f, 24.34348f)), owning_building_guid = 4)
      LocalObject(153, Door.Constructor(Vector3(1504.581f, 2292.932f, 24.34348f)), owning_building_guid = 4)
      LocalObject(154, Door.Constructor(Vector3(1506.869f, 2247.383f, 24.34348f)), owning_building_guid = 4)
      LocalObject(155, Door.Constructor(Vector3(1507.528f, 2276.22f, 26.84348f)), owning_building_guid = 4)
      LocalObject(156, Door.Constructor(Vector3(1507.528f, 2276.22f, 46.84348f)), owning_building_guid = 4)
      LocalObject(157, Door.Constructor(Vector3(1508.51f, 2270.649f, 16.84348f)), owning_building_guid = 4)
      LocalObject(158, Door.Constructor(Vector3(1508.833f, 2236.241f, 16.84348f)), owning_building_guid = 4)
      LocalObject(159, Door.Constructor(Vector3(1511.787f, 2268.354f, 36.84348f)), owning_building_guid = 4)
      LocalObject(160, Door.Constructor(Vector3(1515.064f, 2266.06f, 46.84348f)), owning_building_guid = 4)
      LocalObject(161, Door.Constructor(Vector3(1519.007f, 2341.429f, 24.34348f)), owning_building_guid = 4)
      LocalObject(162, Door.Constructor(Vector3(1520.312f, 2301.45f, 21.84348f)), owning_building_guid = 4)
      LocalObject(163, Door.Constructor(Vector3(1520.635f, 2267.042f, 26.84348f)), owning_building_guid = 4)
      LocalObject(164, Door.Constructor(Vector3(1538.666f, 2327.663f, 21.84348f)), owning_building_guid = 4)
      LocalObject(165, Door.Constructor(Vector3(1539.971f, 2287.685f, 21.84348f)), owning_building_guid = 4)
      LocalObject(204, Door.Constructor(Vector3(1477.533f, 2243.249f, 32.60248f)), owning_building_guid = 4)
      LocalObject(658, Door.Constructor(Vector3(1496.108f, 2263.862f, 24.67648f)), owning_building_guid = 4)
      LocalObject(659, Door.Constructor(Vector3(1502.082f, 2259.679f, 24.67648f)), owning_building_guid = 4)
      LocalObject(660, Door.Constructor(Vector3(1508.053f, 2255.498f, 24.67648f)), owning_building_guid = 4)
      LocalObject(
        210,
        IFFLock.Constructor(Vector3(1473.487f, 2242.243f, 31.80248f), Vector3(0, 0, 305)),
        owning_building_guid = 4,
        door_guid = 204
      )
      LocalObject(
        213,
        IFFLock.Constructor(Vector3(1597.21f, 2260.721f, 31.91048f), Vector3(0, 0, 125)),
        owning_building_guid = 4,
        door_guid = 141
      )
      LocalObject(
        220,
        IFFLock.Constructor(Vector3(1477.819f, 2341.964f, 31.77448f), Vector3(0, 0, 35)),
        owning_building_guid = 4,
        door_guid = 75
      )
      LocalObject(
        221,
        IFFLock.Constructor(Vector3(1482.854f, 2250.696f, 16.65848f), Vector3(0, 0, 35)),
        owning_building_guid = 4,
        door_guid = 149
      )
      LocalObject(
        222,
        IFFLock.Constructor(Vector3(1485.644f, 2260.326f, 24.15848f), Vector3(0, 0, 305)),
        owning_building_guid = 4,
        door_guid = 151
      )
      LocalObject(
        223,
        IFFLock.Constructor(Vector3(1493.867f, 2257.102f, 46.76848f), Vector3(0, 0, 305)),
        owning_building_guid = 4,
        door_guid = 78
      )
      LocalObject(
        224,
        IFFLock.Constructor(Vector3(1507.159f, 2235.494f, 16.65848f), Vector3(0, 0, 305)),
        owning_building_guid = 4,
        door_guid = 158
      )
      LocalObject(
        225,
        IFFLock.Constructor(Vector3(1508.434f, 2248.206f, 24.15848f), Vector3(0, 0, 125)),
        owning_building_guid = 4,
        door_guid = 154
      )
      LocalObject(
        226,
        IFFLock.Constructor(Vector3(1509.2f, 2276.968f, 46.65848f), Vector3(0, 0, 125)),
        owning_building_guid = 4,
        door_guid = 156
      )
      LocalObject(
        227,
        IFFLock.Constructor(Vector3(1514.567f, 2255.966f, 46.76848f), Vector3(0, 0, 125)),
        owning_building_guid = 4,
        door_guid = 79
      )
      LocalObject(278, Locker.Constructor(Vector3(1484.935f, 2254.168f, 23.08348f)), owning_building_guid = 4)
      LocalObject(279, Locker.Constructor(Vector3(1485.594f, 2255.109f, 23.08348f)), owning_building_guid = 4)
      LocalObject(280, Locker.Constructor(Vector3(1486.252f, 2256.048f, 23.08348f)), owning_building_guid = 4)
      LocalObject(281, Locker.Constructor(Vector3(1486.919f, 2257.002f, 23.08348f)), owning_building_guid = 4)
      LocalObject(282, Locker.Constructor(Vector3(1490.035f, 2226.541f, 15.32248f)), owning_building_guid = 4)
      LocalObject(283, Locker.Constructor(Vector3(1490.802f, 2227.636f, 15.32248f)), owning_building_guid = 4)
      LocalObject(284, Locker.Constructor(Vector3(1491.568f, 2228.73f, 15.32248f)), owning_building_guid = 4)
      LocalObject(285, Locker.Constructor(Vector3(1492.328f, 2229.815f, 15.32248f)), owning_building_guid = 4)
      LocalObject(286, Locker.Constructor(Vector3(1494.932f, 2233.534f, 15.32248f)), owning_building_guid = 4)
      LocalObject(287, Locker.Constructor(Vector3(1495.699f, 2234.629f, 15.32248f)), owning_building_guid = 4)
      LocalObject(288, Locker.Constructor(Vector3(1496.465f, 2235.724f, 15.32248f)), owning_building_guid = 4)
      LocalObject(289, Locker.Constructor(Vector3(1497.224f, 2236.808f, 15.32248f)), owning_building_guid = 4)
      LocalObject(
        42,
        Terminal.Constructor(Vector3(1508.112f, 2250.656f, 45.92548f), air_vehicle_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        395,
        VehicleSpawnPad.Constructor(Vector3(1522.493f, 2235.115f, 42.80048f), mb_pad_creation, Vector3(0, 0, 125)),
        owning_building_guid = 4,
        terminal_guid = 42
      )
      LocalObject(
        43,
        Terminal.Constructor(Vector3(1514.956f, 2260.431f, 45.92548f), air_vehicle_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        396,
        VehicleSpawnPad.Constructor(Vector3(1534.548f, 2252.332f, 42.80048f), mb_pad_creation, Vector3(0, 0, 125)),
        owning_building_guid = 4,
        terminal_guid = 43
      )
      LocalObject(
        413,
        Terminal.Constructor(Vector3(1489.461f, 2251.449f, 24.41248f), order_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        414,
        Terminal.Constructor(Vector3(1492.517f, 2249.309f, 24.41248f), order_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        415,
        Terminal.Constructor(Vector3(1495.621f, 2247.136f, 24.41248f), order_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        416,
        Terminal.Constructor(Vector3(1514.527f, 2262.703f, 36.65248f), order_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        635,
        Terminal.Constructor(Vector3(1473.645f, 2324.432f, 24.37948f), spawn_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        636,
        Terminal.Constructor(Vector3(1493.897f, 2265.046f, 24.95648f), spawn_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        637,
        Terminal.Constructor(Vector3(1494.609f, 2270.687f, 16.87948f), spawn_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        638,
        Terminal.Constructor(Vector3(1499.873f, 2260.867f, 24.95648f), spawn_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        639,
        Terminal.Constructor(Vector3(1499.96f, 2231.172f, 36.90448f), spawn_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        640,
        Terminal.Constructor(Vector3(1505.841f, 2256.685f, 24.95648f), spawn_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        641,
        Terminal.Constructor(Vector3(1532.298f, 2236.252f, 42.24548f), spawn_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        697,
        Terminal.Constructor(Vector3(1532.295f, 2312.597f, 16.03648f), ground_vehicle_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        397,
        VehicleSpawnPad.Constructor(Vector3(1541.266f, 2306.377f, 7.759481f), mb_pad_creation, Vector3(0, 0, 125)),
        owning_building_guid = 4,
        terminal_guid = 697
      )
      LocalObject(602, ResourceSilo.Constructor(Vector3(1529.248f, 2180.743f, 37.23048f)), owning_building_guid = 4)
      LocalObject(
        607,
        SpawnTube.Constructor(Vector3(1495.5f, 2264.825f, 22.82248f), Vector3(0, 0, 125)),
        owning_building_guid = 4
      )
      LocalObject(
        608,
        SpawnTube.Constructor(Vector3(1501.473f, 2260.643f, 22.82248f), Vector3(0, 0, 125)),
        owning_building_guid = 4
      )
      LocalObject(
        609,
        SpawnTube.Constructor(Vector3(1507.443f, 2256.463f, 22.82248f), Vector3(0, 0, 125)),
        owning_building_guid = 4
      )
      LocalObject(
        404,
        ProximityTerminal.Constructor(Vector3(1493.193f, 2232.001f, 15.32248f), medical_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        405,
        ProximityTerminal.Constructor(Vector3(1505.856f, 2268.773f, 35.31948f), medical_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        467,
        ProximityTerminal.Constructor(Vector3(1456.698f, 2275.757f, 38.43048f), pad_landing_frame),
        owning_building_guid = 4
      )
      LocalObject(
        468,
        Terminal.Constructor(Vector3(1456.698f, 2275.757f, 38.43048f), air_rearm_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        470,
        ProximityTerminal.Constructor(Vector3(1467.923f, 2223.396f, 40.87448f), pad_landing_frame),
        owning_building_guid = 4
      )
      LocalObject(
        471,
        Terminal.Constructor(Vector3(1467.923f, 2223.396f, 40.87448f), air_rearm_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        473,
        ProximityTerminal.Constructor(Vector3(1477.622f, 2208.923f, 38.43048f), pad_landing_frame),
        owning_building_guid = 4
      )
      LocalObject(
        474,
        Terminal.Constructor(Vector3(1477.622f, 2208.923f, 38.43048f), air_rearm_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        476,
        ProximityTerminal.Constructor(Vector3(1479.764f, 2279.328f, 45.66948f), pad_landing_frame),
        owning_building_guid = 4
      )
      LocalObject(
        477,
        Terminal.Constructor(Vector3(1479.764f, 2279.328f, 45.66948f), air_rearm_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        479,
        ProximityTerminal.Constructor(Vector3(1553.221f, 2314.171f, 38.41748f), pad_landing_frame),
        owning_building_guid = 4
      )
      LocalObject(
        480,
        Terminal.Constructor(Vector3(1553.221f, 2314.171f, 38.41748f), air_rearm_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        482,
        ProximityTerminal.Constructor(Vector3(1554.838f, 2288.286f, 40.77248f), pad_landing_frame),
        owning_building_guid = 4
      )
      LocalObject(
        483,
        Terminal.Constructor(Vector3(1554.838f, 2288.286f, 40.77248f), air_rearm_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        578,
        ProximityTerminal.Constructor(Vector3(1428.356f, 2255.191f, 29.97248f), repair_silo),
        owning_building_guid = 4
      )
      LocalObject(
        579,
        Terminal.Constructor(Vector3(1428.356f, 2255.191f, 29.97248f), ground_rearm_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        582,
        ProximityTerminal.Constructor(Vector3(1571.93f, 2225.865f, 29.95098f), repair_silo),
        owning_building_guid = 4
      )
      LocalObject(
        583,
        Terminal.Constructor(Vector3(1571.93f, 2225.865f, 29.95098f), ground_rearm_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        365,
        FacilityTurret.Constructor(Vector3(1407.207f, 2236.408f, 38.72148f), manned_turret),
        owning_building_guid = 4
      )
      TurretToWeapon(365, 5000)
      LocalObject(
        367,
        FacilityTurret.Constructor(Vector3(1455.828f, 2192.93f, 38.72148f), manned_turret),
        owning_building_guid = 4
      )
      TurretToWeapon(367, 5001)
      LocalObject(
        369,
        FacilityTurret.Constructor(Vector3(1501.705f, 2371.351f, 38.72148f), manned_turret),
        owning_building_guid = 4
      )
      TurretToWeapon(369, 5002)
      LocalObject(
        370,
        FacilityTurret.Constructor(Vector3(1520.038f, 2157.403f, 38.72148f), manned_turret),
        owning_building_guid = 4
      )
      TurretToWeapon(370, 5003)
      LocalObject(
        371,
        FacilityTurret.Constructor(Vector3(1615.765f, 2188.711f, 38.72148f), manned_turret),
        owning_building_guid = 4
      )
      TurretToWeapon(371, 5004)
      LocalObject(
        373,
        FacilityTurret.Constructor(Vector3(1667.212f, 2262.185f, 38.72148f), manned_turret),
        owning_building_guid = 4
      )
      TurretToWeapon(373, 5005)
      LocalObject(539, Painbox.Constructor(Vector3(1520.13f, 2231.093f, 18.79578f), painbox), owning_building_guid = 4)
      LocalObject(
        542,
        Painbox.Constructor(Vector3(1495.916f, 2254.036f, 27.09238f), painbox_continuous),
        owning_building_guid = 4
      )
      LocalObject(
        545,
        Painbox.Constructor(Vector3(1506.934f, 2237.938f, 18.48188f), painbox_door_radius),
        owning_building_guid = 4
      )
      LocalObject(
        548,
        Painbox.Constructor(Vector3(1486.353f, 2262.927f, 24.95038f), painbox_door_radius_continuous),
        owning_building_guid = 4
      )
      LocalObject(
        549,
        Painbox.Constructor(Vector3(1493.449f, 2237.685f, 26.40478f), painbox_door_radius_continuous),
        owning_building_guid = 4
      )
      LocalObject(
        550,
        Painbox.Constructor(Vector3(1508.398f, 2246.482f, 25.49868f), painbox_door_radius_continuous),
        owning_building_guid = 4
      )
      LocalObject(66, Generator.Constructor(Vector3(1521.59f, 2227.339f, 14.02848f)), owning_building_guid = 4)
      LocalObject(63, Terminal.Constructor(Vector3(1514.852f, 2232f, 15.32248f), gen_control), owning_building_guid = 4)
    }

    Building3()

    def Building3(): Unit = { // Name: Indigo_Base_97 Type: tech_plant GUID: 7, MapID: 3
      LocalBuilding(
        "Indigo_Base_97",
        7,
        3,
        FoundationBuilder(
          Building.Structure(StructureType.Facility, Vector3(2446f, 1546f, 30.22248f), Vector3(0f, 0f, 38f), tech_plant)
        )
      )
      LocalObject(
        58,
        CaptureTerminal.Constructor(Vector3(2476.875f, 1514.172f, 45.32248f), capture_terminal),
        owning_building_guid = 7
      )
      LocalObject(103, Door.Constructor(Vector3(2376.227f, 1519.235f, 39.72748f)), owning_building_guid = 7)
      LocalObject(104, Door.Constructor(Vector3(2387.427f, 1504.899f, 31.76448f)), owning_building_guid = 7)
      LocalObject(105, Door.Constructor(Vector3(2421.629f, 1461.124f, 39.72748f)), owning_building_guid = 7)
      LocalObject(106, Door.Constructor(Vector3(2432.829f, 1446.788f, 31.76448f)), owning_building_guid = 7)
      LocalObject(107, Door.Constructor(Vector3(2446.104f, 1585.758f, 31.76448f)), owning_building_guid = 7)
      LocalObject(108, Door.Constructor(Vector3(2460.44f, 1596.959f, 39.72748f)), owning_building_guid = 7)
      LocalObject(110, Door.Constructor(Vector3(2468.772f, 1534.065f, 46.84348f)), owning_building_guid = 7)
      LocalObject(112, Door.Constructor(Vector3(2476.046f, 1442.573f, 31.84348f)), owning_building_guid = 7)
      LocalObject(114, Door.Constructor(Vector3(2484.019f, 1525.672f, 46.84348f)), owning_building_guid = 7)
      LocalObject(115, Door.Constructor(Vector3(2491.439f, 1465.769f, 39.83648f)), owning_building_guid = 7)
      LocalObject(117, Door.Constructor(Vector3(2505.776f, 1476.97f, 31.87348f)), owning_building_guid = 7)
      LocalObject(118, Door.Constructor(Vector3(2506.356f, 1597.098f, 31.76448f)), owning_building_guid = 7)
      LocalObject(119, Door.Constructor(Vector3(2517.557f, 1582.762f, 39.72748f)), owning_building_guid = 7)
      LocalObject(142, Door.Constructor(Vector3(2383.548f, 1547.97f, 33.95948f)), owning_building_guid = 7)
      LocalObject(145, Door.Constructor(Vector3(2418.026f, 1503.84f, 13.95948f)), owning_building_guid = 7)
      LocalObject(166, Door.Constructor(Vector3(2422.656f, 1471.925f, 21.84348f)), owning_building_guid = 7)
      LocalObject(167, Door.Constructor(Vector3(2433.097f, 1510.539f, 21.84348f)), owning_building_guid = 7)
      LocalObject(168, Door.Constructor(Vector3(2437.432f, 1453.013f, 24.34348f)), owning_building_guid = 7)
      LocalObject(169, Door.Constructor(Vector3(2447.873f, 1491.626f, 21.84348f)), owning_building_guid = 7)
      LocalObject(170, Door.Constructor(Vector3(2457.624f, 1524.625f, 26.84348f)), owning_building_guid = 7)
      LocalObject(171, Door.Constructor(Vector3(2463.239f, 1523.936f, 46.84348f)), owning_building_guid = 7)
      LocalObject(172, Door.Constructor(Vector3(2465.406f, 1495.173f, 24.34348f)), owning_building_guid = 7)
      LocalObject(173, Door.Constructor(Vector3(2465.701f, 1520.784f, 36.84348f)), owning_building_guid = 7)
      LocalObject(174, Door.Constructor(Vector3(2467.474f, 1512.017f, 26.84348f)), owning_building_guid = 7)
      LocalObject(175, Door.Constructor(Vector3(2467.474f, 1512.017f, 46.84348f)), owning_building_guid = 7)
      LocalObject(176, Door.Constructor(Vector3(2468.164f, 1517.632f, 16.84348f)), owning_building_guid = 7)
      LocalObject(177, Door.Constructor(Vector3(2476.536f, 1539.401f, 24.34348f)), owning_building_guid = 7)
      LocalObject(178, Door.Constructor(Vector3(2477.915f, 1550.63f, 16.84348f)), owning_building_guid = 7)
      LocalObject(179, Door.Constructor(Vector3(2488.455f, 1543.637f, 24.34348f)), owning_building_guid = 7)
      LocalObject(180, Door.Constructor(Vector3(2490.033f, 1463.652f, 24.34348f)), owning_building_guid = 7)
      LocalObject(181, Door.Constructor(Vector3(2491.312f, 1520.489f, 16.84348f)), owning_building_guid = 7)
      LocalObject(182, Door.Constructor(Vector3(2491.312f, 1520.489f, 24.34348f)), owning_building_guid = 7)
      LocalObject(183, Door.Constructor(Vector3(2492.79f, 1486.111f, 24.34348f)), owning_building_guid = 7)
      LocalObject(184, Door.Constructor(Vector3(2498.305f, 1531.029f, 16.84348f)), owning_building_guid = 7)
      LocalObject(205, Door.Constructor(Vector3(2505.799f, 1534.778f, 32.60248f)), owning_building_guid = 7)
      LocalObject(667, Door.Constructor(Vector3(2473.031f, 1531.986f, 24.67648f)), owning_building_guid = 7)
      LocalObject(668, Door.Constructor(Vector3(2477.519f, 1526.242f, 24.67648f)), owning_building_guid = 7)
      LocalObject(669, Door.Constructor(Vector3(2482.009f, 1520.495f, 24.67648f)), owning_building_guid = 7)
      LocalObject(
        211,
        IFFLock.Constructor(Vector3(2509.962f, 1534.556f, 31.80248f), Vector3(0, 0, 142)),
        owning_building_guid = 7,
        door_guid = 205
      )
      LocalObject(
        214,
        IFFLock.Constructor(Vector3(2386.242f, 1553.059f, 31.91048f), Vector3(0, 0, 322)),
        owning_building_guid = 7,
        door_guid = 142
      )
      LocalObject(
        242,
        IFFLock.Constructor(Vector3(2465.657f, 1511.79f, 46.65848f), Vector3(0, 0, 322)),
        owning_building_guid = 7,
        door_guid = 175
      )
      LocalObject(
        243,
        IFFLock.Constructor(Vector3(2466.665f, 1533.444f, 46.76848f), Vector3(0, 0, 322)),
        owning_building_guid = 7,
        door_guid = 110
      )
      LocalObject(
        244,
        IFFLock.Constructor(Vector3(2474.799f, 1539.071f, 24.15848f), Vector3(0, 0, 322)),
        owning_building_guid = 7,
        door_guid = 177
      )
      LocalObject(
        245,
        IFFLock.Constructor(Vector3(2476.664f, 1440.459f, 31.77448f), Vector3(0, 0, 232)),
        owning_building_guid = 7,
        door_guid = 112
      )
      LocalObject(
        246,
        IFFLock.Constructor(Vector3(2479.734f, 1550.855f, 16.65848f), Vector3(0, 0, 142)),
        owning_building_guid = 7,
        door_guid = 178
      )
      LocalObject(
        247,
        IFFLock.Constructor(Vector3(2486.128f, 1526.305f, 46.76848f), Vector3(0, 0, 142)),
        owning_building_guid = 7,
        door_guid = 114
      )
      LocalObject(
        248,
        IFFLock.Constructor(Vector3(2493.049f, 1520.818f, 24.15848f), Vector3(0, 0, 142)),
        owning_building_guid = 7,
        door_guid = 182
      )
      LocalObject(
        249,
        IFFLock.Constructor(Vector3(2498.533f, 1529.211f, 16.65848f), Vector3(0, 0, 232)),
        owning_building_guid = 7,
        door_guid = 184
      )
      LocalObject(314, Locker.Constructor(Vector3(2488.851f, 1546.694f, 15.32248f)), owning_building_guid = 7)
      LocalObject(315, Locker.Constructor(Vector3(2489.894f, 1547.509f, 15.32248f)), owning_building_guid = 7)
      LocalObject(316, Locker.Constructor(Vector3(2490.947f, 1548.331f, 15.32248f)), owning_building_guid = 7)
      LocalObject(317, Locker.Constructor(Vector3(2492f, 1549.155f, 15.32248f)), owning_building_guid = 7)
      LocalObject(318, Locker.Constructor(Vector3(2492.802f, 1524.369f, 23.08348f)), owning_building_guid = 7)
      LocalObject(319, Locker.Constructor(Vector3(2493.719f, 1525.086f, 23.08348f)), owning_building_guid = 7)
      LocalObject(320, Locker.Constructor(Vector3(2494.623f, 1525.792f, 23.08348f)), owning_building_guid = 7)
      LocalObject(321, Locker.Constructor(Vector3(2495.528f, 1526.5f, 23.08348f)), owning_building_guid = 7)
      LocalObject(322, Locker.Constructor(Vector3(2495.578f, 1551.95f, 15.32248f)), owning_building_guid = 7)
      LocalObject(323, Locker.Constructor(Vector3(2496.622f, 1552.765f, 15.32248f)), owning_building_guid = 7)
      LocalObject(324, Locker.Constructor(Vector3(2497.674f, 1553.587f, 15.32248f)), owning_building_guid = 7)
      LocalObject(325, Locker.Constructor(Vector3(2498.728f, 1554.41f, 15.32248f)), owning_building_guid = 7)
      LocalObject(
        44,
        Terminal.Constructor(Vector3(2464.987f, 1529.288f, 45.92548f), air_vehicle_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        399,
        VehicleSpawnPad.Constructor(Vector3(2448.619f, 1542.761f, 42.80048f), mb_pad_creation, Vector3(0, 0, -38)),
        owning_building_guid = 7,
        terminal_guid = 44
      )
      LocalObject(
        45,
        Terminal.Constructor(Vector3(2474.39f, 1536.634f, 45.92548f), air_vehicle_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        400,
        VehicleSpawnPad.Constructor(Vector3(2465.182f, 1555.701f, 42.80048f), mb_pad_creation, Vector3(0, 0, -38)),
        owning_building_guid = 7,
        terminal_guid = 45
      )
      LocalObject(
        426,
        Terminal.Constructor(Vector3(2464.733f, 1526.989f, 36.65248f), order_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        427,
        Terminal.Constructor(Vector3(2487.365f, 1536.349f, 24.41248f), order_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        428,
        Terminal.Constructor(Vector3(2489.698f, 1533.363f, 24.41248f), order_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        429,
        Terminal.Constructor(Vector3(2491.995f, 1530.423f, 24.41248f), order_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        642,
        Terminal.Constructor(Vector3(2455.472f, 1557.48f, 42.24548f), spawn_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        643,
        Terminal.Constructor(Vector3(2474.799f, 1530.205f, 24.95648f), spawn_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        644,
        Terminal.Constructor(Vector3(2479.284f, 1524.46f, 24.95648f), spawn_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        645,
        Terminal.Constructor(Vector3(2481.446f, 1513.531f, 16.87948f), spawn_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        646,
        Terminal.Constructor(Vector3(2483.776f, 1518.717f, 24.95648f), spawn_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        647,
        Terminal.Constructor(Vector3(2485.782f, 1456.005f, 24.37948f), spawn_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        648,
        Terminal.Constructor(Vector3(2487.883f, 1552.884f, 36.90448f), spawn_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        698,
        Terminal.Constructor(Vector3(2433.154f, 1484.471f, 16.03648f), ground_vehicle_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        398,
        VehicleSpawnPad.Constructor(Vector3(2426.393f, 1493.041f, 7.759481f), mb_pad_creation, Vector3(0, 0, -38)),
        owning_building_guid = 7,
        terminal_guid = 698
      )
      LocalObject(604, ResourceSilo.Constructor(Vector3(2474.618f, 1609.672f, 37.23048f)), owning_building_guid = 7)
      LocalObject(
        616,
        SpawnTube.Constructor(Vector3(2473.333f, 1530.885f, 22.82248f), Vector3(0, 0, 322)),
        owning_building_guid = 7
      )
      LocalObject(
        617,
        SpawnTube.Constructor(Vector3(2477.82f, 1525.143f, 22.82248f), Vector3(0, 0, 322)),
        owning_building_guid = 7
      )
      LocalObject(
        618,
        SpawnTube.Constructor(Vector3(2482.308f, 1519.397f, 22.82248f), Vector3(0, 0, 322)),
        owning_building_guid = 7
      )
      LocalObject(
        406,
        ProximityTerminal.Constructor(Vector3(2471.251f, 1518.649f, 35.31948f), medical_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        407,
        ProximityTerminal.Constructor(Vector3(2494.111f, 1550.112f, 15.32248f), medical_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        485,
        ProximityTerminal.Constructor(Vector3(2412.683f, 1489.083f, 38.41748f), pad_landing_frame),
        owning_building_guid = 7
      )
      LocalObject(
        486,
        Terminal.Constructor(Vector3(2412.683f, 1489.083f, 38.41748f), air_rearm_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        488,
        ProximityTerminal.Constructor(Vector3(2418.704f, 1514.31f, 40.77248f), pad_landing_frame),
        owning_building_guid = 7
      )
      LocalObject(
        489,
        Terminal.Constructor(Vector3(2418.704f, 1514.31f, 40.77248f), air_rearm_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        494,
        ProximityTerminal.Constructor(Vector3(2493.117f, 1500.927f, 45.66948f), pad_landing_frame),
        owning_building_guid = 7
      )
      LocalObject(
        495,
        Terminal.Constructor(Vector3(2493.117f, 1500.927f, 45.66948f), air_rearm_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        500,
        ProximityTerminal.Constructor(Vector3(2515.75f, 1567.629f, 38.43048f), pad_landing_frame),
        owning_building_guid = 7
      )
      LocalObject(
        501,
        Terminal.Constructor(Vector3(2515.75f, 1567.629f, 38.43048f), air_rearm_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        503,
        ProximityTerminal.Constructor(Vector3(2516.219f, 1497.598f, 38.43048f), pad_landing_frame),
        owning_building_guid = 7
      )
      LocalObject(
        504,
        Terminal.Constructor(Vector3(2516.219f, 1497.598f, 38.43048f), air_rearm_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        506,
        ProximityTerminal.Constructor(Vector3(2520.793f, 1550.952f, 40.87448f), pad_landing_frame),
        owning_building_guid = 7
      )
      LocalObject(
        507,
        Terminal.Constructor(Vector3(2520.793f, 1550.952f, 40.87448f), air_rearm_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        586,
        ProximityTerminal.Constructor(Vector3(2420.609f, 1579f, 29.95098f), repair_silo),
        owning_building_guid = 7
      )
      LocalObject(
        587,
        Terminal.Constructor(Vector3(2420.609f, 1579f, 29.95098f), ground_rearm_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        598,
        ProximityTerminal.Constructor(Vector3(2549.335f, 1508.979f, 29.97248f), repair_silo),
        owning_building_guid = 7
      )
      LocalObject(
        599,
        Terminal.Constructor(Vector3(2549.335f, 1508.979f, 29.97248f), ground_rearm_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        377,
        FacilityTurret.Constructor(Vector3(2318.872f, 1572.125f, 38.72148f), manned_turret),
        owning_building_guid = 7
      )
      TurretToWeapon(377, 5006)
      LocalObject(
        378,
        FacilityTurret.Constructor(Vector3(2389.552f, 1627.347f, 38.72148f), manned_turret),
        owning_building_guid = 7
      )
      TurretToWeapon(378, 5007)
      LocalObject(
        380,
        FacilityTurret.Constructor(Vector3(2445.229f, 1419.34f, 38.72148f), manned_turret),
        owning_building_guid = 7
      )
      TurretToWeapon(380, 5008)
      LocalObject(
        383,
        FacilityTurret.Constructor(Vector3(2490.25f, 1629.3f, 38.72148f), manned_turret),
        owning_building_guid = 7
      )
      TurretToWeapon(383, 5009)
      LocalObject(
        385,
        FacilityTurret.Constructor(Vector3(2541.267f, 1576.552f, 38.72148f), manned_turret),
        owning_building_guid = 7
      )
      TurretToWeapon(385, 5010)
      LocalObject(
        387,
        FacilityTurret.Constructor(Vector3(2575.052f, 1520.758f, 38.72148f), manned_turret),
        owning_building_guid = 7
      )
      TurretToWeapon(387, 5011)
      LocalObject(540, Painbox.Constructor(Vector3(2468.617f, 1558.856f, 18.79578f), painbox), owning_building_guid = 7)
      LocalObject(
        543,
        Painbox.Constructor(Vector3(2485.065f, 1529.836f, 27.09238f), painbox_continuous),
        owning_building_guid = 7
      )
      LocalObject(
        546,
        Painbox.Constructor(Vector3(2479.235f, 1548.453f, 18.48188f), painbox_door_radius),
        owning_building_guid = 7
      )
      LocalObject(
        551,
        Painbox.Constructor(Vector3(2475.337f, 1540.709f, 25.49868f), painbox_door_radius_continuous),
        owning_building_guid = 7
      )
      LocalObject(
        552,
        Painbox.Constructor(Vector3(2491.611f, 1518.538f, 24.95038f), painbox_door_radius_continuous),
        owning_building_guid = 7
      )
      LocalObject(
        553,
        Painbox.Constructor(Vector3(2492.205f, 1544.751f, 26.40478f), painbox_door_radius_continuous),
        owning_building_guid = 7
      )
      LocalObject(67, Generator.Constructor(Vector3(2468.319f, 1562.872f, 14.02848f)), owning_building_guid = 7)
      LocalObject(
        64,
        Terminal.Constructor(Vector3(2473.399f, 1556.446f, 15.32248f), gen_control),
        owning_building_guid = 7
      )
    }

    Building2()

    def Building2(): Unit = { // Name: Blue_Base_97 Type: tech_plant GUID: 10, MapID: 2
      LocalBuilding(
        "Blue_Base_97",
        10,
        2,
        FoundationBuilder(
          Building.Structure(
            StructureType.Facility,
            Vector3(2532f, 2426f, 30.22248f),
            Vector3(0f, 0f, 145f),
            tech_plant
          )
        )
      )
      LocalObject(
        59,
        CaptureTerminal.Constructor(Vector3(2553.411f, 2464.831f, 45.32248f), capture_terminal),
        owning_building_guid = 10
      )
      LocalObject(109, Door.Constructor(Vector3(2465.489f, 2468.779f, 31.76448f)), owning_building_guid = 10)
      LocalObject(111, Door.Constructor(Vector3(2475.924f, 2483.682f, 39.72748f)), owning_building_guid = 10)
      LocalObject(113, Door.Constructor(Vector3(2479.046f, 2424.91f, 39.72748f)), owning_building_guid = 10)
      LocalObject(116, Door.Constructor(Vector3(2493.949f, 2414.475f, 31.76448f)), owning_building_guid = 10)
      LocalObject(120, Door.Constructor(Vector3(2536.755f, 2451.267f, 46.84348f)), owning_building_guid = 10)
      LocalObject(121, Door.Constructor(Vector3(2540.325f, 2468.301f, 46.84348f)), owning_building_guid = 10)
      LocalObject(122, Door.Constructor(Vector3(2577.995f, 2367.102f, 39.72748f)), owning_building_guid = 10)
      LocalObject(123, Door.Constructor(Vector3(2580.537f, 2503.346f, 31.87348f)), owning_building_guid = 10)
      LocalObject(124, Door.Constructor(Vector3(2588.43f, 2382.003f, 31.76448f)), owning_building_guid = 10)
      LocalObject(125, Door.Constructor(Vector3(2595.44f, 2492.911f, 39.83648f)), owning_building_guid = 10)
      LocalObject(126, Door.Constructor(Vector3(2620.293f, 2427.509f, 39.72748f)), owning_building_guid = 10)
      LocalObject(127, Door.Constructor(Vector3(2622.124f, 2484.972f, 31.84348f)), owning_building_guid = 10)
      LocalObject(128, Door.Constructor(Vector3(2630.728f, 2442.411f, 31.76448f)), owning_building_guid = 10)
      LocalObject(143, Door.Constructor(Vector3(2548.375f, 2365.701f, 33.95948f)), owning_building_guid = 10)
      LocalObject(146, Door.Constructor(Vector3(2580.497f, 2411.575f, 13.95948f)), owning_building_guid = 10)
      LocalObject(185, Door.Constructor(Vector3(2518.241f, 2455.167f, 16.84348f)), owning_building_guid = 10)
      LocalObject(186, Door.Constructor(Vector3(2521.847f, 2467.291f, 24.34348f)), owning_building_guid = 10)
      LocalObject(187, Door.Constructor(Vector3(2529.383f, 2457.131f, 24.34348f)), owning_building_guid = 10)
      LocalObject(188, Door.Constructor(Vector3(2531.024f, 2480.397f, 16.84348f)), owning_building_guid = 10)
      LocalObject(189, Door.Constructor(Vector3(2543.149f, 2476.791f, 16.84348f)), owning_building_guid = 10)
      LocalObject(190, Door.Constructor(Vector3(2543.149f, 2476.791f, 24.34348f)), owning_building_guid = 10)
      LocalObject(191, Door.Constructor(Vector3(2548.06f, 2448.936f, 46.84348f)), owning_building_guid = 10)
      LocalObject(192, Door.Constructor(Vector3(2549.042f, 2443.365f, 26.84348f)), owning_building_guid = 10)
      LocalObject(193, Door.Constructor(Vector3(2550.354f, 2452.213f, 36.84348f)), owning_building_guid = 10)
      LocalObject(194, Door.Constructor(Vector3(2552.649f, 2455.49f, 16.84348f)), owning_building_guid = 10)
      LocalObject(195, Door.Constructor(Vector3(2558.22f, 2456.472f, 26.84348f)), owning_building_guid = 10)
      LocalObject(196, Door.Constructor(Vector3(2558.22f, 2456.472f, 46.84348f)), owning_building_guid = 10)
      LocalObject(197, Door.Constructor(Vector3(2569.685f, 2424.029f, 21.84348f)), owning_building_guid = 10)
      LocalObject(198, Door.Constructor(Vector3(2574.932f, 2459.419f, 24.34348f)), owning_building_guid = 10)
      LocalObject(199, Door.Constructor(Vector3(2575.592f, 2488.256f, 24.34348f)), owning_building_guid = 10)
      LocalObject(200, Door.Constructor(Vector3(2583.45f, 2443.688f, 21.84348f)), owning_building_guid = 10)
      LocalObject(201, Door.Constructor(Vector3(2597.875f, 2492.185f, 24.34348f)), owning_building_guid = 10)
      LocalObject(202, Door.Constructor(Vector3(2609.663f, 2425.334f, 21.84348f)), owning_building_guid = 10)
      LocalObject(203, Door.Constructor(Vector3(2623.429f, 2444.993f, 24.34348f)), owning_building_guid = 10)
      LocalObject(206, Door.Constructor(Vector3(2525.249f, 2486.467f, 32.60248f)), owning_building_guid = 10)
      LocalObject(670, Door.Constructor(Vector3(2537.498f, 2455.947f, 24.67648f)), owning_building_guid = 10)
      LocalObject(671, Door.Constructor(Vector3(2541.679f, 2461.918f, 24.67648f)), owning_building_guid = 10)
      LocalObject(672, Door.Constructor(Vector3(2545.862f, 2467.892f, 24.67648f)), owning_building_guid = 10)
      LocalObject(
        212,
        IFFLock.Constructor(Vector3(2524.243f, 2490.513f, 31.80248f), Vector3(0, 0, 35)),
        owning_building_guid = 10,
        door_guid = 206
      )
      LocalObject(
        215,
        IFFLock.Constructor(Vector3(2542.721f, 2366.79f, 31.91048f), Vector3(0, 0, 215)),
        owning_building_guid = 10,
        door_guid = 143
      )
      LocalObject(
        250,
        IFFLock.Constructor(Vector3(2517.494f, 2456.841f, 16.65848f), Vector3(0, 0, 35)),
        owning_building_guid = 10,
        door_guid = 185
      )
      LocalObject(
        251,
        IFFLock.Constructor(Vector3(2530.206f, 2455.566f, 24.15848f), Vector3(0, 0, 215)),
        owning_building_guid = 10,
        door_guid = 187
      )
      LocalObject(
        252,
        IFFLock.Constructor(Vector3(2532.696f, 2481.146f, 16.65848f), Vector3(0, 0, 125)),
        owning_building_guid = 10,
        door_guid = 188
      )
      LocalObject(
        253,
        IFFLock.Constructor(Vector3(2537.966f, 2449.433f, 46.76848f), Vector3(0, 0, 215)),
        owning_building_guid = 10,
        door_guid = 120
      )
      LocalObject(
        254,
        IFFLock.Constructor(Vector3(2539.102f, 2470.133f, 46.76848f), Vector3(0, 0, 35)),
        owning_building_guid = 10,
        door_guid = 121
      )
      LocalObject(
        255,
        IFFLock.Constructor(Vector3(2542.326f, 2478.356f, 24.15848f), Vector3(0, 0, 35)),
        owning_building_guid = 10,
        door_guid = 190
      )
      LocalObject(
        256,
        IFFLock.Constructor(Vector3(2558.968f, 2454.8f, 46.65848f), Vector3(0, 0, 215)),
        owning_building_guid = 10,
        door_guid = 196
      )
      LocalObject(
        257,
        IFFLock.Constructor(Vector3(2623.964f, 2486.181f, 31.77448f), Vector3(0, 0, 125)),
        owning_building_guid = 10,
        door_guid = 127
      )
      LocalObject(326, Locker.Constructor(Vector3(2508.541f, 2473.965f, 15.32248f)), owning_building_guid = 10)
      LocalObject(327, Locker.Constructor(Vector3(2509.636f, 2473.198f, 15.32248f)), owning_building_guid = 10)
      LocalObject(328, Locker.Constructor(Vector3(2510.73f, 2472.432f, 15.32248f)), owning_building_guid = 10)
      LocalObject(329, Locker.Constructor(Vector3(2511.815f, 2471.672f, 15.32248f)), owning_building_guid = 10)
      LocalObject(330, Locker.Constructor(Vector3(2515.534f, 2469.068f, 15.32248f)), owning_building_guid = 10)
      LocalObject(331, Locker.Constructor(Vector3(2516.629f, 2468.301f, 15.32248f)), owning_building_guid = 10)
      LocalObject(332, Locker.Constructor(Vector3(2517.724f, 2467.535f, 15.32248f)), owning_building_guid = 10)
      LocalObject(333, Locker.Constructor(Vector3(2518.808f, 2466.776f, 15.32248f)), owning_building_guid = 10)
      LocalObject(334, Locker.Constructor(Vector3(2536.168f, 2479.065f, 23.08348f)), owning_building_guid = 10)
      LocalObject(335, Locker.Constructor(Vector3(2537.109f, 2478.406f, 23.08348f)), owning_building_guid = 10)
      LocalObject(336, Locker.Constructor(Vector3(2538.048f, 2477.748f, 23.08348f)), owning_building_guid = 10)
      LocalObject(337, Locker.Constructor(Vector3(2539.002f, 2477.081f, 23.08348f)), owning_building_guid = 10)
      LocalObject(
        46,
        Terminal.Constructor(Vector3(2532.656f, 2455.888f, 45.92548f), air_vehicle_terminal),
        owning_building_guid = 10
      )
      LocalObject(
        401,
        VehicleSpawnPad.Constructor(Vector3(2517.115f, 2441.507f, 42.80048f), mb_pad_creation, Vector3(0, 0, 215)),
        owning_building_guid = 10,
        terminal_guid = 46
      )
      LocalObject(
        47,
        Terminal.Constructor(Vector3(2542.431f, 2449.043f, 45.92548f), air_vehicle_terminal),
        owning_building_guid = 10
      )
      LocalObject(
        402,
        VehicleSpawnPad.Constructor(Vector3(2534.332f, 2429.452f, 42.80048f), mb_pad_creation, Vector3(0, 0, 215)),
        owning_building_guid = 10,
        terminal_guid = 47
      )
      LocalObject(
        430,
        Terminal.Constructor(Vector3(2529.136f, 2468.379f, 24.41248f), order_terminal),
        owning_building_guid = 10
      )
      LocalObject(
        431,
        Terminal.Constructor(Vector3(2531.309f, 2471.483f, 24.41248f), order_terminal),
        owning_building_guid = 10
      )
      LocalObject(
        432,
        Terminal.Constructor(Vector3(2533.449f, 2474.539f, 24.41248f), order_terminal),
        owning_building_guid = 10
      )
      LocalObject(
        433,
        Terminal.Constructor(Vector3(2544.703f, 2449.473f, 36.65248f), order_terminal),
        owning_building_guid = 10
      )
      LocalObject(
        649,
        Terminal.Constructor(Vector3(2513.172f, 2464.04f, 36.90448f), spawn_terminal),
        owning_building_guid = 10
      )
      LocalObject(
        650,
        Terminal.Constructor(Vector3(2518.252f, 2431.702f, 42.24548f), spawn_terminal),
        owning_building_guid = 10
      )
      LocalObject(
        651,
        Terminal.Constructor(Vector3(2538.685f, 2458.159f, 24.95648f), spawn_terminal),
        owning_building_guid = 10
      )
      LocalObject(
        652,
        Terminal.Constructor(Vector3(2542.867f, 2464.127f, 24.95648f), spawn_terminal),
        owning_building_guid = 10
      )
      LocalObject(
        653,
        Terminal.Constructor(Vector3(2547.046f, 2470.103f, 24.95648f), spawn_terminal),
        owning_building_guid = 10
      )
      LocalObject(
        654,
        Terminal.Constructor(Vector3(2552.687f, 2469.391f, 16.87948f), spawn_terminal),
        owning_building_guid = 10
      )
      LocalObject(
        655,
        Terminal.Constructor(Vector3(2606.432f, 2490.355f, 24.37948f), spawn_terminal),
        owning_building_guid = 10
      )
      LocalObject(
        699,
        Terminal.Constructor(Vector3(2594.597f, 2431.705f, 16.03648f), ground_vehicle_terminal),
        owning_building_guid = 10
      )
      LocalObject(
        403,
        VehicleSpawnPad.Constructor(Vector3(2588.377f, 2422.734f, 7.759481f), mb_pad_creation, Vector3(0, 0, 215)),
        owning_building_guid = 10,
        terminal_guid = 699
      )
      LocalObject(603, ResourceSilo.Constructor(Vector3(2462.743f, 2434.752f, 37.23048f)), owning_building_guid = 10)
      LocalObject(
        619,
        SpawnTube.Constructor(Vector3(2538.463f, 2456.557f, 22.82248f), Vector3(0, 0, 215)),
        owning_building_guid = 10
      )
      LocalObject(
        620,
        SpawnTube.Constructor(Vector3(2542.643f, 2462.527f, 22.82248f), Vector3(0, 0, 215)),
        owning_building_guid = 10
      )
      LocalObject(
        621,
        SpawnTube.Constructor(Vector3(2546.825f, 2468.5f, 22.82248f), Vector3(0, 0, 215)),
        owning_building_guid = 10
      )
      LocalObject(
        408,
        ProximityTerminal.Constructor(Vector3(2514.001f, 2470.807f, 15.32248f), medical_terminal),
        owning_building_guid = 10
      )
      LocalObject(
        409,
        ProximityTerminal.Constructor(Vector3(2550.773f, 2458.144f, 35.31948f), medical_terminal),
        owning_building_guid = 10
      )
      LocalObject(
        491,
        ProximityTerminal.Constructor(Vector3(2490.923f, 2486.378f, 38.43048f), pad_landing_frame),
        owning_building_guid = 10
      )
      LocalObject(
        492,
        Terminal.Constructor(Vector3(2490.923f, 2486.378f, 38.43048f), air_rearm_terminal),
        owning_building_guid = 10
      )
      LocalObject(
        497,
        ProximityTerminal.Constructor(Vector3(2505.396f, 2496.077f, 40.87448f), pad_landing_frame),
        owning_building_guid = 10
      )
      LocalObject(
        498,
        Terminal.Constructor(Vector3(2505.396f, 2496.077f, 40.87448f), air_rearm_terminal),
        owning_building_guid = 10
      )
      LocalObject(
        509,
        ProximityTerminal.Constructor(Vector3(2557.757f, 2507.302f, 38.43048f), pad_landing_frame),
        owning_building_guid = 10
      )
      LocalObject(
        510,
        Terminal.Constructor(Vector3(2557.757f, 2507.302f, 38.43048f), air_rearm_terminal),
        owning_building_guid = 10
      )
      LocalObject(
        512,
        ProximityTerminal.Constructor(Vector3(2561.328f, 2484.236f, 45.66948f), pad_landing_frame),
        owning_building_guid = 10
      )
      LocalObject(
        513,
        Terminal.Constructor(Vector3(2561.328f, 2484.236f, 45.66948f), air_rearm_terminal),
        owning_building_guid = 10
      )
      LocalObject(
        515,
        ProximityTerminal.Constructor(Vector3(2570.286f, 2409.162f, 40.77248f), pad_landing_frame),
        owning_building_guid = 10
      )
      LocalObject(
        516,
        Terminal.Constructor(Vector3(2570.286f, 2409.162f, 40.77248f), air_rearm_terminal),
        owning_building_guid = 10
      )
      LocalObject(
        518,
        ProximityTerminal.Constructor(Vector3(2596.171f, 2410.779f, 38.41748f), pad_landing_frame),
        owning_building_guid = 10
      )
      LocalObject(
        519,
        Terminal.Constructor(Vector3(2596.171f, 2410.779f, 38.41748f), air_rearm_terminal),
        owning_building_guid = 10
      )
      LocalObject(
        590,
        ProximityTerminal.Constructor(Vector3(2507.865f, 2392.07f, 29.95098f), repair_silo),
        owning_building_guid = 10
      )
      LocalObject(
        591,
        Terminal.Constructor(Vector3(2507.865f, 2392.07f, 29.95098f), ground_rearm_terminal),
        owning_building_guid = 10
      )
      LocalObject(
        594,
        ProximityTerminal.Constructor(Vector3(2537.191f, 2535.644f, 29.97248f), repair_silo),
        owning_building_guid = 10
      )
      LocalObject(
        595,
        Terminal.Constructor(Vector3(2537.191f, 2535.644f, 29.97248f), ground_rearm_terminal),
        owning_building_guid = 10
      )
      LocalObject(
        379,
        FacilityTurret.Constructor(Vector3(2439.403f, 2443.962f, 38.72148f), manned_turret),
        owning_building_guid = 10
      )
      TurretToWeapon(379, 5012)
      LocalObject(
        381,
        FacilityTurret.Constructor(Vector3(2470.711f, 2348.235f, 38.72148f), manned_turret),
        owning_building_guid = 10
      )
      TurretToWeapon(381, 5013)
      LocalObject(
        382,
        FacilityTurret.Constructor(Vector3(2474.93f, 2508.172f, 38.72148f), manned_turret),
        owning_building_guid = 10
      )
      TurretToWeapon(382, 5014)
      LocalObject(
        384,
        FacilityTurret.Constructor(Vector3(2518.408f, 2556.793f, 38.72148f), manned_turret),
        owning_building_guid = 10
      )
      TurretToWeapon(384, 5015)
      LocalObject(
        386,
        FacilityTurret.Constructor(Vector3(2544.185f, 2296.788f, 38.72148f), manned_turret),
        owning_building_guid = 10
      )
      TurretToWeapon(386, 5016)
      LocalObject(
        388,
        FacilityTurret.Constructor(Vector3(2653.351f, 2462.295f, 38.72148f), manned_turret),
        owning_building_guid = 10
      )
      TurretToWeapon(388, 5017)
      LocalObject(541, Painbox.Constructor(Vector3(2513.093f, 2443.87f, 18.79578f), painbox), owning_building_guid = 10)
      LocalObject(
        544,
        Painbox.Constructor(Vector3(2536.036f, 2468.083f, 27.09238f), painbox_continuous),
        owning_building_guid = 10
      )
      LocalObject(
        547,
        Painbox.Constructor(Vector3(2519.938f, 2457.066f, 18.48188f), painbox_door_radius),
        owning_building_guid = 10
      )
      LocalObject(
        554,
        Painbox.Constructor(Vector3(2519.685f, 2470.551f, 26.40478f), painbox_door_radius_continuous),
        owning_building_guid = 10
      )
      LocalObject(
        555,
        Painbox.Constructor(Vector3(2528.482f, 2455.602f, 25.49868f), painbox_door_radius_continuous),
        owning_building_guid = 10
      )
      LocalObject(
        556,
        Painbox.Constructor(Vector3(2544.927f, 2477.647f, 24.95038f), painbox_door_radius_continuous),
        owning_building_guid = 10
      )
      LocalObject(68, Generator.Constructor(Vector3(2509.339f, 2442.41f, 14.02848f)), owning_building_guid = 10)
      LocalObject(
        65,
        Terminal.Constructor(Vector3(2514f, 2449.148f, 15.32248f), gen_control),
        owning_building_guid = 10
      )
    }

    Building6()

    def Building6(): Unit = { // Name: Central_Indigo_Tower_97 Type: tower_a GUID: 13, MapID: 6
      LocalBuilding(
        "Central_Indigo_Tower_97",
        13,
        6,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(1660f, 1476f, 33.07596f), Vector3(0f, 0f, 320f), tower_a)
        )
      )
      LocalObject(
        629,
        CaptureTerminal.Constructor(Vector3(1672.64f, 1465.259f, 43.07496f), secondary_capture),
        owning_building_guid = 13
      )
      LocalObject(86, Door.Constructor(Vector3(1664.05f, 1462.158f, 34.59696f)), owning_building_guid = 13)
      LocalObject(87, Door.Constructor(Vector3(1664.05f, 1462.158f, 54.59596f)), owning_building_guid = 13)
      LocalObject(88, Door.Constructor(Vector3(1674.335f, 1474.415f, 34.59696f)), owning_building_guid = 13)
      LocalObject(89, Door.Constructor(Vector3(1674.335f, 1474.415f, 54.59596f)), owning_building_guid = 13)
      LocalObject(661, Door.Constructor(Vector3(1661.335f, 1460.251f, 24.41196f)), owning_building_guid = 13)
      LocalObject(662, Door.Constructor(Vector3(1671.883f, 1472.822f, 24.41196f)), owning_building_guid = 13)
      LocalObject(
        228,
        IFFLock.Constructor(Vector3(1665.097f, 1460.221f, 34.53696f), Vector3(0, 0, 220)),
        owning_building_guid = 13,
        door_guid = 86
      )
      LocalObject(
        229,
        IFFLock.Constructor(Vector3(1665.097f, 1460.221f, 54.53696f), Vector3(0, 0, 220)),
        owning_building_guid = 13,
        door_guid = 87
      )
      LocalObject(
        230,
        IFFLock.Constructor(Vector3(1673.291f, 1476.349f, 34.53696f), Vector3(0, 0, 40)),
        owning_building_guid = 13,
        door_guid = 88
      )
      LocalObject(
        231,
        IFFLock.Constructor(Vector3(1673.291f, 1476.349f, 54.53696f), Vector3(0, 0, 40)),
        owning_building_guid = 13,
        door_guid = 89
      )
      LocalObject(290, Locker.Constructor(Vector3(1662.374f, 1454.379f, 23.06996f)), owning_building_guid = 13)
      LocalObject(291, Locker.Constructor(Vector3(1663.398f, 1453.52f, 23.06996f)), owning_building_guid = 13)
      LocalObject(292, Locker.Constructor(Vector3(1665.457f, 1451.792f, 23.06996f)), owning_building_guid = 13)
      LocalObject(293, Locker.Constructor(Vector3(1666.531f, 1450.891f, 23.06996f)), owning_building_guid = 13)
      LocalObject(294, Locker.Constructor(Vector3(1676.459f, 1471.111f, 23.06996f)), owning_building_guid = 13)
      LocalObject(295, Locker.Constructor(Vector3(1677.484f, 1470.252f, 23.06996f)), owning_building_guid = 13)
      LocalObject(296, Locker.Constructor(Vector3(1679.516f, 1468.547f, 23.06996f)), owning_building_guid = 13)
      LocalObject(297, Locker.Constructor(Vector3(1680.59f, 1467.646f, 23.06996f)), owning_building_guid = 13)
      LocalObject(
        417,
        Terminal.Constructor(Vector3(1670.083f, 1454.654f, 24.40796f), order_terminal),
        owning_building_guid = 13
      )
      LocalObject(
        418,
        Terminal.Constructor(Vector3(1673.762f, 1459.039f, 24.40796f), order_terminal),
        owning_building_guid = 13
      )
      LocalObject(
        419,
        Terminal.Constructor(Vector3(1677.221f, 1463.161f, 24.40796f), order_terminal),
        owning_building_guid = 13
      )
      LocalObject(
        610,
        SpawnTube.Constructor(Vector3(1660.322f, 1459.728f, 22.55796f), respawn_tube_tower, Vector3(0, 0, 40)),
        owning_building_guid = 13
      )
      LocalObject(
        611,
        SpawnTube.Constructor(Vector3(1670.87f, 1472.299f, 22.55796f), respawn_tube_tower, Vector3(0, 0, 40)),
        owning_building_guid = 13
      )
      LocalObject(
        372,
        FacilityTurret.Constructor(Vector3(1642.12f, 1474.418f, 52.01796f), manned_turret),
        owning_building_guid = 13
      )
      TurretToWeapon(372, 5018)
      LocalObject(
        374,
        FacilityTurret.Constructor(Vector3(1685.516f, 1471.177f, 52.01796f), manned_turret),
        owning_building_guid = 13
      )
      TurretToWeapon(374, 5019)
      LocalObject(
        560,
        Painbox.Constructor(Vector3(1660.027f, 1467.888f, 24.57506f), painbox_radius_continuous),
        owning_building_guid = 13
      )
      LocalObject(
        561,
        Painbox.Constructor(Vector3(1666.719f, 1457.599f, 23.17596f), painbox_radius_continuous),
        owning_building_guid = 13
      )
      LocalObject(
        562,
        Painbox.Constructor(Vector3(1674.279f, 1466.742f, 23.17596f), painbox_radius_continuous),
        owning_building_guid = 13
      )
    }

    Building4()

    def Building4(): Unit = { // Name: Central_Red_Tower_97 Type: tower_a GUID: 14, MapID: 4
      LocalBuilding(
        "Central_Red_Tower_97",
        14,
        4,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(1966f, 2912f, 33.54289f), Vector3(0f, 0f, 5f), tower_a)
        )
      )
      LocalObject(
        630,
        CaptureTerminal.Constructor(Vector3(1982.533f, 2913.343f, 43.54189f), secondary_capture),
        owning_building_guid = 14
      )
      LocalObject(90, Door.Constructor(Vector3(1977.257f, 2921.015f, 35.06389f)), owning_building_guid = 14)
      LocalObject(91, Door.Constructor(Vector3(1977.257f, 2921.015f, 55.06289f)), owning_building_guid = 14)
      LocalObject(92, Door.Constructor(Vector3(1978.652f, 2905.076f, 35.06389f)), owning_building_guid = 14)
      LocalObject(93, Door.Constructor(Vector3(1978.652f, 2905.076f, 55.06289f)), owning_building_guid = 14)
      LocalObject(663, Door.Constructor(Vector3(1976.65f, 2918.156f, 24.87889f)), owning_building_guid = 14)
      LocalObject(664, Door.Constructor(Vector3(1978.08f, 2901.808f, 24.87889f)), owning_building_guid = 14)
      LocalObject(
        232,
        IFFLock.Constructor(Vector3(1975.151f, 2921.645f, 35.00389f), Vector3(0, 0, 355)),
        owning_building_guid = 14,
        door_guid = 90
      )
      LocalObject(
        233,
        IFFLock.Constructor(Vector3(1975.151f, 2921.645f, 55.00389f), Vector3(0, 0, 355)),
        owning_building_guid = 14,
        door_guid = 91
      )
      LocalObject(
        234,
        IFFLock.Constructor(Vector3(1980.761f, 2904.447f, 35.00389f), Vector3(0, 0, 175)),
        owning_building_guid = 14,
        door_guid = 92
      )
      LocalObject(
        235,
        IFFLock.Constructor(Vector3(1980.761f, 2904.447f, 55.00389f), Vector3(0, 0, 175)),
        owning_building_guid = 14,
        door_guid = 93
      )
      LocalObject(298, Locker.Constructor(Vector3(1981.095f, 2920.182f, 23.53689f)), owning_building_guid = 14)
      LocalObject(299, Locker.Constructor(Vector3(1982.427f, 2920.298f, 23.53689f)), owning_building_guid = 14)
      LocalObject(300, Locker.Constructor(Vector3(1982.967f, 2898.39f, 23.53689f)), owning_building_guid = 14)
      LocalObject(301, Locker.Constructor(Vector3(1984.299f, 2898.506f, 23.53689f)), owning_building_guid = 14)
      LocalObject(302, Locker.Constructor(Vector3(1985.07f, 2920.53f, 23.53689f)), owning_building_guid = 14)
      LocalObject(303, Locker.Constructor(Vector3(1986.467f, 2920.652f, 23.53689f)), owning_building_guid = 14)
      LocalObject(304, Locker.Constructor(Vector3(1986.976f, 2898.741f, 23.53689f)), owning_building_guid = 14)
      LocalObject(305, Locker.Constructor(Vector3(1988.373f, 2898.863f, 23.53689f)), owning_building_guid = 14)
      LocalObject(
        420,
        Terminal.Constructor(Vector3(1987.256f, 2915.098f, 24.87489f), order_terminal),
        owning_building_guid = 14
      )
      LocalObject(
        421,
        Terminal.Constructor(Vector3(1987.725f, 2909.738f, 24.87489f), order_terminal),
        owning_building_guid = 14
      )
      LocalObject(
        422,
        Terminal.Constructor(Vector3(1988.224f, 2904.036f, 24.87489f), order_terminal),
        owning_building_guid = 14
      )
      LocalObject(
        612,
        SpawnTube.Constructor(Vector3(1976.303f, 2917.069f, 23.02489f), respawn_tube_tower, Vector3(0, 0, 355)),
        owning_building_guid = 14
      )
      LocalObject(
        613,
        SpawnTube.Constructor(Vector3(1977.734f, 2900.722f, 23.02489f), respawn_tube_tower, Vector3(0, 0, 355)),
        owning_building_guid = 14
      )
      LocalObject(
        375,
        FacilityTurret.Constructor(Vector3(1954.476f, 2898.238f, 52.48489f), manned_turret),
        owning_building_guid = 14
      )
      TurretToWeapon(375, 5020)
      LocalObject(
        376,
        FacilityTurret.Constructor(Vector3(1987.453f, 2926.632f, 52.48489f), manned_turret),
        owning_building_guid = 14
      )
      TurretToWeapon(376, 5021)
      LocalObject(
        563,
        Painbox.Constructor(Vector3(1971.755f, 2906.283f, 25.04199f), painbox_radius_continuous),
        owning_building_guid = 14
      )
      LocalObject(
        564,
        Painbox.Constructor(Vector3(1982.643f, 2915.55f, 23.64289f), painbox_radius_continuous),
        owning_building_guid = 14
      )
      LocalObject(
        565,
        Painbox.Constructor(Vector3(1983.763f, 2903.739f, 23.64289f), painbox_radius_continuous),
        owning_building_guid = 14
      )
    }

    Building5()

    def Building5(): Unit = { // Name: Central_Blue_Tower_97 Type: tower_a GUID: 15, MapID: 5
      LocalBuilding(
        "Central_Blue_Tower_97",
        15,
        5,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(2878f, 1898f, 37.28446f), Vector3(0f, 0f, 33f), tower_a)
        )
      )
      LocalObject(
        634,
        CaptureTerminal.Constructor(Vector3(2891.967f, 1906.948f, 47.28346f), secondary_capture),
        owning_building_guid = 15
      )
      LocalObject(137, Door.Constructor(Vector3(2883.707f, 1911.245f, 38.80546f)), owning_building_guid = 15)
      LocalObject(138, Door.Constructor(Vector3(2883.707f, 1911.245f, 58.80446f)), owning_building_guid = 15)
      LocalObject(139, Door.Constructor(Vector3(2892.421f, 1897.826f, 38.80546f)), owning_building_guid = 15)
      LocalObject(140, Door.Constructor(Vector3(2892.421f, 1897.826f, 58.80446f)), owning_building_guid = 15)
      LocalObject(677, Door.Constructor(Vector3(2884.514f, 1908.435f, 28.62046f)), owning_building_guid = 15)
      LocalObject(678, Door.Constructor(Vector3(2893.451f, 1894.672f, 28.62046f)), owning_building_guid = 15)
      LocalObject(
        266,
        IFFLock.Constructor(Vector3(2881.552f, 1910.812f, 38.74546f), Vector3(0, 0, 327)),
        owning_building_guid = 15,
        door_guid = 137
      )
      LocalObject(
        267,
        IFFLock.Constructor(Vector3(2881.552f, 1910.812f, 58.74546f), Vector3(0, 0, 327)),
        owning_building_guid = 15,
        door_guid = 138
      )
      LocalObject(
        268,
        IFFLock.Constructor(Vector3(2894.58f, 1898.261f, 38.74546f), Vector3(0, 0, 147)),
        owning_building_guid = 15,
        door_guid = 139
      )
      LocalObject(
        269,
        IFFLock.Constructor(Vector3(2894.58f, 1898.261f, 58.74546f), Vector3(0, 0, 147)),
        owning_building_guid = 15,
        door_guid = 140
      )
      LocalObject(354, Locker.Constructor(Vector3(2887.487f, 1912.311f, 27.27846f)), owning_building_guid = 15)
      LocalObject(355, Locker.Constructor(Vector3(2888.609f, 1913.039f, 27.27846f)), owning_building_guid = 15)
      LocalObject(356, Locker.Constructor(Vector3(2890.833f, 1914.484f, 27.27846f)), owning_building_guid = 15)
      LocalObject(357, Locker.Constructor(Vector3(2892.009f, 1915.248f, 27.27846f)), owning_building_guid = 15)
      LocalObject(358, Locker.Constructor(Vector3(2899.37f, 1893.948f, 27.27846f)), owning_building_guid = 15)
      LocalObject(359, Locker.Constructor(Vector3(2900.492f, 1894.677f, 27.27846f)), owning_building_guid = 15)
      LocalObject(360, Locker.Constructor(Vector3(2902.746f, 1896.141f, 27.27846f)), owning_building_guid = 15)
      LocalObject(361, Locker.Constructor(Vector3(2903.922f, 1896.904f, 27.27846f)), owning_building_guid = 15)
      LocalObject(
        440,
        Terminal.Constructor(Vector3(2895.313f, 1910.715f, 28.61646f), order_terminal),
        owning_building_guid = 15
      )
      LocalObject(
        441,
        Terminal.Constructor(Vector3(2898.244f, 1906.202f, 28.61646f), order_terminal),
        owning_building_guid = 15
      )
      LocalObject(
        442,
        Terminal.Constructor(Vector3(2901.361f, 1901.401f, 28.61646f), order_terminal),
        owning_building_guid = 15
      )
      LocalObject(
        626,
        SpawnTube.Constructor(Vector3(2884.717f, 1907.313f, 26.76646f), respawn_tube_tower, Vector3(0, 0, 327)),
        owning_building_guid = 15
      )
      LocalObject(
        627,
        SpawnTube.Constructor(Vector3(2893.655f, 1893.551f, 26.76646f), respawn_tube_tower, Vector3(0, 0, 327)),
        owning_building_guid = 15
      )
      LocalObject(
        393,
        FacilityTurret.Constructor(Vector3(2874.285f, 1880.439f, 56.22646f), manned_turret),
        owning_building_guid = 15
      )
      TurretToWeapon(393, 5022)
      LocalObject(
        394,
        FacilityTurret.Constructor(Vector3(2890.073f, 1920.991f, 56.22646f), manned_turret),
        owning_building_guid = 15
      )
      TurretToWeapon(394, 5023)
      LocalObject(
        575,
        Painbox.Constructor(Vector3(2885.766f, 1895.654f, 28.78356f), painbox_radius_continuous),
        owning_building_guid = 15
      )
      LocalObject(
        576,
        Painbox.Constructor(Vector3(2891.028f, 1908.948f, 27.38446f), painbox_radius_continuous),
        owning_building_guid = 15
      )
      LocalObject(
        577,
        Painbox.Constructor(Vector3(2897.562f, 1899.045f, 27.38446f), painbox_radius_continuous),
        owning_building_guid = 15
      )
    }

    Building8()

    def Building8(): Unit = { // Name: Central_Tower_97 Type: tower_b GUID: 16, MapID: 8
      LocalBuilding(
        "Central_Tower_97",
        16,
        8,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(2070f, 2002f, 26.19098f), Vector3(0f, 0f, 310f), tower_b)
        )
      )
      LocalObject(
        631,
        CaptureTerminal.Constructor(Vector3(2080.583f, 1989.227f, 46.18999f), secondary_capture),
        owning_building_guid = 16
      )
      LocalObject(95, Door.Constructor(Vector3(2071.585f, 1987.665f, 27.71099f)), owning_building_guid = 16)
      LocalObject(96, Door.Constructor(Vector3(2071.585f, 1987.665f, 37.71098f)), owning_building_guid = 16)
      LocalObject(97, Door.Constructor(Vector3(2071.585f, 1987.665f, 57.71098f)), owning_building_guid = 16)
      LocalObject(98, Door.Constructor(Vector3(2083.842f, 1997.95f, 27.71099f)), owning_building_guid = 16)
      LocalObject(99, Door.Constructor(Vector3(2083.842f, 1997.95f, 37.71098f)), owning_building_guid = 16)
      LocalObject(100, Door.Constructor(Vector3(2083.842f, 1997.95f, 57.71098f)), owning_building_guid = 16)
      LocalObject(665, Door.Constructor(Vector3(2068.581f, 1986.258f, 17.52699f)), owning_building_guid = 16)
      LocalObject(666, Door.Constructor(Vector3(2081.152f, 1996.806f, 17.52699f)), owning_building_guid = 16)
      LocalObject(
        236,
        IFFLock.Constructor(Vector3(2072.28f, 1985.576f, 27.65199f), Vector3(0, 0, 230)),
        owning_building_guid = 16,
        door_guid = 95
      )
      LocalObject(
        237,
        IFFLock.Constructor(Vector3(2072.28f, 1985.576f, 37.65199f), Vector3(0, 0, 230)),
        owning_building_guid = 16,
        door_guid = 96
      )
      LocalObject(
        238,
        IFFLock.Constructor(Vector3(2072.28f, 1985.576f, 57.65199f), Vector3(0, 0, 230)),
        owning_building_guid = 16,
        door_guid = 97
      )
      LocalObject(
        239,
        IFFLock.Constructor(Vector3(2083.15f, 2000.036f, 27.65199f), Vector3(0, 0, 50)),
        owning_building_guid = 16,
        door_guid = 98
      )
      LocalObject(
        240,
        IFFLock.Constructor(Vector3(2083.15f, 2000.036f, 37.65199f), Vector3(0, 0, 50)),
        owning_building_guid = 16,
        door_guid = 99
      )
      LocalObject(
        241,
        IFFLock.Constructor(Vector3(2083.15f, 2000.036f, 57.65199f), Vector3(0, 0, 50)),
        owning_building_guid = 16,
        door_guid = 100
      )
      LocalObject(306, Locker.Constructor(Vector3(2068.583f, 1980.295f, 16.18499f)), owning_building_guid = 16)
      LocalObject(307, Locker.Constructor(Vector3(2069.442f, 1979.271f, 16.18499f)), owning_building_guid = 16)
      LocalObject(308, Locker.Constructor(Vector3(2071.17f, 1977.212f, 16.18499f)), owning_building_guid = 16)
      LocalObject(309, Locker.Constructor(Vector3(2072.071f, 1976.138f, 16.18499f)), owning_building_guid = 16)
      LocalObject(310, Locker.Constructor(Vector3(2085.36f, 1994.328f, 16.18499f)), owning_building_guid = 16)
      LocalObject(311, Locker.Constructor(Vector3(2086.22f, 1993.303f, 16.18499f)), owning_building_guid = 16)
      LocalObject(312, Locker.Constructor(Vector3(2087.925f, 1991.271f, 16.18499f)), owning_building_guid = 16)
      LocalObject(313, Locker.Constructor(Vector3(2088.826f, 1990.197f, 16.18499f)), owning_building_guid = 16)
      LocalObject(
        423,
        Terminal.Constructor(Vector3(2076.224f, 1979.226f, 17.52298f), order_terminal),
        owning_building_guid = 16
      )
      LocalObject(
        424,
        Terminal.Constructor(Vector3(2080.608f, 1982.906f, 17.52298f), order_terminal),
        owning_building_guid = 16
      )
      LocalObject(
        425,
        Terminal.Constructor(Vector3(2084.73f, 1986.365f, 17.52298f), order_terminal),
        owning_building_guid = 16
      )
      LocalObject(
        614,
        SpawnTube.Constructor(Vector3(2067.491f, 1985.919f, 15.67299f), respawn_tube_tower, Vector3(0, 0, 50)),
        owning_building_guid = 16
      )
      LocalObject(
        615,
        SpawnTube.Constructor(Vector3(2080.062f, 1996.468f, 15.67299f), respawn_tube_tower, Vector3(0, 0, 50)),
        owning_building_guid = 16
      )
      LocalObject(
        566,
        Painbox.Constructor(Vector3(2068.053f, 1993.196f, 17.48038f), painbox_radius_continuous),
        owning_building_guid = 16
      )
      LocalObject(
        567,
        Painbox.Constructor(Vector3(2073.408f, 1982.502f, 16.29099f), painbox_radius_continuous),
        owning_building_guid = 16
      )
      LocalObject(
        568,
        Painbox.Constructor(Vector3(2082.708f, 1990.133f, 16.29099f), painbox_radius_continuous),
        owning_building_guid = 16
      )
    }

    Building7()

    def Building7(): Unit = { // Name: Red_Tower_97 Type: tower_c GUID: 17, MapID: 7
      LocalBuilding(
        "Red_Tower_97",
        17,
        7,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(1452f, 2600f, 37.65374f), Vector3(0f, 0f, 57f), tower_c)
        )
      )
      LocalObject(
        628,
        CaptureTerminal.Constructor(Vector3(1461.12f, 2613.855f, 47.65274f), secondary_capture),
        owning_building_guid = 17
      )
      LocalObject(69, Door.Constructor(Vector3(1451.826f, 2614.421f, 39.17474f)), owning_building_guid = 17)
      LocalObject(70, Door.Constructor(Vector3(1451.826f, 2614.421f, 59.17374f)), owning_building_guid = 17)
      LocalObject(72, Door.Constructor(Vector3(1465.245f, 2605.707f, 39.17474f)), owning_building_guid = 17)
      LocalObject(73, Door.Constructor(Vector3(1465.245f, 2605.707f, 59.17374f)), owning_building_guid = 17)
      LocalObject(656, Door.Constructor(Vector3(1453.706f, 2612.182f, 28.98974f)), owning_building_guid = 17)
      LocalObject(657, Door.Constructor(Vector3(1467.469f, 2603.245f, 28.98974f)), owning_building_guid = 17)
      LocalObject(
        216,
        IFFLock.Constructor(Vector3(1450.033f, 2613.149f, 39.11473f), Vector3(0, 0, 303)),
        owning_building_guid = 17,
        door_guid = 69
      )
      LocalObject(
        217,
        IFFLock.Constructor(Vector3(1450.033f, 2613.149f, 59.11474f), Vector3(0, 0, 303)),
        owning_building_guid = 17,
        door_guid = 70
      )
      LocalObject(
        218,
        IFFLock.Constructor(Vector3(1467.04f, 2606.982f, 39.11473f), Vector3(0, 0, 123)),
        owning_building_guid = 17,
        door_guid = 72
      )
      LocalObject(
        219,
        IFFLock.Constructor(Vector3(1467.04f, 2606.982f, 59.11474f), Vector3(0, 0, 123)),
        owning_building_guid = 17,
        door_guid = 73
      )
      LocalObject(270, Locker.Constructor(Vector3(1454.846f, 2616.933f, 27.64774f)), owning_building_guid = 17)
      LocalObject(271, Locker.Constructor(Vector3(1455.574f, 2618.054f, 27.64774f)), owning_building_guid = 17)
      LocalObject(272, Locker.Constructor(Vector3(1457.019f, 2620.279f, 27.64774f)), owning_building_guid = 17)
      LocalObject(273, Locker.Constructor(Vector3(1457.783f, 2621.455f, 27.64774f)), owning_building_guid = 17)
      LocalObject(274, Locker.Constructor(Vector3(1473.171f, 2604.991f, 27.64774f)), owning_building_guid = 17)
      LocalObject(275, Locker.Constructor(Vector3(1473.899f, 2606.112f, 27.64774f)), owning_building_guid = 17)
      LocalObject(276, Locker.Constructor(Vector3(1475.363f, 2608.366f, 27.64774f)), owning_building_guid = 17)
      LocalObject(277, Locker.Constructor(Vector3(1476.126f, 2609.542f, 27.64774f)), owning_building_guid = 17)
      LocalObject(
        410,
        Terminal.Constructor(Vector3(1462.645f, 2618.657f, 28.98574f), order_terminal),
        owning_building_guid = 17
      )
      LocalObject(
        411,
        Terminal.Constructor(Vector3(1467.158f, 2615.727f, 28.98574f), order_terminal),
        owning_building_guid = 17
      )
      LocalObject(
        412,
        Terminal.Constructor(Vector3(1471.958f, 2612.609f, 28.98574f), order_terminal),
        owning_building_guid = 17
      )
      LocalObject(
        605,
        SpawnTube.Constructor(Vector3(1454.349f, 2611.24f, 27.13574f), respawn_tube_tower, Vector3(0, 0, 303)),
        owning_building_guid = 17
      )
      LocalObject(
        606,
        SpawnTube.Constructor(Vector3(1468.111f, 2602.303f, 27.13574f), respawn_tube_tower, Vector3(0, 0, 303)),
        owning_building_guid = 17
      )
      LocalObject(
        521,
        ProximityTerminal.Constructor(Vector3(1447.069f, 2601.899f, 65.22374f), pad_landing_tower_frame),
        owning_building_guid = 17
      )
      LocalObject(
        522,
        Terminal.Constructor(Vector3(1447.069f, 2601.899f, 65.22374f), air_rearm_terminal),
        owning_building_guid = 17
      )
      LocalObject(
        524,
        ProximityTerminal.Constructor(Vector3(1455.829f, 2596.21f, 65.22374f), pad_landing_tower_frame),
        owning_building_guid = 17
      )
      LocalObject(
        525,
        Terminal.Constructor(Vector3(1455.829f, 2596.21f, 65.22374f), air_rearm_terminal),
        owning_building_guid = 17
      )
      LocalObject(
        366,
        FacilityTurret.Constructor(Vector3(1452.253f, 2627.853f, 56.59573f), manned_turret),
        owning_building_guid = 17
      )
      TurretToWeapon(366, 5024)
      LocalObject(
        368,
        FacilityTurret.Constructor(Vector3(1456.411f, 2579.333f, 56.59573f), manned_turret),
        owning_building_guid = 17
      )
      TurretToWeapon(368, 5025)
      LocalObject(
        557,
        Painbox.Constructor(Vector3(1459.625f, 2615.453f, 27.75374f), painbox_radius_continuous),
        owning_building_guid = 17
      )
      LocalObject(
        558,
        Painbox.Constructor(Vector3(1460.423f, 2599.841f, 29.67324f), painbox_radius_continuous),
        owning_building_guid = 17
      )
      LocalObject(
        559,
        Painbox.Constructor(Vector3(1469.99f, 2608.496f, 27.75374f), painbox_radius_continuous),
        owning_building_guid = 17
      )
    }

    Building10()

    def Building10(): Unit = { // Name: Indigo_Tower_97 Type: tower_c GUID: 18, MapID: 10
      LocalBuilding(
        "Indigo_Tower_97",
        18,
        10,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(2760f, 1398f, 30.46968f), Vector3(0f, 0f, 360f), tower_c)
        )
      )
      LocalObject(
        632,
        CaptureTerminal.Constructor(Vector3(2776.587f, 1397.897f, 40.46868f), secondary_capture),
        owning_building_guid = 18
      )
      LocalObject(129, Door.Constructor(Vector3(2772f, 1390f, 31.99068f)), owning_building_guid = 18)
      LocalObject(130, Door.Constructor(Vector3(2772f, 1390f, 51.98968f)), owning_building_guid = 18)
      LocalObject(131, Door.Constructor(Vector3(2772f, 1406f, 31.99068f)), owning_building_guid = 18)
      LocalObject(132, Door.Constructor(Vector3(2772f, 1406f, 51.98968f)), owning_building_guid = 18)
      LocalObject(673, Door.Constructor(Vector3(2771.146f, 1386.794f, 21.80568f)), owning_building_guid = 18)
      LocalObject(674, Door.Constructor(Vector3(2771.146f, 1403.204f, 21.80568f)), owning_building_guid = 18)
      LocalObject(
        258,
        IFFLock.Constructor(Vector3(2769.957f, 1406.811f, 31.93068f), Vector3(0, 0, 0)),
        owning_building_guid = 18,
        door_guid = 131
      )
      LocalObject(
        259,
        IFFLock.Constructor(Vector3(2769.957f, 1406.811f, 51.93068f), Vector3(0, 0, 0)),
        owning_building_guid = 18,
        door_guid = 132
      )
      LocalObject(
        260,
        IFFLock.Constructor(Vector3(2774.047f, 1389.189f, 31.93068f), Vector3(0, 0, 180)),
        owning_building_guid = 18,
        door_guid = 129
      )
      LocalObject(
        261,
        IFFLock.Constructor(Vector3(2774.047f, 1389.189f, 51.93068f), Vector3(0, 0, 180)),
        owning_building_guid = 18,
        door_guid = 130
      )
      LocalObject(338, Locker.Constructor(Vector3(2775.716f, 1382.963f, 20.46368f)), owning_building_guid = 18)
      LocalObject(339, Locker.Constructor(Vector3(2775.751f, 1404.835f, 20.46368f)), owning_building_guid = 18)
      LocalObject(340, Locker.Constructor(Vector3(2777.053f, 1382.963f, 20.46368f)), owning_building_guid = 18)
      LocalObject(341, Locker.Constructor(Vector3(2777.088f, 1404.835f, 20.46368f)), owning_building_guid = 18)
      LocalObject(342, Locker.Constructor(Vector3(2779.741f, 1382.963f, 20.46368f)), owning_building_guid = 18)
      LocalObject(343, Locker.Constructor(Vector3(2779.741f, 1404.835f, 20.46368f)), owning_building_guid = 18)
      LocalObject(344, Locker.Constructor(Vector3(2781.143f, 1382.963f, 20.46368f)), owning_building_guid = 18)
      LocalObject(345, Locker.Constructor(Vector3(2781.143f, 1404.835f, 20.46368f)), owning_building_guid = 18)
      LocalObject(
        434,
        Terminal.Constructor(Vector3(2781.445f, 1388.129f, 21.80168f), order_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        435,
        Terminal.Constructor(Vector3(2781.445f, 1393.853f, 21.80168f), order_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        436,
        Terminal.Constructor(Vector3(2781.445f, 1399.234f, 21.80168f), order_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        622,
        SpawnTube.Constructor(Vector3(2770.706f, 1385.742f, 19.95168f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 18
      )
      LocalObject(
        623,
        SpawnTube.Constructor(Vector3(2770.706f, 1402.152f, 19.95168f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 18
      )
      LocalObject(
        527,
        ProximityTerminal.Constructor(Vector3(2758.907f, 1392.725f, 58.03968f), pad_landing_tower_frame),
        owning_building_guid = 18
      )
      LocalObject(
        528,
        Terminal.Constructor(Vector3(2758.907f, 1392.725f, 58.03968f), air_rearm_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        530,
        ProximityTerminal.Constructor(Vector3(2758.907f, 1403.17f, 58.03968f), pad_landing_tower_frame),
        owning_building_guid = 18
      )
      LocalObject(
        531,
        Terminal.Constructor(Vector3(2758.907f, 1403.17f, 58.03968f), air_rearm_terminal),
        owning_building_guid = 18
      )
      LocalObject(
        389,
        FacilityTurret.Constructor(Vector3(2745.07f, 1383.045f, 49.41168f), manned_turret),
        owning_building_guid = 18
      )
      TurretToWeapon(389, 5026)
      LocalObject(
        391,
        FacilityTurret.Constructor(Vector3(2783.497f, 1412.957f, 49.41168f), manned_turret),
        owning_building_guid = 18
      )
      TurretToWeapon(391, 5027)
      LocalObject(
        569,
        Painbox.Constructor(Vector3(2764.454f, 1390.849f, 22.48918f), painbox_radius_continuous),
        owning_building_guid = 18
      )
      LocalObject(
        570,
        Painbox.Constructor(Vector3(2776.923f, 1387.54f, 20.56968f), painbox_radius_continuous),
        owning_building_guid = 18
      )
      LocalObject(
        571,
        Painbox.Constructor(Vector3(2777.113f, 1400.022f, 20.56968f), painbox_radius_continuous),
        owning_building_guid = 18
      )
    }

    Building9()

    def Building9(): Unit = { // Name: Blue_Tower_97 Type: tower_c GUID: 19, MapID: 9
      LocalBuilding(
        "Blue_Tower_97",
        19,
        9,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(2778f, 2664f, 33.75977f), Vector3(0f, 0f, 360f), tower_c)
        )
      )
      LocalObject(
        633,
        CaptureTerminal.Constructor(Vector3(2794.587f, 2663.897f, 43.75877f), secondary_capture),
        owning_building_guid = 19
      )
      LocalObject(133, Door.Constructor(Vector3(2790f, 2656f, 35.28077f)), owning_building_guid = 19)
      LocalObject(134, Door.Constructor(Vector3(2790f, 2656f, 55.27977f)), owning_building_guid = 19)
      LocalObject(135, Door.Constructor(Vector3(2790f, 2672f, 35.28077f)), owning_building_guid = 19)
      LocalObject(136, Door.Constructor(Vector3(2790f, 2672f, 55.27977f)), owning_building_guid = 19)
      LocalObject(675, Door.Constructor(Vector3(2789.146f, 2652.794f, 25.09577f)), owning_building_guid = 19)
      LocalObject(676, Door.Constructor(Vector3(2789.146f, 2669.204f, 25.09577f)), owning_building_guid = 19)
      LocalObject(
        262,
        IFFLock.Constructor(Vector3(2787.957f, 2672.811f, 35.22076f), Vector3(0, 0, 0)),
        owning_building_guid = 19,
        door_guid = 135
      )
      LocalObject(
        263,
        IFFLock.Constructor(Vector3(2787.957f, 2672.811f, 55.22076f), Vector3(0, 0, 0)),
        owning_building_guid = 19,
        door_guid = 136
      )
      LocalObject(
        264,
        IFFLock.Constructor(Vector3(2792.047f, 2655.189f, 35.22076f), Vector3(0, 0, 180)),
        owning_building_guid = 19,
        door_guid = 133
      )
      LocalObject(
        265,
        IFFLock.Constructor(Vector3(2792.047f, 2655.189f, 55.22076f), Vector3(0, 0, 180)),
        owning_building_guid = 19,
        door_guid = 134
      )
      LocalObject(346, Locker.Constructor(Vector3(2793.716f, 2648.963f, 23.75377f)), owning_building_guid = 19)
      LocalObject(347, Locker.Constructor(Vector3(2793.751f, 2670.835f, 23.75377f)), owning_building_guid = 19)
      LocalObject(348, Locker.Constructor(Vector3(2795.053f, 2648.963f, 23.75377f)), owning_building_guid = 19)
      LocalObject(349, Locker.Constructor(Vector3(2795.088f, 2670.835f, 23.75377f)), owning_building_guid = 19)
      LocalObject(350, Locker.Constructor(Vector3(2797.741f, 2648.963f, 23.75377f)), owning_building_guid = 19)
      LocalObject(351, Locker.Constructor(Vector3(2797.741f, 2670.835f, 23.75377f)), owning_building_guid = 19)
      LocalObject(352, Locker.Constructor(Vector3(2799.143f, 2648.963f, 23.75377f)), owning_building_guid = 19)
      LocalObject(353, Locker.Constructor(Vector3(2799.143f, 2670.835f, 23.75377f)), owning_building_guid = 19)
      LocalObject(
        437,
        Terminal.Constructor(Vector3(2799.445f, 2654.129f, 25.09177f), order_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        438,
        Terminal.Constructor(Vector3(2799.445f, 2659.853f, 25.09177f), order_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        439,
        Terminal.Constructor(Vector3(2799.445f, 2665.234f, 25.09177f), order_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        624,
        SpawnTube.Constructor(Vector3(2788.706f, 2651.742f, 23.24177f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 19
      )
      LocalObject(
        625,
        SpawnTube.Constructor(Vector3(2788.706f, 2668.152f, 23.24177f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 19
      )
      LocalObject(
        533,
        ProximityTerminal.Constructor(Vector3(2776.907f, 2658.725f, 61.32977f), pad_landing_tower_frame),
        owning_building_guid = 19
      )
      LocalObject(
        534,
        Terminal.Constructor(Vector3(2776.907f, 2658.725f, 61.32977f), air_rearm_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        536,
        ProximityTerminal.Constructor(Vector3(2776.907f, 2669.17f, 61.32977f), pad_landing_tower_frame),
        owning_building_guid = 19
      )
      LocalObject(
        537,
        Terminal.Constructor(Vector3(2776.907f, 2669.17f, 61.32977f), air_rearm_terminal),
        owning_building_guid = 19
      )
      LocalObject(
        390,
        FacilityTurret.Constructor(Vector3(2763.07f, 2649.045f, 52.70177f), manned_turret),
        owning_building_guid = 19
      )
      TurretToWeapon(390, 5028)
      LocalObject(
        392,
        FacilityTurret.Constructor(Vector3(2801.497f, 2678.957f, 52.70177f), manned_turret),
        owning_building_guid = 19
      )
      TurretToWeapon(392, 5029)
      LocalObject(
        572,
        Painbox.Constructor(Vector3(2782.454f, 2656.849f, 25.77927f), painbox_radius_continuous),
        owning_building_guid = 19
      )
      LocalObject(
        573,
        Painbox.Constructor(Vector3(2794.923f, 2653.54f, 23.85977f), painbox_radius_continuous),
        owning_building_guid = 19
      )
      LocalObject(
        574,
        Painbox.Constructor(Vector3(2795.113f, 2666.022f, 23.85977f), painbox_radius_continuous),
        owning_building_guid = 19
      )
    }

    Building10001()

    def Building10001(): Unit = { // Name: Map97_Gate_Two Type: warpgate_small GUID: 20, MapID: 10001
      LocalBuilding(
        "Map97_Gate_Two",
        20,
        10001,
        FoundationBuilder(WarpGate.Structure(Vector3(1173.69f, 2615.84f, 30.79f)))
      )
    }

    Building10003()

    def Building10003(): Unit = { // Name: Map97_Gate_Three Type: warpgate_small GUID: 21, MapID: 10003
      LocalBuilding(
        "Map97_Gate_Three",
        21,
        10003,
        FoundationBuilder(WarpGate.Structure(Vector3(2830.98f, 1170.55f, 30.79f)))
      )
    }

    Building10002()

    def Building10002(): Unit = { // Name: Map97_Gate_One Type: warpgate_small GUID: 22, MapID: 10002
      LocalBuilding(
        "Map97_Gate_One",
        22,
        10002,
        FoundationBuilder(WarpGate.Structure(Vector3(2933.49f, 2963.42f, 30.79f)))
      )
    }

    def Lattice(): Unit = {
      LatticeLink("Red_Base_97", "Blue_Base_97")
      LatticeLink("Blue_Base_97", "Indigo_Base_97")
      LatticeLink("Indigo_Base_97", "Red_Base_97")
      LatticeLink("Red_Base_97", "Map97_Gate_Two")
      LatticeLink("Blue_Base_97", "Map97_Gate_One")
      LatticeLink("Indigo_Base_97", "Map97_Gate_Three")
    }

    Lattice()

  }
}
