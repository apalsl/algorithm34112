#include <iostream>

using namespace std;
// 백준 동전 0 , 11047번문제
// 그리디 알고리즘 사용 안함. (뭔지 모름)

int main() {
    int kinds;
    int money;

    std::cin >> kinds>> money;
    if (kinds > 10 && kinds < 1 || money > 100000000 && money < 1) {
        return 0;
    }
 
    int t;
    int tmp = 0;    
    int* array = new int[kinds-1];

    for (int i=0; i<kinds; i++) {
        std::cin>>t;
        if (tmp != 0 && ( t <= tmp || t % tmp != 0 ) || t ==0) {
            return 0;
        } else {
            array[i] = t;
            tmp =t;
        }
    }

    tmp =0;
    t =1;
    for (int i=kinds; i>=0; i--, t++) {
        tmp +=money/array[kinds-t];
        money = money%array[kinds-t];

        if (money == 0) {
            std::cout<<tmp;           
            return 0;
        }
    }

    return 0;
}