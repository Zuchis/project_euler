#include <iostream>
#include <vector>
#include <array>
#include <limits>

int main(int argc, const char *argv[])
{
    int current_div;
    std::array<int,18> divisors = {3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    for (int i = 20; i < std::numeric_limits<int>::max(); i+= 2) {
        current_div = 0;
        for (int j = 0; j < 18; j++) {
            if (i % divisors[j] == 0) {
                current_div = divisors[j];
            } else {
                break;
            }
        } 
        if (current_div == 20) {
            std::cout << i << std::endl;
            break;
        }
    }
        
    return 0;
}
