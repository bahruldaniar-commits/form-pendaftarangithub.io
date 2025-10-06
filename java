// Isi dropdown tahun lulus otomatis
const tahunSelect = document.getElementById("tahunLulus");
const tahunSekarang = new Date().getFullYear();

for (let i = tahunSekarang; i >= 2000; i--) {
  const option = document.createElement("option");
  option.value = i;
  option.textContent = i;
  tahunSelect.appendChild(option);
}

// Fungsi kirim data
function kirimData() {
  alert("✅ Data pendaftaran berhasil dikirim!\nTerima kasih telah mendaftar di Universitas 17 Agustus.");
  return false; // Supaya form tidak reload halaman
}