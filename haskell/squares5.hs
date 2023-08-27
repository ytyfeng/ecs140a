squares = [n*n | n <- [0..5]]

main :: IO ()
main = do
     print(squares)