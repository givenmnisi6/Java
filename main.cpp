#include <iostream>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>



using namespace std;

//MORE OF CONSTANTS IN MY CODE
 #define SIZE_NAME 100 //LENGTH OF THE NAMES
 #define NUMB_NAME 50 //NUMBER OF NAMES INPUTTED CAN BE UP TO 50

int main()
{
    char names[NUMB_NAME][SIZE_NAME] = {""}; //INITIALIZING MY ARRAY AS A BLANK STRING (INPUT FULL NAME)
    char digit;                             //LETTER INPUTTED
    int SIZE;
    int i;

    for (i=0; i<NUMB_NAME; i++)
    {
    printf("Enter name (X to quit input): ");
    gets(names[i]);

    if((strcmp(names[i], "X") == 0) || strcmp(names[i], "x") == 0)
    {
        break;
    }
    SIZE++;
    }

    printf("\nList of names\n\n");
    for(i=0; i<SIZE; i++)
    {
     puts(names[i]);
    }

    printf("\nEnter a letter: ");
    scanf("%c", &digit);

    printf("\nNames starting with the letter %c\n\n", digit);

    for (int i=0; i<SIZE_NAME; i++)
    {
        if(digit==names[i][0])
        {
            cout<<names[i]<<endl;
        }
    }
}
