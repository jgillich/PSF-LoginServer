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

object Map07 { // Esamir
  val ZoneMap = new ZoneMap("map07") {
    Checksum = 1564014762L

    Building8()

    def Building8(): Unit = { // Name: Freyr Type: amp_station GUID: 1, MapID: 8
      LocalBuilding(
        "Freyr",
        1,
        8,
        FoundationBuilder(
          Building.Structure(
            StructureType.Facility,
            Vector3(2908f, 3746f, 55.58336f),
            Vector3(0f, 0f, 72f),
            amp_station
          )
        )
      )
      LocalObject(
        213,
        CaptureTerminal.Constructor(Vector3(2906.966f, 3742.828f, 67.09136f), capture_terminal),
        owning_building_guid = 1
      )
      LocalObject(164, Door.Constructor(Vector3(2901.594f, 3748.306f, 68.48537f)), owning_building_guid = 1)
      LocalObject(165, Door.Constructor(Vector3(2914.537f, 3744.098f, 68.48537f)), owning_building_guid = 1)
      LocalObject(379, Door.Constructor(Vector3(2808.43f, 3698.441f, 57.30436f)), owning_building_guid = 1)
      LocalObject(380, Door.Constructor(Vector3(2813.063f, 3752.135f, 57.33436f)), owning_building_guid = 1)
      LocalObject(381, Door.Constructor(Vector3(2818.685f, 3769.437f, 65.29836f)), owning_building_guid = 1)
      LocalObject(382, Door.Constructor(Vector3(2826.22f, 3701.096f, 65.29736f)), owning_building_guid = 1)
      LocalObject(383, Door.Constructor(Vector3(2843.523f, 3695.475f, 57.33436f)), owning_building_guid = 1)
      LocalObject(384, Door.Constructor(Vector3(2874.237f, 3756.97f, 62.30436f)), owning_building_guid = 1)
      LocalObject(385, Door.Constructor(Vector3(2877.59f, 3751.349f, 67.31036f)), owning_building_guid = 1)
      LocalObject(386, Door.Constructor(Vector3(2880.389f, 3759.967f, 67.31036f)), owning_building_guid = 1)
      LocalObject(387, Door.Constructor(Vector3(2922.475f, 3669.822f, 65.29736f)), owning_building_guid = 1)
      LocalObject(388, Door.Constructor(Vector3(2935.741f, 3732.432f, 67.31036f)), owning_building_guid = 1)
      LocalObject(389, Door.Constructor(Vector3(2938.54f, 3741.05f, 67.31036f)), owning_building_guid = 1)
      LocalObject(390, Door.Constructor(Vector3(2939.778f, 3664.2f, 57.33436f)), owning_building_guid = 1)
      LocalObject(391, Door.Constructor(Vector3(2941.762f, 3735.03f, 62.30436f)), owning_building_guid = 1)
      LocalObject(392, Door.Constructor(Vector3(2968.927f, 3789.505f, 57.33436f)), owning_building_guid = 1)
      LocalObject(393, Door.Constructor(Vector3(2986.228f, 3783.883f, 65.29836f)), owning_building_guid = 1)
      LocalObject(394, Door.Constructor(Vector3(2993.505f, 3736.622f, 65.29836f)), owning_building_guid = 1)
      LocalObject(395, Door.Constructor(Vector3(2999.126f, 3753.923f, 57.33436f)), owning_building_guid = 1)
      LocalObject(698, Door.Constructor(Vector3(2859.121f, 3686.177f, 49.80436f)), owning_building_guid = 1)
      LocalObject(699, Door.Constructor(Vector3(2876.522f, 3726.787f, 49.80436f)), owning_building_guid = 1)
      LocalObject(700, Door.Constructor(Vector3(2878.898f, 3747.044f, 57.30436f)), owning_building_guid = 1)
      LocalObject(701, Door.Constructor(Vector3(2881.467f, 3742.004f, 57.30436f)), owning_building_guid = 1)
      LocalObject(702, Door.Constructor(Vector3(2882.797f, 3754.412f, 67.30436f)), owning_building_guid = 1)
      LocalObject(703, Door.Constructor(Vector3(2885.175f, 3753.417f, 62.30436f)), owning_building_guid = 1)
      LocalObject(704, Door.Constructor(Vector3(2886.507f, 3744.572f, 49.80436f)), owning_building_guid = 1)
      LocalObject(705, Door.Constructor(Vector3(2891.547f, 3747.14f, 42.30436f)), owning_building_guid = 1)
      LocalObject(706, Door.Constructor(Vector3(2894.403f, 3704.154f, 42.30436f)), owning_building_guid = 1)
      LocalObject(707, Door.Constructor(Vector3(2896.683f, 3737.06f, 49.80436f)), owning_building_guid = 1)
      LocalObject(708, Door.Constructor(Vector3(2896.971f, 3699.113f, 42.30436f)), owning_building_guid = 1)
      LocalObject(709, Door.Constructor(Vector3(2904.196f, 3747.236f, 49.80436f)), owning_building_guid = 1)
      LocalObject(710, Door.Constructor(Vector3(2909.524f, 3711.858f, 42.30436f)), owning_building_guid = 1)
      LocalObject(711, Door.Constructor(Vector3(2910.376f, 3766.257f, 57.30436f)), owning_building_guid = 1)
      LocalObject(712, Door.Constructor(Vector3(2917.985f, 3763.785f, 57.30436f)), owning_building_guid = 1)
      LocalObject(713, Door.Constructor(Vector3(2919.413f, 3742.292f, 42.30436f)), owning_building_guid = 1)
      LocalObject(714, Door.Constructor(Vector3(2919.509f, 3729.643f, 42.30436f)), owning_building_guid = 1)
      LocalObject(715, Door.Constructor(Vector3(2919.509f, 3729.643f, 49.80436f)), owning_building_guid = 1)
      LocalObject(716, Door.Constructor(Vector3(2927.117f, 3727.171f, 57.30436f)), owning_building_guid = 1)
      LocalObject(717, Door.Constructor(Vector3(2930.825f, 3738.583f, 62.30436f)), owning_building_guid = 1)
      LocalObject(718, Door.Constructor(Vector3(2932.157f, 3729.739f, 57.30436f)), owning_building_guid = 1)
      LocalObject(719, Door.Constructor(Vector3(2933.334f, 3737.991f, 67.30436f)), owning_building_guid = 1)
      LocalObject(893, Door.Constructor(Vector3(2916.99f, 3773.754f, 58.06336f)), owning_building_guid = 1)
      LocalObject(2663, Door.Constructor(Vector3(2897.924f, 3728.952f, 50.13736f)), owning_building_guid = 1)
      LocalObject(2664, Door.Constructor(Vector3(2904.856f, 3726.7f, 50.13736f)), owning_building_guid = 1)
      LocalObject(2665, Door.Constructor(Vector3(2911.792f, 3724.446f, 50.13736f)), owning_building_guid = 1)
      LocalObject(
        937,
        IFFLock.Constructor(Vector3(2914.946f, 3777.3f, 57.26336f), Vector3(0, 0, 18)),
        owning_building_guid = 1,
        door_guid = 893
      )
      LocalObject(
        1017,
        IFFLock.Constructor(Vector3(2807.013f, 3696.752f, 57.24336f), Vector3(0, 0, 288)),
        owning_building_guid = 1,
        door_guid = 379
      )
      LocalObject(
        1018,
        IFFLock.Constructor(Vector3(2872.825f, 3755.28f, 62.24536f), Vector3(0, 0, 288)),
        owning_building_guid = 1,
        door_guid = 384
      )
      LocalObject(
        1019,
        IFFLock.Constructor(Vector3(2878.677f, 3761.355f, 67.24436f), Vector3(0, 0, 18)),
        owning_building_guid = 1,
        door_guid = 386
      )
      LocalObject(
        1020,
        IFFLock.Constructor(Vector3(2879.267f, 3749.927f, 67.24436f), Vector3(0, 0, 198)),
        owning_building_guid = 1,
        door_guid = 385
      )
      LocalObject(
        1021,
        IFFLock.Constructor(Vector3(2895.303f, 3735.855f, 49.61936f), Vector3(0, 0, 288)),
        owning_building_guid = 1,
        door_guid = 707
      )
      LocalObject(
        1022,
        IFFLock.Constructor(Vector3(2895.727f, 3700.369f, 42.11936f), Vector3(0, 0, 18)),
        owning_building_guid = 1,
        door_guid = 708
      )
      LocalObject(
        1023,
        IFFLock.Constructor(Vector3(2920.617f, 3740.912f, 42.11936f), Vector3(0, 0, 198)),
        owning_building_guid = 1,
        door_guid = 713
      )
      LocalObject(
        1024,
        IFFLock.Constructor(Vector3(2920.765f, 3730.888f, 49.61936f), Vector3(0, 0, 108)),
        owning_building_guid = 1,
        door_guid = 715
      )
      LocalObject(
        1025,
        IFFLock.Constructor(Vector3(2936.825f, 3742.461f, 67.24436f), Vector3(0, 0, 18)),
        owning_building_guid = 1,
        door_guid = 389
      )
      LocalObject(
        1026,
        IFFLock.Constructor(Vector3(2937.412f, 3731.035f, 67.24436f), Vector3(0, 0, 198)),
        owning_building_guid = 1,
        door_guid = 388
      )
      LocalObject(
        1027,
        IFFLock.Constructor(Vector3(2943.154f, 3736.725f, 62.24536f), Vector3(0, 0, 108)),
        owning_building_guid = 1,
        door_guid = 391
      )
      LocalObject(1307, Locker.Constructor(Vector3(2902.815f, 3749.992f, 40.78336f)), owning_building_guid = 1)
      LocalObject(1308, Locker.Constructor(Vector3(2903.224f, 3751.251f, 40.78336f)), owning_building_guid = 1)
      LocalObject(1309, Locker.Constructor(Vector3(2903.637f, 3752.521f, 40.78336f)), owning_building_guid = 1)
      LocalObject(1310, Locker.Constructor(Vector3(2904.05f, 3753.793f, 40.78336f)), owning_building_guid = 1)
      LocalObject(1311, Locker.Constructor(Vector3(2905.453f, 3758.111f, 40.78336f)), owning_building_guid = 1)
      LocalObject(1312, Locker.Constructor(Vector3(2905.862f, 3759.37f, 40.78336f)), owning_building_guid = 1)
      LocalObject(1313, Locker.Constructor(Vector3(2906.275f, 3760.641f, 40.78336f)), owning_building_guid = 1)
      LocalObject(1314, Locker.Constructor(Vector3(2906.688f, 3761.912f, 40.78336f)), owning_building_guid = 1)
      LocalObject(1315, Locker.Constructor(Vector3(2918.573f, 3733.693f, 48.54436f)), owning_building_guid = 1)
      LocalObject(1316, Locker.Constructor(Vector3(2918.933f, 3734.8f, 48.54436f)), owning_building_guid = 1)
      LocalObject(1317, Locker.Constructor(Vector3(2919.288f, 3735.891f, 48.54436f)), owning_building_guid = 1)
      LocalObject(1318, Locker.Constructor(Vector3(2919.643f, 3736.984f, 48.54436f)), owning_building_guid = 1)
      LocalObject(
        1806,
        Terminal.Constructor(Vector3(2886.623f, 3752.944f, 57.11236f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        1807,
        Terminal.Constructor(Vector3(2901.061f, 3724.631f, 57.11236f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        1808,
        Terminal.Constructor(Vector3(2907.367f, 3740.584f, 49.87336f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        1809,
        Terminal.Constructor(Vector3(2910.971f, 3739.414f, 49.87336f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        1810,
        Terminal.Constructor(Vector3(2914.52f, 3738.26f, 49.87336f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        1811,
        Terminal.Constructor(Vector3(2929.376f, 3739.052f, 57.11236f), order_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        2576,
        Terminal.Constructor(Vector3(2855.705f, 3712.583f, 49.84036f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        2577,
        Terminal.Constructor(Vector3(2885.947f, 3727.991f, 42.34036f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        2578,
        Terminal.Constructor(Vector3(2900.386f, 3728.465f, 50.41736f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        2579,
        Terminal.Constructor(Vector3(2907.316f, 3726.21f, 50.41736f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        2580,
        Terminal.Constructor(Vector3(2910.579f, 3739.375f, 62.31136f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        2581,
        Terminal.Constructor(Vector3(2914.252f, 3723.96f, 50.41736f), spawn_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        2808,
        Terminal.Constructor(Vector3(2814.754f, 3725.906f, 57.68536f), vehicle_terminal_combined),
        owning_building_guid = 1
      )
      LocalObject(
        1728,
        VehicleSpawnPad.Constructor(Vector3(2827.752f, 3721.777f, 53.52836f), mb_pad_creation, Vector3(0, 0, 108)),
        owning_building_guid = 1,
        terminal_guid = 2808
      )
      LocalObject(2426, ResourceSilo.Constructor(Vector3(3005.579f, 3769.649f, 62.81836f)), owning_building_guid = 1)
      LocalObject(
        2461,
        SpawnTube.Constructor(Vector3(2898.789f, 3728.208f, 48.28336f), Vector3(0, 0, 288)),
        owning_building_guid = 1
      )
      LocalObject(
        2462,
        SpawnTube.Constructor(Vector3(2905.721f, 3725.956f, 48.28336f), Vector3(0, 0, 288)),
        owning_building_guid = 1
      )
      LocalObject(
        2463,
        SpawnTube.Constructor(Vector3(2912.655f, 3723.703f, 48.28336f), Vector3(0, 0, 288)),
        owning_building_guid = 1
      )
      LocalObject(
        1749,
        ProximityTerminal.Constructor(Vector3(2901.192f, 3725.029f, 60.78336f), medical_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        1750,
        ProximityTerminal.Constructor(Vector3(2905.264f, 3755.767f, 40.78336f), medical_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        2018,
        ProximityTerminal.Constructor(Vector3(2861.617f, 3789.037f, 66.24936f), pad_landing_frame),
        owning_building_guid = 1
      )
      LocalObject(
        2019,
        Terminal.Constructor(Vector3(2861.617f, 3789.037f, 66.24936f), air_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        2021,
        ProximityTerminal.Constructor(Vector3(2871.506f, 3697.664f, 64.08836f), pad_landing_frame),
        owning_building_guid = 1
      )
      LocalObject(
        2022,
        Terminal.Constructor(Vector3(2871.506f, 3697.664f, 64.08836f), air_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        2024,
        ProximityTerminal.Constructor(Vector3(2942.12f, 3786.83f, 64.08836f), pad_landing_frame),
        owning_building_guid = 1
      )
      LocalObject(
        2025,
        Terminal.Constructor(Vector3(2942.12f, 3786.83f, 64.08836f), air_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        2027,
        ProximityTerminal.Constructor(Vector3(2980.462f, 3731.181f, 64.11136f), pad_landing_frame),
        owning_building_guid = 1
      )
      LocalObject(
        2028,
        Terminal.Constructor(Vector3(2980.462f, 3731.181f, 64.11136f), air_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        2350,
        ProximityTerminal.Constructor(Vector3(2886.146f, 3679.397f, 54.98336f), repair_silo),
        owning_building_guid = 1
      )
      LocalObject(
        2351,
        Terminal.Constructor(Vector3(2886.146f, 3679.397f, 54.98336f), ground_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        2354,
        ProximityTerminal.Constructor(Vector3(2926.885f, 3805.396f, 54.98336f), repair_silo),
        owning_building_guid = 1
      )
      LocalObject(
        2355,
        Terminal.Constructor(Vector3(2926.885f, 3805.396f, 54.98336f), ground_rearm_terminal),
        owning_building_guid = 1
      )
      LocalObject(
        1637,
        FacilityTurret.Constructor(Vector3(2783.378f, 3701.719f, 64.29137f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(1637, 5000)
      LocalObject(
        1638,
        FacilityTurret.Constructor(Vector3(2830.812f, 3847.673f, 64.29137f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(1638, 5001)
      LocalObject(
        1639,
        FacilityTurret.Constructor(Vector3(2891.777f, 3830.196f, 64.29137f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(1639, 5002)
      LocalObject(
        1640,
        FacilityTurret.Constructor(Vector3(2975.193f, 3639.425f, 64.29137f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(1640, 5003)
      LocalObject(
        1641,
        FacilityTurret.Constructor(Vector3(2995.726f, 3695.407f, 64.29137f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(1641, 5004)
      LocalObject(
        1642,
        FacilityTurret.Constructor(Vector3(3022.615f, 3785.343f, 64.29137f), manned_turret),
        owning_building_guid = 1
      )
      TurretToWeapon(1642, 5005)
      LocalObject(
        2169,
        Painbox.Constructor(Vector3(2896.051f, 3686.953f, 45.65436f), painbox),
        owning_building_guid = 1
      )
      LocalObject(
        2182,
        Painbox.Constructor(Vector3(2905.514f, 3733.774f, 53.23176f), painbox_continuous),
        owning_building_guid = 1
      )
      LocalObject(
        2195,
        Painbox.Constructor(Vector3(2898.369f, 3700.967f, 42.24236f), painbox_door_radius),
        owning_building_guid = 1
      )
      LocalObject(
        2216,
        Painbox.Constructor(Vector3(2895.485f, 3737.526f, 49.54786f), painbox_door_radius_continuous),
        owning_building_guid = 1
      )
      LocalObject(
        2217,
        Painbox.Constructor(Vector3(2904.69f, 3748.618f, 51.46196f), painbox_door_radius_continuous),
        owning_building_guid = 1
      )
      LocalObject(
        2218,
        Painbox.Constructor(Vector3(2920.52f, 3729.315f, 49.48336f), painbox_door_radius_continuous),
        owning_building_guid = 1
      )
      LocalObject(285, Generator.Constructor(Vector3(2892.188f, 3684.312f, 39.48936f)), owning_building_guid = 1)
      LocalObject(
        272,
        Terminal.Constructor(Vector3(2894.675f, 3692.117f, 40.78336f), gen_control),
        owning_building_guid = 1
      )
    }

    Building11()

    def Building11(): Unit = { // Name: Kvasir Type: amp_station GUID: 4, MapID: 11
      LocalBuilding(
        "Kvasir",
        4,
        11,
        FoundationBuilder(
          Building.Structure(
            StructureType.Facility,
            Vector3(4016f, 1636f, 68.37366f),
            Vector3(0f, 0f, 278f),
            amp_station
          )
        )
      )
      LocalObject(
        218,
        CaptureTerminal.Constructor(Vector3(4015.539f, 1639.304f, 79.88167f), capture_terminal),
        owning_building_guid = 4
      )
      LocalObject(166, Door.Constructor(Vector3(4009.291f, 1634.844f, 81.27567f)), owning_building_guid = 4)
      LocalObject(167, Door.Constructor(Vector3(4022.769f, 1636.735f, 81.27567f)), owning_building_guid = 4)
      LocalObject(479, Door.Constructor(Vector3(3935.038f, 1606.946f, 78.08867f)), owning_building_guid = 4)
      LocalObject(480, Door.Constructor(Vector3(3937.569f, 1588.932f, 70.12466f)), owning_building_guid = 4)
      LocalObject(482, Door.Constructor(Vector3(3951.58f, 1695.591f, 70.12466f)), owning_building_guid = 4)
      LocalObject(484, Door.Constructor(Vector3(3962.296f, 1567.658f, 78.08867f)), owning_building_guid = 4)
      LocalObject(486, Door.Constructor(Vector3(3969.595f, 1698.123f, 78.08766f)), owning_building_guid = 4)
      LocalObject(489, Door.Constructor(Vector3(3980.311f, 1570.19f, 70.12466f)), owning_building_guid = 4)
      LocalObject(490, Door.Constructor(Vector3(3980.845f, 1631.059f, 75.09467f)), owning_building_guid = 4)
      LocalObject(491, Door.Constructor(Vector3(3985.119f, 1636.033f, 80.10066f)), owning_building_guid = 4)
      LocalObject(492, Door.Constructor(Vector3(3986.381f, 1627.061f, 80.10066f)), owning_building_guid = 4)
      LocalObject(497, Door.Constructor(Vector3(4045.677f, 1644.523f, 80.10066f)), owning_building_guid = 4)
      LocalObject(498, Door.Constructor(Vector3(4046.94f, 1635.551f, 80.10066f)), owning_building_guid = 4)
      LocalObject(499, Door.Constructor(Vector3(4051.156f, 1640.941f, 75.09467f)), owning_building_guid = 4)
      LocalObject(500, Door.Constructor(Vector3(4051.802f, 1709.677f, 70.12466f)), owning_building_guid = 4)
      LocalObject(501, Door.Constructor(Vector3(4069.819f, 1712.209f, 78.08766f)), owning_building_guid = 4)
      LocalObject(502, Door.Constructor(Vector3(4084.644f, 1722.394f, 70.09467f)), owning_building_guid = 4)
      LocalObject(503, Door.Constructor(Vector3(4104.018f, 1672.103f, 70.12466f)), owning_building_guid = 4)
      LocalObject(504, Door.Constructor(Vector3(4106.55f, 1654.088f, 78.08867f)), owning_building_guid = 4)
      LocalObject(800, Door.Constructor(Vector3(3987.159f, 1640.025f, 70.09467f)), owning_building_guid = 4)
      LocalObject(801, Door.Constructor(Vector3(3989.719f, 1632.092f, 80.09467f)), owning_building_guid = 4)
      LocalObject(802, Door.Constructor(Vector3(3990.563f, 1644.543f, 70.09467f)), owning_building_guid = 4)
      LocalObject(804, Door.Constructor(Vector3(3992.234f, 1632.66f, 75.09467f)), owning_building_guid = 4)
      LocalObject(805, Door.Constructor(Vector3(3998.486f, 1645.656f, 55.09467f)), owning_building_guid = 4)
      LocalObject(806, Door.Constructor(Vector3(3998.486f, 1645.656f, 62.59467f)), owning_building_guid = 4)
      LocalObject(807, Door.Constructor(Vector3(3999.663f, 1666.019f, 55.09467f)), owning_building_guid = 4)
      LocalObject(808, Door.Constructor(Vector3(4004.117f, 1634.33f, 55.09467f)), owning_building_guid = 4)
      LocalObject(809, Door.Constructor(Vector3(4005.359f, 1682.976f, 55.09467f)), owning_building_guid = 4)
      LocalObject(810, Door.Constructor(Vector3(4009.876f, 1679.572f, 55.09467f)), owning_building_guid = 4)
      LocalObject(812, Door.Constructor(Vector3(4014.823f, 1615.638f, 70.09467f)), owning_building_guid = 4)
      LocalObject(813, Door.Constructor(Vector3(4019.961f, 1636.557f, 62.59467f)), owning_building_guid = 4)
      LocalObject(814, Door.Constructor(Vector3(4022.252f, 1648.997f, 62.59467f)), owning_building_guid = 4)
      LocalObject(815, Door.Constructor(Vector3(4022.745f, 1616.751f, 70.09467f)), owning_building_guid = 4)
      LocalObject(817, Door.Constructor(Vector3(4031.288f, 1642.188f, 55.09467f)), owning_building_guid = 4)
      LocalObject(818, Door.Constructor(Vector3(4033.707f, 1711.196f, 62.59467f)), owning_building_guid = 4)
      LocalObject(819, Door.Constructor(Vector3(4034.692f, 1646.706f, 62.59467f)), owning_building_guid = 4)
      LocalObject(820, Door.Constructor(Vector3(4035.87f, 1667.068f, 62.59467f)), owning_building_guid = 4)
      LocalObject(821, Door.Constructor(Vector3(4038.096f, 1651.223f, 70.09467f)), owning_building_guid = 4)
      LocalObject(822, Door.Constructor(Vector3(4039.766f, 1639.34f, 75.09467f)), owning_building_guid = 4)
      LocalObject(823, Door.Constructor(Vector3(4042.34f, 1639.488f, 80.09467f)), owning_building_guid = 4)
      LocalObject(824, Door.Constructor(Vector3(4042.614f, 1647.819f, 70.09467f)), owning_building_guid = 4)
      LocalObject(898, Door.Constructor(Vector3(4020.086f, 1607.114f, 70.85367f)), owning_building_guid = 4)
      LocalObject(2690, Door.Constructor(Vector3(4003.143f, 1653.71f, 62.92767f)), owning_building_guid = 4)
      LocalObject(2691, Door.Constructor(Vector3(4010.365f, 1654.725f, 62.92767f)), owning_building_guid = 4)
      LocalObject(2692, Door.Constructor(Vector3(4017.583f, 1655.74f, 62.92767f)), owning_building_guid = 4)
      LocalObject(
        942,
        IFFLock.Constructor(Vector3(4023.478f, 1604.822f, 70.05367f), Vector3(0, 0, 172)),
        owning_building_guid = 4,
        door_guid = 898
      )
      LocalObject(
        1090,
        IFFLock.Constructor(Vector3(3980.337f, 1628.926f, 75.03567f), Vector3(0, 0, 262)),
        owning_building_guid = 4,
        door_guid = 490
      )
      LocalObject(
        1091,
        IFFLock.Constructor(Vector3(3983.004f, 1636.557f, 80.03467f), Vector3(0, 0, 352)),
        owning_building_guid = 4,
        door_guid = 491
      )
      LocalObject(
        1094,
        IFFLock.Constructor(Vector3(3988.541f, 1626.544f, 80.03467f), Vector3(0, 0, 172)),
        owning_building_guid = 4,
        door_guid = 492
      )
      LocalObject(
        1095,
        IFFLock.Constructor(Vector3(3997.902f, 1643.987f, 62.40966f), Vector3(0, 0, 262)),
        owning_building_guid = 4,
        door_guid = 806
      )
      LocalObject(
        1096,
        IFFLock.Constructor(Vector3(4002.429f, 1635.042f, 54.90966f), Vector3(0, 0, 352)),
        owning_building_guid = 4,
        door_guid = 808
      )
      LocalObject(
        1097,
        IFFLock.Constructor(Vector3(4007.028f, 1682.393f, 54.90966f), Vector3(0, 0, 172)),
        owning_building_guid = 4,
        door_guid = 809
      )
      LocalObject(
        1098,
        IFFLock.Constructor(Vector3(4022.965f, 1650.684f, 62.40966f), Vector3(0, 0, 82)),
        owning_building_guid = 4,
        door_guid = 814
      )
      LocalObject(
        1100,
        IFFLock.Constructor(Vector3(4043.546f, 1645.066f, 80.03467f), Vector3(0, 0, 352)),
        owning_building_guid = 4,
        door_guid = 497
      )
      LocalObject(
        1101,
        IFFLock.Constructor(Vector3(4049.087f, 1635.054f, 80.03467f), Vector3(0, 0, 172)),
        owning_building_guid = 4,
        door_guid = 498
      )
      LocalObject(
        1102,
        IFFLock.Constructor(Vector3(4051.683f, 1643.079f, 75.03567f), Vector3(0, 0, 82)),
        owning_building_guid = 4,
        door_guid = 499
      )
      LocalObject(
        1103,
        IFFLock.Constructor(Vector3(4085.178f, 1724.533f, 70.03367f), Vector3(0, 0, 82)),
        owning_building_guid = 4,
        door_guid = 502
      )
      LocalObject(1415, Locker.Constructor(Vector3(4001.102f, 1642.426f, 61.33466f)), owning_building_guid = 4)
      LocalObject(1416, Locker.Constructor(Vector3(4001.264f, 1641.273f, 61.33466f)), owning_building_guid = 4)
      LocalObject(1417, Locker.Constructor(Vector3(4001.423f, 1640.138f, 61.33466f)), owning_building_guid = 4)
      LocalObject(1418, Locker.Constructor(Vector3(4001.583f, 1639f, 61.33466f)), owning_building_guid = 4)
      LocalObject(1419, Locker.Constructor(Vector3(4022.41f, 1634.685f, 53.57367f)), owning_building_guid = 4)
      LocalObject(1420, Locker.Constructor(Vector3(4022.595f, 1633.374f, 53.57367f)), owning_building_guid = 4)
      LocalObject(1421, Locker.Constructor(Vector3(4022.781f, 1632.051f, 53.57367f)), owning_building_guid = 4)
      LocalObject(1422, Locker.Constructor(Vector3(4022.967f, 1630.727f, 53.57367f)), owning_building_guid = 4)
      LocalObject(1423, Locker.Constructor(Vector3(4023.598f, 1626.231f, 53.57367f)), owning_building_guid = 4)
      LocalObject(1424, Locker.Constructor(Vector3(4023.783f, 1624.92f, 53.57367f)), owning_building_guid = 4)
      LocalObject(1425, Locker.Constructor(Vector3(4023.969f, 1623.597f, 53.57367f)), owning_building_guid = 4)
      LocalObject(1426, Locker.Constructor(Vector3(4024.155f, 1622.273f, 53.57367f)), owning_building_guid = 4)
      LocalObject(
        1853,
        Terminal.Constructor(Vector3(3993.741f, 1632.874f, 69.90266f), order_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        1854,
        Terminal.Constructor(Vector3(4006.748f, 1640.098f, 62.66367f), order_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        1855,
        Terminal.Constructor(Vector3(4010.442f, 1640.617f, 62.66367f), order_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        1856,
        Terminal.Constructor(Vector3(4012.869f, 1658.248f, 69.90266f), order_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        1857,
        Terminal.Constructor(Vector3(4014.194f, 1641.145f, 62.66367f), order_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        1858,
        Terminal.Constructor(Vector3(4038.258f, 1639.13f, 69.90266f), order_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        2610,
        Terminal.Constructor(Vector3(4000.719f, 1653.068f, 63.20766f), spawn_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        2611,
        Terminal.Constructor(Vector3(4007.939f, 1654.087f, 63.20766f), spawn_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        2612,
        Terminal.Constructor(Vector3(4010.778f, 1640.824f, 75.10166f), spawn_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        2613,
        Terminal.Constructor(Vector3(4015.157f, 1655.099f, 63.20766f), spawn_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        2615,
        Terminal.Constructor(Vector3(4027.927f, 1661.854f, 55.13066f), spawn_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        2616,
        Terminal.Constructor(Vector3(4048.353f, 1688.96f, 62.63066f), spawn_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        2813,
        Terminal.Constructor(Vector3(4091f, 1694.937f, 70.47566f), vehicle_terminal_combined),
        owning_building_guid = 4
      )
      LocalObject(
        1737,
        VehicleSpawnPad.Constructor(Vector3(4077.508f, 1692.949f, 66.31866f), mb_pad_creation, Vector3(0, 0, 262)),
        owning_building_guid = 4,
        terminal_guid = 2813
      )
      LocalObject(2431, ResourceSilo.Constructor(Vector3(3938.664f, 1571.969f, 75.60867f)), owning_building_guid = 4)
      LocalObject(
        2488,
        SpawnTube.Constructor(Vector3(4002.042f, 1654f, 61.07367f), Vector3(0, 0, 82)),
        owning_building_guid = 4
      )
      LocalObject(
        2489,
        SpawnTube.Constructor(Vector3(4009.262f, 1655.014f, 61.07367f), Vector3(0, 0, 82)),
        owning_building_guid = 4
      )
      LocalObject(
        2490,
        SpawnTube.Constructor(Vector3(4016.479f, 1656.029f, 61.07367f), Vector3(0, 0, 82)),
        owning_building_guid = 4
      )
      LocalObject(
        1759,
        ProximityTerminal.Constructor(Vector3(4012.926f, 1657.833f, 73.57366f), medical_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        1760,
        ProximityTerminal.Constructor(Vector3(4022.74f, 1628.42f, 53.57367f), medical_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        2066,
        ProximityTerminal.Constructor(Vector3(3944.375f, 1617.554f, 76.90166f), pad_landing_frame),
        owning_building_guid = 4
      )
      LocalObject(
        2067,
        Terminal.Constructor(Vector3(3944.375f, 1617.554f, 76.90166f), air_rearm_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        2081,
        ProximityTerminal.Constructor(Vector3(4003.232f, 1584.345f, 76.87866f), pad_landing_frame),
        owning_building_guid = 4
      )
      LocalObject(
        2082,
        Terminal.Constructor(Vector3(4003.232f, 1584.345f, 76.87866f), air_rearm_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        2087,
        ProximityTerminal.Constructor(Vector3(4027.611f, 1695.443f, 76.87866f), pad_landing_frame),
        owning_building_guid = 4
      )
      LocalObject(
        2088,
        Terminal.Constructor(Vector3(4027.611f, 1695.443f, 76.87866f), air_rearm_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        2090,
        ProximityTerminal.Constructor(Vector3(4076.555f, 1617.652f, 79.03967f), pad_landing_frame),
        owning_building_guid = 4
      )
      LocalObject(
        2091,
        Terminal.Constructor(Vector3(4076.555f, 1617.652f, 79.03967f), air_rearm_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        2386,
        ProximityTerminal.Constructor(Vector3(4006.446f, 1705.443f, 67.77367f), repair_silo),
        owning_building_guid = 4
      )
      LocalObject(
        2387,
        Terminal.Constructor(Vector3(4006.446f, 1705.443f, 67.77367f), ground_rearm_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        2390,
        ProximityTerminal.Constructor(Vector3(4025.063f, 1574.337f, 67.77367f), repair_silo),
        owning_building_guid = 4
      )
      LocalObject(
        2391,
        Terminal.Constructor(Vector3(4025.063f, 1574.337f, 67.77367f), ground_rearm_terminal),
        owning_building_guid = 4
      )
      LocalObject(
        1677,
        FacilityTurret.Constructor(Vector3(3908.888f, 1702.333f, 77.08167f), manned_turret),
        owning_building_guid = 4
      )
      TurretToWeapon(1677, 5006)
      LocalObject(
        1679,
        FacilityTurret.Constructor(Vector3(3914.974f, 1643.016f, 77.08167f), manned_turret),
        owning_building_guid = 4
      )
      TurretToWeapon(1679, 5007)
      LocalObject(
        1680,
        FacilityTurret.Constructor(Vector3(3930.231f, 1550.395f, 77.08167f), manned_turret),
        owning_building_guid = 4
      )
      TurretToWeapon(1680, 5008)
      LocalObject(
        1684,
        FacilityTurret.Constructor(Vector3(4067.49f, 1567.437f, 77.08167f), manned_turret),
        owning_building_guid = 4
      )
      TurretToWeapon(1684, 5009)
      LocalObject(
        1686,
        FacilityTurret.Constructor(Vector3(4108.598f, 1730.43f, 77.08167f), manned_turret),
        owning_building_guid = 4
      )
      TurretToWeapon(1686, 5010)
      LocalObject(
        1687,
        FacilityTurret.Constructor(Vector3(4129.947f, 1578.454f, 77.08167f), manned_turret),
        owning_building_guid = 4
      )
      TurretToWeapon(1687, 5011)
      LocalObject(
        2174,
        Painbox.Constructor(Vector3(4000.855f, 1694.309f, 58.44466f), painbox),
        owning_building_guid = 4
      )
      LocalObject(
        2187,
        Painbox.Constructor(Vector3(4012.875f, 1648.078f, 66.02206f), painbox_continuous),
        owning_building_guid = 4
      )
      LocalObject(
        2200,
        Painbox.Constructor(Vector3(4004.916f, 1680.697f, 55.03267f), painbox_door_radius),
        owning_building_guid = 4
      )
      LocalObject(
        2231,
        Painbox.Constructor(Vector3(3997.433f, 1645.508f, 62.27367f), painbox_door_radius_continuous),
        owning_building_guid = 4
      )
      LocalObject(
        2232,
        Painbox.Constructor(Vector3(4020.123f, 1635.098f, 64.25227f), painbox_door_radius_continuous),
        owning_building_guid = 4
      )
      LocalObject(
        2233,
        Painbox.Constructor(Vector3(4023.534f, 1649.102f, 62.33817f), painbox_door_radius_continuous),
        owning_building_guid = 4
      )
      LocalObject(290, Generator.Constructor(Vector3(4003.169f, 1698.376f, 52.27966f)), owning_building_guid = 4)
      LocalObject(
        277,
        Terminal.Constructor(Vector3(4004.356f, 1690.271f, 53.57367f), gen_control),
        owning_building_guid = 4
      )
    }

    Building13()

    def Building13(): Unit = { // Name: Nott Type: amp_station GUID: 7, MapID: 13
      LocalBuilding(
        "Nott",
        7,
        13,
        FoundationBuilder(
          Building.Structure(StructureType.Facility, Vector3(6822f, 4234f, 46.3271f), Vector3(0f, 0f, 62f), amp_station)
        )
      )
      LocalObject(
        221,
        CaptureTerminal.Constructor(Vector3(6820.431f, 4231.056f, 57.8351f), capture_terminal),
        owning_building_guid = 7
      )
      LocalObject(168, Door.Constructor(Vector3(6816.092f, 4237.384f, 59.2291f)), owning_building_guid = 7)
      LocalObject(169, Door.Constructor(Vector3(6828.107f, 4230.992f, 59.2291f)), owning_building_guid = 7)
      LocalObject(576, Door.Constructor(Vector3(6715.685f, 4204.454f, 48.0481f)), owning_building_guid = 7)
      LocalObject(577, Door.Constructor(Vector3(6729.571f, 4256.528f, 48.0781f)), owning_building_guid = 7)
      LocalObject(578, Door.Constructor(Vector3(6733.666f, 4203.979f, 56.0411f)), owning_building_guid = 7)
      LocalObject(579, Door.Constructor(Vector3(6738.112f, 4272.59f, 56.0421f)), owning_building_guid = 7)
      LocalObject(580, Door.Constructor(Vector3(6749.729f, 4195.438f, 48.0781f)), owning_building_guid = 7)
      LocalObject(581, Door.Constructor(Vector3(6790.654f, 4250.667f, 53.0481f)), owning_building_guid = 7)
      LocalObject(582, Door.Constructor(Vector3(6792.98f, 4244.549f, 58.0541f)), owning_building_guid = 7)
      LocalObject(583, Door.Constructor(Vector3(6797.233f, 4252.549f, 58.0541f)), owning_building_guid = 7)
      LocalObject(584, Door.Constructor(Vector3(6823.027f, 4156.465f, 56.0411f)), owning_building_guid = 7)
      LocalObject(585, Door.Constructor(Vector3(6839.09f, 4147.924f, 48.0781f)), owning_building_guid = 7)
      LocalObject(586, Door.Constructor(Vector3(6846.964f, 4215.821f, 58.0541f)), owning_building_guid = 7)
      LocalObject(587, Door.Constructor(Vector3(6851.217f, 4223.822f, 58.0541f)), owning_building_guid = 7)
      LocalObject(588, Door.Constructor(Vector3(6853.345f, 4217.334f, 53.0481f)), owning_building_guid = 7)
      LocalObject(589, Door.Constructor(Vector3(6889.556f, 4266.264f, 48.0781f)), owning_building_guid = 7)
      LocalObject(590, Door.Constructor(Vector3(6904.577f, 4209.917f, 56.0421f)), owning_building_guid = 7)
      LocalObject(591, Door.Constructor(Vector3(6905.618f, 4257.724f, 56.0421f)), owning_building_guid = 7)
      LocalObject(592, Door.Constructor(Vector3(6913.118f, 4225.979f, 48.0781f)), owning_building_guid = 7)
      LocalObject(867, Door.Constructor(Vector3(6763.476f, 4183.573f, 40.5481f)), owning_building_guid = 7)
      LocalObject(868, Door.Constructor(Vector3(6787.664f, 4220.545f, 40.5481f)), owning_building_guid = 7)
      LocalObject(869, Door.Constructor(Vector3(6793.521f, 4240.082f, 48.0481f)), owning_building_guid = 7)
      LocalObject(870, Door.Constructor(Vector3(6795.176f, 4234.672f, 48.0481f)), owning_building_guid = 7)
      LocalObject(871, Door.Constructor(Vector3(6798.641f, 4246.661f, 58.0481f)), owning_building_guid = 7)
      LocalObject(872, Door.Constructor(Vector3(6800.585f, 4236.326f, 40.5481f)), owning_building_guid = 7)
      LocalObject(873, Door.Constructor(Vector3(6800.809f, 4245.267f, 53.0481f)), owning_building_guid = 7)
      LocalObject(874, Door.Constructor(Vector3(6801.343f, 4195.15f, 33.0481f)), owning_building_guid = 7)
      LocalObject(875, Door.Constructor(Vector3(6802.997f, 4189.741f, 33.0481f)), owning_building_guid = 7)
      LocalObject(876, Door.Constructor(Vector3(6805.995f, 4237.98f, 33.0481f)), owning_building_guid = 7)
      LocalObject(877, Door.Constructor(Vector3(6809.303f, 4227.161f, 40.5481f)), owning_building_guid = 7)
      LocalObject(878, Door.Constructor(Vector3(6817.572f, 4200.112f, 33.0481f)), owning_building_guid = 7)
      LocalObject(879, Door.Constructor(Vector3(6818.468f, 4235.878f, 40.5481f)), owning_building_guid = 7)
      LocalObject(880, Door.Constructor(Vector3(6827.857f, 4253.537f, 48.0481f)), owning_building_guid = 7)
      LocalObject(881, Door.Constructor(Vector3(6830.494f, 4215.893f, 33.0481f)), owning_building_guid = 7)
      LocalObject(882, Door.Constructor(Vector3(6830.494f, 4215.893f, 40.5481f)), owning_building_guid = 7)
      LocalObject(883, Door.Constructor(Vector3(6832.595f, 4228.366f, 33.0481f)), owning_building_guid = 7)
      LocalObject(884, Door.Constructor(Vector3(6834.921f, 4249.781f, 48.0481f)), owning_building_guid = 7)
      LocalObject(885, Door.Constructor(Vector3(6837.557f, 4212.137f, 48.0481f)), owning_building_guid = 7)
      LocalObject(886, Door.Constructor(Vector3(6842.967f, 4213.791f, 48.0481f)), owning_building_guid = 7)
      LocalObject(887, Door.Constructor(Vector3(6843.191f, 4222.733f, 53.0481f)), owning_building_guid = 7)
      LocalObject(888, Door.Constructor(Vector3(6845.559f, 4221.714f, 58.0481f)), owning_building_guid = 7)
      LocalObject(901, Door.Constructor(Vector3(6835.673f, 4259.771f, 48.8071f)), owning_building_guid = 7)
      LocalObject(2719, Door.Constructor(Vector3(6809.117f, 4218.961f, 40.8811f)), owning_building_guid = 7)
      LocalObject(2720, Door.Constructor(Vector3(6815.552f, 4215.539f, 40.8811f)), owning_building_guid = 7)
      LocalObject(2721, Door.Constructor(Vector3(6821.992f, 4212.115f, 40.8811f)), owning_building_guid = 7)
      LocalObject(
        945,
        IFFLock.Constructor(Vector3(6834.276f, 4263.619f, 48.0071f), Vector3(0, 0, 28)),
        owning_building_guid = 7,
        door_guid = 901
      )
      LocalObject(
        1166,
        IFFLock.Constructor(Vector3(6713.996f, 4203.037f, 47.9871f), Vector3(0, 0, 298)),
        owning_building_guid = 7,
        door_guid = 576
      )
      LocalObject(
        1167,
        IFFLock.Constructor(Vector3(6788.971f, 4249.247f, 52.9891f), Vector3(0, 0, 298)),
        owning_building_guid = 7,
        door_guid = 581
      )
      LocalObject(
        1168,
        IFFLock.Constructor(Vector3(6794.386f, 4242.857f, 57.9881f), Vector3(0, 0, 208)),
        owning_building_guid = 7,
        door_guid = 582
      )
      LocalObject(
        1169,
        IFFLock.Constructor(Vector3(6795.789f, 4254.213f, 57.9881f), Vector3(0, 0, 28)),
        owning_building_guid = 7,
        door_guid = 583
      )
      LocalObject(
        1170,
        IFFLock.Constructor(Vector3(6801.989f, 4191.194f, 32.8631f), Vector3(0, 0, 28)),
        owning_building_guid = 7,
        door_guid = 875
      )
      LocalObject(
        1171,
        IFFLock.Constructor(Vector3(6807.734f, 4226.214f, 40.3631f), Vector3(0, 0, 298)),
        owning_building_guid = 7,
        door_guid = 877
      )
      LocalObject(
        1172,
        IFFLock.Constructor(Vector3(6831.947f, 4216.901f, 40.3631f), Vector3(0, 0, 118)),
        owning_building_guid = 7,
        door_guid = 882
      )
      LocalObject(
        1173,
        IFFLock.Constructor(Vector3(6833.542f, 4226.798f, 32.8631f), Vector3(0, 0, 208)),
        owning_building_guid = 7,
        door_guid = 883
      )
      LocalObject(
        1174,
        IFFLock.Constructor(Vector3(6848.367f, 4214.155f, 57.9881f), Vector3(0, 0, 208)),
        owning_building_guid = 7,
        door_guid = 586
      )
      LocalObject(
        1175,
        IFFLock.Constructor(Vector3(6849.773f, 4225.51f, 57.9881f), Vector3(0, 0, 28)),
        owning_building_guid = 7,
        door_guid = 587
      )
      LocalObject(
        1176,
        IFFLock.Constructor(Vector3(6855.01f, 4218.761f, 52.9891f), Vector3(0, 0, 118)),
        owning_building_guid = 7,
        door_guid = 588
      )
      LocalObject(1540, Locker.Constructor(Vector3(6817.586f, 4238.832f, 31.5271f)), owning_building_guid = 7)
      LocalObject(1541, Locker.Constructor(Vector3(6818.208f, 4240f, 31.5271f)), owning_building_guid = 7)
      LocalObject(1542, Locker.Constructor(Vector3(6818.835f, 4241.18f, 31.5271f)), owning_building_guid = 7)
      LocalObject(1543, Locker.Constructor(Vector3(6819.463f, 4242.361f, 31.5271f)), owning_building_guid = 7)
      LocalObject(1544, Locker.Constructor(Vector3(6821.595f, 4246.369f, 31.5271f)), owning_building_guid = 7)
      LocalObject(1545, Locker.Constructor(Vector3(6822.216f, 4247.538f, 31.5271f)), owning_building_guid = 7)
      LocalObject(1546, Locker.Constructor(Vector3(6822.843f, 4248.718f, 31.5271f)), owning_building_guid = 7)
      LocalObject(1547, Locker.Constructor(Vector3(6823.471f, 4249.898f, 31.5271f)), owning_building_guid = 7)
      LocalObject(1548, Locker.Constructor(Vector3(6830.276f, 4220.044f, 39.2881f)), owning_building_guid = 7)
      LocalObject(1549, Locker.Constructor(Vector3(6830.822f, 4221.072f, 39.2881f)), owning_building_guid = 7)
      LocalObject(1550, Locker.Constructor(Vector3(6831.361f, 4222.084f, 39.2881f)), owning_building_guid = 7)
      LocalObject(1551, Locker.Constructor(Vector3(6831.9f, 4223.099f, 39.2881f)), owning_building_guid = 7)
      LocalObject(
        1897,
        Terminal.Constructor(Vector3(6802.153f, 4244.551f, 47.8561f), order_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        1898,
        Terminal.Constructor(Vector3(6811.456f, 4214.161f, 47.8561f), order_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        1899,
        Terminal.Constructor(Vector3(6820.437f, 4228.776f, 40.6171f), order_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        1900,
        Terminal.Constructor(Vector3(6823.782f, 4226.998f, 40.6171f), order_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        1901,
        Terminal.Constructor(Vector3(6827.077f, 4225.246f, 40.6171f), order_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        1902,
        Terminal.Constructor(Vector3(6841.845f, 4223.446f, 47.8561f), order_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        2631,
        Terminal.Constructor(Vector3(6764.696f, 4210.171f, 40.5841f), spawn_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        2632,
        Terminal.Constructor(Vector3(6797.155f, 4220.095f, 33.0841f), spawn_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        2633,
        Terminal.Constructor(Vector3(6811.457f, 4218.053f, 41.1611f), spawn_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        2634,
        Terminal.Constructor(Vector3(6817.89f, 4214.629f, 41.1611f), spawn_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        2635,
        Terminal.Constructor(Vector3(6823.389f, 4227.028f, 53.0551f), spawn_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        2636,
        Terminal.Constructor(Vector3(6824.33f, 4211.209f, 41.1611f), spawn_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        2816,
        Terminal.Constructor(Vector3(6726.681f, 4230.403f, 48.4291f), vehicle_terminal_combined),
        owning_building_guid = 7
      )
      LocalObject(
        1742,
        VehicleSpawnPad.Constructor(Vector3(6738.765f, 4224.08f, 44.2721f), mb_pad_creation, Vector3(0, 0, 118)),
        owning_building_guid = 7,
        terminal_guid = 2816
      )
      LocalObject(2434, ResourceSilo.Constructor(Vector3(6922.203f, 4240.345f, 53.5621f)), owning_building_guid = 7)
      LocalObject(
        2517,
        SpawnTube.Constructor(Vector3(6809.84f, 4218.078f, 39.0271f), Vector3(0, 0, 298)),
        owning_building_guid = 7
      )
      LocalObject(
        2518,
        SpawnTube.Constructor(Vector3(6816.275f, 4214.657f, 39.0271f), Vector3(0, 0, 298)),
        owning_building_guid = 7
      )
      LocalObject(
        2519,
        SpawnTube.Constructor(Vector3(6822.712f, 4211.234f, 39.0271f), Vector3(0, 0, 298)),
        owning_building_guid = 7
      )
      LocalObject(
        1764,
        ProximityTerminal.Constructor(Vector3(6811.654f, 4214.53f, 51.5271f), medical_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        1765,
        ProximityTerminal.Constructor(Vector3(6821.002f, 4244.094f, 31.5271f), medical_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        2123,
        ProximityTerminal.Constructor(Vector3(6777.667f, 4192.735f, 54.8321f), pad_landing_frame),
        owning_building_guid = 7
      )
      LocalObject(
        2124,
        Terminal.Constructor(Vector3(6777.667f, 4192.735f, 54.8321f), air_rearm_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        2126,
        ProximityTerminal.Constructor(Vector3(6783.795f, 4284.437f, 56.9931f), pad_landing_frame),
        owning_building_guid = 7
      )
      LocalObject(
        2127,
        Terminal.Constructor(Vector3(6783.795f, 4284.437f, 56.9931f), air_rearm_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        2129,
        ProximityTerminal.Constructor(Vector3(6862.692f, 4268.285f, 54.8321f), pad_landing_frame),
        owning_building_guid = 7
      )
      LocalObject(
        2130,
        Terminal.Constructor(Vector3(6862.692f, 4268.285f, 54.8321f), air_rearm_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        2132,
        ProximityTerminal.Constructor(Vector3(6890.788f, 4206.823f, 54.8551f), pad_landing_frame),
        owning_building_guid = 7
      )
      LocalObject(
        2133,
        Terminal.Constructor(Vector3(6890.788f, 4206.823f, 54.8551f), air_rearm_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        2414,
        ProximityTerminal.Constructor(Vector3(6788.912f, 4172.204f, 45.7271f), repair_silo),
        owning_building_guid = 7
      )
      LocalObject(
        2415,
        Terminal.Constructor(Vector3(6788.912f, 4172.204f, 45.7271f), ground_rearm_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        2418,
        ProximityTerminal.Constructor(Vector3(6850.913f, 4289.214f, 45.7271f), repair_silo),
        owning_building_guid = 7
      )
      LocalObject(
        2419,
        Terminal.Constructor(Vector3(6850.913f, 4289.214f, 45.7271f), ground_rearm_terminal),
        owning_building_guid = 7
      )
      LocalObject(
        1712,
        FacilityTurret.Constructor(Vector3(6691.582f, 4212.032f, 55.0351f), manned_turret),
        owning_building_guid = 7
      )
      TurretToWeapon(1712, 5012)
      LocalObject(
        1713,
        FacilityTurret.Constructor(Vector3(6763.64f, 4347.532f, 55.0351f), manned_turret),
        owning_building_guid = 7
      )
      TurretToWeapon(1713, 5013)
      LocalObject(
        1714,
        FacilityTurret.Constructor(Vector3(6820.644f, 4319.734f, 55.0351f), manned_turret),
        owning_building_guid = 7
      )
      TurretToWeapon(1714, 5014)
      LocalObject(
        1715,
        FacilityTurret.Constructor(Vector3(6869.666f, 4117.376f, 55.0351f), manned_turret),
        owning_building_guid = 7
      )
      TurretToWeapon(1715, 5015)
      LocalObject(
        1716,
        FacilityTurret.Constructor(Vector3(6899.607f, 4168.942f, 55.0351f), manned_turret),
        owning_building_guid = 7
      )
      TurretToWeapon(1716, 5016)
      LocalObject(
        1718,
        FacilityTurret.Constructor(Vector3(6941.706f, 4252.842f, 55.0351f), manned_turret),
        owning_building_guid = 7
      )
      TurretToWeapon(1718, 5017)
      LocalObject(2177, Painbox.Constructor(Vector3(6799.979f, 4177.925f, 36.3981f), painbox), owning_building_guid = 7)
      LocalObject(
        2190,
        Painbox.Constructor(Vector3(6817.429f, 4222.392f, 43.9755f), painbox_continuous),
        owning_building_guid = 7
      )
      LocalObject(
        2203,
        Painbox.Constructor(Vector3(6804.695f, 4191.324f, 32.9861f), painbox_door_radius),
        owning_building_guid = 7
      )
      LocalObject(
        2240,
        Painbox.Constructor(Vector3(6808.204f, 4227.829f, 40.2916f), painbox_door_radius_continuous),
        owning_building_guid = 7
      )
      LocalObject(
        2241,
        Painbox.Constructor(Vector3(6819.195f, 4237.153f, 42.2057f), painbox_door_radius_continuous),
        owning_building_guid = 7
      )
      LocalObject(
        2242,
        Painbox.Constructor(Vector3(6831.433f, 4215.395f, 40.2271f), painbox_door_radius_continuous),
        owning_building_guid = 7
      )
      LocalObject(293, Generator.Constructor(Vector3(6795.717f, 4175.995f, 30.2331f)), owning_building_guid = 7)
      LocalObject(
        280,
        Terminal.Constructor(Vector3(6799.521f, 4183.25f, 31.5271f), gen_control),
        owning_building_guid = 7
      )
    }

    Building45()

    def Building45(): Unit = { // Name: bunkerg4 Type: bunker_gauntlet GUID: 10, MapID: 45
      LocalBuilding(
        "bunkerg4",
        10,
        45,
        FoundationBuilder(
          Building.Structure(
            StructureType.Bunker,
            Vector3(2332f, 2086f, 85.39127f),
            Vector3(0f, 0f, 337f),
            bunker_gauntlet
          )
        )
      )
      LocalObject(363, Door.Constructor(Vector3(2308.334f, 2093.969f, 86.91228f)), owning_building_guid = 10)
      LocalObject(373, Door.Constructor(Vector3(2354.199f, 2074.512f, 86.91228f)), owning_building_guid = 10)
    }

    Building44()

    def Building44(): Unit = { // Name: bunkerg3 Type: bunker_gauntlet GUID: 11, MapID: 44
      LocalBuilding(
        "bunkerg3",
        11,
        44,
        FoundationBuilder(
          Building.Structure(
            StructureType.Bunker,
            Vector3(3242f, 7204f, 77.57013f),
            Vector3(0f, 0f, 227f),
            bunker_gauntlet
          )
        )
      )
      LocalObject(409, Door.Constructor(Vector3(3223.612f, 7187.069f, 79.09113f)), owning_building_guid = 11)
      LocalObject(418, Door.Constructor(Vector3(3257.582f, 7223.513f, 79.09113f)), owning_building_guid = 11)
    }

    Building42()

    def Building42(): Unit = { // Name: bunkerg1 Type: bunker_gauntlet GUID: 12, MapID: 42
      LocalBuilding(
        "bunkerg1",
        12,
        42,
        FoundationBuilder(
          Building.Structure(
            StructureType.Bunker,
            Vector3(3468f, 4516f, 75.12246f),
            Vector3(0f, 0f, 227f),
            bunker_gauntlet
          )
        )
      )
      LocalObject(447, Door.Constructor(Vector3(3449.612f, 4499.069f, 76.64346f)), owning_building_guid = 12)
      LocalObject(454, Door.Constructor(Vector3(3483.582f, 4535.513f, 76.64346f)), owning_building_guid = 12)
    }

    Building43()

    def Building43(): Unit = { // Name: bunkerg2 Type: bunker_gauntlet GUID: 13, MapID: 43
      LocalBuilding(
        "bunkerg2",
        13,
        43,
        FoundationBuilder(
          Building.Structure(
            StructureType.Bunker,
            Vector3(3816f, 6076f, 59.98318f),
            Vector3(0f, 0f, 74f),
            bunker_gauntlet
          )
        )
      )
      LocalObject(473, Door.Constructor(Vector3(3810.975f, 6051.54f, 61.50418f)), owning_building_guid = 13)
      LocalObject(474, Door.Constructor(Vector3(3824.697f, 6099.434f, 61.50418f)), owning_building_guid = 13)
    }

    Building34()

    def Building34(): Unit = { // Name: bunker2 Type: bunker_lg GUID: 14, MapID: 34
      LocalBuilding(
        "bunker2",
        14,
        34,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(946f, 2856f, 74.08158f), Vector3(0f, 0f, 223f), bunker_lg)
        )
      )
      LocalObject(306, Door.Constructor(Vector3(945.838f, 2852.353f, 75.60258f)), owning_building_guid = 14)
    }

    Building35()

    def Building35(): Unit = { // Name: bunker3 Type: bunker_lg GUID: 15, MapID: 35
      LocalBuilding(
        "bunker3",
        15,
        35,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(3026f, 3702f, 55.36764f), Vector3(0f, 0f, 141f), bunker_lg)
        )
      )
      LocalObject(396, Door.Constructor(Vector3(3022.365f, 3701.653f, 56.88864f)), owning_building_guid = 15)
    }

    Building37()

    def Building37(): Unit = { // Name: bunker5 Type: bunker_lg GUID: 16, MapID: 37
      LocalBuilding(
        "bunker5",
        16,
        37,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(3138f, 7404f, 77.53236f), Vector3(0f, 0f, 263f), bunker_lg)
        )
      )
      LocalObject(400, Door.Constructor(Vector3(3140.22f, 7401.102f, 79.05337f)), owning_building_guid = 16)
    }

    Building40()

    def Building40(): Unit = { // Name: bunker8 Type: bunker_lg GUID: 17, MapID: 40
      LocalBuilding(
        "bunker8",
        17,
        40,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(3632f, 3158f, 66.75056f), Vector3(0f, 0f, 270f), bunker_lg)
        )
      )
      LocalObject(455, Door.Constructor(Vector3(3634.557f, 3155.394f, 68.27157f)), owning_building_guid = 17)
    }

    Building33()

    def Building33(): Unit = { // Name: bunker1 Type: bunker_sm GUID: 18, MapID: 33
      LocalBuilding(
        "bunker1",
        18,
        33,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(1066f, 2700f, 73.6301f), Vector3(0f, 0f, 174f), bunker_sm)
        )
      )
      LocalObject(318, Door.Constructor(Vector3(1064.787f, 2700.183f, 75.1511f)), owning_building_guid = 18)
    }

    Building39()

    def Building39(): Unit = { // Name: bunker7 Type: bunker_sm GUID: 19, MapID: 39
      LocalBuilding(
        "bunker7",
        19,
        39,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(2024f, 5436f, 68.63918f), Vector3(0f, 0f, 41f), bunker_sm)
        )
      )
      LocalObject(348, Door.Constructor(Vector3(2024.961f, 5436.762f, 70.16019f)), owning_building_guid = 19)
    }

    Building36()

    def Building36(): Unit = { // Name: bunker4 Type: bunker_sm GUID: 20, MapID: 36
      LocalBuilding(
        "bunker4",
        20,
        36,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(3416f, 4742f, 75.41428f), Vector3(0f, 0f, 231f), bunker_sm)
        )
      )
      LocalObject(444, Door.Constructor(Vector3(3415.186f, 4741.083f, 76.93529f)), owning_building_guid = 20)
    }

    Building38()

    def Building38(): Unit = { // Name: bunker6 Type: bunker_sm GUID: 21, MapID: 38
      LocalBuilding(
        "bunker6",
        21,
        38,
        FoundationBuilder(
          Building.Structure(StructureType.Bunker, Vector3(5560f, 2582f, 53.30706f), Vector3(0f, 0f, 138f), bunker_sm)
        )
      )
      LocalObject(557, Door.Constructor(Vector3(5559.126f, 2582.861f, 54.82806f)), owning_building_guid = 21)
    }

    Building16()

    def Building16(): Unit = { // Name: Jarl Type: comm_station GUID: 22, MapID: 16
      LocalBuilding(
        "Jarl",
        22,
        16,
        FoundationBuilder(
          Building.Structure(
            StructureType.Facility,
            Vector3(2012f, 5530f, 68.28211f),
            Vector3(0f, 0f, 289f),
            comm_station
          )
        )
      )
      LocalObject(
        211,
        CaptureTerminal.Constructor(Vector3(2098.907f, 5513.295f, 50.98211f), capture_terminal),
        owning_building_guid = 22
      )
      LocalObject(340, Door.Constructor(Vector3(1933.992f, 5548.292f, 77.99712f)), owning_building_guid = 22)
      LocalObject(341, Door.Constructor(Vector3(1939.915f, 5531.091f, 70.03311f)), owning_building_guid = 22)
      LocalObject(342, Door.Constructor(Vector3(1951.4f, 5572.384f, 70.03311f)), owning_building_guid = 22)
      LocalObject(343, Door.Constructor(Vector3(1968.601f, 5578.307f, 77.99712f)), owning_building_guid = 22)
      LocalObject(344, Door.Constructor(Vector3(1997.197f, 5546.056f, 75.00311f)), owning_building_guid = 22)
      LocalObject(345, Door.Constructor(Vector3(2003.569f, 5531.724f, 82.44211f)), owning_building_guid = 22)
      LocalObject(346, Door.Constructor(Vector3(2005.768f, 5549.006f, 75.00311f)), owning_building_guid = 22)
      LocalObject(347, Door.Constructor(Vector3(2021.489f, 5469.598f, 77.99712f)), owning_building_guid = 22)
      LocalObject(349, Door.Constructor(Vector3(2033.515f, 5528.947f, 75.00311f)), owning_building_guid = 22)
      LocalObject(350, Door.Constructor(Vector3(2038.691f, 5475.521f, 70.03311f)), owning_building_guid = 22)
      LocalObject(351, Door.Constructor(Vector3(2076.436f, 5551.658f, 70.03311f)), owning_building_guid = 22)
      LocalObject(352, Door.Constructor(Vector3(2082.359f, 5534.458f, 77.99611f)), owning_building_guid = 22)
      LocalObject(353, Door.Constructor(Vector3(2094.278f, 5524.487f, 70.00311f)), owning_building_guid = 22)
      LocalObject(651, Door.Constructor(Vector3(2003.009f, 5543.826f, 75.00311f)), owning_building_guid = 22)
      LocalObject(652, Door.Constructor(Vector3(2015.782f, 5531.302f, 62.50311f)), owning_building_guid = 22)
      LocalObject(653, Door.Constructor(Vector3(2018.137f, 5549.035f, 70.00311f)), owning_building_guid = 22)
      LocalObject(654, Door.Constructor(Vector3(2018.262f, 5536.387f, 52.50311f)), owning_building_guid = 22)
      LocalObject(655, Door.Constructor(Vector3(2020.617f, 5554.12f, 62.50311f)), owning_building_guid = 22)
      LocalObject(656, Door.Constructor(Vector3(2023.471f, 5521.258f, 70.00311f)), owning_building_guid = 22)
      LocalObject(657, Door.Constructor(Vector3(2025.951f, 5526.343f, 75.00311f)), owning_building_guid = 22)
      LocalObject(658, Door.Constructor(Vector3(2026.076f, 5513.694f, 65.00311f)), owning_building_guid = 22)
      LocalObject(659, Door.Constructor(Vector3(2028.181f, 5556.724f, 52.50311f)), owning_building_guid = 22)
      LocalObject(660, Door.Constructor(Vector3(2030.536f, 5574.457f, 62.50311f)), owning_building_guid = 22)
      LocalObject(661, Door.Constructor(Vector3(2033.515f, 5528.947f, 65.00311f)), owning_building_guid = 22)
      LocalObject(662, Door.Constructor(Vector3(2033.889f, 5491.002f, 60.00311f)), owning_building_guid = 22)
      LocalObject(663, Door.Constructor(Vector3(2041.578f, 5480.958f, 52.50311f)), owning_building_guid = 22)
      LocalObject(664, Door.Constructor(Vector3(2043.808f, 5511.339f, 52.50311f)), owning_building_guid = 22)
      LocalObject(665, Door.Constructor(Vector3(2046.039f, 5541.72f, 62.50311f)), owning_building_guid = 22)
      LocalObject(666, Door.Constructor(Vector3(2048.269f, 5572.102f, 62.50311f)), owning_building_guid = 22)
      LocalObject(667, Door.Constructor(Vector3(2048.519f, 5546.805f, 52.50311f)), owning_building_guid = 22)
      LocalObject(668, Door.Constructor(Vector3(2056.083f, 5549.409f, 62.50311f)), owning_building_guid = 22)
      LocalObject(669, Door.Constructor(Vector3(2056.582f, 5498.815f, 60.00311f)), owning_building_guid = 22)
      LocalObject(670, Door.Constructor(Vector3(2056.706f, 5486.167f, 60.00311f)), owning_building_guid = 22)
      LocalObject(671, Door.Constructor(Vector3(2074.065f, 5521.757f, 52.50311f)), owning_building_guid = 22)
      LocalObject(672, Door.Constructor(Vector3(2079.399f, 5493.98f, 52.50311f)), owning_building_guid = 22)
      LocalObject(673, Door.Constructor(Vector3(2089.318f, 5514.318f, 52.50311f)), owning_building_guid = 22)
      LocalObject(674, Door.Constructor(Vector3(2091.923f, 5506.754f, 52.50311f)), owning_building_guid = 22)
      LocalObject(891, Door.Constructor(Vector3(2013.918f, 5511.933f, 70.77512f)), owning_building_guid = 22)
      LocalObject(2651, Door.Constructor(Vector3(2036.924f, 5499.796f, 60.33611f)), owning_building_guid = 22)
      LocalObject(2652, Door.Constructor(Vector3(2043.82f, 5502.17f, 60.33611f)), owning_building_guid = 22)
      LocalObject(2653, Door.Constructor(Vector3(2050.712f, 5504.543f, 60.33611f)), owning_building_guid = 22)
      LocalObject(
        935,
        IFFLock.Constructor(Vector3(2017.836f, 5510.378f, 69.93411f), Vector3(0, 0, 161)),
        owning_building_guid = 22,
        door_guid = 891
      )
      LocalObject(
        986,
        IFFLock.Constructor(Vector3(1997.097f, 5543.856f, 74.94312f), Vector3(0, 0, 251)),
        owning_building_guid = 22,
        door_guid = 344
      )
      LocalObject(
        987,
        IFFLock.Constructor(Vector3(2001.341f, 5531.812f, 82.36311f), Vector3(0, 0, 341)),
        owning_building_guid = 22,
        door_guid = 345
      )
      LocalObject(
        988,
        IFFLock.Constructor(Vector3(2005.868f, 5551.202f, 74.94312f), Vector3(0, 0, 71)),
        owning_building_guid = 22,
        door_guid = 346
      )
      LocalObject(
        989,
        IFFLock.Constructor(Vector3(2027.804f, 5554.932f, 52.31811f), Vector3(0, 0, 251)),
        owning_building_guid = 22,
        door_guid = 659
      )
      LocalObject(
        990,
        IFFLock.Constructor(Vector3(2031.317f, 5529.05f, 74.94312f), Vector3(0, 0, 341)),
        owning_building_guid = 22,
        door_guid = 349
      )
      LocalObject(
        991,
        IFFLock.Constructor(Vector3(2033.635f, 5489.251f, 59.81811f), Vector3(0, 0, 251)),
        owning_building_guid = 22,
        door_guid = 662
      )
      LocalObject(
        992,
        IFFLock.Constructor(Vector3(2039.786f, 5481.335f, 52.31811f), Vector3(0, 0, 341)),
        owning_building_guid = 22,
        door_guid = 663
      )
      LocalObject(
        993,
        IFFLock.Constructor(Vector3(2056.836f, 5500.565f, 59.81811f), Vector3(0, 0, 71)),
        owning_building_guid = 22,
        door_guid = 669
      )
      LocalObject(
        994,
        IFFLock.Constructor(Vector3(2087.567f, 5514.575f, 52.31811f), Vector3(0, 0, 341)),
        owning_building_guid = 22,
        door_guid = 673
      )
      LocalObject(
        995,
        IFFLock.Constructor(Vector3(2093.674f, 5506.497f, 52.31811f), Vector3(0, 0, 161)),
        owning_building_guid = 22,
        door_guid = 674
      )
      LocalObject(
        996,
        IFFLock.Constructor(Vector3(2096.453f, 5524.413f, 69.93211f), Vector3(0, 0, 161)),
        owning_building_guid = 22,
        door_guid = 353
      )
      LocalObject(1250, Locker.Constructor(Vector3(2037.073f, 5488.33f, 58.74311f)), owning_building_guid = 22)
      LocalObject(1251, Locker.Constructor(Vector3(2037.453f, 5487.229f, 58.74311f)), owning_building_guid = 22)
      LocalObject(1252, Locker.Constructor(Vector3(2037.826f, 5486.145f, 58.74311f)), owning_building_guid = 22)
      LocalObject(1253, Locker.Constructor(Vector3(2038.2f, 5485.059f, 58.74311f)), owning_building_guid = 22)
      LocalObject(1254, Locker.Constructor(Vector3(2059.468f, 5484.797f, 50.98211f)), owning_building_guid = 22)
      LocalObject(1255, Locker.Constructor(Vector3(2059.899f, 5483.545f, 50.98211f)), owning_building_guid = 22)
      LocalObject(1256, Locker.Constructor(Vector3(2060.334f, 5482.282f, 50.98211f)), owning_building_guid = 22)
      LocalObject(1257, Locker.Constructor(Vector3(2060.769f, 5481.018f, 50.98211f)), owning_building_guid = 22)
      LocalObject(1258, Locker.Constructor(Vector3(2062.247f, 5476.726f, 50.98211f)), owning_building_guid = 22)
      LocalObject(1259, Locker.Constructor(Vector3(2062.678f, 5475.474f, 50.98211f)), owning_building_guid = 22)
      LocalObject(1260, Locker.Constructor(Vector3(2063.113f, 5474.21f, 50.98211f)), owning_building_guid = 22)
      LocalObject(1261, Locker.Constructor(Vector3(2063.548f, 5472.946f, 50.98211f)), owning_building_guid = 22)
      LocalObject(
        1786,
        Terminal.Constructor(Vector3(1987.033f, 5531.579f, 74.84211f), order_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        1787,
        Terminal.Constructor(Vector3(2003.71f, 5524.68f, 82.23711f), order_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        1788,
        Terminal.Constructor(Vector3(2004.977f, 5527.502f, 82.23711f), order_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        1789,
        Terminal.Constructor(Vector3(2007.866f, 5526.11f, 82.23711f), order_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        1790,
        Terminal.Constructor(Vector3(2043.06f, 5487.122f, 60.07211f), order_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        1791,
        Terminal.Constructor(Vector3(2046.588f, 5488.337f, 60.07211f), order_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        1792,
        Terminal.Constructor(Vector3(2050.17f, 5489.57f, 60.07211f), order_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        2563,
        Terminal.Constructor(Vector3(1988.793f, 5523.585f, 75.09911f), spawn_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        2564,
        Terminal.Constructor(Vector3(2014.895f, 5547.979f, 52.53911f), spawn_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        2565,
        Terminal.Constructor(Vector3(2034.667f, 5498.704f, 60.61611f), spawn_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        2566,
        Terminal.Constructor(Vector3(2041.56f, 5501.082f, 60.61611f), spawn_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        2567,
        Terminal.Constructor(Vector3(2048.452f, 5503.451f, 60.61611f), spawn_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        2568,
        Terminal.Constructor(Vector3(2049.573f, 5543.562f, 62.53911f), spawn_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        2806,
        Terminal.Constructor(Vector3(2080.868f, 5498.232f, 71.16911f), vehicle_terminal_combined),
        owning_building_guid = 22
      )
      LocalObject(
        1726,
        VehicleSpawnPad.Constructor(Vector3(2076.287f, 5511.065f, 67.01111f), mb_pad_creation, Vector3(0, 0, -19)),
        owning_building_guid = 22,
        terminal_guid = 2806
      )
      LocalObject(2424, ResourceSilo.Constructor(Vector3(1928.515f, 5560.237f, 75.49911f)), owning_building_guid = 22)
      LocalObject(
        2449,
        SpawnTube.Constructor(Vector3(2035.788f, 5499.87f, 58.48211f), Vector3(0, 0, 71)),
        owning_building_guid = 22
      )
      LocalObject(
        2450,
        SpawnTube.Constructor(Vector3(2042.682f, 5502.244f, 58.48211f), Vector3(0, 0, 71)),
        owning_building_guid = 22
      )
      LocalObject(
        2451,
        SpawnTube.Constructor(Vector3(2049.573f, 5504.617f, 58.48211f), Vector3(0, 0, 71)),
        owning_building_guid = 22
      )
      LocalObject(
        1746,
        ProximityTerminal.Constructor(Vector3(1984.883f, 5519.749f, 68.48211f), medical_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        1747,
        ProximityTerminal.Constructor(Vector3(2060.987f, 5478.71f, 50.98211f), medical_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        2003,
        ProximityTerminal.Constructor(Vector3(2058.043f, 5565.786f, 76.72311f), pad_landing_frame),
        owning_building_guid = 22
      )
      LocalObject(
        2004,
        Terminal.Constructor(Vector3(2058.043f, 5565.786f, 76.72311f), air_rearm_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        2334,
        ProximityTerminal.Constructor(Vector3(2009.064f, 5463.796f, 68.03211f), repair_silo),
        owning_building_guid = 22
      )
      LocalObject(
        2335,
        Terminal.Constructor(Vector3(2009.064f, 5463.796f, 68.03211f), ground_rearm_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        2338,
        ProximityTerminal.Constructor(Vector3(2014.028f, 5595.307f, 68.03211f), repair_silo),
        owning_building_guid = 22
      )
      LocalObject(
        2339,
        Terminal.Constructor(Vector3(2014.028f, 5595.307f, 68.03211f), ground_rearm_terminal),
        owning_building_guid = 22
      )
      LocalObject(
        1618,
        FacilityTurret.Constructor(Vector3(1912.361f, 5572.312f, 76.99011f), manned_turret),
        owning_building_guid = 22
      )
      TurretToWeapon(1618, 5018)
      LocalObject(
        1621,
        FacilityTurret.Constructor(Vector3(1944.883f, 5474.246f, 76.99011f), manned_turret),
        owning_building_guid = 22
      )
      TurretToWeapon(1621, 5019)
      LocalObject(
        1622,
        FacilityTurret.Constructor(Vector3(1999.694f, 5447.488f, 76.99011f), manned_turret),
        owning_building_guid = 22
      )
      TurretToWeapon(1622, 5020)
      LocalObject(
        1623,
        FacilityTurret.Constructor(Vector3(2024.592f, 5612.151f, 76.99011f), manned_turret),
        owning_building_guid = 22
      )
      TurretToWeapon(1623, 5021)
      LocalObject(
        1624,
        FacilityTurret.Constructor(Vector3(2079.382f, 5585.407f, 76.99011f), manned_turret),
        owning_building_guid = 22
      )
      TurretToWeapon(1624, 5022)
      LocalObject(
        1625,
        FacilityTurret.Constructor(Vector3(2111.768f, 5487.314f, 76.99011f), manned_turret),
        owning_building_guid = 22
      )
      TurretToWeapon(1625, 5023)
      LocalObject(
        2167,
        Painbox.Constructor(Vector3(2039.657f, 5560.529f, 55.88411f), painbox),
        owning_building_guid = 22
      )
      LocalObject(
        2180,
        Painbox.Constructor(Vector3(2051.79f, 5494.823f, 62.92691f), painbox_continuous),
        owning_building_guid = 22
      )
      LocalObject(
        2193,
        Painbox.Constructor(Vector3(2025.491f, 5555.547f, 53.74081f), painbox_door_radius),
        owning_building_guid = 22
      )
      LocalObject(
        2210,
        Painbox.Constructor(Vector3(2032.042f, 5490.457f, 60.30811f), painbox_door_radius_continuous),
        owning_building_guid = 22
      )
      LocalObject(
        2211,
        Painbox.Constructor(Vector3(2057.146f, 5484.356f, 61.30811f), painbox_door_radius_continuous),
        owning_building_guid = 22
      )
      LocalObject(
        2212,
        Painbox.Constructor(Vector3(2058.188f, 5498.512f, 60.08981f), painbox_door_radius_continuous),
        owning_building_guid = 22
      )
      LocalObject(283, Generator.Constructor(Vector3(2042.88f, 5561.812f, 49.68811f)), owning_building_guid = 22)
      LocalObject(
        270,
        Terminal.Constructor(Vector3(2035.15f, 5559.101f, 50.98211f), gen_control),
        owning_building_guid = 22
      )
    }

    Building14()

    def Building14(): Unit = { // Name: Vidar Type: comm_station GUID: 25, MapID: 14
      LocalBuilding(
        "Vidar",
        25,
        14,
        FoundationBuilder(
          Building.Structure(
            StructureType.Facility,
            Vector3(3720f, 3102f, 66.58833f),
            Vector3(0f, 0f, 360f),
            comm_station
          )
        )
      )
      LocalObject(
        216,
        CaptureTerminal.Constructor(Vector3(3764.089f, 3178.734f, 49.28833f), capture_terminal),
        owning_building_guid = 25
      )
      LocalObject(460, Door.Constructor(Vector3(3660.196f, 3058.5f, 68.33933f)), owning_building_guid = 25)
      LocalObject(461, Door.Constructor(Vector3(3660.196f, 3076.693f, 76.30333f)), owning_building_guid = 25)
      LocalObject(462, Door.Constructor(Vector3(3677.307f, 3034.197f, 76.30333f)), owning_building_guid = 25)
      LocalObject(463, Door.Constructor(Vector3(3695.5f, 3034.197f, 68.33933f)), owning_building_guid = 25)
      LocalObject(464, Door.Constructor(Vector3(3700f, 3093.231f, 73.30933f)), owning_building_guid = 25)
      LocalObject(465, Door.Constructor(Vector3(3700f, 3102.295f, 73.30933f)), owning_building_guid = 25)
      LocalObject(466, Door.Constructor(Vector3(3715.625f, 3094.59f, 80.74834f)), owning_building_guid = 25)
      LocalObject(467, Door.Constructor(Vector3(3720.5f, 3169.977f, 68.33933f)), owning_building_guid = 25)
      LocalObject(468, Door.Constructor(Vector3(3728f, 3122f, 73.30933f)), owning_building_guid = 25)
      LocalObject(469, Door.Constructor(Vector3(3738.692f, 3169.977f, 76.30233f)), owning_building_guid = 25)
      LocalObject(470, Door.Constructor(Vector3(3752f, 3178f, 68.30933f)), owning_building_guid = 25)
      LocalObject(471, Door.Constructor(Vector3(3780.201f, 3091.307f, 76.30333f)), owning_building_guid = 25)
      LocalObject(472, Door.Constructor(Vector3(3780.201f, 3109.5f, 68.33933f)), owning_building_guid = 25)
      LocalObject(760, Door.Constructor(Vector3(3684f, 3134f, 60.80933f)), owning_building_guid = 25)
      LocalObject(761, Door.Constructor(Vector3(3692f, 3150f, 60.80933f)), owning_building_guid = 25)
      LocalObject(762, Door.Constructor(Vector3(3700f, 3118f, 60.80933f)), owning_building_guid = 25)
      LocalObject(763, Door.Constructor(Vector3(3700f, 3126f, 50.80933f)), owning_building_guid = 25)
      LocalObject(764, Door.Constructor(Vector3(3704f, 3098f, 73.30933f)), owning_building_guid = 25)
      LocalObject(765, Door.Constructor(Vector3(3704f, 3114f, 68.30933f)), owning_building_guid = 25)
      LocalObject(766, Door.Constructor(Vector3(3716f, 3110f, 50.80933f)), owning_building_guid = 25)
      LocalObject(767, Door.Constructor(Vector3(3716f, 3142f, 50.80933f)), owning_building_guid = 25)
      LocalObject(768, Door.Constructor(Vector3(3716f, 3150f, 60.80933f)), owning_building_guid = 25)
      LocalObject(769, Door.Constructor(Vector3(3720f, 3106f, 60.80933f)), owning_building_guid = 25)
      LocalObject(770, Door.Constructor(Vector3(3720f, 3138f, 60.80933f)), owning_building_guid = 25)
      LocalObject(771, Door.Constructor(Vector3(3728f, 3114f, 73.30933f)), owning_building_guid = 25)
      LocalObject(772, Door.Constructor(Vector3(3728f, 3122f, 63.30933f)), owning_building_guid = 25)
      LocalObject(773, Door.Constructor(Vector3(3732f, 3110f, 68.30933f)), owning_building_guid = 25)
      LocalObject(774, Door.Constructor(Vector3(3740f, 3110f, 63.30933f)), owning_building_guid = 25)
      LocalObject(775, Door.Constructor(Vector3(3748f, 3126f, 50.80933f)), owning_building_guid = 25)
      LocalObject(776, Door.Constructor(Vector3(3748f, 3158f, 50.80933f)), owning_building_guid = 25)
      LocalObject(777, Door.Constructor(Vector3(3760f, 3170f, 50.80933f)), owning_building_guid = 25)
      LocalObject(778, Door.Constructor(Vector3(3764f, 3110f, 58.30933f)), owning_building_guid = 25)
      LocalObject(779, Door.Constructor(Vector3(3764f, 3134f, 58.30933f)), owning_building_guid = 25)
      LocalObject(780, Door.Constructor(Vector3(3768f, 3170f, 50.80933f)), owning_building_guid = 25)
      LocalObject(781, Door.Constructor(Vector3(3776f, 3114f, 50.80933f)), owning_building_guid = 25)
      LocalObject(782, Door.Constructor(Vector3(3776f, 3130f, 58.30933f)), owning_building_guid = 25)
      LocalObject(783, Door.Constructor(Vector3(3776f, 3154f, 50.80933f)), owning_building_guid = 25)
      LocalObject(896, Door.Constructor(Vector3(3737.707f, 3097.932f, 69.08133f)), owning_building_guid = 25)
      LocalObject(2684, Door.Constructor(Vector3(3756.673f, 3115.733f, 58.64233f)), owning_building_guid = 25)
      LocalObject(2685, Door.Constructor(Vector3(3756.673f, 3123.026f, 58.64233f)), owning_building_guid = 25)
      LocalObject(2686, Door.Constructor(Vector3(3756.673f, 3130.315f, 58.64233f)), owning_building_guid = 25)
      LocalObject(
        940,
        IFFLock.Constructor(Vector3(3740.453f, 3101.13f, 68.24033f), Vector3(0, 0, 90)),
        owning_building_guid = 25,
        door_guid = 896
      )
      LocalObject(
        1074,
        IFFLock.Constructor(Vector3(3697.957f, 3103.105f, 73.24934f), Vector3(0, 0, 0)),
        owning_building_guid = 25,
        door_guid = 465
      )
      LocalObject(
        1075,
        IFFLock.Constructor(Vector3(3701.572f, 3125.06f, 50.62433f), Vector3(0, 0, 180)),
        owning_building_guid = 25,
        door_guid = 763
      )
      LocalObject(
        1076,
        IFFLock.Constructor(Vector3(3702.047f, 3092.42f, 73.24934f), Vector3(0, 0, 180)),
        owning_building_guid = 25,
        door_guid = 464
      )
      LocalObject(
        1077,
        IFFLock.Constructor(Vector3(3714.817f, 3092.511f, 80.66933f), Vector3(0, 0, 270)),
        owning_building_guid = 25,
        door_guid = 466
      )
      LocalObject(
        1078,
        IFFLock.Constructor(Vector3(3727.187f, 3119.955f, 73.24934f), Vector3(0, 0, 270)),
        owning_building_guid = 25,
        door_guid = 468
      )
      LocalObject(
        1079,
        IFFLock.Constructor(Vector3(3752.778f, 3180.033f, 68.23833f), Vector3(0, 0, 90)),
        owning_building_guid = 25,
        door_guid = 470
      )
      LocalObject(
        1080,
        IFFLock.Constructor(Vector3(3759.187f, 3168.428f, 50.62433f), Vector3(0, 0, 270)),
        owning_building_guid = 25,
        door_guid = 777
      )
      LocalObject(
        1081,
        IFFLock.Constructor(Vector3(3762.428f, 3134.81f, 58.12433f), Vector3(0, 0, 0)),
        owning_building_guid = 25,
        door_guid = 779
      )
      LocalObject(
        1082,
        IFFLock.Constructor(Vector3(3765.572f, 3109.19f, 58.12433f), Vector3(0, 0, 180)),
        owning_building_guid = 25,
        door_guid = 778
      )
      LocalObject(
        1083,
        IFFLock.Constructor(Vector3(3768.813f, 3171.572f, 50.62433f), Vector3(0, 0, 90)),
        owning_building_guid = 25,
        door_guid = 780
      )
      LocalObject(
        1084,
        IFFLock.Constructor(Vector3(3775.06f, 3112.428f, 50.62433f), Vector3(0, 0, 270)),
        owning_building_guid = 25,
        door_guid = 781
      )
      LocalObject(1391, Locker.Constructor(Vector3(3767.563f, 3112.141f, 57.04933f)), owning_building_guid = 25)
      LocalObject(1392, Locker.Constructor(Vector3(3768.727f, 3112.141f, 57.04933f)), owning_building_guid = 25)
      LocalObject(1393, Locker.Constructor(Vector3(3769.874f, 3112.141f, 57.04933f)), owning_building_guid = 25)
      LocalObject(1394, Locker.Constructor(Vector3(3771.023f, 3112.141f, 57.04933f)), owning_building_guid = 25)
      LocalObject(1395, Locker.Constructor(Vector3(3778.194f, 3132.165f, 49.28833f)), owning_building_guid = 25)
      LocalObject(1396, Locker.Constructor(Vector3(3779.518f, 3132.165f, 49.28833f)), owning_building_guid = 25)
      LocalObject(1397, Locker.Constructor(Vector3(3780.854f, 3132.165f, 49.28833f)), owning_building_guid = 25)
      LocalObject(1398, Locker.Constructor(Vector3(3782.191f, 3132.165f, 49.28833f)), owning_building_guid = 25)
      LocalObject(1399, Locker.Constructor(Vector3(3786.731f, 3132.165f, 49.28833f)), owning_building_guid = 25)
      LocalObject(1400, Locker.Constructor(Vector3(3788.055f, 3132.165f, 49.28833f)), owning_building_guid = 25)
      LocalObject(1401, Locker.Constructor(Vector3(3789.391f, 3132.165f, 49.28833f)), owning_building_guid = 25)
      LocalObject(1402, Locker.Constructor(Vector3(3790.728f, 3132.165f, 49.28833f)), owning_building_guid = 25)
      LocalObject(
        1842,
        Terminal.Constructor(Vector3(3710.379f, 3078.907f, 73.14833f), order_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        1843,
        Terminal.Constructor(Vector3(3720.075f, 3094.547f, 80.54333f), order_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        1844,
        Terminal.Constructor(Vector3(3722.331f, 3092.43f, 80.54333f), order_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        1845,
        Terminal.Constructor(Vector3(3722.332f, 3096.825f, 80.54333f), order_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        1846,
        Terminal.Constructor(Vector3(3770.654f, 3117.408f, 58.37833f), order_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        1847,
        Terminal.Constructor(Vector3(3770.654f, 3121.139f, 58.37833f), order_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        1848,
        Terminal.Constructor(Vector3(3770.654f, 3124.928f, 58.37833f), order_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        2598,
        Terminal.Constructor(Vector3(3703.943f, 3110.591f, 50.84533f), spawn_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        2599,
        Terminal.Constructor(Vector3(3718.51f, 3077.969f, 73.40533f), spawn_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        2600,
        Terminal.Constructor(Vector3(3719.409f, 3141.942f, 60.84533f), spawn_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        2601,
        Terminal.Constructor(Vector3(3756.971f, 3113.243f, 58.92233f), spawn_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        2602,
        Terminal.Constructor(Vector3(3756.967f, 3120.535f, 58.92233f), spawn_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        2603,
        Terminal.Constructor(Vector3(3756.97f, 3127.823f, 58.92233f), spawn_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        2811,
        Terminal.Constructor(Vector3(3772.458f, 3156.774f, 69.47533f), vehicle_terminal_combined),
        owning_building_guid = 25
      )
      LocalObject(
        1733,
        VehicleSpawnPad.Constructor(Vector3(3758.833f, 3156.62f, 65.31733f), mb_pad_creation, Vector3(0, 0, -90)),
        owning_building_guid = 25,
        terminal_guid = 2811
      )
      LocalObject(2429, ResourceSilo.Constructor(Vector3(3664.23f, 3032.908f, 73.80534f)), owning_building_guid = 25)
      LocalObject(
        2482,
        SpawnTube.Constructor(Vector3(3756.233f, 3114.683f, 56.78833f), Vector3(0, 0, 0)),
        owning_building_guid = 25
      )
      LocalObject(
        2483,
        SpawnTube.Constructor(Vector3(3756.233f, 3121.974f, 56.78833f), Vector3(0, 0, 0)),
        owning_building_guid = 25
      )
      LocalObject(
        2484,
        SpawnTube.Constructor(Vector3(3756.233f, 3129.262f, 56.78833f), Vector3(0, 0, 0)),
        owning_building_guid = 25
      )
      LocalObject(
        1755,
        ProximityTerminal.Constructor(Vector3(3720.864f, 3073.023f, 66.78833f), medical_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        1756,
        ProximityTerminal.Constructor(Vector3(3784.444f, 3131.62f, 49.28833f), medical_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        2060,
        ProximityTerminal.Constructor(Vector3(3701.154f, 3157.185f, 75.02934f), pad_landing_frame),
        owning_building_guid = 25
      )
      LocalObject(
        2061,
        Terminal.Constructor(Vector3(3701.154f, 3157.185f, 75.02934f), air_rearm_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        2374,
        ProximityTerminal.Constructor(Vector3(3658.912f, 3125.18f, 66.33833f), repair_silo),
        owning_building_guid = 25
      )
      LocalObject(
        2375,
        Terminal.Constructor(Vector3(3658.912f, 3125.18f, 66.33833f), ground_rearm_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        2378,
        ProximityTerminal.Constructor(Vector3(3781.641f, 3077.67f, 66.33833f), repair_silo),
        owning_building_guid = 25
      )
      LocalObject(
        2379,
        Terminal.Constructor(Vector3(3781.641f, 3077.67f, 66.33833f), ground_rearm_terminal),
        owning_building_guid = 25
      )
      LocalObject(
        1668,
        FacilityTurret.Constructor(Vector3(3646.424f, 3140.652f, 75.29633f), manned_turret),
        owning_building_guid = 25
      )
      TurretToWeapon(1668, 5024)
      LocalObject(
        1669,
        FacilityTurret.Constructor(Vector3(3647.554f, 3021.565f, 75.29633f), manned_turret),
        owning_building_guid = 25
      )
      TurretToWeapon(1669, 5025)
      LocalObject(
        1671,
        FacilityTurret.Constructor(Vector3(3689.549f, 3183.75f, 75.29633f), manned_turret),
        owning_building_guid = 25
      )
      TurretToWeapon(1671, 5026)
      LocalObject(
        1672,
        FacilityTurret.Constructor(Vector3(3750.865f, 3020.388f, 75.29633f), manned_turret),
        owning_building_guid = 25
      )
      TurretToWeapon(1672, 5027)
      LocalObject(
        1673,
        FacilityTurret.Constructor(Vector3(3792.841f, 3182.435f, 75.29633f), manned_turret),
        owning_building_guid = 25
      )
      TurretToWeapon(1673, 5028)
      LocalObject(
        1674,
        FacilityTurret.Constructor(Vector3(3794.01f, 3063.501f, 75.29633f), manned_turret),
        owning_building_guid = 25
      )
      TurretToWeapon(1674, 5029)
      LocalObject(
        2172,
        Painbox.Constructor(Vector3(3700.138f, 3138.089f, 54.19033f), painbox),
        owning_building_guid = 25
      )
      LocalObject(
        2185,
        Painbox.Constructor(Vector3(3766.215f, 3128.17f, 61.23313f), painbox_continuous),
        owning_building_guid = 25
      )
      LocalObject(
        2198,
        Painbox.Constructor(Vector3(3700.237f, 3123.073f, 52.04704f), painbox_door_radius),
        owning_building_guid = 25
      )
      LocalObject(
        2225,
        Painbox.Constructor(Vector3(3763.914f, 3108.076f, 58.61433f), painbox_door_radius_continuous),
        owning_building_guid = 25
      )
      LocalObject(
        2226,
        Painbox.Constructor(Vector3(3764.81f, 3135.42f, 58.39603f), painbox_door_radius_continuous),
        owning_building_guid = 25
      )
      LocalObject(
        2227,
        Painbox.Constructor(Vector3(3777.855f, 3129.827f, 59.61433f), painbox_door_radius_continuous),
        owning_building_guid = 25
      )
      LocalObject(288, Generator.Constructor(Vector3(3699.975f, 3141.555f, 47.99433f)), owning_building_guid = 25)
      LocalObject(
        275,
        Terminal.Constructor(Vector3(3700.022f, 3133.363f, 49.28833f), gen_control),
        owning_building_guid = 25
      )
    }

    Building5()

    def Building5(): Unit = { // Name: Andvari Type: comm_station_dsp GUID: 28, MapID: 5
      LocalBuilding(
        "Andvari",
        28,
        5,
        FoundationBuilder(
          Building.Structure(
            StructureType.Facility,
            Vector3(3172f, 7272f, 77.53838f),
            Vector3(0f, 0f, 360f),
            comm_station_dsp
          )
        )
      )
      LocalObject(
        214,
        CaptureTerminal.Constructor(Vector3(3248.089f, 7252.734f, 60.13837f), capture_terminal),
        owning_building_guid = 28
      )
      LocalObject(261, Door.Constructor(Vector3(3240.339f, 7342.464f, 80.91637f)), owning_building_guid = 28)
      LocalObject(397, Door.Constructor(Vector3(3112.196f, 7228.501f, 79.18938f)), owning_building_guid = 28)
      LocalObject(398, Door.Constructor(Vector3(3112.196f, 7246.693f, 87.15337f)), owning_building_guid = 28)
      LocalObject(399, Door.Constructor(Vector3(3129.307f, 7204.197f, 87.15337f)), owning_building_guid = 28)
      LocalObject(401, Door.Constructor(Vector3(3147.499f, 7204.197f, 79.18938f)), owning_building_guid = 28)
      LocalObject(402, Door.Constructor(Vector3(3152f, 7263.231f, 84.15938f)), owning_building_guid = 28)
      LocalObject(403, Door.Constructor(Vector3(3152f, 7272.295f, 84.15938f)), owning_building_guid = 28)
      LocalObject(404, Door.Constructor(Vector3(3164.763f, 7391.958f, 79.18938f)), owning_building_guid = 28)
      LocalObject(405, Door.Constructor(Vector3(3167.625f, 7264.59f, 91.59837f)), owning_building_guid = 28)
      LocalObject(406, Door.Constructor(Vector3(3177.627f, 7404.823f, 87.15237f)), owning_building_guid = 28)
      LocalObject(407, Door.Constructor(Vector3(3180f, 7292f, 84.15938f)), owning_building_guid = 28)
      LocalObject(408, Door.Constructor(Vector3(3219.721f, 7436.353f, 79.18938f)), owning_building_guid = 28)
      LocalObject(410, Door.Constructor(Vector3(3225.952f, 7376.355f, 84.15537f)), owning_building_guid = 28)
      LocalObject(411, Door.Constructor(Vector3(3227.927f, 7346.35f, 79.16138f)), owning_building_guid = 28)
      LocalObject(416, Door.Constructor(Vector3(3237.914f, 7436.353f, 87.15237f)), owning_building_guid = 28)
      LocalObject(417, Door.Constructor(Vector3(3251.929f, 7259.406f, 87.15337f)), owning_building_guid = 28)
      LocalObject(419, Door.Constructor(Vector3(3264.793f, 7272.27f, 79.18938f)), owning_building_guid = 28)
      LocalObject(420, Door.Constructor(Vector3(3278.977f, 7335.008f, 87.15237f)), owning_building_guid = 28)
      LocalObject(421, Door.Constructor(Vector3(3278.977f, 7353.2f, 79.18938f)), owning_building_guid = 28)
      LocalObject(430, Door.Constructor(Vector3(3288f, 7352f, 79.15938f)), owning_building_guid = 28)
      LocalObject(720, Door.Constructor(Vector3(3156f, 7268f, 84.15938f)), owning_building_guid = 28)
      LocalObject(721, Door.Constructor(Vector3(3156f, 7284f, 79.15938f)), owning_building_guid = 28)
      LocalObject(722, Door.Constructor(Vector3(3180f, 7284f, 84.15938f)), owning_building_guid = 28)
      LocalObject(723, Door.Constructor(Vector3(3180f, 7292f, 74.15938f)), owning_building_guid = 28)
      LocalObject(724, Door.Constructor(Vector3(3184f, 7280f, 79.15938f)), owning_building_guid = 28)
      LocalObject(725, Door.Constructor(Vector3(3192f, 7280f, 74.15938f)), owning_building_guid = 28)
      LocalObject(726, Door.Constructor(Vector3(3196f, 7316f, 69.15938f)), owning_building_guid = 28)
      LocalObject(727, Door.Constructor(Vector3(3200f, 7304f, 61.65938f)), owning_building_guid = 28)
      LocalObject(728, Door.Constructor(Vector3(3212f, 7268f, 61.65938f)), owning_building_guid = 28)
      LocalObject(729, Door.Constructor(Vector3(3212f, 7332f, 61.65938f)), owning_building_guid = 28)
      LocalObject(730, Door.Constructor(Vector3(3216f, 7264f, 69.15938f)), owning_building_guid = 28)
      LocalObject(731, Door.Constructor(Vector3(3216f, 7280f, 69.15938f)), owning_building_guid = 28)
      LocalObject(732, Door.Constructor(Vector3(3216f, 7304f, 69.15938f)), owning_building_guid = 28)
      LocalObject(733, Door.Constructor(Vector3(3228f, 7284f, 61.65938f)), owning_building_guid = 28)
      LocalObject(734, Door.Constructor(Vector3(3228f, 7300f, 69.15938f)), owning_building_guid = 28)
      LocalObject(735, Door.Constructor(Vector3(3231.921f, 7366.351f, 84.16138f)), owning_building_guid = 28)
      LocalObject(736, Door.Constructor(Vector3(3244f, 7244f, 61.65938f)), owning_building_guid = 28)
      LocalObject(737, Door.Constructor(Vector3(3252f, 7244f, 61.65938f)), owning_building_guid = 28)
      LocalObject(738, Door.Constructor(Vector3(3256f, 7256f, 61.65938f)), owning_building_guid = 28)
      LocalObject(739, Door.Constructor(Vector3(3260f, 7276f, 69.15938f)), owning_building_guid = 28)
      LocalObject(740, Door.Constructor(Vector3(3260f, 7308f, 69.15938f)), owning_building_guid = 28)
      LocalObject(894, Door.Constructor(Vector3(3189.707f, 7267.922f, 79.93037f)), owning_building_guid = 28)
      LocalObject(2666, Door.Constructor(Vector3(3208.673f, 7285.733f, 69.49238f)), owning_building_guid = 28)
      LocalObject(2667, Door.Constructor(Vector3(3208.673f, 7293.026f, 69.49238f)), owning_building_guid = 28)
      LocalObject(2668, Door.Constructor(Vector3(3208.673f, 7300.315f, 69.49238f)), owning_building_guid = 28)
      LocalObject(
        938,
        IFFLock.Constructor(Vector3(3192.454f, 7271.09f, 79.10638f), Vector3(0, 0, 90)),
        owning_building_guid = 28,
        door_guid = 894
      )
      LocalObject(
        1028,
        IFFLock.Constructor(Vector3(3149.959f, 7273.104f, 84.10638f), Vector3(0, 0, 0)),
        owning_building_guid = 28,
        door_guid = 403
      )
      LocalObject(
        1029,
        IFFLock.Constructor(Vector3(3154.04f, 7262.42f, 84.10638f), Vector3(0, 0, 180)),
        owning_building_guid = 28,
        door_guid = 402
      )
      LocalObject(
        1030,
        IFFLock.Constructor(Vector3(3166.817f, 7262.514f, 91.60638f), Vector3(0, 0, 270)),
        owning_building_guid = 28,
        door_guid = 405
      )
      LocalObject(
        1031,
        IFFLock.Constructor(Vector3(3179.193f, 7289.962f, 84.10638f), Vector3(0, 0, 270)),
        owning_building_guid = 28,
        door_guid = 407
      )
      LocalObject(
        1032,
        IFFLock.Constructor(Vector3(3212.94f, 7333.572f, 61.47438f), Vector3(0, 0, 90)),
        owning_building_guid = 28,
        door_guid = 729
      )
      LocalObject(
        1033,
        IFFLock.Constructor(Vector3(3214.428f, 7304.94f, 68.97437f), Vector3(0, 0, 0)),
        owning_building_guid = 28,
        door_guid = 732
      )
      LocalObject(
        1034,
        IFFLock.Constructor(Vector3(3217.572f, 7279.19f, 68.97437f), Vector3(0, 0, 180)),
        owning_building_guid = 28,
        door_guid = 731
      )
      LocalObject(
        1035,
        IFFLock.Constructor(Vector3(3223.907f, 7377.163f, 84.08537f), Vector3(0, 0, 0)),
        owning_building_guid = 28,
        door_guid = 410
      )
      LocalObject(
        1036,
        IFFLock.Constructor(Vector3(3227.06f, 7282.428f, 61.47438f), Vector3(0, 0, 270)),
        owning_building_guid = 28,
        door_guid = 733
      )
      LocalObject(
        1037,
        IFFLock.Constructor(Vector3(3227.124f, 7344.312f, 79.15038f), Vector3(0, 0, 270)),
        owning_building_guid = 28,
        door_guid = 411
      )
      LocalObject(
        1042,
        IFFLock.Constructor(Vector3(3243.06f, 7242.428f, 61.47438f), Vector3(0, 0, 270)),
        owning_building_guid = 28,
        door_guid = 736
      )
      LocalObject(
        1044,
        IFFLock.Constructor(Vector3(3252.813f, 7245.572f, 61.47438f), Vector3(0, 0, 90)),
        owning_building_guid = 28,
        door_guid = 737
      )
      LocalObject(
        1051,
        IFFLock.Constructor(Vector3(3285.953f, 7352.808f, 79.04938f), Vector3(0, 0, 0)),
        owning_building_guid = 28,
        door_guid = 430
      )
      LocalObject(1319, Locker.Constructor(Vector3(3219.563f, 7282.141f, 67.89938f)), owning_building_guid = 28)
      LocalObject(1320, Locker.Constructor(Vector3(3220.727f, 7282.141f, 67.89938f)), owning_building_guid = 28)
      LocalObject(1321, Locker.Constructor(Vector3(3221.874f, 7282.141f, 67.89938f)), owning_building_guid = 28)
      LocalObject(1322, Locker.Constructor(Vector3(3223.023f, 7282.141f, 67.89938f)), owning_building_guid = 28)
      LocalObject(1323, Locker.Constructor(Vector3(3230.194f, 7302.165f, 60.13837f)), owning_building_guid = 28)
      LocalObject(1324, Locker.Constructor(Vector3(3231.518f, 7302.165f, 60.13837f)), owning_building_guid = 28)
      LocalObject(1325, Locker.Constructor(Vector3(3232.854f, 7302.165f, 60.13837f)), owning_building_guid = 28)
      LocalObject(1326, Locker.Constructor(Vector3(3234.191f, 7302.165f, 60.13837f)), owning_building_guid = 28)
      LocalObject(1329, Locker.Constructor(Vector3(3238.731f, 7302.165f, 60.13837f)), owning_building_guid = 28)
      LocalObject(1332, Locker.Constructor(Vector3(3240.055f, 7302.165f, 60.13837f)), owning_building_guid = 28)
      LocalObject(1333, Locker.Constructor(Vector3(3241.391f, 7302.165f, 60.13837f)), owning_building_guid = 28)
      LocalObject(1336, Locker.Constructor(Vector3(3242.728f, 7302.165f, 60.13837f)), owning_building_guid = 28)
      LocalObject(
        263,
        Terminal.Constructor(Vector3(3231.879f, 7374.918f, 83.24238f), dropship_vehicle_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        262,
        VehicleSpawnPad.Constructor(Vector3(3240.328f, 7396.856f, 77.56638f), dropship_pad_doors, Vector3(0, 0, 90)),
        owning_building_guid = 28,
        terminal_guid = 263
      )
      LocalObject(
        1812,
        Terminal.Constructor(Vector3(3162.378f, 7248.897f, 83.99837f), order_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1813,
        Terminal.Constructor(Vector3(3172.075f, 7264.547f, 91.39337f), order_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1814,
        Terminal.Constructor(Vector3(3174.331f, 7262.43f, 91.39337f), order_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1815,
        Terminal.Constructor(Vector3(3174.332f, 7266.825f, 91.39337f), order_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1816,
        Terminal.Constructor(Vector3(3176.592f, 7264.59f, 91.39337f), order_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1817,
        Terminal.Constructor(Vector3(3222.654f, 7287.408f, 69.22838f), order_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1818,
        Terminal.Constructor(Vector3(3222.654f, 7291.139f, 69.22838f), order_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1819,
        Terminal.Constructor(Vector3(3222.654f, 7294.928f, 69.22838f), order_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        2582,
        Terminal.Constructor(Vector3(3170.509f, 7247.959f, 84.25538f), spawn_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        2583,
        Terminal.Constructor(Vector3(3208.971f, 7283.243f, 69.77238f), spawn_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        2584,
        Terminal.Constructor(Vector3(3208.967f, 7290.535f, 69.77238f), spawn_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        2585,
        Terminal.Constructor(Vector3(3208.97f, 7297.823f, 69.77238f), spawn_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        2586,
        Terminal.Constructor(Vector3(3227.103f, 7366.906f, 84.18638f), spawn_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        2587,
        Terminal.Constructor(Vector3(3236.058f, 7271.409f, 61.66637f), spawn_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        2588,
        Terminal.Constructor(Vector3(3243.409f, 7327.942f, 61.66637f), spawn_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        2589,
        Terminal.Constructor(Vector3(3252.058f, 7279.409f, 69.19537f), spawn_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        2590,
        Terminal.Constructor(Vector3(3252.058f, 7319.409f, 69.19537f), spawn_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        2809,
        Terminal.Constructor(Vector3(3189.698f, 7380.044f, 80.32538f), ground_vehicle_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1729,
        VehicleSpawnPad.Constructor(Vector3(3189.786f, 7366.411f, 76.16737f), mb_pad_creation, Vector3(0, 0, 180)),
        owning_building_guid = 28,
        terminal_guid = 2809
      )
      LocalObject(2427, ResourceSilo.Constructor(Vector3(3270.212f, 7437.642f, 84.65537f)), owning_building_guid = 28)
      LocalObject(
        2464,
        SpawnTube.Constructor(Vector3(3208.233f, 7284.683f, 67.63837f), Vector3(0, 0, 0)),
        owning_building_guid = 28
      )
      LocalObject(
        2465,
        SpawnTube.Constructor(Vector3(3208.233f, 7291.974f, 67.63837f), Vector3(0, 0, 0)),
        owning_building_guid = 28
      )
      LocalObject(
        2466,
        SpawnTube.Constructor(Vector3(3208.233f, 7299.262f, 67.63837f), Vector3(0, 0, 0)),
        owning_building_guid = 28
      )
      LocalObject(
        1751,
        ProximityTerminal.Constructor(Vector3(3172.863f, 7243.013f, 77.63837f), medical_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1752,
        ProximityTerminal.Constructor(Vector3(3236.444f, 7301.62f, 60.13837f), medical_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        2030,
        ProximityTerminal.Constructor(Vector3(3153.153f, 7365.398f, 85.94838f), pad_landing_frame),
        owning_building_guid = 28
      )
      LocalObject(
        2031,
        Terminal.Constructor(Vector3(3153.153f, 7365.398f, 85.94838f), air_rearm_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        2033,
        ProximityTerminal.Constructor(Vector3(3169.514f, 7319.467f, 83.23238f), pad_landing_frame),
        owning_building_guid = 28
      )
      LocalObject(
        2034,
        Terminal.Constructor(Vector3(3169.514f, 7319.467f, 83.23238f), air_rearm_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        2036,
        ProximityTerminal.Constructor(Vector3(3221.804f, 7283.901f, 90.41438f), pad_landing_frame),
        owning_building_guid = 28
      )
      LocalObject(
        2037,
        Terminal.Constructor(Vector3(3221.804f, 7283.901f, 90.41438f), air_rearm_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        2039,
        ProximityTerminal.Constructor(Vector3(3257.071f, 7300.159f, 85.96138f), pad_landing_frame),
        owning_building_guid = 28
      )
      LocalObject(
        2040,
        Terminal.Constructor(Vector3(3257.071f, 7300.159f, 85.96138f), air_rearm_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        2358,
        ProximityTerminal.Constructor(Vector3(3110.642f, 7310.241f, 77.28838f), repair_silo),
        owning_building_guid = 28
      )
      LocalObject(
        2359,
        Terminal.Constructor(Vector3(3110.642f, 7310.241f, 77.28838f), ground_rearm_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        2362,
        ProximityTerminal.Constructor(Vector3(3280.57f, 7313.151f, 77.28838f), repair_silo),
        owning_building_guid = 28
      )
      LocalObject(
        2363,
        Terminal.Constructor(Vector3(3280.57f, 7313.151f, 77.28838f), ground_rearm_terminal),
        owning_building_guid = 28
      )
      LocalObject(
        1643,
        FacilityTurret.Constructor(Vector3(3098.401f, 7345.113f, 86.14638f), manned_turret),
        owning_building_guid = 28
      )
      TurretToWeapon(1643, 5030)
      LocalObject(
        1644,
        FacilityTurret.Constructor(Vector3(3099.554f, 7191.565f, 86.14638f), manned_turret),
        owning_building_guid = 28
      )
      TurretToWeapon(1644, 5031)
      LocalObject(
        1645,
        FacilityTurret.Constructor(Vector3(3143.445f, 7391.667f, 86.14638f), manned_turret),
        owning_building_guid = 28
      )
      TurretToWeapon(1645, 5032)
      LocalObject(
        1646,
        FacilityTurret.Constructor(Vector3(3202.428f, 7190.396f, 86.14638f), manned_turret),
        owning_building_guid = 28
      )
      TurretToWeapon(1646, 5033)
      LocalObject(
        1647,
        FacilityTurret.Constructor(Vector3(3203.449f, 7450.154f, 86.14638f), manned_turret),
        owning_building_guid = 28
      )
      TurretToWeapon(1647, 5034)
      LocalObject(
        1649,
        FacilityTurret.Constructor(Vector3(3244.537f, 7231.011f, 86.14638f), manned_turret),
        owning_building_guid = 28
      )
      TurretToWeapon(1649, 5035)
      LocalObject(
        1654,
        FacilityTurret.Constructor(Vector3(3291.619f, 7448.985f, 86.14638f), manned_turret),
        owning_building_guid = 28
      )
      TurretToWeapon(1654, 5036)
      LocalObject(
        1655,
        FacilityTurret.Constructor(Vector3(3292.773f, 7280.733f, 86.14638f), manned_turret),
        owning_building_guid = 28
      )
      TurretToWeapon(1655, 5037)
      LocalObject(
        2170,
        Painbox.Constructor(Vector3(3200.428f, 7332.057f, 64.03268f), painbox),
        owning_building_guid = 28
      )
      LocalObject(
        2183,
        Painbox.Constructor(Vector3(3217.857f, 7292.408f, 71.66588f), painbox_continuous),
        owning_building_guid = 28
      )
      LocalObject(
        2196,
        Painbox.Constructor(Vector3(3214.203f, 7330.915f, 63.27058f), painbox_door_radius),
        owning_building_guid = 28
      )
      LocalObject(
        2219,
        Painbox.Constructor(Vector3(3215.087f, 7277.386f, 70.06757f), painbox_door_radius_continuous),
        owning_building_guid = 28
      )
      LocalObject(
        2220,
        Painbox.Constructor(Vector3(3215.895f, 7306.081f, 70.53838f), painbox_door_radius_continuous),
        owning_building_guid = 28
      )
      LocalObject(
        2221,
        Painbox.Constructor(Vector3(3230.317f, 7299.888f, 70.96867f), painbox_door_radius_continuous),
        owning_building_guid = 28
      )
      LocalObject(286, Generator.Constructor(Vector3(3196.445f, 7331.975f, 58.84438f)), owning_building_guid = 28)
      LocalObject(
        273,
        Terminal.Constructor(Vector3(3204.637f, 7332.022f, 60.13837f), gen_control),
        owning_building_guid = 28
      )
    }

    Building15()

    def Building15(): Unit = { // Name: ymir Type: cryo_facility GUID: 31, MapID: 15
      LocalBuilding(
        "ymir",
        31,
        15,
        FoundationBuilder(
          Building.Structure(
            StructureType.Facility,
            Vector3(1860f, 3946f, 69.04202f),
            Vector3(0f, 0f, 360f),
            cryo_facility
          )
        )
      )
      LocalObject(
        210,
        CaptureTerminal.Constructor(Vector3(1831.911f, 4005.266f, 59.04202f), capture_terminal),
        owning_building_guid = 31
      )
      LocalObject(325, Door.Constructor(Vector3(1801.023f, 3950.5f, 70.59303f)), owning_building_guid = 31)
      LocalObject(326, Door.Constructor(Vector3(1801.023f, 3968.693f, 78.55702f)), owning_building_guid = 31)
      LocalObject(327, Door.Constructor(Vector3(1817.674f, 4013.803f, 70.59303f)), owning_building_guid = 31)
      LocalObject(332, Door.Constructor(Vector3(1835.867f, 4013.803f, 78.55702f)), owning_building_guid = 31)
      LocalObject(333, Door.Constructor(Vector3(1844f, 3966f, 80.56302f)), owning_building_guid = 31)
      LocalObject(334, Door.Constructor(Vector3(1864f, 3949.137f, 80.56302f)), owning_building_guid = 31)
      LocalObject(335, Door.Constructor(Vector3(1865.307f, 3863.073f, 78.55702f)), owning_building_guid = 31)
      LocalObject(336, Door.Constructor(Vector3(1883.5f, 3863.073f, 70.59303f)), owning_building_guid = 31)
      LocalObject(337, Door.Constructor(Vector3(1892f, 3854f, 70.56303f)), owning_building_guid = 31)
      LocalObject(338, Door.Constructor(Vector3(1910.927f, 3895.307f, 78.55702f)), owning_building_guid = 31)
      LocalObject(339, Door.Constructor(Vector3(1910.927f, 3913.5f, 70.59303f)), owning_building_guid = 31)
      LocalObject(628, Door.Constructor(Vector3(1812f, 3934f, 60.56302f)), owning_building_guid = 31)
      LocalObject(629, Door.Constructor(Vector3(1820f, 3886f, 63.06302f)), owning_building_guid = 31)
      LocalObject(630, Door.Constructor(Vector3(1824f, 3946f, 60.56302f)), owning_building_guid = 31)
      LocalObject(631, Door.Constructor(Vector3(1824f, 3986f, 60.56302f)), owning_building_guid = 31)
      LocalObject(632, Door.Constructor(Vector3(1828f, 3966f, 60.56302f)), owning_building_guid = 31)
      LocalObject(633, Door.Constructor(Vector3(1828f, 4014f, 60.56302f)), owning_building_guid = 31)
      LocalObject(634, Door.Constructor(Vector3(1836f, 4014f, 60.56302f)), owning_building_guid = 31)
      LocalObject(635, Door.Constructor(Vector3(1840f, 3890f, 63.06302f)), owning_building_guid = 31)
      LocalObject(636, Door.Constructor(Vector3(1840f, 3914f, 60.56302f)), owning_building_guid = 31)
      LocalObject(637, Door.Constructor(Vector3(1844f, 3966f, 60.56302f)), owning_building_guid = 31)
      LocalObject(638, Door.Constructor(Vector3(1844f, 3966f, 70.56303f)), owning_building_guid = 31)
      LocalObject(639, Door.Constructor(Vector3(1844f, 4014f, 60.56302f)), owning_building_guid = 31)
      LocalObject(640, Door.Constructor(Vector3(1848f, 3858f, 63.06302f)), owning_building_guid = 31)
      LocalObject(641, Door.Constructor(Vector3(1848f, 3946f, 60.56302f)), owning_building_guid = 31)
      LocalObject(642, Door.Constructor(Vector3(1848f, 3986f, 60.56302f)), owning_building_guid = 31)
      LocalObject(643, Door.Constructor(Vector3(1860f, 3918f, 60.56302f)), owning_building_guid = 31)
      LocalObject(644, Door.Constructor(Vector3(1860f, 3942f, 60.56302f)), owning_building_guid = 31)
      LocalObject(645, Door.Constructor(Vector3(1860f, 3998f, 60.56302f)), owning_building_guid = 31)
      LocalObject(646, Door.Constructor(Vector3(1864f, 3938f, 80.56302f)), owning_building_guid = 31)
      LocalObject(647, Door.Constructor(Vector3(1872f, 3946f, 60.56302f)), owning_building_guid = 31)
      LocalObject(648, Door.Constructor(Vector3(1872f, 3970f, 60.56302f)), owning_building_guid = 31)
      LocalObject(649, Door.Constructor(Vector3(1884f, 3950f, 53.06302f)), owning_building_guid = 31)
      LocalObject(650, Door.Constructor(Vector3(1884f, 3966f, 60.56302f)), owning_building_guid = 31)
      LocalObject(890, Door.Constructor(Vector3(1863.992f, 3971.083f, 71.32502f)), owning_building_guid = 31)
      LocalObject(902, Door.Constructor(Vector3(1856f, 3954f, 70.56102f)), owning_building_guid = 31)
      LocalObject(903, Door.Constructor(Vector3(1872f, 3946f, 70.56303f)), owning_building_guid = 31)
      LocalObject(2648, Door.Constructor(Vector3(1864.673f, 3951.733f, 60.89602f)), owning_building_guid = 31)
      LocalObject(2649, Door.Constructor(Vector3(1864.673f, 3959.026f, 60.89602f)), owning_building_guid = 31)
      LocalObject(2650, Door.Constructor(Vector3(1864.673f, 3966.315f, 60.89602f)), owning_building_guid = 31)
      LocalObject(
        934,
        IFFLock.Constructor(Vector3(1860.77f, 3973.822f, 70.52402f), Vector3(0, 0, 0)),
        owning_building_guid = 31,
        door_guid = 890
      )
      LocalObject(
        978,
        IFFLock.Constructor(Vector3(1827.06f, 4012.428f, 60.37802f), Vector3(0, 0, 270)),
        owning_building_guid = 31,
        door_guid = 633
      )
      LocalObject(
        979,
        IFFLock.Constructor(Vector3(1836.813f, 4015.572f, 60.37802f), Vector3(0, 0, 90)),
        owning_building_guid = 31,
        door_guid = 634
      )
      LocalObject(
        980,
        IFFLock.Constructor(Vector3(1844.814f, 3968.043f, 80.49402f), Vector3(0, 0, 90)),
        owning_building_guid = 31,
        door_guid = 333
      )
      LocalObject(
        981,
        IFFLock.Constructor(Vector3(1861.954f, 3949.958f, 80.49402f), Vector3(0, 0, 0)),
        owning_building_guid = 31,
        door_guid = 334
      )
      LocalObject(
        982,
        IFFLock.Constructor(Vector3(1870.428f, 3970.81f, 60.37802f), Vector3(0, 0, 0)),
        owning_building_guid = 31,
        door_guid = 648
      )
      LocalObject(
        983,
        IFFLock.Constructor(Vector3(1873.572f, 3945.19f, 60.37802f), Vector3(0, 0, 180)),
        owning_building_guid = 31,
        door_guid = 647
      )
      LocalObject(
        984,
        IFFLock.Constructor(Vector3(1883.19f, 3948.428f, 52.87802f), Vector3(0, 0, 270)),
        owning_building_guid = 31,
        door_guid = 649
      )
      LocalObject(
        985,
        IFFLock.Constructor(Vector3(1892.814f, 3856.042f, 70.49403f), Vector3(0, 0, 90)),
        owning_building_guid = 31,
        door_guid = 337
      )
      LocalObject(1229, Locker.Constructor(Vector3(1875.563f, 3948.141f, 59.30302f)), owning_building_guid = 31)
      LocalObject(1230, Locker.Constructor(Vector3(1876.727f, 3948.141f, 59.30302f)), owning_building_guid = 31)
      LocalObject(1231, Locker.Constructor(Vector3(1877.874f, 3948.141f, 59.30302f)), owning_building_guid = 31)
      LocalObject(1232, Locker.Constructor(Vector3(1879.023f, 3948.141f, 59.30302f)), owning_building_guid = 31)
      LocalObject(1233, Locker.Constructor(Vector3(1879.997f, 3995.496f, 59.03702f)), owning_building_guid = 31)
      LocalObject(1234, Locker.Constructor(Vector3(1879.997f, 3996.752f, 59.03702f)), owning_building_guid = 31)
      LocalObject(1235, Locker.Constructor(Vector3(1879.997f, 3998.013f, 59.03702f)), owning_building_guid = 31)
      LocalObject(1236, Locker.Constructor(Vector3(1879.997f, 3999.275f, 59.03702f)), owning_building_guid = 31)
      LocalObject(1237, Locker.Constructor(Vector3(1879.997f, 4000.527f, 59.03702f)), owning_building_guid = 31)
      LocalObject(1238, Locker.Constructor(Vector3(1892.817f, 3948.36f, 58.95002f)), owning_building_guid = 31)
      LocalObject(1239, Locker.Constructor(Vector3(1892.814f, 3968.361f, 58.95002f)), owning_building_guid = 31)
      LocalObject(1240, Locker.Constructor(Vector3(1893.873f, 3948.36f, 58.95002f)), owning_building_guid = 31)
      LocalObject(1241, Locker.Constructor(Vector3(1893.868f, 3968.361f, 58.95002f)), owning_building_guid = 31)
      LocalObject(1242, Locker.Constructor(Vector3(1894.928f, 3948.36f, 58.95002f)), owning_building_guid = 31)
      LocalObject(1243, Locker.Constructor(Vector3(1894.929f, 3968.361f, 58.95002f)), owning_building_guid = 31)
      LocalObject(1244, Locker.Constructor(Vector3(1895.983f, 3948.36f, 58.95002f)), owning_building_guid = 31)
      LocalObject(1245, Locker.Constructor(Vector3(1895.984f, 3968.361f, 58.95002f)), owning_building_guid = 31)
      LocalObject(1246, Locker.Constructor(Vector3(1897.043f, 3948.36f, 58.95002f)), owning_building_guid = 31)
      LocalObject(1247, Locker.Constructor(Vector3(1897.039f, 3968.361f, 58.95002f)), owning_building_guid = 31)
      LocalObject(1248, Locker.Constructor(Vector3(1898.098f, 3948.36f, 58.95002f)), owning_building_guid = 31)
      LocalObject(1249, Locker.Constructor(Vector3(1898.095f, 3968.361f, 58.95002f)), owning_building_guid = 31)
      LocalObject(1568, Locker.Constructor(Vector3(1878.26f, 3933.787f, 69.04202f)), owning_building_guid = 31)
      LocalObject(1569, Locker.Constructor(Vector3(1878.26f, 3934.821f, 69.04202f)), owning_building_guid = 31)
      LocalObject(1570, Locker.Constructor(Vector3(1878.26f, 3937.338f, 68.81303f)), owning_building_guid = 31)
      LocalObject(1571, Locker.Constructor(Vector3(1878.26f, 3938.372f, 68.81303f)), owning_building_guid = 31)
      LocalObject(1572, Locker.Constructor(Vector3(1878.26f, 3939.426f, 68.81303f)), owning_building_guid = 31)
      LocalObject(1573, Locker.Constructor(Vector3(1878.26f, 3940.46f, 68.81303f)), owning_building_guid = 31)
      LocalObject(1574, Locker.Constructor(Vector3(1878.26f, 3942.982f, 69.04202f)), owning_building_guid = 31)
      LocalObject(1575, Locker.Constructor(Vector3(1878.26f, 3944.016f, 69.04202f)), owning_building_guid = 31)
      LocalObject(
        222,
        Terminal.Constructor(Vector3(1862.276f, 3994.25f, 59.03202f), cert_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        223,
        Terminal.Constructor(Vector3(1862.276f, 4001.575f, 59.03202f), cert_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        224,
        Terminal.Constructor(Vector3(1863.724f, 3992.802f, 59.03202f), cert_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        225,
        Terminal.Constructor(Vector3(1863.724f, 4003.023f, 59.03202f), cert_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        226,
        Terminal.Constructor(Vector3(1876.424f, 3992.802f, 59.03202f), cert_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        227,
        Terminal.Constructor(Vector3(1876.424f, 4003.023f, 59.03202f), cert_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        228,
        Terminal.Constructor(Vector3(1877.872f, 3994.25f, 59.03202f), cert_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        229,
        Terminal.Constructor(Vector3(1877.872f, 4001.575f, 59.03202f), cert_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        1782,
        Terminal.Constructor(Vector3(1849.972f, 3955.526f, 70.33702f), order_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        1783,
        Terminal.Constructor(Vector3(1878.654f, 3953.408f, 60.63202f), order_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        1784,
        Terminal.Constructor(Vector3(1878.654f, 3957.139f, 60.63202f), order_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        1785,
        Terminal.Constructor(Vector3(1878.654f, 3960.928f, 60.63202f), order_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        2556,
        Terminal.Constructor(Vector3(1820f, 3945.407f, 60.65502f), spawn_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        2557,
        Terminal.Constructor(Vector3(1843.91f, 3889.41f, 63.15502f), spawn_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        2558,
        Terminal.Constructor(Vector3(1859.407f, 4010f, 60.65502f), spawn_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        2559,
        Terminal.Constructor(Vector3(1861.905f, 3932.359f, 70.62103f), spawn_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        2560,
        Terminal.Constructor(Vector3(1864.971f, 3949.243f, 61.17602f), spawn_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        2561,
        Terminal.Constructor(Vector3(1864.967f, 3956.535f, 61.17602f), spawn_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        2562,
        Terminal.Constructor(Vector3(1864.97f, 3963.823f, 61.17602f), spawn_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        2805,
        Terminal.Constructor(Vector3(1897.628f, 3882.814f, 71.34702f), vehicle_terminal_combined),
        owning_building_guid = 31
      )
      LocalObject(
        1725,
        VehicleSpawnPad.Constructor(Vector3(1883.989f, 3882.724f, 67.18903f), mb_pad_creation, Vector3(0, 0, -90)),
        owning_building_guid = 31,
        terminal_guid = 2805
      )
      LocalObject(2423, ResourceSilo.Constructor(Vector3(1799.733f, 3996.852f, 76.05902f)), owning_building_guid = 31)
      LocalObject(
        2446,
        SpawnTube.Constructor(Vector3(1864.233f, 3950.683f, 59.04202f), Vector3(0, 0, 0)),
        owning_building_guid = 31
      )
      LocalObject(
        2447,
        SpawnTube.Constructor(Vector3(1864.233f, 3957.974f, 59.04202f), Vector3(0, 0, 0)),
        owning_building_guid = 31
      )
      LocalObject(
        2448,
        SpawnTube.Constructor(Vector3(1864.233f, 3965.262f, 59.04202f), Vector3(0, 0, 0)),
        owning_building_guid = 31
      )
      LocalObject(
        153,
        ProximityTerminal.Constructor(Vector3(1861.983f, 3938.892f, 68.85202f), adv_med_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        1745,
        ProximityTerminal.Constructor(Vector3(1887.642f, 3949.952f, 59.04202f), medical_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        1991,
        ProximityTerminal.Constructor(Vector3(1841.883f, 3884.061f, 79.33502f), pad_landing_frame),
        owning_building_guid = 31
      )
      LocalObject(
        1992,
        Terminal.Constructor(Vector3(1841.883f, 3884.061f, 79.33502f), air_rearm_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        1994,
        ProximityTerminal.Constructor(Vector3(1845.101f, 3999.651f, 77.38403f), pad_landing_frame),
        owning_building_guid = 31
      )
      LocalObject(
        1995,
        Terminal.Constructor(Vector3(1845.101f, 3999.651f, 77.38403f), air_rearm_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        1997,
        ProximityTerminal.Constructor(Vector3(1858.198f, 3876.777f, 77.39402f), pad_landing_frame),
        owning_building_guid = 31
      )
      LocalObject(
        1998,
        Terminal.Constructor(Vector3(1858.198f, 3876.777f, 77.39402f), air_rearm_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        2000,
        ProximityTerminal.Constructor(Vector3(1861.323f, 3991.253f, 79.37402f), pad_landing_frame),
        owning_building_guid = 31
      )
      LocalObject(
        2001,
        Terminal.Constructor(Vector3(1861.323f, 3991.253f, 79.37402f), air_rearm_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        2326,
        ProximityTerminal.Constructor(Vector3(1824.525f, 3861.154f, 68.79202f), repair_silo),
        owning_building_guid = 31
      )
      LocalObject(
        2327,
        Terminal.Constructor(Vector3(1824.525f, 3861.154f, 68.79202f), ground_rearm_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        2330,
        ProximityTerminal.Constructor(Vector3(1912.53f, 3961.861f, 68.79202f), repair_silo),
        owning_building_guid = 31
      )
      LocalObject(
        2331,
        Terminal.Constructor(Vector3(1912.53f, 3961.861f, 68.79202f), ground_rearm_terminal),
        owning_building_guid = 31
      )
      LocalObject(
        1613,
        FacilityTurret.Constructor(Vector3(1788.392f, 4026.472f, 77.44402f), manned_turret),
        owning_building_guid = 31
      )
      TurretToWeapon(1613, 5038)
      LocalObject(
        1614,
        FacilityTurret.Constructor(Vector3(1788.4f, 3849.379f, 77.44402f), manned_turret),
        owning_building_guid = 31
      )
      TurretToWeapon(1614, 5039)
      LocalObject(
        1617,
        FacilityTurret.Constructor(Vector3(1881.665f, 4027.605f, 77.44402f), manned_turret),
        owning_building_guid = 31
      )
      TurretToWeapon(1617, 5040)
      LocalObject(
        1619,
        FacilityTurret.Constructor(Vector3(1923.626f, 3849.371f, 77.44402f), manned_turret),
        owning_building_guid = 31
      )
      TurretToWeapon(1619, 5041)
      LocalObject(
        1620,
        FacilityTurret.Constructor(Vector3(1924.813f, 3984.496f, 77.44402f), manned_turret),
        owning_building_guid = 31
      )
      TurretToWeapon(1620, 5042)
      LocalObject(
        914,
        ImplantTerminalMech.Constructor(Vector3(1870.066f, 3990.368f, 58.51902f)),
        owning_building_guid = 31
      )
      LocalObject(
        908,
        Terminal.Constructor(Vector3(1870.066f, 3990.386f, 58.51902f), implant_terminal_interface),
        owning_building_guid = 31
      )
      TerminalToInterface(914, 908)
      LocalObject(
        915,
        ImplantTerminalMech.Constructor(Vector3(1870.054f, 4005.724f, 58.51902f)),
        owning_building_guid = 31
      )
      LocalObject(
        909,
        Terminal.Constructor(Vector3(1870.054f, 4005.706f, 58.51902f), implant_terminal_interface),
        owning_building_guid = 31
      )
      TerminalToInterface(915, 909)
      LocalObject(
        2166,
        Painbox.Constructor(Vector3(1865.593f, 3926.334f, 83.07082f), painbox),
        owning_building_guid = 31
      )
      LocalObject(
        2179,
        Painbox.Constructor(Vector3(1874.753f, 3953.712f, 63.11192f), painbox_continuous),
        owning_building_guid = 31
      )
      LocalObject(
        2192,
        Painbox.Constructor(Vector3(1864.182f, 3940.798f, 83.27592f), painbox_door_radius),
        owning_building_guid = 31
      )
      LocalObject(
        2207,
        Painbox.Constructor(Vector3(1870.54f, 3943.793f, 61.39792f), painbox_door_radius_continuous),
        owning_building_guid = 31
      )
      LocalObject(
        2208,
        Painbox.Constructor(Vector3(1872.516f, 3971.831f, 60.75622f), painbox_door_radius_continuous),
        owning_building_guid = 31
      )
      LocalObject(
        2209,
        Painbox.Constructor(Vector3(1887.882f, 3965.05f, 62.58292f), painbox_door_radius_continuous),
        owning_building_guid = 31
      )
      LocalObject(282, Generator.Constructor(Vector3(1864.025f, 3922.445f, 77.74802f)), owning_building_guid = 31)
      LocalObject(
        269,
        Terminal.Constructor(Vector3(1863.978f, 3930.637f, 79.04202f), gen_control),
        owning_building_guid = 31
      )
    }

    Building17()

    def Building17(): Unit = { // Name: Ran Type: cryo_facility GUID: 34, MapID: 17
      LocalBuilding(
        "Ran",
        34,
        17,
        FoundationBuilder(
          Building.Structure(
            StructureType.Facility,
            Vector3(2342f, 1992f, 85.51286f),
            Vector3(0f, 0f, 246f),
            cryo_facility
          )
        )
      )
      LocalObject(
        212,
        CaptureTerminal.Constructor(Vector3(2407.567f, 1993.555f, 75.51286f), capture_terminal),
        owning_building_guid = 34
      )
      LocalObject(358, Door.Constructor(Vector3(2244.938f, 2000.186f, 87.03387f)), owning_building_guid = 34)
      LocalObject(359, Door.Constructor(Vector3(2256.684f, 2004.261f, 87.06387f)), owning_building_guid = 34)
      LocalObject(360, Door.Constructor(Vector3(2264.084f, 2020.881f, 95.02786f)), owning_building_guid = 34)
      LocalObject(361, Door.Constructor(Vector3(2274.976f, 1966.095f, 95.02786f)), owning_building_guid = 34)
      LocalObject(362, Door.Constructor(Vector3(2291.596f, 1958.695f, 87.06387f)), owning_building_guid = 34)
      LocalObject(372, Door.Constructor(Vector3(2343.239f, 1987.07f, 97.03386f)), owning_building_guid = 34)
      LocalObject(374, Door.Constructor(Vector3(2366.779f, 1998.482f, 97.03386f)), owning_building_guid = 34)
      LocalObject(375, Door.Constructor(Vector3(2370.099f, 2044.048f, 87.06387f)), owning_building_guid = 34)
      LocalObject(376, Door.Constructor(Vector3(2386.719f, 2036.648f, 95.02786f)), owning_building_guid = 34)
      LocalObject(377, Door.Constructor(Vector3(2413.757f, 1986.469f, 95.02786f)), owning_building_guid = 34)
      LocalObject(378, Door.Constructor(Vector3(2421.157f, 2003.089f, 87.06387f)), owning_building_guid = 34)
      LocalObject(675, Door.Constructor(Vector3(2266.489f, 2038.755f, 79.53386f)), owning_building_guid = 34)
      LocalObject(676, Door.Constructor(Vector3(2298.976f, 2033.048f, 79.53386f)), owning_building_guid = 34)
      LocalObject(677, Door.Constructor(Vector3(2303.457f, 2052.946f, 79.53386f)), owning_building_guid = 34)
      LocalObject(678, Door.Constructor(Vector3(2316.421f, 2003.389f, 77.03386f)), owning_building_guid = 34)
      LocalObject(679, Door.Constructor(Vector3(2320.901f, 2023.286f, 77.03386f)), owning_building_guid = 34)
      LocalObject(680, Door.Constructor(Vector3(2333.065f, 1991.6f, 97.03386f)), owning_building_guid = 34)
      LocalObject(681, Door.Constructor(Vector3(2335.893f, 1968.448f, 69.53386f)), owning_building_guid = 34)
      LocalObject(682, Door.Constructor(Vector3(2337.119f, 1981.037f, 77.03386f)), owning_building_guid = 34)
      LocalObject(683, Door.Constructor(Vector3(2338.346f, 1993.627f, 77.03386f)), owning_building_guid = 34)
      LocalObject(684, Door.Constructor(Vector3(2346.881f, 2002.963f, 77.03386f)), owning_building_guid = 34)
      LocalObject(685, Door.Constructor(Vector3(2350.509f, 1961.94f, 77.03386f)), owning_building_guid = 34)
      LocalObject(686, Door.Constructor(Vector3(2350.561f, 2040.731f, 77.03386f)), owning_building_guid = 34)
      LocalObject(687, Door.Constructor(Vector3(2356.643f, 2024.888f, 77.03386f)), owning_building_guid = 34)
      LocalObject(688, Door.Constructor(Vector3(2359.044f, 1971.276f, 77.03386f)), owning_building_guid = 34)
      LocalObject(689, Door.Constructor(Vector3(2366.779f, 1998.482f, 77.03386f)), owning_building_guid = 34)
      LocalObject(690, Door.Constructor(Vector3(2366.779f, 1998.482f, 87.03387f)), owning_building_guid = 34)
      LocalObject(691, Door.Constructor(Vector3(2373.286f, 2013.099f, 77.03386f)), owning_building_guid = 34)
      LocalObject(692, Door.Constructor(Vector3(2383.423f, 1986.693f, 77.03386f)), owning_building_guid = 34)
      LocalObject(693, Door.Constructor(Vector3(2389.504f, 1970.85f, 77.03386f)), owning_building_guid = 34)
      LocalObject(694, Door.Constructor(Vector3(2393.184f, 2008.618f, 77.03386f)), owning_building_guid = 34)
      LocalObject(695, Door.Constructor(Vector3(2410.629f, 1978.959f, 77.03386f)), owning_building_guid = 34)
      LocalObject(696, Door.Constructor(Vector3(2413.883f, 1986.267f, 77.03386f)), owning_building_guid = 34)
      LocalObject(697, Door.Constructor(Vector3(2417.137f, 1993.575f, 77.03386f)), owning_building_guid = 34)
      LocalObject(892, Door.Constructor(Vector3(2363.291f, 1978.151f, 87.79586f)), owning_building_guid = 34)
      LocalObject(904, Door.Constructor(Vector3(2337.119f, 1981.037f, 87.03387f)), owning_building_guid = 34)
      LocalObject(905, Door.Constructor(Vector3(2350.935f, 1992.4f, 87.03186f)), owning_building_guid = 34)
      LocalObject(2660, Door.Constructor(Vector3(2345.337f, 1985.399f, 77.36687f)), owning_building_guid = 34)
      LocalObject(2661, Door.Constructor(Vector3(2351.999f, 1982.433f, 77.36687f)), owning_building_guid = 34)
      LocalObject(2662, Door.Constructor(Vector3(2358.658f, 1979.468f, 77.36687f)), owning_building_guid = 34)
      LocalObject(
        936,
        IFFLock.Constructor(Vector3(2367.104f, 1979.98f, 86.99487f), Vector3(0, 0, 114)),
        owning_building_guid = 34,
        door_guid = 892
      )
      LocalObject(
        1001,
        IFFLock.Constructor(Vector3(2246.473f, 1998.612f, 86.96487f), Vector3(0, 0, 204)),
        owning_building_guid = 34,
        door_guid = 358
      )
      LocalObject(
        1010,
        IFFLock.Constructor(Vector3(2334.786f, 1969.827f, 69.34886f), Vector3(0, 0, 24)),
        owning_building_guid = 34,
        door_guid = 681
      )
      LocalObject(
        1011,
        IFFLock.Constructor(Vector3(2335.74f, 1979.931f, 76.84886f), Vector3(0, 0, 294)),
        owning_building_guid = 34,
        door_guid = 682
      )
      LocalObject(
        1012,
        IFFLock.Constructor(Vector3(2344.821f, 1988.605f, 96.96486f), Vector3(0, 0, 114)),
        owning_building_guid = 34,
        door_guid = 372
      )
      LocalObject(
        1013,
        IFFLock.Constructor(Vector3(2360.424f, 1972.382f, 76.84886f), Vector3(0, 0, 114)),
        owning_building_guid = 34,
        door_guid = 688
      )
      LocalObject(
        1014,
        IFFLock.Constructor(Vector3(2368.314f, 1996.907f, 96.96486f), Vector3(0, 0, 204)),
        owning_building_guid = 34,
        door_guid = 374
      )
      LocalObject(
        1015,
        IFFLock.Constructor(Vector3(2414.988f, 1984.885f, 76.84886f), Vector3(0, 0, 204)),
        owning_building_guid = 34,
        door_guid = 696
      )
      LocalObject(
        1016,
        IFFLock.Constructor(Vector3(2416.083f, 1995.073f, 76.84886f), Vector3(0, 0, 24)),
        owning_building_guid = 34,
        door_guid = 697
      )
      LocalObject(1286, Locker.Constructor(Vector3(2328.66f, 1956.236f, 75.42086f)), owning_building_guid = 34)
      LocalObject(1287, Locker.Constructor(Vector3(2329.089f, 1957.2f, 75.42086f)), owning_building_guid = 34)
      LocalObject(1288, Locker.Constructor(Vector3(2329.52f, 1958.168f, 75.42086f)), owning_building_guid = 34)
      LocalObject(1289, Locker.Constructor(Vector3(2329.949f, 1959.132f, 75.42086f)), owning_building_guid = 34)
      LocalObject(1290, Locker.Constructor(Vector3(2330.379f, 1960.096f, 75.42086f)), owning_building_guid = 34)
      LocalObject(1291, Locker.Constructor(Vector3(2330.808f, 1961.06f, 75.42086f)), owning_building_guid = 34)
      LocalObject(1292, Locker.Constructor(Vector3(2336.219f, 1973.751f, 75.77386f)), owning_building_guid = 34)
      LocalObject(1293, Locker.Constructor(Vector3(2336.686f, 1974.8f, 75.77386f)), owning_building_guid = 34)
      LocalObject(1294, Locker.Constructor(Vector3(2337.152f, 1975.848f, 75.77386f)), owning_building_guid = 34)
      LocalObject(1295, Locker.Constructor(Vector3(2337.626f, 1976.912f, 75.77386f)), owning_building_guid = 34)
      LocalObject(1296, Locker.Constructor(Vector3(2346.933f, 1948.103f, 75.42086f)), owning_building_guid = 34)
      LocalObject(1297, Locker.Constructor(Vector3(2347.363f, 1949.068f, 75.42086f)), owning_building_guid = 34)
      LocalObject(1298, Locker.Constructor(Vector3(2347.792f, 1950.032f, 75.42086f)), owning_building_guid = 34)
      LocalObject(1299, Locker.Constructor(Vector3(2348.221f, 1950.996f, 75.42086f)), owning_building_guid = 34)
      LocalObject(1300, Locker.Constructor(Vector3(2348.652f, 1951.965f, 75.42086f)), owning_building_guid = 34)
      LocalObject(1301, Locker.Constructor(Vector3(2349.081f, 1952.928f, 75.42086f)), owning_building_guid = 34)
      LocalObject(1302, Locker.Constructor(Vector3(2379.083f, 1953.6f, 75.50787f)), owning_building_guid = 34)
      LocalObject(1303, Locker.Constructor(Vector3(2380.231f, 1953.089f, 75.50787f)), owning_building_guid = 34)
      LocalObject(1304, Locker.Constructor(Vector3(2381.383f, 1952.576f, 75.50787f)), owning_building_guid = 34)
      LocalObject(1305, Locker.Constructor(Vector3(2382.536f, 1952.063f, 75.50787f)), owning_building_guid = 34)
      LocalObject(1306, Locker.Constructor(Vector3(2383.679f, 1951.554f, 75.50787f)), owning_building_guid = 34)
      LocalObject(1576, Locker.Constructor(Vector3(2323.416f, 1980.286f, 85.51286f)), owning_building_guid = 34)
      LocalObject(1577, Locker.Constructor(Vector3(2324.36f, 1979.866f, 85.51286f)), owning_building_guid = 34)
      LocalObject(1578, Locker.Constructor(Vector3(2326.66f, 1978.842f, 85.28387f)), owning_building_guid = 34)
      LocalObject(1579, Locker.Constructor(Vector3(2327.604f, 1978.421f, 85.28387f)), owning_building_guid = 34)
      LocalObject(1580, Locker.Constructor(Vector3(2328.567f, 1977.993f, 85.28387f)), owning_building_guid = 34)
      LocalObject(1581, Locker.Constructor(Vector3(2329.512f, 1977.572f, 85.28387f)), owning_building_guid = 34)
      LocalObject(1582, Locker.Constructor(Vector3(2331.816f, 1976.546f, 85.51286f)), owning_building_guid = 34)
      LocalObject(1583, Locker.Constructor(Vector3(2332.76f, 1976.126f, 85.51286f)), owning_building_guid = 34)
      LocalObject(
        230,
        Terminal.Constructor(Vector3(2378.075f, 1957.96f, 75.50286f), cert_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        231,
        Terminal.Constructor(Vector3(2378.809f, 1956.048f, 75.50286f), cert_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        232,
        Terminal.Constructor(Vector3(2383.241f, 1969.562f, 75.50286f), cert_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        233,
        Terminal.Constructor(Vector3(2385.153f, 1970.296f, 75.50286f), cert_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        234,
        Terminal.Constructor(Vector3(2385.501f, 1953.069f, 75.50286f), cert_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        235,
        Terminal.Constructor(Vector3(2387.413f, 1953.803f, 75.50286f), cert_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        236,
        Terminal.Constructor(Vector3(2391.844f, 1967.316f, 75.50286f), cert_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        237,
        Terminal.Constructor(Vector3(2392.578f, 1965.405f, 75.50286f), cert_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1802,
        Terminal.Constructor(Vector3(2341.18f, 1971.946f, 77.10286f), order_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1803,
        Terminal.Constructor(Vector3(2344.589f, 1970.428f, 77.10286f), order_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1804,
        Terminal.Constructor(Vector3(2348.05f, 1968.887f, 77.10286f), order_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1805,
        Terminal.Constructor(Vector3(2354.781f, 1997.286f, 86.80786f), order_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        2569,
        Terminal.Constructor(Vector3(2296.847f, 2029.716f, 79.62586f), spawn_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        2570,
        Terminal.Constructor(Vector3(2328.763f, 1995.808f, 87.09187f), spawn_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        2571,
        Terminal.Constructor(Vector3(2342.941f, 1986.14f, 77.64687f), spawn_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        2572,
        Terminal.Constructor(Vector3(2349.604f, 1983.177f, 77.64687f), spawn_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        2573,
        Terminal.Constructor(Vector3(2356.261f, 1980.21f, 77.64687f), spawn_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        2574,
        Terminal.Constructor(Vector3(2357.728f, 2028.783f, 77.12586f), spawn_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        2575,
        Terminal.Constructor(Vector3(2400.708f, 1966.511f, 77.12586f), spawn_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        2807,
        Terminal.Constructor(Vector3(2268.972f, 1983.325f, 87.81786f), vehicle_terminal_combined),
        owning_building_guid = 34
      )
      LocalObject(
        1727,
        VehicleSpawnPad.Constructor(Vector3(2274.437f, 1995.822f, 83.65987f), mb_pad_creation, Vector3(0, 0, 24)),
        owning_building_guid = 34,
        terminal_guid = 2807
      )
      LocalObject(2425, ResourceSilo.Constructor(Vector3(2412.969f, 2026.373f, 92.52986f)), owning_building_guid = 34)
      LocalObject(
        2458,
        SpawnTube.Constructor(Vector3(2344.556f, 1986.228f, 75.51286f), Vector3(0, 0, 114)),
        owning_building_guid = 34
      )
      LocalObject(
        2459,
        SpawnTube.Constructor(Vector3(2351.217f, 1983.263f, 75.51286f), Vector3(0, 0, 114)),
        owning_building_guid = 34
      )
      LocalObject(
        2460,
        SpawnTube.Constructor(Vector3(2357.875f, 1980.298f, 75.51286f), Vector3(0, 0, 114)),
        owning_building_guid = 34
      )
      LocalObject(
        154,
        ProximityTerminal.Constructor(Vector3(2334.7f, 1993.079f, 85.32286f), adv_med_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1748,
        ProximityTerminal.Constructor(Vector3(2334.367f, 1965.14f, 75.51286f), medical_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        2006,
        ProximityTerminal.Constructor(Vector3(2279.495f, 2021.802f, 93.86486f), pad_landing_frame),
        owning_building_guid = 34
      )
      LocalObject(
        2007,
        Terminal.Constructor(Vector3(2279.495f, 2021.802f, 93.86486f), air_rearm_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        2009,
        ProximityTerminal.Constructor(Vector3(2292.785f, 2033.744f, 95.80586f), pad_landing_frame),
        owning_building_guid = 34
      )
      LocalObject(
        2010,
        Terminal.Constructor(Vector3(2292.785f, 2033.744f, 95.80586f), air_rearm_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        2012,
        ProximityTerminal.Constructor(Vector3(2382.802f, 1972.385f, 95.84486f), pad_landing_frame),
        owning_building_guid = 34
      )
      LocalObject(
        2013,
        Terminal.Constructor(Vector3(2382.802f, 1972.385f, 95.84486f), air_rearm_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        2015,
        ProximityTerminal.Constructor(Vector3(2397.073f, 1983.789f, 93.85487f), pad_landing_frame),
        owning_building_guid = 34
      )
      LocalObject(
        2016,
        Terminal.Constructor(Vector3(2397.073f, 1983.789f, 93.85487f), air_rearm_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        2342,
        ProximityTerminal.Constructor(Vector3(2278.918f, 2058.918f, 85.26286f), repair_silo),
        owning_building_guid = 34
      )
      LocalObject(
        2343,
        Terminal.Constructor(Vector3(2278.918f, 2058.918f, 85.26286f), ground_rearm_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        2346,
        ProximityTerminal.Constructor(Vector3(2335.124f, 1937.56f, 85.26286f), repair_silo),
        owning_building_guid = 34
      )
      LocalObject(
        2347,
        Terminal.Constructor(Vector3(2335.124f, 1937.56f, 85.26286f), ground_rearm_terminal),
        owning_building_guid = 34
      )
      LocalObject(
        1627,
        FacilityTurret.Constructor(Vector3(2227.846f, 1973.177f, 93.91486f), manned_turret),
        owning_building_guid = 34
      )
      TurretToWeapon(1627, 5043)
      LocalObject(
        1629,
        FacilityTurret.Constructor(Vector3(2282.855f, 2096.709f, 93.91486f), manned_turret),
        owning_building_guid = 34
      )
      TurretToWeapon(1629, 5044)
      LocalObject(
        1634,
        FacilityTurret.Constructor(Vector3(2350.806f, 1917.133f, 93.91486f), manned_turret),
        owning_building_guid = 34
      )
      TurretToWeapon(1634, 5045)
      LocalObject(
        1635,
        FacilityTurret.Constructor(Vector3(2407.738f, 1939.016f, 93.91486f), manned_turret),
        owning_building_guid = 34
      )
      TurretToWeapon(1635, 5046)
      LocalObject(
        1636,
        FacilityTurret.Constructor(Vector3(2444.64f, 2024.686f, 93.91486f), manned_turret),
        owning_building_guid = 34
      )
      TurretToWeapon(1636, 5047)
      LocalObject(
        916,
        ImplantTerminalMech.Constructor(Vector3(2378.438f, 1964.758f, 74.98986f)),
        owning_building_guid = 34
      )
      LocalObject(
        910,
        Terminal.Constructor(Vector3(2378.454f, 1964.751f, 74.98986f), implant_terminal_interface),
        owning_building_guid = 34
      )
      TerminalToInterface(916, 910)
      LocalObject(
        917,
        ImplantTerminalMech.Constructor(Vector3(2392.471f, 1958.523f, 74.98986f)),
        owning_building_guid = 34
      )
      LocalObject(
        911,
        Terminal.Constructor(Vector3(2392.455f, 1958.531f, 74.98986f), implant_terminal_interface),
        owning_building_guid = 34
      )
      TerminalToInterface(917, 911)
      LocalObject(
        2168,
        Painbox.Constructor(Vector3(2321.759f, 1994.889f, 99.54166f), painbox),
        owning_building_guid = 34
      )
      LocalObject(
        2181,
        Painbox.Constructor(Vector3(2343.045f, 1975.386f, 79.58276f), painbox_continuous),
        owning_building_guid = 34
      )
      LocalObject(
        2194,
        Painbox.Constructor(Vector3(2335.547f, 1990.295f, 99.74677f), painbox_door_radius),
        owning_building_guid = 34
      )
      LocalObject(
        2213,
        Painbox.Constructor(Vector3(2335.697f, 1983.269f, 77.86876f), painbox_door_radius_continuous),
        owning_building_guid = 34
      )
      LocalObject(
        2214,
        Painbox.Constructor(Vector3(2348.063f, 1958.781f, 79.05376f), painbox_door_radius_continuous),
        owning_building_guid = 34
      )
      LocalObject(
        2215,
        Painbox.Constructor(Vector3(2360.507f, 1970.06f, 77.22707f), painbox_door_radius_continuous),
        owning_building_guid = 34
      )
      LocalObject(284, Generator.Constructor(Vector3(2318.844f, 1997.904f, 94.21886f)), owning_building_guid = 34)
      LocalObject(
        271,
        Terminal.Constructor(Vector3(2326.347f, 1994.615f, 95.51286f), gen_control),
        owning_building_guid = 34
      )
    }

    Building12()

    def Building12(): Unit = { // Name: Mani Type: cryo_facility GUID: 37, MapID: 12
      LocalBuilding(
        "Mani",
        37,
        12,
        FoundationBuilder(
          Building.Structure(
            StructureType.Facility,
            Vector3(5008f, 4926f, 57.77154f),
            Vector3(0f, 0f, 360f),
            cryo_facility
          )
        )
      )
      LocalObject(
        219,
        CaptureTerminal.Constructor(Vector3(4979.911f, 4985.266f, 47.77154f), capture_terminal),
        owning_building_guid = 37
      )
      LocalObject(525, Door.Constructor(Vector3(4949.023f, 4930.5f, 59.32254f)), owning_building_guid = 37)
      LocalObject(526, Door.Constructor(Vector3(4949.023f, 4948.693f, 67.28654f)), owning_building_guid = 37)
      LocalObject(527, Door.Constructor(Vector3(4965.674f, 4993.803f, 59.32254f)), owning_building_guid = 37)
      LocalObject(532, Door.Constructor(Vector3(4983.867f, 4993.803f, 67.28654f)), owning_building_guid = 37)
      LocalObject(533, Door.Constructor(Vector3(4992f, 4946f, 69.29254f)), owning_building_guid = 37)
      LocalObject(538, Door.Constructor(Vector3(5012f, 4929.137f, 69.29254f)), owning_building_guid = 37)
      LocalObject(539, Door.Constructor(Vector3(5013.307f, 4843.073f, 67.28654f)), owning_building_guid = 37)
      LocalObject(540, Door.Constructor(Vector3(5031.5f, 4843.073f, 59.32254f)), owning_building_guid = 37)
      LocalObject(541, Door.Constructor(Vector3(5040f, 4834f, 59.29254f)), owning_building_guid = 37)
      LocalObject(542, Door.Constructor(Vector3(5058.927f, 4875.307f, 67.28654f)), owning_building_guid = 37)
      LocalObject(543, Door.Constructor(Vector3(5058.927f, 4893.5f, 59.32254f)), owning_building_guid = 37)
      LocalObject(825, Door.Constructor(Vector3(4960f, 4914f, 49.29254f)), owning_building_guid = 37)
      LocalObject(826, Door.Constructor(Vector3(4968f, 4866f, 51.79254f)), owning_building_guid = 37)
      LocalObject(827, Door.Constructor(Vector3(4972f, 4926f, 49.29254f)), owning_building_guid = 37)
      LocalObject(828, Door.Constructor(Vector3(4972f, 4966f, 49.29254f)), owning_building_guid = 37)
      LocalObject(829, Door.Constructor(Vector3(4976f, 4946f, 49.29254f)), owning_building_guid = 37)
      LocalObject(830, Door.Constructor(Vector3(4976f, 4994f, 49.29254f)), owning_building_guid = 37)
      LocalObject(831, Door.Constructor(Vector3(4984f, 4994f, 49.29254f)), owning_building_guid = 37)
      LocalObject(832, Door.Constructor(Vector3(4988f, 4870f, 51.79254f)), owning_building_guid = 37)
      LocalObject(833, Door.Constructor(Vector3(4988f, 4894f, 49.29254f)), owning_building_guid = 37)
      LocalObject(834, Door.Constructor(Vector3(4992f, 4946f, 49.29254f)), owning_building_guid = 37)
      LocalObject(835, Door.Constructor(Vector3(4992f, 4946f, 59.29254f)), owning_building_guid = 37)
      LocalObject(836, Door.Constructor(Vector3(4992f, 4994f, 49.29254f)), owning_building_guid = 37)
      LocalObject(837, Door.Constructor(Vector3(4996f, 4838f, 51.79254f)), owning_building_guid = 37)
      LocalObject(838, Door.Constructor(Vector3(4996f, 4926f, 49.29254f)), owning_building_guid = 37)
      LocalObject(839, Door.Constructor(Vector3(4996f, 4966f, 49.29254f)), owning_building_guid = 37)
      LocalObject(840, Door.Constructor(Vector3(5008f, 4898f, 49.29254f)), owning_building_guid = 37)
      LocalObject(841, Door.Constructor(Vector3(5008f, 4922f, 49.29254f)), owning_building_guid = 37)
      LocalObject(842, Door.Constructor(Vector3(5008f, 4978f, 49.29254f)), owning_building_guid = 37)
      LocalObject(843, Door.Constructor(Vector3(5012f, 4918f, 69.29254f)), owning_building_guid = 37)
      LocalObject(844, Door.Constructor(Vector3(5020f, 4926f, 49.29254f)), owning_building_guid = 37)
      LocalObject(845, Door.Constructor(Vector3(5020f, 4950f, 49.29254f)), owning_building_guid = 37)
      LocalObject(846, Door.Constructor(Vector3(5032f, 4930f, 41.79254f)), owning_building_guid = 37)
      LocalObject(847, Door.Constructor(Vector3(5032f, 4946f, 49.29254f)), owning_building_guid = 37)
      LocalObject(899, Door.Constructor(Vector3(5011.992f, 4951.083f, 60.05454f)), owning_building_guid = 37)
      LocalObject(906, Door.Constructor(Vector3(5004f, 4934f, 59.29054f)), owning_building_guid = 37)
      LocalObject(907, Door.Constructor(Vector3(5020f, 4926f, 59.29254f)), owning_building_guid = 37)
      LocalObject(2705, Door.Constructor(Vector3(5012.673f, 4931.733f, 49.62554f)), owning_building_guid = 37)
      LocalObject(2706, Door.Constructor(Vector3(5012.673f, 4939.026f, 49.62554f)), owning_building_guid = 37)
      LocalObject(2707, Door.Constructor(Vector3(5012.673f, 4946.315f, 49.62554f)), owning_building_guid = 37)
      LocalObject(
        943,
        IFFLock.Constructor(Vector3(5008.77f, 4953.822f, 59.25354f), Vector3(0, 0, 0)),
        owning_building_guid = 37,
        door_guid = 899
      )
      LocalObject(
        1124,
        IFFLock.Constructor(Vector3(4975.06f, 4992.428f, 49.10754f), Vector3(0, 0, 270)),
        owning_building_guid = 37,
        door_guid = 830
      )
      LocalObject(
        1129,
        IFFLock.Constructor(Vector3(4984.813f, 4995.572f, 49.10754f), Vector3(0, 0, 90)),
        owning_building_guid = 37,
        door_guid = 831
      )
      LocalObject(
        1130,
        IFFLock.Constructor(Vector3(4992.814f, 4948.043f, 69.22354f), Vector3(0, 0, 90)),
        owning_building_guid = 37,
        door_guid = 533
      )
      LocalObject(
        1133,
        IFFLock.Constructor(Vector3(5009.954f, 4929.958f, 69.22354f), Vector3(0, 0, 0)),
        owning_building_guid = 37,
        door_guid = 538
      )
      LocalObject(
        1136,
        IFFLock.Constructor(Vector3(5018.428f, 4950.81f, 49.10754f), Vector3(0, 0, 0)),
        owning_building_guid = 37,
        door_guid = 845
      )
      LocalObject(
        1137,
        IFFLock.Constructor(Vector3(5021.572f, 4925.19f, 49.10754f), Vector3(0, 0, 180)),
        owning_building_guid = 37,
        door_guid = 844
      )
      LocalObject(
        1138,
        IFFLock.Constructor(Vector3(5031.19f, 4928.428f, 41.60754f), Vector3(0, 0, 270)),
        owning_building_guid = 37,
        door_guid = 846
      )
      LocalObject(
        1139,
        IFFLock.Constructor(Vector3(5040.814f, 4836.042f, 59.22354f), Vector3(0, 0, 90)),
        owning_building_guid = 37,
        door_guid = 541
      )
      LocalObject(1475, Locker.Constructor(Vector3(5023.563f, 4928.141f, 48.03254f)), owning_building_guid = 37)
      LocalObject(1476, Locker.Constructor(Vector3(5024.727f, 4928.141f, 48.03254f)), owning_building_guid = 37)
      LocalObject(1477, Locker.Constructor(Vector3(5025.874f, 4928.141f, 48.03254f)), owning_building_guid = 37)
      LocalObject(1478, Locker.Constructor(Vector3(5027.023f, 4928.141f, 48.03254f)), owning_building_guid = 37)
      LocalObject(1479, Locker.Constructor(Vector3(5027.997f, 4975.496f, 47.76654f)), owning_building_guid = 37)
      LocalObject(1480, Locker.Constructor(Vector3(5027.997f, 4976.752f, 47.76654f)), owning_building_guid = 37)
      LocalObject(1481, Locker.Constructor(Vector3(5027.997f, 4978.013f, 47.76654f)), owning_building_guid = 37)
      LocalObject(1482, Locker.Constructor(Vector3(5027.997f, 4979.275f, 47.76654f)), owning_building_guid = 37)
      LocalObject(1483, Locker.Constructor(Vector3(5027.997f, 4980.527f, 47.76654f)), owning_building_guid = 37)
      LocalObject(1484, Locker.Constructor(Vector3(5040.817f, 4928.36f, 47.67954f)), owning_building_guid = 37)
      LocalObject(1485, Locker.Constructor(Vector3(5040.814f, 4948.361f, 47.67954f)), owning_building_guid = 37)
      LocalObject(1486, Locker.Constructor(Vector3(5041.873f, 4928.36f, 47.67954f)), owning_building_guid = 37)
      LocalObject(1487, Locker.Constructor(Vector3(5041.868f, 4948.361f, 47.67954f)), owning_building_guid = 37)
      LocalObject(1488, Locker.Constructor(Vector3(5042.928f, 4928.36f, 47.67954f)), owning_building_guid = 37)
      LocalObject(1489, Locker.Constructor(Vector3(5042.929f, 4948.361f, 47.67954f)), owning_building_guid = 37)
      LocalObject(1490, Locker.Constructor(Vector3(5043.983f, 4928.36f, 47.67954f)), owning_building_guid = 37)
      LocalObject(1491, Locker.Constructor(Vector3(5043.984f, 4948.361f, 47.67954f)), owning_building_guid = 37)
      LocalObject(1492, Locker.Constructor(Vector3(5045.043f, 4928.36f, 47.67954f)), owning_building_guid = 37)
      LocalObject(1493, Locker.Constructor(Vector3(5045.039f, 4948.361f, 47.67954f)), owning_building_guid = 37)
      LocalObject(1494, Locker.Constructor(Vector3(5046.098f, 4928.36f, 47.67954f)), owning_building_guid = 37)
      LocalObject(1495, Locker.Constructor(Vector3(5046.095f, 4948.361f, 47.67954f)), owning_building_guid = 37)
      LocalObject(1584, Locker.Constructor(Vector3(5026.26f, 4913.787f, 57.77154f)), owning_building_guid = 37)
      LocalObject(1585, Locker.Constructor(Vector3(5026.26f, 4914.821f, 57.77154f)), owning_building_guid = 37)
      LocalObject(1586, Locker.Constructor(Vector3(5026.26f, 4917.338f, 57.54254f)), owning_building_guid = 37)
      LocalObject(1587, Locker.Constructor(Vector3(5026.26f, 4918.372f, 57.54254f)), owning_building_guid = 37)
      LocalObject(1588, Locker.Constructor(Vector3(5026.26f, 4919.426f, 57.54254f)), owning_building_guid = 37)
      LocalObject(1589, Locker.Constructor(Vector3(5026.26f, 4920.46f, 57.54254f)), owning_building_guid = 37)
      LocalObject(1590, Locker.Constructor(Vector3(5026.26f, 4922.982f, 57.77154f)), owning_building_guid = 37)
      LocalObject(1591, Locker.Constructor(Vector3(5026.26f, 4924.016f, 57.77154f)), owning_building_guid = 37)
      LocalObject(
        238,
        Terminal.Constructor(Vector3(5010.276f, 4974.25f, 47.76154f), cert_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        239,
        Terminal.Constructor(Vector3(5010.276f, 4981.575f, 47.76154f), cert_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        240,
        Terminal.Constructor(Vector3(5011.724f, 4972.802f, 47.76154f), cert_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        241,
        Terminal.Constructor(Vector3(5011.724f, 4983.023f, 47.76154f), cert_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        242,
        Terminal.Constructor(Vector3(5024.424f, 4972.802f, 47.76154f), cert_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        243,
        Terminal.Constructor(Vector3(5024.424f, 4983.023f, 47.76154f), cert_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        244,
        Terminal.Constructor(Vector3(5025.872f, 4974.25f, 47.76154f), cert_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        245,
        Terminal.Constructor(Vector3(5025.872f, 4981.575f, 47.76154f), cert_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1874,
        Terminal.Constructor(Vector3(4997.972f, 4935.526f, 59.06654f), order_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1878,
        Terminal.Constructor(Vector3(5026.654f, 4933.408f, 49.36154f), order_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1879,
        Terminal.Constructor(Vector3(5026.654f, 4937.139f, 49.36154f), order_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1880,
        Terminal.Constructor(Vector3(5026.654f, 4940.928f, 49.36154f), order_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        2617,
        Terminal.Constructor(Vector3(4968f, 4925.407f, 49.38454f), spawn_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        2618,
        Terminal.Constructor(Vector3(4991.91f, 4869.41f, 51.88454f), spawn_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        2619,
        Terminal.Constructor(Vector3(5007.407f, 4990f, 49.38454f), spawn_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        2620,
        Terminal.Constructor(Vector3(5009.905f, 4912.359f, 59.35054f), spawn_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        2621,
        Terminal.Constructor(Vector3(5012.971f, 4929.243f, 49.90554f), spawn_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        2622,
        Terminal.Constructor(Vector3(5012.967f, 4936.535f, 49.90554f), spawn_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        2623,
        Terminal.Constructor(Vector3(5012.97f, 4943.823f, 49.90554f), spawn_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        2814,
        Terminal.Constructor(Vector3(5045.628f, 4862.814f, 60.07654f), vehicle_terminal_combined),
        owning_building_guid = 37
      )
      LocalObject(
        1738,
        VehicleSpawnPad.Constructor(Vector3(5031.989f, 4862.724f, 55.91854f), mb_pad_creation, Vector3(0, 0, -90)),
        owning_building_guid = 37,
        terminal_guid = 2814
      )
      LocalObject(2432, ResourceSilo.Constructor(Vector3(4947.733f, 4976.852f, 64.78854f)), owning_building_guid = 37)
      LocalObject(
        2503,
        SpawnTube.Constructor(Vector3(5012.233f, 4930.683f, 47.77154f), Vector3(0, 0, 0)),
        owning_building_guid = 37
      )
      LocalObject(
        2504,
        SpawnTube.Constructor(Vector3(5012.233f, 4937.974f, 47.77154f), Vector3(0, 0, 0)),
        owning_building_guid = 37
      )
      LocalObject(
        2505,
        SpawnTube.Constructor(Vector3(5012.233f, 4945.262f, 47.77154f), Vector3(0, 0, 0)),
        owning_building_guid = 37
      )
      LocalObject(
        155,
        ProximityTerminal.Constructor(Vector3(5009.983f, 4918.892f, 57.58154f), adv_med_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1761,
        ProximityTerminal.Constructor(Vector3(5035.642f, 4929.952f, 47.77154f), medical_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        2093,
        ProximityTerminal.Constructor(Vector3(4989.883f, 4864.061f, 68.06454f), pad_landing_frame),
        owning_building_guid = 37
      )
      LocalObject(
        2094,
        Terminal.Constructor(Vector3(4989.883f, 4864.061f, 68.06454f), air_rearm_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        2096,
        ProximityTerminal.Constructor(Vector3(4993.101f, 4979.651f, 66.11354f), pad_landing_frame),
        owning_building_guid = 37
      )
      LocalObject(
        2097,
        Terminal.Constructor(Vector3(4993.101f, 4979.651f, 66.11354f), air_rearm_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        2099,
        ProximityTerminal.Constructor(Vector3(5006.198f, 4856.777f, 66.12354f), pad_landing_frame),
        owning_building_guid = 37
      )
      LocalObject(
        2100,
        Terminal.Constructor(Vector3(5006.198f, 4856.777f, 66.12354f), air_rearm_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        2102,
        ProximityTerminal.Constructor(Vector3(5009.323f, 4971.253f, 68.10354f), pad_landing_frame),
        owning_building_guid = 37
      )
      LocalObject(
        2103,
        Terminal.Constructor(Vector3(5009.323f, 4971.253f, 68.10354f), air_rearm_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        2398,
        ProximityTerminal.Constructor(Vector3(4972.524f, 4841.154f, 57.52154f), repair_silo),
        owning_building_guid = 37
      )
      LocalObject(
        2399,
        Terminal.Constructor(Vector3(4972.524f, 4841.154f, 57.52154f), ground_rearm_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        2402,
        ProximityTerminal.Constructor(Vector3(5060.53f, 4941.861f, 57.52154f), repair_silo),
        owning_building_guid = 37
      )
      LocalObject(
        2403,
        Terminal.Constructor(Vector3(5060.53f, 4941.861f, 57.52154f), ground_rearm_terminal),
        owning_building_guid = 37
      )
      LocalObject(
        1691,
        FacilityTurret.Constructor(Vector3(4936.392f, 5006.472f, 66.17354f), manned_turret),
        owning_building_guid = 37
      )
      TurretToWeapon(1691, 5048)
      LocalObject(
        1692,
        FacilityTurret.Constructor(Vector3(4936.4f, 4829.379f, 66.17354f), manned_turret),
        owning_building_guid = 37
      )
      TurretToWeapon(1692, 5049)
      LocalObject(
        1697,
        FacilityTurret.Constructor(Vector3(5029.665f, 5007.605f, 66.17354f), manned_turret),
        owning_building_guid = 37
      )
      TurretToWeapon(1697, 5050)
      LocalObject(
        1698,
        FacilityTurret.Constructor(Vector3(5071.626f, 4829.371f, 66.17354f), manned_turret),
        owning_building_guid = 37
      )
      TurretToWeapon(1698, 5051)
      LocalObject(
        1699,
        FacilityTurret.Constructor(Vector3(5072.813f, 4964.496f, 66.17354f), manned_turret),
        owning_building_guid = 37
      )
      TurretToWeapon(1699, 5052)
      LocalObject(
        918,
        ImplantTerminalMech.Constructor(Vector3(5018.066f, 4970.368f, 47.24854f)),
        owning_building_guid = 37
      )
      LocalObject(
        912,
        Terminal.Constructor(Vector3(5018.066f, 4970.386f, 47.24854f), implant_terminal_interface),
        owning_building_guid = 37
      )
      TerminalToInterface(918, 912)
      LocalObject(
        919,
        ImplantTerminalMech.Constructor(Vector3(5018.054f, 4985.724f, 47.24854f)),
        owning_building_guid = 37
      )
      LocalObject(
        913,
        Terminal.Constructor(Vector3(5018.054f, 4985.706f, 47.24854f), implant_terminal_interface),
        owning_building_guid = 37
      )
      TerminalToInterface(919, 913)
      LocalObject(
        2175,
        Painbox.Constructor(Vector3(5013.593f, 4906.334f, 71.80034f), painbox),
        owning_building_guid = 37
      )
      LocalObject(
        2188,
        Painbox.Constructor(Vector3(5022.753f, 4933.712f, 51.84144f), painbox_continuous),
        owning_building_guid = 37
      )
      LocalObject(
        2201,
        Painbox.Constructor(Vector3(5012.182f, 4920.798f, 72.00544f), painbox_door_radius),
        owning_building_guid = 37
      )
      LocalObject(
        2234,
        Painbox.Constructor(Vector3(5018.54f, 4923.793f, 50.12744f), painbox_door_radius_continuous),
        owning_building_guid = 37
      )
      LocalObject(
        2235,
        Painbox.Constructor(Vector3(5020.516f, 4951.831f, 49.48574f), painbox_door_radius_continuous),
        owning_building_guid = 37
      )
      LocalObject(
        2236,
        Painbox.Constructor(Vector3(5035.882f, 4945.05f, 51.31244f), painbox_door_radius_continuous),
        owning_building_guid = 37
      )
      LocalObject(291, Generator.Constructor(Vector3(5012.025f, 4902.445f, 66.47754f)), owning_building_guid = 37)
      LocalObject(
        278,
        Terminal.Constructor(Vector3(5011.978f, 4910.637f, 67.77154f), gen_control),
        owning_building_guid = 37
      )
    }

    Building21321()

    def Building21321(): Unit = { // Name: GW_Esamir_S Type: hst GUID: 41, MapID: 21321
      LocalBuilding(
        "GW_Esamir_S",
        41,
        21321,
        FoundationBuilder(WarpGate.Structure(Vector3(3761.83f, 2214.34f, 65.95f), hst))
      )
    }

    Building21322()

    def Building21322(): Unit = { // Name: GW_Esamir_N Type: hst GUID: 42, MapID: 21322
      LocalBuilding(
        "GW_Esamir_N",
        42,
        21322,
        FoundationBuilder(WarpGate.Structure(Vector3(6302.94f, 4799.63f, 86.05f), hst))
      )
    }

    Building9()

    def Building9(): Unit = { // Name: Gjallar Type: tech_plant GUID: 44, MapID: 9
      LocalBuilding(
        "Gjallar",
        44,
        9,
        FoundationBuilder(
          Building.Structure(StructureType.Facility, Vector3(958f, 2734f, 74.05927f), Vector3(0f, 0f, 360f), tech_plant)
        )
      )
      LocalObject(
        209,
        CaptureTerminal.Constructor(Vector3(962.734f, 2689.911f, 89.15926f), capture_terminal),
        owning_building_guid = 44
      )
      LocalObject(300, Door.Constructor(Vector3(886.54f, 2663.929f, 75.60126f)), owning_building_guid = 44)
      LocalObject(301, Door.Constructor(Vector3(886.54f, 2682.121f, 83.56426f)), owning_building_guid = 44)
      LocalObject(302, Door.Constructor(Vector3(886.54f, 2737.673f, 75.60126f)), owning_building_guid = 44)
      LocalObject(303, Door.Constructor(Vector3(886.54f, 2755.865f, 83.56426f)), owning_building_guid = 44)
      LocalObject(304, Door.Constructor(Vector3(918f, 2634f, 75.68027f)), owning_building_guid = 44)
      LocalObject(305, Door.Constructor(Vector3(944.412f, 2642.802f, 83.67326f)), owning_building_guid = 44)
      LocalObject(307, Door.Constructor(Vector3(962.605f, 2642.802f, 75.71027f)), owning_building_guid = 44)
      LocalObject(308, Door.Constructor(Vector3(968.597f, 2710.575f, 90.68027f)), owning_building_guid = 44)
      LocalObject(309, Door.Constructor(Vector3(975.444f, 2694.574f, 90.68027f)), owning_building_guid = 44)
      LocalObject(310, Door.Constructor(Vector3(982.559f, 2765.266f, 75.60126f)), owning_building_guid = 44)
      LocalObject(315, Door.Constructor(Vector3(1000.752f, 2765.266f, 83.56426f)), owning_building_guid = 44)
      LocalObject(316, Door.Constructor(Vector3(1037.02f, 2718.914f, 83.56426f)), owning_building_guid = 44)
      LocalObject(317, Door.Constructor(Vector3(1037.02f, 2737.107f, 75.60126f)), owning_building_guid = 44)
      LocalObject(601, Door.Constructor(Vector3(910f, 2774.002f, 77.79626f)), owning_building_guid = 44)
      LocalObject(605, Door.Constructor(Vector3(910f, 2718f, 57.79626f)), owning_building_guid = 44)
      LocalObject(609, Door.Constructor(Vector3(894f, 2666f, 68.18027f)), owning_building_guid = 44)
      LocalObject(610, Door.Constructor(Vector3(894f, 2690f, 65.68027f)), owning_building_guid = 44)
      LocalObject(611, Door.Constructor(Vector3(926f, 2690f, 65.68027f)), owning_building_guid = 44)
      LocalObject(612, Door.Constructor(Vector3(926f, 2714f, 65.68027f)), owning_building_guid = 44)
      LocalObject(613, Door.Constructor(Vector3(942f, 2642f, 68.18027f)), owning_building_guid = 44)
      LocalObject(614, Door.Constructor(Vector3(942f, 2682f, 68.18027f)), owning_building_guid = 44)
      LocalObject(615, Door.Constructor(Vector3(954f, 2694f, 70.68027f)), owning_building_guid = 44)
      LocalObject(616, Door.Constructor(Vector3(954f, 2694f, 90.68027f)), owning_building_guid = 44)
      LocalObject(617, Door.Constructor(Vector3(954f, 2710f, 70.68027f)), owning_building_guid = 44)
      LocalObject(618, Door.Constructor(Vector3(958f, 2658f, 68.18027f)), owning_building_guid = 44)
      LocalObject(619, Door.Constructor(Vector3(958f, 2698f, 60.68027f)), owning_building_guid = 44)
      LocalObject(620, Door.Constructor(Vector3(958f, 2702f, 80.68027f)), owning_building_guid = 44)
      LocalObject(621, Door.Constructor(Vector3(958f, 2706f, 90.68027f)), owning_building_guid = 44)
      LocalObject(622, Door.Constructor(Vector3(978f, 2686f, 60.68027f)), owning_building_guid = 44)
      LocalObject(623, Door.Constructor(Vector3(978f, 2686f, 68.18027f)), owning_building_guid = 44)
      LocalObject(624, Door.Constructor(Vector3(978f, 2710f, 68.18027f)), owning_building_guid = 44)
      LocalObject(625, Door.Constructor(Vector3(986f, 2718f, 60.68027f)), owning_building_guid = 44)
      LocalObject(626, Door.Constructor(Vector3(990f, 2690f, 60.68027f)), owning_building_guid = 44)
      LocalObject(627, Door.Constructor(Vector3(990f, 2706f, 68.18027f)), owning_building_guid = 44)
      LocalObject(889, Door.Constructor(Vector3(998.213f, 2688.341f, 76.43926f)), owning_building_guid = 44)
      LocalObject(2639, Door.Constructor(Vector3(970.673f, 2691.733f, 68.51327f)), owning_building_guid = 44)
      LocalObject(2640, Door.Constructor(Vector3(970.673f, 2699.026f, 68.51327f)), owning_building_guid = 44)
      LocalObject(2641, Door.Constructor(Vector3(970.673f, 2706.315f, 68.51327f)), owning_building_guid = 44)
      LocalObject(
        933,
        IFFLock.Constructor(Vector3(1001.357f, 2685.603f, 75.63927f), Vector3(0, 0, 180)),
        owning_building_guid = 44,
        door_guid = 889
      )
      LocalObject(
        946,
        IFFLock.Constructor(Vector3(915.256f, 2776.353f, 75.74727f), Vector3(0, 0, 360)),
        owning_building_guid = 44,
        door_guid = 601
      )
      LocalObject(
        956,
        IFFLock.Constructor(Vector3(917.186f, 2631.954f, 75.61127f), Vector3(0, 0, 270)),
        owning_building_guid = 44,
        door_guid = 304
      )
      LocalObject(
        957,
        IFFLock.Constructor(Vector3(952.428f, 2694.94f, 90.49527f), Vector3(0, 0, 0)),
        owning_building_guid = 44,
        door_guid = 616
      )
      LocalObject(
        958,
        IFFLock.Constructor(Vector3(966.554f, 2711.383f, 90.60526f), Vector3(0, 0, 0)),
        owning_building_guid = 44,
        door_guid = 308
      )
      LocalObject(
        959,
        IFFLock.Constructor(Vector3(976.428f, 2710.81f, 67.99526f), Vector3(0, 0, 0)),
        owning_building_guid = 44,
        door_guid = 624
      )
      LocalObject(
        960,
        IFFLock.Constructor(Vector3(977.496f, 2693.775f, 90.60526f), Vector3(0, 0, 180)),
        owning_building_guid = 44,
        door_guid = 309
      )
      LocalObject(
        961,
        IFFLock.Constructor(Vector3(979.572f, 2685.19f, 67.99526f), Vector3(0, 0, 180)),
        owning_building_guid = 44,
        door_guid = 623
      )
      LocalObject(
        962,
        IFFLock.Constructor(Vector3(987.572f, 2717.057f, 60.49527f), Vector3(0, 0, 180)),
        owning_building_guid = 44,
        door_guid = 625
      )
      LocalObject(
        963,
        IFFLock.Constructor(Vector3(989.06f, 2688.428f, 60.49527f), Vector3(0, 0, 270)),
        owning_building_guid = 44,
        door_guid = 626
      )
      LocalObject(1193, Locker.Constructor(Vector3(981.563f, 2688.141f, 66.92027f)), owning_building_guid = 44)
      LocalObject(1194, Locker.Constructor(Vector3(982.727f, 2688.141f, 66.92027f)), owning_building_guid = 44)
      LocalObject(1195, Locker.Constructor(Vector3(983.874f, 2688.141f, 66.92027f)), owning_building_guid = 44)
      LocalObject(1196, Locker.Constructor(Vector3(985.023f, 2688.141f, 66.92027f)), owning_building_guid = 44)
      LocalObject(1197, Locker.Constructor(Vector3(992.194f, 2708.165f, 59.15926f)), owning_building_guid = 44)
      LocalObject(1198, Locker.Constructor(Vector3(993.518f, 2708.165f, 59.15926f)), owning_building_guid = 44)
      LocalObject(1199, Locker.Constructor(Vector3(994.854f, 2708.165f, 59.15926f)), owning_building_guid = 44)
      LocalObject(1200, Locker.Constructor(Vector3(996.191f, 2708.165f, 59.15926f)), owning_building_guid = 44)
      LocalObject(1203, Locker.Constructor(Vector3(1000.731f, 2708.165f, 59.15926f)), owning_building_guid = 44)
      LocalObject(1205, Locker.Constructor(Vector3(1002.055f, 2708.165f, 59.15926f)), owning_building_guid = 44)
      LocalObject(1208, Locker.Constructor(Vector3(1003.391f, 2708.165f, 59.15926f)), owning_building_guid = 44)
      LocalObject(1210, Locker.Constructor(Vector3(1004.728f, 2708.165f, 59.15926f)), owning_building_guid = 44)
      LocalObject(
        156,
        Terminal.Constructor(Vector3(962.673f, 2709.141f, 89.76227f), air_vehicle_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        1723,
        VehicleSpawnPad.Constructor(Vector3(958.07f, 2729.835f, 86.63727f), mb_pad_creation, Vector3(0, 0, 0)),
        owning_building_guid = 44,
        terminal_guid = 156
      )
      LocalObject(
        157,
        Terminal.Constructor(Vector3(974.605f, 2709.141f, 89.76227f), air_vehicle_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        1724,
        VehicleSpawnPad.Constructor(Vector3(979.088f, 2729.835f, 86.63727f), mb_pad_creation, Vector3(0, 0, 0)),
        owning_building_guid = 44,
        terminal_guid = 157
      )
      LocalObject(
        1769,
        Terminal.Constructor(Vector3(961.058f, 2707.486f, 80.48927f), order_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        1770,
        Terminal.Constructor(Vector3(984.654f, 2693.408f, 68.24927f), order_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        1771,
        Terminal.Constructor(Vector3(984.654f, 2697.139f, 68.24927f), order_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        1772,
        Terminal.Constructor(Vector3(984.654f, 2700.928f, 68.24927f), order_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        2549,
        Terminal.Constructor(Vector3(933.942f, 2638.591f, 68.21626f), spawn_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        2550,
        Terminal.Constructor(Vector3(965.942f, 2686.591f, 60.71626f), spawn_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        2551,
        Terminal.Constructor(Vector3(970.971f, 2689.243f, 68.79327f), spawn_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        2552,
        Terminal.Constructor(Vector3(970.967f, 2696.535f, 68.79327f), spawn_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        2553,
        Terminal.Constructor(Vector3(970.97f, 2703.823f, 68.79327f), spawn_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        2554,
        Terminal.Constructor(Vector3(972.532f, 2737.215f, 86.08227f), spawn_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        2555,
        Terminal.Constructor(Vector3(995.242f, 2713.639f, 80.74126f), spawn_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        2804,
        Terminal.Constructor(Vector3(909.996f, 2693.423f, 59.87326f), ground_vehicle_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        1722,
        VehicleSpawnPad.Constructor(Vector3(909.945f, 2704.339f, 51.59627f), mb_pad_creation, Vector3(0, 0, 0)),
        owning_building_guid = 44,
        terminal_guid = 2804
      )
      LocalObject(2422, ResourceSilo.Constructor(Vector3(1019.752f, 2766.555f, 81.06727f)), owning_building_guid = 44)
      LocalObject(
        2437,
        SpawnTube.Constructor(Vector3(970.233f, 2690.683f, 66.65926f), Vector3(0, 0, 0)),
        owning_building_guid = 44
      )
      LocalObject(
        2438,
        SpawnTube.Constructor(Vector3(970.233f, 2697.974f, 66.65926f), Vector3(0, 0, 0)),
        owning_building_guid = 44
      )
      LocalObject(
        2439,
        SpawnTube.Constructor(Vector3(970.233f, 2705.262f, 66.65926f), Vector3(0, 0, 0)),
        owning_building_guid = 44
      )
      LocalObject(
        1743,
        ProximityTerminal.Constructor(Vector3(961.059f, 2696.901f, 79.15627f), medical_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        1744,
        ProximityTerminal.Constructor(Vector3(998.444f, 2707.62f, 59.15926f), medical_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        1973,
        ProximityTerminal.Constructor(Vector3(896.704f, 2709.661f, 82.25426f), pad_landing_frame),
        owning_building_guid = 44
      )
      LocalObject(
        1974,
        Terminal.Constructor(Vector3(896.704f, 2709.661f, 82.25426f), air_rearm_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        1976,
        ProximityTerminal.Constructor(Vector3(916.98f, 2725.833f, 84.60927f), pad_landing_frame),
        owning_building_guid = 44
      )
      LocalObject(
        1977,
        Terminal.Constructor(Vector3(916.98f, 2725.833f, 84.60927f), air_rearm_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        1979,
        ProximityTerminal.Constructor(Vector3(967.379f, 2669.474f, 89.50626f), pad_landing_frame),
        owning_building_guid = 44
      )
      LocalObject(
        1980,
        Terminal.Constructor(Vector3(967.379f, 2669.474f, 89.50626f), air_rearm_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        1982,
        ProximityTerminal.Constructor(Vector3(983.534f, 2652.628f, 82.26727f), pad_landing_frame),
        owning_building_guid = 44
      )
      LocalObject(
        1983,
        Terminal.Constructor(Vector3(983.534f, 2652.628f, 82.26727f), air_rearm_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        1985,
        ProximityTerminal.Constructor(Vector3(1019.987f, 2691.855f, 84.71127f), pad_landing_frame),
        owning_building_guid = 44
      )
      LocalObject(
        1986,
        Terminal.Constructor(Vector3(1019.987f, 2691.855f, 84.71127f), air_rearm_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        1988,
        ProximityTerminal.Constructor(Vector3(1026.28f, 2708.102f, 82.26727f), pad_landing_frame),
        owning_building_guid = 44
      )
      LocalObject(
        1989,
        Terminal.Constructor(Vector3(1026.28f, 2708.102f, 82.26727f), air_rearm_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        2318,
        ProximityTerminal.Constructor(Vector3(958.3086f, 2775.637f, 73.78777f), repair_silo),
        owning_building_guid = 44
      )
      LocalObject(
        2319,
        Terminal.Constructor(Vector3(958.3086f, 2775.637f, 73.78777f), ground_rearm_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        2322,
        ProximityTerminal.Constructor(Vector3(1016.637f, 2641.208f, 73.80927f), repair_silo),
        owning_building_guid = 44
      )
      LocalObject(
        2323,
        Terminal.Constructor(Vector3(1016.637f, 2641.208f, 73.80927f), ground_rearm_terminal),
        owning_building_guid = 44
      )
      LocalObject(
        1605,
        FacilityTurret.Constructor(Vector3(873.906f, 2832.855f, 82.55827f), manned_turret),
        owning_building_guid = 44
      )
      TurretToWeapon(1605, 5053)
      LocalObject(
        1606,
        FacilityTurret.Constructor(Vector3(879.413f, 2634.665f, 82.55827f), manned_turret),
        owning_building_guid = 44
      )
      TurretToWeapon(1606, 5054)
      LocalObject(
        1607,
        FacilityTurret.Constructor(Vector3(963.601f, 2832.855f, 82.55827f), manned_turret),
        owning_building_guid = 44
      )
      TurretToWeapon(1607, 5055)
      LocalObject(
        1610,
        FacilityTurret.Constructor(Vector3(1044.154f, 2634.657f, 82.55827f), manned_turret),
        owning_building_guid = 44
      )
      TurretToWeapon(1610, 5056)
      LocalObject(
        1611,
        FacilityTurret.Constructor(Vector3(1044.154f, 2772.398f, 82.55827f), manned_turret),
        owning_building_guid = 44
      )
      TurretToWeapon(1611, 5057)
      LocalObject(
        1612,
        FacilityTurret.Constructor(Vector3(1051.881f, 2699.423f, 82.55827f), manned_turret),
        owning_building_guid = 44
      )
      TurretToWeapon(1612, 5058)
      LocalObject(
        2165,
        Painbox.Constructor(Vector3(983.7372f, 2730.206f, 62.63256f), painbox),
        owning_building_guid = 44
      )
      LocalObject(
        2178,
        Painbox.Constructor(Vector3(978.8322f, 2697.212f, 70.92917f), painbox_continuous),
        owning_building_guid = 44
      )
      LocalObject(
        2191,
        Painbox.Constructor(Vector3(985.6996f, 2715.471f, 62.31866f), painbox_door_radius),
        owning_building_guid = 44
      )
      LocalObject(
        2204,
        Painbox.Constructor(Vector3(977.0348f, 2684.278f, 68.78716f), painbox_door_radius_continuous),
        owning_building_guid = 44
      )
      LocalObject(
        2205,
        Painbox.Constructor(Vector3(977.8606f, 2711.769f, 69.33546f), painbox_door_radius_continuous),
        owning_building_guid = 44
      )
      LocalObject(
        2206,
        Painbox.Constructor(Vector3(993.641f, 2704.57f, 70.24156f), painbox_door_radius_continuous),
        owning_building_guid = 44
      )
      LocalObject(281, Generator.Constructor(Vector3(985.975f, 2733.555f, 57.86526f)), owning_building_guid = 44)
      LocalObject(
        268,
        Terminal.Constructor(Vector3(986.022f, 2725.363f, 59.15926f), gen_control),
        owning_building_guid = 44
      )
    }

    Building7()

    def Building7(): Unit = { // Name: Eisa Type: tech_plant GUID: 47, MapID: 7
      LocalBuilding(
        "Eisa",
        47,
        7,
        FoundationBuilder(
          Building.Structure(
            StructureType.Facility,
            Vector3(3394f, 4622f, 75.30442f),
            Vector3(0f, 0f, 337f),
            tech_plant
          )
        )
      )
      LocalObject(
        215,
        CaptureTerminal.Constructor(Vector3(3381.131f, 4579.566f, 90.40442f), capture_terminal),
        owning_building_guid = 47
      )
      LocalObject(431, Door.Constructor(Vector3(3300.842f, 4585.421f, 76.84642f)), owning_building_guid = 47)
      LocalObject(432, Door.Constructor(Vector3(3307.95f, 4602.167f, 84.80942f)), owning_building_guid = 47)
      LocalObject(433, Door.Constructor(Vector3(3318.107f, 4545.579f, 76.92542f)), owning_building_guid = 47)
      LocalObject(434, Door.Constructor(Vector3(3329.656f, 4653.303f, 76.84642f)), owning_building_guid = 47)
      LocalObject(439, Door.Constructor(Vector3(3336.764f, 4670.048f, 84.80942f)), owning_building_guid = 47)
      LocalObject(440, Door.Constructor(Vector3(3345.858f, 4543.361f, 84.91842f)), owning_building_guid = 47)
      LocalObject(441, Door.Constructor(Vector3(3362.605f, 4536.252f, 76.95542f)), owning_building_guid = 47)
      LocalObject(442, Door.Constructor(Vector3(3394.652f, 4578.892f, 91.92542f)), owning_building_guid = 47)
      LocalObject(443, Door.Constructor(Vector3(3394.602f, 4596.296f, 91.92542f)), owning_building_guid = 47)
      LocalObject(445, Door.Constructor(Vector3(3428.823f, 4641.185f, 76.84642f)), owning_building_guid = 47)
      LocalObject(446, Door.Constructor(Vector3(3445.57f, 4634.076f, 84.80942f)), owning_building_guid = 47)
      LocalObject(452, Door.Constructor(Vector3(3460.844f, 4577.238f, 84.80942f)), owning_building_guid = 47)
      LocalObject(453, Door.Constructor(Vector3(3467.952f, 4593.984f, 76.84642f)), owning_building_guid = 47)
      LocalObject(602, Door.Constructor(Vector3(3365.446f, 4677.577f, 79.04142f)), owning_building_guid = 47)
      LocalObject(606, Door.Constructor(Vector3(3343.564f, 4626.027f, 59.04142f)), owning_building_guid = 47)
      LocalObject(741, Door.Constructor(Vector3(3308.518f, 4584.413f, 69.42542f)), owning_building_guid = 47)
      LocalObject(742, Door.Constructor(Vector3(3317.896f, 4606.504f, 66.92542f)), owning_building_guid = 47)
      LocalObject(743, Door.Constructor(Vector3(3343.325f, 4543.565f, 69.42542f)), owning_building_guid = 47)
      LocalObject(744, Door.Constructor(Vector3(3347.352f, 4594.001f, 66.92542f)), owning_building_guid = 47)
      LocalObject(745, Door.Constructor(Vector3(3356.729f, 4616.093f, 66.92542f)), owning_building_guid = 47)
      LocalObject(746, Door.Constructor(Vector3(3358.954f, 4580.385f, 69.42542f)), owning_building_guid = 47)
      LocalObject(747, Door.Constructor(Vector3(3364.304f, 4552.042f, 69.42542f)), owning_building_guid = 47)
      LocalObject(748, Door.Constructor(Vector3(3374.689f, 4586.743f, 71.92542f)), owning_building_guid = 47)
      LocalObject(749, Door.Constructor(Vector3(3374.689f, 4586.743f, 91.92542f)), owning_building_guid = 47)
      LocalObject(750, Door.Constructor(Vector3(3379.934f, 4588.862f, 61.92542f)), owning_building_guid = 47)
      LocalObject(751, Door.Constructor(Vector3(3380.94f, 4601.471f, 71.92542f)), owning_building_guid = 47)
      LocalObject(752, Door.Constructor(Vector3(3381.497f, 4592.544f, 81.92542f)), owning_building_guid = 47)
      LocalObject(753, Door.Constructor(Vector3(3383.06f, 4596.226f, 91.92542f)), owning_building_guid = 47)
      LocalObject(754, Door.Constructor(Vector3(3393.655f, 4570.001f, 61.92542f)), owning_building_guid = 47)
      LocalObject(755, Door.Constructor(Vector3(3393.655f, 4570.001f, 69.42542f)), owning_building_guid = 47)
      LocalObject(756, Door.Constructor(Vector3(3403.032f, 4592.093f, 69.42542f)), owning_building_guid = 47)
      LocalObject(757, Door.Constructor(Vector3(3406.264f, 4568.995f, 61.92542f)), owning_building_guid = 47)
      LocalObject(758, Door.Constructor(Vector3(3412.516f, 4583.723f, 69.42542f)), owning_building_guid = 47)
      LocalObject(759, Door.Constructor(Vector3(3413.522f, 4596.332f, 61.92542f)), owning_building_guid = 47)
      LocalObject(895, Door.Constructor(Vector3(3413.176f, 4564.258f, 77.68442f)), owning_building_guid = 47)
      LocalObject(2677, Door.Constructor(Vector3(3389.151f, 4578.141f, 69.75842f)), owning_building_guid = 47)
      LocalObject(2678, Door.Constructor(Vector3(3392f, 4584.854f, 69.75842f)), owning_building_guid = 47)
      LocalObject(2679, Door.Constructor(Vector3(3394.848f, 4591.564f, 69.75842f)), owning_building_guid = 47)
      LocalObject(
        939,
        IFFLock.Constructor(Vector3(3415f, 4560.509f, 76.88442f), Vector3(0, 0, 203)),
        owning_building_guid = 47,
        door_guid = 895
      )
      LocalObject(
        947,
        IFFLock.Constructor(Vector3(3371.203f, 4677.688f, 76.99242f), Vector3(0, 0, 383)),
        owning_building_guid = 47,
        door_guid = 602
      )
      LocalObject(
        1054,
        IFFLock.Constructor(Vector3(3316.558f, 4544.014f, 76.85642f), Vector3(0, 0, 293)),
        owning_building_guid = 47,
        door_guid = 433
      )
      LocalObject(
        1059,
        IFFLock.Constructor(Vector3(3373.609f, 4588.222f, 91.74042f), Vector3(0, 0, 23)),
        owning_building_guid = 47,
        door_guid = 749
      )
      LocalObject(
        1060,
        IFFLock.Constructor(Vector3(3393.037f, 4597.839f, 91.85042f), Vector3(0, 0, 23)),
        owning_building_guid = 47,
        door_guid = 443
      )
      LocalObject(
        1061,
        IFFLock.Constructor(Vector3(3394.786f, 4568.641f, 69.24042f), Vector3(0, 0, 203)),
        owning_building_guid = 47,
        door_guid = 755
      )
      LocalObject(
        1062,
        IFFLock.Constructor(Vector3(3396.229f, 4577.355f, 91.85042f), Vector3(0, 0, 203)),
        owning_building_guid = 47,
        door_guid = 442
      )
      LocalObject(
        1063,
        IFFLock.Constructor(Vector3(3401.902f, 4593.453f, 69.24042f), Vector3(0, 0, 23)),
        owning_building_guid = 47,
        door_guid = 756
      )
      LocalObject(
        1064,
        IFFLock.Constructor(Vector3(3404.784f, 4567.915f, 61.74042f), Vector3(0, 0, 293)),
        owning_building_guid = 47,
        door_guid = 757
      )
      LocalObject(
        1065,
        IFFLock.Constructor(Vector3(3414.601f, 4594.849f, 61.74042f), Vector3(0, 0, 203)),
        owning_building_guid = 47,
        door_guid = 759
      )
      LocalObject(1363, Locker.Constructor(Vector3(3397.771f, 4570.58f, 68.16542f)), owning_building_guid = 47)
      LocalObject(1364, Locker.Constructor(Vector3(3398.843f, 4570.125f, 68.16542f)), owning_building_guid = 47)
      LocalObject(1365, Locker.Constructor(Vector3(3399.899f, 4569.677f, 68.16542f)), owning_building_guid = 47)
      LocalObject(1366, Locker.Constructor(Vector3(3400.956f, 4569.228f, 68.16542f)), owning_building_guid = 47)
      LocalObject(1367, Locker.Constructor(Vector3(3415.381f, 4584.858f, 60.40442f)), owning_building_guid = 47)
      LocalObject(1368, Locker.Constructor(Vector3(3416.6f, 4584.341f, 60.40442f)), owning_building_guid = 47)
      LocalObject(1369, Locker.Constructor(Vector3(3417.83f, 4583.819f, 60.40442f)), owning_building_guid = 47)
      LocalObject(1370, Locker.Constructor(Vector3(3419.061f, 4583.296f, 60.40442f)), owning_building_guid = 47)
      LocalObject(1371, Locker.Constructor(Vector3(3423.24f, 4581.522f, 60.40442f)), owning_building_guid = 47)
      LocalObject(1372, Locker.Constructor(Vector3(3424.458f, 4581.005f, 60.40442f)), owning_building_guid = 47)
      LocalObject(1373, Locker.Constructor(Vector3(3425.688f, 4580.483f, 60.40442f)), owning_building_guid = 47)
      LocalObject(1374, Locker.Constructor(Vector3(3426.919f, 4579.96f, 60.40442f)), owning_building_guid = 47)
      LocalObject(
        158,
        Terminal.Constructor(Vector3(3388.588f, 4597.292f, 91.00742f), air_vehicle_terminal),
        owning_building_guid = 47
      )
      LocalObject(
        1731,
        VehicleSpawnPad.Constructor(Vector3(3392.437f, 4618.139f, 87.88242f), mb_pad_creation, Vector3(0, 0, 23)),
        owning_building_guid = 47,
        terminal_guid = 158
      )
      LocalObject(
        159,
        Terminal.Constructor(Vector3(3399.572f, 4592.629f, 91.00742f), air_vehicle_terminal),
        owning_building_guid = 47
      )
      LocalObject(
        1732,
        VehicleSpawnPad.Constructor(Vector3(3411.784f, 4609.926f, 87.88242f), mb_pad_creation, Vector3(0, 0, 23)),
        owning_building_guid = 47,
        terminal_guid = 159
      )
      LocalObject(
        1832,
        Terminal.Constructor(Vector3(3386.455f, 4596.399f, 81.73442f), order_terminal),
        owning_building_guid = 47
      )
      LocalObject(
        1833,
        Terminal.Constructor(Vector3(3402.675f, 4574.22f, 69.49442f), order_terminal),
        owning_building_guid = 47
      )
      LocalObject(
        1834,
        Terminal.Constructor(Vector3(3404.132f, 4577.655f, 69.49442f), order_terminal),
        owning_building_guid = 47
      )
      LocalObject(
        1835,
        Terminal.Constructor(Vector3(3405.613f, 4581.143f, 69.49442f), order_terminal),
        owning_building_guid = 47
      )
      LocalObject(
        2591,
        Terminal.Constructor(Vector3(3334.575f, 4543.576f, 69.46142f), spawn_terminal),
        owning_building_guid = 47
      )
      LocalObject(
        2592,
        Terminal.Constructor(Vector3(3382.786f, 4575.257f, 61.96142f), spawn_terminal),
        owning_building_guid = 47
      )
      LocalObject(
        2593,
        Terminal.Constructor(Vector3(3388.452f, 4575.733f, 70.03842f), spawn_terminal),
        owning_building_guid = 47
      )
      LocalObject(
        2594,
        Terminal.Constructor(Vector3(3391.297f, 4582.447f, 70.03842f), spawn_terminal),
        owning_building_guid = 47
      )
      LocalObject(
        2595,
        Terminal.Constructor(Vector3(3394.148f, 4589.154f, 70.03842f), spawn_terminal),
        owning_building_guid = 47
      )
      LocalObject(
        2596,
        Terminal.Constructor(Vector3(3408.633f, 4619.281f, 87.32742f), spawn_terminal),
        owning_building_guid = 47
      )
      LocalObject(
        2597,
        Terminal.Constructor(Vector3(3420.326f, 4588.706f, 81.98642f), spawn_terminal),
        owning_building_guid = 47
      )
      LocalObject(
        2810,
        Terminal.Constructor(Vector3(3333.957f, 4603.405f, 61.11842f), ground_vehicle_terminal),
        owning_building_guid = 47
      )
      LocalObject(
        1730,
        VehicleSpawnPad.Constructor(Vector3(3338.176f, 4613.474f, 52.84142f), mb_pad_creation, Vector3(0, 0, 23)),
        owning_building_guid = 47,
        terminal_guid = 2810
      )
      LocalObject(2428, ResourceSilo.Constructor(Vector3(3463.563f, 4627.838f, 82.31242f)), owning_building_guid = 47)
      LocalObject(
        2475,
        SpawnTube.Constructor(Vector3(3388.335f, 4577.347f, 67.90442f), Vector3(0, 0, 23)),
        owning_building_guid = 47
      )
      LocalObject(
        2476,
        SpawnTube.Constructor(Vector3(3391.184f, 4584.058f, 67.90442f), Vector3(0, 0, 23)),
        owning_building_guid = 47
      )
      LocalObject(
        2477,
        SpawnTube.Constructor(Vector3(3394.032f, 4590.767f, 67.90442f), Vector3(0, 0, 23)),
        owning_building_guid = 47
      )
      LocalObject(
        1753,
        ProximityTerminal.Constructor(Vector3(3382.32f, 4586.655f, 80.40142f), medical_terminal),
        owning_building_guid = 47
      )
      LocalObject(
        1754,
        ProximityTerminal.Constructor(Vector3(3420.921f, 4581.915f, 60.40442f), medical_terminal),
        owning_building_guid = 47
      )
      LocalObject(
        2042,
        ProximityTerminal.Constructor(Vector3(3328.067f, 4623.546f, 83.49942f), pad_landing_frame),
        owning_building_guid = 47
      )
      LocalObject(
        2043,
        Terminal.Constructor(Vector3(3328.067f, 4623.546f, 83.49942f), air_rearm_terminal),
        owning_building_guid = 47
      )
      LocalObject(
        2045,
        ProximityTerminal.Constructor(Vector3(3353.05f, 4630.51f, 85.85442f), pad_landing_frame),
        owning_building_guid = 47
      )
      LocalObject(
        2046,
        Terminal.Constructor(Vector3(3353.05f, 4630.51f, 85.85442f), air_rearm_terminal),
        owning_building_guid = 47
      )
      LocalObject(
        2048,
        ProximityTerminal.Constructor(Vector3(3377.421f, 4558.939f, 90.75142f), pad_landing_frame),
        owning_building_guid = 47
      )
      LocalObject(
        2049,
        Terminal.Constructor(Vector3(3377.421f, 4558.939f, 90.75142f), air_rearm_terminal),
        owning_building_guid = 47
      )
      LocalObject(
        2051,
        ProximityTerminal.Constructor(Vector3(3385.71f, 4537.12f, 83.51242f), pad_landing_frame),
        owning_building_guid = 47
      )
      LocalObject(
        2052,
        Terminal.Constructor(Vector3(3385.71f, 4537.12f, 83.51242f), air_rearm_terminal),
        owning_building_guid = 47
      )
      LocalObject(
        2054,
        ProximityTerminal.Constructor(Vector3(3434.592f, 4558.985f, 85.95642f), pad_landing_frame),
        owning_building_guid = 47
      )
      LocalObject(
        2055,
        Terminal.Constructor(Vector3(3434.592f, 4558.985f, 85.95642f), air_rearm_terminal),
        owning_building_guid = 47
      )
      LocalObject(
        2057,
        ProximityTerminal.Constructor(Vector3(3446.733f, 4571.481f, 83.51242f), pad_landing_frame),
        owning_building_guid = 47
      )
      LocalObject(
        2058,
        Terminal.Constructor(Vector3(3446.733f, 4571.481f, 83.51242f), air_rearm_terminal),
        owning_building_guid = 47
      )
      LocalObject(
        2366,
        ProximityTerminal.Constructor(Vector3(3410.553f, 4660.206f, 75.03292f), repair_silo),
        owning_building_guid = 47
      )
      LocalObject(
        2367,
        Terminal.Constructor(Vector3(3410.553f, 4660.206f, 75.03292f), ground_rearm_terminal),
        owning_building_guid = 47
      )
      LocalObject(
        2370,
        ProximityTerminal.Constructor(Vector3(3411.718f, 4513.673f, 75.05442f), repair_silo),
        owning_building_guid = 47
      )
      LocalObject(
        2371,
        Terminal.Constructor(Vector3(3411.718f, 4513.673f, 75.05442f), ground_rearm_terminal),
        owning_building_guid = 47
      )
      LocalObject(
        1653,
        FacilityTurret.Constructor(Vector3(3282.847f, 4561.268f, 83.80342f), manned_turret),
        owning_building_guid = 47
      )
      TurretToWeapon(1653, 5059)
      LocalObject(
        1660,
        FacilityTurret.Constructor(Vector3(3355.217f, 4745.854f, 83.80342f), manned_turret),
        owning_building_guid = 47
      )
      TurretToWeapon(1660, 5060)
      LocalObject(
        1662,
        FacilityTurret.Constructor(Vector3(3434.489f, 4496.891f, 83.80342f), manned_turret),
        owning_building_guid = 47
      )
      TurretToWeapon(1662, 5061)
      LocalObject(
        1663,
        FacilityTurret.Constructor(Vector3(3437.781f, 4710.808f, 83.80342f), manned_turret),
        owning_building_guid = 47
      )
      TurretToWeapon(1663, 5062)
      LocalObject(
        1664,
        FacilityTurret.Constructor(Vector3(3466.908f, 4553.489f, 83.80342f), manned_turret),
        owning_building_guid = 47
      )
      TurretToWeapon(1664, 5063)
      LocalObject(
        1666,
        FacilityTurret.Constructor(Vector3(3488.309f, 4623.683f, 83.80342f), manned_turret),
        owning_building_guid = 47
      )
      TurretToWeapon(1666, 5064)
      LocalObject(
        2171,
        Painbox.Constructor(Vector3(3416.209f, 4608.452f, 63.87772f), painbox),
        owning_building_guid = 47
      )
      LocalObject(
        2184,
        Painbox.Constructor(Vector3(3398.802f, 4579.997f, 72.17432f), painbox_continuous),
        owning_building_guid = 47
      )
      LocalObject(
        2197,
        Painbox.Constructor(Vector3(3412.258f, 4594.121f, 63.56382f), painbox_door_radius),
        owning_building_guid = 47
      )
      LocalObject(
        2222,
        Painbox.Constructor(Vector3(3392.094f, 4568.793f, 70.03232f), painbox_door_radius_continuous),
        owning_building_guid = 47
      )
      LocalObject(
        2223,
        Painbox.Constructor(Vector3(3403.595f, 4593.776f, 70.58062f), painbox_door_radius_continuous),
        owning_building_guid = 47
      )
      LocalObject(
        2224,
        Painbox.Constructor(Vector3(3415.308f, 4580.983f, 71.48672f), painbox_door_radius_continuous),
        owning_building_guid = 47
      )
      LocalObject(287, Generator.Constructor(Vector3(3419.577f, 4610.66f, 59.11042f)), owning_building_guid = 47)
      LocalObject(
        274,
        Terminal.Constructor(Vector3(3416.42f, 4603.101f, 60.40442f), gen_control),
        owning_building_guid = 47
      )
    }

    Building6()

    def Building6(): Unit = { // Name: Dagur Type: tech_plant GUID: 50, MapID: 6
      LocalBuilding(
        "Dagur",
        50,
        6,
        FoundationBuilder(
          Building.Structure(StructureType.Facility, Vector3(3936f, 6108f, 60.06042f), Vector3(0f, 0f, 79f), tech_plant)
        )
      )
      LocalObject(
        217,
        CaptureTerminal.Constructor(Vector3(3980.182f, 6104.234f, 75.16042f), capture_terminal),
        owning_building_guid = 50
      )
      LocalObject(475, Door.Constructor(Vector3(3900.902f, 6042.025f, 69.56542f)), owning_building_guid = 50)
      LocalObject(476, Door.Constructor(Vector3(3909.995f, 6138.074f, 61.60242f)), owning_building_guid = 50)
      LocalObject(477, Door.Constructor(Vector3(3913.466f, 6155.932f, 69.56542f)), owning_building_guid = 50)
      LocalObject(478, Door.Constructor(Vector3(3918.759f, 6038.554f, 61.60242f)), owning_building_guid = 50)
      LocalObject(481, Door.Constructor(Vector3(3948.028f, 6186.161f, 61.60242f)), owning_building_guid = 50)
      LocalObject(483, Door.Constructor(Vector3(3961.017f, 6113.933f, 76.68143f)), owning_building_guid = 50)
      LocalObject(485, Door.Constructor(Vector3(3965.886f, 6182.689f, 69.56542f)), owning_building_guid = 50)
      LocalObject(487, Door.Constructor(Vector3(3973.291f, 6027.954f, 69.56542f)), owning_building_guid = 50)
      LocalObject(488, Door.Constructor(Vector3(3978.03f, 6117.601f, 76.68143f)), owning_building_guid = 50)
      LocalObject(493, Door.Constructor(Vector3(3991.148f, 6024.483f, 61.60242f)), owning_building_guid = 50)
      LocalObject(494, Door.Constructor(Vector3(4022.93f, 6077.26f, 69.67442f)), owning_building_guid = 50)
      LocalObject(495, Door.Constructor(Vector3(4026.401f, 6095.119f, 61.71143f)), owning_building_guid = 50)
      LocalObject(496, Door.Constructor(Vector3(4026.53f, 6049.654f, 61.68142f)), owning_building_guid = 50)
      LocalObject(603, Door.Constructor(Vector3(3887.574f, 6068.515f, 63.79742f)), owning_building_guid = 50)
      LocalObject(607, Door.Constructor(Vector3(3942.547f, 6057.829f, 43.79742f)), owning_building_guid = 50)
      LocalObject(784, Door.Constructor(Vector3(3949.527f, 6072.772f, 51.68143f)), owning_building_guid = 50)
      LocalObject(785, Door.Constructor(Vector3(3957.049f, 6132.433f, 46.68143f)), owning_building_guid = 50)
      LocalObject(786, Door.Constructor(Vector3(3958.796f, 6099.494f, 56.68142f)), owning_building_guid = 50)
      LocalObject(787, Door.Constructor(Vector3(3963.375f, 6123.053f, 54.18142f)), owning_building_guid = 50)
      LocalObject(788, Door.Constructor(Vector3(3963.486f, 6102.657f, 76.68143f)), owning_building_guid = 50)
      LocalObject(789, Door.Constructor(Vector3(3966.98f, 6036.78f, 51.68143f)), owning_building_guid = 50)
      LocalObject(790, Door.Constructor(Vector3(3967.412f, 6101.894f, 66.68143f)), owning_building_guid = 50)
      LocalObject(791, Door.Constructor(Vector3(3969.592f, 6134.069f, 54.18142f)), owning_building_guid = 50)
      LocalObject(792, Door.Constructor(Vector3(3971.339f, 6101.131f, 46.68143f)), owning_building_guid = 50)
      LocalObject(793, Door.Constructor(Vector3(3973.086f, 6068.192f, 51.68143f)), owning_building_guid = 50)
      LocalObject(794, Door.Constructor(Vector3(3974.502f, 6096.441f, 56.68142f)), owning_building_guid = 50)
      LocalObject(795, Door.Constructor(Vector3(3974.502f, 6096.441f, 76.68143f)), owning_building_guid = 50)
      LocalObject(796, Door.Constructor(Vector3(3983.992f, 6082.372f, 54.18142f)), owning_building_guid = 50)
      LocalObject(797, Door.Constructor(Vector3(3985.297f, 6131.017f, 46.68143f)), owning_building_guid = 50)
      LocalObject(798, Door.Constructor(Vector3(3986.934f, 6118.474f, 46.68143f)), owning_building_guid = 50)
      LocalObject(799, Door.Constructor(Vector3(3986.934f, 6118.474f, 54.18142f)), owning_building_guid = 50)
      LocalObject(803, Door.Constructor(Vector3(3990.539f, 6032.201f, 54.18142f)), owning_building_guid = 50)
      LocalObject(811, Door.Constructor(Vector3(4010.604f, 6093.499f, 54.18142f)), owning_building_guid = 50)
      LocalObject(816, Door.Constructor(Vector3(4023.257f, 6074.74f, 54.18142f)), owning_building_guid = 50)
      LocalObject(897, Door.Constructor(Vector3(3988.493f, 6138.762f, 62.44043f)), owning_building_guid = 50)
      LocalObject(2687, Door.Constructor(Vector3(3965.594f, 6115.158f, 54.51442f)), owning_building_guid = 50)
      LocalObject(2688, Door.Constructor(Vector3(3972.75f, 6113.767f, 54.51442f)), owning_building_guid = 50)
      LocalObject(2689, Door.Constructor(Vector3(3979.908f, 6112.375f, 54.51442f)), owning_building_guid = 50)
      LocalObject(
        941,
        IFFLock.Constructor(Vector3(3991.781f, 6141.326f, 61.64043f), Vector3(0, 0, 101)),
        owning_building_guid = 50,
        door_guid = 897
      )
      LocalObject(
        948,
        IFFLock.Constructor(Vector3(3886.269f, 6074.123f, 61.74842f), Vector3(0, 0, 281)),
        owning_building_guid = 50,
        door_guid = 603
      )
      LocalObject(
        1085,
        IFFLock.Constructor(Vector3(3958.274f, 6133.796f, 46.49643f), Vector3(0, 0, 101)),
        owning_building_guid = 50,
        door_guid = 785
      )
      LocalObject(
        1086,
        IFFLock.Constructor(Vector3(3959.834f, 6112.082f, 76.60642f), Vector3(0, 0, 281)),
        owning_building_guid = 50,
        door_guid = 483
      )
      LocalObject(
        1087,
        IFFLock.Constructor(Vector3(3962.28f, 6121.665f, 53.99643f), Vector3(0, 0, 281)),
        owning_building_guid = 50,
        door_guid = 787
      )
      LocalObject(
        1088,
        IFFLock.Constructor(Vector3(3973.279f, 6095.077f, 76.49643f), Vector3(0, 0, 281)),
        owning_building_guid = 50,
        door_guid = 795
      )
      LocalObject(
        1089,
        IFFLock.Constructor(Vector3(3979.206f, 6119.462f, 76.60642f), Vector3(0, 0, 101)),
        owning_building_guid = 50,
        door_guid = 488
      )
      LocalObject(
        1092,
        IFFLock.Constructor(Vector3(3986.661f, 6129.794f, 46.49643f), Vector3(0, 0, 191)),
        owning_building_guid = 50,
        door_guid = 797
      )
      LocalObject(
        1093,
        IFFLock.Constructor(Vector3(3988.029f, 6119.862f, 53.99643f), Vector3(0, 0, 101)),
        owning_building_guid = 50,
        door_guid = 799
      )
      LocalObject(
        1099,
        IFFLock.Constructor(Vector3(4028.384f, 6048.464f, 61.61243f), Vector3(0, 0, 191)),
        owning_building_guid = 50,
        door_guid = 496
      )
      LocalObject(1403, Locker.Constructor(Vector3(3967.885f, 6136.636f, 45.16042f)), owning_building_guid = 50)
      LocalObject(1404, Locker.Constructor(Vector3(3968.137f, 6137.936f, 45.16042f)), owning_building_guid = 50)
      LocalObject(1405, Locker.Constructor(Vector3(3968.392f, 6139.248f, 45.16042f)), owning_building_guid = 50)
      LocalObject(1406, Locker.Constructor(Vector3(3968.647f, 6140.56f, 45.16042f)), owning_building_guid = 50)
      LocalObject(1407, Locker.Constructor(Vector3(3969.514f, 6145.017f, 45.16042f)), owning_building_guid = 50)
      LocalObject(1408, Locker.Constructor(Vector3(3969.766f, 6146.316f, 45.16042f)), owning_building_guid = 50)
      LocalObject(1409, Locker.Constructor(Vector3(3970.021f, 6147.627f, 45.16042f)), owning_building_guid = 50)
      LocalObject(1410, Locker.Constructor(Vector3(3970.276f, 6148.94f, 45.16042f)), owning_building_guid = 50)
      LocalObject(1411, Locker.Constructor(Vector3(3985.512f, 6122.38f, 52.92142f)), owning_building_guid = 50)
      LocalObject(1412, Locker.Constructor(Vector3(3985.735f, 6123.522f, 52.92142f)), owning_building_guid = 50)
      LocalObject(1413, Locker.Constructor(Vector3(3985.953f, 6124.648f, 52.92142f)), owning_building_guid = 50)
      LocalObject(1414, Locker.Constructor(Vector3(3986.173f, 6125.776f, 52.92142f)), owning_building_guid = 50)
      LocalObject(
        160,
        Terminal.Constructor(Vector3(3961.294f, 6107.844f, 75.76343f), air_vehicle_terminal),
        owning_building_guid = 50
      )
      LocalObject(
        1734,
        VehicleSpawnPad.Constructor(Vector3(3940.102f, 6107.274f, 72.63843f), mb_pad_creation, Vector3(0, 0, -79)),
        owning_building_guid = 50,
        terminal_guid = 160
      )
      LocalObject(
        161,
        Terminal.Constructor(Vector3(3963.571f, 6119.557f, 75.76343f), air_vehicle_terminal),
        owning_building_guid = 50
      )
      LocalObject(
        1735,
        VehicleSpawnPad.Constructor(Vector3(3944.112f, 6127.906f, 72.63843f), mb_pad_creation, Vector3(0, 0, -79)),
        owning_building_guid = 50,
        terminal_guid = 161
      )
      LocalObject(
        1849,
        Terminal.Constructor(Vector3(3962.61f, 6105.943f, 66.49043f), order_terminal),
        owning_building_guid = 50
      )
      LocalObject(
        1850,
        Terminal.Constructor(Vector3(3973.55f, 6127.854f, 54.25042f), order_terminal),
        owning_building_guid = 50
      )
      LocalObject(
        1851,
        Terminal.Constructor(Vector3(3977.27f, 6127.131f, 54.25042f), order_terminal),
        owning_building_guid = 50
      )
      LocalObject(
        1852,
        Terminal.Constructor(Vector3(3980.932f, 6126.419f, 54.25042f), order_terminal),
        owning_building_guid = 50
      )
      LocalObject(
        2604,
        Terminal.Constructor(Vector3(3935.617f, 6122.878f, 72.08343f), spawn_terminal),
        owning_building_guid = 50
      )
      LocalObject(
        2605,
        Terminal.Constructor(Vector3(3963.093f, 6140.673f, 66.74242f), spawn_terminal),
        owning_building_guid = 50
      )
      LocalObject(
        2606,
        Terminal.Constructor(Vector3(3968.097f, 6114.974f, 54.79443f), spawn_terminal),
        owning_building_guid = 50
      )
      LocalObject(
        2607,
        Terminal.Constructor(Vector3(3975.251f, 6113.58f, 54.79443f), spawn_terminal),
        owning_building_guid = 50
      )
      LocalObject(
        2608,
        Terminal.Constructor(Vector3(3982.41f, 6112.193f, 54.79443f), spawn_terminal),
        owning_building_guid = 50
      )
      LocalObject(
        2609,
        Terminal.Constructor(Vector3(3984.053f, 6106.75f, 46.71742f), spawn_terminal),
        owning_building_guid = 50
      )
      LocalObject(
        2614,
        Terminal.Constructor(Vector3(4025.066f, 6066.179f, 54.21743f), spawn_terminal),
        owning_building_guid = 50
      )
      LocalObject(
        2812,
        Terminal.Constructor(Vector3(3966.672f, 6053.136f, 45.87442f), ground_vehicle_terminal),
        owning_building_guid = 50
      )
      LocalObject(
        1736,
        VehicleSpawnPad.Constructor(Vector3(3955.947f, 6055.168f, 37.59743f), mb_pad_creation, Vector3(0, 0, -79)),
        owning_building_guid = 50,
        terminal_guid = 2812
      )
      LocalObject(2430, ResourceSilo.Constructor(Vector3(3915.826f, 6174.829f, 67.06843f)), owning_building_guid = 50)
      LocalObject(
        2485,
        SpawnTube.Constructor(Vector3(3966.544f, 6114.525f, 52.66042f), Vector3(0, 0, 281)),
        owning_building_guid = 50
      )
      LocalObject(
        2486,
        SpawnTube.Constructor(Vector3(3973.698f, 6113.134f, 52.66042f), Vector3(0, 0, 281)),
        owning_building_guid = 50
      )
      LocalObject(
        2487,
        SpawnTube.Constructor(Vector3(3980.855f, 6111.743f, 52.66042f), Vector3(0, 0, 281)),
        owning_building_guid = 50
      )
      LocalObject(
        1757,
        ProximityTerminal.Constructor(Vector3(3969.612f, 6142.667f, 45.16042f), medical_terminal),
        owning_building_guid = 50
      )
      LocalObject(
        1758,
        ProximityTerminal.Constructor(Vector3(3973.001f, 6103.924f, 65.15742f), medical_terminal),
        owning_building_guid = 50
      )
      LocalObject(
        2063,
        ProximityTerminal.Constructor(Vector3(3936.19f, 6066.175f, 70.61043f), pad_landing_frame),
        owning_building_guid = 50
      )
      LocalObject(
        2064,
        Terminal.Constructor(Vector3(3936.19f, 6066.175f, 70.61043f), air_rearm_terminal),
        owning_building_guid = 50
      )
      LocalObject(
        2069,
        ProximityTerminal.Constructor(Vector3(3948.196f, 6043.186f, 68.25542f), pad_landing_frame),
        owning_building_guid = 50
      )
      LocalObject(
        2070,
        Terminal.Constructor(Vector3(3948.196f, 6043.186f, 68.25542f), air_rearm_terminal),
        owning_building_guid = 50
      )
      LocalObject(
        2072,
        ProximityTerminal.Constructor(Vector3(3974.451f, 6170.084f, 68.26842f), pad_landing_frame),
        owning_building_guid = 50
      )
      LocalObject(
        2073,
        Terminal.Constructor(Vector3(3974.451f, 6170.084f, 68.26842f), air_rearm_terminal),
        owning_building_guid = 50
      )
      LocalObject(
        2075,
        ProximityTerminal.Constructor(Vector3(3989.198f, 6160.807f, 70.71243f), pad_landing_frame),
        owning_building_guid = 50
      )
      LocalObject(
        2076,
        Terminal.Constructor(Vector3(3989.198f, 6160.807f, 70.71243f), air_rearm_terminal),
        owning_building_guid = 50
      )
      LocalObject(
        2078,
        ProximityTerminal.Constructor(Vector3(4001.13f, 6104.895f, 75.50742f), pad_landing_frame),
        owning_building_guid = 50
      )
      LocalObject(
        2079,
        Terminal.Constructor(Vector3(4001.13f, 6104.895f, 75.50742f), air_rearm_terminal),
        owning_building_guid = 50
      )
      LocalObject(
        2084,
        ProximityTerminal.Constructor(Vector3(4020.749f, 6117.539f, 68.26842f), pad_landing_frame),
        owning_building_guid = 50
      )
      LocalObject(
        2085,
        Terminal.Constructor(Vector3(4020.749f, 6117.539f, 68.26842f), air_rearm_terminal),
        owning_building_guid = 50
      )
      LocalObject(
        2382,
        ProximityTerminal.Constructor(Vector3(3895.187f, 6116.248f, 59.78893f), repair_silo),
        owning_building_guid = 50
      )
      LocalObject(
        2383,
        Terminal.Constructor(Vector3(3895.187f, 6116.248f, 59.78893f), ground_rearm_terminal),
        owning_building_guid = 50
      )
      LocalObject(
        2394,
        ProximityTerminal.Constructor(Vector3(4038.276f, 6147.854f, 59.81042f), repair_silo),
        owning_building_guid = 50
      )
      LocalObject(
        2395,
        Terminal.Constructor(Vector3(4038.276f, 6147.854f, 59.81042f), ground_rearm_terminal),
        owning_building_guid = 50
      )
      LocalObject(
        1675,
        FacilityTurret.Constructor(Vector3(3822.915f, 6044.313f, 68.55943f), manned_turret),
        owning_building_guid = 50
      )
      TurretToWeapon(1675, 5065)
      LocalObject(
        1676,
        FacilityTurret.Constructor(Vector3(3840.03f, 6132.36f, 68.55943f), manned_turret),
        owning_building_guid = 50
      )
      TurretToWeapon(1676, 5066)
      LocalObject(
        1678,
        FacilityTurret.Constructor(Vector3(3914.746f, 6199.898f, 68.55943f), manned_turret),
        owning_building_guid = 50
      )
      TurretToWeapon(1678, 5067)
      LocalObject(
        1681,
        FacilityTurret.Constructor(Vector3(3987.855f, 6193.559f, 68.55943f), manned_turret),
        owning_building_guid = 50
      )
      TurretToWeapon(1681, 5068)
      LocalObject(
        1682,
        FacilityTurret.Constructor(Vector3(4018.515f, 6011.903f, 68.55943f), manned_turret),
        owning_building_guid = 50
      )
      TurretToWeapon(1682, 5069)
      LocalObject(
        1683,
        FacilityTurret.Constructor(Vector3(4049.957f, 6173.616f, 68.55943f), manned_turret),
        owning_building_guid = 50
      )
      TurretToWeapon(1683, 5070)
      LocalObject(
        2173,
        Painbox.Constructor(Vector3(3944.635f, 6132.541f, 48.63372f), painbox),
        owning_building_guid = 50
      )
      LocalObject(
        2186,
        Painbox.Constructor(Vector3(3976.087f, 6121.43f, 56.93032f), painbox_continuous),
        owning_building_guid = 50
      )
      LocalObject(
        2199,
        Painbox.Constructor(Vector3(3959.474f, 6131.655f, 48.31982f), painbox_door_radius),
        owning_building_guid = 50
      )
      LocalObject(
        2228,
        Painbox.Constructor(Vector3(3961.612f, 6123.254f, 55.33662f), painbox_door_radius_continuous),
        owning_building_guid = 50
      )
      LocalObject(
        2229,
        Painbox.Constructor(Vector3(3971.69f, 6137.371f, 56.24273f), painbox_door_radius_continuous),
        owning_building_guid = 50
      )
      LocalObject(
        2230,
        Painbox.Constructor(Vector3(3988.44f, 6117.198f, 54.78833f), painbox_door_radius_continuous),
        owning_building_guid = 50
      )
      LocalObject(289, Generator.Constructor(Vector3(3941.775f, 6135.376f, 43.86642f)), owning_building_guid = 50)
      LocalObject(
        276,
        Terminal.Constructor(Vector3(3949.825f, 6133.859f, 45.16042f), gen_control),
        owning_building_guid = 50
      )
    }

    Building10()

    def Building10(): Unit = { // Name: Helhiem Type: tech_plant GUID: 53, MapID: 10
      LocalBuilding(
        "Helhiem",
        53,
        10,
        FoundationBuilder(
          Building.Structure(StructureType.Facility, Vector3(5448f, 2608f, 53.3311f), Vector3(0f, 0f, 360f), tech_plant)
        )
      )
      LocalObject(
        220,
        CaptureTerminal.Constructor(Vector3(5452.734f, 2563.911f, 68.4311f), capture_terminal),
        owning_building_guid = 53
      )
      LocalObject(544, Door.Constructor(Vector3(5376.54f, 2537.929f, 54.8731f)), owning_building_guid = 53)
      LocalObject(545, Door.Constructor(Vector3(5376.54f, 2556.121f, 62.8361f)), owning_building_guid = 53)
      LocalObject(546, Door.Constructor(Vector3(5376.54f, 2611.673f, 54.8731f)), owning_building_guid = 53)
      LocalObject(547, Door.Constructor(Vector3(5376.54f, 2629.865f, 62.8361f)), owning_building_guid = 53)
      LocalObject(548, Door.Constructor(Vector3(5408f, 2508f, 54.9521f)), owning_building_guid = 53)
      LocalObject(549, Door.Constructor(Vector3(5434.412f, 2516.802f, 62.9451f)), owning_building_guid = 53)
      LocalObject(550, Door.Constructor(Vector3(5452.605f, 2516.802f, 54.9821f)), owning_building_guid = 53)
      LocalObject(551, Door.Constructor(Vector3(5458.597f, 2584.575f, 69.9521f)), owning_building_guid = 53)
      LocalObject(552, Door.Constructor(Vector3(5465.444f, 2568.574f, 69.9521f)), owning_building_guid = 53)
      LocalObject(553, Door.Constructor(Vector3(5472.559f, 2639.266f, 54.8731f)), owning_building_guid = 53)
      LocalObject(554, Door.Constructor(Vector3(5490.752f, 2639.266f, 62.8361f)), owning_building_guid = 53)
      LocalObject(555, Door.Constructor(Vector3(5527.02f, 2592.914f, 62.8361f)), owning_building_guid = 53)
      LocalObject(556, Door.Constructor(Vector3(5527.02f, 2611.107f, 54.8731f)), owning_building_guid = 53)
      LocalObject(604, Door.Constructor(Vector3(5400f, 2648.002f, 57.0681f)), owning_building_guid = 53)
      LocalObject(608, Door.Constructor(Vector3(5400f, 2592f, 37.0681f)), owning_building_guid = 53)
      LocalObject(848, Door.Constructor(Vector3(5384f, 2540f, 47.4521f)), owning_building_guid = 53)
      LocalObject(849, Door.Constructor(Vector3(5384f, 2564f, 44.9521f)), owning_building_guid = 53)
      LocalObject(850, Door.Constructor(Vector3(5416f, 2564f, 44.9521f)), owning_building_guid = 53)
      LocalObject(851, Door.Constructor(Vector3(5416f, 2588f, 44.9521f)), owning_building_guid = 53)
      LocalObject(852, Door.Constructor(Vector3(5432f, 2516f, 47.4521f)), owning_building_guid = 53)
      LocalObject(853, Door.Constructor(Vector3(5432f, 2556f, 47.4521f)), owning_building_guid = 53)
      LocalObject(854, Door.Constructor(Vector3(5444f, 2568f, 49.9521f)), owning_building_guid = 53)
      LocalObject(855, Door.Constructor(Vector3(5444f, 2568f, 69.9521f)), owning_building_guid = 53)
      LocalObject(856, Door.Constructor(Vector3(5444f, 2584f, 49.9521f)), owning_building_guid = 53)
      LocalObject(857, Door.Constructor(Vector3(5448f, 2532f, 47.4521f)), owning_building_guid = 53)
      LocalObject(858, Door.Constructor(Vector3(5448f, 2572f, 39.9521f)), owning_building_guid = 53)
      LocalObject(859, Door.Constructor(Vector3(5448f, 2576f, 59.9521f)), owning_building_guid = 53)
      LocalObject(860, Door.Constructor(Vector3(5448f, 2580f, 69.9521f)), owning_building_guid = 53)
      LocalObject(861, Door.Constructor(Vector3(5468f, 2560f, 39.9521f)), owning_building_guid = 53)
      LocalObject(862, Door.Constructor(Vector3(5468f, 2560f, 47.4521f)), owning_building_guid = 53)
      LocalObject(863, Door.Constructor(Vector3(5468f, 2584f, 47.4521f)), owning_building_guid = 53)
      LocalObject(864, Door.Constructor(Vector3(5476f, 2592f, 39.9521f)), owning_building_guid = 53)
      LocalObject(865, Door.Constructor(Vector3(5480f, 2564f, 39.9521f)), owning_building_guid = 53)
      LocalObject(866, Door.Constructor(Vector3(5480f, 2580f, 47.4521f)), owning_building_guid = 53)
      LocalObject(900, Door.Constructor(Vector3(5488.213f, 2562.341f, 55.7111f)), owning_building_guid = 53)
      LocalObject(2708, Door.Constructor(Vector3(5460.673f, 2565.733f, 47.7851f)), owning_building_guid = 53)
      LocalObject(2709, Door.Constructor(Vector3(5460.673f, 2573.026f, 47.7851f)), owning_building_guid = 53)
      LocalObject(2710, Door.Constructor(Vector3(5460.673f, 2580.315f, 47.7851f)), owning_building_guid = 53)
      LocalObject(
        944,
        IFFLock.Constructor(Vector3(5491.357f, 2559.603f, 54.9111f), Vector3(0, 0, 180)),
        owning_building_guid = 53,
        door_guid = 900
      )
      LocalObject(
        949,
        IFFLock.Constructor(Vector3(5405.256f, 2650.353f, 55.0191f), Vector3(0, 0, 360)),
        owning_building_guid = 53,
        door_guid = 604
      )
      LocalObject(
        1140,
        IFFLock.Constructor(Vector3(5407.186f, 2505.954f, 54.88309f), Vector3(0, 0, 270)),
        owning_building_guid = 53,
        door_guid = 548
      )
      LocalObject(
        1141,
        IFFLock.Constructor(Vector3(5442.428f, 2568.94f, 69.7671f), Vector3(0, 0, 0)),
        owning_building_guid = 53,
        door_guid = 855
      )
      LocalObject(
        1142,
        IFFLock.Constructor(Vector3(5456.554f, 2585.383f, 69.8771f), Vector3(0, 0, 0)),
        owning_building_guid = 53,
        door_guid = 551
      )
      LocalObject(
        1143,
        IFFLock.Constructor(Vector3(5466.428f, 2584.81f, 47.2671f), Vector3(0, 0, 0)),
        owning_building_guid = 53,
        door_guid = 863
      )
      LocalObject(
        1144,
        IFFLock.Constructor(Vector3(5467.496f, 2567.775f, 69.8771f), Vector3(0, 0, 180)),
        owning_building_guid = 53,
        door_guid = 552
      )
      LocalObject(
        1145,
        IFFLock.Constructor(Vector3(5469.572f, 2559.19f, 47.2671f), Vector3(0, 0, 180)),
        owning_building_guid = 53,
        door_guid = 862
      )
      LocalObject(
        1146,
        IFFLock.Constructor(Vector3(5477.572f, 2591.057f, 39.7671f), Vector3(0, 0, 180)),
        owning_building_guid = 53,
        door_guid = 864
      )
      LocalObject(
        1147,
        IFFLock.Constructor(Vector3(5479.06f, 2562.428f, 39.7671f), Vector3(0, 0, 270)),
        owning_building_guid = 53,
        door_guid = 865
      )
      LocalObject(1496, Locker.Constructor(Vector3(5471.563f, 2562.141f, 46.1921f)), owning_building_guid = 53)
      LocalObject(1497, Locker.Constructor(Vector3(5472.727f, 2562.141f, 46.1921f)), owning_building_guid = 53)
      LocalObject(1498, Locker.Constructor(Vector3(5473.874f, 2562.141f, 46.1921f)), owning_building_guid = 53)
      LocalObject(1499, Locker.Constructor(Vector3(5475.023f, 2562.141f, 46.1921f)), owning_building_guid = 53)
      LocalObject(1500, Locker.Constructor(Vector3(5482.194f, 2582.165f, 38.4311f)), owning_building_guid = 53)
      LocalObject(1501, Locker.Constructor(Vector3(5483.518f, 2582.165f, 38.4311f)), owning_building_guid = 53)
      LocalObject(1502, Locker.Constructor(Vector3(5484.854f, 2582.165f, 38.4311f)), owning_building_guid = 53)
      LocalObject(1503, Locker.Constructor(Vector3(5486.191f, 2582.165f, 38.4311f)), owning_building_guid = 53)
      LocalObject(1504, Locker.Constructor(Vector3(5490.731f, 2582.165f, 38.4311f)), owning_building_guid = 53)
      LocalObject(1505, Locker.Constructor(Vector3(5492.055f, 2582.165f, 38.4311f)), owning_building_guid = 53)
      LocalObject(1506, Locker.Constructor(Vector3(5493.391f, 2582.165f, 38.4311f)), owning_building_guid = 53)
      LocalObject(1507, Locker.Constructor(Vector3(5494.728f, 2582.165f, 38.4311f)), owning_building_guid = 53)
      LocalObject(
        162,
        Terminal.Constructor(Vector3(5452.673f, 2583.141f, 69.0341f), air_vehicle_terminal),
        owning_building_guid = 53
      )
      LocalObject(
        1740,
        VehicleSpawnPad.Constructor(Vector3(5448.07f, 2603.835f, 65.9091f), mb_pad_creation, Vector3(0, 0, 0)),
        owning_building_guid = 53,
        terminal_guid = 162
      )
      LocalObject(
        163,
        Terminal.Constructor(Vector3(5464.605f, 2583.141f, 69.0341f), air_vehicle_terminal),
        owning_building_guid = 53
      )
      LocalObject(
        1741,
        VehicleSpawnPad.Constructor(Vector3(5469.088f, 2603.835f, 65.9091f), mb_pad_creation, Vector3(0, 0, 0)),
        owning_building_guid = 53,
        terminal_guid = 163
      )
      LocalObject(
        1881,
        Terminal.Constructor(Vector3(5451.058f, 2581.486f, 59.7611f), order_terminal),
        owning_building_guid = 53
      )
      LocalObject(
        1882,
        Terminal.Constructor(Vector3(5474.654f, 2567.408f, 47.5211f), order_terminal),
        owning_building_guid = 53
      )
      LocalObject(
        1883,
        Terminal.Constructor(Vector3(5474.654f, 2571.139f, 47.5211f), order_terminal),
        owning_building_guid = 53
      )
      LocalObject(
        1884,
        Terminal.Constructor(Vector3(5474.654f, 2574.928f, 47.5211f), order_terminal),
        owning_building_guid = 53
      )
      LocalObject(
        2624,
        Terminal.Constructor(Vector3(5423.942f, 2512.591f, 47.4881f), spawn_terminal),
        owning_building_guid = 53
      )
      LocalObject(
        2625,
        Terminal.Constructor(Vector3(5455.942f, 2560.591f, 39.9881f), spawn_terminal),
        owning_building_guid = 53
      )
      LocalObject(
        2626,
        Terminal.Constructor(Vector3(5460.971f, 2563.243f, 48.0651f), spawn_terminal),
        owning_building_guid = 53
      )
      LocalObject(
        2627,
        Terminal.Constructor(Vector3(5460.967f, 2570.535f, 48.0651f), spawn_terminal),
        owning_building_guid = 53
      )
      LocalObject(
        2628,
        Terminal.Constructor(Vector3(5460.97f, 2577.823f, 48.0651f), spawn_terminal),
        owning_building_guid = 53
      )
      LocalObject(
        2629,
        Terminal.Constructor(Vector3(5462.532f, 2611.215f, 65.3541f), spawn_terminal),
        owning_building_guid = 53
      )
      LocalObject(
        2630,
        Terminal.Constructor(Vector3(5485.242f, 2587.639f, 60.0131f), spawn_terminal),
        owning_building_guid = 53
      )
      LocalObject(
        2815,
        Terminal.Constructor(Vector3(5399.996f, 2567.423f, 39.1451f), ground_vehicle_terminal),
        owning_building_guid = 53
      )
      LocalObject(
        1739,
        VehicleSpawnPad.Constructor(Vector3(5399.945f, 2578.339f, 30.8681f), mb_pad_creation, Vector3(0, 0, 0)),
        owning_building_guid = 53,
        terminal_guid = 2815
      )
      LocalObject(2433, ResourceSilo.Constructor(Vector3(5509.752f, 2640.555f, 60.3391f)), owning_building_guid = 53)
      LocalObject(
        2506,
        SpawnTube.Constructor(Vector3(5460.233f, 2564.683f, 45.9311f), Vector3(0, 0, 0)),
        owning_building_guid = 53
      )
      LocalObject(
        2507,
        SpawnTube.Constructor(Vector3(5460.233f, 2571.974f, 45.9311f), Vector3(0, 0, 0)),
        owning_building_guid = 53
      )
      LocalObject(
        2508,
        SpawnTube.Constructor(Vector3(5460.233f, 2579.262f, 45.9311f), Vector3(0, 0, 0)),
        owning_building_guid = 53
      )
      LocalObject(
        1762,
        ProximityTerminal.Constructor(Vector3(5451.059f, 2570.901f, 58.4281f), medical_terminal),
        owning_building_guid = 53
      )
      LocalObject(
        1763,
        ProximityTerminal.Constructor(Vector3(5488.444f, 2581.62f, 38.4311f), medical_terminal),
        owning_building_guid = 53
      )
      LocalObject(
        2105,
        ProximityTerminal.Constructor(Vector3(5386.704f, 2583.661f, 61.5261f), pad_landing_frame),
        owning_building_guid = 53
      )
      LocalObject(
        2106,
        Terminal.Constructor(Vector3(5386.704f, 2583.661f, 61.5261f), air_rearm_terminal),
        owning_building_guid = 53
      )
      LocalObject(
        2108,
        ProximityTerminal.Constructor(Vector3(5406.98f, 2599.833f, 63.8811f), pad_landing_frame),
        owning_building_guid = 53
      )
      LocalObject(
        2109,
        Terminal.Constructor(Vector3(5406.98f, 2599.833f, 63.8811f), air_rearm_terminal),
        owning_building_guid = 53
      )
      LocalObject(
        2111,
        ProximityTerminal.Constructor(Vector3(5457.379f, 2543.474f, 68.7781f), pad_landing_frame),
        owning_building_guid = 53
      )
      LocalObject(
        2112,
        Terminal.Constructor(Vector3(5457.379f, 2543.474f, 68.7781f), air_rearm_terminal),
        owning_building_guid = 53
      )
      LocalObject(
        2114,
        ProximityTerminal.Constructor(Vector3(5473.534f, 2526.628f, 61.5391f), pad_landing_frame),
        owning_building_guid = 53
      )
      LocalObject(
        2115,
        Terminal.Constructor(Vector3(5473.534f, 2526.628f, 61.5391f), air_rearm_terminal),
        owning_building_guid = 53
      )
      LocalObject(
        2117,
        ProximityTerminal.Constructor(Vector3(5509.987f, 2565.855f, 63.9831f), pad_landing_frame),
        owning_building_guid = 53
      )
      LocalObject(
        2118,
        Terminal.Constructor(Vector3(5509.987f, 2565.855f, 63.9831f), air_rearm_terminal),
        owning_building_guid = 53
      )
      LocalObject(
        2120,
        ProximityTerminal.Constructor(Vector3(5516.28f, 2582.102f, 61.5391f), pad_landing_frame),
        owning_building_guid = 53
      )
      LocalObject(
        2121,
        Terminal.Constructor(Vector3(5516.28f, 2582.102f, 61.5391f), air_rearm_terminal),
        owning_building_guid = 53
      )
      LocalObject(
        2406,
        ProximityTerminal.Constructor(Vector3(5448.309f, 2649.637f, 53.0596f), repair_silo),
        owning_building_guid = 53
      )
      LocalObject(
        2407,
        Terminal.Constructor(Vector3(5448.309f, 2649.637f, 53.0596f), ground_rearm_terminal),
        owning_building_guid = 53
      )
      LocalObject(
        2410,
        ProximityTerminal.Constructor(Vector3(5506.637f, 2515.208f, 53.0811f), repair_silo),
        owning_building_guid = 53
      )
      LocalObject(
        2411,
        Terminal.Constructor(Vector3(5506.637f, 2515.208f, 53.0811f), ground_rearm_terminal),
        owning_building_guid = 53
      )
      LocalObject(
        1700,
        FacilityTurret.Constructor(Vector3(5363.906f, 2706.855f, 61.8301f), manned_turret),
        owning_building_guid = 53
      )
      TurretToWeapon(1700, 5071)
      LocalObject(
        1701,
        FacilityTurret.Constructor(Vector3(5369.413f, 2508.665f, 61.8301f), manned_turret),
        owning_building_guid = 53
      )
      TurretToWeapon(1701, 5072)
      LocalObject(
        1702,
        FacilityTurret.Constructor(Vector3(5453.601f, 2706.855f, 61.8301f), manned_turret),
        owning_building_guid = 53
      )
      TurretToWeapon(1702, 5073)
      LocalObject(
        1703,
        FacilityTurret.Constructor(Vector3(5534.154f, 2508.657f, 61.8301f), manned_turret),
        owning_building_guid = 53
      )
      TurretToWeapon(1703, 5074)
      LocalObject(
        1704,
        FacilityTurret.Constructor(Vector3(5534.154f, 2646.398f, 61.8301f), manned_turret),
        owning_building_guid = 53
      )
      TurretToWeapon(1704, 5075)
      LocalObject(
        1705,
        FacilityTurret.Constructor(Vector3(5541.881f, 2573.423f, 61.8301f), manned_turret),
        owning_building_guid = 53
      )
      TurretToWeapon(1705, 5076)
      LocalObject(
        2176,
        Painbox.Constructor(Vector3(5473.737f, 2604.206f, 41.9044f), painbox),
        owning_building_guid = 53
      )
      LocalObject(
        2189,
        Painbox.Constructor(Vector3(5468.832f, 2571.212f, 50.201f), painbox_continuous),
        owning_building_guid = 53
      )
      LocalObject(
        2202,
        Painbox.Constructor(Vector3(5475.7f, 2589.471f, 41.5905f), painbox_door_radius),
        owning_building_guid = 53
      )
      LocalObject(
        2237,
        Painbox.Constructor(Vector3(5467.035f, 2558.278f, 48.059f), painbox_door_radius_continuous),
        owning_building_guid = 53
      )
      LocalObject(
        2238,
        Painbox.Constructor(Vector3(5467.861f, 2585.769f, 48.6073f), painbox_door_radius_continuous),
        owning_building_guid = 53
      )
      LocalObject(
        2239,
        Painbox.Constructor(Vector3(5483.641f, 2578.57f, 49.5134f), painbox_door_radius_continuous),
        owning_building_guid = 53
      )
      LocalObject(292, Generator.Constructor(Vector3(5475.975f, 2607.555f, 37.1371f)), owning_building_guid = 53)
      LocalObject(
        279,
        Terminal.Constructor(Vector3(5476.022f, 2599.363f, 38.4311f), gen_control),
        owning_building_guid = 53
      )
    }

    Building53()

    def Building53(): Unit = { // Name: N_Gjallar_Tower Type: tower_a GUID: 56, MapID: 53
      LocalBuilding(
        "N_Gjallar_Tower",
        56,
        53,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(986f, 3016f, 82.00085f), Vector3(0f, 0f, 347f), tower_a)
        )
      )
      LocalObject(
        2525,
        CaptureTerminal.Constructor(Vector3(1002.139f, 3012.168f, 91.99986f), secondary_capture),
        owning_building_guid = 56
      )
      LocalObject(311, Door.Constructor(Vector3(995.8928f, 3005.506f, 83.52186f)), owning_building_guid = 56)
      LocalObject(312, Door.Constructor(Vector3(995.8928f, 3005.506f, 103.5209f)), owning_building_guid = 56)
      LocalObject(313, Door.Constructor(Vector3(999.4921f, 3021.095f, 83.52186f)), owning_building_guid = 56)
      LocalObject(314, Door.Constructor(Vector3(999.4921f, 3021.095f, 103.5209f)), owning_building_guid = 56)
      LocalObject(2642, Door.Constructor(Vector3(994.3395f, 3002.574f, 73.33685f)), owning_building_guid = 56)
      LocalObject(2643, Door.Constructor(Vector3(998.0309f, 3018.563f, 73.33685f)), owning_building_guid = 56)
      LocalObject(
        964,
        IFFLock.Constructor(Vector3(997.6838f, 3022.345f, 83.46185f), Vector3(0, 0, 13)),
        owning_building_guid = 56,
        door_guid = 313
      )
      LocalObject(
        965,
        IFFLock.Constructor(Vector3(997.6838f, 3022.345f, 103.4619f), Vector3(0, 0, 13)),
        owning_building_guid = 56,
        door_guid = 314
      )
      LocalObject(
        966,
        IFFLock.Constructor(Vector3(997.705f, 3004.255f, 83.46185f), Vector3(0, 0, 193)),
        owning_building_guid = 56,
        door_guid = 311
      )
      LocalObject(
        967,
        IFFLock.Constructor(Vector3(997.705f, 3004.255f, 103.4619f), Vector3(0, 0, 193)),
        owning_building_guid = 56,
        door_guid = 312
      )
      LocalObject(1201, Locker.Constructor(Vector3(997.9306f, 2997.813f, 71.99486f)), owning_building_guid = 56)
      LocalObject(1202, Locker.Constructor(Vector3(999.2333f, 2997.512f, 71.99486f)), owning_building_guid = 56)
      LocalObject(1204, Locker.Constructor(Vector3(1001.852f, 2996.908f, 71.99486f)), owning_building_guid = 56)
      LocalObject(1206, Locker.Constructor(Vector3(1002.885f, 3019.117f, 71.99486f)), owning_building_guid = 56)
      LocalObject(1207, Locker.Constructor(Vector3(1003.219f, 2996.592f, 71.99486f)), owning_building_guid = 56)
      LocalObject(1209, Locker.Constructor(Vector3(1004.188f, 3018.816f, 71.99486f)), owning_building_guid = 56)
      LocalObject(1211, Locker.Constructor(Vector3(1006.773f, 3018.219f, 71.99486f)), owning_building_guid = 56)
      LocalObject(1212, Locker.Constructor(Vector3(1008.139f, 3017.904f, 71.99486f)), owning_building_guid = 56)
      LocalObject(
        1773,
        Terminal.Constructor(Vector3(1004.675f, 3001.558f, 73.33286f), order_terminal),
        owning_building_guid = 56
      )
      LocalObject(
        1774,
        Terminal.Constructor(Vector3(1005.963f, 3007.135f, 73.33286f), order_terminal),
        owning_building_guid = 56
      )
      LocalObject(
        1775,
        Terminal.Constructor(Vector3(1007.173f, 3012.378f, 73.33286f), order_terminal),
        owning_building_guid = 56
      )
      LocalObject(
        2440,
        SpawnTube.Constructor(Vector3(993.6741f, 3001.648f, 71.48286f), respawn_tube_tower, Vector3(0, 0, 13)),
        owning_building_guid = 56
      )
      LocalObject(
        2441,
        SpawnTube.Constructor(Vector3(997.3656f, 3017.637f, 71.48286f), respawn_tube_tower, Vector3(0, 0, 13)),
        owning_building_guid = 56
      )
      LocalObject(
        1608,
        FacilityTurret.Constructor(Vector3(970.787f, 3006.473f, 100.9429f), manned_turret),
        owning_building_guid = 56
      )
      TurretToWeapon(1608, 5077)
      LocalObject(
        1609,
        FacilityTurret.Constructor(Vector3(1010.925f, 3023.287f, 100.9429f), manned_turret),
        owning_building_guid = 56
      )
      TurretToWeapon(1609, 5078)
      LocalObject(
        2246,
        Painbox.Constructor(Vector3(989.7068f, 3008.784f, 73.49995f), painbox_radius_continuous),
        owning_building_guid = 56
      )
      LocalObject(
        2247,
        Painbox.Constructor(Vector3(1000.341f, 3002.655f, 72.10085f), painbox_radius_continuous),
        owning_building_guid = 56
      )
      LocalObject(
        2248,
        Painbox.Constructor(Vector3(1002.926f, 3014.233f, 72.10085f), painbox_radius_continuous),
        owning_building_guid = 56
      )
    }

    Building31()

    def Building31(): Unit = { // Name: N_Ymir_Tower Type: tower_a GUID: 57, MapID: 31
      LocalBuilding(
        "N_Ymir_Tower",
        57,
        31,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(1810f, 4194f, 79.81811f), Vector3(0f, 0f, 360f), tower_a)
        )
      )
      LocalObject(
        2527,
        CaptureTerminal.Constructor(Vector3(1826.587f, 4193.897f, 89.81711f), secondary_capture),
        owning_building_guid = 57
      )
      LocalObject(328, Door.Constructor(Vector3(1822f, 4186f, 81.33911f)), owning_building_guid = 57)
      LocalObject(329, Door.Constructor(Vector3(1822f, 4186f, 101.3381f)), owning_building_guid = 57)
      LocalObject(330, Door.Constructor(Vector3(1822f, 4202f, 81.33911f)), owning_building_guid = 57)
      LocalObject(331, Door.Constructor(Vector3(1822f, 4202f, 101.3381f)), owning_building_guid = 57)
      LocalObject(2646, Door.Constructor(Vector3(1821.146f, 4182.794f, 71.15411f)), owning_building_guid = 57)
      LocalObject(2647, Door.Constructor(Vector3(1821.146f, 4199.204f, 71.15411f)), owning_building_guid = 57)
      LocalObject(
        974,
        IFFLock.Constructor(Vector3(1819.957f, 4202.811f, 81.27911f), Vector3(0, 0, 0)),
        owning_building_guid = 57,
        door_guid = 330
      )
      LocalObject(
        975,
        IFFLock.Constructor(Vector3(1819.957f, 4202.811f, 101.2791f), Vector3(0, 0, 0)),
        owning_building_guid = 57,
        door_guid = 331
      )
      LocalObject(
        976,
        IFFLock.Constructor(Vector3(1824.047f, 4185.189f, 81.27911f), Vector3(0, 0, 180)),
        owning_building_guid = 57,
        door_guid = 328
      )
      LocalObject(
        977,
        IFFLock.Constructor(Vector3(1824.047f, 4185.189f, 101.2791f), Vector3(0, 0, 180)),
        owning_building_guid = 57,
        door_guid = 329
      )
      LocalObject(1221, Locker.Constructor(Vector3(1825.716f, 4178.963f, 69.81211f)), owning_building_guid = 57)
      LocalObject(1222, Locker.Constructor(Vector3(1825.751f, 4200.835f, 69.81211f)), owning_building_guid = 57)
      LocalObject(1223, Locker.Constructor(Vector3(1827.053f, 4178.963f, 69.81211f)), owning_building_guid = 57)
      LocalObject(1224, Locker.Constructor(Vector3(1827.088f, 4200.835f, 69.81211f)), owning_building_guid = 57)
      LocalObject(1225, Locker.Constructor(Vector3(1829.741f, 4178.963f, 69.81211f)), owning_building_guid = 57)
      LocalObject(1226, Locker.Constructor(Vector3(1829.741f, 4200.835f, 69.81211f)), owning_building_guid = 57)
      LocalObject(1227, Locker.Constructor(Vector3(1831.143f, 4178.963f, 69.81211f)), owning_building_guid = 57)
      LocalObject(1228, Locker.Constructor(Vector3(1831.143f, 4200.835f, 69.81211f)), owning_building_guid = 57)
      LocalObject(
        1779,
        Terminal.Constructor(Vector3(1831.445f, 4184.129f, 71.15011f), order_terminal),
        owning_building_guid = 57
      )
      LocalObject(
        1780,
        Terminal.Constructor(Vector3(1831.445f, 4189.853f, 71.15011f), order_terminal),
        owning_building_guid = 57
      )
      LocalObject(
        1781,
        Terminal.Constructor(Vector3(1831.445f, 4195.234f, 71.15011f), order_terminal),
        owning_building_guid = 57
      )
      LocalObject(
        2444,
        SpawnTube.Constructor(Vector3(1820.706f, 4181.742f, 69.30011f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 57
      )
      LocalObject(
        2445,
        SpawnTube.Constructor(Vector3(1820.706f, 4198.152f, 69.30011f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 57
      )
      LocalObject(
        1615,
        FacilityTurret.Constructor(Vector3(1797.32f, 4181.295f, 98.76011f), manned_turret),
        owning_building_guid = 57
      )
      TurretToWeapon(1615, 5079)
      LocalObject(
        1616,
        FacilityTurret.Constructor(Vector3(1832.647f, 4206.707f, 98.76011f), manned_turret),
        owning_building_guid = 57
      )
      TurretToWeapon(1616, 5080)
      LocalObject(
        2252,
        Painbox.Constructor(Vector3(1815.235f, 4187.803f, 71.31721f), painbox_radius_continuous),
        owning_building_guid = 57
      )
      LocalObject(
        2253,
        Painbox.Constructor(Vector3(1826.889f, 4196.086f, 69.91811f), painbox_radius_continuous),
        owning_building_guid = 57
      )
      LocalObject(
        2254,
        Painbox.Constructor(Vector3(1826.975f, 4184.223f, 69.91811f), painbox_radius_continuous),
        owning_building_guid = 57
      )
    }

    Building52()

    def Building52(): Unit = { // Name: E_Jarl_Tower Type: tower_a GUID: 58, MapID: 52
      LocalBuilding(
        "E_Jarl_Tower",
        58,
        52,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(2222f, 5656f, 67.37571f), Vector3(0f, 0f, 46f), tower_a)
        )
      )
      LocalObject(
        2528,
        CaptureTerminal.Constructor(Vector3(2233.596f, 5667.86f, 77.37471f), secondary_capture),
        owning_building_guid = 58
      )
      LocalObject(354, Door.Constructor(Vector3(2224.581f, 5670.189f, 68.89671f)), owning_building_guid = 58)
      LocalObject(355, Door.Constructor(Vector3(2224.581f, 5670.189f, 88.89571f)), owning_building_guid = 58)
      LocalObject(356, Door.Constructor(Vector3(2236.091f, 5659.075f, 68.89671f)), owning_building_guid = 58)
      LocalObject(357, Door.Constructor(Vector3(2236.091f, 5659.075f, 88.89571f)), owning_building_guid = 58)
      LocalObject(2654, Door.Constructor(Vector3(2225.999f, 5667.633f, 58.71171f)), owning_building_guid = 58)
      LocalObject(2655, Door.Constructor(Vector3(2237.803f, 5656.233f, 58.71171f)), owning_building_guid = 58)
      LocalObject(
        997,
        IFFLock.Constructor(Vector3(2222.579f, 5669.283f, 68.83671f), Vector3(0, 0, 314)),
        owning_building_guid = 58,
        door_guid = 354
      )
      LocalObject(
        998,
        IFFLock.Constructor(Vector3(2222.579f, 5669.283f, 88.83671f), Vector3(0, 0, 314)),
        owning_building_guid = 58,
        door_guid = 355
      )
      LocalObject(
        999,
        IFFLock.Constructor(Vector3(2238.096f, 5659.984f, 68.83671f), Vector3(0, 0, 134)),
        owning_building_guid = 58,
        door_guid = 356
      )
      LocalObject(
        1000,
        IFFLock.Constructor(Vector3(2238.096f, 5659.984f, 88.83671f), Vector3(0, 0, 134)),
        owning_building_guid = 58,
        door_guid = 357
      )
      LocalObject(1262, Locker.Constructor(Vector3(2228.025f, 5672.078f, 57.36971f)), owning_building_guid = 58)
      LocalObject(1263, Locker.Constructor(Vector3(2228.954f, 5673.04f, 57.36971f)), owning_building_guid = 58)
      LocalObject(1264, Locker.Constructor(Vector3(2230.797f, 5674.948f, 57.36971f)), owning_building_guid = 58)
      LocalObject(1265, Locker.Constructor(Vector3(2231.771f, 5675.957f, 57.36971f)), owning_building_guid = 58)
      LocalObject(1266, Locker.Constructor(Vector3(2243.734f, 5656.859f, 57.36971f)), owning_building_guid = 58)
      LocalObject(1267, Locker.Constructor(Vector3(2244.663f, 5657.821f, 57.36971f)), owning_building_guid = 58)
      LocalObject(1268, Locker.Constructor(Vector3(2246.53f, 5659.755f, 57.36971f)), owning_building_guid = 58)
      LocalObject(1269, Locker.Constructor(Vector3(2247.504f, 5660.763f, 57.36971f)), owning_building_guid = 58)
      LocalObject(
        1793,
        Terminal.Constructor(Vector3(2236.009f, 5672.284f, 58.70771f), order_terminal),
        owning_building_guid = 58
      )
      LocalObject(
        1794,
        Terminal.Constructor(Vector3(2239.88f, 5668.545f, 58.70771f), order_terminal),
        owning_building_guid = 58
      )
      LocalObject(
        1795,
        Terminal.Constructor(Vector3(2243.998f, 5664.569f, 58.70771f), order_terminal),
        owning_building_guid = 58
      )
      LocalObject(
        2452,
        SpawnTube.Constructor(Vector3(2226.45f, 5666.585f, 56.85771f), respawn_tube_tower, Vector3(0, 0, 314)),
        owning_building_guid = 58
      )
      LocalObject(
        2453,
        SpawnTube.Constructor(Vector3(2238.255f, 5655.186f, 56.85771f), respawn_tube_tower, Vector3(0, 0, 314)),
        owning_building_guid = 58
      )
      LocalObject(
        1626,
        FacilityTurret.Constructor(Vector3(2222.331f, 5638.053f, 86.31771f), manned_turret),
        owning_building_guid = 58
      )
      TurretToWeapon(1626, 5081)
      LocalObject(
        1628,
        FacilityTurret.Constructor(Vector3(2228.591f, 5681.118f, 86.31771f), manned_turret),
        owning_building_guid = 58
      )
      TurretToWeapon(1628, 5082)
      LocalObject(
        2255,
        Painbox.Constructor(Vector3(2230.094f, 5655.461f, 58.87481f), painbox_radius_continuous),
        owning_building_guid = 58
      )
      LocalObject(
        2256,
        Painbox.Constructor(Vector3(2232.232f, 5669.598f, 57.47571f), painbox_radius_continuous),
        owning_building_guid = 58
      )
      LocalObject(
        2257,
        Painbox.Constructor(Vector3(2240.825f, 5661.419f, 57.47571f), painbox_radius_continuous),
        owning_building_guid = 58
      )
    }

    Building49()

    def Building49(): Unit = { // Name: N_Ran_Tower Type: tower_a GUID: 59, MapID: 49
      LocalBuilding(
        "N_Ran_Tower",
        59,
        49,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(2298f, 2210f, 85.70513f), Vector3(0f, 0f, 360f), tower_a)
        )
      )
      LocalObject(
        2529,
        CaptureTerminal.Constructor(Vector3(2314.587f, 2209.897f, 95.70413f), secondary_capture),
        owning_building_guid = 59
      )
      LocalObject(364, Door.Constructor(Vector3(2310f, 2202f, 87.22614f)), owning_building_guid = 59)
      LocalObject(365, Door.Constructor(Vector3(2310f, 2202f, 107.2251f)), owning_building_guid = 59)
      LocalObject(366, Door.Constructor(Vector3(2310f, 2218f, 87.22614f)), owning_building_guid = 59)
      LocalObject(367, Door.Constructor(Vector3(2310f, 2218f, 107.2251f)), owning_building_guid = 59)
      LocalObject(2656, Door.Constructor(Vector3(2309.146f, 2198.794f, 77.04113f)), owning_building_guid = 59)
      LocalObject(2657, Door.Constructor(Vector3(2309.146f, 2215.204f, 77.04113f)), owning_building_guid = 59)
      LocalObject(
        1002,
        IFFLock.Constructor(Vector3(2307.957f, 2218.811f, 87.16613f), Vector3(0, 0, 0)),
        owning_building_guid = 59,
        door_guid = 366
      )
      LocalObject(
        1003,
        IFFLock.Constructor(Vector3(2307.957f, 2218.811f, 107.1661f), Vector3(0, 0, 0)),
        owning_building_guid = 59,
        door_guid = 367
      )
      LocalObject(
        1006,
        IFFLock.Constructor(Vector3(2312.047f, 2201.189f, 87.16613f), Vector3(0, 0, 180)),
        owning_building_guid = 59,
        door_guid = 364
      )
      LocalObject(
        1007,
        IFFLock.Constructor(Vector3(2312.047f, 2201.189f, 107.1661f), Vector3(0, 0, 180)),
        owning_building_guid = 59,
        door_guid = 365
      )
      LocalObject(1270, Locker.Constructor(Vector3(2313.716f, 2194.963f, 75.69913f)), owning_building_guid = 59)
      LocalObject(1271, Locker.Constructor(Vector3(2313.751f, 2216.835f, 75.69913f)), owning_building_guid = 59)
      LocalObject(1272, Locker.Constructor(Vector3(2315.053f, 2194.963f, 75.69913f)), owning_building_guid = 59)
      LocalObject(1273, Locker.Constructor(Vector3(2315.088f, 2216.835f, 75.69913f)), owning_building_guid = 59)
      LocalObject(1278, Locker.Constructor(Vector3(2317.741f, 2194.963f, 75.69913f)), owning_building_guid = 59)
      LocalObject(1279, Locker.Constructor(Vector3(2317.741f, 2216.835f, 75.69913f)), owning_building_guid = 59)
      LocalObject(1280, Locker.Constructor(Vector3(2319.143f, 2194.963f, 75.69913f)), owning_building_guid = 59)
      LocalObject(1281, Locker.Constructor(Vector3(2319.143f, 2216.835f, 75.69913f)), owning_building_guid = 59)
      LocalObject(
        1796,
        Terminal.Constructor(Vector3(2319.445f, 2200.129f, 77.03713f), order_terminal),
        owning_building_guid = 59
      )
      LocalObject(
        1797,
        Terminal.Constructor(Vector3(2319.445f, 2205.853f, 77.03713f), order_terminal),
        owning_building_guid = 59
      )
      LocalObject(
        1798,
        Terminal.Constructor(Vector3(2319.445f, 2211.234f, 77.03713f), order_terminal),
        owning_building_guid = 59
      )
      LocalObject(
        2454,
        SpawnTube.Constructor(Vector3(2308.706f, 2197.742f, 75.18713f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 59
      )
      LocalObject(
        2455,
        SpawnTube.Constructor(Vector3(2308.706f, 2214.152f, 75.18713f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 59
      )
      LocalObject(
        1630,
        FacilityTurret.Constructor(Vector3(2285.32f, 2197.295f, 104.6471f), manned_turret),
        owning_building_guid = 59
      )
      TurretToWeapon(1630, 5083)
      LocalObject(
        1632,
        FacilityTurret.Constructor(Vector3(2320.647f, 2222.707f, 104.6471f), manned_turret),
        owning_building_guid = 59
      )
      TurretToWeapon(1632, 5084)
      LocalObject(
        2258,
        Painbox.Constructor(Vector3(2303.235f, 2203.803f, 77.20423f), painbox_radius_continuous),
        owning_building_guid = 59
      )
      LocalObject(
        2260,
        Painbox.Constructor(Vector3(2314.889f, 2212.086f, 75.80513f), painbox_radius_continuous),
        owning_building_guid = 59
      )
      LocalObject(
        2261,
        Painbox.Constructor(Vector3(2314.975f, 2200.223f, 75.80513f), painbox_radius_continuous),
        owning_building_guid = 59
      )
    }

    Building21()

    def Building21(): Unit = { // Name: W_Searhus_Warpgate_Tower Type: tower_a GUID: 60, MapID: 21
      LocalBuilding(
        "W_Searhus_Warpgate_Tower",
        60,
        21,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(2300f, 3034f, 88.18629f), Vector3(0f, 0f, 360f), tower_a)
        )
      )
      LocalObject(
        2530,
        CaptureTerminal.Constructor(Vector3(2316.587f, 3033.897f, 98.18529f), secondary_capture),
        owning_building_guid = 60
      )
      LocalObject(368, Door.Constructor(Vector3(2312f, 3026f, 89.70729f)), owning_building_guid = 60)
      LocalObject(369, Door.Constructor(Vector3(2312f, 3026f, 109.7063f)), owning_building_guid = 60)
      LocalObject(370, Door.Constructor(Vector3(2312f, 3042f, 89.70729f)), owning_building_guid = 60)
      LocalObject(371, Door.Constructor(Vector3(2312f, 3042f, 109.7063f)), owning_building_guid = 60)
      LocalObject(2658, Door.Constructor(Vector3(2311.146f, 3022.794f, 79.52229f)), owning_building_guid = 60)
      LocalObject(2659, Door.Constructor(Vector3(2311.146f, 3039.204f, 79.52229f)), owning_building_guid = 60)
      LocalObject(
        1004,
        IFFLock.Constructor(Vector3(2309.957f, 3042.811f, 89.64729f), Vector3(0, 0, 0)),
        owning_building_guid = 60,
        door_guid = 370
      )
      LocalObject(
        1005,
        IFFLock.Constructor(Vector3(2309.957f, 3042.811f, 109.6473f), Vector3(0, 0, 0)),
        owning_building_guid = 60,
        door_guid = 371
      )
      LocalObject(
        1008,
        IFFLock.Constructor(Vector3(2314.047f, 3025.189f, 89.64729f), Vector3(0, 0, 180)),
        owning_building_guid = 60,
        door_guid = 368
      )
      LocalObject(
        1009,
        IFFLock.Constructor(Vector3(2314.047f, 3025.189f, 109.6473f), Vector3(0, 0, 180)),
        owning_building_guid = 60,
        door_guid = 369
      )
      LocalObject(1274, Locker.Constructor(Vector3(2315.716f, 3018.963f, 78.18029f)), owning_building_guid = 60)
      LocalObject(1275, Locker.Constructor(Vector3(2315.751f, 3040.835f, 78.18029f)), owning_building_guid = 60)
      LocalObject(1276, Locker.Constructor(Vector3(2317.053f, 3018.963f, 78.18029f)), owning_building_guid = 60)
      LocalObject(1277, Locker.Constructor(Vector3(2317.088f, 3040.835f, 78.18029f)), owning_building_guid = 60)
      LocalObject(1282, Locker.Constructor(Vector3(2319.741f, 3018.963f, 78.18029f)), owning_building_guid = 60)
      LocalObject(1283, Locker.Constructor(Vector3(2319.741f, 3040.835f, 78.18029f)), owning_building_guid = 60)
      LocalObject(1284, Locker.Constructor(Vector3(2321.143f, 3018.963f, 78.18029f)), owning_building_guid = 60)
      LocalObject(1285, Locker.Constructor(Vector3(2321.143f, 3040.835f, 78.18029f)), owning_building_guid = 60)
      LocalObject(
        1799,
        Terminal.Constructor(Vector3(2321.445f, 3024.129f, 79.51829f), order_terminal),
        owning_building_guid = 60
      )
      LocalObject(
        1800,
        Terminal.Constructor(Vector3(2321.445f, 3029.853f, 79.51829f), order_terminal),
        owning_building_guid = 60
      )
      LocalObject(
        1801,
        Terminal.Constructor(Vector3(2321.445f, 3035.234f, 79.51829f), order_terminal),
        owning_building_guid = 60
      )
      LocalObject(
        2456,
        SpawnTube.Constructor(Vector3(2310.706f, 3021.742f, 77.66829f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 60
      )
      LocalObject(
        2457,
        SpawnTube.Constructor(Vector3(2310.706f, 3038.152f, 77.66829f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 60
      )
      LocalObject(
        1631,
        FacilityTurret.Constructor(Vector3(2287.32f, 3021.295f, 107.1283f), manned_turret),
        owning_building_guid = 60
      )
      TurretToWeapon(1631, 5085)
      LocalObject(
        1633,
        FacilityTurret.Constructor(Vector3(2322.647f, 3046.707f, 107.1283f), manned_turret),
        owning_building_guid = 60
      )
      TurretToWeapon(1633, 5086)
      LocalObject(
        2259,
        Painbox.Constructor(Vector3(2305.235f, 3027.803f, 79.68539f), painbox_radius_continuous),
        owning_building_guid = 60
      )
      LocalObject(
        2262,
        Painbox.Constructor(Vector3(2316.889f, 3036.086f, 78.28629f), painbox_radius_continuous),
        owning_building_guid = 60
      )
      LocalObject(
        2263,
        Painbox.Constructor(Vector3(2316.975f, 3024.223f, 78.28629f), painbox_radius_continuous),
        owning_building_guid = 60
      )
    }

    Building48()

    def Building48(): Unit = { // Name: E_Freyr_Tower Type: tower_a GUID: 61, MapID: 48
      LocalBuilding(
        "E_Freyr_Tower",
        61,
        48,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(3276f, 3710f, 53.76141f), Vector3(0f, 0f, 0f), tower_a)
        )
      )
      LocalObject(
        2533,
        CaptureTerminal.Constructor(Vector3(3292.587f, 3709.897f, 63.76041f), secondary_capture),
        owning_building_guid = 61
      )
      LocalObject(426, Door.Constructor(Vector3(3288f, 3702f, 55.28241f)), owning_building_guid = 61)
      LocalObject(427, Door.Constructor(Vector3(3288f, 3702f, 75.2814f)), owning_building_guid = 61)
      LocalObject(428, Door.Constructor(Vector3(3288f, 3718f, 55.28241f)), owning_building_guid = 61)
      LocalObject(429, Door.Constructor(Vector3(3288f, 3718f, 75.2814f)), owning_building_guid = 61)
      LocalObject(2673, Door.Constructor(Vector3(3287.146f, 3698.794f, 45.0974f)), owning_building_guid = 61)
      LocalObject(2674, Door.Constructor(Vector3(3287.146f, 3715.204f, 45.0974f)), owning_building_guid = 61)
      LocalObject(
        1049,
        IFFLock.Constructor(Vector3(3285.957f, 3718.811f, 55.2224f), Vector3(0, 0, 0)),
        owning_building_guid = 61,
        door_guid = 428
      )
      LocalObject(
        1050,
        IFFLock.Constructor(Vector3(3285.957f, 3718.811f, 75.2224f), Vector3(0, 0, 0)),
        owning_building_guid = 61,
        door_guid = 429
      )
      LocalObject(
        1052,
        IFFLock.Constructor(Vector3(3290.047f, 3701.189f, 55.2224f), Vector3(0, 0, 180)),
        owning_building_guid = 61,
        door_guid = 426
      )
      LocalObject(
        1053,
        IFFLock.Constructor(Vector3(3290.047f, 3701.189f, 75.2224f), Vector3(0, 0, 180)),
        owning_building_guid = 61,
        door_guid = 427
      )
      LocalObject(1347, Locker.Constructor(Vector3(3291.716f, 3694.963f, 43.75541f)), owning_building_guid = 61)
      LocalObject(1348, Locker.Constructor(Vector3(3291.751f, 3716.835f, 43.75541f)), owning_building_guid = 61)
      LocalObject(1349, Locker.Constructor(Vector3(3293.053f, 3694.963f, 43.75541f)), owning_building_guid = 61)
      LocalObject(1350, Locker.Constructor(Vector3(3293.088f, 3716.835f, 43.75541f)), owning_building_guid = 61)
      LocalObject(1351, Locker.Constructor(Vector3(3295.741f, 3694.963f, 43.75541f)), owning_building_guid = 61)
      LocalObject(1352, Locker.Constructor(Vector3(3295.741f, 3716.835f, 43.75541f)), owning_building_guid = 61)
      LocalObject(1353, Locker.Constructor(Vector3(3297.143f, 3694.963f, 43.75541f)), owning_building_guid = 61)
      LocalObject(1354, Locker.Constructor(Vector3(3297.143f, 3716.835f, 43.75541f)), owning_building_guid = 61)
      LocalObject(
        1826,
        Terminal.Constructor(Vector3(3297.445f, 3700.129f, 45.09341f), order_terminal),
        owning_building_guid = 61
      )
      LocalObject(
        1827,
        Terminal.Constructor(Vector3(3297.445f, 3705.853f, 45.09341f), order_terminal),
        owning_building_guid = 61
      )
      LocalObject(
        1828,
        Terminal.Constructor(Vector3(3297.445f, 3711.234f, 45.09341f), order_terminal),
        owning_building_guid = 61
      )
      LocalObject(
        2471,
        SpawnTube.Constructor(Vector3(3286.706f, 3697.742f, 43.24341f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 61
      )
      LocalObject(
        2472,
        SpawnTube.Constructor(Vector3(3286.706f, 3714.152f, 43.24341f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 61
      )
      LocalObject(
        1652,
        FacilityTurret.Constructor(Vector3(3263.32f, 3697.295f, 72.70341f), manned_turret),
        owning_building_guid = 61
      )
      TurretToWeapon(1652, 5087)
      LocalObject(
        1657,
        FacilityTurret.Constructor(Vector3(3298.647f, 3722.707f, 72.70341f), manned_turret),
        owning_building_guid = 61
      )
      TurretToWeapon(1657, 5088)
      LocalObject(
        2268,
        Painbox.Constructor(Vector3(3281.235f, 3703.803f, 45.26051f), painbox_radius_continuous),
        owning_building_guid = 61
      )
      LocalObject(
        2271,
        Painbox.Constructor(Vector3(3292.889f, 3712.086f, 43.8614f), painbox_radius_continuous),
        owning_building_guid = 61
      )
      LocalObject(
        2272,
        Painbox.Constructor(Vector3(3292.975f, 3700.223f, 43.8614f), painbox_radius_continuous),
        owning_building_guid = 61
      )
    }

    Building22()

    def Building22(): Unit = { // Name: S_Andvari_Tower Type: tower_a GUID: 62, MapID: 22
      LocalBuilding(
        "S_Andvari_Tower",
        62,
        22,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(3320f, 6550f, 91.44566f), Vector3(0f, 0f, 360f), tower_a)
        )
      )
      LocalObject(
        2534,
        CaptureTerminal.Constructor(Vector3(3336.587f, 6549.897f, 101.4447f), secondary_capture),
        owning_building_guid = 62
      )
      LocalObject(435, Door.Constructor(Vector3(3332f, 6542f, 92.96667f)), owning_building_guid = 62)
      LocalObject(436, Door.Constructor(Vector3(3332f, 6542f, 112.9657f)), owning_building_guid = 62)
      LocalObject(437, Door.Constructor(Vector3(3332f, 6558f, 92.96667f)), owning_building_guid = 62)
      LocalObject(438, Door.Constructor(Vector3(3332f, 6558f, 112.9657f)), owning_building_guid = 62)
      LocalObject(2675, Door.Constructor(Vector3(3331.146f, 6538.794f, 82.78166f)), owning_building_guid = 62)
      LocalObject(2676, Door.Constructor(Vector3(3331.146f, 6555.204f, 82.78166f)), owning_building_guid = 62)
      LocalObject(
        1055,
        IFFLock.Constructor(Vector3(3329.957f, 6558.811f, 92.90666f), Vector3(0, 0, 0)),
        owning_building_guid = 62,
        door_guid = 437
      )
      LocalObject(
        1056,
        IFFLock.Constructor(Vector3(3329.957f, 6558.811f, 112.9067f), Vector3(0, 0, 0)),
        owning_building_guid = 62,
        door_guid = 438
      )
      LocalObject(
        1057,
        IFFLock.Constructor(Vector3(3334.047f, 6541.189f, 92.90666f), Vector3(0, 0, 180)),
        owning_building_guid = 62,
        door_guid = 435
      )
      LocalObject(
        1058,
        IFFLock.Constructor(Vector3(3334.047f, 6541.189f, 112.9067f), Vector3(0, 0, 180)),
        owning_building_guid = 62,
        door_guid = 436
      )
      LocalObject(1355, Locker.Constructor(Vector3(3335.716f, 6534.963f, 81.43967f)), owning_building_guid = 62)
      LocalObject(1356, Locker.Constructor(Vector3(3335.751f, 6556.835f, 81.43967f)), owning_building_guid = 62)
      LocalObject(1357, Locker.Constructor(Vector3(3337.053f, 6534.963f, 81.43967f)), owning_building_guid = 62)
      LocalObject(1358, Locker.Constructor(Vector3(3337.088f, 6556.835f, 81.43967f)), owning_building_guid = 62)
      LocalObject(1359, Locker.Constructor(Vector3(3339.741f, 6534.963f, 81.43967f)), owning_building_guid = 62)
      LocalObject(1360, Locker.Constructor(Vector3(3339.741f, 6556.835f, 81.43967f)), owning_building_guid = 62)
      LocalObject(1361, Locker.Constructor(Vector3(3341.143f, 6534.963f, 81.43967f)), owning_building_guid = 62)
      LocalObject(1362, Locker.Constructor(Vector3(3341.143f, 6556.835f, 81.43967f)), owning_building_guid = 62)
      LocalObject(
        1829,
        Terminal.Constructor(Vector3(3341.445f, 6540.129f, 82.77766f), order_terminal),
        owning_building_guid = 62
      )
      LocalObject(
        1830,
        Terminal.Constructor(Vector3(3341.445f, 6545.853f, 82.77766f), order_terminal),
        owning_building_guid = 62
      )
      LocalObject(
        1831,
        Terminal.Constructor(Vector3(3341.445f, 6551.234f, 82.77766f), order_terminal),
        owning_building_guid = 62
      )
      LocalObject(
        2473,
        SpawnTube.Constructor(Vector3(3330.706f, 6537.742f, 80.92767f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 62
      )
      LocalObject(
        2474,
        SpawnTube.Constructor(Vector3(3330.706f, 6554.152f, 80.92767f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 62
      )
      LocalObject(
        1658,
        FacilityTurret.Constructor(Vector3(3307.32f, 6537.295f, 110.3877f), manned_turret),
        owning_building_guid = 62
      )
      TurretToWeapon(1658, 5089)
      LocalObject(
        1659,
        FacilityTurret.Constructor(Vector3(3342.647f, 6562.707f, 110.3877f), manned_turret),
        owning_building_guid = 62
      )
      TurretToWeapon(1659, 5090)
      LocalObject(
        2273,
        Painbox.Constructor(Vector3(3325.235f, 6543.803f, 82.94476f), painbox_radius_continuous),
        owning_building_guid = 62
      )
      LocalObject(
        2274,
        Painbox.Constructor(Vector3(3336.889f, 6552.086f, 81.54566f), painbox_radius_continuous),
        owning_building_guid = 62
      )
      LocalObject(
        2275,
        Painbox.Constructor(Vector3(3336.975f, 6540.223f, 81.54566f), painbox_radius_continuous),
        owning_building_guid = 62
      )
    }

    Building18()

    def Building18(): Unit = { // Name: SE_Eisa_Tower Type: tower_a GUID: 63, MapID: 18
      LocalBuilding(
        "SE_Eisa_Tower",
        63,
        18,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(3644f, 4338f, 103.9521f), Vector3(0f, 0f, 360f), tower_a)
        )
      )
      LocalObject(
        2536,
        CaptureTerminal.Constructor(Vector3(3660.587f, 4337.897f, 113.9511f), secondary_capture),
        owning_building_guid = 63
      )
      LocalObject(456, Door.Constructor(Vector3(3656f, 4330f, 105.4732f)), owning_building_guid = 63)
      LocalObject(457, Door.Constructor(Vector3(3656f, 4330f, 125.4722f)), owning_building_guid = 63)
      LocalObject(458, Door.Constructor(Vector3(3656f, 4346f, 105.4732f)), owning_building_guid = 63)
      LocalObject(459, Door.Constructor(Vector3(3656f, 4346f, 125.4722f)), owning_building_guid = 63)
      LocalObject(2682, Door.Constructor(Vector3(3655.146f, 4326.794f, 95.28815f)), owning_building_guid = 63)
      LocalObject(2683, Door.Constructor(Vector3(3655.146f, 4343.204f, 95.28815f)), owning_building_guid = 63)
      LocalObject(
        1070,
        IFFLock.Constructor(Vector3(3653.957f, 4346.811f, 105.4131f), Vector3(0, 0, 0)),
        owning_building_guid = 63,
        door_guid = 458
      )
      LocalObject(
        1071,
        IFFLock.Constructor(Vector3(3653.957f, 4346.811f, 125.4131f), Vector3(0, 0, 0)),
        owning_building_guid = 63,
        door_guid = 459
      )
      LocalObject(
        1072,
        IFFLock.Constructor(Vector3(3658.047f, 4329.189f, 105.4131f), Vector3(0, 0, 180)),
        owning_building_guid = 63,
        door_guid = 456
      )
      LocalObject(
        1073,
        IFFLock.Constructor(Vector3(3658.047f, 4329.189f, 125.4131f), Vector3(0, 0, 180)),
        owning_building_guid = 63,
        door_guid = 457
      )
      LocalObject(1383, Locker.Constructor(Vector3(3659.716f, 4322.963f, 93.94615f)), owning_building_guid = 63)
      LocalObject(1384, Locker.Constructor(Vector3(3659.751f, 4344.835f, 93.94615f)), owning_building_guid = 63)
      LocalObject(1385, Locker.Constructor(Vector3(3661.053f, 4322.963f, 93.94615f)), owning_building_guid = 63)
      LocalObject(1386, Locker.Constructor(Vector3(3661.088f, 4344.835f, 93.94615f)), owning_building_guid = 63)
      LocalObject(1387, Locker.Constructor(Vector3(3663.741f, 4322.963f, 93.94615f)), owning_building_guid = 63)
      LocalObject(1388, Locker.Constructor(Vector3(3663.741f, 4344.835f, 93.94615f)), owning_building_guid = 63)
      LocalObject(1389, Locker.Constructor(Vector3(3665.143f, 4322.963f, 93.94615f)), owning_building_guid = 63)
      LocalObject(1390, Locker.Constructor(Vector3(3665.143f, 4344.835f, 93.94615f)), owning_building_guid = 63)
      LocalObject(
        1839,
        Terminal.Constructor(Vector3(3665.445f, 4328.129f, 95.28415f), order_terminal),
        owning_building_guid = 63
      )
      LocalObject(
        1840,
        Terminal.Constructor(Vector3(3665.445f, 4333.853f, 95.28415f), order_terminal),
        owning_building_guid = 63
      )
      LocalObject(
        1841,
        Terminal.Constructor(Vector3(3665.445f, 4339.234f, 95.28415f), order_terminal),
        owning_building_guid = 63
      )
      LocalObject(
        2480,
        SpawnTube.Constructor(Vector3(3654.706f, 4325.742f, 93.43415f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 63
      )
      LocalObject(
        2481,
        SpawnTube.Constructor(Vector3(3654.706f, 4342.152f, 93.43415f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 63
      )
      LocalObject(
        1667,
        FacilityTurret.Constructor(Vector3(3631.32f, 4325.295f, 122.8941f), manned_turret),
        owning_building_guid = 63
      )
      TurretToWeapon(1667, 5091)
      LocalObject(
        1670,
        FacilityTurret.Constructor(Vector3(3666.647f, 4350.707f, 122.8941f), manned_turret),
        owning_building_guid = 63
      )
      TurretToWeapon(1670, 5092)
      LocalObject(
        2279,
        Painbox.Constructor(Vector3(3649.235f, 4331.803f, 95.45125f), painbox_radius_continuous),
        owning_building_guid = 63
      )
      LocalObject(
        2280,
        Painbox.Constructor(Vector3(3660.889f, 4340.086f, 94.05215f), painbox_radius_continuous),
        owning_building_guid = 63
      )
      LocalObject(
        2281,
        Painbox.Constructor(Vector3(3660.975f, 4328.223f, 94.05215f), painbox_radius_continuous),
        owning_building_guid = 63
      )
    }

    Building32()

    def Building32(): Unit = { // Name: S_Kvasir_Tower Type: tower_a GUID: 64, MapID: 32
      LocalBuilding(
        "S_Kvasir_Tower",
        64,
        32,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(4126f, 1362f, 62.56905f), Vector3(0f, 0f, 318f), tower_a)
        )
      )
      LocalObject(
        2537,
        CaptureTerminal.Constructor(Vector3(4138.258f, 1350.825f, 72.56805f), secondary_capture),
        owning_building_guid = 64
      )
      LocalObject(505, Door.Constructor(Vector3(4129.564f, 1348.025f, 64.09005f)), owning_building_guid = 64)
      LocalObject(506, Door.Constructor(Vector3(4129.564f, 1348.025f, 84.08905f)), owning_building_guid = 64)
      LocalObject(507, Door.Constructor(Vector3(4140.271f, 1359.916f, 64.09005f)), owning_building_guid = 64)
      LocalObject(508, Door.Constructor(Vector3(4140.271f, 1359.916f, 84.08905f)), owning_building_guid = 64)
      LocalObject(2693, Door.Constructor(Vector3(4126.785f, 1346.214f, 53.90505f)), owning_building_guid = 64)
      LocalObject(2694, Door.Constructor(Vector3(4137.765f, 1358.409f, 53.90505f)), owning_building_guid = 64)
      LocalObject(
        1104,
        IFFLock.Constructor(Vector3(4130.543f, 1346.053f, 64.03005f), Vector3(0, 0, 222)),
        owning_building_guid = 64,
        door_guid = 505
      )
      LocalObject(
        1105,
        IFFLock.Constructor(Vector3(4130.543f, 1346.053f, 84.03005f), Vector3(0, 0, 222)),
        owning_building_guid = 64,
        door_guid = 506
      )
      LocalObject(
        1106,
        IFFLock.Constructor(Vector3(4139.295f, 1361.885f, 64.03005f), Vector3(0, 0, 42)),
        owning_building_guid = 64,
        door_guid = 507
      )
      LocalObject(
        1107,
        IFFLock.Constructor(Vector3(4139.295f, 1361.885f, 84.03005f), Vector3(0, 0, 42)),
        owning_building_guid = 64,
        door_guid = 508
      )
      LocalObject(1427, Locker.Constructor(Vector3(4127.618f, 1340.309f, 52.56305f)), owning_building_guid = 64)
      LocalObject(1428, Locker.Constructor(Vector3(4128.611f, 1339.415f, 52.56305f)), owning_building_guid = 64)
      LocalObject(1429, Locker.Constructor(Vector3(4130.609f, 1337.616f, 52.56305f)), owning_building_guid = 64)
      LocalObject(1430, Locker.Constructor(Vector3(4131.65f, 1336.678f, 52.56305f)), owning_building_guid = 64)
      LocalObject(1431, Locker.Constructor(Vector3(4142.279f, 1356.54f, 52.56305f)), owning_building_guid = 64)
      LocalObject(1432, Locker.Constructor(Vector3(4143.272f, 1355.645f, 52.56305f)), owning_building_guid = 64)
      LocalObject(1433, Locker.Constructor(Vector3(4145.244f, 1353.87f, 52.56305f)), owning_building_guid = 64)
      LocalObject(1434, Locker.Constructor(Vector3(4146.286f, 1352.932f, 52.56305f)), owning_building_guid = 64)
      LocalObject(
        1859,
        Terminal.Constructor(Vector3(4135.332f, 1340.315f, 53.90105f), order_terminal),
        owning_building_guid = 64
      )
      LocalObject(
        1860,
        Terminal.Constructor(Vector3(4139.162f, 1344.569f, 53.90105f), order_terminal),
        owning_building_guid = 64
      )
      LocalObject(
        1861,
        Terminal.Constructor(Vector3(4142.762f, 1348.568f, 53.90105f), order_terminal),
        owning_building_guid = 64
      )
      LocalObject(
        2491,
        SpawnTube.Constructor(Vector3(4125.754f, 1345.727f, 52.05105f), respawn_tube_tower, Vector3(0, 0, 42)),
        owning_building_guid = 64
      )
      LocalObject(
        2492,
        SpawnTube.Constructor(Vector3(4136.734f, 1357.922f, 52.05105f), respawn_tube_tower, Vector3(0, 0, 42)),
        owning_building_guid = 64
      )
      LocalObject(
        1685,
        FacilityTurret.Constructor(Vector3(4108.076f, 1361.043f, 81.51105f), manned_turret),
        owning_building_guid = 64
      )
      TurretToWeapon(1685, 5093)
      LocalObject(
        1688,
        FacilityTurret.Constructor(Vector3(4151.333f, 1356.289f, 81.51105f), manned_turret),
        owning_building_guid = 64
      )
      TurretToWeapon(1688, 5094)
      LocalObject(
        2282,
        Painbox.Constructor(Vector3(4125.744f, 1353.892f, 54.06815f), painbox_radius_continuous),
        owning_building_guid = 64
      )
      LocalObject(
        2283,
        Painbox.Constructor(Vector3(4132.073f, 1343.375f, 52.66905f), painbox_radius_continuous),
        owning_building_guid = 64
      )
      LocalObject(
        2284,
        Painbox.Constructor(Vector3(4139.947f, 1352.249f, 52.66905f), painbox_radius_continuous),
        owning_building_guid = 64
      )
    }

    Building46()

    def Building46(): Unit = { // Name: N_Mani_Tower Type: tower_a GUID: 65, MapID: 46
      LocalBuilding(
        "N_Mani_Tower",
        65,
        46,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(4968f, 5154f, 47.77367f), Vector3(0f, 0f, 360f), tower_a)
        )
      )
      LocalObject(
        2541,
        CaptureTerminal.Constructor(Vector3(4984.587f, 5153.897f, 57.77267f), secondary_capture),
        owning_building_guid = 65
      )
      LocalObject(528, Door.Constructor(Vector3(4980f, 5146f, 49.29467f)), owning_building_guid = 65)
      LocalObject(529, Door.Constructor(Vector3(4980f, 5146f, 69.29367f)), owning_building_guid = 65)
      LocalObject(530, Door.Constructor(Vector3(4980f, 5162f, 49.29467f)), owning_building_guid = 65)
      LocalObject(531, Door.Constructor(Vector3(4980f, 5162f, 69.29367f)), owning_building_guid = 65)
      LocalObject(2701, Door.Constructor(Vector3(4979.146f, 5142.794f, 39.10967f)), owning_building_guid = 65)
      LocalObject(2702, Door.Constructor(Vector3(4979.146f, 5159.204f, 39.10967f)), owning_building_guid = 65)
      LocalObject(
        1125,
        IFFLock.Constructor(Vector3(4977.957f, 5162.811f, 49.23467f), Vector3(0, 0, 0)),
        owning_building_guid = 65,
        door_guid = 530
      )
      LocalObject(
        1126,
        IFFLock.Constructor(Vector3(4977.957f, 5162.811f, 69.23467f), Vector3(0, 0, 0)),
        owning_building_guid = 65,
        door_guid = 531
      )
      LocalObject(
        1127,
        IFFLock.Constructor(Vector3(4982.047f, 5145.189f, 49.23467f), Vector3(0, 0, 180)),
        owning_building_guid = 65,
        door_guid = 528
      )
      LocalObject(
        1128,
        IFFLock.Constructor(Vector3(4982.047f, 5145.189f, 69.23467f), Vector3(0, 0, 180)),
        owning_building_guid = 65,
        door_guid = 529
      )
      LocalObject(1459, Locker.Constructor(Vector3(4983.716f, 5138.963f, 37.76767f)), owning_building_guid = 65)
      LocalObject(1460, Locker.Constructor(Vector3(4983.751f, 5160.835f, 37.76767f)), owning_building_guid = 65)
      LocalObject(1461, Locker.Constructor(Vector3(4985.053f, 5138.963f, 37.76767f)), owning_building_guid = 65)
      LocalObject(1462, Locker.Constructor(Vector3(4985.088f, 5160.835f, 37.76767f)), owning_building_guid = 65)
      LocalObject(1463, Locker.Constructor(Vector3(4987.741f, 5138.963f, 37.76767f)), owning_building_guid = 65)
      LocalObject(1464, Locker.Constructor(Vector3(4987.741f, 5160.835f, 37.76767f)), owning_building_guid = 65)
      LocalObject(1465, Locker.Constructor(Vector3(4989.143f, 5138.963f, 37.76767f)), owning_building_guid = 65)
      LocalObject(1466, Locker.Constructor(Vector3(4989.143f, 5160.835f, 37.76767f)), owning_building_guid = 65)
      LocalObject(
        1871,
        Terminal.Constructor(Vector3(4989.445f, 5144.129f, 39.10567f), order_terminal),
        owning_building_guid = 65
      )
      LocalObject(
        1872,
        Terminal.Constructor(Vector3(4989.445f, 5149.853f, 39.10567f), order_terminal),
        owning_building_guid = 65
      )
      LocalObject(
        1873,
        Terminal.Constructor(Vector3(4989.445f, 5155.234f, 39.10567f), order_terminal),
        owning_building_guid = 65
      )
      LocalObject(
        2499,
        SpawnTube.Constructor(Vector3(4978.706f, 5141.742f, 37.25568f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 65
      )
      LocalObject(
        2500,
        SpawnTube.Constructor(Vector3(4978.706f, 5158.152f, 37.25568f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 65
      )
      LocalObject(
        1693,
        FacilityTurret.Constructor(Vector3(4955.32f, 5141.295f, 66.71568f), manned_turret),
        owning_building_guid = 65
      )
      TurretToWeapon(1693, 5095)
      LocalObject(
        1694,
        FacilityTurret.Constructor(Vector3(4990.647f, 5166.707f, 66.71568f), manned_turret),
        owning_building_guid = 65
      )
      TurretToWeapon(1694, 5096)
      LocalObject(
        2294,
        Painbox.Constructor(Vector3(4973.235f, 5147.803f, 39.27277f), painbox_radius_continuous),
        owning_building_guid = 65
      )
      LocalObject(
        2295,
        Painbox.Constructor(Vector3(4984.889f, 5156.086f, 37.87367f), painbox_radius_continuous),
        owning_building_guid = 65
      )
      LocalObject(
        2296,
        Painbox.Constructor(Vector3(4984.975f, 5144.223f, 37.87367f), painbox_radius_continuous),
        owning_building_guid = 65
      )
    }

    Building50()

    def Building50(): Unit = { // Name: E_Helhiem_Tower Type: tower_a GUID: 66, MapID: 50
      LocalBuilding(
        "E_Helhiem_Tower",
        66,
        50,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(5672f, 2702f, 52.44301f), Vector3(0f, 0f, 327f), tower_a)
        )
      )
      LocalObject(
        2543,
        CaptureTerminal.Constructor(Vector3(5685.855f, 2692.88f, 62.44201f), secondary_capture),
        owning_building_guid = 66
      )
      LocalObject(558, Door.Constructor(Vector3(5677.707f, 2688.755f, 53.96401f)), owning_building_guid = 66)
      LocalObject(559, Door.Constructor(Vector3(5677.707f, 2688.755f, 73.96301f)), owning_building_guid = 66)
      LocalObject(560, Door.Constructor(Vector3(5686.421f, 2702.174f, 53.96401f)), owning_building_guid = 66)
      LocalObject(561, Door.Constructor(Vector3(5686.421f, 2702.174f, 73.96301f)), owning_building_guid = 66)
      LocalObject(2711, Door.Constructor(Vector3(5675.245f, 2686.531f, 43.77901f)), owning_building_guid = 66)
      LocalObject(2712, Door.Constructor(Vector3(5684.182f, 2700.294f, 43.77901f)), owning_building_guid = 66)
      LocalObject(
        1148,
        IFFLock.Constructor(Vector3(5678.982f, 2686.96f, 53.90401f), Vector3(0, 0, 213)),
        owning_building_guid = 66,
        door_guid = 558
      )
      LocalObject(
        1149,
        IFFLock.Constructor(Vector3(5678.982f, 2686.96f, 73.90401f), Vector3(0, 0, 213)),
        owning_building_guid = 66,
        door_guid = 559
      )
      LocalObject(
        1150,
        IFFLock.Constructor(Vector3(5685.149f, 2703.967f, 53.90401f), Vector3(0, 0, 33)),
        owning_building_guid = 66,
        door_guid = 560
      )
      LocalObject(
        1151,
        IFFLock.Constructor(Vector3(5685.149f, 2703.967f, 73.90401f), Vector3(0, 0, 33)),
        owning_building_guid = 66,
        door_guid = 561
      )
      LocalObject(1508, Locker.Constructor(Vector3(5676.991f, 2680.829f, 42.43701f)), owning_building_guid = 66)
      LocalObject(1509, Locker.Constructor(Vector3(5678.112f, 2680.101f, 42.43701f)), owning_building_guid = 66)
      LocalObject(1510, Locker.Constructor(Vector3(5680.367f, 2678.637f, 42.43701f)), owning_building_guid = 66)
      LocalObject(1511, Locker.Constructor(Vector3(5681.542f, 2677.874f, 42.43701f)), owning_building_guid = 66)
      LocalObject(1512, Locker.Constructor(Vector3(5688.933f, 2699.154f, 42.43701f)), owning_building_guid = 66)
      LocalObject(1513, Locker.Constructor(Vector3(5690.054f, 2698.426f, 42.43701f)), owning_building_guid = 66)
      LocalObject(1514, Locker.Constructor(Vector3(5692.279f, 2696.981f, 42.43701f)), owning_building_guid = 66)
      LocalObject(1515, Locker.Constructor(Vector3(5693.455f, 2696.217f, 42.43701f)), owning_building_guid = 66)
      LocalObject(
        1885,
        Terminal.Constructor(Vector3(5684.609f, 2682.042f, 43.77501f), order_terminal),
        owning_building_guid = 66
      )
      LocalObject(
        1886,
        Terminal.Constructor(Vector3(5687.727f, 2686.842f, 43.77501f), order_terminal),
        owning_building_guid = 66
      )
      LocalObject(
        1887,
        Terminal.Constructor(Vector3(5690.657f, 2691.355f, 43.77501f), order_terminal),
        owning_building_guid = 66
      )
      LocalObject(
        2509,
        SpawnTube.Constructor(Vector3(5674.303f, 2685.889f, 41.92501f), respawn_tube_tower, Vector3(0, 0, 33)),
        owning_building_guid = 66
      )
      LocalObject(
        2510,
        SpawnTube.Constructor(Vector3(5683.24f, 2699.651f, 41.92501f), respawn_tube_tower, Vector3(0, 0, 33)),
        owning_building_guid = 66
      )
      LocalObject(
        1706,
        FacilityTurret.Constructor(Vector3(5654.446f, 2698.251f, 71.38501f), manned_turret),
        owning_building_guid = 66
      )
      TurretToWeapon(1706, 5097)
      LocalObject(
        1707,
        FacilityTurret.Constructor(Vector3(5697.914f, 2700.323f, 71.38501f), manned_turret),
        owning_building_guid = 66
      )
      TurretToWeapon(1707, 5098)
      LocalObject(
        2300,
        Painbox.Constructor(Vector3(5673.015f, 2693.952f, 43.94211f), painbox_radius_continuous),
        owning_building_guid = 66
      )
      LocalObject(
        2301,
        Painbox.Constructor(Vector3(5680.911f, 2684.555f, 42.54301f), painbox_radius_continuous),
        owning_building_guid = 66
      )
      LocalObject(
        2302,
        Painbox.Constructor(Vector3(5687.301f, 2694.551f, 42.54301f), painbox_radius_continuous),
        owning_building_guid = 66
      )
    }

    Building19()

    def Building19(): Unit = { // Name: E_Oshur_Warpgate_Tower Type: tower_a GUID: 67, MapID: 19
      LocalBuilding(
        "E_Oshur_Warpgate_Tower",
        67,
        19,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(5916f, 3990f, 56.33412f), Vector3(0f, 0f, 360f), tower_a)
        )
      )
      LocalObject(
        2545,
        CaptureTerminal.Constructor(Vector3(5932.587f, 3989.897f, 66.33311f), secondary_capture),
        owning_building_guid = 67
      )
      LocalObject(568, Door.Constructor(Vector3(5928f, 3982f, 57.85512f)), owning_building_guid = 67)
      LocalObject(569, Door.Constructor(Vector3(5928f, 3982f, 77.85412f)), owning_building_guid = 67)
      LocalObject(570, Door.Constructor(Vector3(5928f, 3998f, 57.85512f)), owning_building_guid = 67)
      LocalObject(571, Door.Constructor(Vector3(5928f, 3998f, 77.85412f)), owning_building_guid = 67)
      LocalObject(2715, Door.Constructor(Vector3(5927.146f, 3978.794f, 47.67012f)), owning_building_guid = 67)
      LocalObject(2716, Door.Constructor(Vector3(5927.146f, 3995.204f, 47.67012f)), owning_building_guid = 67)
      LocalObject(
        1158,
        IFFLock.Constructor(Vector3(5925.957f, 3998.811f, 57.79512f), Vector3(0, 0, 0)),
        owning_building_guid = 67,
        door_guid = 570
      )
      LocalObject(
        1159,
        IFFLock.Constructor(Vector3(5925.957f, 3998.811f, 77.79512f), Vector3(0, 0, 0)),
        owning_building_guid = 67,
        door_guid = 571
      )
      LocalObject(
        1160,
        IFFLock.Constructor(Vector3(5930.047f, 3981.189f, 57.79512f), Vector3(0, 0, 180)),
        owning_building_guid = 67,
        door_guid = 568
      )
      LocalObject(
        1161,
        IFFLock.Constructor(Vector3(5930.047f, 3981.189f, 77.79512f), Vector3(0, 0, 180)),
        owning_building_guid = 67,
        door_guid = 569
      )
      LocalObject(1524, Locker.Constructor(Vector3(5931.716f, 3974.963f, 46.32812f)), owning_building_guid = 67)
      LocalObject(1525, Locker.Constructor(Vector3(5931.751f, 3996.835f, 46.32812f)), owning_building_guid = 67)
      LocalObject(1526, Locker.Constructor(Vector3(5933.053f, 3974.963f, 46.32812f)), owning_building_guid = 67)
      LocalObject(1527, Locker.Constructor(Vector3(5933.088f, 3996.835f, 46.32812f)), owning_building_guid = 67)
      LocalObject(1528, Locker.Constructor(Vector3(5935.741f, 3974.963f, 46.32812f)), owning_building_guid = 67)
      LocalObject(1529, Locker.Constructor(Vector3(5935.741f, 3996.835f, 46.32812f)), owning_building_guid = 67)
      LocalObject(1530, Locker.Constructor(Vector3(5937.143f, 3974.963f, 46.32812f)), owning_building_guid = 67)
      LocalObject(1531, Locker.Constructor(Vector3(5937.143f, 3996.835f, 46.32812f)), owning_building_guid = 67)
      LocalObject(
        1891,
        Terminal.Constructor(Vector3(5937.445f, 3980.129f, 47.66612f), order_terminal),
        owning_building_guid = 67
      )
      LocalObject(
        1892,
        Terminal.Constructor(Vector3(5937.445f, 3985.853f, 47.66612f), order_terminal),
        owning_building_guid = 67
      )
      LocalObject(
        1893,
        Terminal.Constructor(Vector3(5937.445f, 3991.234f, 47.66612f), order_terminal),
        owning_building_guid = 67
      )
      LocalObject(
        2513,
        SpawnTube.Constructor(Vector3(5926.706f, 3977.742f, 45.81612f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 67
      )
      LocalObject(
        2514,
        SpawnTube.Constructor(Vector3(5926.706f, 3994.152f, 45.81612f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 67
      )
      LocalObject(
        1708,
        FacilityTurret.Constructor(Vector3(5903.32f, 3977.295f, 75.27612f), manned_turret),
        owning_building_guid = 67
      )
      TurretToWeapon(1708, 5099)
      LocalObject(
        1709,
        FacilityTurret.Constructor(Vector3(5938.647f, 4002.707f, 75.27612f), manned_turret),
        owning_building_guid = 67
      )
      TurretToWeapon(1709, 5100)
      LocalObject(
        2306,
        Painbox.Constructor(Vector3(5921.235f, 3983.803f, 47.83322f), painbox_radius_continuous),
        owning_building_guid = 67
      )
      LocalObject(
        2307,
        Painbox.Constructor(Vector3(5932.889f, 3992.086f, 46.43412f), painbox_radius_continuous),
        owning_building_guid = 67
      )
      LocalObject(
        2308,
        Painbox.Constructor(Vector3(5932.975f, 3980.223f, 46.43412f), painbox_radius_continuous),
        owning_building_guid = 67
      )
    }

    Building23()

    def Building23(): Unit = { // Name: Outpost_Tower Type: tower_a GUID: 68, MapID: 23
      LocalBuilding(
        "Outpost_Tower",
        68,
        23,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(6334f, 5258f, 58.87936f), Vector3(0f, 0f, 346f), tower_a)
        )
      )
      LocalObject(
        2546,
        CaptureTerminal.Constructor(Vector3(6350.069f, 5253.887f, 68.87836f), secondary_capture),
        owning_building_guid = 68
      )
      LocalObject(572, Door.Constructor(Vector3(6343.708f, 5247.334f, 60.40036f)), owning_building_guid = 68)
      LocalObject(573, Door.Constructor(Vector3(6343.708f, 5247.334f, 80.39936f)), owning_building_guid = 68)
      LocalObject(574, Door.Constructor(Vector3(6347.579f, 5262.859f, 60.40036f)), owning_building_guid = 68)
      LocalObject(575, Door.Constructor(Vector3(6347.579f, 5262.859f, 80.39936f)), owning_building_guid = 68)
      LocalObject(2717, Door.Constructor(Vector3(6342.104f, 5244.43f, 50.21536f)), owning_building_guid = 68)
      LocalObject(2718, Door.Constructor(Vector3(6346.074f, 5260.353f, 50.21536f)), owning_building_guid = 68)
      LocalObject(
        1162,
        IFFLock.Constructor(Vector3(6345.498f, 5246.052f, 60.34036f), Vector3(0, 0, 194)),
        owning_building_guid = 68,
        door_guid = 572
      )
      LocalObject(
        1163,
        IFFLock.Constructor(Vector3(6345.498f, 5246.052f, 80.34036f), Vector3(0, 0, 194)),
        owning_building_guid = 68,
        door_guid = 573
      )
      LocalObject(
        1164,
        IFFLock.Constructor(Vector3(6345.793f, 5264.141f, 60.34036f), Vector3(0, 0, 14)),
        owning_building_guid = 68,
        door_guid = 574
      )
      LocalObject(
        1165,
        IFFLock.Constructor(Vector3(6345.793f, 5264.141f, 80.34036f), Vector3(0, 0, 14)),
        owning_building_guid = 68,
        door_guid = 575
      )
      LocalObject(1532, Locker.Constructor(Vector3(6345.611f, 5239.607f, 48.87336f)), owning_building_guid = 68)
      LocalObject(1533, Locker.Constructor(Vector3(6346.909f, 5239.284f, 48.87336f)), owning_building_guid = 68)
      LocalObject(1534, Locker.Constructor(Vector3(6349.517f, 5238.634f, 48.87336f)), owning_building_guid = 68)
      LocalObject(1535, Locker.Constructor(Vector3(6350.877f, 5238.295f, 48.87336f)), owning_building_guid = 68)
      LocalObject(1536, Locker.Constructor(Vector3(6350.937f, 5260.821f, 48.87336f)), owning_building_guid = 68)
      LocalObject(1537, Locker.Constructor(Vector3(6352.234f, 5260.498f, 48.87336f)), owning_building_guid = 68)
      LocalObject(1538, Locker.Constructor(Vector3(6354.808f, 5259.856f, 48.87336f)), owning_building_guid = 68)
      LocalObject(1539, Locker.Constructor(Vector3(6356.168f, 5259.517f, 48.87336f)), owning_building_guid = 68)
      LocalObject(
        1894,
        Terminal.Constructor(Vector3(6352.42f, 5243.234f, 50.21136f), order_terminal),
        owning_building_guid = 68
      )
      LocalObject(
        1895,
        Terminal.Constructor(Vector3(6353.805f, 5248.788f, 50.21136f), order_terminal),
        owning_building_guid = 68
      )
      LocalObject(
        1896,
        Terminal.Constructor(Vector3(6355.106f, 5254.009f, 50.21136f), order_terminal),
        owning_building_guid = 68
      )
      LocalObject(
        2515,
        SpawnTube.Constructor(Vector3(6341.422f, 5243.516f, 48.36136f), respawn_tube_tower, Vector3(0, 0, 14)),
        owning_building_guid = 68
      )
      LocalObject(
        2516,
        SpawnTube.Constructor(Vector3(6345.393f, 5259.438f, 48.36136f), respawn_tube_tower, Vector3(0, 0, 14)),
        owning_building_guid = 68
      )
      LocalObject(
        1710,
        FacilityTurret.Constructor(Vector3(6318.623f, 5248.74f, 77.82136f), manned_turret),
        owning_building_guid = 68
      )
      TurretToWeapon(1710, 5101)
      LocalObject(
        1711,
        FacilityTurret.Constructor(Vector3(6359.048f, 5264.851f, 77.82136f), manned_turret),
        owning_building_guid = 68
      )
      TurretToWeapon(1711, 5102)
      LocalObject(
        2309,
        Painbox.Constructor(Vector3(6337.58f, 5250.721f, 50.37846f), painbox_radius_continuous),
        owning_building_guid = 68
      )
      LocalObject(
        2310,
        Painbox.Constructor(Vector3(6348.105f, 5244.406f, 48.97936f), painbox_radius_continuous),
        owning_building_guid = 68
      )
      LocalObject(
        2311,
        Painbox.Constructor(Vector3(6350.892f, 5255.938f, 48.97936f), painbox_radius_continuous),
        owning_building_guid = 68
      )
    }

    Building20()

    def Building20(): Unit = { // Name: NE_VSSanc_Warpgate_Tower Type: tower_a GUID: 69, MapID: 20
      LocalBuilding(
        "NE_VSSanc_Warpgate_Tower",
        69,
        20,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(6928f, 1758f, 78.24335f), Vector3(0f, 0f, 360f), tower_a)
        )
      )
      LocalObject(
        2547,
        CaptureTerminal.Constructor(Vector3(6944.587f, 1757.897f, 88.24236f), secondary_capture),
        owning_building_guid = 69
      )
      LocalObject(593, Door.Constructor(Vector3(6940f, 1750f, 79.76436f)), owning_building_guid = 69)
      LocalObject(594, Door.Constructor(Vector3(6940f, 1750f, 99.76335f)), owning_building_guid = 69)
      LocalObject(595, Door.Constructor(Vector3(6940f, 1766f, 79.76436f)), owning_building_guid = 69)
      LocalObject(596, Door.Constructor(Vector3(6940f, 1766f, 99.76335f)), owning_building_guid = 69)
      LocalObject(2722, Door.Constructor(Vector3(6939.146f, 1746.794f, 69.57935f)), owning_building_guid = 69)
      LocalObject(2723, Door.Constructor(Vector3(6939.146f, 1763.204f, 69.57935f)), owning_building_guid = 69)
      LocalObject(
        1177,
        IFFLock.Constructor(Vector3(6937.957f, 1766.811f, 79.70435f), Vector3(0, 0, 0)),
        owning_building_guid = 69,
        door_guid = 595
      )
      LocalObject(
        1178,
        IFFLock.Constructor(Vector3(6937.957f, 1766.811f, 99.70435f), Vector3(0, 0, 0)),
        owning_building_guid = 69,
        door_guid = 596
      )
      LocalObject(
        1179,
        IFFLock.Constructor(Vector3(6942.047f, 1749.189f, 79.70435f), Vector3(0, 0, 180)),
        owning_building_guid = 69,
        door_guid = 593
      )
      LocalObject(
        1180,
        IFFLock.Constructor(Vector3(6942.047f, 1749.189f, 99.70435f), Vector3(0, 0, 180)),
        owning_building_guid = 69,
        door_guid = 594
      )
      LocalObject(1552, Locker.Constructor(Vector3(6943.716f, 1742.963f, 68.23736f)), owning_building_guid = 69)
      LocalObject(1553, Locker.Constructor(Vector3(6943.751f, 1764.835f, 68.23736f)), owning_building_guid = 69)
      LocalObject(1554, Locker.Constructor(Vector3(6945.053f, 1742.963f, 68.23736f)), owning_building_guid = 69)
      LocalObject(1555, Locker.Constructor(Vector3(6945.088f, 1764.835f, 68.23736f)), owning_building_guid = 69)
      LocalObject(1556, Locker.Constructor(Vector3(6947.741f, 1742.963f, 68.23736f)), owning_building_guid = 69)
      LocalObject(1557, Locker.Constructor(Vector3(6947.741f, 1764.835f, 68.23736f)), owning_building_guid = 69)
      LocalObject(1558, Locker.Constructor(Vector3(6949.143f, 1742.963f, 68.23736f)), owning_building_guid = 69)
      LocalObject(1559, Locker.Constructor(Vector3(6949.143f, 1764.835f, 68.23736f)), owning_building_guid = 69)
      LocalObject(
        1903,
        Terminal.Constructor(Vector3(6949.445f, 1748.129f, 69.57536f), order_terminal),
        owning_building_guid = 69
      )
      LocalObject(
        1904,
        Terminal.Constructor(Vector3(6949.445f, 1753.853f, 69.57536f), order_terminal),
        owning_building_guid = 69
      )
      LocalObject(
        1905,
        Terminal.Constructor(Vector3(6949.445f, 1759.234f, 69.57536f), order_terminal),
        owning_building_guid = 69
      )
      LocalObject(
        2520,
        SpawnTube.Constructor(Vector3(6938.706f, 1745.742f, 67.72536f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 69
      )
      LocalObject(
        2521,
        SpawnTube.Constructor(Vector3(6938.706f, 1762.152f, 67.72536f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 69
      )
      LocalObject(
        1717,
        FacilityTurret.Constructor(Vector3(6915.32f, 1745.295f, 97.18536f), manned_turret),
        owning_building_guid = 69
      )
      TurretToWeapon(1717, 5103)
      LocalObject(
        1719,
        FacilityTurret.Constructor(Vector3(6950.647f, 1770.707f, 97.18536f), manned_turret),
        owning_building_guid = 69
      )
      TurretToWeapon(1719, 5104)
      LocalObject(
        2312,
        Painbox.Constructor(Vector3(6933.235f, 1751.803f, 69.74245f), painbox_radius_continuous),
        owning_building_guid = 69
      )
      LocalObject(
        2313,
        Painbox.Constructor(Vector3(6944.889f, 1760.086f, 68.34335f), painbox_radius_continuous),
        owning_building_guid = 69
      )
      LocalObject(
        2314,
        Painbox.Constructor(Vector3(6944.975f, 1748.223f, 68.34335f), painbox_radius_continuous),
        owning_building_guid = 69
      )
    }

    Building47()

    def Building47(): Unit = { // Name: SE_Nott_Tower Type: tower_a GUID: 70, MapID: 47
      LocalBuilding(
        "SE_Nott_Tower",
        70,
        47,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(7018f, 4124f, 47.17856f), Vector3(0f, 0f, 338f), tower_a)
        )
      )
      LocalObject(
        2548,
        CaptureTerminal.Constructor(Vector3(7033.341f, 4117.691f, 57.17756f), secondary_capture),
        owning_building_guid = 70
      )
      LocalObject(597, Door.Constructor(Vector3(7026.129f, 4112.087f, 48.69956f)), owning_building_guid = 70)
      LocalObject(598, Door.Constructor(Vector3(7026.129f, 4112.087f, 68.69856f)), owning_building_guid = 70)
      LocalObject(599, Door.Constructor(Vector3(7032.123f, 4126.922f, 48.69956f)), owning_building_guid = 70)
      LocalObject(600, Door.Constructor(Vector3(7032.123f, 4126.922f, 68.69856f)), owning_building_guid = 70)
      LocalObject(2724, Door.Constructor(Vector3(7024.137f, 4109.435f, 38.51456f)), owning_building_guid = 70)
      LocalObject(2725, Door.Constructor(Vector3(7030.284f, 4124.65f, 38.51456f)), owning_building_guid = 70)
      LocalObject(
        1181,
        IFFLock.Constructor(Vector3(7027.724f, 4110.568f, 48.63956f), Vector3(0, 0, 202)),
        owning_building_guid = 70,
        door_guid = 597
      )
      LocalObject(
        1182,
        IFFLock.Constructor(Vector3(7027.724f, 4110.568f, 68.63956f), Vector3(0, 0, 202)),
        owning_building_guid = 70,
        door_guid = 598
      )
      LocalObject(
        1183,
        IFFLock.Constructor(Vector3(7030.533f, 4128.439f, 48.63956f), Vector3(0, 0, 22)),
        owning_building_guid = 70,
        door_guid = 599
      )
      LocalObject(
        1184,
        IFFLock.Constructor(Vector3(7030.533f, 4128.439f, 68.63956f), Vector3(0, 0, 22)),
        owning_building_guid = 70,
        door_guid = 600
      )
      LocalObject(1560, Locker.Constructor(Vector3(7026.938f, 4104.17f, 37.17256f)), owning_building_guid = 70)
      LocalObject(1561, Locker.Constructor(Vector3(7028.178f, 4103.67f, 37.17256f)), owning_building_guid = 70)
      LocalObject(1562, Locker.Constructor(Vector3(7030.67f, 4102.663f, 37.17256f)), owning_building_guid = 70)
      LocalObject(1563, Locker.Constructor(Vector3(7031.971f, 4102.138f, 37.17256f)), owning_building_guid = 70)
      LocalObject(1564, Locker.Constructor(Vector3(7035.165f, 4124.437f, 37.17256f)), owning_building_guid = 70)
      LocalObject(1565, Locker.Constructor(Vector3(7036.404f, 4123.936f, 37.17256f)), owning_building_guid = 70)
      LocalObject(1566, Locker.Constructor(Vector3(7038.864f, 4122.942f, 37.17256f)), owning_building_guid = 70)
      LocalObject(1567, Locker.Constructor(Vector3(7040.164f, 4122.417f, 37.17256f)), owning_building_guid = 70)
      LocalObject(
        1906,
        Terminal.Constructor(Vector3(7034.186f, 4106.814f, 38.51056f), order_terminal),
        owning_building_guid = 70
      )
      LocalObject(
        1907,
        Terminal.Constructor(Vector3(7036.33f, 4112.122f, 38.51056f), order_terminal),
        owning_building_guid = 70
      )
      LocalObject(
        1908,
        Terminal.Constructor(Vector3(7038.346f, 4117.111f, 38.51056f), order_terminal),
        owning_building_guid = 70
      )
      LocalObject(
        2522,
        SpawnTube.Constructor(Vector3(7023.334f, 4108.624f, 36.66056f), respawn_tube_tower, Vector3(0, 0, 22)),
        owning_building_guid = 70
      )
      LocalObject(
        2523,
        SpawnTube.Constructor(Vector3(7029.482f, 4123.839f, 36.66056f), respawn_tube_tower, Vector3(0, 0, 22)),
        owning_building_guid = 70
      )
      LocalObject(
        1720,
        FacilityTurret.Constructor(Vector3(7001.484f, 4116.97f, 66.12056f), manned_turret),
        owning_building_guid = 70
      )
      TurretToWeapon(1720, 5105)
      LocalObject(
        1721,
        FacilityTurret.Constructor(Vector3(7043.758f, 4127.298f, 66.12056f), manned_turret),
        owning_building_guid = 70
      )
      TurretToWeapon(1721, 5106)
      LocalObject(
        2315,
        Painbox.Constructor(Vector3(7020.532f, 4116.293f, 38.67766f), painbox_radius_continuous),
        owning_building_guid = 70
      )
      LocalObject(
        2316,
        Painbox.Constructor(Vector3(7030.076f, 4108.576f, 37.27856f), painbox_radius_continuous),
        owning_building_guid = 70
      )
      LocalObject(
        2317,
        Painbox.Constructor(Vector3(7034.441f, 4119.607f, 37.27856f), painbox_radius_continuous),
        owning_building_guid = 70
      )
    }

    Building41()

    def Building41(): Unit = { // Name: N_NCSanc_Warpgate_Tower Type: tower_b GUID: 71, MapID: 41
      LocalBuilding(
        "N_NCSanc_Warpgate_Tower",
        71,
        41,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(754f, 6932f, 44.69741f), Vector3(0f, 0f, 30f), tower_b)
        )
      )
      LocalObject(
        2524,
        CaptureTerminal.Constructor(Vector3(768.4163f, 6940.204f, 64.69641f), secondary_capture),
        owning_building_guid = 71
      )
      LocalObject(294, Door.Constructor(Vector3(760.3923f, 6944.928f, 46.21741f)), owning_building_guid = 71)
      LocalObject(295, Door.Constructor(Vector3(760.3923f, 6944.928f, 56.21741f)), owning_building_guid = 71)
      LocalObject(296, Door.Constructor(Vector3(760.3923f, 6944.928f, 76.21741f)), owning_building_guid = 71)
      LocalObject(297, Door.Constructor(Vector3(768.3923f, 6931.072f, 46.21741f)), owning_building_guid = 71)
      LocalObject(298, Door.Constructor(Vector3(768.3923f, 6931.072f, 56.21741f)), owning_building_guid = 71)
      LocalObject(299, Door.Constructor(Vector3(768.3923f, 6931.072f, 76.21741f)), owning_building_guid = 71)
      LocalObject(2637, Door.Constructor(Vector3(761.0516f, 6942.08f, 36.03341f)), owning_building_guid = 71)
      LocalObject(2638, Door.Constructor(Vector3(769.2566f, 6927.869f, 36.03341f)), owning_building_guid = 71)
      LocalObject(
        950,
        IFFLock.Constructor(Vector3(758.2175f, 6944.609f, 46.15841f), Vector3(0, 0, 330)),
        owning_building_guid = 71,
        door_guid = 294
      )
      LocalObject(
        951,
        IFFLock.Constructor(Vector3(758.2175f, 6944.609f, 56.15841f), Vector3(0, 0, 330)),
        owning_building_guid = 71,
        door_guid = 295
      )
      LocalObject(
        952,
        IFFLock.Constructor(Vector3(758.2175f, 6944.609f, 76.15841f), Vector3(0, 0, 330)),
        owning_building_guid = 71,
        door_guid = 296
      )
      LocalObject(
        953,
        IFFLock.Constructor(Vector3(770.5706f, 6931.393f, 46.15841f), Vector3(0, 0, 150)),
        owning_building_guid = 71,
        door_guid = 297
      )
      LocalObject(
        954,
        IFFLock.Constructor(Vector3(770.5706f, 6931.393f, 56.15841f), Vector3(0, 0, 150)),
        owning_building_guid = 71,
        door_guid = 298
      )
      LocalObject(
        955,
        IFFLock.Constructor(Vector3(770.5706f, 6931.393f, 76.15841f), Vector3(0, 0, 150)),
        owning_building_guid = 71,
        door_guid = 299
      )
      LocalObject(1185, Locker.Constructor(Vector3(764.2233f, 6945.795f, 34.69141f)), owning_building_guid = 71)
      LocalObject(1186, Locker.Constructor(Vector3(765.3812f, 6946.463f, 34.69141f)), owning_building_guid = 71)
      LocalObject(1187, Locker.Constructor(Vector3(767.6787f, 6947.79f, 34.69141f)), owning_building_guid = 71)
      LocalObject(1188, Locker.Constructor(Vector3(768.8929f, 6948.491f, 34.69141f)), owning_building_guid = 71)
      LocalObject(1189, Locker.Constructor(Vector3(775.129f, 6926.835f, 34.69141f)), owning_building_guid = 71)
      LocalObject(1190, Locker.Constructor(Vector3(776.2868f, 6927.504f, 34.69141f)), owning_building_guid = 71)
      LocalObject(1191, Locker.Constructor(Vector3(778.6147f, 6928.848f, 34.69141f)), owning_building_guid = 71)
      LocalObject(1192, Locker.Constructor(Vector3(779.8289f, 6929.549f, 34.69141f)), owning_building_guid = 71)
      LocalObject(
        1766,
        Terminal.Constructor(Vector3(771.9558f, 6943.792f, 36.02941f), order_terminal),
        owning_building_guid = 71
      )
      LocalObject(
        1767,
        Terminal.Constructor(Vector3(774.6463f, 6939.132f, 36.02941f), order_terminal),
        owning_building_guid = 71
      )
      LocalObject(
        1768,
        Terminal.Constructor(Vector3(777.5083f, 6934.174f, 36.02941f), order_terminal),
        owning_building_guid = 71
      )
      LocalObject(
        2435,
        SpawnTube.Constructor(Vector3(761.1957f, 6940.949f, 34.17941f), respawn_tube_tower, Vector3(0, 0, 330)),
        owning_building_guid = 71
      )
      LocalObject(
        2436,
        SpawnTube.Constructor(Vector3(769.4007f, 6926.737f, 34.17941f), respawn_tube_tower, Vector3(0, 0, 330)),
        owning_building_guid = 71
      )
      LocalObject(
        2243,
        Painbox.Constructor(Vector3(762.3324f, 6928.553f, 35.98681f), painbox_radius_continuous),
        owning_building_guid = 71
      )
      LocalObject(
        2244,
        Painbox.Constructor(Vector3(767.8937f, 6942.454f, 34.79741f), painbox_radius_continuous),
        owning_building_guid = 71
      )
      LocalObject(
        2245,
        Painbox.Constructor(Vector3(773.7936f, 6931.971f, 34.79741f), painbox_radius_continuous),
        owning_building_guid = 71
      )
    }

    Building54()

    def Building54(): Unit = { // Name: S_NCSanc_Tower Type: tower_b GUID: 72, MapID: 54
      LocalBuilding(
        "S_NCSanc_Tower",
        72,
        54,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(1456f, 6060f, 120.4505f), Vector3(0f, 0f, 360f), tower_b)
        )
      )
      LocalObject(
        2526,
        CaptureTerminal.Constructor(Vector3(1472.587f, 6059.897f, 140.4495f), secondary_capture),
        owning_building_guid = 72
      )
      LocalObject(319, Door.Constructor(Vector3(1468f, 6052f, 121.9705f)), owning_building_guid = 72)
      LocalObject(320, Door.Constructor(Vector3(1468f, 6052f, 131.9705f)), owning_building_guid = 72)
      LocalObject(321, Door.Constructor(Vector3(1468f, 6052f, 151.9705f)), owning_building_guid = 72)
      LocalObject(322, Door.Constructor(Vector3(1468f, 6068f, 121.9705f)), owning_building_guid = 72)
      LocalObject(323, Door.Constructor(Vector3(1468f, 6068f, 131.9705f)), owning_building_guid = 72)
      LocalObject(324, Door.Constructor(Vector3(1468f, 6068f, 151.9705f)), owning_building_guid = 72)
      LocalObject(2644, Door.Constructor(Vector3(1467.147f, 6048.794f, 111.7865f)), owning_building_guid = 72)
      LocalObject(2645, Door.Constructor(Vector3(1467.147f, 6065.204f, 111.7865f)), owning_building_guid = 72)
      LocalObject(
        968,
        IFFLock.Constructor(Vector3(1465.957f, 6068.811f, 121.9115f), Vector3(0, 0, 0)),
        owning_building_guid = 72,
        door_guid = 322
      )
      LocalObject(
        969,
        IFFLock.Constructor(Vector3(1465.957f, 6068.811f, 131.9115f), Vector3(0, 0, 0)),
        owning_building_guid = 72,
        door_guid = 323
      )
      LocalObject(
        970,
        IFFLock.Constructor(Vector3(1465.957f, 6068.811f, 151.9115f), Vector3(0, 0, 0)),
        owning_building_guid = 72,
        door_guid = 324
      )
      LocalObject(
        971,
        IFFLock.Constructor(Vector3(1470.047f, 6051.189f, 121.9115f), Vector3(0, 0, 180)),
        owning_building_guid = 72,
        door_guid = 319
      )
      LocalObject(
        972,
        IFFLock.Constructor(Vector3(1470.047f, 6051.189f, 131.9115f), Vector3(0, 0, 180)),
        owning_building_guid = 72,
        door_guid = 320
      )
      LocalObject(
        973,
        IFFLock.Constructor(Vector3(1470.047f, 6051.189f, 151.9115f), Vector3(0, 0, 180)),
        owning_building_guid = 72,
        door_guid = 321
      )
      LocalObject(1213, Locker.Constructor(Vector3(1471.716f, 6044.963f, 110.4445f)), owning_building_guid = 72)
      LocalObject(1214, Locker.Constructor(Vector3(1471.751f, 6066.835f, 110.4445f)), owning_building_guid = 72)
      LocalObject(1215, Locker.Constructor(Vector3(1473.053f, 6044.963f, 110.4445f)), owning_building_guid = 72)
      LocalObject(1216, Locker.Constructor(Vector3(1473.088f, 6066.835f, 110.4445f)), owning_building_guid = 72)
      LocalObject(1217, Locker.Constructor(Vector3(1475.741f, 6044.963f, 110.4445f)), owning_building_guid = 72)
      LocalObject(1218, Locker.Constructor(Vector3(1475.741f, 6066.835f, 110.4445f)), owning_building_guid = 72)
      LocalObject(1219, Locker.Constructor(Vector3(1477.143f, 6044.963f, 110.4445f)), owning_building_guid = 72)
      LocalObject(1220, Locker.Constructor(Vector3(1477.143f, 6066.835f, 110.4445f)), owning_building_guid = 72)
      LocalObject(
        1776,
        Terminal.Constructor(Vector3(1477.446f, 6050.129f, 111.7825f), order_terminal),
        owning_building_guid = 72
      )
      LocalObject(
        1777,
        Terminal.Constructor(Vector3(1477.446f, 6055.853f, 111.7825f), order_terminal),
        owning_building_guid = 72
      )
      LocalObject(
        1778,
        Terminal.Constructor(Vector3(1477.446f, 6061.234f, 111.7825f), order_terminal),
        owning_building_guid = 72
      )
      LocalObject(
        2442,
        SpawnTube.Constructor(Vector3(1466.706f, 6047.742f, 109.9325f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 72
      )
      LocalObject(
        2443,
        SpawnTube.Constructor(Vector3(1466.706f, 6064.152f, 109.9325f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 72
      )
      LocalObject(
        2249,
        Painbox.Constructor(Vector3(1461.493f, 6052.849f, 111.7399f), painbox_radius_continuous),
        owning_building_guid = 72
      )
      LocalObject(
        2250,
        Painbox.Constructor(Vector3(1473.127f, 6050.078f, 110.5505f), painbox_radius_continuous),
        owning_building_guid = 72
      )
      LocalObject(
        2251,
        Painbox.Constructor(Vector3(1473.259f, 6062.107f, 110.5505f), painbox_radius_continuous),
        owning_building_guid = 72
      )
    }

    Building25()

    def Building25(): Unit = { // Name: SE_Dagur_Tower Type: tower_b GUID: 73, MapID: 25
      LocalBuilding(
        "SE_Dagur_Tower",
        73,
        25,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(4248f, 5802f, 48.16736f), Vector3(0f, 0f, 360f), tower_b)
        )
      )
      LocalObject(
        2538,
        CaptureTerminal.Constructor(Vector3(4264.587f, 5801.897f, 68.16637f), secondary_capture),
        owning_building_guid = 73
      )
      LocalObject(509, Door.Constructor(Vector3(4260f, 5794f, 49.68736f)), owning_building_guid = 73)
      LocalObject(510, Door.Constructor(Vector3(4260f, 5794f, 59.68736f)), owning_building_guid = 73)
      LocalObject(511, Door.Constructor(Vector3(4260f, 5794f, 79.68736f)), owning_building_guid = 73)
      LocalObject(512, Door.Constructor(Vector3(4260f, 5810f, 49.68736f)), owning_building_guid = 73)
      LocalObject(513, Door.Constructor(Vector3(4260f, 5810f, 59.68736f)), owning_building_guid = 73)
      LocalObject(514, Door.Constructor(Vector3(4260f, 5810f, 79.68736f)), owning_building_guid = 73)
      LocalObject(2695, Door.Constructor(Vector3(4259.147f, 5790.794f, 39.50336f)), owning_building_guid = 73)
      LocalObject(2696, Door.Constructor(Vector3(4259.147f, 5807.204f, 39.50336f)), owning_building_guid = 73)
      LocalObject(
        1108,
        IFFLock.Constructor(Vector3(4257.957f, 5810.811f, 49.62836f), Vector3(0, 0, 0)),
        owning_building_guid = 73,
        door_guid = 512
      )
      LocalObject(
        1109,
        IFFLock.Constructor(Vector3(4257.957f, 5810.811f, 59.62836f), Vector3(0, 0, 0)),
        owning_building_guid = 73,
        door_guid = 513
      )
      LocalObject(
        1110,
        IFFLock.Constructor(Vector3(4257.957f, 5810.811f, 79.62836f), Vector3(0, 0, 0)),
        owning_building_guid = 73,
        door_guid = 514
      )
      LocalObject(
        1111,
        IFFLock.Constructor(Vector3(4262.047f, 5793.189f, 49.62836f), Vector3(0, 0, 180)),
        owning_building_guid = 73,
        door_guid = 509
      )
      LocalObject(
        1112,
        IFFLock.Constructor(Vector3(4262.047f, 5793.189f, 59.62836f), Vector3(0, 0, 180)),
        owning_building_guid = 73,
        door_guid = 510
      )
      LocalObject(
        1113,
        IFFLock.Constructor(Vector3(4262.047f, 5793.189f, 79.62836f), Vector3(0, 0, 180)),
        owning_building_guid = 73,
        door_guid = 511
      )
      LocalObject(1435, Locker.Constructor(Vector3(4263.716f, 5786.963f, 38.16136f)), owning_building_guid = 73)
      LocalObject(1436, Locker.Constructor(Vector3(4263.751f, 5808.835f, 38.16136f)), owning_building_guid = 73)
      LocalObject(1437, Locker.Constructor(Vector3(4265.053f, 5786.963f, 38.16136f)), owning_building_guid = 73)
      LocalObject(1438, Locker.Constructor(Vector3(4265.088f, 5808.835f, 38.16136f)), owning_building_guid = 73)
      LocalObject(1439, Locker.Constructor(Vector3(4267.741f, 5786.963f, 38.16136f)), owning_building_guid = 73)
      LocalObject(1440, Locker.Constructor(Vector3(4267.741f, 5808.835f, 38.16136f)), owning_building_guid = 73)
      LocalObject(1441, Locker.Constructor(Vector3(4269.143f, 5786.963f, 38.16136f)), owning_building_guid = 73)
      LocalObject(1442, Locker.Constructor(Vector3(4269.143f, 5808.835f, 38.16136f)), owning_building_guid = 73)
      LocalObject(
        1862,
        Terminal.Constructor(Vector3(4269.446f, 5792.129f, 39.49936f), order_terminal),
        owning_building_guid = 73
      )
      LocalObject(
        1863,
        Terminal.Constructor(Vector3(4269.446f, 5797.853f, 39.49936f), order_terminal),
        owning_building_guid = 73
      )
      LocalObject(
        1864,
        Terminal.Constructor(Vector3(4269.446f, 5803.234f, 39.49936f), order_terminal),
        owning_building_guid = 73
      )
      LocalObject(
        2493,
        SpawnTube.Constructor(Vector3(4258.706f, 5789.742f, 37.64936f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 73
      )
      LocalObject(
        2494,
        SpawnTube.Constructor(Vector3(4258.706f, 5806.152f, 37.64936f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 73
      )
      LocalObject(
        2285,
        Painbox.Constructor(Vector3(4253.493f, 5794.849f, 39.45676f), painbox_radius_continuous),
        owning_building_guid = 73
      )
      LocalObject(
        2286,
        Painbox.Constructor(Vector3(4265.127f, 5792.078f, 38.26736f), painbox_radius_continuous),
        owning_building_guid = 73
      )
      LocalObject(
        2287,
        Painbox.Constructor(Vector3(4265.259f, 5804.107f, 38.26736f), painbox_radius_continuous),
        owning_building_guid = 73
      )
    }

    Building28()

    def Building28(): Unit = { // Name: SW_Mani_Tower Type: tower_b GUID: 74, MapID: 28
      LocalBuilding(
        "SW_Mani_Tower",
        74,
        28,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(4476f, 4308f, 70.25056f), Vector3(0f, 0f, 360f), tower_b)
        )
      )
      LocalObject(
        2539,
        CaptureTerminal.Constructor(Vector3(4492.587f, 4307.897f, 90.24956f), secondary_capture),
        owning_building_guid = 74
      )
      LocalObject(515, Door.Constructor(Vector3(4488f, 4300f, 71.77055f)), owning_building_guid = 74)
      LocalObject(516, Door.Constructor(Vector3(4488f, 4300f, 81.77055f)), owning_building_guid = 74)
      LocalObject(517, Door.Constructor(Vector3(4488f, 4300f, 101.7706f)), owning_building_guid = 74)
      LocalObject(518, Door.Constructor(Vector3(4488f, 4316f, 71.77055f)), owning_building_guid = 74)
      LocalObject(519, Door.Constructor(Vector3(4488f, 4316f, 81.77055f)), owning_building_guid = 74)
      LocalObject(520, Door.Constructor(Vector3(4488f, 4316f, 101.7706f)), owning_building_guid = 74)
      LocalObject(2697, Door.Constructor(Vector3(4487.147f, 4296.794f, 61.58656f)), owning_building_guid = 74)
      LocalObject(2698, Door.Constructor(Vector3(4487.147f, 4313.204f, 61.58656f)), owning_building_guid = 74)
      LocalObject(
        1114,
        IFFLock.Constructor(Vector3(4485.957f, 4316.811f, 71.71156f), Vector3(0, 0, 0)),
        owning_building_guid = 74,
        door_guid = 518
      )
      LocalObject(
        1115,
        IFFLock.Constructor(Vector3(4485.957f, 4316.811f, 81.71156f), Vector3(0, 0, 0)),
        owning_building_guid = 74,
        door_guid = 519
      )
      LocalObject(
        1116,
        IFFLock.Constructor(Vector3(4485.957f, 4316.811f, 101.7116f), Vector3(0, 0, 0)),
        owning_building_guid = 74,
        door_guid = 520
      )
      LocalObject(
        1117,
        IFFLock.Constructor(Vector3(4490.047f, 4299.189f, 71.71156f), Vector3(0, 0, 180)),
        owning_building_guid = 74,
        door_guid = 515
      )
      LocalObject(
        1118,
        IFFLock.Constructor(Vector3(4490.047f, 4299.189f, 81.71156f), Vector3(0, 0, 180)),
        owning_building_guid = 74,
        door_guid = 516
      )
      LocalObject(
        1119,
        IFFLock.Constructor(Vector3(4490.047f, 4299.189f, 101.7116f), Vector3(0, 0, 180)),
        owning_building_guid = 74,
        door_guid = 517
      )
      LocalObject(1443, Locker.Constructor(Vector3(4491.716f, 4292.963f, 60.24456f)), owning_building_guid = 74)
      LocalObject(1444, Locker.Constructor(Vector3(4491.751f, 4314.835f, 60.24456f)), owning_building_guid = 74)
      LocalObject(1445, Locker.Constructor(Vector3(4493.053f, 4292.963f, 60.24456f)), owning_building_guid = 74)
      LocalObject(1446, Locker.Constructor(Vector3(4493.088f, 4314.835f, 60.24456f)), owning_building_guid = 74)
      LocalObject(1447, Locker.Constructor(Vector3(4495.741f, 4292.963f, 60.24456f)), owning_building_guid = 74)
      LocalObject(1448, Locker.Constructor(Vector3(4495.741f, 4314.835f, 60.24456f)), owning_building_guid = 74)
      LocalObject(1449, Locker.Constructor(Vector3(4497.143f, 4292.963f, 60.24456f)), owning_building_guid = 74)
      LocalObject(1450, Locker.Constructor(Vector3(4497.143f, 4314.835f, 60.24456f)), owning_building_guid = 74)
      LocalObject(
        1865,
        Terminal.Constructor(Vector3(4497.446f, 4298.129f, 61.58256f), order_terminal),
        owning_building_guid = 74
      )
      LocalObject(
        1866,
        Terminal.Constructor(Vector3(4497.446f, 4303.853f, 61.58256f), order_terminal),
        owning_building_guid = 74
      )
      LocalObject(
        1867,
        Terminal.Constructor(Vector3(4497.446f, 4309.234f, 61.58256f), order_terminal),
        owning_building_guid = 74
      )
      LocalObject(
        2495,
        SpawnTube.Constructor(Vector3(4486.706f, 4295.742f, 59.73256f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 74
      )
      LocalObject(
        2496,
        SpawnTube.Constructor(Vector3(4486.706f, 4312.152f, 59.73256f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 74
      )
      LocalObject(
        2288,
        Painbox.Constructor(Vector3(4481.493f, 4300.849f, 61.53996f), painbox_radius_continuous),
        owning_building_guid = 74
      )
      LocalObject(
        2289,
        Painbox.Constructor(Vector3(4493.127f, 4298.078f, 60.35056f), painbox_radius_continuous),
        owning_building_guid = 74
      )
      LocalObject(
        2290,
        Painbox.Constructor(Vector3(4493.259f, 4310.107f, 60.35056f), painbox_radius_continuous),
        owning_building_guid = 74
      )
    }

    Building30()

    def Building30(): Unit = { // Name: NW_VSSanc_Warpgate_Tower Type: tower_b GUID: 75, MapID: 30
      LocalBuilding(
        "NW_VSSanc_Warpgate_Tower",
        75,
        30,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(5736f, 1382f, 84.58815f), Vector3(0f, 0f, 360f), tower_b)
        )
      )
      LocalObject(
        2544,
        CaptureTerminal.Constructor(Vector3(5752.587f, 1381.897f, 104.5872f), secondary_capture),
        owning_building_guid = 75
      )
      LocalObject(562, Door.Constructor(Vector3(5748f, 1374f, 86.10815f)), owning_building_guid = 75)
      LocalObject(563, Door.Constructor(Vector3(5748f, 1374f, 96.10815f)), owning_building_guid = 75)
      LocalObject(564, Door.Constructor(Vector3(5748f, 1374f, 116.1082f)), owning_building_guid = 75)
      LocalObject(565, Door.Constructor(Vector3(5748f, 1390f, 86.10815f)), owning_building_guid = 75)
      LocalObject(566, Door.Constructor(Vector3(5748f, 1390f, 96.10815f)), owning_building_guid = 75)
      LocalObject(567, Door.Constructor(Vector3(5748f, 1390f, 116.1082f)), owning_building_guid = 75)
      LocalObject(2713, Door.Constructor(Vector3(5747.147f, 1370.794f, 75.92415f)), owning_building_guid = 75)
      LocalObject(2714, Door.Constructor(Vector3(5747.147f, 1387.204f, 75.92415f)), owning_building_guid = 75)
      LocalObject(
        1152,
        IFFLock.Constructor(Vector3(5745.957f, 1390.811f, 86.04915f), Vector3(0, 0, 0)),
        owning_building_guid = 75,
        door_guid = 565
      )
      LocalObject(
        1153,
        IFFLock.Constructor(Vector3(5745.957f, 1390.811f, 96.04915f), Vector3(0, 0, 0)),
        owning_building_guid = 75,
        door_guid = 566
      )
      LocalObject(
        1154,
        IFFLock.Constructor(Vector3(5745.957f, 1390.811f, 116.0491f), Vector3(0, 0, 0)),
        owning_building_guid = 75,
        door_guid = 567
      )
      LocalObject(
        1155,
        IFFLock.Constructor(Vector3(5750.047f, 1373.189f, 86.04915f), Vector3(0, 0, 180)),
        owning_building_guid = 75,
        door_guid = 562
      )
      LocalObject(
        1156,
        IFFLock.Constructor(Vector3(5750.047f, 1373.189f, 96.04915f), Vector3(0, 0, 180)),
        owning_building_guid = 75,
        door_guid = 563
      )
      LocalObject(
        1157,
        IFFLock.Constructor(Vector3(5750.047f, 1373.189f, 116.0491f), Vector3(0, 0, 180)),
        owning_building_guid = 75,
        door_guid = 564
      )
      LocalObject(1516, Locker.Constructor(Vector3(5751.716f, 1366.963f, 74.58215f)), owning_building_guid = 75)
      LocalObject(1517, Locker.Constructor(Vector3(5751.751f, 1388.835f, 74.58215f)), owning_building_guid = 75)
      LocalObject(1518, Locker.Constructor(Vector3(5753.053f, 1366.963f, 74.58215f)), owning_building_guid = 75)
      LocalObject(1519, Locker.Constructor(Vector3(5753.088f, 1388.835f, 74.58215f)), owning_building_guid = 75)
      LocalObject(1520, Locker.Constructor(Vector3(5755.741f, 1366.963f, 74.58215f)), owning_building_guid = 75)
      LocalObject(1521, Locker.Constructor(Vector3(5755.741f, 1388.835f, 74.58215f)), owning_building_guid = 75)
      LocalObject(1522, Locker.Constructor(Vector3(5757.143f, 1366.963f, 74.58215f)), owning_building_guid = 75)
      LocalObject(1523, Locker.Constructor(Vector3(5757.143f, 1388.835f, 74.58215f)), owning_building_guid = 75)
      LocalObject(
        1888,
        Terminal.Constructor(Vector3(5757.446f, 1372.129f, 75.92015f), order_terminal),
        owning_building_guid = 75
      )
      LocalObject(
        1889,
        Terminal.Constructor(Vector3(5757.446f, 1377.853f, 75.92015f), order_terminal),
        owning_building_guid = 75
      )
      LocalObject(
        1890,
        Terminal.Constructor(Vector3(5757.446f, 1383.234f, 75.92015f), order_terminal),
        owning_building_guid = 75
      )
      LocalObject(
        2511,
        SpawnTube.Constructor(Vector3(5746.706f, 1369.742f, 74.07015f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 75
      )
      LocalObject(
        2512,
        SpawnTube.Constructor(Vector3(5746.706f, 1386.152f, 74.07015f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 75
      )
      LocalObject(
        2303,
        Painbox.Constructor(Vector3(5741.493f, 1374.849f, 75.87755f), painbox_radius_continuous),
        owning_building_guid = 75
      )
      LocalObject(
        2304,
        Painbox.Constructor(Vector3(5753.127f, 1372.078f, 74.68815f), painbox_radius_continuous),
        owning_building_guid = 75
      )
      LocalObject(
        2305,
        Painbox.Constructor(Vector3(5753.259f, 1384.107f, 74.68815f), painbox_radius_continuous),
        owning_building_guid = 75
      )
    }

    Building29()

    def Building29(): Unit = { // Name: SE_Searhus_Warpgate_Tower Type: tower_c GUID: 76, MapID: 29
      LocalBuilding(
        "SE_Searhus_Warpgate_Tower",
        76,
        29,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(3222f, 2488f, 89.08353f), Vector3(0f, 0f, 360f), tower_c)
        )
      )
      LocalObject(
        2531,
        CaptureTerminal.Constructor(Vector3(3238.587f, 2487.897f, 99.08253f), secondary_capture),
        owning_building_guid = 76
      )
      LocalObject(412, Door.Constructor(Vector3(3234f, 2480f, 90.60453f)), owning_building_guid = 76)
      LocalObject(413, Door.Constructor(Vector3(3234f, 2480f, 110.6035f)), owning_building_guid = 76)
      LocalObject(414, Door.Constructor(Vector3(3234f, 2496f, 90.60453f)), owning_building_guid = 76)
      LocalObject(415, Door.Constructor(Vector3(3234f, 2496f, 110.6035f)), owning_building_guid = 76)
      LocalObject(2669, Door.Constructor(Vector3(3233.146f, 2476.794f, 80.41953f)), owning_building_guid = 76)
      LocalObject(2670, Door.Constructor(Vector3(3233.146f, 2493.204f, 80.41953f)), owning_building_guid = 76)
      LocalObject(
        1038,
        IFFLock.Constructor(Vector3(3231.957f, 2496.811f, 90.54453f), Vector3(0, 0, 0)),
        owning_building_guid = 76,
        door_guid = 414
      )
      LocalObject(
        1039,
        IFFLock.Constructor(Vector3(3231.957f, 2496.811f, 110.5445f), Vector3(0, 0, 0)),
        owning_building_guid = 76,
        door_guid = 415
      )
      LocalObject(
        1040,
        IFFLock.Constructor(Vector3(3236.047f, 2479.189f, 90.54453f), Vector3(0, 0, 180)),
        owning_building_guid = 76,
        door_guid = 412
      )
      LocalObject(
        1041,
        IFFLock.Constructor(Vector3(3236.047f, 2479.189f, 110.5445f), Vector3(0, 0, 180)),
        owning_building_guid = 76,
        door_guid = 413
      )
      LocalObject(1327, Locker.Constructor(Vector3(3237.716f, 2472.963f, 79.07753f)), owning_building_guid = 76)
      LocalObject(1328, Locker.Constructor(Vector3(3237.751f, 2494.835f, 79.07753f)), owning_building_guid = 76)
      LocalObject(1330, Locker.Constructor(Vector3(3239.053f, 2472.963f, 79.07753f)), owning_building_guid = 76)
      LocalObject(1331, Locker.Constructor(Vector3(3239.088f, 2494.835f, 79.07753f)), owning_building_guid = 76)
      LocalObject(1334, Locker.Constructor(Vector3(3241.741f, 2472.963f, 79.07753f)), owning_building_guid = 76)
      LocalObject(1335, Locker.Constructor(Vector3(3241.741f, 2494.835f, 79.07753f)), owning_building_guid = 76)
      LocalObject(1337, Locker.Constructor(Vector3(3243.143f, 2472.963f, 79.07753f)), owning_building_guid = 76)
      LocalObject(1338, Locker.Constructor(Vector3(3243.143f, 2494.835f, 79.07753f)), owning_building_guid = 76)
      LocalObject(
        1820,
        Terminal.Constructor(Vector3(3243.445f, 2478.129f, 80.41553f), order_terminal),
        owning_building_guid = 76
      )
      LocalObject(
        1821,
        Terminal.Constructor(Vector3(3243.445f, 2483.853f, 80.41553f), order_terminal),
        owning_building_guid = 76
      )
      LocalObject(
        1822,
        Terminal.Constructor(Vector3(3243.445f, 2489.234f, 80.41553f), order_terminal),
        owning_building_guid = 76
      )
      LocalObject(
        2467,
        SpawnTube.Constructor(Vector3(3232.706f, 2475.742f, 78.56553f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 76
      )
      LocalObject(
        2468,
        SpawnTube.Constructor(Vector3(3232.706f, 2492.152f, 78.56553f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 76
      )
      LocalObject(
        2135,
        ProximityTerminal.Constructor(Vector3(3220.907f, 2482.725f, 116.6535f), pad_landing_tower_frame),
        owning_building_guid = 76
      )
      LocalObject(
        2136,
        Terminal.Constructor(Vector3(3220.907f, 2482.725f, 116.6535f), air_rearm_terminal),
        owning_building_guid = 76
      )
      LocalObject(
        2138,
        ProximityTerminal.Constructor(Vector3(3220.907f, 2493.17f, 116.6535f), pad_landing_tower_frame),
        owning_building_guid = 76
      )
      LocalObject(
        2139,
        Terminal.Constructor(Vector3(3220.907f, 2493.17f, 116.6535f), air_rearm_terminal),
        owning_building_guid = 76
      )
      LocalObject(
        1648,
        FacilityTurret.Constructor(Vector3(3207.07f, 2473.045f, 108.0255f), manned_turret),
        owning_building_guid = 76
      )
      TurretToWeapon(1648, 5107)
      LocalObject(
        1650,
        FacilityTurret.Constructor(Vector3(3245.497f, 2502.957f, 108.0255f), manned_turret),
        owning_building_guid = 76
      )
      TurretToWeapon(1650, 5108)
      LocalObject(
        2264,
        Painbox.Constructor(Vector3(3226.454f, 2480.849f, 81.10303f), painbox_radius_continuous),
        owning_building_guid = 76
      )
      LocalObject(
        2265,
        Painbox.Constructor(Vector3(3238.923f, 2477.54f, 79.18353f), painbox_radius_continuous),
        owning_building_guid = 76
      )
      LocalObject(
        2266,
        Painbox.Constructor(Vector3(3239.113f, 2490.022f, 79.18353f), painbox_radius_continuous),
        owning_building_guid = 76
      )
    }

    Building26()

    def Building26(): Unit = { // Name: W_Vidar_Tower Type: tower_c GUID: 77, MapID: 26
      LocalBuilding(
        "W_Vidar_Tower",
        77,
        26,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(3270f, 3168f, 85.63189f), Vector3(0f, 0f, 360f), tower_c)
        )
      )
      LocalObject(
        2532,
        CaptureTerminal.Constructor(Vector3(3286.587f, 3167.897f, 95.63089f), secondary_capture),
        owning_building_guid = 77
      )
      LocalObject(422, Door.Constructor(Vector3(3282f, 3160f, 87.15289f)), owning_building_guid = 77)
      LocalObject(423, Door.Constructor(Vector3(3282f, 3160f, 107.1519f)), owning_building_guid = 77)
      LocalObject(424, Door.Constructor(Vector3(3282f, 3176f, 87.15289f)), owning_building_guid = 77)
      LocalObject(425, Door.Constructor(Vector3(3282f, 3176f, 107.1519f)), owning_building_guid = 77)
      LocalObject(2671, Door.Constructor(Vector3(3281.146f, 3156.794f, 76.96789f)), owning_building_guid = 77)
      LocalObject(2672, Door.Constructor(Vector3(3281.146f, 3173.204f, 76.96789f)), owning_building_guid = 77)
      LocalObject(
        1045,
        IFFLock.Constructor(Vector3(3279.957f, 3176.811f, 87.09289f), Vector3(0, 0, 0)),
        owning_building_guid = 77,
        door_guid = 424
      )
      LocalObject(
        1046,
        IFFLock.Constructor(Vector3(3279.957f, 3176.811f, 107.0929f), Vector3(0, 0, 0)),
        owning_building_guid = 77,
        door_guid = 425
      )
      LocalObject(
        1047,
        IFFLock.Constructor(Vector3(3284.047f, 3159.189f, 87.09289f), Vector3(0, 0, 180)),
        owning_building_guid = 77,
        door_guid = 422
      )
      LocalObject(
        1048,
        IFFLock.Constructor(Vector3(3284.047f, 3159.189f, 107.0929f), Vector3(0, 0, 180)),
        owning_building_guid = 77,
        door_guid = 423
      )
      LocalObject(1339, Locker.Constructor(Vector3(3285.716f, 3152.963f, 75.62589f)), owning_building_guid = 77)
      LocalObject(1340, Locker.Constructor(Vector3(3285.751f, 3174.835f, 75.62589f)), owning_building_guid = 77)
      LocalObject(1341, Locker.Constructor(Vector3(3287.053f, 3152.963f, 75.62589f)), owning_building_guid = 77)
      LocalObject(1342, Locker.Constructor(Vector3(3287.088f, 3174.835f, 75.62589f)), owning_building_guid = 77)
      LocalObject(1343, Locker.Constructor(Vector3(3289.741f, 3152.963f, 75.62589f)), owning_building_guid = 77)
      LocalObject(1344, Locker.Constructor(Vector3(3289.741f, 3174.835f, 75.62589f)), owning_building_guid = 77)
      LocalObject(1345, Locker.Constructor(Vector3(3291.143f, 3152.963f, 75.62589f)), owning_building_guid = 77)
      LocalObject(1346, Locker.Constructor(Vector3(3291.143f, 3174.835f, 75.62589f)), owning_building_guid = 77)
      LocalObject(
        1823,
        Terminal.Constructor(Vector3(3291.445f, 3158.129f, 76.96389f), order_terminal),
        owning_building_guid = 77
      )
      LocalObject(
        1824,
        Terminal.Constructor(Vector3(3291.445f, 3163.853f, 76.96389f), order_terminal),
        owning_building_guid = 77
      )
      LocalObject(
        1825,
        Terminal.Constructor(Vector3(3291.445f, 3169.234f, 76.96389f), order_terminal),
        owning_building_guid = 77
      )
      LocalObject(
        2469,
        SpawnTube.Constructor(Vector3(3280.706f, 3155.742f, 75.11389f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 77
      )
      LocalObject(
        2470,
        SpawnTube.Constructor(Vector3(3280.706f, 3172.152f, 75.11389f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 77
      )
      LocalObject(
        2141,
        ProximityTerminal.Constructor(Vector3(3268.907f, 3162.725f, 113.2019f), pad_landing_tower_frame),
        owning_building_guid = 77
      )
      LocalObject(
        2142,
        Terminal.Constructor(Vector3(3268.907f, 3162.725f, 113.2019f), air_rearm_terminal),
        owning_building_guid = 77
      )
      LocalObject(
        2144,
        ProximityTerminal.Constructor(Vector3(3268.907f, 3173.17f, 113.2019f), pad_landing_tower_frame),
        owning_building_guid = 77
      )
      LocalObject(
        2145,
        Terminal.Constructor(Vector3(3268.907f, 3173.17f, 113.2019f), air_rearm_terminal),
        owning_building_guid = 77
      )
      LocalObject(
        1651,
        FacilityTurret.Constructor(Vector3(3255.07f, 3153.045f, 104.5739f), manned_turret),
        owning_building_guid = 77
      )
      TurretToWeapon(1651, 5109)
      LocalObject(
        1656,
        FacilityTurret.Constructor(Vector3(3293.497f, 3182.957f, 104.5739f), manned_turret),
        owning_building_guid = 77
      )
      TurretToWeapon(1656, 5110)
      LocalObject(
        2267,
        Painbox.Constructor(Vector3(3274.454f, 3160.849f, 77.65139f), painbox_radius_continuous),
        owning_building_guid = 77
      )
      LocalObject(
        2269,
        Painbox.Constructor(Vector3(3286.923f, 3157.54f, 75.73189f), painbox_radius_continuous),
        owning_building_guid = 77
      )
      LocalObject(
        2270,
        Painbox.Constructor(Vector3(3287.113f, 3170.022f, 75.73189f), painbox_radius_continuous),
        owning_building_guid = 77
      )
    }

    Building51()

    def Building51(): Unit = { // Name: NE_Andvari_Tower Type: tower_c GUID: 78, MapID: 51
      LocalBuilding(
        "NE_Andvari_Tower",
        78,
        51,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(3446f, 7598f, 50.04425f), Vector3(0f, 0f, 360f), tower_c)
        )
      )
      LocalObject(
        2535,
        CaptureTerminal.Constructor(Vector3(3462.587f, 7597.897f, 60.04325f), secondary_capture),
        owning_building_guid = 78
      )
      LocalObject(448, Door.Constructor(Vector3(3458f, 7590f, 51.56525f)), owning_building_guid = 78)
      LocalObject(449, Door.Constructor(Vector3(3458f, 7590f, 71.56425f)), owning_building_guid = 78)
      LocalObject(450, Door.Constructor(Vector3(3458f, 7606f, 51.56525f)), owning_building_guid = 78)
      LocalObject(451, Door.Constructor(Vector3(3458f, 7606f, 71.56425f)), owning_building_guid = 78)
      LocalObject(2680, Door.Constructor(Vector3(3457.146f, 7586.794f, 41.38025f)), owning_building_guid = 78)
      LocalObject(2681, Door.Constructor(Vector3(3457.146f, 7603.204f, 41.38025f)), owning_building_guid = 78)
      LocalObject(
        1066,
        IFFLock.Constructor(Vector3(3455.957f, 7606.811f, 51.50525f), Vector3(0, 0, 0)),
        owning_building_guid = 78,
        door_guid = 450
      )
      LocalObject(
        1067,
        IFFLock.Constructor(Vector3(3455.957f, 7606.811f, 71.50525f), Vector3(0, 0, 0)),
        owning_building_guid = 78,
        door_guid = 451
      )
      LocalObject(
        1068,
        IFFLock.Constructor(Vector3(3460.047f, 7589.189f, 51.50525f), Vector3(0, 0, 180)),
        owning_building_guid = 78,
        door_guid = 448
      )
      LocalObject(
        1069,
        IFFLock.Constructor(Vector3(3460.047f, 7589.189f, 71.50525f), Vector3(0, 0, 180)),
        owning_building_guid = 78,
        door_guid = 449
      )
      LocalObject(1375, Locker.Constructor(Vector3(3461.716f, 7582.963f, 40.03825f)), owning_building_guid = 78)
      LocalObject(1376, Locker.Constructor(Vector3(3461.751f, 7604.835f, 40.03825f)), owning_building_guid = 78)
      LocalObject(1377, Locker.Constructor(Vector3(3463.053f, 7582.963f, 40.03825f)), owning_building_guid = 78)
      LocalObject(1378, Locker.Constructor(Vector3(3463.088f, 7604.835f, 40.03825f)), owning_building_guid = 78)
      LocalObject(1379, Locker.Constructor(Vector3(3465.741f, 7582.963f, 40.03825f)), owning_building_guid = 78)
      LocalObject(1380, Locker.Constructor(Vector3(3465.741f, 7604.835f, 40.03825f)), owning_building_guid = 78)
      LocalObject(1381, Locker.Constructor(Vector3(3467.143f, 7582.963f, 40.03825f)), owning_building_guid = 78)
      LocalObject(1382, Locker.Constructor(Vector3(3467.143f, 7604.835f, 40.03825f)), owning_building_guid = 78)
      LocalObject(
        1836,
        Terminal.Constructor(Vector3(3467.445f, 7588.129f, 41.37625f), order_terminal),
        owning_building_guid = 78
      )
      LocalObject(
        1837,
        Terminal.Constructor(Vector3(3467.445f, 7593.853f, 41.37625f), order_terminal),
        owning_building_guid = 78
      )
      LocalObject(
        1838,
        Terminal.Constructor(Vector3(3467.445f, 7599.234f, 41.37625f), order_terminal),
        owning_building_guid = 78
      )
      LocalObject(
        2478,
        SpawnTube.Constructor(Vector3(3456.706f, 7585.742f, 39.52625f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 78
      )
      LocalObject(
        2479,
        SpawnTube.Constructor(Vector3(3456.706f, 7602.152f, 39.52625f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 78
      )
      LocalObject(
        2147,
        ProximityTerminal.Constructor(Vector3(3444.907f, 7592.725f, 77.61425f), pad_landing_tower_frame),
        owning_building_guid = 78
      )
      LocalObject(
        2148,
        Terminal.Constructor(Vector3(3444.907f, 7592.725f, 77.61425f), air_rearm_terminal),
        owning_building_guid = 78
      )
      LocalObject(
        2150,
        ProximityTerminal.Constructor(Vector3(3444.907f, 7603.17f, 77.61425f), pad_landing_tower_frame),
        owning_building_guid = 78
      )
      LocalObject(
        2151,
        Terminal.Constructor(Vector3(3444.907f, 7603.17f, 77.61425f), air_rearm_terminal),
        owning_building_guid = 78
      )
      LocalObject(
        1661,
        FacilityTurret.Constructor(Vector3(3431.07f, 7583.045f, 68.98625f), manned_turret),
        owning_building_guid = 78
      )
      TurretToWeapon(1661, 5111)
      LocalObject(
        1665,
        FacilityTurret.Constructor(Vector3(3469.497f, 7612.957f, 68.98625f), manned_turret),
        owning_building_guid = 78
      )
      TurretToWeapon(1665, 5112)
      LocalObject(
        2276,
        Painbox.Constructor(Vector3(3450.454f, 7590.849f, 42.06375f), painbox_radius_continuous),
        owning_building_guid = 78
      )
      LocalObject(
        2277,
        Painbox.Constructor(Vector3(3462.923f, 7587.54f, 40.14425f), painbox_radius_continuous),
        owning_building_guid = 78
      )
      LocalObject(
        2278,
        Painbox.Constructor(Vector3(3463.113f, 7600.022f, 40.14425f), painbox_radius_continuous),
        owning_building_guid = 78
      )
    }

    Building27()

    def Building27(): Unit = { // Name: SW_Oshur_Warpgate_Tower Type: tower_c GUID: 79, MapID: 27
      LocalBuilding(
        "SW_Oshur_Warpgate_Tower",
        79,
        27,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(4872f, 3408f, 58.76949f), Vector3(0f, 0f, 360f), tower_c)
        )
      )
      LocalObject(
        2540,
        CaptureTerminal.Constructor(Vector3(4888.587f, 3407.897f, 68.76849f), secondary_capture),
        owning_building_guid = 79
      )
      LocalObject(521, Door.Constructor(Vector3(4884f, 3400f, 60.29049f)), owning_building_guid = 79)
      LocalObject(522, Door.Constructor(Vector3(4884f, 3400f, 80.28949f)), owning_building_guid = 79)
      LocalObject(523, Door.Constructor(Vector3(4884f, 3416f, 60.29049f)), owning_building_guid = 79)
      LocalObject(524, Door.Constructor(Vector3(4884f, 3416f, 80.28949f)), owning_building_guid = 79)
      LocalObject(2699, Door.Constructor(Vector3(4883.146f, 3396.794f, 50.10549f)), owning_building_guid = 79)
      LocalObject(2700, Door.Constructor(Vector3(4883.146f, 3413.204f, 50.10549f)), owning_building_guid = 79)
      LocalObject(
        1120,
        IFFLock.Constructor(Vector3(4881.957f, 3416.811f, 60.23049f), Vector3(0, 0, 0)),
        owning_building_guid = 79,
        door_guid = 523
      )
      LocalObject(
        1121,
        IFFLock.Constructor(Vector3(4881.957f, 3416.811f, 80.23049f), Vector3(0, 0, 0)),
        owning_building_guid = 79,
        door_guid = 524
      )
      LocalObject(
        1122,
        IFFLock.Constructor(Vector3(4886.047f, 3399.189f, 60.23049f), Vector3(0, 0, 180)),
        owning_building_guid = 79,
        door_guid = 521
      )
      LocalObject(
        1123,
        IFFLock.Constructor(Vector3(4886.047f, 3399.189f, 80.23049f), Vector3(0, 0, 180)),
        owning_building_guid = 79,
        door_guid = 522
      )
      LocalObject(1451, Locker.Constructor(Vector3(4887.716f, 3392.963f, 48.76349f)), owning_building_guid = 79)
      LocalObject(1452, Locker.Constructor(Vector3(4887.751f, 3414.835f, 48.76349f)), owning_building_guid = 79)
      LocalObject(1453, Locker.Constructor(Vector3(4889.053f, 3392.963f, 48.76349f)), owning_building_guid = 79)
      LocalObject(1454, Locker.Constructor(Vector3(4889.088f, 3414.835f, 48.76349f)), owning_building_guid = 79)
      LocalObject(1455, Locker.Constructor(Vector3(4891.741f, 3392.963f, 48.76349f)), owning_building_guid = 79)
      LocalObject(1456, Locker.Constructor(Vector3(4891.741f, 3414.835f, 48.76349f)), owning_building_guid = 79)
      LocalObject(1457, Locker.Constructor(Vector3(4893.143f, 3392.963f, 48.76349f)), owning_building_guid = 79)
      LocalObject(1458, Locker.Constructor(Vector3(4893.143f, 3414.835f, 48.76349f)), owning_building_guid = 79)
      LocalObject(
        1868,
        Terminal.Constructor(Vector3(4893.445f, 3398.129f, 50.10149f), order_terminal),
        owning_building_guid = 79
      )
      LocalObject(
        1869,
        Terminal.Constructor(Vector3(4893.445f, 3403.853f, 50.10149f), order_terminal),
        owning_building_guid = 79
      )
      LocalObject(
        1870,
        Terminal.Constructor(Vector3(4893.445f, 3409.234f, 50.10149f), order_terminal),
        owning_building_guid = 79
      )
      LocalObject(
        2497,
        SpawnTube.Constructor(Vector3(4882.706f, 3395.742f, 48.2515f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 79
      )
      LocalObject(
        2498,
        SpawnTube.Constructor(Vector3(4882.706f, 3412.152f, 48.2515f), respawn_tube_tower, Vector3(0, 0, 0)),
        owning_building_guid = 79
      )
      LocalObject(
        2153,
        ProximityTerminal.Constructor(Vector3(4870.907f, 3402.725f, 86.33949f), pad_landing_tower_frame),
        owning_building_guid = 79
      )
      LocalObject(
        2154,
        Terminal.Constructor(Vector3(4870.907f, 3402.725f, 86.33949f), air_rearm_terminal),
        owning_building_guid = 79
      )
      LocalObject(
        2156,
        ProximityTerminal.Constructor(Vector3(4870.907f, 3413.17f, 86.33949f), pad_landing_tower_frame),
        owning_building_guid = 79
      )
      LocalObject(
        2157,
        Terminal.Constructor(Vector3(4870.907f, 3413.17f, 86.33949f), air_rearm_terminal),
        owning_building_guid = 79
      )
      LocalObject(
        1689,
        FacilityTurret.Constructor(Vector3(4857.07f, 3393.045f, 77.71149f), manned_turret),
        owning_building_guid = 79
      )
      TurretToWeapon(1689, 5113)
      LocalObject(
        1690,
        FacilityTurret.Constructor(Vector3(4895.497f, 3422.957f, 77.71149f), manned_turret),
        owning_building_guid = 79
      )
      TurretToWeapon(1690, 5114)
      LocalObject(
        2291,
        Painbox.Constructor(Vector3(4876.454f, 3400.849f, 50.78899f), painbox_radius_continuous),
        owning_building_guid = 79
      )
      LocalObject(
        2292,
        Painbox.Constructor(Vector3(4888.923f, 3397.54f, 48.86949f), painbox_radius_continuous),
        owning_building_guid = 79
      )
      LocalObject(
        2293,
        Painbox.Constructor(Vector3(4889.113f, 3410.022f, 48.86949f), painbox_radius_continuous),
        owning_building_guid = 79
      )
    }

    Building24()

    def Building24(): Unit = { // Name: E_Dagur_Tower Type: tower_c GUID: 80, MapID: 24
      LocalBuilding(
        "E_Dagur_Tower",
        80,
        24,
        FoundationBuilder(
          Building.Structure(StructureType.Tower, Vector3(4994f, 5868f, 50.79501f), Vector3(0f, 0f, 41f), tower_c)
        )
      )
      LocalObject(
        2542,
        CaptureTerminal.Constructor(Vector3(5006.586f, 5878.804f, 60.79401f), secondary_capture),
        owning_building_guid = 80
      )
      LocalObject(534, Door.Constructor(Vector3(4997.808f, 5881.91f, 52.31601f)), owning_building_guid = 80)
      LocalObject(535, Door.Constructor(Vector3(4997.808f, 5881.91f, 72.315f)), owning_building_guid = 80)
      LocalObject(536, Door.Constructor(Vector3(5008.305f, 5869.835f, 52.31601f)), owning_building_guid = 80)
      LocalObject(537, Door.Constructor(Vector3(5008.305f, 5869.835f, 72.315f)), owning_building_guid = 80)
      LocalObject(2703, Door.Constructor(Vector3(4998.998f, 5879.24f, 42.131f)), owning_building_guid = 80)
      LocalObject(2704, Door.Constructor(Vector3(5009.764f, 5866.855f, 42.131f)), owning_building_guid = 80)
      LocalObject(
        1131,
        IFFLock.Constructor(Vector3(4995.734f, 5881.182f, 52.256f), Vector3(0, 0, 319)),
        owning_building_guid = 80,
        door_guid = 534
      )
      LocalObject(
        1132,
        IFFLock.Constructor(Vector3(4995.734f, 5881.182f, 72.256f), Vector3(0, 0, 319)),
        owning_building_guid = 80,
        door_guid = 535
      )
      LocalObject(
        1134,
        IFFLock.Constructor(Vector3(5010.382f, 5870.566f, 52.256f), Vector3(0, 0, 139)),
        owning_building_guid = 80,
        door_guid = 536
      )
      LocalObject(
        1135,
        IFFLock.Constructor(Vector3(5010.382f, 5870.566f, 72.256f), Vector3(0, 0, 139)),
        owning_building_guid = 80,
        door_guid = 537
      )
      LocalObject(1467, Locker.Constructor(Vector3(5001.403f, 5883.492f, 40.78901f)), owning_building_guid = 80)
      LocalObject(1468, Locker.Constructor(Vector3(5002.412f, 5884.369f, 40.78901f)), owning_building_guid = 80)
      LocalObject(1469, Locker.Constructor(Vector3(5004.415f, 5886.11f, 40.78901f)), owning_building_guid = 80)
      LocalObject(1470, Locker.Constructor(Vector3(5005.473f, 5887.029f, 40.78901f)), owning_building_guid = 80)
      LocalObject(1471, Locker.Constructor(Vector3(5015.726f, 5866.962f, 40.78901f)), owning_building_guid = 80)
      LocalObject(1472, Locker.Constructor(Vector3(5016.735f, 5867.839f, 40.78901f)), owning_building_guid = 80)
      LocalObject(1473, Locker.Constructor(Vector3(5018.764f, 5869.603f, 40.78901f)), owning_building_guid = 80)
      LocalObject(1474, Locker.Constructor(Vector3(5019.822f, 5870.522f, 40.78901f)), owning_building_guid = 80)
      LocalObject(
        1875,
        Terminal.Constructor(Vector3(5009.375f, 5883f, 42.12701f), order_terminal),
        owning_building_guid = 80
      )
      LocalObject(
        1876,
        Terminal.Constructor(Vector3(5012.905f, 5878.939f, 42.12701f), order_terminal),
        owning_building_guid = 80
      )
      LocalObject(
        1877,
        Terminal.Constructor(Vector3(5016.661f, 5874.62f, 42.12701f), order_terminal),
        owning_building_guid = 80
      )
      LocalObject(
        2501,
        SpawnTube.Constructor(Vector3(4999.356f, 5878.157f, 40.27701f), respawn_tube_tower, Vector3(0, 0, 319)),
        owning_building_guid = 80
      )
      LocalObject(
        2502,
        SpawnTube.Constructor(Vector3(5010.122f, 5865.772f, 40.27701f), respawn_tube_tower, Vector3(0, 0, 319)),
        owning_building_guid = 80
      )
      LocalObject(
        2159,
        ProximityTerminal.Constructor(Vector3(4989.783f, 5871.185f, 78.36501f), pad_landing_tower_frame),
        owning_building_guid = 80
      )
      LocalObject(
        2160,
        Terminal.Constructor(Vector3(4989.783f, 5871.185f, 78.36501f), air_rearm_terminal),
        owning_building_guid = 80
      )
      LocalObject(
        2162,
        ProximityTerminal.Constructor(Vector3(4996.636f, 5863.302f, 78.36501f), pad_landing_tower_frame),
        owning_building_guid = 80
      )
      LocalObject(
        2163,
        Terminal.Constructor(Vector3(4996.636f, 5863.302f, 78.36501f), air_rearm_terminal),
        owning_building_guid = 80
      )
      LocalObject(
        1695,
        FacilityTurret.Constructor(Vector3(4992.543f, 5846.918f, 69.73701f), manned_turret),
        owning_building_guid = 80
      )
      TurretToWeapon(1695, 5115)
      LocalObject(
        1696,
        FacilityTurret.Constructor(Vector3(5001.921f, 5894.704f, 69.73701f), manned_turret),
        owning_building_guid = 80
      )
      TurretToWeapon(1696, 5116)
      LocalObject(
        2297,
        Painbox.Constructor(Vector3(5002.053f, 5865.525f, 42.81451f), painbox_radius_continuous),
        owning_building_guid = 80
      )
      LocalObject(
        2298,
        Painbox.Constructor(Vector3(5005.589f, 5880.753f, 40.895f), painbox_radius_continuous),
        owning_building_guid = 80
      )
      LocalObject(
        2299,
        Painbox.Constructor(Vector3(5013.635f, 5871.208f, 40.895f), painbox_radius_continuous),
        owning_building_guid = 80
      )
    }

    Building1()

    def Building1(): Unit = { // Name: WG_Esamir_to_NCSanc Type: warpgate GUID: 81, MapID: 1
      LocalBuilding(
        "WG_Esamir_to_NCSanc",
        81,
        1,
        FoundationBuilder(WarpGate.Structure(Vector3(1388f, 6382f, 64.32691f)))
      )
    }

    Building2()

    def Building2(): Unit = { // Name: WG_Esamir_to_Searhus Type: warpgate GUID: 82, MapID: 2
      LocalBuilding(
        "WG_Esamir_to_Searhus",
        82,
        2,
        FoundationBuilder(WarpGate.Structure(Vector3(2658f, 2902f, 85.65936f)))
      )
    }

    Building4()

    def Building4(): Unit = { // Name: WG_Esamir_to_Oshur Type: warpgate GUID: 83, MapID: 4
      LocalBuilding("WG_Esamir_to_Oshur", 83, 4, FoundationBuilder(WarpGate.Structure(Vector3(5280f, 3958f, 70.4886f))))
    }

    Building3()

    def Building3(): Unit = { // Name: WG_Esamir_to_VSSanc Type: warpgate GUID: 84, MapID: 3
      LocalBuilding(
        "WG_Esamir_to_VSSanc",
        84,
        3,
        FoundationBuilder(WarpGate.Structure(Vector3(6372f, 1068f, 77.9046f)))
      )
    }

    def Lattice(): Unit = {
      LatticeLink("Andvari", "Jarl")
      LatticeLink("Freyr", "ymir")
      LatticeLink("Vidar", "Helhiem")
      LatticeLink("Helhiem", "Nott")
      LatticeLink("Nott", "Mani")
      LatticeLink("Mani", "Freyr")
      LatticeLink("Mani", "Dagur")
      LatticeLink("Eisa", "Jarl")
      LatticeLink("Eisa", "ymir")
      LatticeLink("Eisa", "Freyr")
      LatticeLink("Eisa", "Mani")
      LatticeLink("Jarl", "Dagur")
      LatticeLink("Andvari", "WG_Esamir_to_NCSanc")
      LatticeLink("Ran", "WG_Esamir_to_Searhus")
      LatticeLink("Nott", "WG_Esamir_to_Oshur")
      LatticeLink("Vidar", "GW_Esamir_S")
      LatticeLink("Mani", "GW_Esamir_N")
      LatticeLink("Helhiem", "WG_Esamir_to_VSSanc")
      LatticeLink("Dagur", "Andvari")
      LatticeLink("Jarl", "ymir")
      LatticeLink("ymir", "Gjallar")
      LatticeLink("Gjallar", "Ran")
      LatticeLink("Ran", "Kvasir")
      LatticeLink("Kvasir", "Vidar")
      LatticeLink("Vidar", "Freyr")
    }

    Lattice()

  }
}
