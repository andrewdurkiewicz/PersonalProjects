/* This C program demonstrates the switch statement without using breaks. */
/* The program is tested on MS Visual C++ platform */
#include <stdio.h>
#pragma warning(disable : 4996) // Remove this line in Unix GCC environment
int main(){
        printf("This is Andrew Durkiewicz's hw1 Assignment\n");
        printf("------------------------------------------");
        printf("\n");

        char ch;
        for(int iterate = 0; iterate < 5; iterate++)
        {
          printf("\n");
          printf("Enter character %i/5\n",iterate + 1);
          printf("----------------------------------------\n");
          scanf(" %c",&ch);
          int f, a = 10, b = 20;
          float a_f = 1.0 * a;
          float b_f = 1.0 * b;
          float division;
          printf("ch = %c\n", ch);
          switch (ch) {
          case '+': f = a + b; printf("f = %d\n", f); break;
          case '-': f = a - b; printf("f = %d\n", f); break;
          case '*': f = a * b; printf("f = %d\n", f); break;
          case '/': division = a_f / b_f; printf("f = %-.02f\n", division); break;
          default: printf("invalid operator\n");
          }
          printf("----------------------------------------\n");

        }
        return 0;
}
