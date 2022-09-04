import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
                int san = 50;
                ArrayList<Integer> arrayList = new ArrayList<>(san);
                for (int i = 0; i < san; i++) {
                    int a = (int) (Math.random() * 100);
                    arrayList.add(a);
                }
                System.out.println(arrayList);
        System.out.println(" ");

                ArrayList<Integer> arrayList1 = new ArrayList<>(san);
                for (int i = 0; i < san; i++) {
                    int k = (int)(Math.random()*100);
                    if (k % 2== 0) {
                        arrayList1.add(k);
                    }
                }
                System.out.println(arrayList1);
        System.out.println(" ");
                ArrayList<Integer> arrayList2 = new ArrayList<>(san);
                for (int i = 0; i < san; i++) {
                    int r = arrayList.get(i);
                    if (r % 2== 1) {
                        arrayList2.add(r);
                    }
                }
                System.out.println(arrayList2);
            }
        }

