package com.skula.pokemonrate.models;
import java.util.ArrayList;
import java.util.List;

import com.skula.pokemonrate.enums.PokClass;
import com.skula.pokemonrate.enums.PokType;

public class Pok {
	private int id;
	private String name;
	private int baseStamina;
	private int baseAttack;
	private int baseDefense;
	private PokType type1;
	private PokType type2;
	private PokClass evolutionPips;
	private int candyToEvolve;
	private int maxCP;
	private int maxHP;
	private double normalisedCP;
	private int rankCP;
	private double normalisedHP;
	private int rankHP;

	public static List<Pok> POKS;
	static{
		POKS = new ArrayList<Pok>();
		POKS.add(new Pok(1, "Bulbizarre", 90, 126, 126,  PokType.GRASS,  PokType.POISON, PokClass.NORMAL, 25, 1071, 82,  0.2584459459, 110,  0.2014742015, 113));
		POKS.add(new Pok(2, "Herbizarre", 120, 156, 158,  PokType.GRASS,  PokType.POISON, PokClass.NORMAL, 100, 1632, 106,  0.3938223938, 73,  0.2604422604, 83));
		POKS.add(new Pok(3, "Florizarre", 160, 198, 200,  PokType.GRASS,  PokType.POISON, PokClass.NORMAL, 0, 2580, 138,  0.6225868726, 18,  0.3390663391, 30));
		POKS.add(new Pok(4, "Salamèche", 78, 128, 108,  PokType.FIRE,  PokType.NONE, PokClass.NORMAL, 25, 955, 73,  0.230453668, 116,  0.1793611794, 132));
		POKS.add(new Pok(5, "Reptincel", 116, 160, 140,  PokType.FIRE,  PokType.NONE, PokClass.NORMAL, 100, 1557, 103,  0.3757239382, 77,  0.2530712531, 89));
		POKS.add(new Pok(6, "Dracaufeu", 156, 212, 182,  PokType.FIRE,  PokType.FLYING, PokClass.NORMAL, 0, 2602, 135,  0.6278957529, 15,  0.3316953317, 41));
		POKS.add(new Pok(7, "Carapuce", 88, 112, 142,  PokType.WATER,  PokType.NONE, PokClass.NORMAL, 25, 1008, 81,  0.2432432432, 112,  0.199017199, 117));
		POKS.add(new Pok(8, "Carabaffe", 118, 144, 176,  PokType.WATER,  PokType.NONE, PokClass.NORMAL, 100, 1582, 105,  0.3817567568, 76,  0.257985258, 88));
		POKS.add(new Pok(9, "Tortank", 158, 186, 222,  PokType.WATER,  PokType.NONE, PokClass.NORMAL, 0, 2542, 136,  0.6134169884, 19,  0.3341523342, 40));
		POKS.add(new Pok(10, "Chenipan", 90, 62, 66,  PokType.BUG,  PokType.NONE, PokClass.NORMAL, 12, 443, 82,  0.1069015444, 150,  0.2014742015, 116));
		POKS.add(new Pok(11, "Chrysacier", 100, 56, 86,  PokType.BUG,  PokType.NONE, PokClass.NORMAL, 50, 477, 90,  0.1151061776, 147,  0.2211302211, 108));
		POKS.add(new Pok(12, "Papilusion", 120, 144, 144,  PokType.BUG,  PokType.FLYING, PokClass.NORMAL, 0, 1454, 106,  0.3508687259, 82,  0.2604422604, 84));
		POKS.add(new Pok(13, "Aspicot", 80, 68, 64,  PokType.BUG,  PokType.POISON, PokClass.NORMAL, 12, 449, 75,  0.1083494208, 149,  0.1842751843, 131));
		POKS.add(new Pok(14, "Coconfort", 90, 62, 82,  PokType.BUG,  PokType.POISON, PokClass.NORMAL, 50, 485, 82,  0.1170366795, 146,  0.2014742015, 115));
		POKS.add(new Pok(15, "Dardargnan", 130, 144, 130,  PokType.BUG,  PokType.POISON, PokClass.NORMAL, 0, 1439, 114,  0.3472490347, 84,  0.2800982801, 67));
		POKS.add(new Pok(16, "Roucool", 80, 94, 90,  PokType.NORMAL,  PokType.FLYING, PokClass.NORMAL, 12, 679, 75,  0.1638513514, 141,  0.1842751843, 129));
		POKS.add(new Pok(17, "Roucoups", 126, 126, 122,  PokType.NORMAL,  PokType.FLYING, PokClass.NORMAL, 50, 1223, 111,  0.2951254826, 93,  0.2727272727, 70));
		POKS.add(new Pok(18, "Roucarnage", 166, 170, 166,  PokType.NORMAL,  PokType.FLYING, PokClass.NORMAL, 0, 2091, 143,  0.5045849421, 44,  0.3513513514, 28));
		POKS.add(new Pok(19, "Rattata", 60, 92, 86,  PokType.NORMAL,  PokType.NONE, PokClass.NORMAL, 25, 581, 59,  0.1402027027, 145,  0.144963145, 147));
		POKS.add(new Pok(20, "Rattatac", 110, 146, 150,  PokType.NORMAL,  PokType.NONE, PokClass.NORMAL, 0, 1444, 98,  0.3484555985, 83,  0.2407862408, 93));
		POKS.add(new Pok(21, "Piafabec", 80, 102, 78,  PokType.NORMAL,  PokType.FLYING, PokClass.NORMAL, 50, 686, 75,  0.1655405405, 140,  0.1842751843, 128));
		POKS.add(new Pok(22, "Rapasdepic", 130, 168, 146,  PokType.NORMAL,  PokType.FLYING, PokClass.NORMAL, 0, 1746, 114,  0.4213320463, 64,  0.2800982801, 61));
		POKS.add(new Pok(23, "Abo", 70, 112, 112,  PokType.POISON,  PokType.NONE, PokClass.NORMAL, 50, 824, 67,  0.1988416988, 132,  0.1646191646, 140));
		POKS.add(new Pok(24, "Arbok", 120, 166, 166,  PokType.POISON,  PokType.NONE, PokClass.NORMAL, 0, 1767, 106,  0.4263996139, 60,  0.2604422604, 78));
		POKS.add(new Pok(25, "Pikachu", 70, 124, 108,  PokType.ELECTRIC,  PokType.NONE, PokClass.NORMAL, 50, 887, 67,  0.2140444015, 123,  0.1646191646, 137));
		POKS.add(new Pok(26, "Raichu", 120, 200, 154,  PokType.ELECTRIC,  PokType.NONE, PokClass.NORMAL, 0, 2028, 106,  0.4893822394, 50,  0.2604422604, 76));
		POKS.add(new Pok(27, "Sabelette", 100, 90, 114,  PokType.GROUND,  PokType.NONE, PokClass.NORMAL, 50, 798, 90,  0.1925675676, 135,  0.2211302211, 107));
		POKS.add(new Pok(28, "Sablaireau", 150, 150, 172,  PokType.GROUND,  PokType.NONE, PokClass.NORMAL, 0, 1810, 130,  0.4367760618, 59,  0.3194103194, 45));
		POKS.add(new Pok(29, "Nidoran Fem.", 110, 100, 104,  PokType.POISON,  PokType.NONE, PokClass.NORMAL, 25, 876, 98,  0.2113899614, 125,  0.2407862408, 97));
		POKS.add(new Pok(30, "Nidorina", 140, 132, 136,  PokType.POISON,  PokType.NONE, PokClass.NORMAL, 100, 1404, 122,  0.3388030888, 86,  0.2997542998, 50));
		POKS.add(new Pok(31, "Nidoqueen", 180, 184, 190,  PokType.POISON,  PokType.GROUND, PokClass.NORMAL, 0, 2485, 154,  0.5996621622, 23,  0.3783783784, 23));
		POKS.add(new Pok(32, "Nidoran Mal.", 92, 110, 94,  PokType.POISON,  PokType.NONE, PokClass.NORMAL, 25, 843, 84,  0.2034266409, 129,  0.2063882064, 110));
		POKS.add(new Pok(33, "Nidorino", 122, 142, 128,  PokType.POISON,  PokType.NONE, PokClass.NORMAL, 100, 1372, 108,  0.3310810811, 88,  0.2653562654, 72));
		POKS.add(new Pok(34, "Nidoking", 162, 204, 170,  PokType.POISON,  PokType.GROUND, PokClass.NORMAL, 0, 2475, 139,  0.5972490347, 24,  0.3415233415, 29));
		POKS.add(new Pok(35, "Mélofée", 140, 116, 124,  PokType.FAIRY,  PokType.NONE, PokClass.NORMAL, 50, 1200, 122,  0.2895752896, 95,  0.2997542998, 51));
		POKS.add(new Pok(36, "Mélodelfe", 190, 178, 178,  PokType.FAIRY,  PokType.NONE, PokClass.NORMAL, 0, 2397, 162,  0.5784266409, 25,  0.398034398, 15));
		POKS.add(new Pok(37, "Goupix", 76, 106, 118,  PokType.FIRE,  PokType.NONE, PokClass.NORMAL, 50, 831, 71,  0.200530888, 131,  0.1744471744, 133));
		POKS.add(new Pok(38, "Feunard", 146, 176, 194,  PokType.FIRE,  PokType.NONE, PokClass.NORMAL, 0, 2188, 127,  0.527992278, 34,  0.312039312, 46));
		POKS.add(new Pok(39, "Rondoudou", 230, 98, 54,  PokType.NORMAL,  PokType.FAIRY, PokClass.NORMAL, 50, 917, 193,  0.2212837838, 119,  0.4742014742, 6));
		POKS.add(new Pok(40, "Grodoudou", 280, 168, 108,  PokType.NORMAL,  PokType.FAIRY, PokClass.NORMAL, 0, 2177, 233,  0.5253378378, 37,  0.5724815725, 3));
		POKS.add(new Pok(41, "Nosferapti", 80, 88, 90,  PokType.POISON,  PokType.FLYING, PokClass.NORMAL, 50, 642, 75,  0.1549227799, 143,  0.1842751843, 130));
		POKS.add(new Pok(42, "Nosferalto", 150, 164, 164,  PokType.POISON,  PokType.FLYING, PokClass.NORMAL, 0, 1921, 130,  0.4635617761, 51,  0.3194103194, 43));
		POKS.add(new Pok(43, "Mystherbe", 90, 134, 130,  PokType.GRASS,  PokType.POISON, PokClass.NORMAL, 25, 1148, 82,  0.277027027, 99,  0.2014742015, 112));
		POKS.add(new Pok(44, "Ortide", 120, 162, 158,  PokType.GRASS,  PokType.POISON, PokClass.NORMAL, 100, 1689, 106,  0.4075772201, 70,  0.2604422604, 80));
		POKS.add(new Pok(45, "Rafflesia", 150, 202, 190,  PokType.GRASS,  PokType.POISON, PokClass.NORMAL, 0, 2492, 130,  0.6013513514, 22,  0.3194103194, 42));
		POKS.add(new Pok(46, "Paras", 70, 122, 120,  PokType.BUG,  PokType.GRASS, PokClass.NORMAL, 50, 916, 67,  0.221042471, 120,  0.1646191646, 136));
		POKS.add(new Pok(47, "Parasect", 120, 162, 170,  PokType.BUG,  PokType.GRASS, PokClass.NORMAL, 0, 1747, 106,  0.4215733591, 63,  0.2604422604, 79));
		POKS.add(new Pok(48, "Mimitoss", 120, 108, 118,  PokType.BUG,  PokType.POISON, PokClass.NORMAL, 50, 1029, 106,  0.2483108108, 111,  0.2604422604, 87));
		POKS.add(new Pok(49, "Aéromite", 140, 172, 154,  PokType.BUG,  PokType.POISON, PokClass.NORMAL, 0, 1890, 122,  0.4560810811, 52,  0.2997542998, 49));
		POKS.add(new Pok(50, "Taupiqueur", 20, 108, 86,  PokType.GROUND,  PokType.NONE, PokClass.NORMAL, 50, 456, 27,  0.11003861, 148,  0.06633906634, 151));
		POKS.add(new Pok(51, "Triopikeur", 70, 148, 140,  PokType.GROUND,  PokType.NONE, PokClass.NORMAL, 0, 1168, 67,  0.2818532819, 97,  0.1646191646, 134));
		POKS.add(new Pok(52, "Miaouss", 80, 104, 94,  PokType.NORMAL,  PokType.NONE, PokClass.NORMAL, 50, 756, 75,  0.1824324324, 139,  0.1842751843, 127));
		POKS.add(new Pok(53, "Persian", 130, 156, 146,  PokType.NORMAL,  PokType.NONE, PokClass.NORMAL, 0, 1631, 114,  0.3935810811, 74,  0.2800982801, 66));
		POKS.add(new Pok(54, "Psykokwak", 100, 132, 112,  PokType.WATER,  PokType.NONE, PokClass.NORMAL, 50, 1109, 90,  0.2676158301, 103,  0.2211302211, 105));
		POKS.add(new Pok(55, "Akwakwak", 160, 194, 176,  PokType.WATER,  PokType.NONE, PokClass.NORMAL, 0, 2386, 138,  0.5757722008, 26,  0.3390663391, 32));
		POKS.add(new Pok(56, "Férosinge", 80, 122, 96,  PokType.FIGHTING,  PokType.NONE, PokClass.NORMAL, 50, 878, 75,  0.2118725869, 124,  0.1842751843, 123));
		POKS.add(new Pok(57, "Colossinge", 130, 178, 150,  PokType.FIGHTING,  PokType.NONE, PokClass.NORMAL, 0, 1864, 114,  0.4498069498, 54,  0.2800982801, 60));
		POKS.add(new Pok(58, "Caninos", 110, 156, 110,  PokType.FIRE,  PokType.NONE, PokClass.NORMAL, 50, 1335, 98,  0.3221525097, 90,  0.2407862408, 95));
		POKS.add(new Pok(59, "Arcanin", 180, 230, 180,  PokType.FIRE,  PokType.NONE, PokClass.NORMAL, 0, 2983, 154,  0.7198359073, 7,  0.3783783784, 19));
		POKS.add(new Pok(60, "Ptitard", 80, 108, 98,  PokType.WATER,  PokType.NONE, PokClass.NORMAL, 25, 795, 75,  0.1918436293, 136,  0.1842751843, 126));
		POKS.add(new Pok(61, "Têtarte", 130, 132, 132,  PokType.WATER,  PokType.NONE, PokClass.NORMAL, 100, 1340, 114,  0.3233590734, 89,  0.2800982801, 68));
		POKS.add(new Pok(62, "Tartard", 180, 180, 202,  PokType.WATER,  PokType.FIGHTING, PokClass.NORMAL, 0, 2505, 154,  0.604488417, 21,  0.3783783784, 22));
		POKS.add(new Pok(63, "Abra", 50, 110, 76,  PokType.PSYCHIC,  PokType.NONE, PokClass.NORMAL, 25, 600, 51,  0.1447876448, 144,  0.1253071253, 149));
		POKS.add(new Pok(64, "Kadabra", 80, 150, 112,  PokType.PSYCHIC,  PokType.NONE, PokClass.NORMAL, 100, 1131, 75,  0.2729247104, 100,  0.1842751843, 121));
		POKS.add(new Pok(65, "Alakazam", 110, 186, 152,  PokType.PSYCHIC,  PokType.NONE, PokClass.NORMAL, 0, 1813, 98,  0.4375, 58,  0.2407862408, 91));
		POKS.add(new Pok(66, "Machoc", 140, 118, 96,  PokType.FIGHTING,  PokType.NONE, PokClass.NORMAL, 25, 1089, 122,  0.2627895753, 107,  0.2997542998, 52));
		POKS.add(new Pok(67, "Machopeur", 160, 154, 144,  PokType.FIGHTING,  PokType.NONE, PokClass.NORMAL, 100, 1760, 138,  0.4247104247, 61,  0.3390663391, 37));
		POKS.add(new Pok(68, "Mackogneur", 180, 198, 180,  PokType.FIGHTING,  PokType.NONE, PokClass.NORMAL, 0, 2594, 154,  0.625965251, 17,  0.3783783784, 21));
		POKS.add(new Pok(69, "Chétiflor", 100, 158, 78,  PokType.GRASS,  PokType.POISON, PokClass.NORMAL, 25, 1117, 90,  0.269546332, 102,  0.2211302211, 104));
		POKS.add(new Pok(70, "Boustiflor", 130, 190, 110,  PokType.GRASS,  PokType.POISON, PokClass.NORMAL, 100, 1723, 114,  0.4157818533, 66,  0.2800982801, 63));
		POKS.add(new Pok(71, "Empiflor", 160, 222, 152,  PokType.GRASS,  PokType.POISON, PokClass.NORMAL, 0, 2530, 138,  0.6105212355, 20,  0.3390663391, 31));
		POKS.add(new Pok(72, "Tentacool", 80, 106, 136,  PokType.WATER,  PokType.POISON, PokClass.NORMAL, 50, 905, 75,  0.2183880309, 121,  0.1842751843, 122));
		POKS.add(new Pok(73, "Tentacruel", 160, 170, 196,  PokType.WATER,  PokType.POISON, PokClass.NORMAL, 0, 2220, 138,  0.5357142857, 32,  0.3390663391, 34));
		POKS.add(new Pok(74, "Racaillou", 80, 106, 118,  PokType.ROCK,  PokType.GROUND, PokClass.NORMAL, 25, 849, 75,  0.2048745174, 128,  0.1842751843, 124));
		POKS.add(new Pok(75, "Gravalanch", 110, 142, 156,  PokType.ROCK,  PokType.GROUND, PokClass.NORMAL, 100, 1433, 98,  0.3458011583, 85,  0.2407862408, 94));
		POKS.add(new Pok(76, "Grolem", 160, 176, 198,  PokType.ROCK,  PokType.GROUND, PokClass.NORMAL, 0, 2303, 138,  0.5557432432, 27,  0.3390663391, 33));
		POKS.add(new Pok(77, "Ponyta", 100, 168, 138,  PokType.FIRE,  PokType.NONE, PokClass.NORMAL, 50, 1516, 90,  0.3658301158, 79,  0.2211302211, 102));
		POKS.add(new Pok(78, "Galopa", 130, 200, 170,  PokType.FIRE,  PokType.NONE, PokClass.NORMAL, 0, 2199, 114,  0.5306467181, 33,  0.2800982801, 56));
		POKS.add(new Pok(79, "Ramoloss", 180, 110, 110,  PokType.WATER,  PokType.PSYCHIC, PokClass.NORMAL, 50, 1218, 154,  0.2939189189, 94,  0.3783783784, 26));
		POKS.add(new Pok(80, "Flagadoss", 190, 184, 198,  PokType.WATER,  PokType.PSYCHIC, PokClass.NORMAL, 0, 2597, 162,  0.6266891892, 16,  0.398034398, 14));
		POKS.add(new Pok(81, "Magnéti", 50, 128, 138,  PokType.ELECTRIC,  PokType.STEEL, PokClass.NORMAL, 50, 890, 51,  0.2147683398, 122,  0.1253071253, 148));
		POKS.add(new Pok(82, "Magnéton", 100, 186, 180,  PokType.ELECTRIC,  PokType.STEEL, PokClass.NORMAL, 0, 1879, 90,  0.4534266409, 53,  0.2211302211, 100));
		POKS.add(new Pok(83, "Canarticho", 104, 138, 132,  PokType.NORMAL,  PokType.FLYING, PokClass.NORMAL, 0, 1263, 94,  0.3047779923, 92,  0.230958231, 98));
		POKS.add(new Pok(84, "Doduo", 70, 126, 96,  PokType.NORMAL,  PokType.FLYING, PokClass.NORMAL, 50, 855, 67,  0.2063223938, 127,  0.1646191646, 139));
		POKS.add(new Pok(85, "Dodrio", 120, 182, 150,  PokType.NORMAL,  PokType.FLYING, PokClass.NORMAL, 0, 1836, 106,  0.4430501931, 56,  0.2604422604, 77));
		POKS.add(new Pok(86, "Otaria", 130, 104, 138,  PokType.WATER,  PokType.NONE, PokClass.NORMAL, 50, 1107, 114,  0.2671332046, 104,  0.2800982801, 69));
		POKS.add(new Pok(87, "Lamantine", 180, 156, 192,  PokType.WATER,  PokType.ICE, PokClass.NORMAL, 0, 2145, 154,  0.5176158301, 39,  0.3783783784, 24));
		POKS.add(new Pok(88, "Tadmorv", 160, 124, 110,  PokType.POISON,  PokType.NONE, PokClass.NORMAL, 50, 1284, 138,  0.3098455598, 91,  0.3390663391, 38));
		POKS.add(new Pok(89, "Grotadmorv", 210, 180, 188,  PokType.POISON,  PokType.NONE, PokClass.NORMAL, 0, 2602, 177,  0.6278957529, 14,  0.4348894349, 8));
		POKS.add(new Pok(90, "Kokiyas", 60, 120, 112,  PokType.WATER,  PokType.NONE, PokClass.NORMAL, 50, 822, 59,  0.1983590734, 133,  0.144963145, 143));
		POKS.add(new Pok(91, "Crustabri", 100, 196, 196,  PokType.WATER,  PokType.ICE, PokClass.NORMAL, 0, 2052, 90,  0.4951737452, 47,  0.2211302211, 99));
		POKS.add(new Pok(92, "Fantominus", 60, 136, 82,  PokType.GHOST,  PokType.POISON, PokClass.NORMAL, 25, 804, 59,  0.194015444, 134,  0.144963145, 144));
		POKS.add(new Pok(93, "Spectrum", 90, 172, 118,  PokType.GHOST,  PokType.POISON, PokClass.NORMAL, 100, 1380, 82,  0.333011583, 87,  0.2014742015, 111));
		POKS.add(new Pok(94, "Ectoplasma", 120, 204, 156,  PokType.GHOST,  PokType.POISON, PokClass.NORMAL, 0, 2078, 106,  0.5014478764, 45,  0.2604422604, 75));
		POKS.add(new Pok(95, "Onix", 70, 90, 186,  PokType.ROCK,  PokType.GROUND, PokClass.NORMAL, 0, 857, 67,  0.2068050193, 126,  0.1646191646, 138));
		POKS.add(new Pok(96, "Soporifik", 120, 104, 140,  PokType.PSYCHIC,  PokType.NONE, PokClass.NORMAL, 50, 1075, 106,  0.2594111969, 109,  0.2604422604, 86));
		POKS.add(new Pok(97, "Hypnomade", 170, 162, 196,  PokType.PSYCHIC,  PokType.NONE, PokClass.NORMAL, 0, 2184, 146,  0.527027027, 35,  0.3587223587, 27));
		POKS.add(new Pok(98, "Krabby", 60, 116, 110,  PokType.WATER,  PokType.NONE, PokClass.NORMAL, 50, 792, 59,  0.1911196911, 138,  0.144963145, 146));
		POKS.add(new Pok(99, "Krabboss", 110, 178, 168,  PokType.WATER,  PokType.NONE, PokClass.NORMAL, 0, 1823, 98,  0.4399131274, 57,  0.2407862408, 90));
		POKS.add(new Pok(100, "Voltorbe", 80, 102, 124,  PokType.ELECTRIC,  PokType.NONE, PokClass.NORMAL, 50, 839, 75,  0.20246139, 130,  0.1842751843, 125));
		POKS.add(new Pok(101, "Électrode", 120, 150, 174,  PokType.ELECTRIC,  PokType.NONE, PokClass.NORMAL, 0, 1646, 106,  0.3972007722, 72,  0.2604422604, 82));
		POKS.add(new Pok(102, "Noeunoeuf", 120, 110, 132,  PokType.GRASS,  PokType.PSYCHIC, PokClass.NORMAL, 50, 1099, 106,  0.2652027027, 106,  0.2604422604, 85));
		POKS.add(new Pok(103, "Noadkoko", 190, 232, 164,  PokType.GRASS,  PokType.PSYCHIC, PokClass.NORMAL, 0, 2955, 162,  0.7130791506, 10,  0.398034398, 12));
		POKS.add(new Pok(104, "Osselait", 100, 102, 150,  PokType.GROUND,  PokType.NONE, PokClass.NORMAL, 50, 1006, 90,  0.2427606178, 113,  0.2211302211, 106));
		POKS.add(new Pok(105, "Ossatueur", 120, 140, 202,  PokType.GROUND,  PokType.NONE, PokClass.NORMAL, 0, 1656, 106,  0.3996138996, 71,  0.2604422604, 81));
		POKS.add(new Pok(106, "Kicklee", 100, 148, 172,  PokType.FIGHTING,  PokType.NONE, PokClass.NORMAL, 0, 1492, 90,  0.36003861, 81,  0.2211302211, 103));
		POKS.add(new Pok(107, "Tygnon", 100, 138, 204,  PokType.FIGHTING,  PokType.NONE, PokClass.NORMAL, 0, 1516, 90,  0.3658301158, 78,  0.2211302211, 101));
		POKS.add(new Pok(108, "Excelangue", 180, 126, 160,  PokType.NORMAL,  PokType.NONE, PokClass.NORMAL, 0, 1626, 154,  0.3923745174, 75,  0.3783783784, 25));
		POKS.add(new Pok(109, "Smogo", 80, 136, 142,  PokType.POISON,  PokType.NONE, PokClass.NORMAL, 50, 1151, 75,  0.2777509653, 98,  0.1842751843, 120));
		POKS.add(new Pok(110, "Smogogo", 130, 190, 198,  PokType.POISON,  PokType.NONE, PokClass.NORMAL, 0, 2250, 114,  0.542953668, 29,  0.2800982801, 55));
		POKS.add(new Pok(111, "Rhinocorne", 160, 110, 116,  PokType.GROUND,  PokType.ROCK, PokClass.NORMAL, 50, 1182, 138,  0.2852316602, 96,  0.3390663391, 39));
		POKS.add(new Pok(112, "Rhinoféros", 210, 166, 160,  PokType.GROUND,  PokType.ROCK, PokClass.NORMAL, 0, 2243, 177,  0.5412644788, 30,  0.4348894349, 9));
		POKS.add(new Pok(113, "Leveinard", 500, 40, 60,  PokType.NORMAL,  PokType.NONE, PokClass.NORMAL, 0, 675, 407,  0.1628861004, 142, 1, 1));
		POKS.add(new Pok(114, "Saquedeneu", 130, 164, 152,  PokType.GRASS,  PokType.NONE, PokClass.NORMAL, 0, 1739, 114,  0.4196428571, 65,  0.2800982801, 62));
		POKS.add(new Pok(115, "Kangourex", 210, 142, 178,  PokType.NORMAL,  PokType.NONE, PokClass.NORMAL, 0, 2043, 177,  0.4930019305, 49,  0.4348894349, 10));
		POKS.add(new Pok(116, "Hypotrempe", 60, 122, 100,  PokType.WATER,  PokType.NONE, PokClass.NORMAL, 50, 794, 59,  0.1916023166, 137,  0.144963145, 145));
		POKS.add(new Pok(117, "Hypocéan", 110, 176, 150,  PokType.WATER,  PokType.NONE, PokClass.NORMAL, 0, 1713, 98,  0.4133687259, 68,  0.2407862408, 92));
		POKS.add(new Pok(118, "Poissirène", 90, 112, 126,  PokType.WATER,  PokType.NONE, PokClass.NORMAL, 50, 965, 82,  0.2328667954, 115,  0.2014742015, 114));
		POKS.add(new Pok(119, "Poissoroy", 160, 172, 160,  PokType.WATER,  PokType.NONE, PokClass.NORMAL, 0, 2043, 138,  0.4930019305, 48,  0.3390663391, 36));
		POKS.add(new Pok(120, "Stari", 60, 130, 128,  PokType.WATER,  PokType.NONE, PokClass.NORMAL, 50, 937, 59,  0.2261100386, 117,  0.144963145, 142));
		POKS.add(new Pok(121, "Staross", 120, 194, 192,  PokType.WATER,  PokType.PSYCHIC, PokClass.NORMAL, 0, 2182, 106,  0.5265444015, 36,  0.2604422604, 73));
		POKS.add(new Pok(122, "M. Mime", 80, 154, 196,  PokType.PSYCHIC,  PokType.FAIRY, PokClass.NORMAL, 0, 1494, 75,  0.3605212355, 80,  0.1842751843, 119));
		POKS.add(new Pok(123, "Insécateur", 140, 176, 180,  PokType.BUG,  PokType.FLYING, PokClass.NORMAL, 0, 2073, 122,  0.5002413127, 46,  0.2997542998, 48));
		POKS.add(new Pok(124, "Lippoutou", 130, 172, 134,  PokType.ICE,  PokType.PSYCHIC, PokClass.NORMAL, 0, 1716, 114,  0.4140926641, 67,  0.2800982801, 64));
		POKS.add(new Pok(125, "Élektek", 130, 198, 160,  PokType.ELECTRIC,  PokType.NONE, PokClass.NORMAL, 0, 2119, 114,  0.5113416988, 43,  0.2800982801, 59));
		POKS.add(new Pok(126, "Magmar", 130, 214, 158,  PokType.FIRE,  PokType.NONE, PokClass.NORMAL, 0, 2265, 114,  0.5465733591, 28,  0.2800982801, 54));
		POKS.add(new Pok(127, "Scarabrute", 130, 184, 186,  PokType.BUG,  PokType.NONE, PokClass.NORMAL, 0, 2121, 114,  0.5118243243, 42,  0.2800982801, 58));
		POKS.add(new Pok(128, "Tauros", 150, 148, 184,  PokType.NORMAL,  PokType.NONE, PokClass.NORMAL, 0, 1844, 130,  0.444980695, 55,  0.3194103194, 44));
		POKS.add(new Pok(129, "Magicarpe", 40, 42, 84,  PokType.WATER,  PokType.NONE, PokClass.NORMAL, 400, 262, 43,  0.06322393822, 151,  0.1056511057, 150));
		POKS.add(new Pok(130, "Léviator", 190, 192, 196,  PokType.WATER,  PokType.FLYING, PokClass.NORMAL, 0, 2688, 162,  0.6486486486, 12,  0.398034398, 13));
		POKS.add(new Pok(131, "Lokhlass", 260, 186, 190,  PokType.WATER,  PokType.ICE, PokClass.NORMAL, 0, 2980, 217,  0.7191119691, 8,  0.5331695332, 4));
		POKS.add(new Pok(132, "Métamorph", 96, 110, 110,  PokType.NORMAL,  PokType.NONE, PokClass.NORMAL, 0, 919, 87,  0.2217664093, 118,  0.2137592138, 109));
		POKS.add(new Pok(133, "Évoli", 110, 114, 128,  PokType.NORMAL,  PokType.NONE, PokClass.NORMAL, 25, 1077, 98,  0.2598938224, 108,  0.2407862408, 96));
		POKS.add(new Pok(134, "Aquali", 260, 186, 168,  PokType.WATER,  PokType.NONE, PokClass.NORMAL, 0, 2816, 217,  0.6795366795, 11,  0.5331695332, 5));
		POKS.add(new Pok(135, "Voltali", 130, 192, 174,  PokType.ELECTRIC,  PokType.NONE, PokClass.NORMAL, 0, 2140, 114,  0.5164092664, 40,  0.2800982801, 57));
		POKS.add(new Pok(136, "Pyroli", 130, 238, 178,  PokType.FIRE,  PokType.NONE, PokClass.NORMAL, 0, 2643, 114,  0.6377895753, 13,  0.2800982801, 53));
		POKS.add(new Pok(137, "Porygon", 130, 156, 158,  PokType.NORMAL,  PokType.NONE, PokClass.NORMAL, 0, 1691, 114,  0.4080598456, 69,  0.2800982801, 65));
		POKS.add(new Pok(138, "Amonita", 70, 132, 160,  PokType.ROCK,  PokType.WATER, PokClass.NORMAL, 50, 1119, 67,  0.2700289575, 101,  0.1646191646, 135));
		POKS.add(new Pok(139, "Amonistar", 140, 180, 202,  PokType.ROCK,  PokType.WATER, PokClass.NORMAL, 0, 2233, 122,  0.5388513514, 31,  0.2997542998, 47));
		POKS.add(new Pok(140, "Kabuto", 60, 148, 142,  PokType.ROCK,  PokType.WATER, PokClass.NORMAL, 50, 1104, 59,  0.2664092664, 105,  0.144963145, 141));
		POKS.add(new Pok(141, "Kabutops", 120, 190, 190,  PokType.ROCK,  PokType.WATER, PokClass.NORMAL, 0, 2130, 106,  0.513996139, 41,  0.2604422604, 74));
		POKS.add(new Pok(142, "Ptéra", 160, 182, 162,  PokType.ROCK,  PokType.FLYING, PokClass.NORMAL, 0, 2165, 138,  0.5224420849, 38,  0.3390663391, 35));
		POKS.add(new Pok(143, "Ronflex", 320, 180, 180,  PokType.NORMAL,  PokType.NONE, PokClass.NORMAL, 0, 3112, 264,  0.750965251, 6,  0.6486486486, 2));
		POKS.add(new Pok(144, "Artikodin", 180, 198, 242,  PokType.ICE,  PokType.FLYING,  PokClass.LEGENDARY, 0, 2978, 154,  0.7186293436, 9,  0.3783783784, 20));
		POKS.add(new Pok(145, "Électhor", 180, 232, 194,  PokType.ELECTRIC,  PokType.FLYING,  PokClass.LEGENDARY, 0, 3114, 154,  0.7514478764, 5,  0.3783783784, 18));
		POKS.add(new Pok(146, "Sulfura", 180, 242, 194,  PokType.FIRE,  PokType.FLYING,  PokClass.LEGENDARY, 0, 3240, 154,  0.7818532819, 4,  0.3783783784, 17));
		POKS.add(new Pok(147, "Minidraco", 82, 128, 110,  PokType.DRAGON,  PokType.NONE, PokClass.NORMAL, 25, 983, 76,  0.2372104247, 114,  0.1867321867, 118));
		POKS.add(new Pok(148, "Draco", 122, 170, 152,  PokType.DRAGON,  PokType.NONE, PokClass.NORMAL, 100, 1747, 108,  0.4215733591, 62,  0.2653562654, 71));
		POKS.add(new Pok(149, "Dracolosse", 182, 250, 212,  PokType.DRAGON,  PokType.FLYING, PokClass.NORMAL, 0, 3500, 155,  0.8445945946, 2,  0.3808353808, 16));
		POKS.add(new Pok(150, "Mewtwo", 200, 220, 220,  PokType.PSYCHIC,  PokType.NONE,  PokClass.MYTHIC, 0, 3299, 169,  0.7960907336, 3,  0.4152334152, 11));
		POKS.add(new Pok(151, "Mew", 212, 284, 202,  PokType.PSYCHIC,  PokType.NONE,  PokClass.LEGENDARY, 0, 4144, 179, 1, 1,  0.4398034398, 7));
	}
	
