member n (m:x)
       | m<n = member n x
       | m==n = True
       | otherwise = False

main :: IO ()
main = do
     print(member 2 [1..4])
     print(member 2 [1,3..])