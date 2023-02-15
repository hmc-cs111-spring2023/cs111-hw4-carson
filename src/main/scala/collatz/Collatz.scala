@main def collatz(n: Int) = {if (n%2 == 0) n/2 else (3*n + 1)}

def collatzCount(n: Int) = {
    if (n == 1) 0 else (1 + collatzCount(collatz(n)))
}
