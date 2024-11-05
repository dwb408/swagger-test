package com.test.config;

import java.util.List;
import java.util.Map;

public class AppConfig {

	public static String ip = "";
	
	public static String port = "";
	
	public static List<Map<String, Object>> listLines = List.of(
			Map.of("Name","RLLine1","ID","1","Type","Physical","EquipmentType","AR-DCE"),
			Map.of("Name","AVLine2","ID","2","Type","Physical","EquipmentType","AR-DCE"));
	
	public static Map<String, Object> lineDetail = Map.of(
			"RLLine1", Map.of(
					"ID","1",
					"Name","RLLine1",
					"Type","Physical",
					"LogicalDescriptor","",
			        "EquipmentType", "AR-DCE",
			        "PhysicalAddress", "RLLine1",
					"PathID", "L001",
					"Machine", List.of(
							Map.of(
						            "Name", "RL132-1",
						            "Serial", "70V0001",
						            "Position", "1",
						            "MachineType", "RL132",
						            "StationType", "40",
						            "MultiAngle", "1",
						            "PitchSelect", "4",
						            "EquipmentID", "M01",
						            "SkipNo", "1,7,9"
									))),
			"AVLine2", Map.of(
			        "ID", "2",
			        "Name","AVLine2",
			        "Type","Physical",
			        "LogicalDescriptor","",
			        "EquipmentType", "AR-DCE",
			        "PhysicalAddress", "AVLine2",
					"PathID", "L002",
					"Machine", List.of(
							Map.of(
						            "Name", "AV132-1",
						            "Serial", "70V0001",
						            "Position", "2",
						            "MachineType", "AV132",
						            "StationType", "40",
						            "MultiAngle", "1",
						            "PitchSelect", "4",
						            "EquipmentID", "M01",
						            "SkipNo", "1,7,9"
						            	),
							Map.of(
						            "Name", "AV132-2",
						            "Serial", "70V0003",
						            "Position", "3",
						            "MachineType", "AV132",
						            "StationType", "40",
						            "MultiAngle", "1",
						            "PitchSelect", "4",
						            "EquipmentID", "M02",
						            "SkipNo", "1,7" 
									))
					)
			);
}
