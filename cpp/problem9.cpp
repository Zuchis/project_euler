#include <iostream>
#include <vector>
#include <cstdlib>
#include "utils.h"

using std::vector;

int main(int argc, const char *argv[])
{
    int i,j, k;
    int a, b, c;
    int m, n;
    std::vector<int> primes = prime_sieve(500);

    int size = (int)primes.size();

    for (i = 0; i < size - 1; i++) {
        for (j = i + 1; j < size; j++) {
            for (k = 1; k < 100; k++) {
                m = primes[j];
                n = primes[i];
                a = k * (pow(m,2) - pow(n,2));
                b = k * 2 * m * n;
                c = k * (pow(m,2) + pow(n,2));
                if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
                    a /= 2;
                    b /= 2;
                    c /= 2;
                }
                if (a + b + c > 1000 && a + b + c < 1050) {
                    std::cout << "a: " << a << " b: " << b << " c: " << c << std::endl;
                    std::cout << "a + b + c: " << a + b + c << std::endl;
                    std::cout << std::endl;
                }
            }
        }
    }


    return 0;
}
