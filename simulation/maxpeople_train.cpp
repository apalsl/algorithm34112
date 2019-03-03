#include <iostream>

using namespace std;

// 직접 짠 코드

int main() {
    int start; // 시작지점에 탄 사람 수
    int zero; // 항상 0을 입력받는 변수

    int second; // 2번역 탑승
    int second_out; // 2번역 하차

    int third; // 3번역 탑승
    int third_out; // 3번역 하차

    int last; // 마지막 하차

    // 순서대로 입력받음.
    cin >> zero >> start;
    cin >> second_out >> second;
    cin >> third_out >> third;
    cin >> last >> zero;

    //두번째 열차 인원
    int second_result = start-second_out+second;
    int third_result = second_result-third_out+third;
    int last_result = third_result-last;

    //4가지 조건중 하나라도 맞으면 종료
    if(zero != 0 || second_result<0 || third_result <0 || last_result <0 ||
    second_result + third_result + last_result > 10000 ) {
        return 0;
    }

    if (second_result > last_result && second_result > third_result) {
        cout << second_result;
    } else if (third_result > last_result) {
        cout << third_result;
    } else {
        cout << last_result;
    }







    return 0;
}