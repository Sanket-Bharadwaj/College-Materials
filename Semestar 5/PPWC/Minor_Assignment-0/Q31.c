Describe the output of the code snippet;
int main(){
  int a, b, c;
  printf("Enter in decimal format:");
  scanf("%d", &a);
  printf("Enter in octal format: ");
  scanf("%d", &b);
  printf("Enter in hexadecimal format: ");
  scanf("%d", &c);
  printf("a = %d, b = %d, c = %d", a, b, c);
  printf("Enter in decimal format:");
  scanf("%i", &b);
  printf("Enter in octal format: ");
  scanf("%i", &b);
  printf("Enter in hexadecimal format: ");
  scanf("%i", &c);
  printf("a = %i, b = %i, c = %i\n", a, b, c);
return 0;}

/*
Using %d:

Enter in decimal format: 10
Enter in octal format: 12
Enter in hexadecimal format: 10
a = 10, b = 12, c = 10


Using %i:

Enter in decimal format: 15
Enter in octal format: 012
Enter in hexadecimal format: 0xA
a = 10, b = 10, c = 10


Difference:

%d → reads decimal only

%i → auto-detects base (decimal, octal with 0 prefix, hex with 0x prefix)

  */
