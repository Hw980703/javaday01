package com.kh.day12.music.run;

import java.util.List;
import java.util.Scanner;

import com.kh.day12.music.controller.MusicController;
import com.kh.day12.music.model.vo.Music;
import com.kh.day12.music.view.MusicView;

public class Run {
	public static void main(String[] args) {

		MusicView view = new MusicView();
		MusicController mController = new MusicController();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		Music music = null;
		int index = 0;

		do {

			choice = view.musicMenu();

			switch (choice) {
			case 1:
				music = view.inputMusicInfo();
				mController.addAtLast(music);
				view.displaySuccess();
				break;
			case 2:
				music = view.inputMusicInfo();
				mController.addAtZero(music);
				view.displaySuccess();

				break;
			case 3:
				List<Music> allList = mController.printMusicList();
				view.showAllMusicList(allList);
				view.displaySuccess();
				break;
			case 4:
				String title = view.inputMusicName();
				List<Music> searchList = mController.searchMusicsByName(title);
				view.showAllMusicList(searchList);
				break;
			case 5:
				String titleName = view.inputMusicName();
				List<Music> searchName = mController.searchMusicsByName(titleName);
				mController.setTitle(searchName);
				break;

			case 6:

				// 수정할 곡 입력 받기
				String titleMdoi = view.inputMusicName();

				// 존재 여부 확인
				index = mController.searchOneByTitle(titleMdoi);
				if (index == -1) {
					System.out.println("존재하지 않슴");
					break;
				}

				// 이후 수정하기

				view.modifyMusicInfo();

				mController.updateMusic(index, music);
				break;
			case 7:

				view.printMessage("============== 곡명 오름차순 정렬 ==============");
				mController.sortByTitleASC();
				view.displaySuccess();

				break;
			case 8:

				view.printMessage("============== 곡명 내림차순 정렬 ==============");
				mController.sortByTitleDESC();
				view.displaySuccess();
				break;
			case 9:

				view.printMessage("============== 가수명 오름차순 정렬 ==============");
				mController.sortBySingerASC();
				view.displaySuccess();

				break;
			case 10:
				view.printMessage("============== 가수명 내림차순 정렬 ==============");
				mController.sortBySingerDESC();
				view.displaySuccess();
				break;
			case 0:
				view.printMessage("프로그램 종료 할게!");
				break;
			default:
				view.printMessage("잘못 입력 했어!");
				System.out.println();
				break;
			}

		} while (choice != 0);

	}
}
