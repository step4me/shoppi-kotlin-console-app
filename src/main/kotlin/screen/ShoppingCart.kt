package screen

import LINE_DIVIDER
import data.CartItems

class ShoppingCart {
    private val products = CartItems.products

    fun showCartItems() {
        if (products.isNotEmpty()) {
            println(
                products.keys.joinToString(
                    separator = ", \n",
                    prefix = """
                    $LINE_DIVIDER
                    장바구니에 담은 상품 목록 입니다.
                    
                """.trimIndent()
                ) { product ->
                    "카테고리: ${product.categoryLabel} / 상품명: ${product.name} / 수량: ${products[product]}"
                }
            )
        } else {
            println(
                """
                장바구니에 담긴 상품이 없습니다. 
                """.trimIndent()
            )
        }
    }
}
