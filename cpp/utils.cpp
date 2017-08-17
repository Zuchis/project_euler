#include "utils.h"

std::vector<int> prime_sieve(int n) {
    int i =  {2};
    int next_prime;
    std::vector<int> numbers(n);
    std::vector<int> primes;
    std::generate(numbers.begin(), numbers.end(), [&i] {return i++;});
    while (!numbers.empty()) {
        next_prime = numbers[0];
        numbers.erase(numbers.begin());
        primes.push_back(next_prime);
        auto it = numbers.begin();
        while (it != numbers.end()) {
            if (*it % next_prime == 0) {
                it = numbers.erase(it);
            } else {
                it++;
            }
        }

    }
    return primes;
}
