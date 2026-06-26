# Simple Tic-Tac-Toe Game with Java Swing, Login, and Statistics
## Student Information
- Name: Athifah Nailah Qatrunnada Khalid
- Student ID: 5026251125
- Class: A
## Project Description
This project is a simple Tic-Tac-Toe game built using Java Swing.
The application includes login, game statistics, and Top 5 scorer
feature.
## Features 
- Login using database
- Play Tic-Tac-Toe using Swing GUI
- Record wins, losses, draws, and score
- Display personal statistics
- Display Top 5 scorers using JTable
## Database
Database used: PostgreSQL 
- Use one table
<img width="500" height="125" alt="Screenshot 2026-06-26 201143" src="https://github.com/user-attachments/assets/fe998cf8-39e1-4eb9-935b-6019c298bdde" />

## How to Run
1. Create the database.
2. Import schema.sql.
3. Open the Java project.
4. Add JDBC driver.
5. Configure DatabaseManager.java.
6. Run Main.java.
## Class Explanation
- Main: to start the application. This opens the Login Frame when the program is run.
- DatabaseManager: making a connection to PostgreSQL.
Player: stores player information such as ID, username, wins, losses, draws, and score.
- PlayerService: handling all database operations like login, updating player stats, getting player information, and fetching the top 5 scorers.
- GameLogic: This handles the player's moves, the computer's moves, then checks for a winner or a tie and resets the board.
- LoginFrame: display a login window with username and password fields. Then show the main page if the login is successful
- MainMenuFrame: display the main menu to start the game, view statistics, top 5 scorers, or exit
- GameFrame: This class displays the Tic Tac Toe game board. 
- StatisticsFrame: displaying player statistics including wins, losses, draws, and scores.
- TopScorersFrame: This class displays the top 5 players with the highest scores using a JTable. It uses a database to fetch the data.
## Screenshots
- Login Window 
<img width="256" height="152" alt="Screenshot 2026-06-26 181012" src="https://github.com/user-attachments/assets/c9044048-cfbc-4851-841a-f4365877d7f3" />

- Login Failed
<img width="262" height="154" alt="Screenshot 2026-06-26 181100" src="https://github.com/user-attachments/assets/7419eec3-faad-4294-9471-d1e85eac996a" />

- Main Menu Window
<img width="219" height="192" alt="Screenshot 2026-06-26 181032" src="https://github.com/user-attachments/assets/75548ce5-a1cd-40c4-8b7c-b0169d8de12d" />

- Game Window
<img width="287" height="326" alt="Screenshot 2026-06-26 181149" src="https://github.com/user-attachments/assets/0c4a2015-82ee-48c5-a5ac-4f987069865f" />

- Top 5 Window
<img width="439" height="216" alt="Screenshot 2026-06-26 181315" src="https://github.com/user-attachments/assets/32b5f43c-8785-4434-bbd7-ee46e48d225e" />

- My Statistics Window
<img width="209" height="179" alt="Screenshot 2026-06-26 181355" src="https://github.com/user-attachments/assets/419ccf8b-3380-4e69-9918-f6e97af2852e" />

## Video Link
YouTube:
