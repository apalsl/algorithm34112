#include <iostream>

using namespace std;

int main() {
    int r, c, d;
    int n, m;

    cin >> n >> m;

    int room[n][m] = {0, };

    cin >> r>> c>> d;


    for (int i=0; i<n; i++) {
        for (int j=0; j<m; j++) {
            cin >> room[i][j];
        }
    }

    room[r][c] = 2;
    while(true){
        // for (int z=0; z<58; z++) {
        if (room[r][c-1] != 0 && room[r+1][c] != 0 && room[r][c+1] != 0 &&room[r-1][c] != 0){
            if (d==0) {
             if (room[r+1][c] == 1){
                 break;
             } else {
                 r = r+1;
             }
        } else if (d==3) {
            if (room[r][c+1] == 1) {
                break;
            } else {
                c = c+1;
            }
        } else if (d == 2) { 
            if (room[r-1][c] == 1 ) {
                break;
            } else {
                r = r-1;
            }
        } else if (d == 1) {
            if (room[r][c-1] == 1) {
                break;
            } else {
                c = c-1;
            }
        }
        } else if (d==0) {
             if (room[r][c-1] == 0){
                 c = c-1;
                 room[r][c] = 2;
                 d = 3;
             } else {
                 d =3;
             }
        } else if (d==3) {
            if (room[r+1][c] == 0) {
                r = r+1;
                room[r][c] =2;
                d = 2;
            } else {
                d = 2;
            }
        } else if (d == 2) { 
            if (room[r][c+1] == 0 ) {
                c = c+1;
                room[r][c] = 2;
                d = 1;
            } else {
                d = 1;
            }
        } else if (d == 1) {
            if (room[r-1][c] == 0) {
                r = r-1;
                room[r][c] = 2;
                d = 0;
            } else {
                d= 0;
            }
        }


        }


    int count= 0;
    for (int i=0; i<n; i++) {
        for (int j=0; j<m; j++) {
            if (room[i][j] == 2) {
                count++;
            }
        }
    }

    cout << count;


    
}
