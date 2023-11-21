package BlackBox.arrayList;

import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args) {
        /*
        배열의 단점
        배열은 항상 배열 길이를 정하고 시작한다.
        배열을 사용하는 중에 길이를 변경할 수 없어 최대 길이 이상의 데이터를 넣을 수 없다.
        배열의 중간에 비어있는 요소를 비워둘 수 없으므로 배열 요소 위치를 변경해줘야 함.
        */

        // ArrayList<E> 배열이름 = new ArrayList<E>();
        ArrayList<String> strs = new ArrayList<>();

        // 모든 기본 데이터타입은 제네릭 타입으로 변경해서 사용
        ArrayList<Integer> ints = new ArrayList<Integer>();

        // 사용자가 만든 클래스를 데이터타입으로 arraylist를 만들 수 있다.
        ArrayList<Book> books = new ArrayList<Book>();


        /* 주요 메소드
        add(e) : 요소 하나를 배열에 추가
        int size() : 전체 요소의 갯수를 리턴
        E(제네릭) get(int index) : 배열의 index 위치에 있는 요소 값을 반환
        E remove(int index) : 배열의 index 위치의 요소 값을 제거하고 그 값을 반환
        boolean isEmpty() : 배열이 비어있는지 확인
        */



    }
}