	public static void main(String[] args) {

	}
	
	public static String[] getPokemonsNames(){
		String[] res = new String[POKS.size()];
		for(int i=0; i<POKS.size(); i++){
			res[i] =POKS.get(i).getName();
		}
		return res;
	}

	public Pok() {

	}

	public Pok(int id, String name, int baseStamina, int baseAttack,
			int baseDefense, PokType type1, PokType type2,
			PokClass evolutionPips, int candyToEvolve, int maxCP, int maxHP,
			double normalisedCP, int rankCP, double normalisedHP, int rankHP) {
		this.id = id;
		this.name = name;
		this.baseStamina = baseStamina;
		this.baseAttack = baseAttack;
		this.baseDefense = baseDefense;
		this.type1 = type1;
		this.type2 = type2;
		this.evolutionPips = evolutionPips;
		this.candyToEvolve = candyToEvolve;
		this.maxCP = maxCP;
		this.maxHP = maxHP;
		this.normalisedCP = normalisedCP;
		this.rankCP = rankCP;
		this.normalisedHP = normalisedHP;
		this.rankHP = rankHP;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBaseStamina() {
		return baseStamina;
	}

	public void setBaseStamina(int baseStamina) {
		this.baseStamina = baseStamina;
	}

	public int getBaseAttack() {
		return baseAttack;
	}

	public void setBaseAttack(int baseAttack) {
		this.baseAttack = baseAttack;
	}

	public int getBaseDefense() {
		return baseDefense;
	}

	public void setBaseDefense(int baseDefense) {
		this.baseDefense = baseDefense;
	}

	public PokType getType1() {
		return type1;
	}

	public void setType1(PokType type1) {
		this.type1 = type1;
	}

	public PokType getType2() {
		return type2;
	}

	public void setType2(PokType type2) {
		this.type2 = type2;
	}

	public PokClass getEvolutionPips() {
		return evolutionPips;
	}

	public void setEvolutionPips(PokClass evolutionPips) {
		this.evolutionPips = evolutionPips;
	}

	public int getCandyToEvolve() {
		return candyToEvolve;
	}

	public void setCandyToEvolve(int candyToEvolve) {
		this.candyToEvolve = candyToEvolve;
	}

	public int getMaxCP() {
		return maxCP;
	}

	public void setMaxCP(int maxCP) {
		this.maxCP = maxCP;
	}

	public int getMaxHP() {
		return maxHP;
	}

	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}

	public double getNormalisedCP() {
		return normalisedCP;
	}

	public void setNormalisedCP(double normalisedCP) {
		this.normalisedCP = normalisedCP;
	}

	public int getRankCP() {
		return rankCP;
	}

	public void setRankCP(int rankCP) {
		this.rankCP = rankCP;
	}

	public double getNormalisedHP() {
		return normalisedHP;
	}

	public void setNormalisedHP(double normalisedHP) {
		this.normalisedHP = normalisedHP;
	}

	public int getRankHP() {
		return rankHP;
	}

	public void setRankHP(int rankHP) {
		this.rankHP = rankHP;
	}
}
