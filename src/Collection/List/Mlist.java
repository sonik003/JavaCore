package Collection.List;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Mlist {

    // ������ ��������� ��� �������
    private static Collection createFirstCollection() {
        // ������� ��������� �� ������ ������������ ������ ArrayList
        Collection col = new ArrayList();
        // ���������� � ���������
        col.add("1");
        col.add("2");
        col.add("3");
        col.add("4");
        col.add("5");
        col.add("6");
        col.add("7");
        return col;
    }

    // ������ ��������� ��� �������
    private static Collection createSecondCollection() {
        // ������� ��������� �� ������ ������������ ������ ArrayList
        Collection col2 = new ArrayList();
        col2.add("1");
        col2.add("2");
        col2.add("3");
        return col2;
    }

    public static void main(String[] args) {

        // ������� ��������� ��� ������������
        Collection col1 = createFirstCollection();
        Collection col2 = createSecondCollection();
//        // ������������ ������� �� ���������
//        System.out.println("============= ������ �� ���������");
//        for(Object o : col1) {
//            System.out.println("Item: " + o);
//        }
//
//
//        // ������������ ������� �� ��������� ����� ��������
//        System.out.println("============= ������ �� ��������� ����� ��������");
//        for (Iterator it = col1.iterator(); it.hasNext();){
//            String s = (String)it.next();
//            System.out.println("Item: " + s);
//        }
//        // �������� �������� ���������
//        // ����� ������� ��������� ��� ������������
//        col1 = createFirstCollection();
//        // ������� ���� �������
//        col1.remove("1");
//        System.out.println("============= ������� ������� '1' - ��� �� ����� � ������");
//        for(Object o: col1){
//            System.out.println("Item: " + o);
//        }

        // �������� ��������� ����� ��������
        // ����� ������� ��������� ��� ������������
        // �������� ��������� ����� ��������
        // ����� ������� ��������� ��� ������������
        col1 = createFirstCollection();
        System.out.println("============= �������� ����� ��������");
        while(!col1.isEmpty()) {
            Iterator it = col1.iterator();
            Object o = it.next();
            System.out.println("�������:" + o);
            // ������� �������
            it.remove();
        }
    }
}
