int main() {
    int a = 0;
    {
        int c = a;
    }
    int b = a + c;
}