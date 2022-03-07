public class Roop {
	public static void main(String[] args) {
        	for(int i = 0;i<5;i++) {
                	int count = i + 1;
                        System.out.println(count + "回目のループです。");
                        if(count >= 4) {
                        	System.out.println("4回目になったので処理を中断します。");
                                break;
                        }
                        if(count >= 2) {
                        	System.out.println("2回目以降は後続処理は行いません。");
                                continue;
                        }
                        System.out.println(count + "回目のループを終了します。");
                 }
        }
}