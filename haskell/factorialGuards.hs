fact n
     | n==0 = 1
     | n==1 = 1
     | n>1 = n*fact(n-1)

main :: IO ()
main = do
     print(fact(4))