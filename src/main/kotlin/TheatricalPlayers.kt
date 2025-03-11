data class Play(val name: String, val type: String)

data class Performance(val playID: String, val audience: Int)

data class Invoice(val customer: String, val performances: List<Performance>)

fun statement(invoice: Invoice, plays: Map<String, Play>): String {
    var totalAmount = 0
    var volumeCredits = 0
    var result = "Statement for ${invoice.customer}\n"

    for (perf in invoice.performances) {
        val play = plays[perf.playID] ?: throw IllegalArgumentException("Unknown play ID")
        var thisAmount = 0

        when (play.type) {
            "tragedy" -> {
                thisAmount = 40000
                if (perf.audience > 30) {
                    thisAmount += 1000 * (perf.audience - 30)
                }
            }
            "comedy" -> {
                thisAmount = 30000
                if (perf.audience > 20) {
                    thisAmount += 10000 + 500 * (perf.audience - 20)
                }
                thisAmount += 300 * perf.audience
            }
            else -> throw IllegalArgumentException("Unknown play type: ${play.type}")
        }

        volumeCredits += maxOf(perf.audience - 30, 0)

        if (play.type == "comedy") volumeCredits += perf.audience / 5

        result += "  ${play.name}: $${thisAmount / 100}.${thisAmount % 100} (${perf.audience} seats)\n"
        totalAmount += thisAmount
    }

    result += "Amount owed is $${totalAmount / 100}.${totalAmount % 100}\n"
    result += "You earned $volumeCredits credits\n"

    return result.trim()
}