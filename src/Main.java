

public class Main {

	public static void main(String[] args) {
		//		Recipe recipe1 = new Recipe("ジャガイモ煮込み+ごはん", "ジャガイモ", 0.3, 14);
		//		Recipe recipe2 = new Recipe("麻婆豆腐＋ごはん", "豆腐", 0.5, 14);
		//		Recipe recipe3 = new Recipe("ラーメン+餃子", "ヌード", 0.3, 14);
		//		Recipe recipe4 = new Recipe("しゃぶしゃぶ+ごはん", "肉", 0.7, 3);
		//		Recipe recipe5 = new Recipe("バーベキュー放題", "肉", 0.7, 3);
		//		Recipe recipe6 = new Recipe("ステーキ放題", "肉", 0.7, 3);
		//
		//		
		//		Recipe[] list = {
		//				recipe1,
		//				recipe2,
		//				recipe3,
		//				recipe4,
		//				recipe5,
		//				recipe6
		//		};
		System.out.println("一日の料理リスト：\n");
		String[] list = {
				"ジャガイモ煮込み+ごはん",
				"麻婆豆腐＋ごはん",
				"ラーメン+餃子",
				"しゃぶしゃぶ＋ごはん",
				"バーベキュー放題",
				"ステーキ放題" };

		while (true) {
			int lunchNo = new java.util.Random().nextInt(list.length);

			int dinnerNo = new java.util.Random().nextInt(list.length);

			if (lunchNo != dinnerNo) {
				System.out.println("今日の昼ご飯は >" + list[lunchNo]);
				System.out.println("今日の晩御飯は >" + list[dinnerNo]);
				break;
			}

		}
	}
}
