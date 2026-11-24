annualProfit = (30000 - 5000)

fixedSales = (6.0 / 100 * 5000) + (8.0 / 100 * 5000)

annualProfit -= fixedSales

sales = (10.0 / 100 * 10000)

salesCount = 2

while annualProfit > 0:
    annualProfit -= sales
    salesCount += 1

print("We need to make", salesCount, "sales")
