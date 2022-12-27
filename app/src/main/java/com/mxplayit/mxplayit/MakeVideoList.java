
package com.mxplayit.mxplayit;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList {

	public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList;
	public static ArrayList< HashMap<String, String> > catArrayList;
	public static ArrayList< HashMap<String, String> > videoArrayList;
	public static HashMap<String, String> hashMap;


	//--------------------------------------------------------------------------------------------
	//===============================Some automation by Juba
	public static void addVideoItem(String video_id, String title, String desciption){
		hashMap = new HashMap<>();
		hashMap.put("vdo_id", video_id);
		hashMap.put("vdo_title", title);
		hashMap.put("vdo_desciption", desciption);
		videoArrayList.add(hashMap);
	}
	//========================================================================
	//===============================Some automation by Juba
	public static void createPlayList(String category_name, Integer drawable){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================





	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//----------------------------------------------------
	public static void createMyAlbums(){

		rootArrayList = new ArrayList();
		catArrayList = new ArrayList<>();
		videoArrayList = new ArrayList<>();

		//======================1====================================================
		addVideoItem("nRvt3_XxwbI", "Oggy and the Cockroaches THE SPACE ADVENTURE Full Episodes HD", "4,361,917 views  15 Feb 2022");
		addVideoItem("2qJLhScLTPM", "Oggy and the Cockroaches", "18,834,045 views  4 Nov 2016  ");
		addVideoItem("fDgfn3107dQ", "oggy the movie reversed", "99,270 views  14 Jan 2022 ");
		addVideoItem("6e4odu82NNg", "Wheeling and Sealing ", "6,769,254 views  30 May 2020");
		addVideoItem("Byn5dTnDn3g", " NEW AIRPLANE FOR OGGY ", "6,769,254 views  30 May 2020");
		addVideoItem("3uvT2kJi4R0", "OGGY IN SPACE ", "6,769,254 views  30 May 2020");
		addVideoItem("z51akiz1bok", "Oggy and the Cockroaches - Zig & Sharko  ", "6,769,254 views  30 May 2020");
		addVideoItem("63O7X1BrH7E", "GRATED COCKROACHES  ", "6,769,254 views  30 May 2020");
		addVideoItem("Rf4M4e6OhiU", "The Incredible Four ", "6,769,254 views  30 May 2020");
		addVideoItem("E-pS215MsuI", "Oggy and the Cockroaches Skate Fever ", "6,769,254 views  30 May 2020");
		addVideoItem("P_WYV5fNl4g", "Oggy and the Cockroaches  ALONE IN LAKE  ", "6,769,254 views  30 May 2020");
		addVideoItem("WkiWnGwqreM", "Top 10 Best episodes 2016 - Oggy and the Cockroaches", "6,769,254 views  30 May 2020");
		addVideoItem("DBUVOGzcXks", "Oggy and the Cockroaches A night with Oggy ", "6,769,254 views  30 May 2020");
		addVideoItem("Wyql6TKbduw", "Oggy and the Cockroaches Season 5 Oggy's 12 Labors  ", "6,769,254 views  30 May 2020");
		addVideoItem("AigoYtAlXaQ", "Oggy and the Cockroaches A LOVE STORY  ", "6,769,254 views  30 May 2020");
		addVideoItem("8TWMT4auvHQ", " VIDEO GAMES IN LIVING ROOM ", "6,769,254 views  30 May 2020");
		addVideoItem("SJn2trEMqrE", "Oggy and the Cockroaches  ", "6,769,254 views  30 May 2020");
		addVideoItem("RnnLx9DhlZw", "The Jungle Child ", "6,769,254 views  30 May 2020");
		addVideoItem("dKw7bdk6hQ8", "Oggy and the Cockroaches", "6,769,254 views  30 May 2020");
		addVideoItem("Q8RAQG_bMXw", " WELCOME TO PARIS ", "6,769,254 views  30 May 2020");
		addVideoItem("bINxXgTT68I", "Tom & Jerry ", "6,769,254 views  30 May 2020");
		addVideoItem("WuOOenhB6Cg", "Tom & Jerry | Holiday Time  ", "6,769,254 views  30 May 2020");
		addVideoItem("BBmde4lRKmM", "Tom & Jerry | A Spy Quest  ", "6,769,254 views  30 May 2020");
		addVideoItem("4XVPxf-N_7Q", "Tom & Jerry | The Sound of Mischief", "6,769,254 views  30 May 2020");
		addVideoItem("PbtHM7Ue2Ck", "Tom & Jerry | Happy Father's Day", "6,769,254 views  30 May 2020");
		addVideoItem("wywYnajCgaU", "Tom & Jerry | Ouch, That Must Have Hurt", "6,769,254 views  30 May 2020");
		addVideoItem("ihI_GYHjs2c", "Tom & Jerry | Summer Loading.. ", "6,769,254 views  30 May 2020");
		addVideoItem("Dk-nqyL_ayM", "Tom & Jerry | Fun At Home  ", "6,769,254 views  30 May 2020");
		addVideoItem("mK37Zv7SQqE", "Tom & Jerry | Tom Saves Jerry", "6,769,254 views  30 May 2020");
		addVideoItem("bEuwqhJxn5U", "Tom & Jerry  ", "6,769,254 views  30 May 2020");
		addVideoItem("XzVWKY_Ebqk", "Tom & Jerry | Who is the Cutest?", "6,769,254 views  30 May 2020");
		addVideoItem("-5u_QqI4Hbg", "Tom & Jerry | Jerry, the Master of Tricks! ", "6,769,254 views  30 May 2020");
		addVideoItem("bCtlituS9p8", "Tom & Jerry | Trouble Everywhere ", "6,769,254 views  30 May 2020");
		addVideoItem("cLuUP-hl0YI", "Tom & Jerry | Cozy Vibes Only! ", "6,769,254 views  30 May 2020");
		addVideoItem("h5c8nFwtyig", "Tom & Jerry | The Greatest Endings for the End of the Year ", "6,769,254 views  30 May 2020");
		addVideoItem("8XbTb9yt0Ls", "Tom and Jerry ", "6,769,254 views  30 May 2020");
		addVideoItem("Fu3MIwF-LJw", "Tom & Jerry | A Little Mischief Never Hurt Nobody!", "6,769,254 views  30 May 2020");
		addVideoItem("UnMTJ0cwTwc", "Tom and Jerry - The Midnight Snack", "6,769,254 views  30 May 2020");
		addVideoItem("wy2DgqL1P7s", "Tom & Jerry | Home But Not Alone! ", "6,769,254 views  30 May 2020");
		addVideoItem("2cdxTXZ5_6U", "Tom & Jerry ", "6,769,254 views  30 May 2020");
		addVideoItem("6RZG1wqKBjM", "Doraemon The Movie Nobita The Explorer Bow! ", "6,769,254 views  30 May 2020");
		addVideoItem("jVPXj9nbeog", "Stand by me Doraemon(hindi) full movie ", "6,769,254 views  30 May 2020");
		addVideoItem("60ct4Tn80ws", "Doraemon movie in Hindi ", "6,769,254 views  30 May 2020");
		addVideoItem("py42hUoqtMo", "Doraemon movie in Hindi 2022 ", "6,769,254 views  30 May 2020");
		addVideoItem("XQsHhqut-7I", "Doraemon The Movie Nobita Aur Antariksh Daku In HINDI Full Movie", "6,769,254 views  30 May 2020");
		addVideoItem("IaRa6ES3W2w ", "Doraemon_Nobita and steel troops full movie ", "6,769,254 views  30 May 2020");
		addVideoItem("ICttQ8xG5ks", "Doremon latest full movie 2018 ", "6,769,254 views  30 May 2020");
		addVideoItem("-f7OumJjzEg", "Doraemon Episodes 17 Season  ", "6,769,254 views  30 May 2020");
		addVideoItem("qqMPqPaP3fM", "doraemon ep in hindi  ", "6,769,254 views  30 May 2020");
		addVideoItem("BXa6jR8SSVw", "Doraemon latest episodes ", "6,769,254 views  30 May 2020");
		addVideoItem("A3hDzSS9MKo", "Doraemon movie  ", "6,769,254 views  30 May 2020");
		addVideoItem("xUvcQANJAxo", "Doraemon: Nobita and the Castle of the Undersea Devil", "6,769,254 views  30 May 2020");
		addVideoItem("SLewPxxkZpA", "Doraemon new movie in hindi ", "6,769,254 views  30 May 2020");
		addVideoItem("W13VenvOv9g", "Doraemon - The Mirror Planet ", "6,769,254 views  30 May 2020");
		addVideoItem("_MhbivZ0jJM", "Doremon in Hindi New Episode ", "6,769,254 views  30 May 2020");
		addVideoItem("F54EYo2EGCw", "Doraemon New Episode in Hindi  ", "6,769,254 views  30 May 2020");
		addVideoItem("vtmInseuC8E", "doraemon ep in hindi", "6,769,254 views  30 May 2020");
		addVideoItem("YwVj0W8Ab1E", "Doraemon US New Episode in English ", "6,769,254 views  30 May 2020");


		createPlayList("Cartoon Network", R.drawable.tom);
		//==========================================================================

		//====================2======================================================
		addVideoItem("AXJIj0AnbTA", "যাকাত - মিজানুর রহমান আজহারি", "229,404 views • 25 Apr 2022 • Mizanur Rahman Azhari Zakat ");
		addVideoItem("RG5BV8DCGCg", "কবরের জীবন কতইনা ভয়ানক | মিজানুর রহমান আজহারী", "24,177,233 views • 29 Dec 2018 • Mizanur Rahman Azhari Waz Bangla Waz Mahfil about Surah At-Takathur Tafsir in Bangla");
		addVideoItem("ajXr92pMCwo", "আল্লাহ যাকে বেশি পছন্দ করেন তাকে বিপদে ফেলেন । Mizanur Rahman azhari", "16,282,463 views • 22 Feb 2019");
		addVideoItem("uhj0xXoer-8", "বছরের শ্রেষ্ঠ জীবন পাল্টানো ওয়াজ | Mizanur Rahman Azhari Full Waz", "899,650 views • 20 Apr 2021");
		addVideoItem("e8QHtfij2_Q", "নবীজির একটি ঘটনা|mizanur Rahman azhari ", "15,985 views • 5 Jun 2022");
		addVideoItem("4g-RhaXvZUU", "যে গুনাগার বান্দাকে আল্লাহ বেশি পছন্দ করেন।Mizanur Rahman azhari", "5,664,777 views • Premiered on 9 Feb 2019");
		addVideoItem("_ZtKtI35fPs", "সিলেটে কেন এতো বিপদ আমাদের যা করা উচিত । মিজানুর রহমান আজহারী", "475,334 views • 18 Jun 2022");
		addVideoItem("fbVoPYvPYZQ", "বাবার ইশারায় বউ তালাক ! ইসমাইল আঃ এর জীবনী|Mizanur Rahman Azhari Waz ", "1,031,418 views • 7 Nov 2020");
		addVideoItem("1A5iy7f8zF0", "ওয়াজটি শুনে অন্তর ঠান্ডা হয়ে যায় - মিজানুর রহমান আজহারী ", "1,560,677 views • 16 May 2022");
		addVideoItem("6xJStlDA-7I", "রাসুল (সাঃ) এর জীবনী", "31,242,555 views • 18 Dec 2020");
		addVideoItem("q95ro1gx1GQ", "সূরা রহমান তাফসীর করতে যেয়ে হুজুর নিজেই কাঁদছে|MIZANUR RAHMAN AZHARI", "6,692,479 views • 28 Dec 2020");
		addVideoItem("S_0rlBiTJXo", "জীবন পাল্টানো একটি ওয়াজ। Mizanur Rahaman Azhari", "4,410,996 views • 13 Jan 2020");
		addVideoItem("swMnUbAs_nk", " কে বেশি দামী বিশ্বনবী সাঃ নাকি হুসাইন রাঃ|Mizanur Rahaman Azhari", "511,492 views • 15 Aug 2021 ");
		addVideoItem("BRQT6AN4Pv8", "আজিব ১টি ঘটনা|Mufti Hamid Zahiri", "2,069,666 views • 7 Aug 2021");
		addVideoItem("QJBI8PR42mk", "সেদিন কি হয়েছিল ১ ঘোষণায় মদিনায় মদের বন্যা Golam sarwar saide", "532,844 views • 29 Sept 2019");
		addVideoItem("rjClp3hRPC4", "যে  ৩ শ্রেণী মানুষের দিকে আল্লাহ ফিরেও তাকাবেন না জান্নাতও দিবেন না Golam sarwar saide", "2,069,031 views • 19 Sept 2019 ");
		addVideoItem("EfXgVZrknp0", "best waz 2022 - সাদিকুর রহমান আজহারী ওয়াজ ", "49,875 views • 6 Jan 2022 49,875 views ");
		addVideoItem("2vgjzydgnNk", "আমি আগে তাওবা বুঝতাম না এখন তাওবা বুঝি। Golam sarwar saide", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("UjwyGoL34Cs", "আল্লাহর মুমিন বান্দা হতে চাইলে আপনাকে যে ৭টি জিনিস ছেড়ে দিতে হবে | Golam sarwar saide", "2,771,372 views • 28 Sept 2019 ");
		addVideoItem("Zcnn37J7_o4", "কি হয়েছে মক্কায় দিন দিন জনশূন্য হয়ে পড়ছে। Golam sarwar saide", "3,123,427 views • 15 Mar 2020 ");
		addVideoItem("hihgdh0aVpQ", "আল্লামা তারেক মনোয়ার নতুন ওয়াজ ২০২১ ", "1,333,083 views • 24 Mar 2021  ");
		addVideoItem("YHJehQGJ5Ec", "যে সাতটি পাপের শাস্তি দুনিয়াতে না পেয়ে আপনার মৃত্যু হবে না পরকালে জাহান্নাম | shaikh ahmadullah ", "520,088 views • 15 Apr 2022 ");
		addVideoItem("8ddeVJyN7Lw", "দোয়া করার সময় অধিকাংশ মানুষ এই মারাত্মক ভুলটি করে থাকে| shaikh ahmadullah ", "947,541 views • 27 Mar 2022 ");
		addVideoItem("otHS-Y7P_PM", "হাফ হাতা পোশাক পড়ে নামাজ পড়লে নামাজ কবুল হবে কি?shaikh ahmadullah waz", "602,634 views • 20 Apr 2022  ");
		addVideoItem("zACxbKIjZnA", "রমজানের ৩০ দিনই রাসূল (সাঃ) এই শ্রেষ্ঠ আমলটি করতে বলেছেন", "173,859 views • 8 Apr 2022 ");
		addVideoItem("mVvYEh-vCdI", "গুনাহ মাফের জন্য ১৫টি আমল বেশি বেশি করবেন|Shaikh ahmadullah ", "181,725 views • 22 Mar 2022  ");
		addVideoItem("h5t2sntxt1c", "বাড়িতে কখনো ১০টি কাজ করবেন না ফলে যা ঘটতে পারে", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("tBuPf0mnSiE", "সাঃ এর মেরাজের আবিস্কার|tarek monower", "15,160 views • 27 May 2022 ");
		addVideoItem("Rm38rPlcm30", "সুখী হতে স্বামী স্ত্রী একসাথে মিলে যে কাজগুলো করবেন । মুস্তাফিজ রাহমানী", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("krAIZfCxAXg", "New Bangla Waz 2019 . Everybody Dies.Mufti Mahmudul Hasan Ashrafi", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("GjyBueoCn-c", "বাংলার আরেক সাঈদীর কন্ঠে শুনুন হৃদয়বিদারক ওয়াজ", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("G3ybi4SJITg", "যুবক যুবতীর প্রেম|Abrarul Haque Asif", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("bK4Gk682Kfc", "ওয়াজটি একবার শুনুন । মনে হয়না জীবনে আর গুনাহ করবেন। Golam sarwar saide", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("AqE06H3Thh0", "ওয়াজটি যে শুনেছে সেই কেঁদেছে | M Hasibur Rahman", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("ZbxSXZUqs3s", "মৃত্যুর আগে একবার শুনুন। মুফতী আমির হামজা নতুন ওয়াজ", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("ylwrsjRHj6I", "নবীজির জীবনী || Abdullah Al Amin ", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("hLvV8gAjXxk", "golam rabbani waz 202", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("J3LAU0A-z6o", "কুরবানীর মাসয়ালা জানুন, প্রশ্নোত্তর পর্ব-০১", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("fN_U7_G1Zj4", "যাদের বয়স ১৬ থেকে ৩০ ভিডিওটি অবশ্যই দেখুন বদলে যাবে জীবন। Golam sarwar saide", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("rFtF_zltWSI", "কিভাবে আল্লাহর কাছে চাইতে হয় শিখে নিন কথাগুলো শুনে চোখে পানি এসে গেল। Golam sarwar saide", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("QiasQZdpFeU", "মৃত্যু আসার আগে কথা গুলো শুনুন | জামশেদ মজুমদার", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("0zaYchppWmY", "রবের নেয়ামতের শুকরিয়া মূফতি মিযানুর রহমান ", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("zld2FbHMDpk", "চোখের গুনাহ করলে ৫টি মারাত্মক বিপদ যা আপনি জানেন না। abrarul haque asif", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("1kcoIU-1sng", "MAKE A EARTH ", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("=Bqp1tPADL5g", "যারা চোখের গুনাহ করেন ৫টি বিপদ আপনার জীবনে আসবে | Abrarul Haque Asif", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("kmfwktogx94", "চরিত্রবান ছেলে চরিত্রবান বউ পাবে কিনা!Abrarul Haque Asif", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("0qzxdZsuqrI", "যুবকদের জন্য গুরুত্বপূর্ণ একটি নসিহা|", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("vTpNTmSWgGY", "বএকজন বেনামাজী এবং একজন নামাযী ব্যক্তির করুণ ঘটনা azhari waz 2022", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("ZhaEnfMKCs0", "বিশ্বনবীর ইন্তেকালে নবীর কন্যার সাথে আজরাইলের যে ঘটনায় শুধু কান্না। হাফেজ মাও", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("mw9aPfZT9Wk", "দানশীল উসমান ও গরীব সাহাবীর অবাক করা কাহিনী। হাফেজ ক্বারী মাওলানা আফতাব আহমেদ।", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("9TDCoeDYl6g", "কবরের প্রথম রাত মুফতি আরিফ বিন হাবিব নতুন ওয়াজ mufti arif bin habib", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("tk4Rkj730iU", "জিলহজ্জ মাসের প্রথম ১০ দিন ৭টি আমল ভুলেও যেন মিস না হয় | abdul hai muhammad saifullah", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("iK8u36oaETQ", "ঘুমানোর সময় এই আমল করলে ৬৬৬৬ আয়াত পড়ার সওয়াব পাবেন মুফতী মুস্তাকুন্নবী কাসেমী", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("bG41CQVG_jA", "লক্ষ_যুবকের_পাগল_করা_বয়ান_সৈয়দ_মোকাররম_বারী_", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("iEUX3wIZHog", "যিকিরের তর্যূমা সম্পর্কে গুরুত্বপূর্ণ আলোচনা || mufti mustakunnabi kasemi", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("GZRjUBizJa8", "স্ত্রী কথা শুনে না প্রশ্নের জবাবে যা বললেন। মুফতি মুস্তাকুন্নবী কাসেমী।", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("dR7elMDX1tY", "ধৈর্য আর নামাজ নিয়ে অসাধারণ একটি বয়ান Hafizur Rahman Siddique", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("CyalAIFNZyU", "যে ওয়াজ শুনে মন ভরে যায় || Anisur Rahman Ashrafi", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("x-u_lGqMWrE", "দিল কাঁপানো কন্ঠে সেরা বয়ান | Mufti Anisur Rahman Ashrafi", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("0qCSNmBIpVM", "সন্তান নষ্ট হচ্ছে মা-বাবার কারণে ! মাওলানা আনিসুর রহমান আশরাফী |", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("rlLltpD1j4Q", "যুবক পায়ে ধরে চিৎকার দিয়ে বলি,এই ভাইয়ের কথাগুলো শুনো | anisur rahman ashrafi", "1,490,925 views • 28 Mar 2020 ");
		addVideoItem("eNIArLLuh_0", "ফ্রিল্যান্সিং জায়েজ আছে কিনা জেনে নিন | Abrarul Haque Asif ", "1,490,925 views • 28 Mar 2020 ");
		createPlayList("Bangla Waz", R.drawable.waz);
		//==========================================================================


		//=====================3=====================================================
		addVideoItem("7IOGNe_axJU", "RRR FULL MOVIE HINDI DUBBED ", "26,849 views  28 Jun 2022 ");
		addVideoItem("kOFaTcUfJIY", "KRK (Kaathuvaakula Rendu Kaadhal) Hindi Dubbed Full Commedy Movie|Vijay Sethupathi,Nayanthara,Samantha", "3,335,678 views  19 Jun 2022 ");
		addVideoItem("a0PvhQUpKFQ", "Return of Raju 2 (Bangarraju) Latest 2022 Hindi Dubbed Full Movie  ", "10,812,662 views  2 Jun 2022 ");
		addVideoItem("zSHmr03lGjc", "Valimai The Power (2022)|Huma Qureshi, Kartikeya ", "13,149,047 views  9 Apr 2022 ");
		addVideoItem("wADQAi55KfA", "Bheemla Nayak (2022) Hindi |Pawan Kalyan,Rana Daggubati,Nithya Menen", "6,967,845 views  15 Apr 2022 ");
		addVideoItem("dsOfWhdSmXQ", "Heropanti 2 Full movie|Nawazuddin Siddiqui, Tara Sutaria", "26,849 views  28 Jun 2022 ");
		addVideoItem("nJgQov9X9mw", "Ravi Teja's Latest 2022 Hindi Dubbed Full Movie | Arjun Sarja, Dimple Hayathi, Meenakshi Chaudhary", "2,355,775 views 25 May 2022 ");
		addVideoItem("Tx3Uw26Mbp4", "Pakka Commercial Full Hindi Dubbed Movie |Raashi Khanna ", "26,849 views  28 Jun 2022 ");
		addVideoItem("mX4qOdmZ7b0", "Rajkummar Rao & Bhumi Pednekar Latest Hindi Full Movie ", "1,830,061 views  26 Mar 2022  ");
		addVideoItem("TVV1pQAI9a0", "A Gentleman Hindi Full Movie | Starring Sidharth Malhotra, Jacqueline Fernandez ", "26,849 views  28 Jun 2020 ");
		addVideoItem("EbCgL_gSXsw", "Maaran (2022) Latest Action Hindi Dubbed Full Movie | Dhanush, Malavika Mohanan, ", "26,849 views  28 Jun 2022 ");
		addVideoItem("0ClmW4HxzY4", "Sharmaji Namkeen 2022 Hindi FullCommedy Movie | Rishi Kapoor, Paresh Rawal, Juhi Chawla ", "26,849 views  28 Jun 2022 ");
		addVideoItem("0Qye4J-Eqnw", "Bhool Bhulaiyaa 2 Full Movie (2022) Kartik aryan,Kiara Advani ", "26,849 views  28 Jun 2022 ");
		addVideoItem("hbZn3CVmRb8", "Jersey Full movie| SHAHID KAPOOR ", "516,925 views  28 Jun 2022 ");
		addVideoItem("zthb2SCgDcM", "Ram Charan New Movie ", "1,502,252 views  24 Jun 2022 ");
		addVideoItem("mrJkVvW90L0", "SARDAR SINGAM (2022) NEW Hindi Movie | Karthi, Sayyeshaa ", "30,331,141 views  Premiered on 19 Feb 2022 ");
		addVideoItem("YC1AVrSFz0k", "ROWDY DOCTOR FULL MOVIE | South Movie ", "26,849 views  28 Jun 2022 ");
		addVideoItem("k09HifITVpQ", "SARILERU NEEKEVVARU HINDI DUB MOVIE ", "842,514 views  24 Jun 2022  ");
		addVideoItem("urBEDhOHitw", " SARKAR FULL MOVIE |Thalapathy Vijay  ", "26,849 views  28 Jun 2022 ");
		addVideoItem("JfhmgOkd-nY", "A1 EXPRESS (2021) NEW Released Hindi Dubbed Movie | Sundeep Kishan, Lavanya ", "194,072 views  28 Jun 2022  ");
		addVideoItem("E4yVAoWKsTI", "BLIND KILLER - Full  Movie Hindi Dubbed ", "26,849 views  28 Jun 2022 ");
		addVideoItem("li5Mb7C_vRs", "MAJOR : THE REAL INDIAN - Full Action Movie Hindi Dubbed  ", "26,849 views  28 Jun 2022 ");
		addVideoItem("APlqnTkLP2s", "Nithiin & Keerthy Suresh's Latest 2022 Romantic Hindi Dubbed Full Movie | ", "26,849 views  28 Jun 2022 ");
		addVideoItem("BYd7a0a-1HM", "  BHEESHMA HINDI DUB FULL MOVIE |Rashmika Mandanna ", "26,849 views  28 Jun 2022 ");
		addVideoItem("bF9WfJFR72s", "My Brother Vicky Full Movie", "26,849 views  28 Jun 2022 ");
		addVideoItem("NpJ6lnbgi_s", "Check Full Hindi Dubbed Movie|Nithiin | Rakul Preet ", "136,893,913 views  25 Jan 2022  ");
		addVideoItem("yklDT_Km15E", "Love Story Hindi Dubbed Full Movie | Naga Chaitanya , Sai Pallavi ", "26,849 views  28 Jun 2022 ");
		addVideoItem("hhr8IWP9XCc", "RAW KHILADI 2 Full Hindi Dubbed Movie | NITHIN  ", "221,179,471 views  12 Sept 2019  ");
		addVideoItem("jMl3hphx8GI", "REPUBLIC FULL MOVIE ", "26,849 views  28 Jun 2022 ");
		addVideoItem("Gtx1pPeKJsA", "Ismart Shankar Full Hindi Dubbed Movie | Ram Pothineni, Nidhi Agerwal ", "26,849 views  28 Jun 2022 ");
		addVideoItem("IsnosIxtauA", "The Sky Is Pink Hindi Full Movie | Priyanka Chopra, Farhan Akhtar  ", "251,280 views  29 Jun 2022 ");
		addVideoItem("q9lg0WhXfQc", "Vishal & Keerthy Suresh's Latest 2022 Released Action Hindi Dubbed Full Movie ", "26,849 views  28 Jun 2022 ");
		addVideoItem("eaNF32e0vSY", "Baazaar Hindi Full Movie | Starring Saif Ali Khan, Radhika Apte, Chitrangada Singh ", "5,015,498 views11 Oct 2019 ");
		addVideoItem("Z6nkqGyLCbo", "JAIL ", "26,849 views  28 Jun 2022 ");
		addVideoItem("hPvJ4VfrR9A", "Gaddalakonda Ganesh (2022) New Released Hindi Dubbed Movie | Varun Tej, Pooja Hegde", "26,849 views  28 Jun 2022 ");
		addVideoItem("W3Hjov8_aEw", "COMALI COMMEDY MOVIE ", "26,849 views  28 Jun 2022 ");
		addVideoItem("oZ_CUKEWdKY", "MENTAL 4 - Hindi Dubbed Full MOVIE ", "26,849 views  28 Jun 2022 ");
		addVideoItem("uoGCXFuDiQo", "Tholi Prema (HD) | New Romantic Hindi Dubbed Full Movie | Varun Tej, Raashi Khanna ", "201,815,875 views  4 Aug 2019");
		addVideoItem("kI3DKx0n80U", "Arudhra Full Movie | PA Vijay  ", "26,849 views  28 Jun 2022 ");
		addVideoItem("4MBzodzTCrw", " Vishal Telugu Movies In Hindi Dubbed  ", "26,849 views  28 Jun 2022 ");
		addVideoItem("Tmd__luCPu0", "Pralay The Destroyer | Bellamkonda Srinivas, Pooja Hegde  ", "26,849 views  28 Jun 2022 ");
		addVideoItem("0gpNyFS9gr8", "Fever Full Hindi Movie ", "26,849 views  28 Jun 2022 ");
		addVideoItem("4jtbe0I1e1c", "Aravind Sametha| Jr NTR, Pooja Hegde, Jagapathi Babu ", "26,849 views  28 Jun 2022 ");
		addVideoItem("hdnjEnEdy10", "Rishtey A Grand Celebration | New Hindi MOVIE", "26,849 views  28 Jun 2022 ");
		addVideoItem("tNVeaEmVfWE", "Gorilla Gang | New Hindi Dubbed Movie | Jiiva, Shalini Pandey, ", "26,849 views  28 Jun 2022 ");
		addVideoItem("5towPnvsaWg", "Gurkha 2021 New Released Hindi Dubbed Movie | Yogi Babu", "26,849 views  28 Jun 2022 ");
		addVideoItem("7IJwo1yHHJQ", "Saif Ali Khan  New Released Movie 2017 ", "26,849 views  28 Jun 2022 ");
		addVideoItem("yJApBBPdXpc", "Chehre 2022 Hindi Full Movie | Emraan Hashmi, Amitabh Bachchan ", "26,849 views  28 Jun 2022 ");
		addVideoItem("oeLWE9Ny6eY", "RX 100 - Full Movie Hindi Dubbed ", "26,849 views  28 Jun 2022 ");
		addVideoItem("BNqEmx1mgqg", "GURU KI HEROPANTI - Full Hindi  Movie ", "26,849 views  28 Jun 2022 ");
		addVideoItem("fgWFBc1XjR8", "ARJUNA PHALGUNA (2022) New  Hindi  Movie ", "26,849 views  28 Jun 2022 ");
		addVideoItem("ZiOJq6PMkls", "ASWATHAMA Movie Hindi Dubbed (2021) New Released Hindi Dubbed Movie | Naga Shourya, Mehreen Pirzada", "26,849 views  28 Jun 2022 ");
		addVideoItem("n9Y3CbXlvwM", "Shadaa Punjabi Full Movie | Diljit Dosanjh, Neeru Bajwa Jagjeet Sandhu", "26,849 views  28 Jun 2022 ");
		addVideoItem("9vNsrYe26BM", "Chanakya Movie | Gopichand, Mehreen Pirzada ", "26,849 views  28 Jun 2022 ");
		addVideoItem("Hy9DYi_6Psc", "Sundeep Kishan's GALLY ROWDY (2021) NEW  Hindi Movie | Neha Shetty ", "26,849 views  28 Jun 2022 ");
		addVideoItem("c-S7ufVisDI", "C/O Surya (Hindi Dubbed)  | Sundeep Kishan, Vikranth ", "26,849 views  28 Jun 2022 ");
		addVideoItem("ZEHXgtqH-gM", " MERSEAL FULL MOVIE HINDI DUBBED ", "26,849 views  28 Jun 2022 ");
		addVideoItem("kuTkhlbIhFE", " Forensic (2021) Hindi Dubbed Full Movie ", "26,849 views  28 Jun 2021 ");
		addVideoItem("pHJL46xBCqs", " Fitoor Hindi Full Movie | Starring Aditya Roy Kapur, Katrina Kaif ", "26,849 views  28 Jun 2022 ");
		addVideoItem("q_3TWLY7h2k", " Action (2020) New Released Hindi Dubbed Full Movie | Vishal, Tamannaah, ", "26,849 views  28 Jun 2022 ");
		addVideoItem("9Q6gFxqt9SU", " Don Returns (Ranarangam) 2021 New Released Hindi Dubbed Movie| Sharwanand, Kajal Aggarwal, ", "26,849 views  28 Jun 2022 ");
		addVideoItem("bGPZy56q1no", " Inspector Vijay (KAVACHAM) Full Movie | Bellamkonda Sreenivas, Kajal", "26,849 views  28 Jun 2022 ");
		addVideoItem("9taVoF9rjh0", " Surya | South Hindi Dubbed Full Action Movie HD | Allu Arjun ", "26,849 views  28 Jun 2022 ");
		addVideoItem("1IORdp4kcTo", " Vivegam FULL MOVIE", "26,849 views  28 Jun 2021 ");
		addVideoItem("zR52MgYhm_Q", "Mr. Majnu (2020) New Released Hindi Dubbed Full Movie | Akhil Akkineni, Nidhhi Agerwal ", "26,849 views  28 Jun 2022 ");
		addVideoItem("SbSTTfnEMZM", " Miss India 2021 New Released Hindi Dubbed Movie | Keerthy Suresh, Jagapathi Babu, ", "26,849 views  28 Jun 2022 ");
		addVideoItem("GN4-488gOYI", "Mohenjo Daro Hindi Full Movie | Starring Hrithik Roshan, Pooja Hegd ", "26,849 views  28 Jun 2022 ");
		addVideoItem("OEP-Q3wVIpI", " Parris Jeyaraj 2021 New Released Hindi Dubbed Movie | Santhanam, ", "26,849 views  28 Jun 2022 ");
		addVideoItem("yo27UNTfbY0", " FURIOUS JIGARWALA (Enai Noki Paayum Thota) 2020 New Released Hindi Dubbed Full Movie | Dhanush,Megha", "26,849 views  28 Jun 2022 ");
		addVideoItem("y5CJhgYf-Hc", " Chalo Full Hindi Dubbed Movie | Naga Shaurya, Rashmika Mandanna ", "26,849 views  28 Jun 2022 ");
		addVideoItem("zzhfvt5vZHI", " Dear Comrade (2020) New Released Hindi Dubbed Full Movie | Vijay Devarakonda, Rashmika ", "26,849 views  28 Jun 2022 ");
		addVideoItem("JDzXR_mV_fI", " A AA 2 ( Chal Mohan Ranga ) Full Hindi Dubbed Movie | Nithiin, Megha Akash ", "26,849 views  28 Jun 2022 ");
		addVideoItem("1odS6ynbWNo", " World Famous Lover 2021 New Released Hindi Dubbed Movie| Vijay Deverakonda, Raashi ", "26,849 views  28 Jun 2022 ");
		addVideoItem("AXtZfXEBvsc", "Yeh Saali Aashiqui | Vardhan Puri, Shivaleeka Oberoi ", "26,849 views  28 Jun 2022 ");

		addVideoItem("5Y87gFvzEO4", " VASCO THE REBEL (Romantic) 2022 New Released Hindi Dubbed Movie | Akash Puri, Ketika  ", "26,849 views  28 Jun 2022 ");
		addVideoItem("nS9ZM4R1DJw", "TOLI PREMA ", "26,849 views  28 Jun 2022 ");
		addVideoItem("Bc2XOGKDFNI", " PREMAN FULL MOVIE HINDI DUBBED ", "26,849 views  28 Jun 2022 ");
		addVideoItem("5omlS84Sz0E", " Aadi Saikumar's LOVER BOY Full Hindi Dubbed Action Romantic Movie | Surabhi, Ajay  ", "26,849 views  28 Jun 2022 ");
		addVideoItem("Bc2XOGKDFNI", " PREMAN FULL MOVIE HINDI DUBBED ", "26,849 views  28 Jun 2022 ");
		addVideoItem("7y3KbUHnee8", " Bajrangi Bhaijaan Hindi Full Movie | Starring Salman Khan, Kareena Kapoor ", "26,849 views  28 Jun 2022 ");
		addVideoItem("vD4bUYlycF4", " KASHMORA FULL MOVIE HINDI DUBBED ", "26,849 views  28 Jun 2022 ");
		addVideoItem("bNejod-G0MM", " 3 Idiots 2009 1080p BluRay x264 Hindi", "26,849 views  28 Jun 2022 ");
		addVideoItem("LgUJvopGJJA", " Yeh Hai Zindagi - Nani South Indian Hindi Dubbed Movie", "26,849 views  28 Jun 2022 ");
		addVideoItem("keB1vLcJPsI", "Ajith Kumar's Latest Action Hindi Dubbed Full Movie | Nayanthara, Jagapathi Babu", "1,059,627 views  13 Jun 2022  ");
		addVideoItem("EoYXPB2jqzk", " Aashiqui 2 Full Movie Hindi Latest Bollywood Movie 2022 ", "26,849 views  28 Jun 2022 ");
		addVideoItem("S3y-YPRW2pQ", " JARIN KHAN NEW MOVIE", "26,849 views  28 Jun 2022 ");
		addVideoItem("JuG0p5OW3hE", " Ok Jaanu Hindi Full Movie | Starring Aditya Roy Kapur, Shraddha Kapoor", "26,849 views  28 Jun 2022 ");
		addVideoItem("QowFdS25XnE", " Kaabil Full Movie | Hrithik Roshan, Yami Gautam", "26,849 views  28 Jun 2018 ");
		addVideoItem("9bVyycK5RLY", " PREMA ISHQ KADHAL Hindi Dubbed Full Movie | Harshvardhan Rane, Sree Vishnu,", "26,849 views  28 Jun 2022 ");
		addVideoItem("AffgDopl1yo", " VIP 2 Lalkar (HD) - Dhanush & Kajol'", "26,849 views  28 Jun 2022 ");
		addVideoItem("zJsF4QF0Sys", " Ek villain full movie 1080p | Sidharth Malhotra | shraddha kapoor | Ritesh Deshmukh", "26,849 views  28 Jun 2022 ");
		addVideoItem("xkJnNkidFyo", " Shaandaar Hindi Full Movie | Starring Shahid Kapoor, Alia Bhatt", "26,849 views  28 Jun 2022 ");
		addVideoItem("4H4wg_XSKXI", " Ae Dil Hai Mushkil Hindi Full Movie | Starring Ranbir Kapoor, Aishwarya Rai, Anushka Sharmai", "26,849 views  28 Jun 2022 ");
		addVideoItem("OaEFNtFflZY", " Welcome Back Hindi Full Movie | Starring John Abraham, Anil Kapoor, Shruti Haasan", "26,849 views  28 Jun 2018 ");
		addVideoItem("Mn1gt69nlbY", " Rocky Handsome Hindi Full Movie | Starring John Abraham, Shruti Haasan", "26,849 views  28 Jun 2029 ");
		addVideoItem("ue9xd8IuSqc", " Honsla Rakh Latest 2022 Punjabi Full Movie | Starring Diljit Dosanjh, Shehnaaz Gill,", "26,849 views  28 Jun 2022 ");
		addVideoItem("EoCN9FKNhXk", " Dolly Ki Doli Hindi Full Movie | Rajkummar Rao, Saif Ali Khan, Sonam Kapoor, Varun Sharma", "26,849 views  28 Jun 2029 ");
		addVideoItem("NT35W819YMk", "Housefull 4 Hindi Full Movie | Akshay Kumar, Riteish Deshmukh, Bobby, Kriti Sanon, Pooja", "26,849 views  28 Jun 2029 ");
		addVideoItem("xSOAHZl4-lc", " Andhadhun Hindi Full Movie | Ayushmann Khurrana, Tabu, Radhika Apte", "26,849 views  28 Jun 2029 ");
		addVideoItem("pextlXIELbM", " Stree Hindi Full Movie | Starring Rajkummar Rao, Shraddha Kapoor, Pankaj Tripathi", "26,849 views  28 Jun 2029 ");
		addVideoItem("ZU1mj-IB1m4", "Laxmii Hindi Full Movie | Starring Akshay Kumar, Kiara AdvanI", "26,849 views  28 Jun 2029 ");
		addVideoItem("kdEr_kniZ6o", " Baar Baar Dekho Full Movie", "26,849 views  28 Jun 2029 ");
		addVideoItem("zBXa6Foq9ZM", " Bang Bang Full Hindi Movie | Starting Hrithik Roshan, Katrina Kaif, ", "26,849 views  28 Jun 2019 ");
		addVideoItem("qhyndgHD04A", "Phir Hera Pheri (2006) | Akshay Kumar |Suniel Shetty |Paresh Rawal |Rimi Sen  ", "7,022 views  30 Jun 2022   ");
		createPlayList("Hindi Movies", R.drawable.hindimovie);
		//==========================================================================


		//=========================4=================================================

		addVideoItem("cTq7jCLqWd4", "Islamic Songs For Kids | 40 MINUTES |", "1,597,152 views  12 Mar 2022");
		addVideoItem("boJ1amCtyNM", " আমি চাঁদকে বলি তুমি সুন্দর নও|", "1,597,152 views  12 Mar 2022");
		addVideoItem("Aj1wu1L5glA", " O Nodire By Sadman sakib || ও নদীরে || Vangli Amer Ghor", " 19,596,162 views  31 Jul 2020");
		addVideoItem("vNEwR7xkehw", "আবু রায়হান এর বাছাইকৃত সেরা ১০ টি গজল  ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("vlaf1Au6x1E", "Meherban ᴴᴰ by Munaem Billah | New Nasheed ", "19,596,162 views  31 Jul 2020 ");

		addVideoItem("knkNy_LHtlo", "Ayisha Abdul Basith | Muhammad Nabina ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("0ES4cIxNFkE", "প্রিথিবীর সেরা ১০টি গজল ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("8DnoQnyQm4U", "প্রিয় নবীর অবমাননার প্রতিবাদে জ্বালাময়ী গজল  ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("wtEKXRs_xac", "2021 New Heart Touching Beautiful Naat Sharif - Hasbi Rabbi  ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("fvIWPFEZi_s", "Maula Ya Salli Ft. Sami Yusuf Qasida Burda Shareef [NASHEED] ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("wUbbbvPL83c", "পাগল করা সুরে ৪টি নাতে রাসুল  ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("71hi9H6fZuc", "Nasheed Ya Adheeman - Ahmed Bukhatir", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("SeeVbb-j120", "Sholawat Merdu || Cover By Ayisha Abdul Basith ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("MhFtwptaBxE", "Maher Zain - Thank You Allah Music Album (Full Audio Tracks)  ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("nDh5UdU_cZM", "Maher Zain - Insha Allah | Vocals Only - Official Music Video ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("T1bnRJFNjic", "Usaid Zahid Siddique |Assubhu Bada | New Naat 2021   ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("NfIlMOukA90", "কোকিল কণ্ঠে মরমি গজল ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("TG3Ux2elYg8", "চমৎকার ইসলামী সংগীত  ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("86fR4AtYroo", "জনপ্রিয় আরবি ইসলামিক সংগীত-২০২২  ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("dG8DRBH5FGw", "সেদিনও এমন করে । Hujaifa Islam  ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("uFSQwPOQNUc", "তোরে বানাইলো যেজন । Jahidul Islam Shawon । Kalarab  ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("vMzRdfiR3TI", "Top Bangla Islamic Song 2022  ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("SnRYYLfMr20", "পাকিস্তানি সেরা ৪টি গজল ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("TYDRQ-JxBgE", "মায়াবী সুরে মায়ের নতুন গজল ।  ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("XUPn30UXXV4", "IQRA ইকরা। Kalarab Shilpigosthi  ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("vQL2DXMAdJM", "সময়ের সেরা ইসলামিক গজল । Shopno Amar   ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("GCr0FlTfD58", "Shalawat merdu by Ayisha Abdul Basith part 1✨  ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("AbLPfoz_0LM", "Hasbi Rabbi Jallallah  | Muhammad Badruzzaman  ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("73-nmCUxygM", "সময়ের সেরা নাশিদ । Mustafa । المصطفى ﷺ । মুস্তফা   ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("ViWAM7MfAg8", "কুরআন নিয়ে অসাধারণ একটি গজল । QURAN । قرآن   ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("fWCgZjSc67Y", "Amazing Arabic Nasheed Medley by Muhammad Tariq & Muhammad Yusuf  ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("HvkqvbdwOlw", "MUSTAFA JAAN E REHMAT | DAROOD O SALAAM   ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("5TRoZSTCRwA", "সাদমান সাকিবের বাছাইকৃত সেরা গজল ।2022", "1,597,152 views  12 Mar 2022");
		addVideoItem("3qxyG6CBpY0", "Ami Chad Ke Boli Tumi Sundor Nou  ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("HrYleYeY_8U", "মায়ের নতুন গজল 2020   ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("UYGxlFHudM", "দুনিয়া সুন্দর মানুষ সুন্দর  ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("BkCoAJhgDKw", "আল্লাহ তুমি দয়ার সাগর ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("BkCoAJhgDKw", "আল্লাহ তুমি দয়ার সাগর ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("e53qwpWsHbo", "Tumi Rahman tumi meherban  ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("0utT2bTpQDQ", "কোরআনের সুর মাঝে শুনেছি যে নাম  ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("5q3prmhFvrc", "রমজানের ঐ রোজার শেষে এলো খুশির ঈদ ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("1fY4J-deKSw", "ইসলামী সংগীত । Zikir  ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("IKRJAIcdock", "Tasbih | Ayisha Abdul Basith  ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("nMZbDJVoSJs", "Xadidja - Hijab (Islamic School in Halabja)  ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("jx7q6wudqIE", "AL FATIHA (MOST REPEATED QURAN) ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("Khn1tKJjNtk", "The Day of Calling | Salman Al-Utaybi  ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("-j2vvEeU_Oo", "Allah, Allah الله الله (Arabic Nasheed)   ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("_EhwvQjlOdg", "Ya Allah - Chechnya Nasheed ", "19,596,162 views  31 Jul 2020 ");
		addVideoItem("IMNx26jyZvI", "URDU Naats VS ARABIC Naats  ", "19,596,162 views  31 Jul 2020 ");

		addVideoItem("vNEwR7xkehw", "আবু রায়হান এর বাছাইকৃত সেরা ১০ টি গজল  ", "19,596,162 views  31 Jul 2020 ");





		createPlayList("Islamic Tune", R.drawable.islamictune);
		//==========================================================================


		//======================5====================================================
		addVideoItem("BQQaRvVO03E", "Jackie Chan - Police Story : Lockdown", "81,046 views  31 May 2021 ");
		addVideoItem("E5zcjyWBu9M", "Bleeding Steel full movie ", "81,046 views  31 May 2021 ");
		addVideoItem("cqh3dq4QdSk", "The Goddess College | Romance Love Story film HD", "1,238,937 views  30 Jan 2022");
		addVideoItem("Q2epcVbdRBw", "Unity Of Heroes FULL ACTION MOVIE ", "81,046 views  31 May 2021 ");
		addVideoItem("i753nzu6V4g", "The Four | Chinese Movie in Hindi Dubbed Full Action HD |", "81,046 views  31 May 2021 ");
		addVideoItem("WsseaV-Hqis", "NEW TRILLER MOVIE", "81,046 views  31 May 2021 ");
		addVideoItem("P35kKFtHDrE", "Bloody Blade of King Lanling", "81,046 views  31 May 2021 ");
		addVideoItem("i0XPSGGcMSg", "Master | Korean Movie in Hindi Dubbed Full Action ", "81,046 views  31 May 2021 ");
		addVideoItem("NeYbrALqwq0", "Confidential Assignment Korean Hindi Dubbed", "81,046 views  31 May 2021 ");
		addVideoItem("yinSXJ9dtx4", "Dance to Death | Hollywood Movie in Hindi Dubbed", "81,046 views  31 May 2021 ");
		addVideoItem("X0QqoXnmNsU", "The Ice Breaker | Russian Movie in Hindi Dubbed", "81,046 views  31 May 2021 ");
		addVideoItem("A-rHNNS-bFU", "The Spy Undercover Operation | Korean Movie in Hindi Dubbed", "81,046 views  31 May 2021 ");
		addVideoItem("Ycg2vPara-A", "Fabricated City | Korean Movie in Hindi Dubbed ", "81,046 views  31 May 2021 ");
		addVideoItem("-8vhZxXaLi0", "Judge Archer | Chinese Movie", "81,046 views  31 May 2021 ");
		addVideoItem("YGfVzZSoNu0", "Dragon Blade | Chinese Movie", "81,046 views  31 May 2021 ");
		addVideoItem("CEYvrOK3AQs", "- Vanguard 2020 - Best Action Movie 2022 full movie", "81,046 views  31 May 2021 ");
		addVideoItem("J1VHErHCTww", "CZ 12 ", "81,046 views  31 May 2021 ");
		addVideoItem("gZr2Pf06E74", "doctor strange in the multiverse of madness Hind ", "81,046 views  31 May 2021 ");
		addVideoItem("oVC3uLCfS7g", "Knock Knock | Hollywood Movie ", "81,046 views  31 May 2021 ");
		addVideoItem("VflTtmHEEYM", "KUNG FU YOGA | Jackie Chan", "81,046 views  31 May 2021 ");
		addVideoItem("NG1bz_rHyts", "A Strange Murder - Changan Swordsmen - 2 Full Hindi Dubbed Movie ", "2,985,008 views  20 Dec 2021");
		createPlayList("Chiness & Korean Movies", R.drawable.chinessmovie);
		//==========================================================================


		//======================6====================================================
		addVideoItem("88rz4zokP78", "Para 1 Full", "677 views  8 Feb 2021");
		addVideoItem("8KM1L_6vj7Q", "Para 2 Full ", "1,669,496 views  23 Apr 2020");
		addVideoItem("KGpAWx1fBi8", "Para 3 Full ", "1,669,496 views  23 Apr 2020");
		addVideoItem("8343ov8d22Q", "Para 4 Full", "1,669,496 views  23 Apr 2020");
		addVideoItem("br6CZB__5uE", "Para 5 Full ", "1,669,496 views  23 Apr 2020");
		addVideoItem("hUsbM2kWOr8", "Para 6 Full ", "1,669,496 views  23 Apr 2020");
		addVideoItem("6sAfkb1T_1c", "Para 7 Full ", "1,669,496 views  23 Apr 2020");
		addVideoItem("fjGRNiwunIA", "Para 8 Full ", "1,669,496 views  23 Apr 2020");
		addVideoItem("4vsr0jN2Two", "Para 9 Full ", "1,669,496 views  23 Apr 2020");
		addVideoItem("bQaIBlcVSU4", "Para 10 Full", "1,669,496 views  23 Apr 2020");
		addVideoItem("XBlz1JYMIRM", "Para 11 Full ", "1,669,496 views  23 Apr 2020");
		addVideoItem("9f3GSWId2W0", "Para 12 Full ", "1,669,496 views  23 Apr 2020");
		addVideoItem("OxoaROQsnMg", "Para 13 Full ", "1,669,496 views  23 Apr 2020");
		addVideoItem("rt_pBUmOMI0", "Para 14 Full ", "1,669,496 views  23 Apr 2020");
		addVideoItem("X5_KoF_gIUw", "Para 15 Full ", "1,669,496 views  23 Apr 2020");
		addVideoItem("n8QTfj2Gdzw", "Para 16 Full ", "1,669,496 views  23 Apr 2020");
		addVideoItem("X7cXozHPS0Q", "Para 17 Full ", "1,669,496 views  23 Apr 2020");
		addVideoItem("0yc6_rpogwo", "Para 18 Full ", "1,669,496 views  23 Apr 2020");
		addVideoItem("xRUtMhDpkeY", "Para 19 Full ", "1,669,496 views  23 Apr 2020");
		addVideoItem("sdOs9oOfwUI", "Para 20 Full ", "1,669,496 views  23 Apr 2020");
		addVideoItem("7Tmhar8IZsc", "Para 21 Full ", "1,669,496 views  23 Apr 2020");
		addVideoItem("7AVZiKK67oo", "Para 22 Full ", "1,669,496 views  23 Apr 2020");
		addVideoItem("FbllKsvqvcE", "Para 23 Full ", "1,669,496 views  23 Apr 2020");
		addVideoItem("woh-yg7Q8QU", "Para 24 Full ", "1,669,496 views  23 Apr 2020");
		addVideoItem("oi-FSPH3SCM", "Para 25 Full ", "1,669,496 views  23 Apr 2020");
		addVideoItem("fPzn_svaMzs", "Para 26 Full ", "1,669,496 views  23 Apr 2020");
		addVideoItem("wPvjcwRHdsc", "Para 27 Full ", "1,669,496 views  23 Apr 2020");
		addVideoItem("G6_brF5HXdw", "Para 28 Full ", "1,669,496 views  23 Apr 2020");
		addVideoItem("jwS-ObKFX7Y", "Para 29 Full ", "1,669,496 views  23 Apr 2020");
		addVideoItem("zeWfgVdQVAo", "Para 30 Full ", "1,669,496 views  23 Apr 2020");

		createPlayList("Quran Mazid (1-30 para)", R.drawable.quranmazid);
		//==========================================================================


		//======================7====================================================
		addVideoItem("e53-CKR2F-4", "১৬ বছরে মিলিওনিয়ার নিক ডি’অ্যালিসিও।", "1,494 views  1 Jul 2022 ");
		addVideoItem("C0coXiyWs7U", "Motivation। Padma Bridge।Motivation। Padma Bridge।", "1,494 views  1 Jul 2022 ");
		addVideoItem("ODG-SzV2-_w", "এমন ভালোবাসার মানুষই সবাই পেতে চায়", "1,018 views  1 Jul 2022");
		addVideoItem("5z3iywNFijI", "ডেথ উইশ কফি- যেন জেনে-শুনে বিষ পান", "1,018 views  1 Jul 2022");
		addVideoItem("xE9FBL7jUGA", "ছিলেন এলিট আম্পায়ার, এখন জুতা বেচে সংসার চালাচ্ছেন", "1,018 views  1 Jul 2022");
		addVideoItem("NYVl-hT-_vA", "ছকোক স্টুডিও পাকিস্তানের সফলতার রহস্য", "1,018 views  1 Jul 2022");
		addVideoItem("pHlewnm2pTA", "১০০ বছর বাঁচার গোপন মন্ত্র", "1,018 views  1 Jul 2022");
		addVideoItem("hS6XDgz864E", "SUNNY LEONE UNTOLD STORY ", "1,018 views  1 Jul 2022");
		addVideoItem("oBFbggm4ZHM", "SUNDAR PICHAI UNTOLD STORY | GOOGLE", "1,018 views  1 Jul 2022");
		addVideoItem("wKW40A1CQoI", "PANKAJ TRIPATHI", "1,018 views  1 Jul 2022");
		addVideoItem("567MEodEgN0", "Mahesh Babu biography in Bengali ", "1,018 views  1 Jul 2022");
		addVideoItem("rpaky8C416g", "Elon Musk Success Story in Hindi", "1,018 views  1 Jul 2022");
		addVideoItem("KrgFMvS2jHc", "AKSHAY KUMAR | BIOGRAPHY", "1,018 views  1 Jul 2022");
		addVideoItem("rga27WGq7Zg", "ছিSara Ali Khan weight loss", "1,018 views  1 Jul 2022");
		addVideoItem("c6KbmjvQr5Y", "ছ৩০ পয়সার পেনবিক্রেতা থেকে বলিউডের সুপারস্টার ", "1,018 views  1 Jul 2022");
		addVideoItem("ecjJXVURZX4", "Mr. Bean -এর জীবন সংগ্রামের গল্প..", "1,018 views  1 Jul 2022");
		addVideoItem("joS_UENZ7WU", "রয়াল এনফিল্ড বাইকের সম্পূর্ণ অজানা গল্প", "1,018 views  1 Jul 2022");
		addVideoItem("CwM5H1k02RI", "Sandeep x Jeetu x Munna x Shadow Bhaiya Mashup | Motivational Dialogues |", "1,018 views  1 Jul 2022");
		addVideoItem("Rhksq_kCjGQ", "নিজের বলার মত একটা গল্পঃ জুবায়ের হোসেন", "1,018 views  1 Jul 2022");
		addVideoItem("h2-6PbMbXiw", "5 Minutes to Start Your Day Right! -MORNING MOTIVATION", "1,018 views  1 Jul 2022");
		addVideoItem("ExMPsWIXUgM", "পিছনে কে কি বলল এই জিনিসটা থেকে বের হতে হবে ", "1,018 views  1 Jul 2022");
		addVideoItem("VCy6o6WPgu8", "ছAaram Haram Hai Success Ke Liye | SRK Motivation", "1,018 views  1 Jul 2022");
		addVideoItem("HZwz4Ot43nI", "BELIEVE (ft.Shah Rukh Khan) - Inspirational video", "1,018 views  1 Jul 2022");
		addVideoItem("8rtAN7VvSy8", "Failure Makes You Humble | Shahrukh Khan Best Success Motivational Video |", "1,018 views  1 Jul 2022");
		addVideoItem("uFHCZz6853Q", "Shahrukh Khan Best Success Motivational Video |", "1,018 views  1 Jul 2022");
		addVideoItem("3OPPubLFaQ4", "রসিক মানুষ রাষ্ট্রপতি আব্দুল হামিদ", "1,018 views  1 Jul 2022");
		addVideoItem("3aWpw7wIa3Q", "ছরাজনীতি না করলে কি হতেন প্রধানমন্ত্রী?", "1,018 views  1 Jul 2022");
		addVideoItem("NqWz_aT97VM", "ছELON MUSK: ONLY 1% PEOPLE DO THIS", "1,018 views  1 Jul 2022");
		addVideoItem("lu3I62mZ8do", "How to change your life Motivation(Bangla). ", "1,018 views  1 Jul 2022");
		addVideoItem("jD6plHT__0E", "ভাইভায় ভয়?", "1,018 views  1 Jul 2022");
		addVideoItem("POV3fKmSVkg", "MOTIVARIONAL SPEECH", "1,018 views  1 Jul 2022");
		addVideoItem("BEIXcH_4Npc", "প্রতিশোধ নিতে হলে কাউকে শারীরিক, মানসিক কিংবা আর্থিকভাবে ক্ষতি করতে হয় না!", "1,018 views  1 Jul 2022");
		addVideoItem("8eWlE_4cXn0", "সফলতাই সবচেয়ে উত্তম প্রতিশোধ! ", "1,018 views  1 Jul 2022");
		addVideoItem("1ieqQs6oSmw", "সম্মানের বদলে শিক্ষকের কপালে জোটে অসম্মান, মাথায় স্ট্যাম্পের আঘাত!", "1,018 views  1 Jul 2022");
		addVideoItem("3N78OgZL18w", "শৈশবে শিক্ষকরা ঠিকই বলতেন- যে নদী যতো গভীর, তার বয়ে যাওয়ার শব্দও ততো", "1,018 views  1 Jul 2022");
		addVideoItem("olOZjLL9Bhs", "অভিশপ্ত ক্যান্সার যখন আশির্বাদ!", "1,018 views  1 Jul 2022");
		addVideoItem("UqDkvlk271Q", "একসময় বিশ্বের ৬ষ্ঠ ধনী ব্যক্তির দেউলিয়া হওয়ার গল্প", "1,018 views  1 Jul 2022");
		addVideoItem("YljJodgFgOk", "আজ আপনি যে মানুষটির ভালোবাসা ফিরিয়ে দিচ্ছেন, কাল হয়তো চাইলেই আর তার ভালোবাসা পাবেন না", "1,018 views  1 Jul 2022");
		addVideoItem("QOCRfj_0agQ", "ছিবিনয়ী হওয়া মানে ছোট হয়ে যাওয়া নয়! বরং আরও অনেক বড় হয়ে যাওয়া", "1,018 views  1 Jul 2022");
		addVideoItem("yhQtqFwXSK0", "স্রষ্টার কী অপরূপ সৃষ্টি, যে যতোটুকুর যোগ্য তাকে ততোটুকুই দিয়ে রেখেছেন", "1,018 views  1 Jul 2022");
		addVideoItem("w-8_J67jQ_E", "জীবনে ঠকে যাওয়াটাও এক প্রকার শিক্ষা!", "1,018 views  1 Jul 2022");
		addVideoItem("Mvgyrpx78T8", "ছরাষ্ট্রের প্রধান তবুও চলাফেরায় অতি সাধারণ!", "1,018 views  1 Jul 2022");
		addVideoItem("6bSZDKyu96s", "Solaiman Shukhon Motivational Speech", "1,018 views  1 Jul 2022");
		addVideoItem("RR79zhIQbMQ", "ঘৃণা আর ভালোবাসার অবস্থান পাশাপাশি", "1,018 views  1 Jul 2022");
		addVideoItem("2Y_rI-Aga6M", "কেন অল্প বয়সী মেয়েরা অধিক বয়সের পুরুষদের পছন্দ করে?", "1,018 views  1 Jul 2022");




		createPlayList("Motivational Speeach", R.drawable.motivational);
		//==========================================================================



		//======================8====================================================
		addVideoItem("fYCixQpLmyA", "Wrong Number Mr Bean!", "137,429,897 views  26 Jun 2020");
		addVideoItem("-72P_EFphSc", "At the HospitaL", "137,429,897 views  26 Jun 2020");
		addVideoItem("JE2xJGU9gyc", "BUSKING Bean", "137,429,897 views  26 Jun 2020");
		addVideoItem("BTlLoWdcvg8", "Mr Bean Official", "137,429,897 views  26 Jun 2020");
		addVideoItem("bo7yahqf3K4", "BEAN & Sabine ", "137,429,897 views  26 Jun 2020");
		addVideoItem("uNL2ti0klOQ", "Full Bean Ahead ", "137,429,897 views  26 Jun 2020");
		addVideoItem("hgDisbBapFM", "Hitchhiking | ", "137,429,897 views  26 Jun 2020");
		addVideoItem("EET1Dqs_1wI", "Bean Goes to France  ", "137,429,897 views  26 Jun 2020");
		addVideoItem("VbhOGVHoftk", "No SIGNAL | Mr Bean Full Episode ", "137,429,897 views  26 Jun 2020");
		addVideoItem("v6DY8cyOO1o", "Mr Bean's European Car Journey  ", "137,429,897 views  26 Jun 2020");
		addVideoItem("U9drEvUKx28", "Wrong Number ", "137,429,897 views  26 Jun 2020");

		addVideoItem("qCNu_vJNLMQ", "DIY with Mr Bean | Full Episodes", "73,188,191 views  28 Jul 2020");
		addVideoItem("NVhmq-pB_cs", "Time To Cool Off with Mr Bean", "137,429,897 views  26 Jun 2020");
		addVideoItem("LDmj_GOeRMU", "Mr Bean Official", "137,429,897 views  26 Jun 2020");
		addVideoItem("xE9FBL7jUGA", "Catch Me If You Can", "137,429,897 views  26 Jun 2020");
		addVideoItem("TcWvGQbm3ZQ", "Summer Holiday with Mr Bean ", "137,429,897 views  26 Jun 2020");
		addVideoItem("WYs7NsuAk4Q", "Johnny English Reborn 2020 - ", "137,429,897 views  26 Jun 2020");
		addVideoItem("13FLawVtwSc", "Bean ARRESTED", "137,429,897 views  26 Jun 2020");
		addVideoItem("iI3pRSqjPsc", "Safe Flight Mr Bean", "137,429,897 views  26 Jun 2020");
		addVideoItem("QD0uWNYLSbA", "Golf with Mr Bean!", "137,429,897 views  26 Jun 2020");
		addVideoItem("H-IYQtauVGY", "Mr Bean's Holiday Check-In", "137,429,897 views  26 Jun 2020");
		addVideoItem("YB8rUu_tKiQ", "Mr Bean's SHOWER PHONE!", "137,429,897 views  26 Jun 2020");
		addVideoItem("YB8rUu_tKiQ", "Mr Bean's POPCORN PRANK", "137,429,897 views  26 Jun 2020");
		addVideoItem("1dW_I_d6oQA", "DOCTOR Bean Arrives |", "137,429,897 views  26 Jun 2020");
		addVideoItem("P3RtVD-BpgE", "Mr Bean Dines Out IN STYLE", "137,429,897 views  26 Jun 2020");
		addVideoItem("sSUUCUIU-lI", "Mr Bean's Happy Hotel Stay in Room 426 ", "137,429,897 views  26 Jun 2020");
		addVideoItem("YryByZErX90", "NATIVITY NIGHTMARE", "137,429,897 views  26 Jun 2020");
		addVideoItem("P--YO_QgUAY", "Goodnight Mr. Bean | Episode 13 ", "137,429,897 views  26 Jun 2020");
		addVideoItem("HgDGUb2TjyM", "Back to School Mr Bean |", "137,429,897 views  26 Jun 2020");
		addVideoItem("G9nqB8BwGHU", "The Trouble with Mr Bean ", "137,429,897 views  26 Jun 2020");
		addVideoItem("Fo6P1ZxQCt8", "Drink Up Bean", "137,429,897 views  26 Jun 2020");
		addVideoItem("HKUY_gOxLas", "Merry Christmas, Mr. Bean", "137,429,897 views  26 Jun 2020");
		addVideoItem("oKIgrIIRPGE", "Cool Bean |", "137,429,897 views  26 Jun 2020");
		addVideoItem("_R1PBhaZrZo", "Goodnight Mr Bean |", "137,429,897 views  26 Jun 2020");
		addVideoItem("iVCt3OLPsFM", "Mr Bean ", "137,429,897 views  26 Jun 2020");
		addVideoItem("hmaflplHU60", "Die Rückkehr von Mr Bean", "137,429,897 views  26 Jun 2020");
		addVideoItem("yHgLTGXY2So", "The Department Store", "137,429,897 views  26 Jun 2020");

		createPlayList("MR Bean", R.drawable.mrbean);
		//==========================================================================




		//======================9====================================================
		addVideoItem("5Eqb_-j3FDA", "Coke Studio | Season 14 ", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("vdY5SFZBgnk", "Pushpa: Saami Saami - Full Video Song | Allu Arjun, Rashmika Mandann", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("ihgTuiPn3-k", "Apna Time Aayega full video|subtitles| Movie Version | Ranveer SINGH | Alia Bhatt", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("hcMzwMrr1tE", "Srivalli (Video) | Pushpa | Allu Arjun, Rashmika Mandanna ", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("jFGKJBPFdUA", "Apna Time Aayega | Gully Boy | Ranveer Singh & Alia Bhatt ", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("M81wneSjQbA", "Sher Aaya Sher | Gully Boy | Siddhant Chaturvedi | Ranveer Singh & Alia Bhatt ", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("QPGmwRNkffc", "Doori | Gully Boy | Ranveer Singh & Alia Bhatt ", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("4nCshJBODT4", "Azadi - Gully Boy| Ranveer Singh & Alia Bhatt ", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("pGmbUdf6lEM", "Mere Gully Mein | Gully Boy | Ranveer Singh,Alia Bhatt ", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("OulN7vTDq1I", "Badshah - DJ Waley Babu | feat Aastha Gill ", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("EBgknXt8DmY", "Honge Juda Na Hum, Tum Se – Jalebi | Varun & Rhea ", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("dUaCEs3HfdI", "Aastha Gill - Buzz feat Badshah | Priyank Sharma  ", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("Jyst8oIHOAY", "Mercy - Badshah Feat. Lauren Gottlieb  ", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("KBIq11mNB0I", "Full Video: Malang (Title Track)| Aditya Roy Kapur, Disha Patani", "224,173,497 views  7 Feb 2022");
		addVideoItem("Msv8D6HZJ7U", "Malang: Title Song | Aditya Roy Kapur, Disha Patani, ", "224,173,497 views  7 Feb 2022");
		addVideoItem("hJBHSmyqv0Y", "Humraah Full Song | Malang | Aditya R K, Disha P", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("YmXJp4RtBCM", "Proper Patola - Official Video | Namaste England | Arjun | Parineet ", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("8LZgzAZ2lpQ", "Abhi Toh Party Shuru Hui Hai' FULL VIDEO Song | Khoobsurat | Badshah |", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("vJQMhj6WYZA", "Barbaadiyan (Full Video)| Shiddat |Sunny K,Radhika M ", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("k7QniTYNsmQ", "Bachpan Ka Pyaar (Official Video) Badshah, Sahdev Dirdo, Aastha Gill, Rico ", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("sqmNziU3OxQ", "Oo Bolega ya Oo Oo Bolega Ft Samantha ( Full Video) Pushpa | Allu A, Rashmika", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("HqUeSjsYLNU", "Makhna - Drive| Sushant Singh Rajput, Jacqueline Fernandez ", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("ZHKQgmpabD8", "Drunk N High (Official Video) Mellow D, Aastha Gill | Adah Sharma ", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("JzqD2kZPo50", "Gully Boy | Murad VS Shah Rule | Ranveer Singh  ", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("cd-ozdPSAIA", "Hui Malang | MALANG | Aditya R K, Disha P", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("nyKqttrmMS0", "Jaan Hai Meri Song: Radhe Shyam | Prabhas, Pooja Hegde", "224,173,497 views  7 Feb 2022");
		addVideoItem("IH3HvvyHgs0", "Main Ishq Mein Hoon Song |Radhe Shyam| Prabhas, Pooja H", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("hmgun60brcw", "Labon Pe Naam (Full Video) Radhe Shyam | Prabhas, Pooja H", "224,173,497 views  7 Feb 2022");
		addVideoItem("gqYOQrQm66c", "Soch Liya (Full Video) | Radhe Shyam | Prabhas, Pooja H", "224,173,497 views  7 Feb 2022");
		addVideoItem("x0rphRfOWeU", "Udd Jaa Parindey Song | Radhe Shyam | Prabhas, Pooja Hegde ", "224,173,497 views  7 Feb 2022");
		addVideoItem("lm3yy29vbqM", "Aashiqui Aa Gayi (Full Video) Radhe Shyam | Prabhas, Pooja Hegde | ", "224,173,497 views  7 Feb 2022");
		addVideoItem("RgzLnmTaCAU", "Kusu Kusu Song Ft Nora Fatehi ", "121,299,479 views  24 Mar 2022 ");
		addVideoItem("EriDC-_m6IQ", "Ishq Nahi Karte (Video) Emraan Hashmi", "121,299,479 views  24 Mar 2022 ");
		addVideoItem("vxO1KgZuZ40", "Shringaar - Official Music Video", "224,173,497 views  7 Feb 2022");
		addVideoItem("nFjVlf2r9_Q", "Badshah - Paani Paani | Jacqueline Fernandez", "224,173,497 views  7 Feb 2022");
		addVideoItem("BE7C6yevoeY", "Vaaste Song - Dhvani Bhanushali, Tanishk Bagchi", "224,173,497 views  7 Feb 2022");
		addVideoItem("k42YMuGQN-c", "Dil Galti Kar Baitha Hai", "224,173,497 views  7 Feb 2022");
		addVideoItem("J1rOfVst-EQ", "Bhool Bhulaiyaa 2 ", "224,173,497 views  7 Feb 2022");
		addVideoItem("ly5FEs0F8_I", "Full Video: De Taali | Bhool Bhulaiyaa 2 ", "224,173,497 views  7 Feb 2022");
		addVideoItem("jq4wGWQoNvc", "Dheere Dheere Se Meri Zindagi Video Song | YoYo Honey Singh", "224,173,497 views  7 Feb 2022");
		addVideoItem("sCbbMZ-q4-I", "Lut Gaye (Full Song) Emraan Hashmi, Yukti ", "224,173,497 views  7 Feb 2022");
		addVideoItem("aMtSDDlz0CE", "DUPPATA (Lyrical) JugJugg Jeeyo", "224,173,497 views  7 Feb 2022");
		addVideoItem("Bw4ttHZGgLQ", "Kitni Haseen Hogi - HIT: The First Case", "224,173,497 views  7 Feb 2022");
		addVideoItem("aOliIfyH6vI", "Atrangi Re: Rait Zara Si Full Video", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("DBBJSx9Wqvc", "Fateh (Video Song) - Shabaash Mithu | Taapsee P", "224,173,497 views  7 Feb 2022");
		addVideoItem("ruDn0aSXgcw", "Designer (Lyrical) Guru Randhawa, Yo Yo Honey Singh ", "224,173,497 views  7 Feb 2022");
		addVideoItem("cpH8tCyVGPo", "Phir Na Aisi Raat Aayegi Song| Laal Singh Chaddha | Aamir| Kareena", "224,173,497 views  7 Feb 2022");
		addVideoItem("c6ri-MFdNLY", "THE PUNJAABBAN SONG (Video) JugJugg Jeeyo | Varun Kiara Anil Neetu", "224,173,497 views  7 Feb 2022");
		addVideoItem("FwH4ruvzjxQ", "Ji Huzoor Song | Shamshera | Ranbir Kapoor ", "224,173,497 views  7 Feb 2022");

		addVideoItem("yLDgquhTYsw", "Jubin Nautiyal Blockbuster Hits ", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("ui8r-3GmnJw", "Amaal Mallik - Hidden Gems (Audio Jukebox) ", "224,173,497 views  7 Feb 2022");
		addVideoItem("r0c1f6XxRQg", "Evergreen Hits of KK ", "224,173,497 views  7 Feb 2022");


		addVideoItem("REk0bN5Et9c", "Saansein Dene Aana - OM | Aditya Roy K, Sanjana S ", "224,173,497 views  7 Feb 2022");
		addVideoItem("fsTnKtENWNQ", "Tere Saath Hoon Main | Raksha Bandhan | Akshay Kumar", "224,173,497 views  7 Feb 2022");
		addVideoItem("iaqO4PRXVhk", "Nasha Ishq Ka - Nikamma", "224,173,497 views  7 Feb 2022");
		addVideoItem("a0TkeUhcVrM", "Burjkhalifa | Laxmii | Akshay Kumar | Kiara Advani ", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("LYEqeUr-158", "Sauda Khara Khara |Good Newwz| Akshay kumar , Kareena , Diljit , Kiara", "224,173,497 views  7 Feb 2022");
		addVideoItem("05JOpxK-yfE", "Oh Isha - Major | Adivi Sesh & Saiee M Manjrekar", "224,173,497 views  7 Feb 2022");
		addVideoItem("s6Gz1Yffbzw", "Jana Gana Mana - Major | Adivi Sesh", "224,173,497 views  7 Feb 2022");
		addVideoItem("QGveT_uqoXE", "Baithe Baithe - Lyrical | Mouni, Angad", "224,173,497 views  7 Feb 2022");
		addVideoItem("yg7DWt_neFg", "Kiss You - Tony Kakkar ft. Neha Kakkar ", "224,173,497 views  7 Feb 2022");
		addVideoItem("3TsHC9_fiPQ", "Tauba | Offical Music Video", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("Tc8kb5HBNrA", "Mast Nazron Se | Rochak K ft Jubin Nautiyal, Nikita Dutta", "224,173,497 views  7 Feb 2022");
		addVideoItem("5OjLEiDKz5M", "Kala Sha Kala - OM | Aditya Roy K, Elnaaz N, Sanjana S", "224,173,497 views  7 Feb 2022");
		addVideoItem("0cbXeXP2Wgg", "Badshah - Tabahi (Official Video) | Tamannaah", "224,173,497 views  7 Feb 2022");
		addVideoItem("6CVVd9RB7CI", "GF BF VIDEO SONG | Sooraj Pancholi, Jacqueline Fernandez", "224,173,497 views  7 Feb 2022");
		addVideoItem("9v5-9ovoTGE", "Badshah – Bad Boy x Bad Girl ", "224,173,497 views  7 Feb 2022");
		addVideoItem("sPn2HP8cAbo", "Badshah, J Balvin, Tainy - Voodo", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("eSZaNuzVBfU", "Baawla | Badshah", "224,173,497 views  7 Feb 2022");
		addVideoItem("uLcucDjcLm0", "She's On Fire |Full Song |Dhaakad | Kangana Ranaut, Arjun Rampa", "224,173,497 views  7 Feb 2022");
		addVideoItem("Tb6xGDiSscc", "Dirty Little Secret - Nora Fatehi x Zack Knight", "224,173,497 views  7 Feb 2022");
		addVideoItem("_yOYV-j_3jU", "Rehna Tere Paas | Priyank S, Shivaleeka O,", "224,173,497 views  7 Feb 2022");
		addVideoItem("RjTPZmLnSao", "Khariyat | Arijit Singh | Sushant Singh ", "224,173,497 views  7 Feb 2022");
		addVideoItem("MJyKN-8UncM", "Shayad - Love Aaj Kal | Kartik | Sara | Arushi", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("zC82mNsdTAM", "Armaan Malik - Nakhrey Nakhrey", "224,173,497 views  7 Feb 2022");
		addVideoItem("Dp6lbdoprZ0", "Main Rahoon Ya Na Rahoon Full Video | Emraan Hashmi, Esha Gupta ", "224,173,497 views  7 Feb 2022");
		addVideoItem("nKGECvWPGvI", "AAJA NA FERRARI MEIN (Full Video) | Armaan Malik", "224,173,497 views  7 Feb 2022");
		addVideoItem("f1qz8vn3XbY", "Ghar Se Nikalte Hi Song | Amaal Mallik ", "224,173,497 views  7 Feb 2022");
		addVideoItem("VhnHsoFm2nY", "Tootey Khaab (Official Video) | Songster, Kunaal Vermaa", "224,173,497 views  7 Feb 2022");
		addVideoItem("JvjWj2bJMpU", "Armaan Malik - Barsaat (Official Music Video)", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("byitAI7kkOM", "Lyrical: Dil Mein Ho Tum| WHY CHEAT INDIA | Emraan H,", "224,173,497 views  7 Feb 2022");
		addVideoItem("EpEraRui1pc", "BOL DO NA ZARA Full Video Song | AZHAR | Emraan Hashmi, Nargis Fakhri ", "224,173,497 views  7 Feb 2022");
		addVideoItem("sNyvRvnjqqM", "PYAAR MANGA HAI Video Song | Zareen Khan,Ali Fazal", "224,173,497 views  7 Feb 2022");
		addVideoItem("mNxd1GEDYiQ", "CHALE AANA : De De Pyaar De I Ajay Devgn, Tabu, Rakul Preet ", "224,173,497 views  7 Feb 2022");
		addVideoItem("mpjNh-uGBY4", "Sau Aasmaan - Full Video | Baar Baar Dekho | Sidharth Malhotra & Katrina Kaif ", "224,173,497 views  7 Feb 2022");
		addVideoItem("vL3_GMhNe4M", "HUA HAIN AAJ PEHLI BAAR | SANAM RE", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("58kOTj-Fe1E", "Dil Mein Chhupa Loonga Video Song | Wajah Tum Ho |", "224,173,497 views  7 Feb 2022");
		addVideoItem("0mQLTWvXbXM", "JAB TAK Video Song | M.S. DHONI -THE UNTOLD STORY | Armaan Malik, ", "224,173,497 views  7 Feb 2022");
		addVideoItem("hQs6AExu_NM", "Tumhe Apna Banane Ka VIDEO Song | Hate Story 3 | Zareen Khan, Sharman Joshi", "224,173,497 views  7 Feb 2022");
		addVideoItem("0_P4pKbvaII", "Wajah Tum Ho Video Song | Hate Story 3 | Zareen Khan, Karan Singh", "224,173,497 views  7 Feb 2022");
		addVideoItem("8qL25dWoq0w", "Mast Nazron Se Allah Bachaye", "224,173,497 views  7 Feb 2022");
		addVideoItem("R4mCK5P7WZE", "Do Din - Darshan Raval|", "224,173,497 views  7 Feb 2022");
		addVideoItem("w4ClQO0FFQg", "Param Sundari -Official Video | Mimi | Kriti Sanon|", "224,173,497 views  7 Feb 2022");
		addVideoItem("DKj5m9cSMZs", "Nadiyon Paar (Let the Music Play) – Roohi | Janhvi|", "224,173,497 views  7 Feb 2022");
		addVideoItem("U_DSCLqgZCo", "Coke Studio Season 8|", "224,173,497 views  7 Feb 2022");
		addVideoItem("GR5U85eo4yQ", "Coke Studio | Season 14", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("MlQO26MNZZ4", "Ajnabi - Official Music Video | Atif Aslam ", "224,173,497 views  7 Feb 2022");
		addVideoItem("P0NfnFYpENo", "BAARISHEIN Song | Arko Feat. Atif Aslam & Nushrat Bharucha ", "224,173,497 views  7 Feb 2022");
		addVideoItem("uCMYzolEbO0", "Darasal Full Video Song | Raabta | Sushant Singh Rajput & Kriti Sanon", "224,173,497 views  7 Feb 2022");
		addVideoItem("z9bs8HAfvlI", "Atif aslam stage performance", "224,173,497 views  7 Feb 2022");
		addVideoItem("iwhpS4ow7Zc", "Tumse Bhi Zyada (Lyrical) | Tadap | Ahan Shetty, Tara Sutaria ", "224,173,497 views  7 Feb 2022");
		addVideoItem("bTdMSyALjps", "Atif Aslam | Kadi Te Hans | VELO Sound Station 2021", "224,173,497 views  7 Feb 2022 ");
		addVideoItem("A57JQp8THKE", "Jeena Jeena | Atif Aslam Sad Songs 2015", "224,173,497 views  7 Feb 2022");
		addVideoItem("YuXLN23ZGQo", "O Saathi Lyrical Video | Baaghi 2 | Tiger Shroff | Disha Patani", "224,173,497 views  7 Feb 2022");
		addVideoItem("ZU1aTYejeEo", "Mauka Parast (Lyrical) | HEROPANTI 2 |", "224,173,497 views  7 Feb 2022");



		createPlayList("Hindi Songs", R.drawable.hindisong);
		//==========================================================================

		//======================10====================================================
		addVideoItem("e8eSfqaaGXQ", "Karone Okarone | Minar Rahman", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("3NdXYZygETE", "Abar | Minar Rahman ", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("Pm3KHU-edJo", "Minar Rahman - Shagorer Tirey", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("gviAd_TlhIQ", "Minar Rahman - Keu Kotha Rakheni", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("UNOov8EADBA", "Tuito Amar Shob | Minar | Apurba | Tanjin Tisha ", "13,557,258 views  13 Apr 2017  ");

		addVideoItem("RWnFowWtT78", "MINAR RAHMAN | JHOOM", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("XChdfPIvoIo", "Deyale Deyale | Minar", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("3fcs8SncEDs", "CHOKH | Minar", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("UIyRzMvn5Cs", "Miche Mayar Shohore | Minar Rahman", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("dhSz7MoEpYk", "Ki Tomar Naam - Minar Rahman | Angshu", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("Q1nSnaqffJo", "Sunglass | OST of Sunglass", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("p537fHTnW8s", "Local Bus | Official Music Video", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("kRvn-T7wmpw", "Oprapti | TAHSAN | ASHA |", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("DB3YrZIObyQ", "Beiman | Arman Alif ", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("cWiaM6mmidQ", "Shob kichu bodle gelo with lyrics", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("u9J1gNcCmqY", "Nesha || নেশা || Arman Alif", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("dwOdU2Yl1Rc", "খোলা জানালা", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("zAN-qXInbsc", "Ghum || Odd Signature ", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("99CL1vbs-yM", "Arbovirus - School (Official Music Video)", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("XesnTarkz5Y", "Nei Proyojon | Muza | Xefer", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("hby3Pa9D2Lk", "Shukher Jonno | Nish | Toya", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("x09h2BJKVaA", "Xefer - Pasoori Cover ", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("p1yoQ83TG1k", "TAARAI TAARAI - NAGARBAUL JAMES with TAPOSH ", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("ta_kjP2E3NU", "James || New Song", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("UTx4fSMaYus", "Tor Premete Ondho Holam ", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("H_wGmAjI_wM", "Maa by James ", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("Hmx8hR5jHsw", "Asbar Kale Aslam Eka | James", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("YTybrzpBcj0", "বুক চিন চিন করছে | Pabel | Shilpi | Afran Nisho | Mehazabien ", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("KiEQuZ98eVQ", "JHOR | Ferdous Wahid | Sharlina ", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("aMffcZc1vC4", "Beporowa Mon ", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("LtnTx_kDALU", "Habib Wahid - Nodi - Official Music Video", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("RLrrKHPQC6M", "Habib Wahid - Obujhpona", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("HYWREG-S-rc", "Habib Wahid - Anmona Mon ", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("JcrgcobH1aE", " মনের কিনারায় | Habib Wahid ", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("3Cix3YGezrI", "Phire To Pabona", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("pkRai2hVyH8", "Hridoy Khan - Chaina Meye", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("inwsWENWCZQ", "Hridoy Khan - Mon Tore Boli Joto", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("IV5hzpN4GCI", "CHAINA MEYE - HRIDOY KHAN ", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("EW_BZiZ1Es8", "Nil Doriya", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("F9DstkJDyXw", "Prem Tumi by Tahsan", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("AIHxuw9ETHg", " অন্ধকার ঘরে ", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("PIB1g0tgQE8", "Habib Wahid - Tor Mayaghore -", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("uNNyyhJbw5c", "যত ভুল | Tahsan Khan ", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("wRdnLVT1808", "অনুভূতি | Sahil Sanjan | Piran Khan", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("HXRKYqdddjM", "Chere Jeyona (Oviman)", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("Ot3BZcYCeZE", "Bhalobashi Bole Dao - Piran Khan", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("a4zZYrKQPLI", "bristi beja ratae", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("dEKnaEPEGHQ", "Apon | OST | Tanveer Evan | Piran Khan", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("ViERpDhY_yQ", "Bachelor Party Song | Kajal Arefin Ome ", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("hwTEqSRqHoI", "টাকলা | TAKLA | OST of Stadium", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("XT-UPkgs1T4", "Bachelor Trip Full Song। Bachelor point ", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("ZdMlXdsoBKc", "Chol Bondhu Chol | Full Video Song | Networker Baire |", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("Fx6Pk1od_Fo", "Old vs New Bangla Mashup I Hasan S. Iqbal I", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("_4Ja5DVqTK8", "Valentine Mashup 2022 ", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("Uzgk7ca8TrU", "Love Hits Mashup ", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("6dTisi-607I", "Bondhua 2.0 |", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("zYSKGSOXlWg", "New vs Old Bangla Mashup", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("QFWte4t9qoc", "Love Mashup 2021 |", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("F8pkfW8MB1k", "Amazing Performance of Hasan S. Iqbal & Dristy Anam In Rtv Music Awards 2020 ", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("y-X8mF_5PUw", "Tumi Amar Onek Shokher | Yearmate OST | Jovan | Safa Kabir", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("oRy6fRuQ4Ps", "Pakhi | পাখি | Belal Khan Ft Liza ", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("04FxMouVtic", "SHEI TUMI - AYUB BACHCHU", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("J9cKe7kwobo", "জেমস এর সেরা ১০টি গান ", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("Imo_HuoQVBM", "Best of Ayub Bachchu Bangla Song Full Album 2018", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("wlmyLiE7dqc", "Best Collection Of TAHSAN", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("5uAjp9sxcr4", "Minar Best Songs", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("HTi5OQQH8go", "Hridoy Khan Best Song", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("FLMKWAY547g", "Best Of Tanveer Evan Top 10", "13,557,258 views  13 Apr 2017  ");
		addVideoItem("ijYg84y-tzo", "Best of habib wahid | habib wahid songs | ", "13,557,258 views  13 Apr 2017  ");
		createPlayList("Bangla Songs", R.drawable.banglasong);
		//==========================================================================


		//======================11====================================================
		addVideoItem("ZAmZucyzyZM", "Funny Babies Laughing Hysterically at Dogs Compilation ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("0IorlRijR20", "Garfield Bangla Funny Dubbing ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("PP7toELbdqA", "Cutest Babies Play With Dogs And Cats Compilation  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("nbfWVn9waM8", "Cute Babies Playing With Dogs Compilation ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("XC3wd1J3n0c", "Baby Dogs - Cute and Funny Dog Videos  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("X2lIovmNsUY", "Baby Dogs ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("ax-8laei90w", " Funny DOG Videos", "18,936 views  3 Jul 2022  ");
		addVideoItem("m61Nlfl8r4Y", "Super Dogs And Cats Reaction Videos", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("jm2hZJn8X9w", "dogs funny videos", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("wuD8nzb-DwI", "Funny Dog Videos: Pets That Are Just Too Stupid  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("omPFzLWWm98", "Best Funny Dogs of Internet  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("UjF4Wb15NqE", "Baby Cats - Cute and Funny Cat Videos ", "25,279 views  Premiered 22 hours ago ");


		addVideoItem("4I7QspM96nE", "Baby Dogs - Cute and Funny Dog Videos", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("CgvUney-Vok", "Baby Dogs - Cute and Funny Dog Videos ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("m-1h6ndbGpo", "Baby Dogs - Cute and Funny Dog Videos ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("SZ5Rl-wKfXE", "Baby Dogs - Cute and Funny Dog Videos ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("gWmsvJK7F3s", "Best Friend - Cute and Funny Animals Videos Compilation ", "55,788,479 views  10 Sept 2019");
		addVideoItem("mubt_h9NRn4", "Baby Dogs - Cute and Funny Dog Videos Compilation ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("bLAFSGUkNsU", "Baby Dogs - Cute and Funny Dog Videos  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("OUkojFtlODQ", "Baby Dogs - Funny and Cute Baby Dog Videos ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("rJubbYxUUx4", "Baby Dogs - Cute and Funny Dog Videos Compilation ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("zDUlTFNkb_M", "Baby Dogs - Cute and Funny Dog Videos Compilation ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("wtH-hdOF1uA", "Baby Dogs - Cute and Funny Dog Videos Compilation", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("ceLfahTHIsw", "Baby Dogs - Cute and Funny Dog Videos  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("M_WBGbVufmc", "Baby Dogs - Cute and Funny Dog Videos Compilation  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("mt3zakSg310", "Funny Dogs and Cats Reaction to Magic Tricks  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("WI-RUpYdKhk", "Baby Dogs - Cute and Funny Dog Videos Compilation ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("h7nIRcqQww0", "Funny and Cute Dog Reaction  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("RggKbI6MQWo", "Baby Dogs - Cute and Funny Dog Videos  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("0bOOamwRrr8", "Baby Dogs - Cute and Funny Dog Videos  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("kT2yHr8V6dw", "Baby Dogs - Cute and Funny Dog Videos ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("pQGgPQA_FR4", "Baby Dogs - Cute and Funny Dog Videos", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("Xoq10XJDDdQ", "Baby Dogs - Cute and Funny Dog Videos  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("GYWmNuhk5oA", "Ultimate Cutest Puppies and Funniest Dogs Compilation ", "25,279 views  Premiered 22 hours ago ");


		createPlayList("Funny Dog ", R.drawable.dog);
		//==========================================================================

		//======================12====================================================
		addVideoItem("mMFvrBsB_uM", "LAUGHING BABY Videos Will Make You LAUGH too", "742,775 views  23 Mar 2018");
		addVideoItem("myz0kxHLnLU", "Best Videos Of Funny Twin Babies Compilation", "742,775 views  23 Mar 2019");
		addVideoItem("WkBepVZIFGA", "Funniest Baby's Outdoor Moments", "742,775 views  23 Mar 2020");
		addVideoItem("cxRe9B0IXGI", "Best of FUNNY BABIES |", "742,775 views  23 Mar 2019");

		addVideoItem("zNSJ_Smac0Y", "Hilarious Dads - Funny Daddy and Babies Moments", "742,775 views  23 Mar 2018");
		addVideoItem("7CJjYt6DblM", "Naughty Baby's Funniest Moments ", "742,775 views  23 Mar 2019");
		addVideoItem("18muV36qtXA", "Funniest Triplet and Twin Babies Compilation of 2022", "742,775 views  23 Mar 2020");
		addVideoItem("AeglRNPGJXI", "Best Videos Of Cute and Funny Twin Babies - Twins Baby Videos |", "742,775 views  23 Mar 2019");
		addVideoItem("xYRjjiVNrhE", "LAUGHING BABY Videos Will Make You LAUGH too", "742,775 views  23 Mar 2018");
		addVideoItem("perp3hPqFGM", "Cute Baby Playing Water", "742,775 views  23 Mar 2019");
		addVideoItem("sf54bBjYgnk", "Try Not To Laugh : Baby Doing Hilarious Things", "742,775 views  23 Mar 2020");
		addVideoItem("PkM-7ZL1oXI", "99% You Laugh - TOP Funniest Baby", "742,775 views  23 Mar 2019");
		addVideoItem("hGxvTFT9XXE", "TOP Cutest Babies on the Planet | Funny Baby Videos", "742,775 views  23 Mar 2018");
		addVideoItem("VLshjUnNElQ", "Try Not To Laugh : Cutest Baby play with Animals at The First Time", "742,775 views  23 Mar 2019");
		addVideoItem("RWbZiF4giZk", "Cutest Babies Video Make You Happy All Day | Funny Baby Videos", "742,775 views  23 Mar 2020");
		addVideoItem("z7Oqh0vJZ0U", "Funny Reaction Baby when Meeting Doctor the First Time | Baby Videos", "742,775 views  23 Mar 2019");
		addVideoItem("_12-bsL-WhE", "TOP Cutest Chubby Babies will melt your heart", "742,775 views  23 Mar 2018");
		addVideoItem("yv_kzrKASC0", "Funny Baby's reaction To Food |", "742,775 views  23 Mar 2019");
		addVideoItem("hRSs94xbvuo", "Try Not To Laugh : Cutest Babies Will Melt Your Heart ", "742,775 views  23 Mar 2020");
		addVideoItem("xhn7cCzyP-M", "Try Not To Laugh :Funny Babies' Reactions when Playing New Toys | Funny Baby Videos", "742,775 views  23 Mar 2019");
		addVideoItem("KeYwIZQjW_U", "Funny Babies when Meeting Fish and Aquatic Animals for the First Time | Funny Baby Videos", "742,775 views  23 Mar 2018");
		addVideoItem("qZ3VCbr3mpU", "Funniest Reaction Babies Playing with Water the First Time", "742,775 views  23 Mar 2019");
		addVideoItem("CpUH0qtrRyw", "The Best Twin Baby Videos Of All Time - JustSmile", "742,775 views  23 Mar 2020");
		addVideoItem("X5zzT1Wbcps", "Cute Babies Playing With Water is EVERYTHING - JustSmile", "742,775 views  23 Mar 2019");
		addVideoItem("2B17grD_4Io", "Funny Baby Playing With Daddy - JustSmile", "742,775 views  23 Mar 2018");
		addVideoItem("-YR22B2UKzA", "Funny Baby Outdoor Playing Moments - JustSmile", "742,775 views  23 Mar 2019");
		addVideoItem("gvlRlW0iYLI", "Try Not To Laugh : 1001 Funny Reaction Babies when Play Water The First Time ", "742,775 views  23 Mar 2020");
		addVideoItem("JzkdwJF960o", "Best Videos of Cute and Funny Twin Babies | ", "742,775 views  23 Mar 2019");
		addVideoItem("KMGUBnUaY5g", "Try Not To Laugh : Funniest Baby Playing With Water ", "742,775 views  23 Mar 2018");
		addVideoItem("J4XvSKnE1Iw", "Funny Twin Babies Argue Over Everything - JustSmile", "742,775 views  23 Mar 2019");
		addVideoItem("elJm4rWkZM8", "Cute Baby At The Beach - - Baby Outdoor Moments |", "742,775 views  23 Mar 2020");
		addVideoItem("5hHe7iZb7zg", "Funniest Baby's Actions Like a Boss - JustSmile", "742,775 views  23 Mar 2019");
		addVideoItem("0dv-dGCuEnQ", "Try Not To Laugh : Funny Babies Playing With Water - Funny Videos", "742,775 views  23 Mar 2018");
		addVideoItem("I5iHs5LQJdQ", "Cute Cats Are Babysiter | Funniest Moment Of Baby And Cats", "742,775 views  23 Mar 2019");
		addVideoItem("GT3PvcQhN4E", "Adorable Baby Moment ! Cutest Baby Shine Your Day ", "742,775 views  23 Mar 2020");
		addVideoItem("cWnjeScj9Ig", "Funniest Moment : You Know You Pretty Baby ! Cute Baby Videos", "742,775 views  23 Mar 2019");
		addVideoItem("kz8VVwtYPr4", "Funniest Newborn Baby Reaction when Meets Water For The First TimE", "742,775 views  23 Mar 2018");
		addVideoItem("RjveUxAJCGM", "Supper Funny Baby Hits The Gym For The First Time | Funny Video", "742,775 views  23 Mar 2019");
		addVideoItem("dfOyy3fxAss", "Cutest Baby Moments Ever", "742,775 views  23 Mar 2020");
		addVideoItem("OvMecknloHs", "Funny Babies Blowing Candle Fail", "742,775 views  23 Mar 2019");
		addVideoItem("bH9-Lm_HU8I", "Funniest Baby's Outdoor", "742,775 views  23 Mar 2018");
		addVideoItem("oWjrQj-Jm7k", "Funny and Cute Baby", "742,775 views  23 Mar 2019");
		addVideoItem("4Vz7FI2ZFt8", "Baby Shark Doo Doo | Funny Baby Reaction Videos", "742,775 views  23 Mar 2020");
		addVideoItem("61cMxSAge44", "Funny Babies Playing With Water", "742,775 views  23 Mar 2019");
		addVideoItem("hnCk_8-gnAU", "Funny Twins Baby Arguing Everything - Cutest Twins Baby Videos", "742,775 views  23 Mar 2018");
		addVideoItem("51dV2B4iDpE", "Try Not To Laugh - Funny Babies Playing With Water", "742,775 views  23 Mar 2019");
		addVideoItem("KB-h9z79s6A", "Funny Baby Trouble Maker - Funny Videos |", "742,775 views  23 Mar 2020");



		addVideoItem("jXcB3SpQb1M", "Funniest Baby Moment: Summer - Comming To Water", "742,775 views  23 Mar 2019");
		addVideoItem("1ldEHYvTfIg", "Funniest Baby and Daddy: Like Father - Like Son", "742,775 views  23 Mar 2020");
		addVideoItem("XIvMG0CQg3U", "Funniest Baby Are Master Of Clowns | Cutest Baby Videos", "742,775 views  23 Mar 2019");
		addVideoItem("7lBNNKFga4M", "Funniest Baby Doing Silly Things But Cute |", "742,775 views  23 Mar 2018");
		addVideoItem("MtYLYgj--18", "Adorable Baby And Dog Moment", "742,775 views  23 Mar 2019");
		addVideoItem("YZWJXcMsW6I", "Funniest Moment: Hilarious Baby Doing Silly Things |Cute Baby Videos", "742,775 views  23 Mar 2020");
		addVideoItem("i_vGaBoaQYE", "Tipping over on the couch", "742,775 views  23 Mar 2019");
		createPlayList("Funny Baby ", R.drawable.baby);
		//==========================================================================

		//======================13====================================================
		addVideoItem("HJFbhG1Z_c0", "Funniest Cat  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("rbNkc2xRPpA", " Cat Videos Compilation ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("ByH9LuSILxU", "Baby Cats - Cute and Funny Cat Videos Compilation  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("eX2qFMC8cFo", "Funniest Cats   ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("uHKfrz65KSU", "Baby Cats - Cute and Funny Cat Videos Compilation  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("7_cPF8oDoJM", "Baby Cats - Cute and Funny Cat Videos Compilation ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("IeGD4UK2YmU", "Baby Cats - Cute and Funny Cat Videos ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("IeGD4UK2YmU", "Baby Cats  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("hL_ABdjDCrA", "Baby Cats - Cute and Funny Cat Videos  ", "25,279 views  Premiered 22 hours ago ");


		addVideoItem("hL_ABdjDCrA", "Baby Cats - Cute and Funny Cat Videos Compilation ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("v4kmwURr8IU", "Baby Cats - Cute and Funny Cat Videos Compilation   ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("Lf52IYYdzXI", "Baby Cats - Cute and Funny Cat Videos  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("cytJLvf-eVs", "Baby Cats - Cute and Funny Cat Videos Compilation ", "25,279 views  Premiered 22 hours ago ");

		addVideoItem("-8JQB_wXjmk", "Cat Videos  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("zQIawgxoox4", " Cute and Funny Cat Videos  ", "25,279 views  Premiered 22 hours ago ");

		addVideoItem("C6RUp21s6BQ", "Cat Videos  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("cytJLvf-eVs", "Baby Cats - Cute and Funny Cat Videos Compilation  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("BwSQyuUxYfI", "Two Cats and 500 Balls in a Ball Pit !! ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("AIQLBiGUCQ4", "Baby Cats - Funny and Cute Cat Videos Compilation  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("qaLoZdBR0oA", "Cat Reaction to Playing Toy - Funny Cat  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("cir9lt71QmM", "Funny animals - Funny cats  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("zFXMOfFzoRc", "Funniest Cat Videos  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("h_qt9TQc1tk", "Baby Cats  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("DXUAyRRkI6k", "Funny Cats and Kittens Meowing Compilation ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("1demxrg1pXE", "Very FUNNY CATS  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("2AzW2HxN5lE", "Baby Cats - Funny and Cute Baby Cat ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("FHfdK2w2TSQ", "Baby Cats - Cute and Funny Cat Videos ", "25,279 views  Premiered 22 hours ago ");


		addVideoItem("Meh54_SToaI", "Baby Cats - Cute and Funny Cat Videos Compilation   ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("hY7m5jjJ9mM", "CATS will make you LAUGH  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("CPISexQPvQw", "Try Not To Laugh Animals   ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("2SP1GqIMVMU", "Baby Cats - Cute and Funny Cat Videos  ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("LpagQMYRtvg", " Funniest Cat Videos ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("polX7S2Vnyw", "Little Kitten My Favorite Cat Play Fun Pet Care ", "25,279 views  Premiered 22 hours ago ");
		addVideoItem("TyBaPaQ02pY", "Baby Cats  ", "25,279 views  Premiered 22 hours ago ");



		createPlayList("Funny Cat", R.drawable.cat);
		//==========================================================================


		//======================14====================================================
		addVideoItem("UxdTKhR4NYs", "আজকে আমার মন ভালো নেই", "3,856,524 views  14 Jun 2022");
		addVideoItem("uRsJfIRpLL8", "মন আমার কেমন কেমন করে ", "1,551,111 views  30 Jun 2022 ");
		addVideoItem("B9maWp48BNU", "মোবাইল মেকানিক শফি", "378,782 views  30 May 2022");
		addVideoItem("dCVrvTbVDZs", "Barcode Fuchka Baji | Prank Call ", "116,000 views  20 May 2022 ");
		addVideoItem("ANiLG5Tx-k8", "Hosen mistry Part 3 ", "116,000 views  20 May 2022 ");
		addVideoItem("MHGZGeaH3Ow", "ইলেক্ট্রিক মিস্ত্রি হোসেন 2  ", "116,000 views  20 May 2022 ");
		addVideoItem("rllExFnKj_M", "নোয়াখালীর এক মানুষ কে দিলাম বাঁশ | Prank Call  ", "116,000 views  20 May 2022 ");
		addVideoItem("4KrCGmUKE4k", "রং মিস্ত্রি  ", "116,000 views  20 May 2022 ");
		addVideoItem("VRauWMcadYo", "মাছ ব্যবসায়ী জোল্লো বদ্দা | CTG Prank Call", "116,000 views  20 May 2022 ");
		addVideoItem("EoW5l_mkN5I", "123 Motin Part 2  ", "116,000 views  20 May 2022 ");
		addVideoItem("zha5W7JKfaw", "Anam Vaiyer Marka Bichi Marka | Prank Call", "116,000 views  20 May 2022 ");
		addVideoItem("VRauWMcadYo", "মাছ ব্যবসায়ী জোল্লো বদ্দা | CTG Prank Call", "116,000 views  20 May 2022 ");
		addVideoItem("sRCQecw2588", "live Prank Call With Enamul Hasan | Chitttainga TV | ", "116,000 views  20 May 2022 ");
		addVideoItem("nWIUazF6obY", "আমার বক্সার লাগবে ", "116,000 views  20 May 2022 ");
		addVideoItem("cCxMwqyIcGw", "পাইপ মিস্ত্রি বাছাইয়ে part 2 ", "116,000 views  20 May 2022 ");
		addVideoItem("QrH0XpH2XGg", "Google Chrome Funny Video | Chittagong Funny Video | ", "116,000 views  20 May 2022 ");
		addVideoItem("OZwtI70zgOY", "প্রতারক যখন মি. কাশেমের সাথে মজা নিতে আসে ", "116,000 views  20 May 2022 ");
		addVideoItem("4ivVSVeToBo", "শ্বশুড়বাড়ির যৌতুক কক্সবাজারে  ", "116,000 views  20 May 2022 ");
		addVideoItem("MVYfrT9Hgcc", "দিন রাত ২৪ ঘন্টা Pizza কোথায় পাবেন | Chittainga Tv ", "116,000 views  20 May 2022 ");
		addVideoItem("alwiVjrPcxc", "i pun | কুমিল্লায় কবুতর বিক্রেতা ", "116,000 views  20 May 2022 ");

		createPlayList(" Chittainge Tv Funny Audio", R.drawable.jokes);
		//==========================================================================
		addVideoItem("1UfG77r0CVI", " De Dana Dan | Comedy Scenes 1", "116,000 views  20 May 2022 ");
		addVideoItem("SJXOzTDE0Lk", " De Dana Dan | Comedy Scenes 2", "116,000 views  20 May 2022 ");
		addVideoItem("DA7lvlMREPU", " De Dana Dan | Comedy Scenes 3", "116,000 views  20 May 2022 ");
		addVideoItem("l5vwXyu_1_I", " De Dana Dan | Comedy Scenes 4", "116,000 views  20 May 2022 ");
		addVideoItem("bMyTmy9dFSY", " De Dana Dan | Comedy Scenes 5", "116,000 views  20 May 2022 ");
		addVideoItem("5JHTLCfsJbI", " de dana dan  | Comedy Scenes 6", "116,000 views  20 May 2022 ");
		addVideoItem("czScLBarUAg", " De Dana Dan | Comedy Scenes 7", "116,000 views  20 May 2022 ");
		addVideoItem("JnZa2wMIxms", " Phir Hera Pheri | Comedy Scenes 8", "116,000 views  20 May 2022 ");
		addVideoItem("ywoep-piEaw", " Phir Hera Pheri | Comedy Scenes 1", "116,000 views  20 May 2022 ");
		addVideoItem("APxT5x1kNLg", " Phir Hera Pheri | Comedy Scenes  2", "116,000 views  20 May 2022 ");
		addVideoItem("SE8mpzUTqfU", " Phir Hera Pheri | Comedy Scenes 3 ", "116,000 views  20 May 2022 ");
		addVideoItem("KSzGVA09tn4", " Phir Hera Pheri | Comedy Scenes 4", "116,000 views  20 May 2022 ");
		addVideoItem("pEstJtDJ9ZA", " Phir Hera Pheri | Comedy Scenes 5", "116,000 views  20 May 2022 ");
		addVideoItem("b5HBLxfV7Cc", " Phir Hera Pheri | Comedy Scenes 6", "116,000 views  20 May 2022 ");
		addVideoItem("i_s_iosCZfg", " Phir Hera Pheri | Comedy Scenes 7", "116,000 views  20 May 2022 ");
		addVideoItem("JPcXVua23co", " Phir Hera Pheri | Comedy Scenes 8", "116,000 views  20 May 2022 ");
		addVideoItem("-HcoQCtx13s", " Bhagam Bhag | Comedy Scenes 1", "116,000 views  20 May 2022 ");
		addVideoItem("xySJzWv825s", " Bhagam Bhag | Comedy Scenes 2", "116,000 views  20 May 2022 ");
		addVideoItem("NUn06X08yuw", "  Bhagam Bhag Comedy Scenes 3", "116,000 views  20 May 2022 ");

		addVideoItem("kLguDMmNtgY", " Bhagam Bhag| Comedy Scenes 4", "116,000 views  20 May 2022 ");

		addVideoItem("14QJRAAkVEE", " Bhagam Bhag| Comedy Scenes 5", "116,000 views  20 May 2022 ");
		addVideoItem("I_1paQV_vFo", " Bhagam Bhag | Comedy Scenes 6", "116,000 views  20 May 2022 ");
		addVideoItem("KHvfdKyw2I8", " Bhagam Bhag | Comedy Scenes 7", "116,000 views  20 May 2022 ");

		addVideoItem("XHaihRpVG90", "  Bhagam Bhag  | Comedy Scenes 8", "116,000 views  20 May 2022 ");

		addVideoItem("KAUwA2ga3rA", " Bhagam Bhag | Comedy Scenes 9", "116,000 views  20 May 2022 ");
		addVideoItem("i_bRpcxz-x8", "  Bhagam Bhag | Comedy Scenes 10", "116,000 views  20 May 2022 ");
		addVideoItem("T56P0cQA04U", "  Bhagam Bhag  | Comedy Scenes 11", "116,000 views  20 May 2022 ");
		addVideoItem("8CmUtNGznII", " Bhagam Bhag | Comedy Scenes 12", "116,000 views  20 May 2022 ");
		addVideoItem("ivO_T1yB81U", " Bhagam Bhag | Comedy Scenes 13", "116,000 views  20 May 2022 ");
		addVideoItem("xG1glcWzKeM", " Bhagam Bhag  | Comedy Scenes 14", "116,000 views  20 May 2022 ");
		addVideoItem("FHLl_gBqbUY", " Welcome || Comedy Scenes 1", "116,000 views  20 May 2022 ");

		addVideoItem("um8RePw1rQ0", " Welcome | Comedy Scenes 2", "116,000 views  20 May 2022 ");

		addVideoItem("obRxIWR69rM", " Welcome | Comedy Scenes 3", "116,000 views  20 May 2022 ");
		addVideoItem("Ih_7ktBsSZU", " Welcome | Comedy Scenes 4", "116,000 views  20 May 2022 ");
		addVideoItem("6DJ_DOvyaXQ", " Welcome  | Comedy Scenes 5", "116,000 views  20 May 2022 ");
		addVideoItem("LHbxRs4nLv0", " Welcome | Comedy Scenes 6", "116,000 views  20 May 2022 ");
		addVideoItem("HZRKZFtlDwQ", " Welcome  | Comedy Scenes 7", "116,000 views  20 May 2022 ");
		addVideoItem("xW36-XC6tBs", " WELCOME| Comedy Scenes 8", "116,000 views  20 May 2022 ");




		createPlayList("  Shemaroo Comedy ", R.drawable.shemaro);




		createPlayList("   ", R.drawable.fahad);



	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}

