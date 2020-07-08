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

object Map96 { // Nexus
  val ZoneMap = new ZoneMap("map96") {
    Scale = MapScale.Dim4096
    Checksum = 846603446L

    Building1()

    def Building1(): Unit = { // Name: Nexus_Base Type: comm_station_dsp GUID: 1, MapID: 1
      LocalBuilding(
        "Nexus_Base",
        1,
        1,
        FoundationBuilder(
          Building.Structure(
            StructureType.Facility,
            Vector3(1922f, 1940f, 35.71276f),
            Vector3(0f, 0f, 360f),
            comm_station_dsp
          )
        )
      )
      LocalObject(
        21,
        CaptureTerminal.Constructor(Vector3(1998.089f, 1920.734f, 18.31276f), capture_terminal),
        owning_building_guid = 1
      )
      LocalObject(23, Door.Constructor(Vector3(1990.339f, 2010.464f, 39.09076f)), owning_building_guid = 1)
      LocalObject(36, Door.Constructor(Vector3(1862.196f, 1896.501f, 37.36376f)), owning_building_guid = 1)
      LocalObject(37, Door.Constructor(Vector3(1862.196f, 1914.693f, 45.32776f)), owning_building_guid = 1)
      LocalObject(38, Door.Constructor(Vector3(1879.307f, 1872.197f, 45.32776f)), owning_building_guid = 1)
      LocalObject(39, Door.Constructor(Vector3(1897.499f, 1872.197f, 37.36376f)), owning_building_guid = 1)
      LocalObject(40, Door.Constructor(Vector3(1902f, 1931.231f, 42.33376f)), owning_building_guid = 1)
      LocalObject(41, Door.Constructor(Vector3(1902f, 1940.295f, 42.33376f)), owning_building_guid = 1)
      LocalObject(42, Door.Constructor(Vector3(1914.763f, 2059.958f, 37.36376f)), owning_building_guid = 1)
      LocalObject(43, Door.Constructor(Vector3(1917.625f, 1932.59f, 49.77276f)), owning_building_guid = 1)
      LocalObject(44, Door.Constructor(Vector3(1927.627f, 2072.823f, 45.32676f)), owning_building_guid = 1)
      LocalObject(45, Door.Constructor(Vector3(1930f, 1960f, 42.33376f)), owning_building_guid = 1)
      LocalObject(46, Door.Constructor(Vector3(1969.721f, 2104.353f, 37.36376f)), owning_building_guid = 1)
      LocalObject(47, Door.Constructor(Vector3(1975.952f, 2044.355f, 42.32976f)), owning_building_guid = 1)
      LocalObject(48, Door.Constructor(Vector3(1977.927f, 2014.35f, 37.33576f)), owning_building_guid = 1)
      LocalObject(49, Door.Constructor(Vector3(1987.914f, 2104.353f, 45.32676f)), owning_building_guid = 1)
      LocalObject(50, Door.Constructor(Vector3(2001.929f, 1927.406f, 45.32776f)), owning_building_guid = 1)
      LocalObject(51, Door.Constructor(Vector3(2014.793f, 1940.27f, 37.36376f)), owning_building_guid = 1)
      LocalObject(52, Door.Constructor(Vector3(2028.977f, 2003.008f, 45.32676f)), owning_building_guid = 1)
      LocalObject(53, Door.Constructor(Vector3(2028.977f, 2021.2f, 37.36376f)), owning_building_guid = 1)
      LocalObject(54, Door.Constructor(Vector3(2038f, 2020f, 37.33376f)), owning_building_guid = 1)
      LocalObject(71, Door.Constructor(Vector3(1906f, 1936f, 42.33376f)), owning_building_guid = 1)
      LocalObject(72, Door.Constructor(Vector3(1906f, 1952f, 37.33376f)), owning_building_guid = 1)
      LocalObject(73, Door.Constructor(Vector3(1930f, 1952f, 42.33376f)), owning_building_guid = 1)
      LocalObject(74, Door.Constructor(Vector3(1930f, 1960f, 32.33376f)), owning_building_guid = 1)
      LocalObject(75, Door.Constructor(Vector3(1934f, 1948f, 37.33376f)), owning_building_guid = 1)
      LocalObject(76, Door.Constructor(Vector3(1942f, 1948f, 32.33376f)), owning_building_guid = 1)
      LocalObject(77, Door.Constructor(Vector3(1946f, 1984f, 27.33376f)), owning_building_guid = 1)
      LocalObject(78, Door.Constructor(Vector3(1950f, 1972f, 19.83376f)), owning_building_guid = 1)
      LocalObject(79, Door.Constructor(Vector3(1962f, 1936f, 19.83376f)), owning_building_guid = 1)
      LocalObject(80, Door.Constructor(Vector3(1962f, 2000f, 19.83376f)), owning_building_guid = 1)
      LocalObject(81, Door.Constructor(Vector3(1966f, 1932f, 27.33376f)), owning_building_guid = 1)
      LocalObject(82, Door.Constructor(Vector3(1966f, 1948f, 27.33376f)), owning_building_guid = 1)
      LocalObject(83, Door.Constructor(Vector3(1966f, 1972f, 27.33376f)), owning_building_guid = 1)
      LocalObject(84, Door.Constructor(Vector3(1978f, 1952f, 19.83376f)), owning_building_guid = 1)
      LocalObject(85, Door.Constructor(Vector3(1978f, 1968f, 27.33376f)), owning_building_guid = 1)
      LocalObject(86, Door.Constructor(Vector3(1981.921f, 2034.351f, 42.33576f)), owning_building_guid = 1)
      LocalObject(87, Door.Constructor(Vector3(1994f, 1912f, 19.83376f)), owning_building_guid = 1)
      LocalObject(88, Door.Constructor(Vector3(2002f, 1912f, 19.83376f)), owning_building_guid = 1)
      LocalObject(89, Door.Constructor(Vector3(2006f, 1924f, 19.83376f)), owning_building_guid = 1)
      LocalObject(90, Door.Constructor(Vector3(2010f, 1944f, 27.33376f)), owning_building_guid = 1)
      LocalObject(91, Door.Constructor(Vector3(2010f, 1976f, 27.33376f)), owning_building_guid = 1)
      LocalObject(92, Door.Constructor(Vector3(1939.707f, 1935.922f, 38.10476f)), owning_building_guid = 1)
      LocalObject(303, Door.Constructor(Vector3(1958.673f, 1953.733f, 27.66676f)), owning_building_guid = 1)
      LocalObject(304, Door.Constructor(Vector3(1958.673f, 1961.026f, 27.66676f)), owning_building_guid = 1)
      LocalObject(305, Door.Constructor(Vector3(1958.673f, 1968.315f, 27.66676f)), owning_building_guid = 1)
      LocalObject(
        94,
        IFFLock.Constructor(Vector3(1942.454f, 1939.09f, 37.28076f), Vector3(0, 0, 90)),
        owning_building_guid = 1,
        door_guid = 92
      )
      LocalObject(
        103,
        IFFLock.Constructor(Vector3(1899.959f, 1941.104f, 42.28076f), Vector3(0, 0, 0)),
        owning_building_guid = 1,
        door_guid = 41
      )
      LocalObject(
        104,
        IFFLock.Constructor(Vector3(1904.04f, 1930.42f, 42.28076f), Vector3(0, 0, 180)),
        owning_building_guid = 1,
        door_guid = 40
      )
      LocalObject(
        105,
        IFFLock.Constructor(Vector3(1916.817f, 1930.514f, 49.78076f), Vector3(0, 0, 270)),
        owning_building_guid = 1,
        door_guid = 43
      )
      LocalObject(
        106,
        IFFLock.Constructor(Vector3(1929.193f, 1957.962f, 42.28076f), Vector3(0, 0, 270)),
        owning_building_guid = 1,
        door_guid = 45
      )
      LocalObject(
        107,
        IFFLock.Constructor(Vector3(1962.94f, 2001.572f, 19.64876f), Vector3(0, 0, 90)),
        owning_building_guid = 1,
        door_guid = 80
      )
      LocalObject(
        108,
        IFFLock.Constructor(Vector3(1964.428f, 1972.94f, 27.14876f), Vector3(0, 0, 0)),
        owning_building_guid = 1,
        door_guid = 83
      )
      LocalObject(
        109,
        IFFLock.Constructor(Vector3(1967.572f, 1947.19f, 27.14876f), Vector3(0, 0, 180)),
        owning_building_guid = 1,
        door_guid = 82
      )
      LocalObject(
        110,
        IFFLock.Constructor(Vector3(1973.907f, 2045.163f, 42.25976f), Vector3(0, 0, 0)),
        owning_building_guid = 1,
        door_guid = 47
      )
      LocalObject(
        111,
        IFFLock.Constructor(Vector3(1977.06f, 1950.428f, 19.64876f), Vector3(0, 0, 270)),
        owning_building_guid = 1,
        door_guid = 84
      )
      LocalObject(
        112,
        IFFLock.Constructor(Vector3(1977.124f, 2012.312f, 37.32476f), Vector3(0, 0, 270)),
        owning_building_guid = 1,
        door_guid = 48
      )
      LocalObject(
        113,
        IFFLock.Constructor(Vector3(1993.06f, 1910.428f, 19.64876f), Vector3(0, 0, 270)),
        owning_building_guid = 1,
        door_guid = 87
      )
      LocalObject(
        115,
        IFFLock.Constructor(Vector3(2002.813f, 1913.572f, 19.64876f), Vector3(0, 0, 90)),
        owning_building_guid = 1,
        door_guid = 88
      )
      LocalObject(
        116,
        IFFLock.Constructor(Vector3(2035.953f, 2020.808f, 37.22376f), Vector3(0, 0, 0)),
        owning_building_guid = 1,
        door_guid = 54
      )
      LocalObject(149, Locker.Constructor(Vector3(1969.563f, 1950.141f, 26.07376f)), owning_building_guid = 1)
      LocalObject(150, Locker.Constructor(Vector3(1970.727f, 1950.141f, 26.07376f)), owning_building_guid = 1)
      LocalObject(151, Locker.Constructor(Vector3(1971.874f, 1950.141f, 26.07376f)), owning_building_guid = 1)
      LocalObject(152, Locker.Constructor(Vector3(1973.023f, 1950.141f, 26.07376f)), owning_building_guid = 1)
      LocalObject(153, Locker.Constructor(Vector3(1980.194f, 1970.165f, 18.31276f)), owning_building_guid = 1)
      LocalObject(154, Locker.Constructor(Vector3(1981.518f, 1970.165f, 18.31276f)), owning_building_guid = 1)
      LocalObject(155, Locker.Constructor(Vector3(1982.854f, 1970.165f, 18.31276f)), owning_building_guid = 1)
      LocalObject(156, Locker.Constructor(Vector3(1984.191f, 1970.165f, 18.31276f)), owning_building_guid = 1)
      LocalObject(157, Locker.Constructor(Vector3(1988.731f, 1970.165f, 18.31276f)), owning_building_guid = 1)
      LocalObject(158, Locker.Constructor(Vector3(1990.055f, 1970.165f, 18.31276f)), owning_building_guid = 1)
      LocalObject(159, Locker.Constructor(Vector3(1991.391f, 1970.165f, 18.31276f)), owning_building_guid = 1)
      LocalObject(160, Locker.Constructor(Vector3(1992.728f, 1970.165f, 18.31276f)), owning_building_guid = 1)
      LocalObject(
        25,
        Terminal.Constructor(Vector3(1981.879f, 2042.918f, 41.41676f), dropship_vehicle_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        24,
        VehicleSpawnPad.Constructor(Vector3(1990.328f, 2064.856f, 35.74076f), dropship_pad_doors, Vector3(0, 0, 90)),
        owning_building_guid = 1,
        terminal_guid = 25
      )
      LocalObject(
        209,
        Terminal.Constructor(Vector3(1912.378f, 1916.897f, 42.17276f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        210,
        Terminal.Constructor(Vector3(1922.075f, 1932.547f, 49.56776f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        211,
        Terminal.Constructor(Vector3(1924.331f, 1930.43f, 49.56776f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        212,
        Terminal.Constructor(Vector3(1924.332f, 1934.825f, 49.56776f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        213,
        Terminal.Constructor(Vector3(1926.592f, 1932.59f, 49.56776f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        214,
        Terminal.Constructor(Vector3(1972.654f, 1955.408f, 27.40276f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        215,
        Terminal.Constructor(Vector3(1972.654f, 1959.139f, 27.40276f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        216,
        Terminal.Constructor(Vector3(1972.654f, 1962.928f, 27.40276f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        290,
        Terminal.Constructor(Vector3(1920.509f, 1915.959f, 42.42976f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        291,
        Terminal.Constructor(Vector3(1958.971f, 1951.243f, 27.94676f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        292,
        Terminal.Constructor(Vector3(1958.967f, 1958.535f, 27.94676f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        293,
        Terminal.Constructor(Vector3(1958.97f, 1965.823f, 27.94676f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        294,
        Terminal.Constructor(Vector3(1977.103f, 2034.906f, 42.36076f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        295,
        Terminal.Constructor(Vector3(1986.058f, 1939.409f, 19.84076f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        296,
        Terminal.Constructor(Vector3(1993.409f, 1995.942f, 19.84076f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        297,
        Terminal.Constructor(Vector3(2002.058f, 1947.409f, 27.36976f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        298,
        Terminal.Constructor(Vector3(2002.058f, 1987.409f, 27.36976f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        318,
        Terminal.Constructor(Vector3(1939.698f, 2048.044f, 38.49976f), ground_vehicle_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        200,
        VehicleSpawnPad.Constructor(Vector3(1939.786f, 2034.411f, 34.34176f), mb_pad_creation, Vector3(0, 0, 180)),
        owning_building_guid = 1,
        terminal_guid = 318
      )
      LocalObject(271, ResourceSilo.Constructor(Vector3(2020.212f, 2105.642f, 42.82976f)), owning_building_guid = 1)
      LocalObject(
        276,
        SpawnTube.Constructor(Vector3(1958.233f, 1952.683f, 25.81276f), Vector3(0, 0, 0)),
        owning_building_guid = 1
      )
      LocalObject(
        277,
        SpawnTube.Constructor(Vector3(1958.233f, 1959.974f, 25.81276f), Vector3(0, 0, 0)),
        owning_building_guid = 1
      )
      LocalObject(
        278,
        SpawnTube.Constructor(Vector3(1958.233f, 1967.262f, 25.81276f), Vector3(0, 0, 0)),
        owning_building_guid = 1
      )
      LocalObject(
        201,
        ProximityTerminal.Constructor(Vector3(1922.863f, 1911.013f, 35.81276f), medical_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        202,
        ProximityTerminal.Constructor(Vector3(1986.444f, 1969.62f, 18.31276f), medical_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        230,
        ProximityTerminal.Constructor(Vector3(1903.153f, 2033.398f, 44.12276f), pad_landing_frame),
        owning_building_guid = 1
      )
      LocalObject(
        231,
        Terminal.Constructor(Vector3(1903.153f, 2033.398f, 44.12276f), air_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        233,
        ProximityTerminal.Constructor(Vector3(1919.514f, 1987.467f, 41.40676f), pad_landing_frame),
        owning_building_guid = 1
      )
      LocalObject(
        234,
        Terminal.Constructor(Vector3(1919.514f, 1987.467f, 41.40676f), air_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        236,
        ProximityTerminal.Constructor(Vector3(1971.804f, 1951.901f, 48.58876f), pad_landing_frame),
        owning_building_guid = 1
      )
      LocalObject(
        237,
        Terminal.Constructor(Vector3(1971.804f, 1951.901f, 48.58876f), air_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        239,
        ProximityTerminal.Constructor(Vector3(2007.071f, 1968.159f, 44.13576f), pad_landing_frame),
        owning_building_guid = 1
      )
      LocalObject(
        240,
        Terminal.Constructor(Vector3(2007.071f, 1968.159f, 44.13576f), air_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        263,
        ProximityTerminal.Constructor(Vector3(1860.642f, 1978.24f, 35.46276f), repair_silo),
        owning_building_guid = 1
      )
      LocalObject(
        264,
        Terminal.Constructor(Vector3(1860.642f, 1978.24f, 35.46276f), ground_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        267,
        ProximityTerminal.Constructor(Vector3(2030.57f, 1981.151f, 35.46276f), repair_silo),
        owning_building_guid = 1
      )
      LocalObject(
        268,
        Terminal.Constructor(Vector3(2030.57f, 1981.151f, 35.46276f), ground_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        190,
        FacilityTurret.Constructor(Vector3(1848.401f, 2013.113f, 44.32076f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(190, 5000)
      LocalObject(
        191,
        FacilityTurret.Constructor(Vector3(1849.554f, 1859.565f, 44.32076f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(191, 5001)
      LocalObject(
        192,
        FacilityTurret.Constructor(Vector3(1893.445f, 2059.667f, 44.32076f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(192, 5002)
      LocalObject(
        193,
        FacilityTurret.Constructor(Vector3(1952.428f, 1858.396f, 44.32076f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(193, 5003)
      LocalObject(
        194,
        FacilityTurret.Constructor(Vector3(1953.449f, 2118.154f, 44.32076f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(194, 5004)
      LocalObject(
        195,
        FacilityTurret.Constructor(Vector3(1994.537f, 1899.011f, 44.32076f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(195, 5005)
      LocalObject(
        196,
        FacilityTurret.Constructor(Vector3(2041.619f, 2116.985f, 44.32076f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(196, 5006)
      LocalObject(
        197,
        FacilityTurret.Constructor(Vector3(2042.773f, 1948.733f, 44.32076f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(197, 5007)
      LocalObject(242, Painbox.Constructor(Vector3(1950.428f, 2000.057f, 22.20706f), painbox), owning_building_guid = 1)
      LocalObject(
        243,
        Painbox.Constructor(Vector3(1967.857f, 1960.408f, 29.84026f), painbox_continuous),
        owning_building_guid = 1
      )
      LocalObject(
        244,
        Painbox.Constructor(Vector3(1964.203f, 1998.915f, 21.44496f), painbox_door_radius),
        owning_building_guid = 1
      )
      LocalObject(
        245,
        Painbox.Constructor(Vector3(1965.087f, 1945.386f, 28.24196f), painbox_door_radius_continuous),
        owning_building_guid = 1
      )
      LocalObject(
        246,
        Painbox.Constructor(Vector3(1965.895f, 1974.081f, 28.71276f), painbox_door_radius_continuous),
        owning_building_guid = 1
      )
      LocalObject(
        247,
        Painbox.Constructor(Vector3(1980.317f, 1967.888f, 29.14306f), painbox_door_radius_continuous),
        owning_building_guid = 1
      )
      LocalObject(27, Generator.Constructor(Vector3(1946.445f, 1999.975f, 17.01876f)), owning_building_guid = 1)
      LocalObject(
        26,
        Terminal.Constructor(Vector3(1954.637f, 2000.022f, 18.31276f), gen_control),
        owning_building_guid = 1
      )
    }

    Building10000()

    def Building10000(): Unit = { // Name: Map96_Gate_Three Type: hst GUID: 4, MapID: 10000
      LocalBuilding(
        "Map96_Gate_Three",
        4,
        10000,
        FoundationBuilder(WarpGate.Structure(Vector3(1387.16f, 1639.74f, 48.78f), hst))
      )
    }

    Building2()

    def Building2(): Unit = { // Name: North_Rim_Tower Type: tower_a GUID: 5, MapID: 2
      LocalBuilding(
        "North_Rim_Tower",
        5,
        2,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(1740f, 2280f, 71.42857f), Vector3(0f, 0f, 10f), tower_a)
        )
      )
      LocalObject(
        285,
        CaptureTerminal.Constructor(Vector3(1756.353f, 2282.779f, 81.42757f), secondary_capture),
        owning_building_guid = 5
      )
      LocalObject(28, Door.Constructor(Vector3(1750.428f, 2289.962f, 72.94958f)), owning_building_guid = 5)
      LocalObject(29, Door.Constructor(Vector3(1750.428f, 2289.962f, 92.94858f)), owning_building_guid = 5)
      LocalObject(30, Door.Constructor(Vector3(1753.207f, 2274.205f, 72.94958f)), owning_building_guid = 5)
      LocalObject(31, Door.Constructor(Vector3(1753.207f, 2274.205f, 92.94858f)), owning_building_guid = 5)
      LocalObject(299, Door.Constructor(Vector3(1750.073f, 2287.061f, 62.76457f)), owning_building_guid = 5)
      LocalObject(300, Door.Constructor(Vector3(1752.923f, 2270.9f, 62.76457f)), owning_building_guid = 5)
      LocalObject(
        95,
        IFFLock.Constructor(Vector3(1748.276f, 2290.406f, 72.88957f), Vector3(0, 0, 350)),
        owning_building_guid = 5,
        door_guid = 28
      )
      LocalObject(
        96,
        IFFLock.Constructor(Vector3(1748.276f, 2290.406f, 92.88957f), Vector3(0, 0, 350)),
        owning_building_guid = 5,
        door_guid = 29
      )
      LocalObject(
        97,
        IFFLock.Constructor(Vector3(1755.364f, 2273.762f, 72.88957f), Vector3(0, 0, 170)),
        owning_building_guid = 5,
        door_guid = 30
      )
      LocalObject(
        98,
        IFFLock.Constructor(Vector3(1755.364f, 2273.762f, 92.88957f), Vector3(0, 0, 170)),
        owning_building_guid = 5,
        door_guid = 31
      )
      LocalObject(133, Locker.Constructor(Vector3(1754.325f, 2289.466f, 61.42257f)), owning_building_guid = 5)
      LocalObject(134, Locker.Constructor(Vector3(1755.641f, 2289.698f, 61.42257f)), owning_building_guid = 5)
      LocalObject(135, Locker.Constructor(Vector3(1758.088f, 2267.92f, 61.42257f)), owning_building_guid = 5)
      LocalObject(136, Locker.Constructor(Vector3(1758.254f, 2290.159f, 61.42257f)), owning_building_guid = 5)
      LocalObject(137, Locker.Constructor(Vector3(1759.405f, 2268.153f, 61.42257f)), owning_building_guid = 5)
      LocalObject(138, Locker.Constructor(Vector3(1759.635f, 2290.403f, 61.42257f)), owning_building_guid = 5)
      LocalObject(139, Locker.Constructor(Vector3(1762.052f, 2268.619f, 61.42257f)), owning_building_guid = 5)
      LocalObject(140, Locker.Constructor(Vector3(1763.433f, 2268.863f, 61.42257f)), owning_building_guid = 5)
      LocalObject(
        203,
        Terminal.Constructor(Vector3(1760.905f, 2284.939f, 62.76057f), order_terminal),
        owning_building_guid = 5
      )
      LocalObject(
        204,
        Terminal.Constructor(Vector3(1761.839f, 2279.64f, 62.76057f), order_terminal),
        owning_building_guid = 5
      )
      LocalObject(
        205,
        Terminal.Constructor(Vector3(1762.833f, 2274.003f, 62.76057f), order_terminal),
        owning_building_guid = 5
      )
      LocalObject(
        272,
        SpawnTube.Constructor(Vector3(1749.822f, 2285.948f, 60.91058f), respawn_tube_tower, Vector3(0, 0, 350)),
        owning_building_guid = 5
      )
      LocalObject(
        273,
        SpawnTube.Constructor(Vector3(1752.672f, 2269.787f, 60.91058f), respawn_tube_tower, Vector3(0, 0, 350)),
        owning_building_guid = 5
      )
      LocalObject(
        186,
        FacilityTurret.Constructor(Vector3(1729.719f, 2265.286f, 90.37057f), manned_turret),
        owning_building_guid = 5
      )
      TurretToWeapon(186, 5008)
      LocalObject(
        188,
        FacilityTurret.Constructor(Vector3(1760.096f, 2296.447f, 90.37057f), manned_turret),
        owning_building_guid = 5
      )
      TurretToWeapon(188, 5009)
      LocalObject(
        248,
        Painbox.Constructor(Vector3(1746.232f, 2274.806f, 62.92767f), painbox_radius_continuous),
        owning_building_guid = 5
      )
      LocalObject(
        249,
        Painbox.Constructor(Vector3(1756.27f, 2284.987f, 61.52857f), painbox_radius_continuous),
        owning_building_guid = 5
      )
      LocalObject(
        250,
        Painbox.Constructor(Vector3(1758.415f, 2273.319f, 61.52857f), painbox_radius_continuous),
        owning_building_guid = 5
      )
    }

    Building4()

    def Building4(): Unit = { // Name: South_Rim_Tower Type: tower_a GUID: 6, MapID: 4
      LocalBuilding(
        "South_Rim_Tower",
        6,
        4,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(1756f, 1628f, 71.42857f), Vector3(0f, 0f, 360f), tower_a)
        )
      )
      LocalObject(
        286,
        CaptureTerminal.Constructor(Vector3(1772.587f, 1627.897f, 81.42757f), secondary_capture),
        owning_building_guid = 6
      )
      LocalObject(32, Door.Constructor(Vector3(1768f, 1620f, 72.94958f)), owning_building_guid = 6)
      LocalObject(33, Door.Constructor(Vector3(1768f, 1620f, 92.94858f)), owning_building_guid = 6)
      LocalObject(34, Door.Constructor(Vector3(1768f, 1636f, 72.94958f)), owning_building_guid = 6)
      LocalObject(35, Door.Constructor(Vector3(1768f, 1636f, 92.94858f)), owning_building_guid = 6)
      LocalObject(301, Door.Constructor(Vector3(1767.146f, 1616.794f, 62.76457f)), owning_building_guid = 6)
      LocalObject(302, Door.Constructor(Vector3(1767.146f, 1633.204f, 62.76457f)), owning_building_guid = 6)
      LocalObject(
        99,
        IFFLock.Constructor(Vector3(1765.957f, 1636.811f, 72.88957f), Vector3(0, 0, 0)),
        owning_building_guid = 6,
        door_guid = 34
      )
      LocalObject(
        100,
        IFFLock.Constructor(Vector3(1765.957f, 1636.811f, 92.88957f), Vector3(0, 0, 0)),
        owning_building_guid = 6,
        door_guid = 35
      )
      LocalObject(
        101,
        IFFLock.Constructor(Vector3(1770.047f, 1619.189f, 72.88957f), Vector3(0, 0, 180)),
        owning_building_guid = 6,
        door_guid = 32
      )
      LocalObject(
        102,
        IFFLock.Constructor(Vector3(1770.047f, 1619.189f, 92.88957f), Vector3(0, 0, 180)),
        owning_building_guid = 6,
        door_guid = 33
      )
      LocalObject(141, Locker.Constructor(Vector3(1771.716f, 1612.963f, 61.42257f)), owning_building_guid = 6)
      LocalObject(142, Locker.Constructor(Vector3(1771.751f, 1634.835f, 61.42257f)), owning_building_guid = 6)
      LocalObject(143, Locker.Constructor(Vector3(1773.053f, 1612.963f, 61.42257f)), owning_building_guid = 6)
      LocalObject(144, Locker.Constructor(Vector3(1773.088f, 1634.835f, 61.42257f)), owning_building_guid = 6)
      LocalObject(145, Locker.Constructor(Vector3(1775.741f, 1612.963f, 61.42257f)), owning_building_guid = 6)
      LocalObject(146, Locker.Constructor(Vector3(1775.741f, 1634.835f, 61.42257f)), owning_building_guid = 6)
      LocalObject(147, Locker.Constructor(Vector3(1777.143f, 1612.963f, 61.42257f)), owning_building_guid = 6)
      LocalObject(148, Locker.Constructor(Vector3(1777.143f, 1634.835f, 61.42257f)), owning_building_guid = 6)
      LocalObject(
        206,
        Terminal.Constructor(Vector3(1777.445f, 1618.129f, 62.76057f), order_terminal),
        owning_building_guid = 6
      )
      LocalObject(
        207,
        Terminal.Constructor(Vector3(1777.445f, 1623.853f, 62.76057f), order_terminal),
        owning_building_guid = 6
      )
      LocalObject(
        208,
        Terminal.Constructor(Vector3(1777.445f, 1629.234f, 62.76057f), order_terminal),
        owning_building_guid = 6
      )
      LocalObject(
        274,
        SpawnTube.Constructor(Vector3(1766.706f, 1615.742f, 60.91058f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 6
      )
      LocalObject(
        275,
        SpawnTube.Constructor(Vector3(1766.706f, 1632.152f, 60.91058f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 6
      )
      LocalObject(
        187,
        FacilityTurret.Constructor(Vector3(1743.32f, 1615.295f, 90.37057f), manned_turret),
        owning_building_guid = 6
      )
      TurretToWeapon(187, 5010)
      LocalObject(
        189,
        FacilityTurret.Constructor(Vector3(1778.647f, 1640.707f, 90.37057f), manned_turret),
        owning_building_guid = 6
      )
      TurretToWeapon(189, 5011)
      LocalObject(
        251,
        Painbox.Constructor(Vector3(1761.235f, 1621.803f, 62.92767f), painbox_radius_continuous),
        owning_building_guid = 6
      )
      LocalObject(
        252,
        Painbox.Constructor(Vector3(1772.889f, 1630.086f, 61.52857f), painbox_radius_continuous),
        owning_building_guid = 6
      )
      LocalObject(
        253,
        Painbox.Constructor(Vector3(1772.975f, 1618.223f, 61.52857f), painbox_radius_continuous),
        owning_building_guid = 6
      )
    }

    Building3()

    def Building3(): Unit = { // Name: East_Rim_Tower Type: tower_a GUID: 7, MapID: 3
      LocalBuilding(
        "East_Rim_Tower",
        7,
        3,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(2358f, 1940f, 71.42857f), Vector3(0f, 0f, 80f), tower_a)
        )
      )
      LocalObject(
        288,
        CaptureTerminal.Constructor(Vector3(2360.982f, 1956.317f, 81.42757f), secondary_capture),
        owning_building_guid = 7
      )
      LocalObject(61, Door.Constructor(Vector3(2352.205f, 1953.207f, 72.94958f)), owning_building_guid = 7)
      LocalObject(62, Door.Constructor(Vector3(2352.205f, 1953.207f, 92.94858f)), owning_building_guid = 7)
      LocalObject(63, Door.Constructor(Vector3(2367.962f, 1950.428f, 72.94958f)), owning_building_guid = 7)
      LocalObject(64, Door.Constructor(Vector3(2367.962f, 1950.428f, 92.94858f)), owning_building_guid = 7)
      LocalObject(308, Door.Constructor(Vector3(2354.811f, 1951.88f, 62.76457f)), owning_building_guid = 7)
      LocalObject(309, Door.Constructor(Vector3(2370.971f, 1949.031f, 62.76457f)), owning_building_guid = 7)
      LocalObject(
        123,
        IFFLock.Constructor(Vector3(2351.052f, 1951.336f, 72.88957f), Vector3(0, 0, 280)),
        owning_building_guid = 7,
        door_guid = 61
      )
      LocalObject(
        124,
        IFFLock.Constructor(Vector3(2351.052f, 1951.336f, 92.88957f), Vector3(0, 0, 280)),
        owning_building_guid = 7,
        door_guid = 62
      )
      LocalObject(
        125,
        IFFLock.Constructor(Vector3(2369.116f, 1952.304f, 72.88957f), Vector3(0, 0, 100)),
        owning_building_guid = 7,
        door_guid = 63
      )
      LocalObject(
        126,
        IFFLock.Constructor(Vector3(2369.116f, 1952.304f, 92.88957f), Vector3(0, 0, 100)),
        owning_building_guid = 7,
        door_guid = 64
      )
      LocalObject(169, Locker.Constructor(Vector3(2354.004f, 1956.699f, 61.42257f)), owning_building_guid = 7)
      LocalObject(170, Locker.Constructor(Vector3(2354.236f, 1958.015f, 61.42257f)), owning_building_guid = 7)
      LocalObject(171, Locker.Constructor(Vector3(2354.697f, 1960.628f, 61.42257f)), owning_building_guid = 7)
      LocalObject(172, Locker.Constructor(Vector3(2354.94f, 1962.009f, 61.42257f)), owning_building_guid = 7)
      LocalObject(173, Locker.Constructor(Vector3(2375.538f, 1952.866f, 61.42257f)), owning_building_guid = 7)
      LocalObject(174, Locker.Constructor(Vector3(2375.77f, 1954.183f, 61.42257f)), owning_building_guid = 7)
      LocalObject(175, Locker.Constructor(Vector3(2376.237f, 1956.83f, 61.42257f)), owning_building_guid = 7)
      LocalObject(176, Locker.Constructor(Vector3(2376.48f, 1958.211f, 61.42257f)), owning_building_guid = 7)
      LocalObject(
        220,
        Terminal.Constructor(Vector3(2360.509f, 1961.333f, 62.76057f), order_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        221,
        Terminal.Constructor(Vector3(2365.808f, 1960.399f, 62.76057f), order_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        222,
        Terminal.Constructor(Vector3(2371.445f, 1959.405f, 62.76057f), order_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        281,
        SpawnTube.Constructor(Vector3(2355.77f, 1951.264f, 60.91058f), respawn_tube_tower, Vector3(0, 0, 280)),
        owning_building_guid = 7
      )
      LocalObject(
        282,
        SpawnTube.Constructor(Vector3(2371.931f, 1948.415f, 60.91058f), respawn_tube_tower, Vector3(0, 0, 280)),
        owning_building_guid = 7
      )
      LocalObject(
        198,
        FacilityTurret.Constructor(Vector3(2349.419f, 1964.51f, 90.37057f), manned_turret),
        owning_building_guid = 7
      )
      TurretToWeapon(198, 5012)
      LocalObject(
        199,
        FacilityTurret.Constructor(Vector3(2368.31f, 1925.306f, 90.37057f), manned_turret),
        owning_building_guid = 7
      )
      TurretToWeapon(199, 5013)
      LocalObject(
        257,
        Painbox.Constructor(Vector3(2358.878f, 1956.995f, 61.52857f), painbox_radius_continuous),
        owning_building_guid = 7
      )
      LocalObject(
        258,
        Painbox.Constructor(Vector3(2365.012f, 1944.079f, 62.92767f), painbox_radius_continuous),
        owning_building_guid = 7
      )
      LocalObject(
        259,
        Painbox.Constructor(Vector3(2370.577f, 1955.019f, 61.52857f), painbox_radius_continuous),
        owning_building_guid = 7
      )
    }

    Building6()

    def Building6(): Unit = { // Name: South_Gate_Tower Type: tower_b GUID: 8, MapID: 6
      LocalBuilding(
        "South_Gate_Tower",
        8,
        6,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(2242f, 1264f, 35.71276f), Vector3(0f, 0f, 360f), tower_b)
        )
      )
      LocalObject(
        287,
        CaptureTerminal.Constructor(Vector3(2258.587f, 1263.897f, 55.71176f), secondary_capture),
        owning_building_guid = 8
      )
      LocalObject(55, Door.Constructor(Vector3(2254f, 1256f, 37.23276f)), owning_building_guid = 8)
      LocalObject(56, Door.Constructor(Vector3(2254f, 1256f, 47.23276f)), owning_building_guid = 8)
      LocalObject(57, Door.Constructor(Vector3(2254f, 1256f, 67.23276f)), owning_building_guid = 8)
      LocalObject(58, Door.Constructor(Vector3(2254f, 1272f, 37.23276f)), owning_building_guid = 8)
      LocalObject(59, Door.Constructor(Vector3(2254f, 1272f, 47.23276f)), owning_building_guid = 8)
      LocalObject(60, Door.Constructor(Vector3(2254f, 1272f, 67.23276f)), owning_building_guid = 8)
      LocalObject(306, Door.Constructor(Vector3(2253.147f, 1252.794f, 27.04876f)), owning_building_guid = 8)
      LocalObject(307, Door.Constructor(Vector3(2253.147f, 1269.204f, 27.04876f)), owning_building_guid = 8)
      LocalObject(
        117,
        IFFLock.Constructor(Vector3(2251.957f, 1272.811f, 37.17376f), Vector3(0, 0, 0)),
        owning_building_guid = 8,
        door_guid = 58
      )
      LocalObject(
        118,
        IFFLock.Constructor(Vector3(2251.957f, 1272.811f, 47.17376f), Vector3(0, 0, 0)),
        owning_building_guid = 8,
        door_guid = 59
      )
      LocalObject(
        119,
        IFFLock.Constructor(Vector3(2251.957f, 1272.811f, 67.17376f), Vector3(0, 0, 0)),
        owning_building_guid = 8,
        door_guid = 60
      )
      LocalObject(
        120,
        IFFLock.Constructor(Vector3(2256.047f, 1255.189f, 37.17376f), Vector3(0, 0, 180)),
        owning_building_guid = 8,
        door_guid = 55
      )
      LocalObject(
        121,
        IFFLock.Constructor(Vector3(2256.047f, 1255.189f, 47.17376f), Vector3(0, 0, 180)),
        owning_building_guid = 8,
        door_guid = 56
      )
      LocalObject(
        122,
        IFFLock.Constructor(Vector3(2256.047f, 1255.189f, 67.17376f), Vector3(0, 0, 180)),
        owning_building_guid = 8,
        door_guid = 57
      )
      LocalObject(161, Locker.Constructor(Vector3(2257.716f, 1248.963f, 25.70676f)), owning_building_guid = 8)
      LocalObject(162, Locker.Constructor(Vector3(2257.751f, 1270.835f, 25.70676f)), owning_building_guid = 8)
      LocalObject(163, Locker.Constructor(Vector3(2259.053f, 1248.963f, 25.70676f)), owning_building_guid = 8)
      LocalObject(164, Locker.Constructor(Vector3(2259.088f, 1270.835f, 25.70676f)), owning_building_guid = 8)
      LocalObject(165, Locker.Constructor(Vector3(2261.741f, 1248.963f, 25.70676f)), owning_building_guid = 8)
      LocalObject(166, Locker.Constructor(Vector3(2261.741f, 1270.835f, 25.70676f)), owning_building_guid = 8)
      LocalObject(167, Locker.Constructor(Vector3(2263.143f, 1248.963f, 25.70676f)), owning_building_guid = 8)
      LocalObject(168, Locker.Constructor(Vector3(2263.143f, 1270.835f, 25.70676f)), owning_building_guid = 8)
      LocalObject(
        217,
        Terminal.Constructor(Vector3(2263.446f, 1254.129f, 27.04476f), order_terminal),
        owning_building_guid = 8
      )
      LocalObject(
        218,
        Terminal.Constructor(Vector3(2263.446f, 1259.853f, 27.04476f), order_terminal),
        owning_building_guid = 8
      )
      LocalObject(
        219,
        Terminal.Constructor(Vector3(2263.446f, 1265.234f, 27.04476f), order_terminal),
        owning_building_guid = 8
      )
      LocalObject(
        279,
        SpawnTube.Constructor(Vector3(2252.706f, 1251.742f, 25.19476f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 8
      )
      LocalObject(
        280,
        SpawnTube.Constructor(Vector3(2252.706f, 1268.152f, 25.19476f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 8
      )
      LocalObject(
        254,
        Painbox.Constructor(Vector3(2247.493f, 1256.849f, 27.00216f), painbox_radius_continuous),
        owning_building_guid = 8
      )
      LocalObject(
        255,
        Painbox.Constructor(Vector3(2259.127f, 1254.078f, 25.81276f), painbox_radius_continuous),
        owning_building_guid = 8
      )
      LocalObject(
        256,
        Painbox.Constructor(Vector3(2259.259f, 1266.107f, 25.81276f), painbox_radius_continuous),
        owning_building_guid = 8
      )
    }

    Building5()

    def Building5(): Unit = { // Name: North_Gate_Tower Type: tower_b GUID: 9, MapID: 5
      LocalBuilding(
        "North_Gate_Tower",
        9,
        5,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(2438f, 2486f, 35.71276f), Vector3(0f, 0f, 360f), tower_b)
        )
      )
      LocalObject(
        289,
        CaptureTerminal.Constructor(Vector3(2454.587f, 2485.897f, 55.71176f), secondary_capture),
        owning_building_guid = 9
      )
      LocalObject(65, Door.Constructor(Vector3(2450f, 2478f, 37.23276f)), owning_building_guid = 9)
      LocalObject(66, Door.Constructor(Vector3(2450f, 2478f, 47.23276f)), owning_building_guid = 9)
      LocalObject(67, Door.Constructor(Vector3(2450f, 2478f, 67.23276f)), owning_building_guid = 9)
      LocalObject(68, Door.Constructor(Vector3(2450f, 2494f, 37.23276f)), owning_building_guid = 9)
      LocalObject(69, Door.Constructor(Vector3(2450f, 2494f, 47.23276f)), owning_building_guid = 9)
      LocalObject(70, Door.Constructor(Vector3(2450f, 2494f, 67.23276f)), owning_building_guid = 9)
      LocalObject(310, Door.Constructor(Vector3(2449.147f, 2474.794f, 27.04876f)), owning_building_guid = 9)
      LocalObject(311, Door.Constructor(Vector3(2449.147f, 2491.204f, 27.04876f)), owning_building_guid = 9)
      LocalObject(
        127,
        IFFLock.Constructor(Vector3(2447.957f, 2494.811f, 37.17376f), Vector3(0, 0, 0)),
        owning_building_guid = 9,
        door_guid = 68
      )
      LocalObject(
        128,
        IFFLock.Constructor(Vector3(2447.957f, 2494.811f, 47.17376f), Vector3(0, 0, 0)),
        owning_building_guid = 9,
        door_guid = 69
      )
      LocalObject(
        129,
        IFFLock.Constructor(Vector3(2447.957f, 2494.811f, 67.17376f), Vector3(0, 0, 0)),
        owning_building_guid = 9,
        door_guid = 70
      )
      LocalObject(
        130,
        IFFLock.Constructor(Vector3(2452.047f, 2477.189f, 37.17376f), Vector3(0, 0, 180)),
        owning_building_guid = 9,
        door_guid = 65
      )
      LocalObject(
        131,
        IFFLock.Constructor(Vector3(2452.047f, 2477.189f, 47.17376f), Vector3(0, 0, 180)),
        owning_building_guid = 9,
        door_guid = 66
      )
      LocalObject(
        132,
        IFFLock.Constructor(Vector3(2452.047f, 2477.189f, 67.17376f), Vector3(0, 0, 180)),
        owning_building_guid = 9,
        door_guid = 67
      )
      LocalObject(177, Locker.Constructor(Vector3(2453.716f, 2470.963f, 25.70676f)), owning_building_guid = 9)
      LocalObject(178, Locker.Constructor(Vector3(2453.751f, 2492.835f, 25.70676f)), owning_building_guid = 9)
      LocalObject(179, Locker.Constructor(Vector3(2455.053f, 2470.963f, 25.70676f)), owning_building_guid = 9)
      LocalObject(180, Locker.Constructor(Vector3(2455.088f, 2492.835f, 25.70676f)), owning_building_guid = 9)
      LocalObject(181, Locker.Constructor(Vector3(2457.741f, 2470.963f, 25.70676f)), owning_building_guid = 9)
      LocalObject(182, Locker.Constructor(Vector3(2457.741f, 2492.835f, 25.70676f)), owning_building_guid = 9)
      LocalObject(183, Locker.Constructor(Vector3(2459.143f, 2470.963f, 25.70676f)), owning_building_guid = 9)
      LocalObject(184, Locker.Constructor(Vector3(2459.143f, 2492.835f, 25.70676f)), owning_building_guid = 9)
      LocalObject(
        223,
        Terminal.Constructor(Vector3(2459.446f, 2476.129f, 27.04476f), order_terminal),
        owning_building_guid = 9
      )
      LocalObject(
        224,
        Terminal.Constructor(Vector3(2459.446f, 2481.853f, 27.04476f), order_terminal),
        owning_building_guid = 9
      )
      LocalObject(
        225,
        Terminal.Constructor(Vector3(2459.446f, 2487.234f, 27.04476f), order_terminal),
        owning_building_guid = 9
      )
      LocalObject(
        283,
        SpawnTube.Constructor(Vector3(2448.706f, 2473.742f, 25.19476f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 9
      )
      LocalObject(
        284,
        SpawnTube.Constructor(Vector3(2448.706f, 2490.152f, 25.19476f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 9
      )
      LocalObject(
        260,
        Painbox.Constructor(Vector3(2443.493f, 2478.849f, 27.00216f), painbox_radius_continuous),
        owning_building_guid = 9
      )
      LocalObject(
        261,
        Painbox.Constructor(Vector3(2455.127f, 2476.078f, 25.81276f), painbox_radius_continuous),
        owning_building_guid = 9
      )
      LocalObject(
        262,
        Painbox.Constructor(Vector3(2455.259f, 2488.107f, 25.81276f), painbox_radius_continuous),
        owning_building_guid = 9
      )
    }

    Building10001()

    def Building10001(): Unit = { // Name: Map96_Gate_Two Type: warpgate_small GUID: 10, MapID: 10001
      LocalBuilding(
        "Map96_Gate_Two",
        10,
        10001,
        FoundationBuilder(WarpGate.Structure(Vector3(2407.71f, 2727.84f, 35.71f)))
      )
    }

    Building10002()

    def Building10002(): Unit = { // Name: Map96_Gate_One Type: warpgate_small GUID: 11, MapID: 10002
      LocalBuilding(
        "Map96_Gate_One",
        11,
        10002,
        FoundationBuilder(WarpGate.Structure(Vector3(2784.82f, 1348.42f, 33.91f)))
      )
    }

    def Lattice(): Unit = {
      LatticeLink("Nexus_Base", "Map96_Gate_One")
      LatticeLink("Nexus_Base", "Map96_Gate_Two")
      LatticeLink("Nexus_Base", "Map96_Gate_Three")
    }

    Lattice()

  }
}
