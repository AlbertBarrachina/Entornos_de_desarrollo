import java.util.Scanner;

public class tic_tac_toe {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[][] tb = new int[3][3];
		int i = 0;
		int modo = 0;
		int fila = 0;
		int columna = 0;
		int j1 = 0;
		int j2 = 0;
		int m1 = 0;
		int m2 = 0;

		for (int rep = 0; rep == 0;) {
			System.out.println("¿Que modo de juego queires jugar?\nUn solo jugador(1).\nDos jugadores(2).");
			modo = teclado.nextInt();
			for (i = 0; i < 3; i++) {
				tb[i][0] = 0;
				tb[i][1] = 0;
				tb[i][2] = 0;
			}
			if (modo == 1) {// jugador contra maquina
				for (m1 = 0; m1 < 9;) {// contador de jugadas, evita que se entre en un bucle infinito donde no se
										// puedencolocar mar numeros
					for (i = 0; i < 3; i++) {// muestra el tablero
						System.out.println(tb[i][0] + " | " + tb[i][1] + " | " + tb[i][2]);
						if (i < 2)
							System.out.println("--+---+---");
					}
					System.out.println("Jugador 1:");
					System.out.println("Dime la fila:");
					fila = teclado.nextInt();
					if (fila < 4 && fila > 0) {
						System.out.println("Dime la columna:");
						columna = teclado.nextInt();
						if (columna < 4 && columna > 0) {
							if (tb[fila - 1][columna - 1] == 0) {
								tb[fila - 1][columna - 1] = 1;
								m1++;
								// comprobacion de victoria del jugador 1
								if (tb[fila - 1][0] == 1 && tb[fila - 1][1] == 1 && tb[fila - 1][2] == 1) {
									System.out.println("Ha ganado el jugador 1");
									m1 = 9;
								} else if (tb[0][columna - 1] == 1 && tb[1][columna - 1] == 1
										&& tb[2][columna - 1] == 1) {
									System.out.println("Ha ganado el jugador 1");
									m1 = 9;
								} else if (tb[0][0] == 1 && tb[1][1] == 1 && tb[2][2] == 1) {
									System.out.println("Ha ganado el jugador 1");
									m1 = 9;
								} else if (tb[2][0] == 1 && tb[1][1] == 1 && tb[0][2] == 1) {
									System.out.println("Ha ganado el jugador 1");
									m1 = 9;
								} else if (m1 == 9) {//nadie gana :3
									System.out.println("Empate");
								} else {
									for (i = 0; i == 0;) {// moviments predeterminats
										if (tb[2][2] == 0) {
											fila = 3;
											columna = 3;
										} else if (tb[0][0] == 0 && tb[2][2] == 1) {
											fila = 1;
											columna = 1;
										} // cheks oritzontals
										else if (tb[0][2] == 2 && tb[0][1] == 2 && tb[0][0] == 0) {
											fila = 1;
											columna = 1;
										} else if (tb[0][2] == 2 && tb[0][1] == 0 && tb[0][0] == 2) {
											fila = 1;
											columna = 2;
										} else if (tb[0][2] == 0 && tb[0][1] == 2 && tb[0][0] == 2) {
											fila = 1;
											columna = 3;
										} else if (tb[1][2] == 2 && tb[1][1] == 2 && tb[1][0] == 0) {
											fila = 2;
											columna = 1;
										} else if (tb[1][2] == 2 && tb[1][1] == 0 && tb[1][0] == 2) {
											fila = 2;
											columna = 2;
										} else if (tb[1][2] == 0 && tb[1][1] == 2 && tb[1][0] == 2) {
											fila = 2;
											columna = 3;
										} else if (tb[2][2] == 2 && tb[2][1] == 2 && tb[2][0] == 0) {
											fila = 3;
											columna = 1;
										} else if (tb[2][2] == 2 && tb[2][1] == 0 && tb[2][0] == 2) {
											fila = 3;
											columna = 2;
										} else if (tb[2][2] == 0 && tb[2][1] == 2 && tb[2][0] == 2) {
											fila = 3;
											columna = 3;
										} // cheks verticals
										else if (tb[2][0] == 2 && tb[1][0] == 2 && tb[0][0] == 0) {
											fila = 1;
											columna = 1;
										} else if (tb[2][0] == 2 && tb[1][0] == 0 && tb[0][0] == 2) {
											fila = 2;
											columna = 1;
										} else if (tb[2][0] == 0 && tb[1][0] == 2 && tb[0][0] == 2) {
											fila = 3;
											columna = 1;
										} else if (tb[2][1] == 2 && tb[1][1] == 2 && tb[0][1] == 0) {
											fila = 1;
											columna = 2;
										} else if (tb[2][1] == 2 && tb[1][1] == 0 && tb[0][1] == 2) {
											fila = 2;
											columna = 2;
										} else if (tb[2][1] == 0 && tb[1][1] == 2 && tb[0][1] == 2) {
											fila = 3;
											columna = 2;
										} else if (tb[2][2] == 2 && tb[1][2] == 2 && tb[0][2] == 0) {
											fila = 3;
											columna = 1;
										} else if (tb[2][2] == 2 && tb[1][2] == 0 && tb[0][2] == 2) {
											fila = 2;
											columna = 3;
										} else if (tb[2][2] == 0 && tb[1][2] == 2 && tb[0][2] == 2) {
											fila = 3;
											columna = 3;
										} // comencen els cheks de diagonals
										else if (tb[0][0] == 2 && tb[1][1] == 2 && tb[2][2] == 0) {
											fila = 3;
											columna = 3;
										} else if (tb[0][0] == 2 && tb[1][1] == 0 && tb[2][2] == 2) {
											fila = 2;
											columna = 2;
										} else if (tb[0][0] == 0 && tb[1][1] == 2 && tb[2][2] == 2) {
											fila = 1;
											columna = 1;
										} else if (tb[0][2] == 2 && tb[1][1] == 2 && tb[2][0] == 0) {
											fila = 3;
											columna = 1;
										} else if (tb[0][2] == 2 && tb[1][1] == 0 && tb[2][0] == 2) {
											fila = 2;
											columna = 2;
										} else if (tb[0][2] == 0 && tb[1][1] == 2 && tb[2][0] == 2) {
											fila = 1;
											columna = 3;
										} // comencen els cheks per putejar a l'altre(horitzontals)
										else if (tb[fila - 1][0] == 1 && tb[fila - 1][1] == 1 && tb[fila - 1][2] == 0) {
											columna = 3;
										} else if (tb[fila - 1][0] == 1 && tb[fila - 1][2] == 1
												&& tb[fila - 1][1] == 0) {
											columna = 2;
										} else if (tb[fila - 1][1] == 1 && tb[fila - 1][2] == 1
												&& tb[fila - 1][0] == 0) {
											columna = 1;
										} // comencen els checks verticals
										else if (tb[0][columna - 1] == 1 && tb[1][columna - 1] == 1
												&& tb[2][columna - 1] == 0) {
											fila = 3;
										} else if (tb[0][columna - 1] == 1 && tb[2][columna - 1] == 1
												&& tb[1][columna - 1] == 0) {
											fila = 2;
										} else if (tb[1][columna - 1] == 1 && tb[2][columna - 1] == 1
												&& tb[0][columna - 1] == 0) {
											fila = 1;
										} // comencen els checks diagonals
										else if (tb[0][0] == 1 && tb[1][1] == 1 && tb[2][2] == 0) {
											fila = 3;
											columna = 3;
										} else if (tb[0][0] == 1 && tb[1][1] == 0 && tb[2][2] == 1) {
											fila = 2;
											columna = 2;
										} else if (tb[0][0] == 0 && tb[1][1] == 1 && tb[2][2] == 1) {
											fila = 1;
											columna = 1;
										} else if (tb[0][2] == 1 && tb[1][1] == 1 && tb[2][0] == 0) {
											fila = 3;
											columna = 1;
										} else if (tb[0][2] == 1 && tb[1][1] == 0 && tb[2][0] == 1) {
											fila = 2;
											columna = 2;
										} else if (tb[0][2] == 0 && tb[1][1] == 1 && tb[2][0] == 1) {
											fila = 1;
											columna = 3;
										} else {// Random en cas de no haver ninguna prediccio per a l'escenari
											fila = (int) (Math.random() * 3 + 1);
											columna = (int) (Math.random() * 3 + 1);
										}
										if (tb[fila - 1][columna - 1] == 0) {
											tb[fila - 1][columna - 1] = 2;
											i++;
											m1++;
											// comprobacion de victoria de la IA
											if (tb[fila - 1][0] == 2 && tb[fila - 1][1] == 2 && tb[fila - 1][2] == 2) {
												System.out.println("Ha ganado el jugador 2");
												m1 = 9;
											} else if (tb[0][columna - 1] == 2 && tb[1][columna - 1] == 2
													&& tb[2][columna - 1] == 2) {
												System.out.println("Ha ganado el jugador 2");
												m1 = 9;
											} else if (tb[0][0] == 2 && tb[1][1] == 2 && tb[2][2] == 2) {
												System.out.println("Ha ganado el jugador 2");
												m1 = 9;
											} else if (tb[2][0] == 2 && tb[1][1] == 2 && tb[0][2] == 2) {
												System.out.println("Ha ganado el jugador 2");
												m1 = 9;
											}

										}
									}
								}
							} else// respuesta a casilla ocupada
								System.out.println("Esta casilla ya esta ocupada.");
						} else// respuesta a fila inexistente
							System.out.println("pon un numero posible");
					} else// respuesta a columna inexistente
						System.out.println("pon un numero posible");
				}
			} else if (modo == 2) {// modo de juego dos jugadores
				for (m2 = 0; m2 < 9;) {
					for (i = 0; i < 3; i++) {//muestra el tablero
						System.out.println(tb[i][0] + " | " + tb[i][1] + " | " + tb[i][2]);
						if (i < 2)
							System.out.println("--+---+---");
					}
					for (j1 = 0; j1 == 0;) {
						System.out.println("Jugador 1:");
						System.out.println("Dime la fila:");
						fila = teclado.nextInt();
						if (fila < 4 && fila > 0) {
							System.out.println("Dime la columna:");
							columna = teclado.nextInt();
							if (columna < 4 && columna > 0) {
								if (tb[fila - 1][columna - 1] == 0) {
									tb[fila - 1][columna - 1] = 1;
									m2++;
									j1++;
									// comprobacion de victoria del jugador 1
									if (tb[fila - 1][0] == 1 && tb[fila - 1][1] == 1 && tb[fila - 1][2] == 1) {
										System.out.println("Ha ganado el jugador 1");
										m2 = 9;
									} else if (tb[0][columna - 1] == 1 && tb[1][columna - 1] == 1
											&& tb[2][columna - 1] == 1) {
										System.out.println("Ha ganado el jugador 1");
										m2 = 9;
									} else if (tb[0][0] == 1 && tb[1][1] == 1 && tb[2][2] == 1) {
										System.out.println("Ha ganado el jugador 1");
										m2 = 9;
									} else if (tb[2][0] == 1 && tb[1][1] == 1 && tb[0][2] == 1) {
										System.out.println("Ha ganado el jugador 1");
										m2 = 9;
									} else if (m2 == 9) {//nadie gana
										System.out.println("Empate");
									}
								} else// respuesta a casilla ocupada
									System.out.println("Esta casilla ya esta ocupada.");
							} else// respuesta a fila inexistente
								System.out.println("pon un numero posible");
						} else// respuesta a columna inexistente
							System.out.println("pon un numero posible");
					}
					for (i = 0; i < 3 && m2 < 9; i++) {//muestra el tablero otra vez
						System.out.println(tb[i][0] + " | " + tb[i][1] + " | " + tb[i][2]);
						if (i < 2)
							System.out.println("--+---+---");
					}
					for (j2 = 0; j2 == 0 && m2 < 9;) {//turno jugador 2
						System.out.println("Jugador 2:");
						System.out.println("Dime la fila:");
						fila = teclado.nextInt();
						if (fila < 4 && fila > 0) {
							System.out.println("Dime la columna:");
							columna = teclado.nextInt();
							if (columna < 4 && columna > 0) {
								if (tb[fila - 1][columna - 1] == 0) {
									tb[fila - 1][columna - 1] = 2;
									m2++;
									j2++;
									// comprobacion de victoria del jugador 2
									if (tb[fila - 1][0] == 2 && tb[fila - 1][1] == 2 && tb[fila - 1][2] == 2) {
										System.out.println("Ha ganado el jugador 2");
										m2 = 9;
									} else if (tb[0][columna - 1] == 2 && tb[1][columna - 1] == 2
											&& tb[2][columna - 1] == 2) {
										System.out.println("Ha ganado el jugador 2");
										m2 = 9;
									} else if (tb[0][0] == 2 && tb[1][1] == 2 && tb[2][2] == 2) {
										System.out.println("Ha ganado el jugador 2");
										m2 = 9;
									} else if (tb[2][0] == 2 && tb[1][1] == 2 && tb[0][2] == 2) {
										System.out.println("Ha ganado el jugador 2");
										m2 = 9;
									} else if (m2 == 9) {//nadie gana
										System.out.println("Empate");
									}
								} else// respuesta a casilla ocupada
									System.out.println("Esta casilla ya esta ocupada.");
							} else// respuesta a fila inexistente
								System.out.println("pon un numero posible");
						} else// respuesta a columna inexistente
							System.out.println("pon un numero posible");
					}
				}

			} else// else del menu de seleccion del modo de juego
				System.out.println("Pon un 1 o 2.");
			for (i = 0; i < 3; i++) {
				System.out.println(tb[i][0] + " | " + tb[i][1] + " | " + tb[i][2]);
				if (i < 2)
					System.out.println("--+---+---");
			}
			for (i = 0; i < 1;) {//opcion de volver a empezar
				System.out.println("\n\nVolver a empezar --> 0\nTerminar juego --> 1");
				rep = teclado.nextInt();
				if (rep == 0 || rep == 1) {
					i = 1;
				} else
					System.out.println("pon un numero correcto.");
			}
		}
		System.out.println("Fin del juego");
		teclado.close();
	}

}
