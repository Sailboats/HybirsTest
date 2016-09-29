# HybrisTest
场景：

某商城有3种商品分别为A, B, C。商城现在有3个仓库分别为w1，w2，w3。其中，w1仓库有A商品 1个，B商品2 个，C商品2个；w2仓库 有 A商品2个，B商品1 个, C商品2 个；w3仓库有 A 商品1个，B商品 3个 ，C商品1个 。其中，每件商品在仓库中价格均为不同。

顾客下单地址距离依次顺序为w3=w2>w1
仓库优先级排序是w1<w2<w3

要求：

请写Java程序，按照仓库商品数量、仓库距离、仓库优先级，实现1，2两个算法。
若顾客下单商品A 2个 默认策略拆单结果哪几个发货单? 
若顾客下单商品B 4个 默认策略拆单结果哪几个发货单?
用Junit 写测试用例；
代码提交到 自己的github 账号；

注：输出内容例子 
发货单 号	商品名称	数量	出货仓库
1	a	1	W1
2	a	2	W2

解答思路：先按照商品数量降序、仓库距离升序、仓库优先级降序排序的顺序来将仓库排序，再逐个寻源

![](https://github.com/Sailboats/HybirsTest/blob/master/testcase1.png)

![](https://github.com/Sailboats/HybirsTest/blob/master/testcase2.png)



