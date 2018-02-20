#include <stdio.h>

int menu(){
  int choice;
  printf("Welcome to Assignment 3!\n");
  printf("Menu:\n");
  printf("1 - Single Dimension Array Processing\n");
  printf("2 - Two-D Processing\n");
  printf("Choose an option:\n");
  scanf("%i", &choice);
  return choice;
}
void array(){
  char letters = "abcdefghijklmnopqrstuvwxyz";
  char random_char[51];




}
void getchar(){
  char letters = "abcdefghijklmnopqrstuvwxyz";


}

void cont(int input){
  switch(input){
    case 1:
    array();
  }
}



int main(){
  int result = menu();
  if (result == 1)
  {
    cont(1);
  }
  else if (result == 2)
  {
    cont(2);
  }
  else
  {
    printf("I am sorry, that is not a selection. Try again\n\n\n\n");
    menu();
  }
  return 0;
}
