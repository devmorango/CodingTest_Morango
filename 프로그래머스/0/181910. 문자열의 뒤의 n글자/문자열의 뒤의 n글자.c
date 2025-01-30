#include <stdio.h>
#include <string.h>

char* solution(char* my_string, int n) {
    int len = strlen(my_string);
    return my_string + (len - n);
}

int main() {
    char my_string1[] = "ProgrammerS123";
    int n1 = 11;
    printf("%s\n", solution(my_string1, n1));

    char my_string2[] = "He110W0r1d";
    int n2 = 5;
    printf("%s\n", solution(my_string2, n2));

    return 0;
}
