package kr.codesquad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringQuizTest {

    @Test
    @DisplayName("같은 문자열의 해시코드 비교 ")
    public void compareStringHashCode() {
        String abc1 = "abc";
        String abc2 = new String("abc");
        // TODO 1 변수에 정의한 문자열과 new 를 통해 생성한 인스턴스가 같은 주소를 가리키는지 비교

        assertNotSame(abc1, abc2);
        assertNotEquals(System.identityHashCode(abc1), System.identityHashCode(abc2));
    }

    @Test
    @DisplayName("문자열 길이 구하기")
    public void test_stringLongLong() throws Exception {
        String teacher = "Honux";
        // TODO 2 문자열 길이 구하기
        assertEquals(teacher.length(), 5);
    }

    @Test
    @DisplayName("문자열 합치기")
    public void assembleStrings() throws Exception {
        String teacher = "Crong";
        String frontend = "Hello";
        // TODO 3 문자열 합치기
        String result = teacher + frontend;
        assertEquals("CrongHello", result);
    }

    @Test
    @DisplayName("string 을 char 단위로 각각 출력")
    public void testPrintStringAsAChar() throws Exception {
        String teacher = "Pobi";
        // TODO 4 string 을 char 단위로 출력
        // 출력결과:

        for (int i = 0; i < teacher.length(); i++) {
            System.out.println(teacher.charAt(i));
        }
    }

    @Test
    @DisplayName("+을 이용해 String을 거꾸로 출력하기")
    public void stringReversedWithPlus() throws Exception {
        String teacher = "Dangle";

        // TODO 5 더하기 연산을 이용해 String을 거꾸로 출력하기
        // 결과: elgnaD

        String reversedTeacher = "";

        for (int i = teacher.length() - 1; i >= 0 ; i--) {
            reversedTeacher += teacher.charAt(i);
        }

        System.out.println(reversedTeacher);
    }


    @Test
    @DisplayName("StringBuilder을 이용해 String을 거꾸로 출력하기")
    public void 문자열_뒤집기() throws Exception {
        String developer = "Zello";
        StringBuilder sb = new StringBuilder();

        // TODO 6 StringBuilder를 이용해 String을 거꾸로 출력하기
        // 결과: olleZ

        for (int i = developer.length() - 1; i >= 0 ; i--) {
            sb.append(developer.charAt(i));
        }

        System.out.println(sb.toString());
    }
}