#include <iostream>

using namespace std;

// 이 예제는 자연수n을 입력하면 1부터 자연수 n까지의 모든 자연수를 출력한다.
// 중요한 것은 줄바꿈을 "\n"을 사용해야 한다. endl을 사용하면 시간초과가 된다.
int main() {
    int n = 0;
    std::cin >> n;
    for (int i=1; i<=n; i++) {
        std::cout << i << "\n";
    }

    return 0;
}