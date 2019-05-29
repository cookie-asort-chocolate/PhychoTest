package question19;

public class Question19_3 {

	public static void main(String[] args) {
		String str = "カエルがゲコゲコとゲコ池で鳴いている";
		int snum = str.indexOf("ゲコ");

		System.out.println(str);
		System.out.print(/*search +*/ "ゲコという文字は先頭から" + (snum + 1) + "番目です");
	}
}
