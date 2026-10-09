# Muntlig redovisning

### Länk till video:

https://funet-my.sharepoint.com/:v:/g/personal/3kdyhapp26_starto_folkuniversitetet_nu/IQCWZ_lNuALgRI7Fzj4A7mTDAaOuUVUFb-UGSqLB1_q1vs0?e=zl1usy

### Kontoappen

Kontoappen är en konsolapplikation i Java för att skapa och hantera bankkonton. Användaren kan skapa vanliga konton och
sparkonton, lista konton samt sätta in och ta ut pengar.

### Köra

Programmet körs med Java i en IDE genom att starta `Main.java`.

## Teori

### 1. Inkapsling

Inkapsling innebär att man skyddar data i en klass från att kunna ändras direkt från andra klasser. I `Account` är
fälten `owner` och `balance` därför `private`. Det gör att exempelvis `Main` inte kan ändra dem direkt, utan måste
använda metoder som `getBalance()`, `deposit()` och `withdraw()`. Om `balance` hade varit `public` hade andra klasser
kunnat ändra saldot direkt och därmed exempelvis kringgå kontrollen som finns i `withdraw()`.

### 2. Factory

Konton skapas i `AccountRegister`, i metoden `createAccount()`. Detta för att vi vill samla metoder som hanterar ett
enskilt kontos data i `Account`, medan `AccountRegister` ansvarar för att skapa och hantera samlingen av konton. När
kontoobjektet skapas med `new Account(owner, startBalance)` pekar variabeln `account` på det nyskapade objektet, och
därefter sparas samma objekt i listan `accounts`.

### 3. Stegkedja — ett menyval

Jag tänkte beskriva vad som händer om man väljer menyval 3, ”Sätt in pengar”. Användaren skriver in ett namn som sparas
i variabeln `name`, och `name` skickas som argument till metoden `findAccount()` i `AccountRegister`. Om ett konto
hittas sparas en referens till det kontot i variabeln `found`, och användaren får skriva in ett belopp som sätts in
genom `found.deposit(amount)`. Därefter skrivs det nya saldot ut med `found.getBalance()`. Om inget konto hittas skrivs
i stället ett felmeddelande ut.

## AI-reflektion

Förutom att hjälpa mig att strukturera mina studier har AI hjälpt mig att förstå konceptet objekt och referenser till
objekt. Vi ritade upp bilder med pilar tills jag förstod skillnaden mellan själva objektet och en referens som ”pekar”
på objektet, och att objektet till exempel inte försvinner bara för att en av referenserna gör det. Ett konkret exempel
är att AI föreslog att jag skulle använda `instanceof` och lägga till ett extra menyval för sparkontot, men efter att
jag jämfört förslaget med kursmaterialet valde jag att inte använda det eftersom det gjorde lösningen mer komplicerad än
den behövde vara. Jag använder också AI som bollplank och för quiz, vilket fungerar väldigt bra för mig som
inlärningsmetod. Efter den hjälpen kan jag nu bygga egna klasser och objekt och förstår strukturen och vad programmet
faktiskt gör, även om jag ibland behöver slå upp exakt syntax.

### Muntligt — mina 2–3 delar

1. `Account.java` — `withdraw()`
    - Förklara parametern `amount`, `if`/`else` och hur metoden hindrar saldot från att bli negativt.
    - Förklara varför metoden hör hemma i `Account`.

2. `AccountRegister.java` — `createSavingsAccount()`
    - Förklara hur ett nytt `SavingsAccount`-objekt skapas.
    - Förklara hur variabeln `created` får en referens till objektet, hur samma referens läggs i listan `accounts` och
      vad som returneras.
    - Förklara varför metoden ligger i `AccountRegister` och inte i `Main`.

3. `SavingsAccount.java` — `printInfo()`
    - Förklara att `SavingsAccount` ärver från `Account`.
    - Förklara `@Override` och vad `super.printInfo()` gör.
    - Förklara varför ett `SavingsAccount` kan ligga i en `List<Account>` men ändå använda sin egen version av
      `printInfo()`.