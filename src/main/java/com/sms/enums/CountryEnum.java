package com.sms.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Entity;

/**
 * @Author mei
 * @create 2023/2/7 11,56
 */
@AllArgsConstructor
@Getter
public enum CountryEnum {

    Russia(0, "俄罗斯"),
    Ukraine(1, "乌克兰"),
    Kazakhstan(2, "哈萨克斯坦"),
    China(3, "中国"),
    the_Philippines(4, "菲律宾"),
    Myanmar(5, "缅甸"),
    Indonesia(6, "印度尼西亚"),
    Malaysia(7, "马来西亚"),
    Kenya(8, "肯尼亚"),
    Tanzania(9, "坦桑尼亚"),
    Vietnam(10, "越南"),
    Kyrgyzstan(11, "吉尔吉斯斯坦"),
    US_Virtual(12, "美国虚拟"),
    Israel(13, "以色列"),
    Hong_Kong(14, "香港"),
    poland(15, "波兰"),
    England(16, "英格兰"),
    Madagascar(17, "马达加斯加"),
    Congo(18, "刚果"),
    Nigeria(19, "尼日利亚"),
    Macao(20, "澳门"),
    Egypt(21, "埃及"),
    India(22, "印度"),
    Ireland(23, "爱尔兰"),
    Cambodia(24, "柬埔寨"),
    Laos(25, "老挝"),
    Haiti(26, "海地"),
    Ivory_Coast(27, "象牙海岸"),
    Gambia(28, "冈比亚"),
    Serbia(29, "塞尔维亚"),
    Yemen(30, "也门"),
    South_Africa(31, "南非"),
    Romania(32, "罗马尼亚"),
    Columbia(33, "哥伦比亚"),
    Estonia(34, "爱沙尼亚"),
    Canada(36, "加拿大"),
    Morocco(37, "摩洛哥"),
    Ghana(38, "加纳"),
    Argentina(39, "阿根廷"),
    Uzbekistan(40, "乌兹别克斯坦"),
    Cameroon(41, "喀麦隆"),
    Chad(42, "乍得"),
    Germany(43, "德国"),
    Lithuania(44, "立陶宛"),
    Croatia(45, "克罗地亚"),
    Sweden(46, "瑞典"),
    Iraq(47, "伊拉克"),
    Netherlands(48, "荷兰"),
    Latvia(49, "拉脱维亚"),
    Austria(50, "奥地利"),
    Belarus(51, "白俄罗斯"),
    Thailand(52, "泰国"),
    Saudi_Arabia(53, "沙特阿拉伯"),
    Mexico(54, "墨西哥"),
    Taiwan(55, "台湾"),
    Spain(56, "西班牙"),
    Algeria(58, "阿尔及利亚"),
    Slovenia(59, "斯洛文尼亚"),
    The_People_Republic_of_Bangladesh(60, "孟加拉国"),
    Senegal(61, "塞内加尔"),
    Turkiye(62, "土耳其"),
    The_Czech_Republic(63, "捷克共和国"),
    Sri_Lanka(64, "斯里兰卡"),
    Peru(65, "秘鲁"),
    Pakistan(66, "巴基斯坦"),
    New_Zealand(67, "新西兰"),
    Guinea(68, "几内亚"),
    Mali(69, "马里"),
    Venezuela(70, "委内瑞拉"),
    Ethiopia(71, "埃塞俄比亚"),
    Mongolia(72, "蒙古"),
    Brazil(73, "巴西"),
    Afghanistan(74, "阿富汗"),
    Uganda(75, "乌干达"),
    Angola(76, "安哥拉"),
    Cyprus(77, "塞浦路斯"),
    France(78, "法國"),
    Papua_New_Guinea(79, "巴布亞新幾內亞"),
    Mozambique(80, "莫桑比克"),
    Nepal(81, "尼泊爾"),
    Belgium(82, "比利時"),
    Bulgaria(83, "保加利亞"),
    Hungary(84, "匈牙利"),
    Moldova(85, "摩爾多瓦"),
    Italy(86, "義大利"),
    Paraguay(87, "巴拉圭"),
    Honduras(88, "洪都拉斯"),
    Tunisia(89, "突尼斯"),
    Nicaragua(90, "尼加拉瓜"),
    East_Timor(91, "東帝汶"),
    Bolivia(92, "玻利維亞"),
    Costa_Rica(93, "哥斯達黎加"),
    Guatemala(94, "危地馬拉"),
    United_Arab_Emirates(95, "阿拉伯聯合酋長國"),
    Zimbabwe(96, "津巴布韋"),
    Puerto_Rico(97, "波多黎各"),
    Togo(99, "多哥"),
    Kuwait(100, "科威特"),
    El_Salvador(101, "薩爾瓦多"),
    Libya(102, "利比亞"),
    Jamaica(103, "牙買加"),
    trinidad_And_Tobago(104, "特立尼達和多巴哥"),
    Ecuador(105, "厄瓜多爾"),
    Swaziland(106, "斯威士蘭"),
    Oman(107, "阿曼"),
    Bosnia_Herzegovina(108, "波斯尼亞和黑塞哥維那"),
    Dominican_Republic(109, "多明尼加共和國"),
    Qatar(111, "卡塔爾"),
    panama(112, "巴拿馬"),
    Mauritania(114, "毛里塔尼亞"),
    sierra_leone(115, "塞拉利昂"),
    Jordan(116, "約旦"),
    Portugal(117, "葡萄牙"),
    Barbados(118, "巴巴多斯"),
    Burundi(119, "布隆迪"),
    Benin(120, "貝寧"),
    Brunei(121, "文萊"),
    Bahamas(122, "巴哈馬"),
    Botswana(123, "博茨瓦納"),
    Belize(124, "伯利茲"),
    Central_African_Republic(125, "中非共和國"),
    Dominican(126, "多米尼加"),
    Grenada(127, "格林納達"),
    Georgia(128, "佐治亞州"),
    Greece(129, "希臘"),
    Guinea_Bissau(130, "幾內亞比紹"),
    Guyana(131, "圭亞那"),
    iceland(132, "冰島"),
    Comoros(133, "科摩羅"),
    Saint_Kitts_and_Nevis(134, "聖基茨和尼維斯"),
    Liberia(135, "利比里亞"),
    Lesotho(136, "萊索托"),
    Malawi(137, "馬拉維"),
    Namibia(138, "納米比亞"),
    Niger(139, "尼日爾"),
    Rwanda(140, "盧旺達"),
    Slovakia(141, "斯洛伐克"),
    Suriname(142, "蘇里南"),
    Tajikistan(143, "塔吉克斯坦"),
    monaco(144, "摩納哥"),
    Bahrain(145, "巴林"),
    Reunion(146, "團圓"),
    Zambia(147, "贊比亞"),
    Armenia(148, "亞美尼亞"),
    Somalia(149, "索馬里"),
    Congo1(150, "剛果"),
    Chile(151, "智利"),
    Burkina_Faso(152, "布基納法索"),
    Lebanon(153, "黎巴嫩"),
    Gabon(154, "加蓬"),
    Albania(155, "阿爾巴尼亞"),
    Uruguay(156, "烏拉圭"),
    mauritius(157, "毛里求斯"),
    butane(158, "丁烷"),
    Maldives(159, "马尔代夫"),
    Guadeloupe(160, "瓜德罗普岛"),
    Turkmenistan(161, "土库曼斯坦"),
    French_Guyana(162, "法属圭亚那"),
    Finland(163, "芬兰"),
    Saint_Lucia(164, "圣卢西亚"),
    Luxembourg(165, "卢森堡"),
    Saint_Vincent_and_the_Grenadines(166, "圣文森特和格林纳丁斯"),
    Equatorial_uinea(167, "赤道几内亚"),
    djibouti(168, "吉布地"),
    Antigua_and_Barbuda(169, "安提瓜和巴布达"),
    Cayman_Islands(170, "开曼群岛"),
    Montenegro(171, "黑山共和国"),
    Denmark(172, "丹麥"),
    Switzerland(173, "瑞士"),
    Norway(174, "挪威"),
    Australia(175, "澳大利亞"),
    Eritrea(176, "厄立特里亞"),
    South_Sudan(177, "南蘇丹"),
    Sao_Tome_and_Principe(178, "聖多美和普林西比"),
    Aruba(179, "阿魯巴島"),
    Montserrat(180, "蒙特塞拉特"),
    Anguilla(181, "安圭拉島"),
    Northern_Macedonia(183, "北馬其頓"),
    Republic_of_Seychelles(184, "塞舌爾共和國"),
    New_Caledonia(185, "新喀裡多尼亞"),
    Cape_Verde(186, "佛得角"),
    American_Physics(187, "美国物理"),
    Fiji(189, "斐濟"),
    Republic_of_Singapore(196, "新加坡共和国");

    private final Integer index;
    private final String value;


}
