#include <iostream>
// #include <vector>
#include <algorithm>

// 좋은 예제를 보고 따라친 코드
// scanf가 cin보다 속도가 빠름. 사용하는 습관이 필요함
// *std::max_element와 max(), min()에 대한 공부가 필요함.

int main() {
    int trainOut, trainIn, train[4];
    scanf("%d %d", &trainOut, &trainIn );
    train[0] = trainIn - trainOut;

    for (int i =1; i<4; i++) {
        scanf("%d %d", &trainOut, &trainIn);
        train[i] = train[i-1] - trainOut + trainIn;
    }

    std::cout << *std::max_element(train, train + 4);

}