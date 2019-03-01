#include<iostream>
#include<string>
using namespace std;

// 공백과 숫자, 문자가 혼합된 데이터를 입력받는대로 출력한다
// getline으로 한번에 입력한 데이터를 한번에 가져온다.
// 만약 공백을 입력시 종료한다.

int main(){
    string str;

    while(true) {
        getline(cin, str);
        if (str==""){
            break;
        }
        cout << str << "\n";

    }

    return 0;
}