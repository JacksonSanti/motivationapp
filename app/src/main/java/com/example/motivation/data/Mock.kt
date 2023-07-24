package com.example.motivation.data

import com.example.motivation.infra.MotivationConstants
import kotlin.random.Random

data class Phrase(val description: String, val categoryId: Int)

class Mock {

    private val sunny = MotivationConstants.FILTER.SUNNY
    private val happy = MotivationConstants.FILTER.HAPPY
    private val all = MotivationConstants.FILTER.ALL

    private val mListPhrase = listOf<Phrase>(
        Phrase("Não sabendo que era impossível, foi lá e fez.", sunny),//happy
        Phrase("Você não é derrotado quando perde, você é derrotado quando desiste!", sunny),//happy
        Phrase("Quando está mais escuro, vemos mais estrelas!", sunny),//happy
        Phrase("Insanidade é fazer sempre a mesma coisa e esperar um resultado diferente.", sunny),//happy
        Phrase("Não pare quando estiver cansado, pare quando tiver terminado.", sunny),//happy
        Phrase("O que você pode fazer agora que tem o maior impacto sobre o seu sucesso?", sunny),//happy
        Phrase("A melhor maneira de prever o futuro é inventá-lo.", happy),
        Phrase("Você perde todas as chances que você não aproveita.", happy),
        Phrase("Fracasso é o condimento que dá sabor ao sucesso.", happy),
        Phrase(" Enquanto não estivermos comprometidos, haverá hesitação!", happy),
        Phrase("Se você não sabe onde quer ir, qualquer caminho serve.", happy),
        Phrase("Se você acredita, faz toda a diferença.", happy),
        Phrase("Riscos devem ser corridos, porque o maior perigo é não arriscar nada!", happy)
    )

    fun getPhrase(value: Int): String {

        val filtered = mListPhrase.filter { it.categoryId == value || value == all}
        return filtered[Random.nextInt(filtered.size)].description

    }

}