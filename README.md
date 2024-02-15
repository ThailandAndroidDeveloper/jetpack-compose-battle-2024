![header.jpg](images%2Fheader.jpg)

# Jetpack Compose Battle - Final Round
[English at below](#english)

---

# Thai

Jetpack Compose Battle เป็นงานแข่งขันที่จะให้นักพัฒนาแอนดรอยด์ในประเทศไทยแข่งกันสร้าง UI ด้วย Jetpack Compose ที่เป็น UI Framework ตัวใหม่ล่าสุดทางทีมแอนดรอยด์

## รายละเอียดสำหรับรอบชิงชนะเลิศ
* TBD

## ของรางวัล
* อันดับที่ 1 Android Mini Collectible @Work Series - Tech Support / IT / Engineer

![รางวัลอันดับที่ 1](images%2Fprize_first.png)

* อันดับที่ 2 Android Mini Collectible @Work Series - Developer / Coder / Cyber Security

![รางวัลอันดับที่ 2](images%2Fprize_second.png)

* อันดับที่ 3 หนังสือ The Team That Built the Android Operating System ของ Chet Haase

![รางวัลอันดับที่ 3](images%2Fprize_third.png)

* อันดับที่ 4 หุ่นยนต์ไขลาน Android Wind-up

![รางวัลอันดับที่ 4](images%2Fprize_fourth.png)

นอกจากนี้ผู้เข้าแข่งขันในรอบสุดท้ายทุกท่านจะได้รับของสมนาคุณจากบริษัท MuvMi อีกด้วย

## กติกาในรอบชิงชนะเลิศ
1. ผู้เข้าแข่งขันจะต้องสร้าง UI ด้วย Jetpack Compose ที่ Fork จาก Repository นี้เท่านั้น
2. TBD
3. TBD
4. สามารถสร้าง Composable Function เพิ่มในไฟล์ดังกล่าวได้ตามใจชอบ ขอแค่ห้ามแก้ไขข้อมูลใน `@Preview` ที่อยู่ในไฟล์ดังกล่าวก็พอ
5. ห้ามใช้รูปภาพจากภายนอก ให้ใช้รูปที่เตรียมไว้ในโปรเจคนี้เท่านั้น โดยจะอยู่ที่ `<project>/common/src/main/res`
6. ชื่อไฟล์รูปภาพทั้งหมดให้ดูชื่อจากใน Figma และเรียกใช้งานผ่าน Android Resource ได้เลย
7. ค่าต่าง ๆ เช่น ขนาด ฟอนต์ ความหนาของตัวอักษรไม่ต้องสร้างขึ้นมาเอง ให้ดูจากใน Figma และเรียกใช้งานผ่าน `MaterialTheme` ได้เลย ยกตัวอย่างเช่น `MaterialTheme.typography.headlineMedium.fontSize` เป็นต้น
8. ค่าสีที่ใช้ใน UI ไม่ต้องสร้างขึ้นมาเอง ให้ดูจากใน Figma และเรียกใช้งานผ่าน `MaterialTheme` ได้เลย เช่น `MaterialTheme.colors.primary` เป็นต้น
9. คะแนนจะถูกคำนวณจากการรัน Snapshot Testing ด้วย Paparazzi โดยผู้เข้าแข่งขันสามารถทดสอบได้ด้วยการใช้คำสั่ง `./gradlew :screenshot-test:verifyPaparazziDebug` เผื่อดูผลลัพธ์ได้ก่อนส่งโจทย์
    * โดยผลลัพธ์ที่ได้จะอยู่ใน `<project>/screenshot-test/diff/` ที่จะบอกผลต่างของภาพที่ได้จากโค้ดเทียบกับภาพที่ถูกต้อง
    * ค่าที่ได้จากผลของ Snapshot Testing จะมีค่าเป็น % เมื่อเทียบกับภาพต้นฉบับ
    * ถ้าที่ได้มีค่าเท่ากับ 0 แปลว่าผลลัพธ์ถูกต้องแบบ 100%
10. ภาพต้นฉบับที่ใช้เปรียบเทียบใน Snapshot Testing จะอยู่ใน `/screenshot-test/src/test/snapshots/images` (ห้ามแก้ไข)

## เวอร์ชันของโปรแกรมที่แนะนำ
* Android Studio Hedgehog 2023.1.1 Patch 1 (Latest Stable)
* Embedded JDK (JBR 17.0.7)

---

# English
Jetpack Compose Battle is a competition challenging Android developers in Thailand to create UIs using Jetpack Compose, the latest UI framework from the Android team.

## Final Round Details
* TBD

## Prizes
* 1st Place: Android Mini Collectible @Work Series - Tech Support / IT / Engineer

![รางวัลอันดับที่ 1](images%2Fprize_first.png)

* 2nd Place: Android Mini Collectible @Work Series - Developer / Coder / Cyber Security

![รางวัลอันดับที่ 2](images%2Fprize_second.png)

* 3rd Place: "The Team That Built the Android Operating System" book by Chet Haase

![รางวัลอันดับที่ 3](images%2Fprize_third.png)

* 4th Place: Android Wind-up Robot

![รางวัลอันดับที่ 4](images%2Fprize_fourth.png)

Additionally, all finalists will receive special gifts from MuvMi.

## Final Round Guidelines
1. Participants must create UIs with Jetpack Compose by forking from this repository only.
2. TBD
3. TBD
4. Composable functions can be added as desired, but refrain from modifying data in `@Preview` in those files.
5. Do not use external images; use those prepared in the project located at `<project>/common/src/main/res`.
6. All image file names should match those in Figma and be accessed through Android Resource.
7. Various values like size, font, and text thickness can be derived from Figma and accessed through `MaterialTheme`. For example: `MaterialTheme.typography.headlineMedium.fontSize`
8. UI color values can be obtained from Figma and accessed through `MaterialTheme`. For example: `MaterialTheme.colors.primary`
9. Scores will be calculated through Snapshot Testing with Paparazzi. Competitors can test using `./gradlew :screenshot-test:verifyPaparazziDebug` before submission.
    * Results will be in `<project>/screenshot-test/diff/`, indicating differences from the correct images.
    * Snapshot Testing results are presented as percentages comparing with the original images.
    * A result of 0 means 100% accuracy.
10. Original images for Snapshot Testing are in `/screenshot-test/src/test/snapshots/images` (do not modify).

## Recommended Program Version
* Android Studio Hedgehog 2023.1.1 Patch 1 (Latest Stable)
* Embedded JDK (JBR 17.0.7)

## Sponsors
* [MuvMi](https://muvmi.co/)
* [LINE MAN Wongnai](https://lmwn.com/)
