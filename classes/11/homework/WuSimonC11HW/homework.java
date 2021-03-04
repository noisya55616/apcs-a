/* 
    First Section
*/

// Question 1

int mist(int n) {
    if ( n == 1){
        return 3;
    } else {
        return 3 * mist(n-1);
    }
}

// mist(5) would return 243

// Question 2

void misty(int n) {
    if (n > 4) {
        misty(n % 4);
    }
    System.out.print(n / 4 + " ");
}

// misty(38) would return the sequence 0 9

// Question 3

int mistier(int n) {
    if (n == 0){
        return 1;
    } else {
        return 4 * mistier(n - 1) + 2;
    }
}

// mistier(3) would return 114

// Question 4

int mistiest(int n){
    if (n == 6){
        return 6;
    } else {
        return 2 * mistiest(n + 1);
    }
}

// mistiest(2) would return 96

// Question 5

int whoKnows(int n){
    if (n <= 1){
        return n;
    } else {
        return n + whoKnows(n - 1);
    }
}

// whoKnows(5) would return 15

// Question 6

int weird(int p, int q){
    if (p == 1) {
        return p + 1;
    }else if (q == 0){
        return weird(p - 1, q);
    } else {
        return weird(p - 1, weird(p, q-1));
    }
}

// weird(2, 2) would return 2

// Question 7

int weirder(int r, int s){
    if (r == 0 || r == s) {
        return 1;
    } else {
        return weirder(r - 1, s) + weirder(r - 1, s - 1);
    }
}

// weirder(3, 2) would return 4

// Question 8

void weirdest(int x){
    if (x > 1) {
        weirdest(x / 2);
    } else {
        System.out.print(x + " ");
    }
}

// weirdest(40) would return 1

/* 
    Second Section
*/

// Question 1

public static String perplexing(String s){
    if (s.length() == 1) { return s;}
    return perplexing(s.substring(1)) + s.charAt(0);
}

// perplexing("Hello") would return "olleH"


// Question 2

public static String morePerplexing(String s){
    if (s.length() == 1){
        return s;
    }
    return morePerplexing(s.substring(1)) + s;
}

// morePerplexing("Hello") would return "ololloelloHello"

// Question 3

public static int unknown(int n, int r){
    if (n == 0 || r <= 0 || r >= n) {
        return 1;
    }
    return unknown(n - 1, r - 1) + unknown(n - 1, r);
}

// unknown(4, 2) would return 6

// Question 4

// 11 calls to unknown were made.

// Question 5

public static int sumUp(int l, int h) {
    if (l == h) return l;
    return l + sumUp(l + 1, h);
}