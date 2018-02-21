#include <stdio.h>
#include <stdlib.h>
#include <time.h>


int main() {
    srand(time(NULL)); //set the time seed to randomly pick values
    char c[51] = "";
    char a[26] = "abcdefghijklmnopqrstuvwxyz";
    char *pc1 = &c;
    char *alph = &a;
    for (int i = 0; i < 51; i++)
    {
        int random = (rand() % 26);
        *pc1 = *(alph + random);

        printf("pc1: %c | Ad: %i | og Ad: %i\n", *pc1, pc1, alph + random);
        *pc1++;


    }
    char *printit = &c;
    for (int i = 0; i < 26; i++) {
        printf("%c: is %d\n", *alph, alph);
        *alph++;


    }

    return 0;
}
