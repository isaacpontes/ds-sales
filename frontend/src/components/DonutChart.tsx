import axios from 'axios';
import { useEffect, useState } from 'react';
import Chart from 'react-apexcharts';
import { SalesSum } from 'types/sale';
import { BASE_URL } from 'utils/requests';

type ChartData = {
    labels: string[];
    series: number[];
}

export default function DonutChart() {
    const [chartData, setChartData] = useState<ChartData>({ labels: [], series: [] });

    useEffect(() => {
        axios.get(`${BASE_URL}/sales/amount-by-seller`)
            .then((response) => {
                const data = response.data as SalesSum[];
                const allLabels = data.map(item => item.sellerName);
                const allSeries = data.map(item => item.sum);

                setChartData({ labels: allLabels, series: allSeries });
            });
    }, []);

    const options = {
        legend: {
            show: true
        }
    }

    return (
        <Chart
            options={{ ...options, labels: chartData.labels }}
            series={chartData.series}
            type="donut"
            height="240"
        />
    )
}