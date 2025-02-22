#include <stdio.h>
#include <string.h>

void respond(char *input) {
    if (strcmp(input, "Hello") == 0) {
        printf("Hi there!\n");
    } else if (strcmp(input, "How are you?") == 0) {
        printf("I'm just a program, so I don't have feelings, but thanks for asking!\n");
    } else {
        printf("I'm not sure how to respond to that.\n");
    }
}

int main() {
    char user_input[100];

    printf("AI: Hello, how can I help you?\n");

    while (1) {
        printf("User: ");
        fgets(user_input, sizeof(user_input), stdin);

        // Remove newline character
        user_input[strcspn(user_input, "\n")] = 0;

        // Exit the loop if the user types "exit"
        if (strcmp(user_input, "exit") == 0) {
            printf("AI: Goodbye!\n");
            break;
        }

        // Generate a response
        printf("AI: ");
        respond(user_input);
    }

    return 0;
}
